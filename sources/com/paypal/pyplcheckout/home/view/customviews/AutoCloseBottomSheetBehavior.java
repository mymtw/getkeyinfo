package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.DebounceUtils;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19543e0;
import p753kq.C19846a;
import p753kq.C19857l;

public final class AutoCloseBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long HEIGHT_CHANGE_THROTTLE_INTERVAL = 100;
    private static final String TAG = "AutoCloseBottomSheetBehavior";
    /* access modifiers changed from: private */
    public BottomSheetSizeChangeListener listener;
    private final C19857l<Integer, C19394m> onHeightChange;
    /* access modifiers changed from: private */
    public C19846a<C19394m> onOutsidePaysheetClick;

    public interface BottomSheetSizeChangeListener {
        void onBottomSheetHeightChanged(int i, int i2);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BottomSheetBehavior from$default(Companion companion, View view, C19846a aVar, BottomSheetSizeChangeListener bottomSheetSizeChangeListener, int i, Object obj) {
            if ((i & 4) != 0) {
                bottomSheetSizeChangeListener = null;
            }
            return companion.from(view, aVar, bottomSheetSizeChangeListener);
        }

        public final <V extends View> BottomSheetBehavior<V> from(V v, C19846a<C19394m> aVar, BottomSheetSizeChangeListener bottomSheetSizeChangeListener) {
            C19383o.m32797g(v, "view");
            C19383o.m32797g(aVar, "onOutsidePaysheetClick");
            BottomSheetBehavior<V> from = BottomSheetBehavior.from(v);
            AutoCloseBottomSheetBehavior autoCloseBottomSheetBehavior = from instanceof AutoCloseBottomSheetBehavior ? (AutoCloseBottomSheetBehavior) from : null;
            if (autoCloseBottomSheetBehavior != null) {
                autoCloseBottomSheetBehavior.listener = bottomSheetSizeChangeListener;
                autoCloseBottomSheetBehavior.onOutsidePaysheetClick = aVar;
            }
            C19383o.m32796f(from, "from(view).also { b ->\n …k\n            }\n        }");
            return from;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoCloseBottomSheetBehavior(Context context) {
        this(context, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoCloseBottomSheetBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int aggregateHeights(ViewGroup viewGroup) {
        C19439n p1 = SequencesKt___SequencesKt.m32985p1(C19543e0.m33298O(viewGroup), AutoCloseBottomSheetBehavior$aggregateHeights$1.INSTANCE);
        Iterator<T> it = p1.f43362a.iterator();
        if (it.hasNext()) {
            R invoke = p1.f43363b.invoke(it.next());
            while (it.hasNext()) {
                invoke = Integer.valueOf(((Number) invoke).intValue() + ((Number) p1.f43363b.invoke(it.next())).intValue());
            }
            return ((Number) invoke).intValue();
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    private final boolean isOutsideTopBannerView(MotionEvent motionEvent, Rect rect) {
        return motionEvent.getRawY() < ((float) rect.top) || motionEvent.getRawY() > ((float) rect.bottom);
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v2 = v;
        MotionEvent motionEvent2 = motionEvent;
        C19383o.m32797g(coordinatorLayout2, ResponseConstants.PARENT);
        C19383o.m32797g(v2, "child");
        C19383o.m32797g(motionEvent2, "event");
        if (motionEvent.getAction() == 0 && (getState() == 3 || getState() == 4)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            v2.getGlobalVisibleRect(rect);
            View findViewById = v2.findViewById(C17165R.C17167id.header_container);
            View findViewById2 = coordinatorLayout2.findViewById(C17165R.C17167id.top_banner_container);
            if (findViewById2 != null) {
                findViewById2.getGlobalVisibleRect(rect3);
            }
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(rect2);
            } else {
                rect.top += 79;
            }
            if (((int) motionEvent.getRawY()) < rect2.top && isOutsideTopBannerView(motionEvent2, rect3)) {
                C19846a<C19394m> aVar = this.onOutsidePaysheetClick;
                if (aVar != null) {
                    aVar.invoke();
                }
                PLog.decision$default(PEnums.TransitionName.CLICKED_OUTSIDE_DIALOG, PEnums.Outcome.SHOWN, PEnums.EventCode.E144, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
                return true;
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        C19383o.m32797g(coordinatorLayout, ResponseConstants.PARENT);
        C19383o.m32797g(v, "child");
        ViewGroup viewGroup = v instanceof ViewGroup ? (ViewGroup) v : null;
        if (viewGroup != null) {
            this.onHeightChange.invoke(Integer.valueOf(aggregateHeights(viewGroup)));
        }
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoCloseBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.onHeightChange = DebounceUtils.throttleLatestUnique$default(DebounceUtils.INSTANCE, HEIGHT_CHANGE_THROTTLE_INTERVAL, (C19525d0) null, new AutoCloseBottomSheetBehavior$onHeightChange$1(this), 2, (Object) null);
    }
}
