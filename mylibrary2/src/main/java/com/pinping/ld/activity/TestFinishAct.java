package com.pinping.ld.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pinping.ld.R;
import com.pinping.ld.mylibrary.activity.TestActivity;
import com.pinping.ld.mylibrary.data.TestData;
import com.pinping.ld.mylibrary.service.AddBusinessCardInterface;
import com.pinping.ld.mylibrary.service.JumpToModuleActInterface;
import com.pinping.ld.mylibrary.service.SendDataInterface;

import java.util.Map;

/**
 * Author by LD,  Date on 2018/3/27 ,9:45 .
 * Description：
 */
@Route(path = "/finishAct/TestFinishAct")
public class TestFinishAct extends Activity{
    private static TestFinishAct instance;

    public static TestFinishAct getInstance() {
        return instance;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_finish_activity);
        instance=this;
        Intent intent = this.getIntent();
        if(intent.getStringExtra("test")!=null) {
            String str = intent.getStringExtra("test");
            Log.e("BundleString", str);
            Bundle bundle = intent.getBundleExtra("testBundleKey");
            Log.e("BundleString", bundle.getString("bundleString"));
            Map<String, Object> obj = intent.getParcelableExtra("testObj");
            Log.e("testObj", (String) obj.get("testObjMap"));
        }

        Toast.makeText(this,"跳转成功",Toast.LENGTH_SHORT).show();
        LinearLayout ly1 = (LinearLayout)findViewById(R.id.layout1);
        LinearLayout ly2 = (LinearLayout)findViewById(R.id.layout2);
        LinearLayout ly3 = (LinearLayout)findViewById(R.id.layout3);
        ly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddBusinessCardInterface addBusinessCardInterface = (AddBusinessCardInterface)ARouter.getInstance().build("/service/test1").navigation();
                if(addBusinessCardInterface!=null){
                    addBusinessCardInterface.addBusinessCard(instance);
                }
            }
        });
        ly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendDataInterface sendDataInterface = (SendDataInterface)ARouter.getInstance().build("/service/testData").navigation();
                if(sendDataInterface!=null){
                    TestData testData = new TestData();
                    testData.setTestData1("测试用数据");
                    sendDataInterface.testObjData(testData,instance);
                }
            }
        });
    }
}
