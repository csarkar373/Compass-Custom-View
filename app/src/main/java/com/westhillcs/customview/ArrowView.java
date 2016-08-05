package com.westhillcs.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Chandan on 5/31/2016.
 */
public class ArrowView extends View {

    private Bitmap arrow = BitmapFactory.decodeResource(this.getResources(), R.mipmap.arrow);
    private float rotationAngle;

    public ArrowView(Context context) {

        super(context);
        rotationAngle = (float)0.0;
    }

    public void setRotationAngle(float angle) {
        this.rotationAngle = angle;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();

        this.setRotationAngle((float)270);
        canvas.rotate(this.rotationAngle, canvas.getWidth()/2, canvas.getHeight()/2);
        canvas.drawBitmap(arrow, canvas.getWidth()/2, canvas.getHeight()/2, null);


        canvas.restore();
    }
}
