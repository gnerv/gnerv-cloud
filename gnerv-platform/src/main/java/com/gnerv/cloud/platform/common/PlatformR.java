package com.gnerv.cloud.platform.common;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 统一返回数据类
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public class PlatformR extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    private Map<String,Object> data=new HashMap<String,Object>();
    public PlatformR() {
        put("code", 200);
        put("msg", "");
        put("data", data);
    }

    public static PlatformR error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static PlatformR error(String msg) {
        return error(500, msg);
    }

    public static PlatformR error(int code, String msg) {
        PlatformR fr = new PlatformR();
        fr.put("code", code);
        fr.put("msg", msg);
        return fr;
    }

    public static PlatformR ok(String msg) {
        PlatformR fr = new PlatformR();
        fr.put("msg", msg);
        return fr;
    }

    public static PlatformR ok(Map<String, Object> map) {
        PlatformR fr = new PlatformR();
        fr.putAll(map);
        return fr;
    }

    public static PlatformR ok() {
        return new PlatformR();
    }

    public PlatformR put(String key, Object value) {
        super.put(key, value);
        return this;
    }
    public PlatformR data(String key, Object value){
        data.put(key, value);
        return this;
    }
    public PlatformR data(Map<String,Object> map){
        data.putAll(map);
        return this;
    }

}
