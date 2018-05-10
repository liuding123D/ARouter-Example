package com.pinping.ld.mylibrary;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.pinping.ld.activity.TestFinishAct;
import com.pinping.ld.mylibrary.activity.TestActivity;
import com.pinping.ld.mylibrary.service.FinishPatrolListAct;

/**
 * Author by LD,  Date on 2018/3/27 ,9:43 .
 * Description：
 */
@Route(path = "/xxx/finishAct")
public class FinishActImpl implements FinishPatrolListAct {
    @Override
    public void finishPatrolListAct(Context ctx) {
        if(TestActivity.getInstance()!=null){
            TestActivity.getInstance().finish();
            Toast.makeText(ctx,"成功关闭TestFinishAct页面",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(ctx,"栈中不存在TestFinishAct",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void init(Context context) {

    }
}
