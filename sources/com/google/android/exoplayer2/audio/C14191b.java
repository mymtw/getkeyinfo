package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.lang.reflect.Method;
import p513bj.C14049b0;
import p611lh.C18177n;

/* renamed from: com.google.android.exoplayer2.audio.b */
public final class C14191b {

    /* renamed from: A */
    public long f31404A;

    /* renamed from: B */
    public long f31405B;

    /* renamed from: C */
    public long f31406C;

    /* renamed from: D */
    public boolean f31407D;

    /* renamed from: E */
    public long f31408E;

    /* renamed from: F */
    public long f31409F;

    /* renamed from: a */
    public final C14192a f31410a;

    /* renamed from: b */
    public final long[] f31411b;

    /* renamed from: c */
    public AudioTrack f31412c;

    /* renamed from: d */
    public int f31413d;

    /* renamed from: e */
    public int f31414e;

    /* renamed from: f */
    public C18177n f31415f;

    /* renamed from: g */
    public int f31416g;

    /* renamed from: h */
    public boolean f31417h;

    /* renamed from: i */
    public long f31418i;

    /* renamed from: j */
    public float f31419j;

    /* renamed from: k */
    public boolean f31420k;

    /* renamed from: l */
    public long f31421l;

    /* renamed from: m */
    public long f31422m;

    /* renamed from: n */
    public Method f31423n;

    /* renamed from: o */
    public long f31424o;

    /* renamed from: p */
    public boolean f31425p;

    /* renamed from: q */
    public boolean f31426q;

    /* renamed from: r */
    public long f31427r;

    /* renamed from: s */
    public long f31428s;

    /* renamed from: t */
    public long f31429t;

    /* renamed from: u */
    public long f31430u;

    /* renamed from: v */
    public int f31431v;

    /* renamed from: w */
    public int f31432w;

    /* renamed from: x */
    public long f31433x;

    /* renamed from: y */
    public long f31434y;

    /* renamed from: z */
    public long f31435z;

    /* renamed from: com.google.android.exoplayer2.audio.b$a */
    public interface C14192a {
        /* renamed from: a */
        void mo47232a(int i, long j);

        /* renamed from: b */
        void mo47233b(long j);

        /* renamed from: c */
        void mo47234c(long j);

        /* renamed from: d */
        void mo47235d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo47236e(long j, long j2, long j3, long j4);
    }

    public C14191b(DefaultAudioSink.C14186g gVar) {
        this.f31410a = gVar;
        if (C14049b0.f30913a >= 18) {
            try {
                this.f31423n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f31411b = new long[10];
    }

    /* renamed from: a */
    public final long mo47250a() {
        AudioTrack audioTrack = this.f31412c;
        audioTrack.getClass();
        if (this.f31433x != -9223372036854775807L) {
            return Math.min(this.f31404A, this.f31435z + ((((SystemClock.elapsedRealtime() * 1000) - this.f31433x) * ((long) this.f31416g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = UnsignedInteger.INT_MASK & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f31417h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f31430u = this.f31428s;
            }
            playbackHeadPosition += this.f31430u;
        }
        if (C14049b0.f30913a <= 29) {
            if (playbackHeadPosition == 0 && this.f31428s > 0 && playState == 3) {
                if (this.f31434y == -9223372036854775807L) {
                    this.f31434y = SystemClock.elapsedRealtime();
                }
                return this.f31428s;
            }
            this.f31434y = -9223372036854775807L;
        }
        if (this.f31428s > playbackHeadPosition) {
            this.f31429t++;
        }
        this.f31428s = playbackHeadPosition;
        return playbackHeadPosition + (this.f31429t << 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47251b(long r6) {
        /*
            r5 = this;
            long r0 = r5.mo47250a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r7 = 0
            r0 = 1
            if (r6 > 0) goto L_0x0029
            boolean r6 = r5.f31417h
            if (r6 == 0) goto L_0x0026
            android.media.AudioTrack r6 = r5.f31412c
            r6.getClass()
            int r6 = r6.getPlayState()
            r1 = 2
            if (r6 != r1) goto L_0x0026
            long r1 = r5.mo47250a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0026
            r6 = r0
            goto L_0x0027
        L_0x0026:
            r6 = r7
        L_0x0027:
            if (r6 == 0) goto L_0x002a
        L_0x0029:
            r7 = r0
        L_0x002a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C14191b.mo47251b(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((p513bj.C14049b0.f30913a < 23 && (r6 == 5 || r6 == 6)) != false) goto L_0x002a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47252c(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.f31412c = r4
            r3.f31413d = r7
            r3.f31414e = r8
            lh.n r0 = new lh.n
            r0.<init>(r4)
            r3.f31415f = r0
            int r4 = r4.getSampleRate()
            r3.f31416g = r4
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0029
            int r5 = p513bj.C14049b0.f30913a
            r1 = 23
            if (r5 >= r1) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0023
            r5 = 6
            if (r6 != r5) goto L_0x0025
        L_0x0023:
            r5 = r4
            goto L_0x0026
        L_0x0025:
            r5 = r0
        L_0x0026:
            if (r5 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r4 = r0
        L_0x002a:
            r3.f31417h = r4
            boolean r4 = p513bj.C14049b0.m21621B(r6)
            r3.f31426q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0044
            int r8 = r8 / r7
            long r7 = (long) r8
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r1
            int r4 = r3.f31416g
            long r1 = (long) r4
            long r7 = r7 / r1
            goto L_0x0045
        L_0x0044:
            r7 = r5
        L_0x0045:
            r3.f31418i = r7
            r7 = 0
            r3.f31428s = r7
            r3.f31429t = r7
            r3.f31430u = r7
            r3.f31425p = r0
            r3.f31433x = r5
            r3.f31434y = r5
            r3.f31427r = r7
            r3.f31424o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f31419j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C14191b.mo47252c(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
