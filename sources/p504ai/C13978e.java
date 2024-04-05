package p504ai;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import p513bj.C14050c;

/* renamed from: ai.e */
public final class C13978e {

    /* renamed from: h */
    public static final ArrayDeque<C13979a> f30714h = new ArrayDeque<>();

    /* renamed from: i */
    public static final Object f30715i = new Object();

    /* renamed from: a */
    public final MediaCodec f30716a;

    /* renamed from: b */
    public final HandlerThread f30717b;

    /* renamed from: c */
    public C13977d f30718c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f30719d = new AtomicReference<>();

    /* renamed from: e */
    public final C14050c f30720e;

    /* renamed from: f */
    public final boolean f30721f;

    /* renamed from: g */
    public boolean f30722g;

    /* renamed from: ai.e$a */
    public static class C13979a {

        /* renamed from: a */
        public int f30723a;

        /* renamed from: b */
        public int f30724b;

        /* renamed from: c */
        public int f30725c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f30726d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f30727e;

        /* renamed from: f */
        public int f30728f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if ((r4.contains("samsung") || r4.contains("motorola")) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13978e(android.media.MediaCodec r2, android.os.HandlerThread r3, boolean r4) {
        /*
            r1 = this;
            bj.c r0 = new bj.c
            r0.<init>()
            r1.<init>()
            r1.f30716a = r2
            r1.f30717b = r3
            r1.f30720e = r0
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.f30719d = r2
            r2 = 0
            r3 = 1
            if (r4 != 0) goto L_0x0035
            java.lang.String r4 = p513bj.C14049b0.f30915c
            java.lang.String r4 = p001a0.C0005b.m56q0(r4)
            java.lang.String r0 = "samsung"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "motorola"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = r2
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            if (r4 == 0) goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r1.f30721f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p504ai.C13978e.<init>(android.media.MediaCodec, android.os.HandlerThread, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46789a() {
        /*
            r3 = this;
            boolean r0 = r3.f30722g
            if (r0 == 0) goto L_0x0049
            ai.d r0 = r3.f30718c     // Catch:{ InterruptedException -> 0x003b }
            int r1 = p513bj.C14049b0.f30913a     // Catch:{ InterruptedException -> 0x003b }
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch:{ InterruptedException -> 0x003b }
            bj.c r0 = r3.f30720e     // Catch:{ InterruptedException -> 0x003b }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x003b }
            r2 = 0
            r0.f30926a = r2     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            ai.d r0 = r3.f30718c     // Catch:{ InterruptedException -> 0x003b }
            r2 = 2
            android.os.Message r0 = r0.obtainMessage(r2)     // Catch:{ InterruptedException -> 0x003b }
            r0.sendToTarget()     // Catch:{ InterruptedException -> 0x003b }
            bj.c r0 = r3.f30720e     // Catch:{ InterruptedException -> 0x003b }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x003b }
        L_0x0020:
            boolean r2 = r0.f30926a     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0028
            r0.wait()     // Catch:{ all -> 0x0035 }
            goto L_0x0020
        L_0x0028:
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r3.f30719d     // Catch:{ InterruptedException -> 0x003b }
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch:{ InterruptedException -> 0x003b }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ InterruptedException -> 0x003b }
            if (r0 != 0) goto L_0x0034
            goto L_0x0049
        L_0x0034:
            throw r0     // Catch:{ InterruptedException -> 0x003b }
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            throw r1     // Catch:{ InterruptedException -> 0x003b }
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            throw r1     // Catch:{ InterruptedException -> 0x003b }
        L_0x003b:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p504ai.C13978e.mo46789a():void");
    }
}
