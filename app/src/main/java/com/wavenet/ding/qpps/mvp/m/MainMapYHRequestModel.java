package com.wavenet.ding.qpps.mvp.m;


import android.util.Log;

import com.dereck.library.http.SingleRxHttp;
import com.dereck.library.interceptor.Transformer;
import com.dereck.library.observer.CommonObserver;
import com.dereck.library.utils.RxHttpUtils;
import com.wavenet.ding.qpps.api.ApiService;
import com.wavenet.ding.qpps.db.WavenetCallBack;
import com.wavenet.ding.qpps.utils.AppConfig;
import com.wavenet.ding.qpps.utils.AppTool;
import com.wavenet.ding.qpps.utils.LogUtils;
import com.wavenet.ding.qpps.utils.UrlUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.zhy.http.okhttp.OkHttpUtils.post;

public class MainMapYHRequestModel {

    public void requestFile(Map<String, Object> map, ArrayList<File> arrayList, CommonObserver<Object> callback) {
        RxHttpUtils.uploadImgsWithParams(AppConfig.BeasUrl+"2083/file/upload/SSYH", "file", map, arrayList)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.d("养护_requestFile：  " , AppConfig.BeasUrl+"2083/file/upload/SSYH");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("养护_requestFile：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Log.d("养护_requestFile：  " , arrayList.get(i).getAbsolutePath());
        }
    }

    public void requestUPXY(Map<String, Object> map, CommonObserver<Object> callback) {
        String urlstr = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_TRAJECTORY";
        RxHttpUtils
                .createApi(ApiService.class)
                .userXJCoordinate(urlstr, map)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.d("养护_requestUPXY：  " , urlstr);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("养护_requestUPXY：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }

    public void requestRelyid(Map<String, String> map, WavenetCallBack callback) {
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJRelyid(AppConfig.BeasUrl1+"/curingCode/addCuringCode", map)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        post()
                .url(AppConfig.BeasUrl1+"/curingCode/addCuringRecode")
                .params(map)
                .build()
                .execute(callback);
        Log.d("养护_requestRelyid：  " , AppConfig.BeasUrl1+"/curingCode/addCuringRecode");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("养护_requestRelyid：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }

    public void getPicUrl(Map<String, Object> map, CommonObserver<Object> callback) {
        RxHttpUtils
                .createApi(ApiService.class)
                .getPicUrl(AppConfig.BeasUrl+"2083/file/find/SSYH", map)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.d("养护_getPicUrl：  " , AppConfig.BeasUrl+"2083/file/find/SSYH");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("养护_getPicUrl：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void userFinishTask(String id, Map<String, String> map, WavenetCallBack callback) {
        map.put("sRecodeId",id);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userFinishTask(AppConfig.BeasUrl+"2056/api/CuringRecode/UpdateCuringRecode", map)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        post()
                .url(AppConfig.BeasUrl1+"/curingCode/updateCuringRecode")
                .params(map)
                .build()
                .execute(callback);
        Log.d("养护_userFinishTask：  " , AppConfig.BeasUrl1+"/curingCode/updateCuringRecode");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("养护_userFinishTask：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void userCancelTask(String id, Map<String, Object> map, CommonObserver<Object> callback) {
        map.put("S_RECODE_ID",id);
        RxHttpUtils
                .createApi(ApiService.class)
                .userFinishTask(AppConfig.BeasUrl+"2056/api/CuringRecode/UpdateCuringRecode", map)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.d("养护_userCancelTask：  " , AppConfig.BeasUrl+"2056/api/CuringRecode/UpdateCuringRecode");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("养护_userCancelTask：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }
    public void AdminGetObjectIds(String idstr, String filterkey, String filtervalue ,String townname,CommonObserver<Object> callback) {
        String filerStr="";
        if (AppTool.isNull(townname)){
            filerStr=  String.format(AppConfig.Filterurlstrstart2,filterkey,"%",filtervalue,"%");
        }else {
            filerStr=  String.format(AppConfig.Filterurlstrstart1,townname,filterkey,"%",filtervalue,"%");
        }
        String urlstr =String.format(AppConfig.Filterurlstr,AppConfig.GuanWangUrl,idstr, UrlUtils.toURLEncoded(filerStr),AppConfig.Filterurlstrend);
        RxHttpUtils
                .createApi(ApiService.class)
                .AdminGetObjectIds(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);

    }

    public void AdminGetObjectDetails(int url, String ids, String filterkey, CommonObserver<Object> callback) {
        String urlstr = AppConfig.GuanWangUrl + "/" + url + "/query?where=&text=&objectIds=" + ids + "&time=&geometry=&geometryType=esriGeometryEnvelope&inSR=&spatialRel=esriSpatialRelIntersects&relationParam=&outFields=" + filterkey + "&returnGeometry=true&maxAllowableOffset=&geometryPrecision=&outSR=&returnIdsOnly=false&returnCountOnly=false&orderByFields=&groupByFieldsForStatistics=&outStatistics=&returnZ=false&returnM=false&gdbVersion=&returnDistinctValues=false&returnTrueCurves=false&resultOffset=&resultRecordCount=&f=pjson";
        RxHttpUtils
                .createApi(ApiService.class)
                .AdminGetObjectDetails(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);

    }

    public void requestPeople(String filterStr, CommonObserver<Object> callback) {
        String urlstr = AppConfig.BeasUrl+"2081/services/QPSSYH_DATASERVICE/t_person_operation?" + filterStr;
        Map<String, Object> headerMaps = new HashMap<>();
        headerMaps.put("Accept", "application/json");
        SingleRxHttp.getInstance().addHeaders(headerMaps).createSApi(ApiService.class)
                .requestPeople(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.d("养护_requestPeople：  " , urlstr);
    }

    public void addSearchHis(String user, String str, CommonObserver<Object> callback) {
        String url = AppConfig.BeasUrl+"2056/api/AppSearchHis/AddAppSearch";
        Map<String, Object> params = new HashMap<>();
        params.put("AppType", "2");
        params.put("UserId", user);
        params.put("SearchValue", str);
        RxHttpUtils.createApi(ApiService.class)
                .addSearchHis(url, params)
                .compose(Transformer.<String>switchSchedulers())
                .subscribe(callback);
        Log.d("养护_addSearchHis：  " , url);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("养护_addSearchHis：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void requestSearchHis(String user, CommonObserver<Object> callback) {
        String url = AppConfig.BeasUrl+"2056/api/AppSearchHis/GetAppSearch?AppType=2&UserId=" + user;
        RxHttpUtils.createApi(ApiService.class)
                .getSearchList(url)
                .compose(Transformer.<String>switchSchedulers())
                .subscribe(callback);
        Log.d("养护_requestSearchHis：  " , url);
    }

    public void clearSearchHis(String user, CommonObserver<Object> callback) {
        String url = AppConfig.BeasUrl+"2056/api/AppSearchHis/ClearAppHis";
        Map<String, Object> params = new HashMap<>();
        params.put("AppType", "2");
        params.put("UserId", user);
        RxHttpUtils.createApi(ApiService.class)
                .clearHis(url, params)
                .compose(Transformer.<String>switchSchedulers())
                .subscribe(callback);
        Log.d("养护_clearSearchHis：  " , url);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("养护_clearSearchHis：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

}
