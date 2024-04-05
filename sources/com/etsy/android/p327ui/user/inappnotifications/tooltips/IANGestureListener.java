package com.etsy.android.p327ui.user.inappnotifications.tooltips;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p491ye.C13916b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.tooltips.IANGestureListener */
public final class IANGestureListener implements GestureDetector.OnGestureListener {
    public static final int $stable = 0;
    private final C19857l<C13916b, C19394m> eventHandler;
    private final String type;

    public IANGestureListener(C19857l<? super C13916b, C19394m> lVar, String str) {
        this.eventHandler = lVar;
        this.type = str;
    }

    public final C19857l<C13916b, C19394m> getEventHandler() {
        return this.eventHandler;
    }

    public final String getType() {
        return this.type;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C19383o.m32797g(motionEvent, "p0");
        C19383o.m32797g(motionEvent2, "p1");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "p0");
        C19857l<C13916b, C19394m> lVar = this.eventHandler;
        if (lVar != null) {
            lVar.invoke(new C13916b.C13917a(this.type, IANTooltipDismissType.TOUCH_OUTSIDE));
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C19383o.m32797g(motionEvent, "p0");
        C19383o.m32797g(motionEvent2, "p1");
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "p0");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "p0");
        C19857l<C13916b, C19394m> lVar = this.eventHandler;
        if (lVar == null) {
            return false;
        }
        lVar.invoke(new C13916b.C13917a(this.type, IANTooltipDismissType.TOUCH_OUTSIDE));
        return false;
    }
}
