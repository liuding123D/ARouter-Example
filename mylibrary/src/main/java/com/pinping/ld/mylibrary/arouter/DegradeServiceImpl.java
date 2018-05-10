package com.pinping.ld.mylibrary.arouter;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;

/**
 * Author by LV,  Date on 2018/3/26 ,20:47 .
 * Description：
 */

@Route(path = "/testDemo/DegradeService")
public class DegradeServiceImpl implements DegradeService {
    @Override
    public void onLost(Context context, Postcard postcard) {
        // do something.
        Log.e("DegradeService onLost","path="+postcard.getPath()+"________uri="+postcard.getUri());
    }

    @Override
    public void init(Context context) {

    }
}
