package com.momo.fly;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by xueying on 2017/7/12.
 */

public class TestDraw extends View {
    Paint paint ;

    public TestDraw(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.parseColor("66666"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawColor(Color.BLACK);

    }
}
