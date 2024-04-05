package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: androidx.core.view.f */
public final class C2300f {

    /* renamed from: a */
    public final C2301a f5556a;

    /* renamed from: androidx.core.view.f$a */
    public static class C2301a {

        /* renamed from: a */
        public final GestureDetector f5557a;

        public C2301a(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.f5557a = new GestureDetector(context, onGestureListener, (Handler) null);
        }
    }

    public C2300f(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f5556a = new C2301a(context, onGestureListener);
    }

    /* renamed from: a */
    public final boolean mo8896a(MotionEvent motionEvent) {
        return this.f5556a.f5557a.onTouchEvent(motionEvent);
    }
}
