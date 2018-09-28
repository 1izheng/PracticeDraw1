package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.WHITE);

        canvas.drawLine(80, 50, 80, 400, paint);
        canvas.drawLine(80, 400, 700, 400, paint);

        paint.setColor(Color.GREEN);
        paint.setTextSize(20);
        canvas.drawRect(100, 380, 200, 400, paint);
        canvas.drawText("Froyo", 100 + (100 - paint.measureText("Froyo")) / 2, 420, paint);

        canvas.drawRect(220, 300, 320, 400, paint);
        canvas.drawText("GB", 220 + (100 - paint.measureText("GB")) / 2, 420, paint);

        canvas.drawRect(340, 100, 440, 400, paint);
        canvas.drawText("ICS", 340 + (100 - paint.measureText("ICS")) / 2, 420, paint);

        canvas.drawRect(460, 50, 560, 400, paint);
        canvas.drawText("JB", 460 + (100 - paint.measureText("JB")) / 2, 420, paint);

        canvas.drawRect(580, 200, 680, 400, paint);
        canvas.drawText("KitKat", 580 + (100 - paint.measureText("KitKat")) / 2, 420, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("直方图",300,550,paint);


    }
}
