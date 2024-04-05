package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.room.C3219b;
import java.io.IOException;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17909f;
import p595ji.C17994f;

public final class ExoPlaybackException extends Exception {
    public static final C17909f<ExoPlaybackException> CREATOR = new C3219b(4);
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    private final Throwable cause;
    public final boolean isRecoverable;
    public final C17994f mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    public ExoPlaybackException(int i, Throwable th) {
        this(i, th, (String) null, (String) null, -1, (Format) null, 4, false);
    }

    /* renamed from: a */
    public static String m21966a(int i) {
        return Integer.toString(i, 36);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, (Throwable) null, str, (String) null, -1, (Format) null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Exception exc) {
        return new ExoPlaybackException(1, exc, (String) null, (String) null, -1, (Format) null, 4, false);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    public ExoPlaybackException copyWithMediaPeriodId(C17994f fVar) {
        String message = getMessage();
        int i = C14049b0.f30913a;
        return new ExoPlaybackException(message, this.cause, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, fVar, this.timestampMs, this.isRecoverable);
    }

    public Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        C14075p.m21694f(z);
        Throwable th = this.cause;
        th.getClass();
        return (Exception) th;
    }

    public IOException getSourceException() {
        C14075p.m21694f(this.type == 0);
        Throwable th = this.cause;
        th.getClass();
        return (IOException) th;
    }

    public RuntimeException getUnexpectedException() {
        C14075p.m21694f(this.type == 2);
        Throwable th = this.cause;
        th.getClass();
        return (RuntimeException) th;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(m21966a(0), getMessage());
        bundle.putInt(m21966a(1), this.type);
        bundle.putString(m21966a(2), this.rendererName);
        bundle.putInt(m21966a(3), this.rendererIndex);
        bundle.putParcelable(m21966a(4), this.rendererFormat);
        bundle.putInt(m21966a(5), this.rendererFormatSupport);
        bundle.putLong(m21966a(6), this.timestampMs);
        bundle.putBoolean(m21966a(7), this.isRecoverable);
        if (this.cause != null) {
            bundle.putString(m21966a(8), this.cause.getClass().getName());
            bundle.putString(m21966a(9), this.cause.getMessage());
        }
        return bundle;
    }

    public ExoPlaybackException(String str, Throwable th, int i, String str2, int i2, Format format, int i3, C17994f fVar, long j, boolean z) {
        super(str, th);
        boolean z2 = true;
        if (z && i != 1) {
            z2 = false;
        }
        C14075p.m21691c(z2);
        this.type = i;
        this.cause = th;
        this.rendererName = str2;
        this.rendererIndex = i2;
        this.rendererFormat = format;
        this.rendererFormatSupport = i3;
        this.mediaPeriodId = fVar;
        this.timestampMs = j;
        this.isRecoverable = z;
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2) {
        return createForRenderer(th, str, i, format, i2, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2, boolean z) {
        if (format == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th, (String) null, str, i, format, i2, z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r13, java.lang.Throwable r14, java.lang.String r15, java.lang.String r16, int r17, com.google.android.exoplayer2.Format r18, int r19, boolean r20) {
        /*
            r12 = this;
            r3 = r13
            r0 = r15
            r4 = r16
            r7 = r19
            r1 = 2
            if (r3 == 0) goto L_0x006a
            r2 = 3
            r5 = 1
            if (r3 == r5) goto L_0x0017
            if (r3 == r2) goto L_0x0012
            java.lang.String r2 = "Unexpected runtime error"
            goto L_0x0014
        L_0x0012:
            java.lang.String r2 = "Remote error"
        L_0x0014:
            r5 = r17
            goto L_0x006e
        L_0x0017:
            java.lang.String r6 = java.lang.String.valueOf(r18)
            java.util.UUID r8 = p594jh.C17912g.f38897a
            if (r7 == 0) goto L_0x003a
            if (r7 == r5) goto L_0x0037
            if (r7 == r1) goto L_0x0034
            if (r7 == r2) goto L_0x0031
            r2 = 4
            if (r7 != r2) goto L_0x002b
            java.lang.String r2 = "YES"
            goto L_0x003c
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0031:
            java.lang.String r2 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x003c
        L_0x0034:
            java.lang.String r2 = "NO_UNSUPPORTED_DRM"
            goto L_0x003c
        L_0x0037:
            java.lang.String r2 = "NO_UNSUPPORTED_TYPE"
            goto L_0x003c
        L_0x003a:
            java.lang.String r2 = "NO"
        L_0x003c:
            r5 = 53
            int r5 = androidx.compose.animation.C0391c.m1055a(r4, r5)
            int r8 = r6.length()
            int r8 = r8 + r5
            int r5 = r2.length()
            int r5 = r5 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            r8.append(r4)
            java.lang.String r5 = " error, index="
            r8.append(r5)
            r5 = r17
            r8.append(r5)
            java.lang.String r9 = ", format="
            r8.append(r9)
            java.lang.String r9 = ", format_supported="
            java.lang.String r2 = android.support.p013v4.media.C0070b.m184f(r8, r6, r9, r2)
            goto L_0x006e
        L_0x006a:
            r5 = r17
            java.lang.String r2 = "Source error"
        L_0x006e:
            boolean r6 = android.text.TextUtils.isEmpty(r15)
            if (r6 != 0) goto L_0x0089
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r6 = r2.length()
            int r6 = r6 + r1
            int r1 = androidx.compose.animation.C0391c.m1055a(r15, r6)
            java.lang.String r6 = ": "
            java.lang.String r0 = p504ai.C13983i.m21492k(r1, r2, r6, r15)
            r1 = r0
            goto L_0x008a
        L_0x0089:
            r1 = r2
        L_0x008a:
            r8 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = r12
            r2 = r14
            r3 = r13
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, java.lang.String, java.lang.String, int, com.google.android.exoplayer2.Format, int, boolean):void");
    }
}
