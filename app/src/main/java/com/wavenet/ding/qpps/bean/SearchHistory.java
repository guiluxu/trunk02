package com.wavenet.ding.qpps.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Create on 2019/5/27 18:53 by bll
 */


public class SearchHistory implements Serializable {


    /**
     * code : 200
     * msg : 成功
     * data : [{"id":"1cf83e6d3af5487599ae898ae9c809db","appType":"2","userId":"yhtest","searchValue":"好","sDate":"2019-11-28 09:39:34.0"},{"id":"5d4855edf0544cc091321331814538a8","appType":"2","userId":"yhtest","searchValue":"haod ","sDate":"2019-11-28 10:09:29.0"},{"id":"91612f3de6c4454591eda09a62edb845","appType":"2","userId":"yhtest","searchValue":"好","sDate":"2019-11-28 09:45:05.0"},{"id":"b21980720c224782804abeda9ae48c3e","appType":"2","userId":"yhtest","searchValue":"太阳","sDate":"2019-11-27 21:23:42.0"},{"id":"dd7f71e37a414f8d849f71b6a9868604","appType":"2","userId":"yhtest","searchValue":"太阳","sDate":"2019-11-27 21:18:09.0"},{"id":"f38f8bc729ea4223a49387cab73cd32e","appType":"2","userId":"yhtest","searchValue":"好","sDate":"2019-11-28 09:40:00.0"},{"id":"fd1b52b5ca6640a2b8b4be0e13c30eb6","appType":"2","userId":"yhtest","searchValue":"太阳","sDate":"2019-11-27 21:18:41.0"}]
     * _dt : 1574909841669
     */

    private String code;
    private String msg;
    private long _dt;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1cf83e6d3af5487599ae898ae9c809db
         * appType : 2
         * userId : yhtest
         * searchValue : 好
         * sDate : 2019-11-28 09:39:34.0
         */

        private String id;
        private String appType;
        private String userId;
        private String searchValue;
        private String sDate;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAppType() {
            return appType;
        }

        public void setAppType(String appType) {
            this.appType = appType;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getSearchValue() {
            return searchValue;
        }

        public void setSearchValue(String searchValue) {
            this.searchValue = searchValue;
        }

        public String getSDate() {
            return sDate;
        }

        public void setSDate(String sDate) {
            this.sDate = sDate;
        }
    }
}
