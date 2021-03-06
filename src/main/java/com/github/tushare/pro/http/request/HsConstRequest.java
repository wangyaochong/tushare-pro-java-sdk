package com.github.tushare.pro.http.request;

import com.github.tushare.pro.TusharePro;
import com.github.tushare.pro.common.KeyValue;
import com.github.tushare.pro.http.BaseRequestParam;
import com.github.tushare.pro.http.Request;

/**
 * 沪深股通成份股
 */
public final class HsConstRequest extends Request<HsConstRequest> {

    public HsConstRequest() {
        this(null);
    }

    public HsConstRequest(TusharePro tusharePro) {
        super(tusharePro);
        setApi_name("hs_const");
    }

    public static class Fields {
        public static final String ts_code = "ts_code";  // TS代码
        public static final String hs_type = "hs_type";  // 沪深港通类型SH沪SZ深
        public static final String in_date = "in_date";  // 纳入日期
        public static final String out_date = "out_date";  // 剔除日期
        public static final String is_new = "is_new";  // 是否最新 1是0否
    }

    public static class Params {

        public static final hs_type hs_type = new hs_type();  // 类型SH沪股通SZ深股通
        public static class hs_type extends BaseRequestParam {
            {key = "hs_type";}
        }

        public static final is_new is_new = new is_new();  // 是否最新 1 是 0 否 (默认1)
        public static class is_new extends BaseRequestParam {
            {key = "is_new";}
        }
    }

}