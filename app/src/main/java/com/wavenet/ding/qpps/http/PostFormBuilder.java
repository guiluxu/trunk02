package com.wavenet.ding.qpps.http;

import android.util.Log;

import com.zhy.http.okhttp.request.RequestCall;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/19.
 */

public class PostFormBuilder extends OkHttpRequestBuilder<PostFormBuilder> implements HasParamsable {

    private List<FileInput> files = new ArrayList<>();

    @Override
    public RequestCall build() {
        return new PostFormRequest(url, tag, params, headers, files, id).build();
    }

    public PostFormBuilder files(String key, ArrayList<File> files) {
        int j = 0;
        String str = key;
        for (int i = 0; i < files.size(); i++) {
            j++;
            if (j != 1) {
                str = key + j;
            }
            Log.i("tag", "次数：" + str);
            this.files.add(new PostFormBuilder.FileInput(str, files.get(i).getAbsolutePath(), files.get(i)));
        }
//        for (String filename : files.keySet()) {
//            i++;
//            if (i != 1) {
//                str = key + i;
//            }
//            Log.i("tag", "次数：" + str);
//            this.files.add(new PostFormBuilder.FileInput(str, filename, files.get(filename)));
//        }
        return this;
    }

    public PostFormBuilder addFile(String name, String filename, File file) {
        files.add(new PostFormBuilder.FileInput(name,filename,file));
        return this;
    }

    public static class FileInput {
        public String key;
        public String filename;
        public File file;

        public FileInput(String name, String filename,File file) {
            this.key = name;
            this.filename = filename;
            this.file = file;
        }

//        @Override
//        public String toString() {
//            return "FileInput{" +
//                    "key='" + key + '\'' +
//                    ", filename='" + filename + '\'' +
//                    ", file=" + file +
//                    '}';
//        }
    }


    @Override
    public PostFormBuilder params(Map<String, String> params) {
        this.params = params;
        return this;
    }

    @Override
    public PostFormBuilder addParams(String key, String val) {
        if (this.params == null) {
            params = new LinkedHashMap<>();
        }
        params.put(key, val);
        return this;
    }
}
