package com.etsy.android.p327ui.core.review;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.C19383o;
import p381kc.C12991b;

/* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$getSwipeDownListener$1$gestureDetector$1 */
public final class C9709xceccdfa4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ListingVideoReviewFragment this$0;

    public C9709xceccdfa4(ListingVideoReviewFragment listingVideoReviewFragment) {
        this.this$0 = listingVideoReviewFragment;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C12991b listener;
        C19383o.m32797g(motionEvent, "event1");
        C19383o.m32797g(motionEvent2, "event2");
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f || y <= 0.0f || (listener = this.this$0.getListener()) == null) {
            return true;
        }
        listener.handleDismiss();
        return true;
    }
}
