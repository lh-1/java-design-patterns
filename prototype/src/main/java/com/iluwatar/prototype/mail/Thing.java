package com.iluwatar.prototype.mail;

import java.util.ArrayList;
import java.util.List;

public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    public void setValue(String value) {
        arrayList.add(value);
    }

    public List getValue() {
        return this.arrayList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Thing cloneThing = (Thing) super.clone();
        /**
         * 此处需注意，成员变量需深拷贝，否则新对象和旧对象会变量影响
         */
        cloneThing.arrayList = (ArrayList<String>) this.arrayList.clone();

        return cloneThing;
    }
}
