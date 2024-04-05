package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.util.d */
public final class C16628d {

    /* renamed from: a */
    public long f36858a;

    /* renamed from: b */
    public long f36859b;

    /* renamed from: c */
    public TimeUnit f36860c;

    /* renamed from: com.google.firebase.perf.util.d$a */
    public static /* synthetic */ class C16629a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36861a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36861a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36861a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36861a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.util.C16628d.C16629a.<clinit>():void");
        }
    }

    public C16628d(long j, long j2, TimeUnit timeUnit) {
        this.f36858a = j;
        this.f36859b = j2;
        this.f36860c = timeUnit;
    }

    /* renamed from: a */
    public final double mo59370a() {
        int i = C16629a.f36861a[this.f36860c.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? ((double) this.f36858a) / ((double) this.f36860c.toSeconds(this.f36859b)) : (((double) this.f36858a) / ((double) this.f36859b)) * ((double) TimeUnit.SECONDS.toMillis(1)) : (((double) this.f36858a) / ((double) this.f36859b)) * ((double) TimeUnit.SECONDS.toMicros(1)) : (((double) this.f36858a) / ((double) this.f36859b)) * ((double) TimeUnit.SECONDS.toNanos(1));
    }
}
