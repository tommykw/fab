package com.github.tommykw.fabflex.lib;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by tommy on 2016/04/09.
 */
@CoordinatorLayout.DefaultBehavior(FabFlexContainer.FloatingLayoutBehavior.class)
public class FabFlexContainer extends RecyclerView implements GestureDetector.OnGestureListener {
    private GestureDetectorCompat gestureDetector;
    private boolean isAdded = false;

    public FabFlexContainer(Context context) {
        super(context);
    }

    public FabFlexContainer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FabFlexContainer(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        gestureDetector =new GestureDetectorCompat(context, this);
    }

    public void setFabFlexesAdded(boolean added) {
        isAdded = added;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return isAdded;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    public static class FloatingLayoutBehavior
            extends  CoordinatorLayout.Behavior<FabFlexContainer> {
    }
}
