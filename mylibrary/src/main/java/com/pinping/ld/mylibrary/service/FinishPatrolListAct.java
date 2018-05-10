package com.pinping.ld.mylibrary.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Author by LD,  Date on 2018/3/23 ,13:03 .
 * Description：
 */

public interface FinishPatrolListAct extends IProvider {
    /**
     * 关闭OpenFileActivity
     */
    void finishPatrolListAct(Context ctx);
}
