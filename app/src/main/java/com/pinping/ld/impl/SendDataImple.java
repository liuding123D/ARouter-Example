package com.pinping.ld.impl;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.pinping.ld.mylibrary.data.TestData;
import com.pinping.ld.mylibrary.service.SendDataInterface;

/**
 * Author by LD,  Date on 2018/3/28 ,16:52 .
 * Description：
 */
@Route(path = "/service/testData")
public class SendDataImple implements SendDataInterface {
    @Override
    public void testObjData(TestData data,Context ctx) {
        Toast.makeText(ctx,data.getTestData1(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
