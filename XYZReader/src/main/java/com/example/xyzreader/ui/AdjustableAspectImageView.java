package com.example.xyzreader.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by Kendon Kyle on 2017/11/17 for the AppBarImageBackground.
 * The one extended from NetworkImage doesn't seem to work in the same way as normal imageview
 */

public class AdjustableAspectImageView extends AppCompatImageView {
    private float mAspectRatio = 2.5f;

    public AdjustableAspectImageView(Context c) {
        super(c); //:)
    }

    public AdjustableAspectImageView(Context c, AttributeSet attr) {
        super(c, attr);
    }

    public AdjustableAspectImageView(Context c, AttributeSet attr, int defStyle) {
        super(c, attr, defStyle);
    }

    public void setAspectRatio(float aspectRatio) {
        mAspectRatio = aspectRatio;
        requestLayout();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth = MeasureSpec.getSize(widthMeasureSpec);
//        mAspectRatio = 0.8f;
        int newMeasuredHeight = (int) (measuredWidth / mAspectRatio);
        setMeasuredDimension(measuredWidth, newMeasuredHeight);
        int newHeightMeasureSpec = (int) MeasureSpec.makeMeasureSpec(newMeasuredHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, newHeightMeasureSpec);
    }
}
