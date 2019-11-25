package com.wavenet.ding.qpps.http;

import java.util.Map;

/**
 * Created by Administrator on 2017/10/19.
 */

public interface HasParamsable {
    OkHttpRequestBuilder params(Map<String, String> params);
    OkHttpRequestBuilder addParams(String key, String val);
}
