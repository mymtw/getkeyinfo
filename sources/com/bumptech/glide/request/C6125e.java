package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p003a2.C0023f;
import p010a9.C0048b;
import p036c5.C4426l;
import p302z4.C8447h;
import p302z4.C8448i;

/* renamed from: com.bumptech.glide.request.e */
public final class C6125e<R> implements Future, C8448i, C6127f<R> {

    /* renamed from: b */
    public final int f13227b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final int f13228c = Integer.MIN_VALUE;

    /* renamed from: d */
    public R f13229d;

    /* renamed from: e */
    public C6124d f13230e;

    /* renamed from: f */
    public boolean f13231f;

    /* renamed from: g */
    public boolean f13232g;

    /* renamed from: h */
    public boolean f13233h;

    /* renamed from: i */
    public GlideException f13234i;

    /* renamed from: com.bumptech.glide.request.e$a */
    public static class C6126a {
    }

    static {
        new C6126a();
    }

    /* renamed from: a */
    public final void mo16749a(C8447h hVar) {
        hVar.mo17122b(this.f13227b, this.f13228c);
    }

    /* renamed from: b */
    public final synchronized void mo16750b(Object obj) {
    }

    /* renamed from: c */
    public final void mo16751c(Drawable drawable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            return r3
        L_0x000a:
            r0 = 1
            r2.f13231f = r0     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            r1 = 0
            if (r3 == 0) goto L_0x0018
            com.bumptech.glide.request.d r3 = r2.f13230e     // Catch:{ all -> 0x001f }
            r2.f13230e = r1     // Catch:{ all -> 0x001f }
            r1 = r3
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001e
            r1.clear()
        L_0x001e:
            return r0
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6125e.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public final void mo16752d(Drawable drawable) {
    }

    /* renamed from: f */
    public final synchronized boolean mo17169f(GlideException glideException, Object obj, C8448i iVar) {
        this.f13233h = true;
        this.f13234i = glideException;
        notifyAll();
        return false;
    }

    /* renamed from: g */
    public final synchronized void mo16753g(C6124d dVar) {
        this.f13230e = dVar;
    }

    public final R get() throws InterruptedException, ExecutionException {
        try {
            return mo17175k((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final synchronized C6124d getRequest() {
        return this.f13230e;
    }

    /* renamed from: h */
    public final synchronized boolean mo17172h(Object obj, Object obj2, C8448i iVar, DataSource dataSource) {
        this.f13232g = true;
        this.f13229d = obj;
        notifyAll();
        return false;
    }

    /* renamed from: i */
    public final synchronized void mo16755i(Drawable drawable) {
    }

    public final synchronized boolean isCancelled() {
        return this.f13231f;
    }

    public final synchronized boolean isDone() {
        return this.f13231f || this.f13232g || this.f13233h;
    }

    /* renamed from: j */
    public final void mo16756j(C8447h hVar) {
    }

    /* renamed from: k */
    public final synchronized R mo17175k(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            if (!C4426l.m10134h()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f13231f) {
            throw new CancellationException();
        } else if (this.f13233h) {
            throw new ExecutionException(this.f13234i);
        } else if (this.f13232g) {
            return this.f13229d;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f13233h) {
                throw new ExecutionException(this.f13234i);
            } else if (this.f13231f) {
                throw new CancellationException();
            } else if (this.f13232g) {
                return this.f13229d;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final String toString() {
        C6124d dVar;
        String str;
        String k = C0023f.m110k(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            dVar = null;
            if (this.f13231f) {
                str = "CANCELLED";
            } else if (this.f13233h) {
                str = "FAILURE";
            } else if (this.f13232g) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                dVar = this.f13230e;
            }
        }
        if (dVar == null) {
            return C0048b.m163a(k, str, "]");
        }
        return k + str + ", request=[" + dVar + "]]";
    }

    public final R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo17175k(Long.valueOf(timeUnit.toMillis(j)));
    }
}
