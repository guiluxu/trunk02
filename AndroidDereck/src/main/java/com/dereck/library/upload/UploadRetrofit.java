package com.dereck.library.upload;


import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * <pre>
 *
 *      date    : 2018/06/14
 *      desc    : 为上传单独建一个retrofit
 *      version : 1.0
 * </pre>
 */
public class UploadRetrofit {

    private static UploadRetrofit instance;
    private static String baseUrl = "https://api.github.com/";
    private Retrofit mRetrofit;


    public UploadRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static UploadRetrofit getInstance() {

        if (instance == null) {
            synchronized (com.dereck.library.http.RetrofitClient.class) {
                if (instance == null) {
                    instance = new UploadRetrofit();
                }
            }

        }
        return instance;
    }

    /**
     * 上传一张图片
     *
     * @param uploadUrl 上传图片的服务器url
     * @param file  图片路径改为图片文件
     * @return Observable
     */
    public static Observable<ResponseBody> uploadImg(String uploadUrl, File file) {
        List<File> fileList = new ArrayList<>();
        fileList.add(file);
        return uploadImgsWithParams(uploadUrl, "files", null, fileList);

    }

    /**
     * 只上传图片
     *
     * @param uploadUrl 上传图片的服务器url
     * @param fileList 图片路径改为图片文件路径
     * @return Observable
     */
    public static Observable<ResponseBody> uploadImgs(String uploadUrl, Map<String, Object> map, List<File> fileList) {
        return uploadImgsWithParams(uploadUrl, "files", map, fileList);
    }

    /**
     * 图片和参数同时上传的请求
     *
     * @param uploadUrl 上传图片的服务器url
     * @param fileName  后台协定的接受图片的name（没特殊要求就可以随便写）
     * @param map       普通参数
     * @param filelist  图片路径改为图片文件集合
     * @return Observable
     */
    public static Observable<ResponseBody> uploadImgsWithParams(String uploadUrl, String fileName, Map<String, Object> map, List<File> filelist) {

        MultipartBody.Builder builder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM);

        if (null != map) {
            for (String key : map.keySet()) {
                builder.addFormDataPart(key, map.get(key) + "");
            }
        }
        for (int i = 0; i < filelist.size(); i++) {
//            File file = new File(filePaths.get(i));
            File file = filelist.get(i);
            RequestBody imageBody = null;
            if (filelist.get(i).getAbsolutePath().endsWith("mp4")){
                if (filelist.get(i).getAbsolutePath().contains("MyRecording")){
                    imageBody = RequestBody.create(MediaType.parse("audio/mpeg"), file);
                }else {
                    imageBody = RequestBody.create(MediaType.parse("video/mp4"), file);
                }
            }else if (filelist.get(i).getAbsolutePath().endsWith("text")){
                imageBody = RequestBody.create(MediaType.parse("text/plain"), file);
            }else {
                imageBody = RequestBody.create(MediaType.parse("image/jpeg"), file);
            }
            //fileName 后台接收图片流的参数名
            builder.addFormDataPart(fileName, file.getName(), imageBody);
        }

        List<MultipartBody.Part> parts = builder.build().parts();
        return UploadRetrofit
                .getInstance()
                .getRetrofit()
                .create(UploadFileApi.class)
                .uploadImgs(uploadUrl, parts);
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}
