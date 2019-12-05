package com.wavenet.ding.qpps.db.bean;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/19.
 */

public class TrackPalyBean {
    /**
     * code : 200
     * msg : 成功
     * data : [{"sId":"1566358249896xjtest","sManId":"xjtest","tUpload":"2019-08-21 11:30:49.0","nX":"121.534007778504430000","nY":"31.278553814656359000","tLastudTime":null,"nLastX":null,"nLastY":null,"sTaskType":"W1007000001","sRecordId":"XJ1566358235655xjtest","nSpeed":"0.159999996423721310","nSpeed1":null,"nMileage":"12.60000000"},{"sId":"1566358264893xjtest","sManId":"xjtest","tUpload":"2019-08-21 11:31:04.0","nX":"121.534076677748500000","nY":"31.278576739161533000","tLastudTime":null,"nLastX":null,"nLastY":null,"sTaskType":"W1007000001","sRecordId":"XJ1566358235655xjtest","nSpeed":"0.209999993443489070","nSpeed1":null,"nMileage":"7.79000000"},{"sId":"1566358282107xjtest","sManId":"xjtest","tUpload":"2019-08-21 11:31:22.0","nX":"121.534076677748500000","nY":"31.278576739161533000","tLastudTime":null,"nLastX":null,"nLastY":null,"sTaskType":"W1007000001","sRecordId":"XJ1566358235655xjtest","nSpeed":"0.000000000000000000","nSpeed1":null,"nMileage":"0.00000000"}]
     * _dt : 1575518474369
     */

    public String code;
    public String msg;
    public long _dt;
    public List<DataBean> data;

    public static class DataBean {
        /**
         * sId : 1566358249896xjtest
         * sManId : xjtest
         * tUpload : 2019-08-21 11:30:49.0
         * nX : 121.534007778504430000
         * nY : 31.278553814656359000
         * tLastudTime : null
         * nLastX : null
         * nLastY : null
         * sTaskType : W1007000001
         * sRecordId : XJ1566358235655xjtest
         * nSpeed : 0.159999996423721310
         * nSpeed1 : null
         * nMileage : 12.60000000
         */

        public String sId;
        public String sManId;
        public String tUpload;
        public double nX;
        public double nY;
        public Object tLastudTime;
        public Object nLastX;
        public Object nLastY;
        public String sTaskType;
        public String sRecordId;
        public double nSpeed;
        public Object nSpeed1;
        public String nMileage;

    }
//    /**
//     * Code : 200
//     * Msg : 查询成功!
//     * Data : {"ALL_Total":1,"Data":[{"S_Man_Id":"zhuxg","S_Man_Name":"朱学干","S_Recode_Id":"XJ1562573571549zhuxg","T_START":"2019/7/8 16:12:51","T_END":"2019/7/8 16:26:34","Data":[{"S_ID":"1562574380700zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:26:20","N_X":121.28918906685084,"N_Y":31.168259452126144,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574365700zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:26:05","N_X":121.28921991225451,"N_Y":31.168296290590582,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.6200000047683716,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574350714zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:25:50","N_X":121.28922033134967,"N_Y":31.168320346652685,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574335735zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:25:35","N_X":121.2891913299647,"N_Y":31.168296039133487,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.3499999940395355,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574320788zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:25:20","N_X":121.28919543709725,"N_Y":31.16822801998925,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.25999999046325684,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574305705zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:25:05","N_X":121.28914724115401,"N_Y":31.16826179905903,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.8700000047683716,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574290796zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:24:50","N_X":121.28916299913197,"N_Y":31.168252285598932,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574275781zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:24:35","N_X":121.28917909238606,"N_Y":31.16824218540561,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574260767zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:24:20","N_X":121.28917842183381,"N_Y":31.168228061898766,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574245751zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:24:05","N_X":121.28915704798072,"N_Y":31.168194282828985,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574230736zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:23:50","N_X":121.28915704798072,"N_Y":31.168194282828985,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574215720zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:23:35","N_X":121.28917632635802,"N_Y":31.168223451852022,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.2199999988079071,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574200705zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:23:20","N_X":121.28917607490092,"N_Y":31.168240006110786,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.3700000047683716,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574185787zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:23:05","N_X":121.28915252175301,"N_Y":31.168257943383573,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574170710zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:22:50","N_X":121.28908001829058,"N_Y":31.16834792311412,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.9700000286102295,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574155794zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:22:35","N_X":121.28901539381712,"N_Y":31.168502485408602,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":1.0499999523162842,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574140768zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:22:20","N_X":121.28893417317539,"N_Y":31.168655748508094,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.18000000715255737,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574125744zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:22:05","N_X":121.28885312017172,"N_Y":31.168733113474367,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":1.2699999809265137,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574110718zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:21:50","N_X":121.28870911907524,"N_Y":31.168867223925112,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":1.149999976158142,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574095729zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:21:35","N_X":121.2886712328729,"N_Y":31.16902040320557,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":1.2100000381469727,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574080726zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:21:20","N_X":121.28857391897708,"N_Y":31.16914881396216,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":1.059999942779541,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574065713zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:21:05","N_X":121.28848607663184,"N_Y":31.169304214446964,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.5699999928474426,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574050710zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:20:50","N_X":121.2884294149664,"N_Y":31.16944712589604,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.7300000190734863,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574035805zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:20:35","N_X":121.28834123734504,"N_Y":31.169438660173835,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.6299999952316284,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574020774zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:20:20","N_X":121.28837795008093,"N_Y":31.169421058177175,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.5899999737739563,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562574005760zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:20:05","N_X":121.28838557761281,"N_Y":31.16943648087901,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.5400000214576721,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573990708zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:19:50","N_X":121.28835741441816,"N_Y":31.169420345715405,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573975705zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:19:35","N_X":121.28835741441816,"N_Y":31.169420345715405,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573960715zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:19:20","N_X":121.28836998727292,"N_Y":31.169412424816908,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573945706zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:19:05","N_X":121.28836998727292,"N_Y":31.169412424816908,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573930712zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:18:50","N_X":121.28836118627459,"N_Y":31.169445323786857,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573915706zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:18:35","N_X":121.28833729785055,"N_Y":31.16945299322826,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573900767zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:18:20","N_X":121.28833729785055,"N_Y":31.16945299322826,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573885757zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:18:05","N_X":121.2883313466993,"N_Y":31.16944720971507,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.49000000953674316,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573870707zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:17:50","N_X":121.28837778244286,"N_Y":31.169473235524418,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573855718zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:17:35","N_X":121.28837778244286,"N_Y":31.169473235524418,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573840708zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:17:20","N_X":121.28837778244286,"N_Y":31.169473235524418,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573825718zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:17:05","N_X":121.28837778244286,"N_Y":31.169473235524418,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573810804zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:16:50","N_X":121.28837778244286,"N_Y":31.169473235524418,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573795769zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:16:35","N_X":121.28838465560347,"N_Y":31.169470720953466,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.15000000596046448,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573780739zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:16:20","N_X":121.28833914186924,"N_Y":31.169473570800545,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573765759zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:16:05","N_X":121.28834609884888,"N_Y":31.169451023481013,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573750730zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:15:50","N_X":121.28835087653368,"N_Y":31.169443186401548,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.7200000286102295,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573735748zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:15:35","N_X":121.28835942607492,"N_Y":31.169446622981848,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573720721zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:15:20","N_X":121.28837937500447,"N_Y":31.169460536941113,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.25,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573705715zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:15:05","N_X":121.28837769862383,"N_Y":31.1694853473745,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.3700000047683716,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573690708zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:14:50","N_X":121.28840175468594,"N_Y":31.1694697570346,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":1.0099999904632568,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573675708zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:14:35","N_X":121.28837903972834,"N_Y":31.16946095603627,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573660709zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:14:20","N_X":121.28837903972834,"N_Y":31.16946095603627,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573645709zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:14:05","N_X":121.28838683489829,"N_Y":31.16945622026098,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.20999999344348907,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573630709zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:13:50","N_X":121.28841709356874,"N_Y":31.169441090925755,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573615710zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:13:35","N_X":121.28841340553134,"N_Y":31.169439875549795,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.47999998927116394,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573600710zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:13:20","N_X":121.2884486933437,"N_Y":31.169413849740447,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.41999998688697815,"N_SPEED1":null,"N_MILEAGE":null},{"S_ID":"1562573585713zhuxg","S_MAN_ID":"zhuxg","T_UPLOAD":"2019-07-08 16:13:05","N_X":121.28838021319478,"N_Y":31.169448383181514,"T_LASTUDTIME":null,"N_LAST_X":null,"N_LAST_Y":null,"S_TASK_TYPE":"W1007000001","S_RECORD_ID":"XJ1562573571549zhuxg","N_SPEED":0.2199999988079071,"N_SPEED1":null,"N_MILEAGE":null}]}]}
//     */
//
//    @SerializedName("Code")
//    public int Code;
//    @SerializedName("Msg")
//    public String Msg;
//    @SerializedName("Data")
//    public DataBeanXX Data;
//
//    public static class DataBeanXX {
//        /**
//         * ALL_Total : 1.0
//         * Data :
//         */
//
//        @SerializedName("ALL_Total")
//        public double ALLTotal;
//        @SerializedName("Data")
//        public List<DataBeanX> Data;
//
//        public static class DataBeanX {
//            /**
//             * S_Man_Id : zhuxg
//             * S_Man_Name : 朱学干
//             * S_Recode_Id : XJ1562573571549zhuxg
//             * T_START : 2019/7/8 16:12:51
//             * T_END : 2019/7/8 16:26:34
//             * Data :
//             */
//
//            @SerializedName("S_Man_Id")
//            public String SManId;
//            @SerializedName("S_Man_Name")
//            public String SManName;
//            @SerializedName("S_Recode_Id")
//            public String SRecodeId;
//            @SerializedName("T_START")
//            public String TSTART;
//            @SerializedName("T_END")
//            public String TEND;
//            @SerializedName("Data")
//            public List<DataBean> Data;
//
//            public static class DataBean {
//                /**
//                 * S_ID : 1562574380700zhuxg
//                 * S_MAN_ID : zhuxg
//                 * T_UPLOAD : 2019-07-08 16:26:20
//                 * N_X : 121.28918906685084
//                 * N_Y : 31.168259452126144
//                 * T_LASTUDTIME : null
//                 * N_LAST_X : null
//                 * N_LAST_Y : null
//                 * S_TASK_TYPE : W1007000001
//                 * S_RECORD_ID : XJ1562573571549zhuxg
//                 * N_SPEED : 0.0
//                 * N_SPEED1 : null
//                 * N_MILEAGE : null
//                 */
//
//                @SerializedName("S_ID")
//                public String SID;
//                @SerializedName("S_MAN_ID")
//                public String SMANID;
//                @SerializedName("T_UPLOAD")
//                public String TUPLOAD;
//                @SerializedName("N_X")
//                public double NX;
//                @SerializedName("N_Y")
//                public double NY;
//                @SerializedName("T_LASTUDTIME")
//                public Object TLASTUDTIME;
//                @SerializedName("N_LAST_X")
//                public Object NLASTX;
//                @SerializedName("N_LAST_Y")
//                public Object NLASTY;
//                @SerializedName("S_TASK_TYPE")
//                public String STASKTYPE;
//                @SerializedName("S_RECORD_ID")
//                public String SRECORDID;
//                @SerializedName("N_SPEED")
//                public double NSPEED;
//                @SerializedName("N_SPEED1")
//                public Object NSPEED1;
//                @SerializedName("N_MILEAGE")
//                public Object NMILEAGE;
//
//
//            }
//
//        }
//    }
    List<TrackBean> mTrackBeanL;
    public  List<TrackBean> getTrackBeanL( List< TrackPalyBean.DataBean> tpdl){
        mTrackBeanL=new ArrayList<>();
        for (int i = 0; i <tpdl.size() ; i++) {

            if (tpdl.get(i).nSpeed!=0){//NSPEED
                com.wavenet.ding.qpps.db.bean.TrackBean  tb=new TrackBean(tpdl.get(i).nY,tpdl.get(i).nX);
                mTrackBeanL.add(tb);
            }
        }

        return mTrackBeanL;

//                    return mTrackBeanL;
    }
}
