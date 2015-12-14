package com.example.yaredbezu.touchassigmentl9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yared.bezu on 12/8/2015.
 */
public class MyTouchEvent extends View{
    private Paint paint = new Paint();

    float x1,x2,y1,y2;
    private int score = 0;


    public MyTouchEvent(Context context) {
        super(context);
        // TODO Auto-generated constructor stub

        paint.setColor(Color.rgb(255, 0, 0));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub

       canvas.drawLine(x1, y1, x2, y2, paint);

        canvas.drawText("Touch and Move to Draw Line", 80, 50, paint);
    }
    public int getScore()
    {
        return score;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        switch (event.getAction())
        {

               case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                return true;

               case MotionEvent.ACTION_MOVE:
                x2 = event.getX();
                y2 = event.getY();
                break;

            default:
                return false;
        }
        invalidate();

        return false;

    }
}
