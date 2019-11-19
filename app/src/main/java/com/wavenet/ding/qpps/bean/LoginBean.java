package com.wavenet.ding.qpps.bean;

import android.content.Context;

import com.wavenet.ding.qpps.utils.SPUtil;

import java.util.List;

/**
 * Created by ding on 2018/7/27.
 */

public class LoginBean {

//    {"success":true,"messge":"","role":"巡查人员","roleid":"1806221725294875282d639665b55","name":"xjtest","myname":"巡检测试","personid":"1808092231532527656ae51d3f879","townid":"","townname":"","company":null}
    /**
     * success : false
     * messge : 用户名或者密码错误
     */

    public boolean success;
    public String messge;
    /**
     * role : 巡查人员
     */

    public String des;//调度员街镇信息
    public String role;
    public String roleid;
    public String name;
    public String myname;//d:S_MAN_FULLNAME
    public String personid;
    public String townid;//
    public String townname;//
    public String company;
    public List<String> PushList;

    public void setSPUtil(Context mContext) {
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_MYNAME, myname);
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_PERSONID, personid);
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_TOWNID, townid);
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_ROLE, role);
//                        SPUtil.getInstance(LoginActivity.this).setStringValue(SPUtil.UNITID, result.optString("unit_id"));
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_TOWNNAME, townname);
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_DES, des);
        SPUtil.getInstance(mContext).setStringValue(SPUtil.APP_COMPANY, company);

        SPUtil.getInstance(mContext).setObjectValue(SPUtil.APP_PUSH, PushList);

//        SPUtil.getInstance(mContext).setStringValue(SPUtil.ACCOUNTID, accountId);
//        String account_id=SPUtil.getInstance(mContext).getStringValue(SPUtil.ACCOUNTID);
//        if (!AppTool.isNull(account_id)){
//            Set<String> sets = new HashSet<String>() ;
////            sets.add("account_id");
//            sets.add(account_id.replace("-",""));
//            JPushInterface.setTags(mContext, sets, new TagAliasCallback() {
//                @Override
//                public void gotResult(int i, String s, Set<String> set) {
//                    Log.e("account_id","set tag result is"+i);
//                }
//            });
//        }
    }
}
