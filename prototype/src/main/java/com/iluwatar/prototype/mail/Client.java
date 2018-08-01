package com.iluwatar.prototype.mail;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author msh11535
 */
public class Client {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        Mail mail = new Mail(new AdvTemplate());
        mail.setDateTime(new Date());
        mail.setReceiver(Client.getRandString(5));

        List<Mail> mailList = Lists.newArrayList();
        for (int i = 0; i < 50000; i++) {
            mail = (Mail) mail.clone();
            mail.setReceiver(Client.getRandString(6) + "@" + Client.getRandString(5) + ".com");
            mailList.add(mail);
        }
        Client.sendMail(mailList);

        System.err.println("exec time " + (System.currentTimeMillis() - startTime));
    }

    public static void sendMail(List<Mail> mailList) {
        for (Mail mail : mailList) {
            System.out.println(JSONObject.toJSONString(mail));
        }
    }

    //获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }

}
