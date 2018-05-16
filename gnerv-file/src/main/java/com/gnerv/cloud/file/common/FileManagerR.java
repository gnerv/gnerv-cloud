package com.gnerv.cloud.file.common;

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
public class FileManagerR extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    private Map<String,Object> data=new HashMap<String,Object>();
    public FileManagerR() {
        put("code", 200);
        put("msg", "");
        put("data", data);
    }

    public static FileManagerR error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static FileManagerR error(String msg) {
        return error(500, msg);
    }

    public static FileManagerR error(int code, String msg) {
        FileManagerR fr = new FileManagerR();
        fr.put("code", code);
        fr.put("msg", msg);
        return fr;
    }

    public static FileManagerR ok(String msg) {
        FileManagerR fr = new FileManagerR();
        fr.put("msg", msg);
        return fr;
    }

    public static FileManagerR ok(Map<String, Object> map) {
        FileManagerR fr = new FileManagerR();
        fr.putAll(map);
        return fr;
    }

    public static FileManagerR ok() {
        return new FileManagerR();
    }

    public FileManagerR put(String key, Object value) {
        super.put(key, value);
        return this;
    }
    public FileManagerR data(String key, Object value){
        data.put(key, value);
        return this;
    }
    public FileManagerR data(Map<String,Object> map){
        data.putAll(map);
        return this;
    }

}
