package androidx.compose.p015ui.platform;

import android.view.ViewConfiguration;

/* renamed from: androidx.compose.ui.platform.z */
public final class C1891z implements C1843j1 {

    /* renamed from: a */
    public final ViewConfiguration f4170a;

    public C1891z(ViewConfiguration viewConfiguration) {
        this.f4170a = viewConfiguration;
    }

    /* renamed from: a */
    public final long mo6769a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    /* renamed from: b */
    public final void mo6770b() {
    }

    /* renamed from: c */
    public final long mo6771c() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    /* renamed from: e */
    public final float mo6773e() {
        return (float) this.f4170a.getScaledTouchSlop();
    }
}
