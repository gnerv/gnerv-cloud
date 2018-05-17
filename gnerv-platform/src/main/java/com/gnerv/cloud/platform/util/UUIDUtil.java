package com.gnerv.cloud.platform.util;

import java.util.UUID;
/**
 * <p>
 * UUID 工具类
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
public class UUIDUtil {

    /**
     * 去中横线 小写
     * @return uuid
     */
    public static String getLowerUUID(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

}
