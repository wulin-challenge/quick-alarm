package com.hust.hui.alarm.example.mock;

import com.hust.hui.alarm.core.execut.spi.LogExecute;

import java.util.List;

/**
 * Created by yihui on 2018/2/7.
 */
public class WeiXinExecute extends LogExecute {
    @Override
    public void sendMsg(List<String> users, String title, String msg) {
        super.sendMsg(users, title, msg);
    }
}
