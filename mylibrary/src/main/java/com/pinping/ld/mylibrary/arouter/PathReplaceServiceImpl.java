package com.pinping.ld.mylibrary.arouter;

import android.content.Context;
import android.net.Uri;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;

/**
 * Author by LV,  Date on 2018/3/26 ,20:48 .
 * Description：
 */

@Route(path = "/testDemo/PathReplaceService")
public class PathReplaceServiceImpl implements PathReplaceService {
    /**
     * For normal path.
     *
     * @param path raw path
     */
    public String forString(String path) {
        return path;    // 按照一定的规则处理之后返回处理后的结果
    }

    /**
     * For uri type.
     *
     * @param uri raw uri
     */
    public Uri forUri(Uri uri) {
        return uri;    // 按照一定的规则处理之后返回处理后的结果
    }

    @Override
    public void init(Context context) {

    }
}
