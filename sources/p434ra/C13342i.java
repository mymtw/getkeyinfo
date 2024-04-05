package p434ra;

import android.app.NotificationManager;
import kotlin.jvm.internal.C19383o;
import p250u0.C8100m;

/* renamed from: ra.i */
public final class C13342i implements C13341h {

    /* renamed from: a */
    public final NotificationManager f29270a;

    public C13342i(NotificationManager notificationManager) {
        C19383o.m32797g(notificationManager, "notificationManager");
        this.f29270a = notificationManager;
    }

    /* renamed from: a */
    public final void mo46036a() {
        this.f29270a.cancelAll();
    }

    /* renamed from: b */
    public final void mo46037b(int i, C8100m mVar) {
        this.f29270a.notify(i, mVar.mo20689b());
    }

    /* renamed from: c */
    public final void mo46038c(int i) {
        this.f29270a.cancel(i);
    }
}
