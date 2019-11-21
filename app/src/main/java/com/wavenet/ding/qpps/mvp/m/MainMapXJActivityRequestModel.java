package com.wavenet.ding.qpps.mvp.m;


import android.content.Context;
import android.util.Log;

import com.dereck.library.base.IMvpBaseView;
import com.dereck.library.http.SingleRxHttp;
import com.dereck.library.interceptor.Transformer;
import com.dereck.library.observer.CommonObserver;
import com.dereck.library.utils.RxHttpUtils;
import com.dereck.library.utils.ToastUtils;
import com.wavenet.ding.qpps.activity.MainMapXJActivity;
import com.wavenet.ding.qpps.api.ApiService;
import com.wavenet.ding.qpps.db.WavenetCallBack;
import com.wavenet.ding.qpps.utils.AppAttribute;
import com.wavenet.ding.qpps.utils.AppConfig;
import com.wavenet.ding.qpps.utils.AppTool;
import com.wavenet.ding.qpps.utils.GetUTCTime;
import com.wavenet.ding.qpps.utils.LogUtils;
import com.wavenet.ding.qpps.utils.SPUtil;
import com.wavenet.ding.qpps.utils.UrlUtils;
import com.wavenet.ding.qpps.view.ControllerMainUIView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.zhy.http.okhttp.OkHttpUtils.post;

public class MainMapXJActivityRequestModel implements IMvpBaseView {

    //开始巡检定时查询位置信息
    public void requestUPloca(String S_ID, String S_MAN_ID, String T_UPLOAD, double N_X, double N_Y, double N_SPEED, String S_TASK_TYPE, String S_RECORD_ID, double N_MILEAGE, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/trajectory/addTrajectory";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sId", S_ID);
        reqParams.put("sManId", S_MAN_ID);
        reqParams.put("tUpload", T_UPLOAD);
        reqParams.put("nx", String.valueOf(N_X));
        reqParams.put("ny", String.valueOf(N_Y));
        reqParams.put("nSpeed",  String.valueOf(N_SPEED));
        reqParams.put("sTaskType", S_TASK_TYPE);
        reqParams.put("sRecordId", S_RECORD_ID);
        reqParams.put("nMileage", String.valueOf(N_MILEAGE));
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        //        Log.e("RequestModel","requestUPloca49");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("MOD-requestUPloca：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    //上报中提交文字部分
    public void clickRequestUPTask(Context mContext, String S_DESC, String S_MANGE_ID, String S_RECODE_ID, String S_CATEGORY, String S_TYPE, String S_IN_MAN, String T_IN_DATE, double N_X, double N_Y, String S_LOCAL, WavenetCallBack callback) {
        String urlstr =AppConfig.BeasUrl1+ "/management/addManagement";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sRecodeId", S_RECODE_ID);
        reqParams.put("sCategory", S_CATEGORY);
        reqParams.put("sType", S_TYPE);
        if (AppTool.isNull(S_IN_MAN)) {
            ToastUtils.showToast("上报人为空");
            return;
        }

        reqParams.put("sEmergency", "W1008100001");
        reqParams.put("sInMan", S_IN_MAN);
        reqParams.put("tInDate", T_IN_DATE);
        reqParams.put("nx", String.valueOf(N_X));
        reqParams.put("ny", String.valueOf(N_Y));
        reqParams.put("sIsMange", "W1001600000");
        reqParams.put("sSjsbId", S_MANGE_ID);
        reqParams.put("sDesc", S_DESC);
        reqParams.put("sSource", "W1007500004");
        reqParams.put("sLocal", S_LOCAL);
        reqParams.put("sTownIdIn", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompanyIn", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("sStatus", "W1006500001");

        Log.e("MOD-RequestModel","clickRequestUPTask92");

        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickRequestUPTask：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJReportData(urlstr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);

        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
    }

    //上报中大类
    public void clickRequestClasbig(WavenetCallBack callback) {

//        String urlstr = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_DICT?$select=S_CORRESPOND,S_VALUE&$filter=S_CODE%20eq%20%27W10026%27";
        String urlstr = AppConfig.BeasUrl1+"/tDict/getTDict";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sCode", "W10026");
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJReportData(urlstr,reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);

        Log.e("MOD-RequestModel","clickRequestClasbig 106");
        Log.d("MOD-clickRequestClasbig：  " , "sCode："+"W10026"+" url:" + urlstr);

    }

    //上报中小类
    public void clickRequestClassmall(String clasbig, WavenetCallBack callback) {
//        clasbig = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_DICT?$select=S_CORRESPOND,S_VALUE&$filter=S_PCODE eq '" + clasbig + "'";
        String urlstr = AppConfig.BeasUrl1+"/tDict/getTDict";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sPcode", clasbig);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJgetClassmall(clasbig)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","clickRequestClassmall 117");
        Log.d("MOD-clickRequestClassmall：" , "sPcode："+clasbig+" url: " + clasbig);
    }

    //待处置任务列表
    public void clickRequestTasklist(String S_MAN, String S_STATUS, WavenetCallBack callback) {

//        String urlstr =AppConfig.BeasUrl+ "2081/odata/PSSSYH/default/V_PATROL_MANAGEMENT?$select=S_MANGE_ID,S_NAME,T_IN_DATE,S_SOURCE,S_CATEGORY,S_TYPE,T_CREATE,S_LOCAL,S_EMERGENCY,S_SJSB_ID,S_STATUS,S_SJCZ_ID,N_X,N_Y,S_COMPANY_MANGE,IS_SJSB_FJ,IS_SJCZ_FJ,IS_TD,IS_JJ,S_SOURCE_CN,S_EMERGENCY_CN,S_STATUS_CN,S_DESC,S_CATEGORY_CN,S_TYPE_CN&$filter=S_MANGE_MAN eq '" + S_MAN + "' and S_STATUS eq 'W1006500002' and S_DELETE eq 1";
        String urlstr =AppConfig.BeasUrl1+ "/management/vPatrolManagement";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMan", S_MAN);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","clickRequestTasklist131");
        Log.d("MOD-clickRequestTasklist：  " , "sMan："+ S_MAN +" url: "+ urlstr);
    }

    //事件上报（文件）//TODO 6 事件上报，61事件处置，62 暂时没有用  63 派单结束上报
    public void FileRequest(final int file, Map<String, Object> map, ArrayList<String> arrayList, CommonObserver<Object> callback) {
        String url =AppConfig.BeasUrl1+ "/file/addXjImg";
        if (file == 6) {
            url = AppConfig.BeasUrl1+"/file/addXjImg";//上报，补录
        } else if (file == 61 || file == 63) {
            url = AppConfig.BeasUrl1+"/file/addXjImg";
        } else if (file == 62) {
            url = AppConfig.BeasUrl1+"/file/addXjImg";
        }
        RxHttpUtils.uploadImgsWithParams(url, "file", map, arrayList)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);

        Log.e("MOD-RequestModel","FileRequest 146");
        Log.d("MOD-FileRequest：  " , "get方法：" + url);
    }

    //日常巡检开始
    public void clickTaskStart(Context context, String S_MAN_ID, String S_RECODE_ID, String T_IN_DATE, String N_CYCLE, WavenetCallBack callback) {
        String urlstr =AppConfig.BeasUrl1+ "/patrolRecode/addTPatrolRecode";
        //流水号，系统时间， 暂时默认1
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sRecodeId",S_RECODE_ID);
        reqParams.put("tStart",T_IN_DATE);

        reqParams.put("sManId", S_MAN_ID);
        reqParams.put("sTownId", SPUtil.getInstance(context).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompany",
                UrlUtils.toURLDecoded(SPUtil.getInstance(context).getStringValue(SPUtil.APP_COMPANY))
        );
        reqParams.put("sTownName",
                UrlUtils.toURLDecoded(SPUtil.getInstance(context).getStringValue(SPUtil.APP_TOWNNAME))
        );
        reqParams.put("sManCn",
                UrlUtils.toURLDecoded(SPUtil.getInstance(context).getStringValue(SPUtil.APP_MYNAME))
        );

        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","clickTaskStart174");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskStart：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }
    //上报后处置提交
    public void clickTaskDeal(Context mContext, String S_MANGE_ID, String S_MANGE_MAN, String T_MANGE_TIME, String S_MANGE_REMARK, WavenetCallBack callback) {
//        String urlStr = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_PATROL_MANAGEMENT('" + S_MANGE_ID + "')";
        String urlStr = AppConfig.BeasUrl1+"/management/edtManagement";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sMangeMan", S_MANGE_MAN);
        reqParams.put("tMangeTime", T_MANGE_TIME);
        reqParams.put("sIsMange", "W1001600001");//处置
        reqParams.put("sSjczId", S_MANGE_ID);
        reqParams.put("sStatus", "W1006500004");
        if (!AppTool.isNull(S_MANGE_REMARK)) {
            reqParams.put("sMangeRemark", S_MANGE_REMARK);//
        }

        reqParams.put("sTownidMange", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompanyMange", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        post()
                .url(urlStr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJTaskDeal(urlStr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","clickTaskDeal 201");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskDeal：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    //派单处置
    public void clickTaskDeal2(double x, Context mContext, String S_MANGE_ID, String S_MANGE_MAN, String T_MANGE_TIME, String S_SJCZ_ID, String S_MANGE_REMARK, WavenetCallBack callback) {
        String urlStr = AppConfig.BeasUrl1+"/patrolRecode/taskComplete";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("tEnd", GetUTCTime.getNow());
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sMangeMan", S_MANGE_MAN);
        if (!AppTool.isNull(S_MANGE_REMARK)) {
            reqParams.put("sMangeRemark", S_MANGE_REMARK);
        }
        reqParams.put("sStatus", "W1006500004");
        //N_MILEAGE   里程   单位米
        reqParams.put("nMileage", x+"");
        reqParams.put("nDel", 1+"");
        reqParams.put("sSjsbId", MainMapXJActivity.S_SJSB_ID);//派单任务记录上报id
        reqParams.put("sSjczId", S_MANGE_ID);//派单任务记录处置id
        reqParams.put("sRecodeId", S_SJCZ_ID);//自动生成的s_recode_id
        reqParams.put("sMangeFull", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("sTownIdMange", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompanyMange", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("sMangeMan", SPUtil.getInstance(mContext).getStringValue(SPUtil.USERNO));
        reqParams.put("tMangeTime", GetUTCTime.getNow());
//        headerMaps.put("Accept", "application/json");
        post()
                .url(urlStr)
                .params(reqParams)
                .build()
                .execute(callback);
       /* RxHttpUtilsFF
                .createApi(ApiService.class)F
                .userXJTaskDeal3(urlStr, reqParams)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);*/
//        SingleRxHttp
//                .getInstance().addHeaders(headerMaps).createSApi(ApiService.class)
//
//                .userXJTaskDeal3(urlStr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","clickTaskDeal2 245");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskDeal2：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void clickRequestTaskAdd(String S_MANGE_ID, String S_RECODE_ID, String S_CATEGORY, String S_TYPE, String S_IN_MAN, String T_IN_DATE, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/management/addManagement";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sRecordId", S_RECODE_ID);
        reqParams.put("sCategory", S_CATEGORY);
        reqParams.put("sType", S_TYPE);
        reqParams.put("sInMan", S_IN_MAN);
        reqParams.put("sInDate", T_IN_DATE);
        reqParams.put("sIsMange", "W1001600000");//为处置
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJReportData(urlstr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);

        Log.e("MOD-RequestModel","clickRequestTaskAdd267");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickRequestTaskAdd：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void clickTaskPaiStart(String S_MAN_ID, String S_RECODE_ID, String S_MANGE_ID, String T_IN_DATE, String N_CYCLE, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/patrolRecode/addTPatrolRecode";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sRecodeID", S_RECODE_ID);
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("tInDate", T_IN_DATE);
        // reqParams.put("N_CYCLE", 1);
        reqParams.put("sManId", S_MAN_ID);

        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","clickTaskPaiStart286");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskPaiStart：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }
    //派单列表点击其中一项后执行
    public void clickTaskPaiStart1(Context context, String S_MAN_ID, String S_RECODE_ID, String S_MANGE_ID, String T_IN_DATE, String N_CYCLE, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/patrolRecode/taskBegin";
        Map<String, String> reqParams = new HashMap<>();

        reqParams.put("sRecodeId", S_RECODE_ID);
        reqParams.put("sMangeId", S_MANGE_ID);

//        reqParams.put("S_TASK_ID", S_MANGE_ID);
        reqParams.put("tStart", GetUTCTime.getNow());
        // reqParams.put("N_CYCLE", 1);
        reqParams.put("sManId", S_MAN_ID);
        reqParams.put("sTownId", SPUtil.getInstance(context).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompany",
                UrlUtils.toURLDecoded(SPUtil.getInstance(context).getStringValue(SPUtil.APP_COMPANY))
        );
        reqParams.put("sTownName",
                UrlUtils.toURLDecoded(SPUtil.getInstance(context).getStringValue(SPUtil.APP_TOWNNAME))
        );
        reqParams.put("sManCn",
                UrlUtils.toURLDecoded(SPUtil.getInstance(context).getStringValue(SPUtil.APP_MYNAME))
        );

        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);

        Log.e("MOD-RequestModel","clickTaskPaiStart1 316");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskPaiStart1：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }


    public void clickTaskPaiState(String S_MANGE_ID, WavenetCallBack callback) {
        String urlstr =AppConfig.BeasUrl1+ "/management/changeState";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("S_MANGE_ID", S_MANGE_ID);
        reqParams.put("S_STATUS", "W1006500003");

//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJReportDataPaistate(urlstr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","clickTaskPaiState330");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskPaiState：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void clickTaskPaiReason1(String S_MANGE_ID, String S_STATUS, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/patrolRecode/taskRefuse";
//        任务编号 S_ PATROL_TASK 主键
//        任务状态 S_STATUS W1006500006 已退单
//        W1006500005 已拒绝
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("S_STATUS", S_STATUS);
        reqParams.put("S_MANGE_ID", S_MANGE_ID);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJReportDataPaireason1(urlstr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);

        Log.e("MOD-RequestModel","clickTaskPaiReason1 348");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskPaiReason1：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }
//
//    public void requestFile(Map<String, Object> map, ArrayList<String> arrayList, CommonObserver<Object> callback) {
//        RxHttpUtils.uploadImgsWithParams(AppConfig.BeasUrl+"2083/file/upload/SSYH", "file", map, arrayList)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
//
//
//    }


    public void clickTaskPaiReason2(Context mContext, String S_REASON, String S_REMARK, String S_MANGE_ID, String S_STATUS, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/patrolRecode/taskRefuse ";
        String user = SPUtil.getInstance(mContext).getStringValue(SPUtil.USERNO);

        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sId", user + System.currentTimeMillis());
        reqParams.put("sTownId", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompany", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("sTownName", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNNAME));
        reqParams.put("tTm", GetUTCTime.getNow()
        );
        if (!AppTool.isNull(S_REMARK)) {
            reqParams.put("sRemark", S_REMARK);
        }
        reqParams.put("sMan", user);
        reqParams.put("sTaskId", S_MANGE_ID);

        reqParams.put("sReason", S_REASON);
        reqParams.put("sStatus", S_STATUS);//W1006500006 已退单 W1006500005 已拒绝
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sManFullName", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));

        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","clickTaskPaiReason2 391");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskPaiReason2：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }


    //执行派单的时候退单调用的接口
    public void clickTaskPaiReason3(Context mContext, String S_REASON, String S_REMARK, String S_MANGE_ID, String S_STATUS, WavenetCallBack callback) {
        String urlstr =AppConfig.BeasUrl1+ "/patrolRecode/taskChargeback";
        String user = SPUtil.getInstance(mContext).getStringValue(SPUtil.USERNO);

        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sId", user + System.currentTimeMillis());
        reqParams.put("sTownId", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("sCompany", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("sTownName", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNNAME));
        reqParams.put("tTm", GetUTCTime.getNow()
        );
        reqParams.put("tEnd", GetUTCTime.getNow()
        );
        if (!AppTool.isNull(S_REMARK)) {
            reqParams.put("sRemark", S_REMARK);
        }
        reqParams.put("sMan", user);
        reqParams.put("sTaskId", S_MANGE_ID);
        reqParams.put("nDel", 1+"");
        reqParams.put("sReason", S_REASON);
        reqParams.put("sStatus", "W1006500006");//W1006500006 已退单 W1006500005 已拒绝
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sManFullName", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);

        Log.e("MOD-RequestModel","clickTaskPaiReason3 428");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickTaskPaiReason3：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void getRequestDictionaries(WavenetCallBack callback) {

        String urlstr = AppConfig.BeasUrl1+"/tDict/getTDict";
        post()
                .url(urlstr)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJgetDictionaries(urlstr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","getRequestDictionaries442");
        Log.d("MOD-getRequestDictionaries","get方法:"+urlstr);

    }

    //结束上报
    public void RequestEndTask(String S_RECODE_ID, String T_END, WavenetCallBack callback) {
        String urlstr =AppConfig.BeasUrl1+ "/patrolRecode/updatePatrolRecode";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("tEnd", T_END);
        reqParams.put("sRecodeId", S_RECODE_ID);
        reqParams.put("nMileage", AppTool.getDoubleAccurate(MainMapXJActivity.Distance)+"");
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","RequestEndTask458");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-RequestEndTask：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void RequestEndTaskpai1(Context mContext, String S_RECODE_ID, CommonObserver<Object> callback) {//废弃
        String urlstr =AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_PATROL_RECODE('" + S_RECODE_ID + "')";//TODO  文档没写主键传什么值  自己认为传记录列表的taskid
//        String urlstr =AppConfig.BeasUrl+"/patrolRecode/updatePatrolRecode";
        Map<Object, Object> reqParams = new HashMap<>();
        reqParams.put("S_RECODE_ID", S_RECODE_ID);
        reqParams.put("T_END", GetUTCTime.getNow());
        reqParams.put("N_MILEAGE", AppTool.getDoubleAccurate(MainMapXJActivity.Distance));
        reqParams.put("N_TIME", ControllerMainUIView.timeint);
        reqParams.put("S_SJCZ_ID", AppAttribute.F.getXJID(mContext));
        reqParams.put("S_MAN_ID", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("S_MAN_CN", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("S_TOWNNAME", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNNAME));
        reqParams.put("S_TOWNID", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("S_COMPANY", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("N_DEL", 1);//正常为1，取消为0

        RxHttpUtils
                .createApi(ApiService.class)
                .RequestXJEndTask(urlstr, reqParams)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestEndTaskpai1 480");
        for (Map.Entry<Object, Object> entry : reqParams.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            Log.d("MOD-RequestEndTaskpai1：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }

    public void RequestEndTaskpai2(String S_TASKID, CommonObserver<Object> callback) {//废弃
        String urlstr = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_PATROL_MANAGEMENT('" + S_TASKID + "')";
        Map<Object, Object> reqParams = new HashMap<>();
        reqParams.put("S_STATUS", "W1006500004");
        RxHttpUtils
                .createApi(ApiService.class)
                .RequestXJEndTask(urlstr, reqParams)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestEndTaskpai2 493");
        for (Map.Entry<Object, Object> entry : reqParams.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            Log.d("MOD-RequestEndTaskpai2：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void RequestEndTaskpai3(Context mContext, String T_MANGE_TIME, String S_MANGE_ID_REL, CommonObserver<Object> callback) {//废弃
        String urlstr = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_PATROL_MANAGEMENT('" + S_MANGE_ID_REL + "')";
        Map<Object, Object> reqParams = new HashMap<>();

        reqParams.put("S_TOWNID_IN", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("S_COMPANY_IN", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("S_IN_MAN_FULL", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));


        reqParams.put("S_MANGE_FULL", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("S_TOWNID_MANGE", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("S_COMPANY_MANGE", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("S_MANGE_MAN", SPUtil.getInstance(mContext).getStringValue(SPUtil.USERNO));
        reqParams.put("T_MANGE_TIME", T_MANGE_TIME);

        RxHttpUtils
                .createApi(ApiService.class)
                .RequestXJEndTask(urlstr, reqParams)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);

        Log.e("MOD-RequestModel","RequestEndTaskpai3 517");
        for (Map.Entry<Object, Object> entry : reqParams.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            Log.d("MOD-RequestEndTaskpai3：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void RequestEndTaskpai4(Context mContext, String T_MANGE_TIME, CommonObserver<Object> callback) {
        String urlstr =AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_PATROL_MANAGEMENT";
        Map<Object, Object> reqParams = new HashMap<>();
        reqParams.put("T_MANGE_TIME", T_MANGE_TIME);
        reqParams.put("S_MANGE_MAN", SPUtil.getInstance(mContext).getStringValue(SPUtil.USERNO));
        reqParams.put("S_TOWNID_IN", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("S_COMPANY_IN", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        reqParams.put("S_IN_MAN_FULL", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("S_MANGE_FULL", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("S_TOWNID_MANGE", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_TOWNID));
        reqParams.put("S_COMPANY_MANGE", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_COMPANY));
        RxHttpUtils
                .createApi(ApiService.class)
                .RequestXJEndTask1(urlstr, reqParams)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestEndTaskpai4 536");
        for (Map.Entry<Object, Object> entry : reqParams.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            Log.d("MOD-RequestEndTaskpai4：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }

    public void RequestCancleTask(String S_RECODE_ID, String T_END, String S_TOWNNAME, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/patrolRecode/updatePatrolRecode";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("tEnd", AppTool.getCurrentDate(AppTool.FORMAT_YMDHMS));
        reqParams.put("sRecodeId", S_RECODE_ID);
        reqParams.put("sTownName", S_TOWNNAME);
        reqParams.put("nDel", 0+"");//正常为1，取消为0
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","RequestCancleTask552");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-RequestCancleTask：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }


    //派单取消
    public void RequestCancleTask1(String S_RECODE_ID, String S_MANGE_ID, String T_END, String S_TOWNNAME, WavenetCallBack callback) {
        String urlstr =
                AppConfig.BeasUrl1+"/patrolRecode/taskCancel";


        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("tEnd", GetUTCTime.getNow());
        reqParams.put("sRecodeId", S_RECODE_ID);
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sStatus", "W1006500002");


        reqParams.put("nDel", 0+"");//正常为1，取消为0
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
        Log.e("MOD-RequestModel","RequestCancleTask1575");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-RequestCancleTask1：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }

    }


    public void RequestISDeal(String S_MANGE_ID, WavenetCallBack callback) {
//        String urlstr = AppConfig.BeasUrl+"2081/odata/PSSSYH/default/T_PATROL_MANAGEMENT?$select=S_IS_MANGE &$filter=S_MANGE_ID eq '" + S_MANGE_ID + "'";
        String urlstr = AppConfig.BeasUrl1+"/management/getIsMange";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeId", S_MANGE_ID);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .RequestXJISDeal(urlstr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestISDeal589");
        Log.d("MOD-RequestISDeal" , "sMangeId： "+S_MANGE_ID+" url: " + urlstr);

    }

    public void RequestRelevantTask(String S_RECODE_ID, WavenetCallBack callback) {
        String urlstr = AppConfig.BeasUrl1+"/management/getXJReleventTask";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sRecodeId", S_RECODE_ID);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .RequestXJRelevantTask(urlstr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);

        Log.e("MOD-RequestModel","RequestRelevantTask600");
        Log.d("MOD-RequestRelevantTask" , "sRecodeId："+S_RECODE_ID+" url:" + urlstr);
    }

    public void RequestReportDetails(String S_MANGE_ID, WavenetCallBack callback) {

        String urlstr = AppConfig.BeasUrl1+"/management/getById";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeId", S_MANGE_ID);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .RequestXJDealDetails(urlstr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestReportDetails611");
        Log.d("MOD-RequestReportDetails" , "sMangeId："+ " url: " + urlstr);
    }

    public void RequestReportDetailsPhoto(String S_RECODE_ID, CommonObserver<Object> callback) {

        String urlstr = AppConfig.BeasUrl+"2083/file/find/SJSB?relyid=" + S_RECODE_ID;
        RxHttpUtils
                .createApi(ApiService.class)
                .RequestXJDealDetails(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestReportDetailsPhoto622");
        Log.d("MOD-ReportDetailsPhoto： " , "url：" + urlstr);
    }

    public void RequestRefuselist(String S_MANGE_ID, WavenetCallBack callback) {
//        String urlstr = AppConfig.BeasUrl+
//"2081/odata/PSSSYH/default/T_REJECT_PATROL?$select=T_TM,S_REMARK,S_MAN,S_REASON,S_STATUS,S_MAN_FULLNAME,S_TASK_ID,S_TOWNID,S_COMPANY,S_TOWNNAME&$filter=S_TASK_ID%20eq%20%27" + S_MANGE_ID + "%27";
String urlstr = AppConfig.BeasUrl1+ "/rejectPatrol/get";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sTaskId", S_MANGE_ID);
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .RequestXJDealDetails(urlstr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","RequestRefuselist634");
        Log.d("MOD-RequestRefuselist" , "sTaskId： "+S_MANGE_ID+" url: " + urlstr);
    }

    //上报后推送（未完）
    public void clickRequestPushMessage(String name, String local, String category, String xl,
                                        String sbsj, CommonObserver<Object> callback) {

        String url = AppConfig.BeasUrl+"2056/api/JPush/ExecutePushExample?type=2&local=" + local +
                "&category=" + category + "&xl=" + xl + "&sbsj=" + sbsj + "&personid=" + name;

        RxHttpUtils
                .createApi(ApiService.class)
                .pushMessage(url)
                .compose(Transformer.<String>switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","clickRequestPushMessage648");
        Log.d("MOD-clickRequestPushMessag" , "post方法无参：" + url);
    }

    public void clickRequestIsDeal(Context mContext, String S_MANGE_ID, WavenetCallBack callback) {
        String urlstr =AppConfig.BeasUrl1+"/management/edtManagenment";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeMan", SPUtil.getInstance(mContext).getStringValue(SPUtil.USERNO));
        reqParams.put("sMangeFull", SPUtil.getInstance(mContext).getStringValue(SPUtil.APP_MYNAME));
        reqParams.put("sMangeId", S_MANGE_ID);
        reqParams.put("sStatus", "W1006500002");
        post()
                .url(urlstr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils
//                .createApi(ApiService.class)
//                .userXJIsDeal(urlstr, reqParams)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);

        Log.e("MOD-RequestModel","clickRequestIsDeal665");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clickRequestIsDeal：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void clickRequestIsDealDetail(String S_MANGE_ID, WavenetCallBack callback) {
        String urlStr = AppConfig.BeasUrl1+"/management/getById";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("sMangeId", S_MANGE_ID);
        post()
                .url(urlStr)
                .params(reqParams)
                .build()
                .execute(callback);
//        SingleRxHttp.getInstance().addHeaders(headerMaps).createSApi(ApiService.class)
//
//                .userXJIsDealDetail(urlStr)
//                .compose(Transformer.switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","clickRequestIsDealDetail677");
        Log.d("MOD-DealDetail：  " ,"sMangeId："+S_MANGE_ID+" url: " + urlStr);

    }


    public void AdminGetObjectIds(String idstr, String filterkey, String filtervalue, String townname, CommonObserver<Object> callback) {
        String filerStr = "";
        if (AppTool.isNull(townname)) {
            filerStr = String.format(AppConfig.Filterurlstrstart2, filterkey, "%", filtervalue, "%");
        } else {
            filerStr = String.format(AppConfig.Filterurlstrstart1, townname, filterkey, "%", filtervalue, "%");
        }
        String urlstr = String.format(AppConfig.Filterurlstr, AppConfig.GuanWangUrl, idstr, UrlUtils.toURLEncoded(filerStr), AppConfig.Filterurlstrend);
        RxHttpUtils
                .createApi(ApiService.class)
                .AdminGetObjectIds(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","AdminGetObjectIds695");
        Log.d("MOD-AdminGetObjectIds：  " , "get方法：" + urlstr);
    }

    public void AdminGetObjectDetails(int url, String ids, String filterkey, CommonObserver<Object> callback) {
        String urlstr = AppConfig.GuanWangUrl + "/" + url + "/query?where=&text=&objectIds=" + ids + "&time=&geometry=&geometryType=esriGeometryEnvelope&inSR=&spatialRel=esriSpatialRelIntersects&relationParam=&outFields=" + filterkey + "&returnGeometry=true&maxAllowableOffset=&geometryPrecision=&outSR=&returnIdsOnly=false&returnCountOnly=false&orderByFields=&groupByFieldsForStatistics=&outStatistics=&returnZ=false&returnM=false&gdbVersion=&returnDistinctValues=false&returnTrueCurves=false&resultOffset=&resultRecordCount=&f=pjson";
        RxHttpUtils
                .createApi(ApiService.class)
                .AdminGetObjectDetails(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","AdminGetObjectDetails705");
        Log.d("MOD-AdminGetObjectDetails：" , "get方法：" + urlstr);
    }

    public void requestPeople(String filterStr, CommonObserver<Object> callback) {
        String urlstr = AppConfig.BeasUrl+"2081/services/QPSSYH_DATASERVICE/t_person_operation?" + filterStr;
        Map<String, Object> headerMaps = new HashMap<>();
        headerMaps.put("Accept", "application/json");
        LogUtils.e("pppppppp", urlstr);
        SingleRxHttp.getInstance().addHeaders(headerMaps).createSApi(ApiService.class)

                .requestPeople(urlstr)
                .compose(Transformer.switchSchedulers())
                .subscribe(callback);
        Log.e("MOD-RequestModel","requestPeople718");
        for (Map.Entry<String, Object> entry : headerMaps.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            Log.d("MOD-requestPeople：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void addSearchHis(String user, String str, WavenetCallBack callback) {
        String urlStr = AppConfig.BeasUrl1+"/appSearchHis/addAppSearch";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("appType", "1");
        reqParams.put("userId", user);
        reqParams.put("searchValue", str);
        post()
                .url(urlStr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils.createApi(ApiService.class)
//                .addSearchHis(url, params)
//                .compose(Transformer.<String>switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","addSearchHis731");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-addSearchHis：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }

    public void requestSearchHis(String user, WavenetCallBack callback) {
        String urlStr = AppConfig.BeasUrl1+"/appSearchHis/getAppSearch";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("appType", "1");
        reqParams.put("userId", user);
        post()
                .url(urlStr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils.createApi(ApiService.class)
//                .getSearchList(url)
//                .compose(Transformer.<String>switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","requestSearchHis740");
        Log.d("MOD-requestSearchHis：  " , "appType： "+"1"+" userId: "+user+" url: " + urlStr);
    }

    public void clearSearchHis(String user,WavenetCallBack callback) {
        String urlStr = AppConfig.BeasUrl1+"/appSearchHis/clearAppHis";
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("appType", "1");
        reqParams.put("userId", user);
        post()
                .url(urlStr)
                .params(reqParams)
                .build()
                .execute(callback);
//        RxHttpUtils.createApi(ApiService.class)
//                .clearHis(url, params)
//                .compose(Transformer.<String>switchSchedulers())
//                .subscribe(callback);
        Log.e("MOD-RequestModel","clearSearchHis752");
        for (Map.Entry<String, String> entry : reqParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Log.d("MOD-clearSearchHis：  " , "Key = " + key + "  ----  " + "Value = " + value);
        }
    }
}
