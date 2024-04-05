package com.etsy.android.p327ui.core.review;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$getSwipeDownListener$1 */
public final class ListingVideoReviewFragment$getSwipeDownListener$1 implements View.OnTouchListener {
    private final GestureDetector gestureDetector;

    public ListingVideoReviewFragment$getSwipeDownListener$1(ListingVideoReviewFragment listingVideoReviewFragment) {
        this.gestureDetector = new GestureDetector(listingVideoReviewFragment.getActivity(), new C9709xceccdfa4(listingVideoReviewFragment));
    }

    public final GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C19383o.m32797g(view, "v");
        C19383o.m32797g(motionEvent, "event");
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
}
