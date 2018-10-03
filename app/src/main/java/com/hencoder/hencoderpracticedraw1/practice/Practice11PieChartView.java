package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
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

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setTextSize(20);
        paint.setColor(Color.WHITE);

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


        paint.setColor(Color.WHITE);
        canvas.translate(290, 290);
        drawLine(canvas, paint, -180, 130, 200, "Lollipop");
        canvas.translate(10, 10);
        drawLine(canvas, paint, 0, -50, 200, "Marshmallow");
        drawLine(canvas, paint, 5, 8, 200, "Gingerbread");
        drawLine(canvas, paint, 16, 5, 200, "Ice Cream Sandwich");
        drawLine(canvas, paint, 22, 50, 200, "Jelly Bean");
        drawLine(canvas, paint, 77, 100, 200, "KitKat");

    }

    /**
     * 画线和文字
     *
     * @param canvas
     * @param paint
     * @param startAngle
     * @param sweepAngle
     * @param radius
     */
    private void drawLine(Canvas canvas, Paint paint, int startAngle, int sweepAngle, int radius, String text) {
        int stopX = (int) ((radius + 20) * Math.cos((startAngle + sweepAngle / 2) * Math.PI / 180));
        int stopY = (int) ((radius + 20) * Math.sin((startAngle + sweepAngle / 2) * Math.PI / 180));
        int startX = (int) (radius * Math.cos((startAngle + sweepAngle / 2) * Math.PI / 180));
        int startY = (int) (radius * Math.sin((startAngle + sweepAngle / 2) * Math.PI / 180));
        canvas.drawLine(startX, startY, stopX, stopY, paint);

        int endX;
        int endTextX;
        if (stopX > 0) {
            endX = 230;
            endTextX = endX;
        } else {
            endX = -200;
            endTextX = endX - getTextWidth(text, paint) -20;
        }

        //画横线
        canvas.drawLine(stopX, stopY, endX, stopY, paint);
        //画文字
        canvas.drawText(text, endTextX, stopY, paint);
    }


    private int getTextWidth(String text, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        int width = rect.width();
        return width;
    }
}
