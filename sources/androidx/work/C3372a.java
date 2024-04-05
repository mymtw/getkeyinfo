package androidx.work;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.a */
public final class C3372a implements ThreadFactory {

    /* renamed from: b */
    public final AtomicInteger f7871b = new AtomicInteger(0);

    /* renamed from: c */
    public final /* synthetic */ boolean f7872c;

    public C3372a(boolean z) {
        this.f7872c = z;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder h = C0072d.m201h(this.f7872c ? "WM.task-" : "androidx.work-");
        h.append(this.f7871b.incrementAndGet());
        return new Thread(runnable, h.toString());
    }
}
