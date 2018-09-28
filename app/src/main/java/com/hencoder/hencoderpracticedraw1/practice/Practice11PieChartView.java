package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);



        paint.setTextSize(20);
        paint.setColor(Color.WHITE);

        canvas.drawText("Lollipop", 0, 50, paint);
        canvas.drawLine(getTextWidth("Lollipop", paint) + 20,
                50, 200, 50, paint);
        canvas.drawLine(200, 50, 290, 290, paint);

        canvas.drawText("KitKat", 20, 500, paint);
        canvas.drawLine(40 + getTextWidth("KitKat",paint),500,120 + getTextWidth("KitKat",paint),500,paint);
        canvas.drawLine(120 + getTextWidth("KitKat",paint),500,300,300,paint);


        canvas.drawLine(300, 300, 500, 200, paint);
        canvas.drawLine(500, 200, 550, 200, paint);
        canvas.drawText("Marshmallow", 560, 200, paint);

        canvas.drawLine(500, 310, 550, 310, paint);
        canvas.drawText("Froyo", 560, 310, paint);

        canvas.drawLine(300, 300, 530, 330, paint);
        canvas.drawLine(530,330,550,340,paint);
        canvas.drawLine(550,340,570,340,paint);
        canvas.drawText("Gingerbread", 580, 340, paint);


        canvas.drawLine(300, 300, 510, 370, paint);
        canvas.drawLine(510,370,530,370,paint);
        canvas.drawText("Ice Cream Sandwich", 540, 370, paint);

        canvas.drawLine(300, 300, 480, 470, paint);
        canvas.drawLine(480,470,500,470,paint);
        canvas.drawText("Jelly Bean", 510, 470, paint);


        RectF rectF = new RectF(100, 100, 500, 500);
        RectF rectF1 = new RectF(90, 90, 490, 490);

        paint.setColor(Color.RED);
        canvas.drawArc(rectF1, -180, 130, true, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, 0, -50, true, paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(rectF, 5, 8, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 16, 5, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 22, 50, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 77, 100, true, paint);

    }


    private int getTextHeight(String text, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        int height = rect.height();
        Log.d("##########--->", height + "===height");
        return height;
    }

    private int getTextWidth(String text, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        int width = rect.width();
        Log.d("##########--->", width + "===width");
        return width;
    }
}
