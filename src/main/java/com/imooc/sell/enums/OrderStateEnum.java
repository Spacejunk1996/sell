package com.imooc.sell.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum OrderStateEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISH(1, "完结"),
    CANCEL(2, "已取消"),
    SUCCESS(3, "支付成功"),
    ;

    private Integer code;

    private String message;

    OrderStateEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
