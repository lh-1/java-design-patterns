package com.iluwatar.proxy.game;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer("zhangsan");

        InvocationHandler handler = new GamePlayIH(gamePlayer);

        System.err.println("start at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, handler);
//        DynamicProxy<IGamePlayer> dynamicProxy = new DynamicProxy<IGamePlayer>();
        IGamePlayer proxy = DynamicProxy.newProxyInstance(GamePlayer.class.getClassLoader(), new Class[]{IGamePlayer.class}, handler);

        proxy.login();

        proxy.killBoss();

        proxy.upgrade();

        System.err.println("结束时间是：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

    }

}
