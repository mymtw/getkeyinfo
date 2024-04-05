package com.amplitude.eventexplorer;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class EventExplorerTouchHandler implements View.OnTouchListener {
    private float initialTouchX;
    private float initialTouchY;
    private int initialX;
    private int initialY;
    private String instanceName;
    private WindowManager.LayoutParams layoutParams;
    private WindowManager windowManager;

    public EventExplorerTouchHandler(WindowManager windowManager2, WindowManager.LayoutParams layoutParams2, String str) {
        this.layoutParams = layoutParams2;
        this.windowManager = windowManager2;
        this.instanceName = str;
    }

    private boolean isAClick(float f, float f2, float f3, float f4) {
        return Math.abs(f - f2) <= 5.0f && Math.abs(f3 - f4) <= 5.0f;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            WindowManager.LayoutParams layoutParams2 = this.layoutParams;
            this.initialY = layoutParams2.y;
            this.initialX = layoutParams2.x;
            this.initialTouchX = motionEvent.getRawX();
            this.initialTouchY = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            if (isAClick(this.initialTouchX, motionEvent.getRawX(), this.initialTouchY, motionEvent.getRawY())) {
                view.performClick();
                Intent intent = new Intent(view.getContext(), EventExplorerInfoActivity.class);
                intent.putExtra("instanceName", this.instanceName);
                view.getContext().startActivity(intent);
            }
            return true;
        } else if (action != 2) {
            return false;
        } else {
            this.layoutParams.y = this.initialY + ((int) (motionEvent.getRawY() - this.initialTouchY));
            this.layoutParams.x = this.initialX + ((int) (motionEvent.getRawX() - this.initialTouchX));
            this.windowManager.updateViewLayout(view, this.layoutParams);
            return true;
        }
    }
}
