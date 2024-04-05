package com.etsy.android.uikit.view;

import android.app.Dialog;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.play.core.assetpacks.C15588c1;
import p357gf.C12794c;

public class TouchObservableDialog extends Dialog {
    private DialogFragment mDialogFragment;
    private boolean mDismissOnTouchOutside = true;
    private int mFragmentContainerResId;
    private Rect mTouchInterceptRect;

    public TouchObservableDialog(FragmentActivity fragmentActivity, DialogFragment dialogFragment, int i, int i2) {
        super(fragmentActivity, i);
        this.mDialogFragment = dialogFragment;
        this.mFragmentContainerResId = i2;
        setCancelable(false);
        setCanceledOnTouchOutside(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.verticalMargin = 0.0f;
        attributes.horizontalMargin = 0.0f;
    }

    private boolean didHitOutsideDialogWindow(MotionEvent motionEvent) {
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        return !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && motionEvent.getAction() == 0;
    }

    private boolean hideKeyboard() {
        return C15588c1.m25340p0(getCurrentFocus());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Rect rect;
        if (!didHitOutsideDialogWindow(motionEvent) || (rect = this.mTouchInterceptRect) == null || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        hideKeyboard();
        return true;
    }

    public void onBackPressed() {
        C12794c cVar;
        FragmentManager childFragmentManager = this.mDialogFragment.getChildFragmentManager();
        if (childFragmentManager.mo10355E() <= 0 || (cVar = (C12794c) childFragmentManager.mo10352B(this.mFragmentContainerResId)) == null || !cVar.handleBackPressed()) {
            this.mDialogFragment.dismiss();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!didHitOutsideDialogWindow(motionEvent) || !this.mDismissOnTouchOutside || hideKeyboard()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDialogFragment.dismiss();
        return true;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(false);
        this.mDismissOnTouchOutside = z;
    }

    public void setTouchInterceptRect(Rect rect) {
        this.mTouchInterceptRect = rect;
    }
}
