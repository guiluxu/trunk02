package com.wavenet.ding.qpps.bean;

import java.util.List;

/**
 * Created by zoubeiwen on 2018/8/22.
 */

public class PhtotIdBean {

    /**
     * code : 200
     * msg : 成功
     * data : [{"sId":"6c06c16873e9400494fce1f20c6a1f1d","reyId":"1575451744529xjtest","x":"121.53391096700342","y":"31.27850091555069","sType":"","tType":"","upDate":"2019-12-04 17:28:57","url":"/sjczUpload/1575451733591.jpg","contentType":"image/jpeg"}]
     * _dt : 1575451737694
     */

    private String code;
    private String msg;
    private long _dt;
    public List<DataBean> data;

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

    public long get_dt() {
        return _dt;
    }

    public void set_dt(long _dt) {
        this._dt = _dt;
    }

    public static class DataBean {
        /**
         * sId : 6c06c16873e9400494fce1f20c6a1f1d
         * reyId : 1575451744529xjtest
         * x : 121.53391096700342
         * y : 31.27850091555069
         * sType :
         * tType :
         * upDate : 2019-12-04 17:28:57
         * url : /sjczUpload/1575451733591.jpg
         * contentType : image/jpeg
         */

        public String sId;
        public String reyId;
        public String x;
        public String y;
        public String sType;
        public String tType;
        public String upDate;
        public String url;
        public String contentType;

    }
}
