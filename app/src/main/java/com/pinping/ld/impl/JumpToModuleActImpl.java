package com.pinping.ld.impl;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pinping.ld.mylibrary.service.JumpToModuleActInterface;

/**
 * Author by LV,  Date on 2018/3/27 ,13:50 .
 * Description：
 */
@Route(path = "/jumpModule/JumpToTestFinishAct")
public class JumpToModuleActImpl implements JumpToModuleActInterface {
    @Override
    public void jump(Context ctx) {
        ARouter.getInstance().build("/finishAct/TestFinishAct").navigation();
        Toast.makeText(ctx,"跳转成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
