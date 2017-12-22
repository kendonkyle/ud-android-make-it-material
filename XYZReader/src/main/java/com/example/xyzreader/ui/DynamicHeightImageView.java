package com.example.xyzreader.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;

public class DynamicHeightImageView extends AppCompatImageView {
    private float mAspectRatio = 1.5f;

    public DynamicHeightImageView(Context context) {
        super(context);
    }

    public DynamicHeightImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DynamicHeightImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setAspectRatio(float aspectRatio) {
        mAspectRatio = aspectRatio;
        requestLayout();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth = View.MeasureSpec.getSize(widthMeasureSpec);
//        mAspectRatio = 0.8f;
        int newMeasuredHeight = (int) (measuredWidth / mAspectRatio);
        setMeasuredDimension(measuredWidth, newMeasuredHeight);
        int newHeightMeasureSpec = (int) MeasureSpec.makeMeasureSpec(newMeasuredHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, newHeightMeasureSpec);
    }
}
