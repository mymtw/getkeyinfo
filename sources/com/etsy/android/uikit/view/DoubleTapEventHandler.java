package com.etsy.android.uikit.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.view.draggable.C11948c;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public final class DoubleTapEventHandler extends GestureDetector.SimpleOnGestureListener {
    private final C11948c doubleTapListener;
    private final C19285c gestureDetector$delegate;

    public DoubleTapEventHandler(Context context, C11948c cVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.doubleTapListener = cVar;
        this.gestureDetector$delegate = C19350d.m32677b(new DoubleTapEventHandler$gestureDetector$2(context, this));
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.gestureDetector$delegate.getValue();
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        C11948c cVar = this.doubleTapListener;
        if (cVar == null) {
            return false;
        }
        cVar.onDoubleTap();
        return false;
    }

    public final boolean updateWith(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        return getGestureDetector().onTouchEvent(motionEvent);
    }
}
