package com.wavenet.ding.qpps.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ding on 2018/8/7.
 */

public class RelyIdBean {
/*

    @SerializedName("@odata.context")
    public String _$OdataContext252; // FIXME check this code
    @SerializedName("@odata.etag")
    public String _$OdataEtag35; // FIXME check this code
    public String S_TARKS_TYPE;
    public Object T_CURING_DATE;
    public Object T_ENDTM;
    public String S_MANGE_ID;
    public Object N_MILEAGE;
    public String T_STARTM;
    public String T_CURING_MAN;
    public Object S_CURING_STATUS;
    public String S_RECODE_ID;
    public Object S_CURING_TYPE;
    public String S_ROAD_ID;
    public Object N_SPEED;*/


    /**
     * code : 200
     * msg : 成功
     * data : {"sTaskId":"123","sRecodeId":"1574760829988_YH_yhtest","sRoadId":"ts006","sCuringType":"","tCuringDate":"","sTarksType":"W1007100001","sCuringStatus":"","nMileage":"","nSpeed":"","tStartm":"2019-11-26 17:17:29","tEndtm":"","tCuringMan":"yhtest","sMan":"","sTaskStatus":"","sCuringMode":"W1008300001","sDel":""}
     * _dt : 1574760951586
     */

    private String code;
    private String msg;
    private DataBean data;
    private long _dt;

    @Override
    public String toString() {
        return "RelyIdBean{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", _dt=" + _dt +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public long get_dt() {
        return _dt;
    }

    public void set_dt(long _dt) {
        this._dt = _dt;
    }

    public static class DataBean {
        /**
         * sTaskId : 123
         * sRecodeId : 1574760829988_YH_yhtest
         * sRoadId : ts006
         * sCuringType :
         * tCuringDate :
         * sTarksType : W1007100001
         * sCuringStatus :
         * nMileage :
         * nSpeed :
         * tStartm : 2019-11-26 17:17:29
         * tEndtm :
         * tCuringMan : yhtest
         * sMan :
         * sTaskStatus :
         * sCuringMode : W1008300001
         * sDel :
         */

        private String sTaskId;
        private String sRecodeId;
        private String sRoadId;
        private String sCuringType;
        private String tCuringDate;
        private String sTarksType;
        private String sCuringStatus;
        private String nMileage;
        private String nSpeed;
        private String tStartm;
        private String tEndtm;
        private String tCuringMan;
        private String sMan;
        private String sTaskStatus;
        private String sCuringMode;
        private String sDel;

        public String getSTaskId() {
            return sTaskId;
        }

        public void setSTaskId(String sTaskId) {
            this.sTaskId = sTaskId;
        }

        public String getSRecodeId() {
            return sRecodeId;
        }

        public void setSRecodeId(String sRecodeId) {
            this.sRecodeId = sRecodeId;
        }

        public String getSRoadId() {
            return sRoadId;
        }

        public void setSRoadId(String sRoadId) {
            this.sRoadId = sRoadId;
        }

        public String getSCuringType() {
            return sCuringType;
        }

        public void setSCuringType(String sCuringType) {
            this.sCuringType = sCuringType;
        }

        public String getTCuringDate() {
            return tCuringDate;
        }

        public void setTCuringDate(String tCuringDate) {
            this.tCuringDate = tCuringDate;
        }

        public String getSTarksType() {
            return sTarksType;
        }

        public void setSTarksType(String sTarksType) {
            this.sTarksType = sTarksType;
        }

        public String getSCuringStatus() {
            return sCuringStatus;
        }

        public void setSCuringStatus(String sCuringStatus) {
            this.sCuringStatus = sCuringStatus;
        }

        public String getNMileage() {
            return nMileage;
        }

        public void setNMileage(String nMileage) {
            this.nMileage = nMileage;
        }

        public String getNSpeed() {
            return nSpeed;
        }

        public void setNSpeed(String nSpeed) {
            this.nSpeed = nSpeed;
        }

        public String getTStartm() {
            return tStartm;
        }

        public void setTStartm(String tStartm) {
            this.tStartm = tStartm;
        }

        public String getTEndtm() {
            return tEndtm;
        }

        public void setTEndtm(String tEndtm) {
            this.tEndtm = tEndtm;
        }

        public String getTCuringMan() {
            return tCuringMan;
        }

        public void setTCuringMan(String tCuringMan) {
            this.tCuringMan = tCuringMan;
        }

        public String getSMan() {
            return sMan;
        }

        public void setSMan(String sMan) {
            this.sMan = sMan;
        }

        public String getSTaskStatus() {
            return sTaskStatus;
        }

        public void setSTaskStatus(String sTaskStatus) {
            this.sTaskStatus = sTaskStatus;
        }

        public String getSCuringMode() {
            return sCuringMode;
        }

        public void setSCuringMode(String sCuringMode) {
            this.sCuringMode = sCuringMode;
        }

        public String getSDel() {
            return sDel;
        }

        public void setSDel(String sDel) {
            this.sDel = sDel;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "sTaskId='" + sTaskId + '\'' +
                    ", sRecodeId='" + sRecodeId + '\'' +
                    ", sRoadId='" + sRoadId + '\'' +
                    ", sCuringType='" + sCuringType + '\'' +
                    ", tCuringDate='" + tCuringDate + '\'' +
                    ", sTarksType='" + sTarksType + '\'' +
                    ", sCuringStatus='" + sCuringStatus + '\'' +
                    ", nMileage='" + nMileage + '\'' +
                    ", nSpeed='" + nSpeed + '\'' +
                    ", tStartm='" + tStartm + '\'' +
                    ", tEndtm='" + tEndtm + '\'' +
                    ", tCuringMan='" + tCuringMan + '\'' +
                    ", sMan='" + sMan + '\'' +
                    ", sTaskStatus='" + sTaskStatus + '\'' +
                    ", sCuringMode='" + sCuringMode + '\'' +
                    ", sDel='" + sDel + '\'' +
                    '}';
        }
    }
}
