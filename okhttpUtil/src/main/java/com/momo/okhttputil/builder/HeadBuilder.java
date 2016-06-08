package com.momo.okhttputil.builder;

import com.momo.okhttputil.OkHttpUtils;
import com.momo.okhttputil.request.OtherRequest;
import com.momo.okhttputil.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
