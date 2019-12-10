package com.wavenet.ding.qpps.bean;

import com.amap.api.maps2d.AMapUtils;
import com.amap.api.maps2d.model.LatLng;
import com.google.gson.annotations.SerializedName;
import com.wavenet.ding.qpps.utils.AppTool;
import com.wavenet.ding.qpps.utils.PositionUtil;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zoubeiwen on 2018/7/24.
 */

public class TasklistBean implements Serializable {
    @SerializedName(value = "Code",alternate = "code")
    public String Code;
    @SerializedName(value = "Msg",alternate = "msg")
    public String Msg;

    @SerializedName(value = "Data",alternate = "data")
    public List<ValueBean> value;

    public static class ValueBean implements Serializable {
        public boolean isSelect = false;
        @SerializedName("@odata.etag")
        public String _$OdataEtag159; // FIXME check this code
        @SerializedName(value = "T_IN_DATE",alternate = "tInDate")
        public String T_IN_DATE;
        @SerializedName(value = "S_COMPANY_MANGE",alternate = "sCompanyMange")
        public String S_COMPANY_MANGE;
        @SerializedName(value = "S_SJCZ_ID",alternate = "sSjczId")
        public String S_SJCZ_ID;
        @SerializedName(value = "S_MANGE_ID",alternate = "sMangeId")
        public String S_MANGE_ID;
        @SerializedName(value = "S_LOCAL",alternate = "sLocal")
        public String S_LOCAL;
        @SerializedName(value = "S_STATUS",alternate = "sStatus")
        public String S_STATUS;
        @SerializedName(value = "S_STATUS_CN",alternate = "sStatusCn")
        public String S_STATUS_CN;
        @SerializedName(value = "T_CREATE",alternate = "tCreate")
        public String T_CREATE;
        @SerializedName(value = "S_EMERGENCY",alternate = "sEmergency")
        public String S_EMERGENCY;
        @SerializedName(value = "S_EMERGENCY_CN",alternate = "sEmergencyCn")
        public String S_EMERGENCY_CN;
        @SerializedName(value = "S_SOURCE",alternate = "sSource")
        public String S_SOURCE;
        @SerializedName(value = "S_SOURCE_CN",alternate = "sSourceCn")
        public String S_SOURCE_CN;
        @SerializedName(value = "S_TYPE",alternate = "sType")
        public String S_TYPE;
        @SerializedName(value = "S_TYPE_CN",alternate = "sTypeCn")
        public String S_TYPE_CN;
        @SerializedName(value = "N_X",alternate = "nX")
        public String N_X;
        @SerializedName(value = "N_Y",alternate = "nY")
        public String N_Y;
        @SerializedName(value = "S_SJSB_ID",alternate = "sSjsbId")
        public String S_SJSB_ID;
        @SerializedName(value = "S_NAME",alternate = "sName")
        public String S_NAME;
        @SerializedName(value = "S_CATEGORY",alternate = "sCategory")
        public String S_CATEGORY;
        @SerializedName(value = "S_CATEGORY_CN",alternate = "sCategoryCn")
        public String S_CATEGORY_CN;
        @SerializedName(value = "T_TM")
        public String T_TM;
        @SerializedName(value = "S_MAN_FULLNAME")
        public String S_MAN_FULLNAME;
        @SerializedName(value = "S_REASON")
        public String S_REASON;
        @SerializedName(value = "S_REMARK")
        public String S_REMARK;
        @SerializedName(value = "S_DESC",alternate = "sDesc")
        public String S_DESC;
        @SerializedName(value = "IS_SJSB_FJ",alternate = "isSjsbFj")
        public String IS_SJSB_FJ;
        @SerializedName(value = "Dis")
        public double Dis=0;
public void setDis(LatLng lls){
    Gps ge = PositionUtil.gps84_To_Gcj02(Double.parseDouble(this.N_Y), Double.parseDouble(this.N_X));
    LatLng  lle=new LatLng(ge.getWgLat(),ge.getWgLon());
    double d= AMapUtils.calculateLineDistance(lls, lle);
//                                    double d1=AMapUtils.calculateLineDistance(new LatLng(31.1234,121.1234),new LatLng(31.22345,121.22345));
    this.Dis=  AppTool. getTwoDecimal(d);
}
        @Override
        public String toString() {
            return "ValueBean{" +
                    "isSelect=" + isSelect +
                    ", _$OdataEtag159='" + _$OdataEtag159 + '\'' +
                    ", T_IN_DATE='" + T_IN_DATE + '\'' +
                    ", S_COMPANY_MANGE='" + S_COMPANY_MANGE + '\'' +
                    ", S_SJCZ_ID='" + S_SJCZ_ID + '\'' +
                    ", S_MANGE_ID='" + S_MANGE_ID + '\'' +
                    ", S_LOCAL='" + S_LOCAL + '\'' +
                    ", S_STATUS='" + S_STATUS + '\'' +
                    ", T_CREATE='" + T_CREATE + '\'' +
                    ", S_EMERGENCY='" + S_EMERGENCY + '\'' +
                    ", S_SOURCE='" + S_SOURCE + '\'' +
                    ", S_TYPE='" + S_TYPE + '\'' +
                    ", N_X='" + N_X + '\'' +
                    ", N_Y='" + N_Y + '\'' +
                    ", S_SJSB_ID='" + S_SJSB_ID + '\'' +
                    ", S_NAME='" + S_NAME + '\'' +
                    ", S_CATEGORY='" + S_CATEGORY + '\'' +
                    '}';
        }
    }

}
//    中文名	英文字段
//    任务编号	S_TASK_ID
//    人员编号	S_NAME
//    创建时间	T_CREATE
//    信息来源	S_SOURCE
//    地址名称	S_LOCAL
//    紧急程度	S_EMERGENCY
//    关联上报事件编号	S_MANGE_ID_REL
//    问题小类	,S_TYPE
//    问题大类	S_CATEGORY
//    信息来源	S_SOURCE


//中文名	英文字段
//    任务编号	S_TASK_ID
//    人员编号	S_MAN
//    创建时间	T_CREATE
//    信息来源	S_SOURCE
//    地址名称	S_LOCAL
//    紧急程度	S_EMERGENCY
//    关联上报事件编号	S_MANGE_ID_REL
//    问题小类	,S_TYPE
//    事件坐标X	N_X
//    事件坐标Y	N_Y
//    问题大类	S_CATEGORY
//    任务创建人	S_COM
