package com.iluwatar.proxy.game;

import ch.qos.logback.core.util.DatePatternToRegexUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer() {
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println(this.name + " login at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + " kill");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " upgrade");
    }
}
