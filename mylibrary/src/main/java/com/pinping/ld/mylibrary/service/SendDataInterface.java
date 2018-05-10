package com.pinping.ld.mylibrary.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.pinping.ld.mylibrary.data.TestData;

/**
 * Author by LV,  Date on 2018/3/28 ,16:47 .
 * Description：
 */

public interface SendDataInterface extends IProvider {
    void testObjData(TestData data,Context ctx);
}
