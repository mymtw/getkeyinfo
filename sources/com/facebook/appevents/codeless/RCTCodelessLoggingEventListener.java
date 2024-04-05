package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.C12225d;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;

public final class RCTCodelessLoggingEventListener {

    /* renamed from: a */
    public static final /* synthetic */ int f27266a = 0;

    public static final class AutoLoggingOnTouchListener implements View.OnTouchListener {
        private final View.OnTouchListener existingOnTouchListener;
        private final WeakReference<View> hostView;
        private final EventBinding mapping;
        private final WeakReference<View> rootView;
        private boolean supportCodelessLogging = true;

        public AutoLoggingOnTouchListener(EventBinding eventBinding, View view, View view2) {
            C19383o.m32797g(eventBinding, "mapping");
            C19383o.m32797g(view, "rootView");
            C19383o.m32797g(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnTouchListener = C12225d.m20058g(view2);
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C19383o.m32797g(view, "view");
            C19383o.m32797g(motionEvent, "motionEvent");
            View view2 = this.rootView.get();
            View view3 = this.hostView.get();
            if (!(view2 == null || view3 == null || motionEvent.getAction() != 1)) {
                CodelessLoggingEventListener.m20039a(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }

        public final void setSupportCodelessLogging(boolean z) {
            this.supportCodelessLogging = z;
        }
    }

    static {
        new RCTCodelessLoggingEventListener();
    }
}
