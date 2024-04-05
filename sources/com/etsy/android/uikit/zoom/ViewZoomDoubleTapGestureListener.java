package com.etsy.android.uikit.zoom;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.C19383o;

public final class ViewZoomDoubleTapGestureListener extends GestureDetector.SimpleOnGestureListener {
    public static final int $stable = 8;
    private final C12029a doubleTapListener;
    private final C12030b listener;
    private final View target;

    public ViewZoomDoubleTapGestureListener(View view, C12030b bVar, C12029a aVar) {
        C19383o.m32797g(view, "target");
        this.target = view;
        this.listener = bVar;
        this.doubleTapListener = aVar;
    }

    public final C12029a getDoubleTapListener() {
        return this.doubleTapListener;
    }

    public final C12030b getListener() {
        return this.listener;
    }

    public final View getTarget() {
        return this.target;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "e");
        C12029a aVar = this.doubleTapListener;
        if (aVar == null) {
            return true;
        }
        aVar.onDoubleTap();
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        this.target.performClick();
        C12030b bVar = this.listener;
        if (bVar == null) {
            return true;
        }
        bVar.mo38922a();
        return true;
    }
}
