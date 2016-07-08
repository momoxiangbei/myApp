package com.momo.fly.viewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.momo.fly.R;

/**
 * Created by Administrator on 2016/7/8.
 */
public class ViewPagerActivity extends Activity
{
    private ViewPager mViewPager;
    private int[] mImgIds;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        mImgIds = new int[] { R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d };

        mViewPager = (ViewPager) findViewById(R.id.id_viewPager);
//        mViewPager.setPageTransformer(true, new DepthPageTransformer());
        mViewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        mViewPager.setAdapter(new PagerAdapter()
        {

            @Override
            public boolean isViewFromObject(View arg0, Object arg1)
            {
                return arg0 == arg1;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object)
            {
                container.removeView((View) object);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position)
            {
                ImageView imageView = new ImageView(ViewPagerActivity.this);
                imageView.setImageResource(mImgIds[position]);
                imageView.setScaleType(ScaleType.CENTER_CROP);
                container.addView(imageView);
//                mViewPager.setObjectForPosition(imageView, position);
                return imageView;
            }

            @Override
            public int getCount()
            {
                return mImgIds.length;
            }
        });

    }

}

