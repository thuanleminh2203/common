package com.venesa.common.Utils;

import org.springframework.http.HttpMethod;

public class ConstantsUtil {
    public static final String OK = "OK";
    public static final String UNAUTHORIZED = "UNAUTHORIZED";
    public static final String FORBIDDEN = "FORBIDDEN";

    public static final String HTTP_POST = "POST";
    public static final String HTTP_PUT = "PUT";
    public static final String HTTP_GET = "GET";
    public static final String HTTP_DELETE = "DELETE";

    public static final String ERR_UNAUTHORIZED = "Token is invalid or is expired. Please login again.";
    public static final String ERR_FORBIDDEM = "Access is denied.";

    public static final int SUCCSESS = 0;
    public static final int ERROR = 1;
    public static final String SUCCSESS_MESS = "Thành công";
    public static final String LOGGIN = "Tai khoan dang duoc dang nhap";
    public static final String ERR_BUSINESS = "err business";

    public static final String REGEX_NUMBER_PHONE = "^[0-9]{10}$";
    public static final String REGEX_EMAIL = "^(.+)@(.+)$";


    public static final int CALL_API_TO_MOBIO = 2;

    public static final int CALL_API_TO_CRM = 1;

    enum StatusContract {
        TREATTING(1), DONE(2), CAST_PAYMENT_REQUIRED(3), EXPIRED(4), TRANSFER(5), RETURNED(6), RESERVED(7);

        private int value;

        StatusContract(int value) {
            this.value = value;
        }
    }

    //action for message
    public static final HttpMethod CREATE = HttpMethod.POST;
    public static final HttpMethod UPDATE = HttpMethod.PUT;
    public static final HttpMethod DELETE = HttpMethod.DELETE;
    public static final HttpMethod GET = HttpMethod.GET;
    //type message
    public static final String CONTRACT = "contract";
    public static final String BOOKING = "booking";
    public static final String CUSTOMER = "customer";


}
