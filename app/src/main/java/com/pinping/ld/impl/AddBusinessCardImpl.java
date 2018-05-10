package com.pinping.ld.impl;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pinping.ld.mylibrary.service.AddBusinessCardInterface;


/**
 * Author by LD,  Date on 2018/3/26 ,14:27 .
 * Description：
 */
@Route(path = "/service/test1")
public class AddBusinessCardImpl implements AddBusinessCardInterface {
    @Override
    public void addBusinessCard(Context ctx) {
        ARouter.getInstance().build("/main/MainActivity").navigation();
        Toast.makeText(ctx,"跳转成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
