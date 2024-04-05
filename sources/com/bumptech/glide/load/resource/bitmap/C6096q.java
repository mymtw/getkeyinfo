package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
public final class C6096q {

    /* renamed from: g */
    public static final boolean f13103g = (Build.VERSION.SDK_INT < 29);

    /* renamed from: h */
    public static final boolean f13104h = true;

    /* renamed from: i */
    public static final File f13105i = new File("/proc/self/fd");

    /* renamed from: j */
    public static volatile C6096q f13106j;

    /* renamed from: k */
    public static volatile int f13107k = -1;

    /* renamed from: a */
    public final boolean f13108a;

    /* renamed from: b */
    public final int f13109b;

    /* renamed from: c */
    public final int f13110c;

    /* renamed from: d */
    public int f13111d;

    /* renamed from: e */
    public boolean f13112e = true;

    /* renamed from: f */
    public final AtomicBoolean f13113f = new AtomicBoolean(false);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if ((android.os.Build.VERSION.SDK_INT != 27 ? false : java.util.Arrays.asList(new java.lang.String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(android.os.Build.MODEL)) == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6096q() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f13112e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f13113f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L_0x0017
            goto L_0x005b
        L_0x0017:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x0045
            r2 = r1
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r2 != 0) goto L_0x00a1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L_0x0066
            r2 = r3
            goto L_0x009e
        L_0x0066:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L_0x009e:
            if (r2 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = r3
        L_0x00a2:
            r0.f13108a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x00b1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f13109b = r1
            r0.f13110c = r3
            goto L_0x00b9
        L_0x00b1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f13109b = r1
            r1 = 128(0x80, float:1.794E-43)
            r0.f13110c = r1
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C6096q.<init>():void");
    }

    /* renamed from: a */
    public static C6096q m12102a() {
        if (f13106j == null) {
            synchronized (C6096q.class) {
                if (f13106j == null) {
                    f13106j = new C6096q();
                }
            }
        }
        return f13106j;
    }

    /* renamed from: b */
    public final boolean mo17040b(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!this.f13108a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!f13104h) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else {
            if (f13103g && !this.f13113f.get()) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else if (z2) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else {
                int i3 = this.f13110c;
                if (i < i3) {
                    Log.isLoggable("HardwareConfig", 2);
                    return false;
                } else if (i2 < i3) {
                    Log.isLoggable("HardwareConfig", 2);
                    return false;
                } else {
                    synchronized (this) {
                        int i4 = this.f13111d + 1;
                        this.f13111d = i4;
                        if (i4 >= 50) {
                            this.f13111d = 0;
                            int length = f13105i.list().length;
                            long j = (long) (f13107k != -1 ? f13107k : this.f13109b);
                            boolean z4 = ((long) length) < j;
                            this.f13112e = z4;
                            if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
                            }
                        }
                        z3 = this.f13112e;
                    }
                    if (z3) {
                        return true;
                    }
                    Log.isLoggable("HardwareConfig", 2);
                    return false;
                }
            }
        }
    }
}
