package com.wavenet.ding.qpps.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ding on 2018/10/17.
 */

public class ListBean {
    /**
     * code : 200
     * msg : 成功
     * data : [{"sMangeId":"1575462512433xjtest","sRecordId":null,"sCategory":"W1002600001","sType":"W1002700001","sEmergency":"W1008100001","sInMan":"xjtest","sInDate":null,"tInDate":"2019-12-04 20:28:17.0","nX":null,"nY":null,"sSjczId":null,"sIsMange":null,"isSjsbFj":null,"isSjczFj":null,"sDesc":"","sSource":"W1007500004","sLocal":"那些那些","sTownIdIn":"W1007400005","sCompanyIn":"夏阳街道水务所","sStatus":"W1006500002","sInManFull":null,"sMangeFull":null,"sTownIdMange":null,"sDelete":null,"sName":null,"tCreate":null,"sCreateMan":null,"sRecodeId":null,"sMangeStatus":null,"pMan":null,"pDate":null,"wTaskNo":null,"tMangeTime":null,"sMangeMan":"xjtest","sCompanyMange":null,"sMangeRemark":null,"tTransTime":null,"tTransNo":null,"tTransFj":null,"tTransDept":null,"tTransMan":null,"tTransPhone":null,"tCsDept":null,"tTransUrl":null,"tTransContent":null,"tTransNum":null,"isTd":null,"isJj":null,"sSourceCn":null,"sEmergencyCn":null,"sStatusCn":null,"sCategoryCn":null,"sTypeCn":null,"sSjsbId":null}]
     * _dt : 1575462516157
     */

    public String code;
    public String msg;
    public long _dt;
    public List<DataBean> data;

    public static class DataBean implements Serializable {
        /**
         * sMangeId : 1575462512433xjtest
         * sRecordId : null
         * sCategory : W1002600001
         * sType : W1002700001
         * sEmergency : W1008100001
         * sInMan : xjtest
         * sInDate : null
         * tInDate : 2019-12-04 20:28:17.0
         * nX : null
         * nY : null
         * sSjczId : null
         * sIsMange : null
         * isSjsbFj : null
         * isSjczFj : null
         * sDesc :
         * sSource : W1007500004
         * sLocal : 那些那些
         * sTownIdIn : W1007400005
         * sCompanyIn : 夏阳街道水务所
         * sStatus : W1006500002
         * sInManFull : null
         * sMangeFull : null
         * sTownIdMange : null
         * sDelete : null
         * sName : null
         * tCreate : null
         * sCreateMan : null
         * sRecodeId : null
         * sMangeStatus : null
         * pMan : null
         * pDate : null
         * wTaskNo : null
         * tMangeTime : null
         * sMangeMan : xjtest
         * sCompanyMange : null
         * sMangeRemark : null
         * tTransTime : null
         * tTransNo : null
         * tTransFj : null
         * tTransDept : null
         * tTransMan : null
         * tTransPhone : null
         * tCsDept : null
         * tTransUrl : null
         * tTransContent : null
         * tTransNum : null
         * isTd : null
         * isJj : null
         * sSourceCn : null
         * sEmergencyCn : null
         * sStatusCn : null
         * sCategoryCn : null
         * sTypeCn : null
         * sSjsbId : null
         */

        public String sMangeId;
        public String sRecordId;
        public String sCategory;
        public String sType;
        public String sEmergency;
        public String sInMan;
        public String sInDate;
        public String tInDate;
        public String nX;
        public String nY;
        public String sSjczId;
        public String sIsMange;
        public String isSjsbFj;
        public String isSjczFj;
        public String sDesc;
        public String sSource;
        public String sLocal;
        public String sTownIdIn;
        public String sCompanyIn;
        public String sStatus;
        public String sInManFull;
        public String sMangeFull;
        public String sTownIdMange;
        public String sDelete;
        public String sName;
        public String tCreate;
        public String sCreateMan;
        public String sRecodeId;
        public String sMangeStatus;
        public String pMan;
        public String pDate;
        public String wTaskNo;
        public String tMangeTime;
        public String sMangeMan;
        public String sCompanyMange;
        public String sMangeRemark;
        public String tTransTime;
        public String tTransNo;
        public String tTransFj;
        public String tTransDept;
        public String tTransMan;
        public String tTransPhone;
        public String tCsDept;
        public String tTransUrl;
        public String tTransContent;
        public String tTransNum;
        public String isTd;
        public String isJj;
        public String sSourceCn;
        public String sEmergencyCn;
        public String sStatusCn;
        public String sCategoryCn;
        public String sTypeCn;
        public String sSjsbId;

        @Override
        public String toString() {
            return "DataBean{" +
                    "sMangeId='" + sMangeId + '\'' +
                    ", sRecordId='" + sRecordId + '\'' +
                    ", sCategory='" + sCategory + '\'' +
                    ", sType='" + sType + '\'' +
                    ", sEmergency='" + sEmergency + '\'' +
                    ", sInMan='" + sInMan + '\'' +
                    ", sInDate='" + sInDate + '\'' +
                    ", tInDate='" + tInDate + '\'' +
                    ", nX='" + nX + '\'' +
                    ", nY='" + nY + '\'' +
                    ", sSjczId='" + sSjczId + '\'' +
                    ", sIsMange='" + sIsMange + '\'' +
                    ", isSjsbFj='" + isSjsbFj + '\'' +
                    ", isSjczFj='" + isSjczFj + '\'' +
                    ", sDesc='" + sDesc + '\'' +
                    ", sSource='" + sSource + '\'' +
                    ", sLocal='" + sLocal + '\'' +
                    ", sTownIdIn='" + sTownIdIn + '\'' +
                    ", sCompanyIn='" + sCompanyIn + '\'' +
                    ", sStatus='" + sStatus + '\'' +
                    ", sInManFull='" + sInManFull + '\'' +
                    ", sMangeFull='" + sMangeFull + '\'' +
                    ", sTownIdMange='" + sTownIdMange + '\'' +
                    ", sDelete='" + sDelete + '\'' +
                    ", sName='" + sName + '\'' +
                    ", tCreate='" + tCreate + '\'' +
                    ", sCreateMan='" + sCreateMan + '\'' +
                    ", sRecodeId='" + sRecodeId + '\'' +
                    ", sMangeStatus='" + sMangeStatus + '\'' +
                    ", pMan='" + pMan + '\'' +
                    ", pDate='" + pDate + '\'' +
                    ", wTaskNo='" + wTaskNo + '\'' +
                    ", tMangeTime='" + tMangeTime + '\'' +
                    ", sMangeMan='" + sMangeMan + '\'' +
                    ", sCompanyMange='" + sCompanyMange + '\'' +
                    ", sMangeRemark='" + sMangeRemark + '\'' +
                    ", tTransTime='" + tTransTime + '\'' +
                    ", tTransNo='" + tTransNo + '\'' +
                    ", tTransFj='" + tTransFj + '\'' +
                    ", tTransDept='" + tTransDept + '\'' +
                    ", tTransMan='" + tTransMan + '\'' +
                    ", tTransPhone='" + tTransPhone + '\'' +
                    ", tCsDept='" + tCsDept + '\'' +
                    ", tTransUrl='" + tTransUrl + '\'' +
                    ", tTransContent='" + tTransContent + '\'' +
                    ", tTransNum='" + tTransNum + '\'' +
                    ", isTd='" + isTd + '\'' +
                    ", isJj='" + isJj + '\'' +
                    ", sSourceCn='" + sSourceCn + '\'' +
                    ", sEmergencyCn='" + sEmergencyCn + '\'' +
                    ", sStatusCn='" + sStatusCn + '\'' +
                    ", sCategoryCn='" + sCategoryCn + '\'' +
                    ", sTypeCn='" + sTypeCn + '\'' +
                    ", sSjsbId='" + sSjsbId + '\'' +
                    '}';
        }
    }
}
