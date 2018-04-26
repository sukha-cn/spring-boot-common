package com.local.spc.spcbase.common.serialize;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class ToString implements Serializable {
    private static final long serialVersionUID = 7586770962431513080L;

    public String toString() {
        return JSON.toJSONString(this);
    }
}
