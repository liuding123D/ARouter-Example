package com.pinping.ld.myapplication;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.pinping.ld.mylibrary.activity.TestActivity;
import com.pinping.ld.mylibrary.data.TestData;
import com.pinping.ld.mylibrary.service.AddBusinessCardInterface;
import com.pinping.ld.mylibrary.service.FinishPatrolListAct;

import java.util.HashMap;
import java.util.Map;

@Route(path = "/main/MainActivity")
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//    @Autowired
//    FinishPatrolListAct finishAct;
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            //跳转到TestActivity
            ARouter.getInstance().build("/act/TestActivity").navigation();
        }else if(v.getId()==R.id.button2){
            FinishPatrolListAct finishAct = (FinishPatrolListAct)ARouter.getInstance().build("/xxx/finishAct").navigation();
//            FinishPatrolListAct finishAct1 = ARouter.getInstance().navigation(FinishPatrolListAct.class);
            if(finishAct!=null){
                finishAct.finishPatrolListAct(MainActivity.this);
            }
        }else if(v.getId()==R.id.button3){
            ARouter.getInstance().build("/finishAct/TestFinishAct").navigation();
        }else if(v.getId()==R.id.button4){
            Bundle bundle =new Bundle();
            bundle.putString("bundleString","testBundle");
            Map<String, Object> map=new HashMap<String, Object>();
            map.put("testObjMap","testObjMap");
            ARouter.getInstance().build("/finishAct/TestFinishAct")
                    .withString("test","testString")
                    .withBundle("testBundleKey",bundle)
                    .withObject("testObj", map)
                    .navigation();
        }else if(v.getId()==R.id.button5){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
        Button img1 = (Button)findViewById(R.id.button);
        Button img2 = (Button)findViewById(R.id.button2);
        Button img3 = (Button)findViewById(R.id.button3);
        Button img4 = (Button)findViewById(R.id.button4);
        Button img5 = (Button)findViewById(R.id.button5);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);

    }
}
