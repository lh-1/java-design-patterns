package com.iluwatar.prototype.mail;

import lombok.Data;

import java.util.Date;

@Data
public class Mail implements Cloneable {

    private String sender;
    private String receiver;
    private String title;
    private String theme;
    private String content;
    private Date dateTime;
    //邮件的尾部，一般都是加上"XXX版权所有"等信息
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.title = advTemplate.getTitle();
        this.theme = advTemplate.getTheme();
        this.content = advTemplate.getContent();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
