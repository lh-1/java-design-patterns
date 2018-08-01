package com.iluwatar.prototype.mail;

import com.alibaba.fastjson.JSONObject;

public class ThingClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Thing thing = new Thing();
        thing.setValue("zhangsan");
        System.err.println(JSONObject.toJSONString(thing.getValue()));

        Thing cloneThing = (Thing) thing.clone();
        cloneThing.setValue("lisi");
        System.err.println(JSONObject.toJSONString(cloneThing.getValue()));
        System.err.println(JSONObject.toJSONString(thing.getValue()));
    }
}
