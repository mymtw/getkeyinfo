package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.compose.animation.C0388a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.hls.C14319g;
import com.google.android.exoplayer2.source.hls.playlist.C14335b;
import com.google.android.exoplayer2.source.hls.playlist.C14338c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C14430a;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.android.exoplayer2.upstream.C14433c;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p505aj.C13999g;
import p505aj.C14013s;
import p513bj.C14049b0;
import p513bj.C14075p;
import p595ji.C17992d;
import p595ji.C17993e;
import p611lh.C18174k;
import p620mi.C18231c;
import p620mi.C18232d;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.a */
public final class C14333a implements HlsPlaylistTracker, Loader.C14424a<C14433c<C18231c>> {

    /* renamed from: p */
    public static final C0388a f32075p = new C0388a();

    /* renamed from: b */
    public final C14319g f32076b;

    /* renamed from: c */
    public final C18232d f32077c;

    /* renamed from: d */
    public final C14431b f32078d;

    /* renamed from: e */
    public final HashMap<Uri, C14334a> f32079e = new HashMap<>();

    /* renamed from: f */
    public final ArrayList f32080f = new ArrayList();

    /* renamed from: g */
    public C14347j.C14348a f32081g;

    /* renamed from: h */
    public Loader f32082h;

    /* renamed from: i */
    public Handler f32083i;

    /* renamed from: j */
    public HlsPlaylistTracker.C14332b f32084j;

    /* renamed from: k */
    public C14335b f32085k;

    /* renamed from: l */
    public Uri f32086l;

    /* renamed from: m */
    public C14338c f32087m;

    /* renamed from: n */
    public boolean f32088n;

    /* renamed from: o */
    public long f32089o = -9223372036854775807L;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.a$a */
    public final class C14334a implements Loader.C14424a<C14433c<C18231c>> {

        /* renamed from: b */
        public final Uri f32090b;

        /* renamed from: c */
        public final Loader f32091c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: d */
        public final C13999g f32092d;

        /* renamed from: e */
        public C14338c f32093e;

        /* renamed from: f */
        public long f32094f;

        /* renamed from: g */
        public long f32095g;

        /* renamed from: h */
        public long f32096h;

        /* renamed from: i */
        public long f32097i;

        /* renamed from: j */
        public boolean f32098j;

        /* renamed from: k */
        public IOException f32099k;

        public C14334a(Uri uri) {
            this.f32090b = uri;
            this.f32092d = C14333a.this.f32076b.mo47716a();
        }

        /* renamed from: a */
        public final boolean mo47779a(long j) {
            boolean z;
            this.f32097i = SystemClock.elapsedRealtime() + j;
            if (!this.f32090b.equals(C14333a.this.f32086l)) {
                return false;
            }
            C14333a aVar = C14333a.this;
            List<C14335b.C14337b> list = aVar.f32085k.f32103e;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                C14334a aVar2 = aVar.f32079e.get(list.get(i).f32115a);
                aVar2.getClass();
                if (elapsedRealtime > aVar2.f32097i) {
                    Uri uri = aVar2.f32090b;
                    aVar.f32086l = uri;
                    aVar2.mo47781c(aVar.mo47778p(uri));
                    z = true;
                    break;
                }
                i++;
            }
            return !z;
        }

        /* renamed from: b */
        public final void mo47780b(Uri uri) {
            C14333a aVar = C14333a.this;
            C14433c cVar = new C14433c(this.f32092d, uri, aVar.f32077c.mo69773a(aVar.f32085k, this.f32093e));
            C14333a.this.f32081g.mo47797k(new C17992d(cVar.f32526a, cVar.f32527b, this.f32091c.mo48166d(cVar, this, ((C14430a) C14333a.this.f32078d).mo48173b(cVar.f32528c))), cVar.f32528c, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: c */
        public final void mo47781c(Uri uri) {
            this.f32097i = 0;
            if (!this.f32098j && !this.f32091c.mo48164b()) {
                if (!(this.f32091c.f32493c != null)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.f32096h;
                    if (elapsedRealtime < j) {
                        this.f32098j = true;
                        C14333a.this.f32083i.postDelayed(new C18174k(1, this, uri), j - elapsedRealtime);
                        return;
                    }
                    mo47780b(uri);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:145:0x0370  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x040b  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x0417  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x043a  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x043c  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x043f  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x018b  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47782d(com.google.android.exoplayer2.source.hls.playlist.C14338c r65) {
            /*
                r64 = this;
                r0 = r64
                r1 = r65
                com.google.android.exoplayer2.source.hls.playlist.c r2 = r0.f32093e
                long r3 = android.os.SystemClock.elapsedRealtime()
                r0.f32094f = r3
                com.google.android.exoplayer2.source.hls.playlist.a r5 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                r5.getClass()
                r6 = 0
                if (r2 == 0) goto L_0x004d
                long r8 = r1.f32127j
                long r10 = r2.f32127j
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 <= 0) goto L_0x001d
                goto L_0x0050
            L_0x001d:
                if (r8 >= 0) goto L_0x0020
                goto L_0x004b
            L_0x0020:
                com.google.common.collect.ImmutableList r8 = r1.f32134q
                int r8 = r8.size()
                com.google.common.collect.ImmutableList r9 = r2.f32134q
                int r9 = r9.size()
                int r8 = r8 - r9
                if (r8 == 0) goto L_0x0032
                if (r8 <= 0) goto L_0x004b
                goto L_0x0050
            L_0x0032:
                com.google.common.collect.ImmutableList r8 = r1.f32135r
                int r8 = r8.size()
                com.google.common.collect.ImmutableList r9 = r2.f32135r
                int r9 = r9.size()
                if (r8 > r9) goto L_0x0050
                if (r8 != r9) goto L_0x004b
                boolean r8 = r1.f32131n
                if (r8 == 0) goto L_0x004b
                boolean r8 = r2.f32131n
                if (r8 != 0) goto L_0x004b
                goto L_0x0050
            L_0x004b:
                r8 = r6
                goto L_0x0051
            L_0x004d:
                r65.getClass()
            L_0x0050:
                r8 = 1
            L_0x0051:
                r9 = 0
                if (r8 != 0) goto L_0x00b0
                boolean r5 = r1.f32131n
                if (r5 == 0) goto L_0x00ad
                boolean r5 = r2.f32131n
                if (r5 == 0) goto L_0x005d
                goto L_0x00ad
            L_0x005d:
                com.google.android.exoplayer2.source.hls.playlist.c r5 = new com.google.android.exoplayer2.source.hls.playlist.c
                r12 = r5
                int r13 = r2.f32121d
                java.lang.String r14 = r2.f39972a
                java.util.List<java.lang.String> r15 = r2.f39973b
                long r10 = r2.f32122e
                r16 = r10
                boolean r8 = r2.f32123f
                r18 = r8
                long r10 = r2.f32124g
                r19 = r10
                boolean r8 = r2.f32125h
                r21 = r8
                int r8 = r2.f32126i
                r22 = r8
                long r10 = r2.f32127j
                r23 = r10
                int r8 = r2.f32128k
                r25 = r8
                long r10 = r2.f32129l
                r26 = r10
                long r10 = r2.f32130m
                r28 = r10
                boolean r8 = r2.f39974c
                r30 = r8
                r31 = 1
                boolean r8 = r2.f32132o
                r32 = r8
                com.google.android.exoplayer2.drm.DrmInitData r8 = r2.f32133p
                r33 = r8
                com.google.common.collect.ImmutableList r8 = r2.f32134q
                r34 = r8
                com.google.common.collect.ImmutableList r8 = r2.f32135r
                r35 = r8
                com.google.android.exoplayer2.source.hls.playlist.c$e r8 = r2.f32138u
                r36 = r8
                com.google.common.collect.ImmutableMap r8 = r2.f32136s
                r37 = r8
                r12.<init>(r13, r14, r15, r16, r18, r19, r21, r22, r23, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37)
                goto L_0x0182
            L_0x00ad:
                r5 = r2
                goto L_0x0182
            L_0x00b0:
                boolean r8 = r1.f32132o
                if (r8 == 0) goto L_0x00b9
                long r10 = r1.f32124g
            L_0x00b6:
                r45 = r10
                goto L_0x00f8
            L_0x00b9:
                com.google.android.exoplayer2.source.hls.playlist.c r8 = r5.f32087m
                if (r8 == 0) goto L_0x00c0
                long r10 = r8.f32124g
                goto L_0x00c2
            L_0x00c0:
                r10 = 0
            L_0x00c2:
                if (r2 != 0) goto L_0x00c5
                goto L_0x00b6
            L_0x00c5:
                com.google.common.collect.ImmutableList r8 = r2.f32134q
                int r8 = r8.size()
                long r12 = r1.f32127j
                long r14 = r2.f32127j
                long r12 = r12 - r14
                int r12 = (int) r12
                com.google.common.collect.ImmutableList r13 = r2.f32134q
                int r14 = r13.size()
                if (r12 >= r14) goto L_0x00e0
                java.lang.Object r12 = r13.get(r12)
                com.google.android.exoplayer2.source.hls.playlist.c$c r12 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14341c) r12
                goto L_0x00e1
            L_0x00e0:
                r12 = r9
            L_0x00e1:
                if (r12 == 0) goto L_0x00e8
                long r10 = r2.f32124g
                long r12 = r12.f32149f
                goto L_0x00f6
            L_0x00e8:
                long r12 = (long) r8
                long r14 = r1.f32127j
                long r7 = r2.f32127j
                long r14 = r14 - r7
                int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r7 != 0) goto L_0x00b6
                long r10 = r2.f32124g
                long r12 = r2.f32137t
            L_0x00f6:
                long r10 = r10 + r12
                goto L_0x00b6
            L_0x00f8:
                boolean r7 = r1.f32125h
                if (r7 == 0) goto L_0x0101
                int r5 = r1.f32126i
            L_0x00fe:
                r48 = r5
                goto L_0x0135
            L_0x0101:
                com.google.android.exoplayer2.source.hls.playlist.c r5 = r5.f32087m
                if (r5 == 0) goto L_0x0108
                int r5 = r5.f32126i
                goto L_0x0109
            L_0x0108:
                r5 = r6
            L_0x0109:
                if (r2 != 0) goto L_0x010c
                goto L_0x00fe
            L_0x010c:
                long r7 = r1.f32127j
                long r10 = r2.f32127j
                long r7 = r7 - r10
                int r7 = (int) r7
                com.google.common.collect.ImmutableList r8 = r2.f32134q
                int r10 = r8.size()
                if (r7 >= r10) goto L_0x0121
                java.lang.Object r7 = r8.get(r7)
                com.google.android.exoplayer2.source.hls.playlist.c$c r7 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14341c) r7
                goto L_0x0122
            L_0x0121:
                r7 = r9
            L_0x0122:
                if (r7 == 0) goto L_0x00fe
                int r5 = r2.f32126i
                int r7 = r7.f32148e
                int r5 = r5 + r7
                com.google.common.collect.ImmutableList r7 = r1.f32134q
                java.lang.Object r7 = r7.get(r6)
                com.google.android.exoplayer2.source.hls.playlist.c$c r7 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14341c) r7
                int r7 = r7.f32148e
                int r5 = r5 - r7
                goto L_0x00fe
            L_0x0135:
                com.google.android.exoplayer2.source.hls.playlist.c r5 = new com.google.android.exoplayer2.source.hls.playlist.c
                r38 = r5
                int r7 = r1.f32121d
                r39 = r7
                java.lang.String r7 = r1.f39972a
                r40 = r7
                java.util.List<java.lang.String> r7 = r1.f39973b
                r41 = r7
                long r7 = r1.f32122e
                r42 = r7
                boolean r7 = r1.f32123f
                r44 = r7
                long r7 = r1.f32127j
                r49 = r7
                int r7 = r1.f32128k
                r51 = r7
                long r7 = r1.f32129l
                r52 = r7
                long r7 = r1.f32130m
                r54 = r7
                boolean r7 = r1.f39974c
                r56 = r7
                boolean r7 = r1.f32131n
                r57 = r7
                boolean r7 = r1.f32132o
                r58 = r7
                com.google.android.exoplayer2.drm.DrmInitData r7 = r1.f32133p
                r59 = r7
                com.google.common.collect.ImmutableList r7 = r1.f32134q
                r60 = r7
                com.google.common.collect.ImmutableList r7 = r1.f32135r
                r61 = r7
                com.google.android.exoplayer2.source.hls.playlist.c$e r7 = r1.f32138u
                r62 = r7
                com.google.common.collect.ImmutableMap r7 = r1.f32136s
                r63 = r7
                r47 = 1
                r38.<init>(r39, r40, r41, r42, r44, r45, r47, r48, r49, r51, r52, r54, r56, r57, r58, r59, r60, r61, r62, r63)
            L_0x0182:
                r0.f32093e = r5
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 == r2) goto L_0x0370
                r0.f32099k = r9
                r0.f32095g = r3
                com.google.android.exoplayer2.source.hls.playlist.a r1 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                android.net.Uri r9 = r0.f32090b
                android.net.Uri r10 = r1.f32086l
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x0358
                com.google.android.exoplayer2.source.hls.playlist.c r9 = r1.f32087m
                if (r9 != 0) goto L_0x01a9
                boolean r9 = r5.f32131n
                r10 = 1
                r9 = r9 ^ r10
                r1.f32088n = r9
                long r9 = r5.f32124g
                r1.f32089o = r9
            L_0x01a9:
                r1.f32087m = r5
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b r9 = r1.f32084j
                com.google.android.exoplayer2.source.hls.HlsMediaSource r9 = (com.google.android.exoplayer2.source.hls.HlsMediaSource) r9
                r9.getClass()
                boolean r10 = r5.f32132o
                if (r10 == 0) goto L_0x01bf
                long r10 = r5.f32124g
                long r10 = p594jh.C17912g.m30088b(r10)
                r20 = r10
                goto L_0x01c1
            L_0x01bf:
                r20 = r7
            L_0x01c1:
                int r10 = r5.f32121d
                r11 = 2
                if (r10 == r11) goto L_0x01cd
                r11 = 1
                if (r10 != r11) goto L_0x01ca
                goto L_0x01cd
            L_0x01ca:
                r18 = r7
                goto L_0x01cf
            L_0x01cd:
                r18 = r20
            L_0x01cf:
                androidx.compose.runtime.j1 r10 = new androidx.compose.runtime.j1
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r11 = r9.f31841p
                com.google.android.exoplayer2.source.hls.playlist.b r11 = r11.mo47769d()
                r11.getClass()
                r10.<init>(r11, r5)
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r11 = r9.f31841p
                boolean r11 = r11.mo47774k()
                if (r11 == 0) goto L_0x02fb
                long r11 = r5.f32124g
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r13 = r9.f31841p
                long r13 = r13.mo47768c()
                long r26 = r11 - r13
                boolean r11 = r5.f32131n
                if (r11 == 0) goto L_0x01fa
                long r11 = r5.f32137t
                long r11 = r26 + r11
                r22 = r11
                goto L_0x01fc
            L_0x01fa:
                r22 = r7
            L_0x01fc:
                boolean r11 = r5.f32132o
                if (r11 == 0) goto L_0x021d
                long r11 = r9.f31842q
                int r13 = p513bj.C14049b0.f30913a
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 != 0) goto L_0x020d
                long r11 = java.lang.System.currentTimeMillis()
                goto L_0x0212
            L_0x020d:
                long r13 = android.os.SystemClock.elapsedRealtime()
                long r11 = r11 + r13
            L_0x0212:
                long r11 = p594jh.C17912g.m30087a(r11)
                long r13 = r5.f32124g
                long r6 = r5.f32137t
                long r13 = r13 + r6
                long r11 = r11 - r13
                goto L_0x021f
            L_0x021d:
                r11 = 0
            L_0x021f:
                jh.o0$e r6 = r9.f31844s
                long r6 = r6.f39184a
                r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r8 == 0) goto L_0x0233
                long r6 = p594jh.C17912g.m30087a(r6)
                r28 = r6
                goto L_0x0264
            L_0x0233:
                com.google.android.exoplayer2.source.hls.playlist.c$e r6 = r5.f32138u
                long r7 = r5.f32122e
                int r17 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r17 == 0) goto L_0x023f
                long r13 = r5.f32137t
                long r13 = r13 - r7
                goto L_0x0261
            L_0x023f:
                long r13 = r6.f32159d
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r17 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r17 == 0) goto L_0x0255
                r24 = r13
                long r13 = r5.f32130m
                int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r13 == 0) goto L_0x0255
                r13 = r24
                goto L_0x0261
            L_0x0255:
                long r13 = r6.f32158c
                int r6 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r6 == 0) goto L_0x025c
                goto L_0x0261
            L_0x025c:
                r6 = 3
                long r13 = r5.f32129l
                long r13 = r13 * r6
            L_0x0261:
                long r13 = r13 + r11
                r28 = r13
            L_0x0264:
                long r6 = r5.f32137t
                long r32 = r6 + r11
                r30 = r11
                long r6 = p513bj.C14049b0.m21637j(r28, r30, r32)
                long r6 = p594jh.C17912g.m30088b(r6)
                jh.o0$e r8 = r9.f31844s
                long r13 = r8.f39184a
                int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r8 == 0) goto L_0x028a
                jh.o0 r8 = r9.f31843r
                jh.o0$b r8 = r8.mo69492a()
                r8.f39167w = r6
                jh.o0 r6 = r8.mo69497a()
                jh.o0$e r6 = r6.f39139c
                r9.f31844s = r6
            L_0x028a:
                long r6 = r5.f32122e
                r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r8 == 0) goto L_0x0296
                goto L_0x02a2
            L_0x0296:
                long r6 = r5.f32137t
                long r6 = r6 + r11
                jh.o0$e r8 = r9.f31844s
                long r11 = r8.f39184a
                long r11 = p594jh.C17912g.m30087a(r11)
                long r6 = r6 - r11
            L_0x02a2:
                boolean r8 = r5.f32123f
                if (r8 == 0) goto L_0x02a7
                goto L_0x02db
            L_0x02a7:
                com.google.common.collect.ImmutableList r8 = r5.f32135r
                com.google.android.exoplayer2.source.hls.playlist.c$a r8 = com.google.android.exoplayer2.source.hls.HlsMediaSource.m22465r(r6, r8)
                if (r8 == 0) goto L_0x02b2
                long r6 = r8.f32149f
                goto L_0x02db
            L_0x02b2:
                com.google.common.collect.ImmutableList r8 = r5.f32134q
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x02bd
                r28 = 0
                goto L_0x02dd
            L_0x02bd:
                com.google.common.collect.ImmutableList r8 = r5.f32134q
                java.lang.Long r11 = java.lang.Long.valueOf(r6)
                r12 = 1
                int r11 = p513bj.C14049b0.m21630c(r8, r11, r12)
                java.lang.Object r8 = r8.get(r11)
                com.google.android.exoplayer2.source.hls.playlist.c$c r8 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14341c) r8
                com.google.common.collect.ImmutableList r11 = r8.f32144n
                com.google.android.exoplayer2.source.hls.playlist.c$a r6 = com.google.android.exoplayer2.source.hls.HlsMediaSource.m22465r(r6, r11)
                if (r6 == 0) goto L_0x02d9
                long r6 = r6.f32149f
                goto L_0x02db
            L_0x02d9:
                long r6 = r8.f32149f
            L_0x02db:
                r28 = r6
            L_0x02dd:
                ji.n r6 = new ji.n
                r17 = r6
                long r7 = r5.f32137t
                r24 = r7
                r30 = 1
                boolean r5 = r5.f32131n
                r7 = 1
                r31 = r5 ^ 1
                jh.o0 r5 = r9.f31843r
                r33 = r5
                jh.o0$e r5 = r9.f31844s
                r34 = r5
                r32 = r10
                r17.<init>(r18, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34)
                r7 = 1
                goto L_0x0354
            L_0x02fb:
                long r6 = r5.f32122e
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0336
                com.google.common.collect.ImmutableList r6 = r5.f32134q
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x030f
                goto L_0x0336
            L_0x030f:
                boolean r6 = r5.f32123f
                if (r6 != 0) goto L_0x0330
                long r6 = r5.f32122e
                long r11 = r5.f32137t
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x031c
                goto L_0x0330
            L_0x031c:
                com.google.common.collect.ImmutableList r8 = r5.f32134q
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r7 = 1
                int r6 = p513bj.C14049b0.m21630c(r8, r6, r7)
                java.lang.Object r6 = r8.get(r6)
                com.google.android.exoplayer2.source.hls.playlist.c$c r6 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14341c) r6
                long r11 = r6.f32149f
                goto L_0x0333
            L_0x0330:
                r7 = 1
                long r11 = r5.f32122e
            L_0x0333:
                r28 = r11
                goto L_0x0339
            L_0x0336:
                r7 = 1
                r28 = 0
            L_0x0339:
                ji.n r6 = new ji.n
                r17 = r6
                long r11 = r5.f32137t
                r22 = r11
                r24 = r11
                r26 = 0
                r30 = 1
                r31 = 0
                jh.o0 r5 = r9.f31843r
                r33 = r5
                r34 = 0
                r32 = r10
                r17.<init>(r18, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34)
            L_0x0354:
                r9.mo47660p(r6)
                goto L_0x0359
            L_0x0358:
                r7 = 1
            L_0x0359:
                java.util.ArrayList r5 = r1.f32080f
                int r5 = r5.size()
                r6 = 0
            L_0x0360:
                if (r6 >= r5) goto L_0x0403
                java.util.ArrayList r8 = r1.f32080f
                java.lang.Object r8 = r8.get(r6)
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a r8 = (com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.C14331a) r8
                r8.mo47732g()
                int r6 = r6 + 1
                goto L_0x0360
            L_0x0370:
                r7 = 1
                boolean r5 = r5.f32131n
                if (r5 != 0) goto L_0x0403
                long r5 = r1.f32127j
                com.google.common.collect.ImmutableList r1 = r1.f32134q
                int r1 = r1.size()
                long r8 = (long) r1
                long r5 = r5 + r8
                com.google.android.exoplayer2.source.hls.playlist.c r1 = r0.f32093e
                long r8 = r1.f32127j
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r5 >= 0) goto L_0x039d
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException
                android.net.Uri r5 = r0.f32090b
                r1.<init>(r5)
                r0.f32099k = r1
                com.google.android.exoplayer2.source.hls.playlist.a r1 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                android.net.Uri r5 = r0.f32090b
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                com.google.android.exoplayer2.source.hls.playlist.C14333a.m22584o(r1, r5, r8)
                goto L_0x0403
            L_0x039d:
                long r5 = r0.f32095g
                long r5 = r3 - r5
                double r5 = (double) r5
                long r8 = r1.f32129l
                long r8 = p594jh.C17912g.m30088b(r8)
                double r8 = (double) r8
                com.google.android.exoplayer2.source.hls.playlist.a r1 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                r1.getClass()
                r10 = 4615063718147915776(0x400c000000000000, double:3.5)
                double r8 = r8 * r10
                int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r1 <= 0) goto L_0x0403
                com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
                android.net.Uri r5 = r0.f32090b
                r1.<init>(r5)
                r0.f32099k = r1
                com.google.android.exoplayer2.source.hls.playlist.a r5 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                com.google.android.exoplayer2.upstream.b r5 = r5.f32078d
                com.google.android.exoplayer2.upstream.a r5 = (com.google.android.exoplayer2.upstream.C14430a) r5
                r5.getClass()
                boolean r5 = r1 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
                if (r5 == 0) goto L_0x03eb
                com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r1 = (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException) r1
                int r1 = r1.responseCode
                r5 = 403(0x193, float:5.65E-43)
                if (r1 == r5) goto L_0x03e7
                r5 = 404(0x194, float:5.66E-43)
                if (r1 == r5) goto L_0x03e7
                r5 = 410(0x19a, float:5.75E-43)
                if (r1 == r5) goto L_0x03e7
                r5 = 416(0x1a0, float:5.83E-43)
                if (r1 == r5) goto L_0x03e7
                r5 = 500(0x1f4, float:7.0E-43)
                if (r1 == r5) goto L_0x03e7
                r5 = 503(0x1f7, float:7.05E-43)
                if (r1 != r5) goto L_0x03eb
            L_0x03e7:
                r5 = 60000(0xea60, double:2.9644E-319)
                goto L_0x03f0
            L_0x03eb:
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L_0x03f0:
                com.google.android.exoplayer2.source.hls.playlist.a r1 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                android.net.Uri r8 = r0.f32090b
                com.google.android.exoplayer2.source.hls.playlist.C14333a.m22584o(r1, r8, r5)
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0403
                r0.mo47779a(r5)
            L_0x0403:
                com.google.android.exoplayer2.source.hls.playlist.c r1 = r0.f32093e
                com.google.android.exoplayer2.source.hls.playlist.c$e r5 = r1.f32138u
                boolean r5 = r5.f32160e
                if (r5 != 0) goto L_0x0417
                if (r1 == r2) goto L_0x0410
                long r1 = r1.f32129l
                goto L_0x0415
            L_0x0410:
                long r1 = r1.f32129l
                r5 = 2
                long r1 = r1 / r5
            L_0x0415:
                r10 = r1
                goto L_0x0419
            L_0x0417:
                r10 = 0
            L_0x0419:
                long r1 = p594jh.C17912g.m30088b(r10)
                long r1 = r1 + r3
                r0.f32096h = r1
                com.google.android.exoplayer2.source.hls.playlist.c r1 = r0.f32093e
                long r1 = r1.f32130m
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L_0x043c
                android.net.Uri r1 = r0.f32090b
                com.google.android.exoplayer2.source.hls.playlist.a r2 = com.google.android.exoplayer2.source.hls.playlist.C14333a.this
                android.net.Uri r2 = r2.f32086l
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x043a
                goto L_0x043c
            L_0x043a:
                r6 = 0
                goto L_0x043d
            L_0x043c:
                r6 = r7
            L_0x043d:
                if (r6 == 0) goto L_0x04cc
                com.google.android.exoplayer2.source.hls.playlist.c r1 = r0.f32093e
                boolean r2 = r1.f32131n
                if (r2 != 0) goto L_0x04cc
                com.google.android.exoplayer2.source.hls.playlist.c$e r1 = r1.f32138u
                long r2 = r1.f32156a
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x0459
                boolean r1 = r1.f32160e
                if (r1 != 0) goto L_0x0459
                android.net.Uri r1 = r0.f32090b
                goto L_0x04c9
            L_0x0459:
                android.net.Uri r1 = r0.f32090b
                android.net.Uri$Builder r1 = r1.buildUpon()
                com.google.android.exoplayer2.source.hls.playlist.c r2 = r0.f32093e
                com.google.android.exoplayer2.source.hls.playlist.c$e r3 = r2.f32138u
                boolean r3 = r3.f32160e
                if (r3 == 0) goto L_0x04a8
                long r3 = r2.f32127j
                com.google.common.collect.ImmutableList r2 = r2.f32134q
                int r2 = r2.size()
                long r5 = (long) r2
                long r3 = r3 + r5
                java.lang.String r2 = java.lang.String.valueOf(r3)
                java.lang.String r3 = "_HLS_msn"
                r1.appendQueryParameter(r3, r2)
                com.google.android.exoplayer2.source.hls.playlist.c r2 = r0.f32093e
                long r3 = r2.f32130m
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x04a8
                com.google.common.collect.ImmutableList r2 = r2.f32135r
                int r3 = r2.size()
                boolean r4 = r2.isEmpty()
                if (r4 != 0) goto L_0x049f
                java.lang.Object r2 = com.google.common.collect.C16201n0.m26211b(r2)
                com.google.android.exoplayer2.source.hls.playlist.c$a r2 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14339a) r2
                boolean r2 = r2.f32140n
                if (r2 == 0) goto L_0x049f
                int r3 = r3 + -1
            L_0x049f:
                java.lang.String r2 = java.lang.String.valueOf(r3)
                java.lang.String r3 = "_HLS_part"
                r1.appendQueryParameter(r3, r2)
            L_0x04a8:
                com.google.android.exoplayer2.source.hls.playlist.c r2 = r0.f32093e
                com.google.android.exoplayer2.source.hls.playlist.c$e r2 = r2.f32138u
                long r3 = r2.f32156a
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x04c5
                boolean r2 = r2.f32157b
                if (r2 == 0) goto L_0x04be
                java.lang.String r2 = "v2"
                goto L_0x04c0
            L_0x04be:
                java.lang.String r2 = "YES"
            L_0x04c0:
                java.lang.String r3 = "_HLS_skip"
                r1.appendQueryParameter(r3, r2)
            L_0x04c5:
                android.net.Uri r1 = r1.build()
            L_0x04c9:
                r0.mo47781c(r1)
            L_0x04cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.C14333a.C14334a.mo47782d(com.google.android.exoplayer2.source.hls.playlist.c):void");
        }

        /* renamed from: g */
        public final void mo47744g(Loader.C14427d dVar, long j, long j2, boolean z) {
            C14433c cVar = (C14433c) dVar;
            long j3 = cVar.f32526a;
            C14013s sVar = cVar.f32529d;
            Uri uri = sVar.f30851c;
            C17992d dVar2 = new C17992d(sVar.f30852d, j2);
            C14333a.this.f32078d.getClass();
            C14333a.this.f32081g.mo47790d(dVar2, 4, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: h */
        public final void mo47745h(Loader.C14427d dVar, long j, long j2) {
            C14433c cVar = (C14433c) dVar;
            C18231c cVar2 = (C18231c) cVar.f32531f;
            C14013s sVar = cVar.f32529d;
            Uri uri = sVar.f30851c;
            C17992d dVar2 = new C17992d(sVar.f30852d, j2);
            if (cVar2 instanceof C14338c) {
                mo47782d((C14338c) cVar2);
                C14333a.this.f32081g.mo47792f(dVar2, 4, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
            } else {
                ParserException parserException = new ParserException("Loaded playlist has unexpected type.");
                this.f32099k = parserException;
                C14333a.this.f32081g.mo47795i(dVar2, 4, parserException, true);
            }
            C14333a.this.f32078d.getClass();
        }

        /* renamed from: m */
        public final Loader.C14425b mo47746m(Loader.C14427d dVar, long j, long j2, IOException iOException, int i) {
            Loader.C14425b bVar;
            C14433c cVar = (C14433c) dVar;
            long j3 = cVar.f32526a;
            C14013s sVar = cVar.f32529d;
            Uri uri = sVar.f30851c;
            C17992d dVar2 = new C17992d(sVar.f30852d, j2);
            boolean z = false;
            boolean z2 = uri.getQueryParameter("_HLS_msn") != null;
            boolean z3 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if (z2 || z3) {
                int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
                    i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
                }
                if (z3 || i2 == 400 || i2 == 503) {
                    this.f32096h = SystemClock.elapsedRealtime();
                    mo47781c(this.f32090b);
                    C14347j.C14348a aVar = C14333a.this.f32081g;
                    int i3 = C14049b0.f30913a;
                    aVar.mo47795i(dVar2, cVar.f32528c, iOException, true);
                    return Loader.f32489e;
                }
            }
            C14431b.C14432a aVar2 = new C14431b.C14432a(dVar2, new C17993e(cVar.f32528c), iOException, i);
            long a = ((C14430a) C14333a.this.f32078d).mo48172a(aVar2);
            boolean z4 = a != -9223372036854775807L;
            boolean z5 = C14333a.m22584o(C14333a.this, this.f32090b, a) || !z4;
            if (z4) {
                z5 |= mo47779a(a);
            }
            if (z5) {
                long c = ((C14430a) C14333a.this.f32078d).mo48174c(aVar2);
                bVar = c != -9223372036854775807L ? new Loader.C14425b(0, c) : Loader.f32490f;
            } else {
                bVar = Loader.f32489e;
            }
            int i4 = bVar.f32494a;
            if (i4 == 0 || i4 == 1) {
                z = true;
            }
            boolean z6 = true ^ z;
            C14333a.this.f32081g.mo47795i(dVar2, cVar.f32528c, iOException, z6);
            if (!z6) {
                return bVar;
            }
            C14333a.this.f32078d.getClass();
            return bVar;
        }
    }

    public C14333a(C14319g gVar, C14430a aVar, C18232d dVar) {
        this.f32076b = gVar;
        this.f32077c = dVar;
        this.f32078d = aVar;
    }

    /* renamed from: o */
    public static boolean m22584o(C14333a aVar, Uri uri, long j) {
        int size = aVar.f32080f.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !((HlsPlaylistTracker.C14331a) aVar.f32080f.get(i)).mo47733h(uri, j);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo47766a(HlsPlaylistTracker.C14331a aVar) {
        this.f32080f.remove(aVar);
    }

    /* renamed from: b */
    public final void mo47767b(Uri uri) throws IOException {
        C14334a aVar = this.f32079e.get(uri);
        Loader loader = aVar.f32091c;
        IOException iOException = loader.f32493c;
        if (iOException == null) {
            Loader.C14426c<? extends Loader.C14427d> cVar = loader.f32492b;
            if (cVar != null) {
                int i = cVar.f32496b;
                IOException iOException2 = cVar.f32500f;
                if (iOException2 != null && cVar.f32501g > i) {
                    throw iOException2;
                }
            }
            IOException iOException3 = aVar.f32099k;
            if (iOException3 != null) {
                throw iOException3;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public final long mo47768c() {
        return this.f32089o;
    }

    /* renamed from: d */
    public final C14335b mo47769d() {
        return this.f32085k;
    }

    /* renamed from: e */
    public final void mo47770e(Uri uri) {
        C14334a aVar = this.f32079e.get(uri);
        aVar.mo47781c(aVar.f32090b);
    }

    /* renamed from: f */
    public final void mo47771f(HlsPlaylistTracker.C14331a aVar) {
        aVar.getClass();
        this.f32080f.add(aVar);
    }

    /* renamed from: g */
    public final void mo47744g(Loader.C14427d dVar, long j, long j2, boolean z) {
        C14433c cVar = (C14433c) dVar;
        long j3 = cVar.f32526a;
        C14013s sVar = cVar.f32529d;
        Uri uri = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        this.f32078d.getClass();
        this.f32081g.mo47790d(dVar2, 4, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: h */
    public final void mo47745h(Loader.C14427d dVar, long j, long j2) {
        C14335b bVar;
        C14433c cVar = (C14433c) dVar;
        C18231c cVar2 = (C18231c) cVar.f32531f;
        boolean z = cVar2 instanceof C14338c;
        if (z) {
            String str = cVar2.f39972a;
            C14335b bVar2 = C14335b.f32101n;
            Uri parse = Uri.parse(str);
            Format.C14176b bVar3 = new Format.C14176b();
            bVar3.f31293a = "0";
            bVar3.f31302j = "application/x-mpegURL";
            bVar = new C14335b("", Collections.emptyList(), Collections.singletonList(new C14335b.C14337b(parse, bVar3.mo47144a(), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (Format) null, (List<Format>) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            bVar = (C14335b) cVar2;
        }
        this.f32085k = bVar;
        this.f32086l = bVar.f32103e.get(0).f32115a;
        List<Uri> list = bVar.f32102d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.f32079e.put(uri, new C14334a(uri));
        }
        C14013s sVar = cVar.f32529d;
        Uri uri2 = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        C14334a aVar = this.f32079e.get(this.f32086l);
        if (z) {
            aVar.mo47782d((C14338c) cVar2);
        } else {
            aVar.mo47781c(aVar.f32090b);
        }
        this.f32078d.getClass();
        this.f32081g.mo47792f(dVar2, 4, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: i */
    public final C14338c mo47772i(boolean z, Uri uri) {
        C14338c cVar;
        C14338c cVar2 = this.f32079e.get(uri).f32093e;
        if (cVar2 != null && z && !uri.equals(this.f32086l)) {
            List<C14335b.C14337b> list = this.f32085k.f32103e;
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(list.get(i).f32115a)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z2 && ((cVar = this.f32087m) == null || !cVar.f32131n)) {
                this.f32086l = uri;
                this.f32079e.get(uri).mo47781c(mo47778p(uri));
            }
        }
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r0 = r0.f32121d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47773j(android.net.Uri r11) {
        /*
            r10 = this;
            java.util.HashMap<android.net.Uri, com.google.android.exoplayer2.source.hls.playlist.a$a> r0 = r10.f32079e
            java.lang.Object r11 = r0.get(r11)
            com.google.android.exoplayer2.source.hls.playlist.a$a r11 = (com.google.android.exoplayer2.source.hls.playlist.C14333a.C14334a) r11
            com.google.android.exoplayer2.source.hls.playlist.c r0 = r11.f32093e
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0036
        L_0x000e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 30000(0x7530, double:1.4822E-319)
            com.google.android.exoplayer2.source.hls.playlist.c r0 = r11.f32093e
            long r6 = r0.f32137t
            long r6 = p594jh.C17912g.m30088b(r6)
            long r4 = java.lang.Math.max(r4, r6)
            com.google.android.exoplayer2.source.hls.playlist.c r0 = r11.f32093e
            boolean r6 = r0.f32131n
            r7 = 1
            if (r6 != 0) goto L_0x0035
            int r0 = r0.f32121d
            r6 = 2
            if (r0 == r6) goto L_0x0035
            if (r0 == r7) goto L_0x0035
            long r8 = r11.f32094f
            long r8 = r8 + r4
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0036
        L_0x0035:
            r1 = r7
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.C14333a.mo47773j(android.net.Uri):boolean");
    }

    /* renamed from: k */
    public final boolean mo47774k() {
        return this.f32088n;
    }

    /* renamed from: l */
    public final void mo47775l(Uri uri, C14347j.C14348a aVar, HlsPlaylistTracker.C14332b bVar) {
        this.f32083i = C14049b0.m21639l((Handler.Callback) null);
        this.f32081g = aVar;
        this.f32084j = bVar;
        Uri uri2 = uri;
        C14433c cVar = new C14433c(this.f32076b.mo47716a(), uri, this.f32077c.mo69774b());
        C14075p.m21694f(this.f32082h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f32082h = loader;
        aVar.mo47797k(new C17992d(cVar.f32526a, cVar.f32527b, loader.mo48166d(cVar, this, ((C14430a) this.f32078d).mo48173b(cVar.f32528c))), cVar.f32528c, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: m */
    public final Loader.C14425b mo47746m(Loader.C14427d dVar, long j, long j2, IOException iOException, int i) {
        C14433c cVar = (C14433c) dVar;
        long j3 = cVar.f32526a;
        C14013s sVar = cVar.f32529d;
        Uri uri = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        ((C14430a) this.f32078d).getClass();
        long min = ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException)) ? -9223372036854775807L : (long) Math.min((i - 1) * 1000, 5000);
        boolean z = min == -9223372036854775807L;
        this.f32081g.mo47795i(dVar2, cVar.f32528c, iOException, z);
        if (z) {
            this.f32078d.getClass();
        }
        return z ? Loader.f32490f : new Loader.C14425b(0, min);
    }

    /* renamed from: n */
    public final void mo47776n() throws IOException {
        Loader loader = this.f32082h;
        if (loader != null) {
            IOException iOException = loader.f32493c;
            if (iOException == null) {
                Loader.C14426c<? extends Loader.C14427d> cVar = loader.f32492b;
                if (cVar != null) {
                    int i = cVar.f32496b;
                    IOException iOException2 = cVar.f32500f;
                    if (iOException2 != null && cVar.f32501g > i) {
                        throw iOException2;
                    }
                }
            } else {
                throw iOException;
            }
        }
        Uri uri = this.f32086l;
        if (uri != null) {
            mo47767b(uri);
        }
    }

    /* renamed from: p */
    public final Uri mo47778p(Uri uri) {
        C14338c.C14340b bVar;
        C14338c cVar = this.f32087m;
        if (cVar == null || !cVar.f32138u.f32160e || (bVar = (C14338c.C14340b) cVar.f32136s.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar.f32141a));
        int i = bVar.f32142b;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final void stop() {
        this.f32086l = null;
        this.f32087m = null;
        this.f32085k = null;
        this.f32089o = -9223372036854775807L;
        this.f32082h.mo48165c((Loader.C14428e) null);
        this.f32082h = null;
        for (C14334a aVar : this.f32079e.values()) {
            aVar.f32091c.mo48165c((Loader.C14428e) null);
        }
        this.f32083i.removeCallbacksAndMessages((Object) null);
        this.f32083i = null;
        this.f32079e.clear();
    }
}
