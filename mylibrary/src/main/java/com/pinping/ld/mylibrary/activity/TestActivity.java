package com.pinping.ld.mylibrary.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pinping.ld.mylibrary.R;
import com.pinping.ld.mylibrary.service.AddBusinessCardInterface;
import com.pinping.ld.mylibrary.service.JumpToModuleActInterface;


/**
 * Author by LV,  Date on 2018/3/26 ,20:15 .
 * Description：
 */
@Route(path = "/act/TestActivity")
public class TestActivity extends Activity{
    private static TestActivity instance;

    public static TestActivity getInstance() {
        return instance;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        instance=this;
        LinearLayout ly1 = (LinearLayout)findViewById(R.id.layout1);
        LinearLayout ly2 = (LinearLayout)findViewById(R.id.layout2);
        LinearLayout ly3 = (LinearLayout)findViewById(R.id.layout3);
        ly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //service内部实现跳转功能
                AddBusinessCardInterface addBusinessCardInterface = (AddBusinessCardInterface)ARouter.getInstance().build("/service/test1").navigation();
                if(addBusinessCardInterface!=null){
                    addBusinessCardInterface.addBusinessCard(TestActivity.this);
                }
            }
        });
        ly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转回主页面
                ARouter.getInstance().build("/main/MainActivity").navigation();
            }
        });
        ly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //service的另外一种识别方式
                JumpToModuleActInterface jumpToModuleActInterface =  ARouter.getInstance().navigation(JumpToModuleActInterface.class);
                if(jumpToModuleActInterface!=null){
                    jumpToModuleActInterface.jump(instance);
                }
            }
        });
    }
}
