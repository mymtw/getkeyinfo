package com.google.android.exoplayer2.source.hls;

import androidx.compose.animation.C0388a;
import com.google.android.exoplayer2.drm.C14215a;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.C14289a;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.hls.C14325m;
import com.google.android.exoplayer2.source.hls.playlist.C14333a;
import com.google.android.exoplayer2.source.hls.playlist.C14338c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C14430a;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.android.gms.measurement.internal.C15099u;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p505aj.C13999g;
import p505aj.C14003j;
import p505aj.C14014t;
import p594jh.C17945l0;
import p594jh.C17954o0;
import p595ji.C17999k;
import p620mi.C18229a;

public final class HlsMediaSource extends C14289a implements HlsPlaylistTracker.C14332b {

    /* renamed from: g */
    public final C14320h f31832g;

    /* renamed from: h */
    public final C17954o0.C17960f f31833h;

    /* renamed from: i */
    public final C14319g f31834i;

    /* renamed from: j */
    public final C15099u f31835j;

    /* renamed from: k */
    public final C14219c f31836k;

    /* renamed from: l */
    public final C14431b f31837l;

    /* renamed from: m */
    public final boolean f31838m = false;

    /* renamed from: n */
    public final int f31839n;

    /* renamed from: o */
    public final boolean f31840o;

    /* renamed from: p */
    public final HlsPlaylistTracker f31841p;

    /* renamed from: q */
    public final long f31842q;

    /* renamed from: r */
    public final C17954o0 f31843r;

    /* renamed from: s */
    public C17954o0.C17959e f31844s;

    /* renamed from: t */
    public C14014t f31845t;

    public static final class Factory implements C17999k {

        /* renamed from: a */
        public final C14319g f31846a;

        /* renamed from: b */
        public C14311d f31847b = C14320h.f31896a;

        /* renamed from: c */
        public C18229a f31848c = new C18229a();

        /* renamed from: d */
        public C0388a f31849d = C14333a.f32075p;

        /* renamed from: e */
        public C15099u f31850e = new C15099u();

        /* renamed from: f */
        public C14215a f31851f = new C14215a();

        /* renamed from: g */
        public C14430a f31852g = new C14430a();

        /* renamed from: h */
        public int f31853h = 1;

        /* renamed from: i */
        public List<StreamKey> f31854i = Collections.emptyList();

        /* renamed from: j */
        public long f31855j = -9223372036854775807L;

        public Factory(C13999g.C14000a aVar) {
            this.f31846a = new C14310c(aVar);
        }

        /* JADX WARNING: type inference failed for: r2v11, types: [mi.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.exoplayer2.source.C14344i mo47693a(p594jh.C17954o0 r13) {
            /*
                r12 = this;
                jh.o0$f r0 = r13.f39138b
                r0.getClass()
                mi.a r0 = r12.f31848c
                jh.o0$f r1 = r13.f39138b
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r1.f39193e
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0014
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r12.f31854i
                goto L_0x0018
            L_0x0014:
                jh.o0$f r1 = r13.f39138b
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r1 = r1.f39193e
            L_0x0018:
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L_0x0024
                mi.b r2 = new mi.b
                r2.<init>(r0, r1)
                r0 = r2
            L_0x0024:
                jh.o0$f r2 = r13.f39138b
                java.lang.Object r3 = r2.f39196h
                java.util.List<com.google.android.exoplayer2.offline.StreamKey> r2 = r2.f39193e
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0038
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L_0x0038
                r2 = 1
                goto L_0x0039
            L_0x0038:
                r2 = 0
            L_0x0039:
                if (r2 == 0) goto L_0x0059
                jh.o0$b r13 = r13.mo69492a()
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L_0x004f
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.List r1 = java.util.Collections.unmodifiableList(r2)
                goto L_0x0053
            L_0x004f:
                java.util.List r1 = java.util.Collections.emptyList()
            L_0x0053:
                r13.f39160p = r1
                jh.o0 r13 = r13.mo69497a()
            L_0x0059:
                r2 = r13
                com.google.android.exoplayer2.source.hls.HlsMediaSource r13 = new com.google.android.exoplayer2.source.hls.HlsMediaSource
                com.google.android.exoplayer2.source.hls.g r3 = r12.f31846a
                com.google.android.exoplayer2.source.hls.d r4 = r12.f31847b
                com.google.android.gms.measurement.internal.u r5 = r12.f31850e
                com.google.android.exoplayer2.drm.a r1 = r12.f31851f
                com.google.android.exoplayer2.drm.c r6 = r1.mo47322b(r2)
                com.google.android.exoplayer2.upstream.a r7 = r12.f31852g
                androidx.compose.animation.a r1 = r12.f31849d
                com.google.android.exoplayer2.source.hls.g r8 = r12.f31846a
                r1.getClass()
                com.google.android.exoplayer2.source.hls.playlist.a r9 = new com.google.android.exoplayer2.source.hls.playlist.a
                r9.<init>(r8, r7, r0)
                long r10 = r12.f31855j
                int r0 = r12.f31853h
                r1 = r13
                r8 = r9
                r9 = r10
                r11 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.mo47693a(jh.o0):com.google.android.exoplayer2.source.i");
        }
    }

    static {
        C17945l0.m30331a("goog.exo.hls");
    }

    public HlsMediaSource(C17954o0 o0Var, C14319g gVar, C14311d dVar, C15099u uVar, C14219c cVar, C14430a aVar, C14333a aVar2, long j, int i) {
        C17954o0.C17960f fVar = o0Var.f39138b;
        fVar.getClass();
        this.f31833h = fVar;
        this.f31843r = o0Var;
        this.f31844s = o0Var.f39139c;
        this.f31834i = gVar;
        this.f31832g = dVar;
        this.f31835j = uVar;
        this.f31836k = cVar;
        this.f31837l = aVar;
        this.f31841p = aVar2;
        this.f31842q = j;
        this.f31839n = i;
        this.f31840o = false;
    }

    /* renamed from: r */
    public static C14338c.C14339a m22465r(long j, ImmutableList immutableList) {
        C14338c.C14339a aVar = null;
        for (int i = 0; i < immutableList.size(); i++) {
            C14338c.C14339a aVar2 = (C14338c.C14339a) immutableList.get(i);
            int i2 = (aVar2.f32149f > j ? 1 : (aVar2.f32149f == j ? 0 : -1));
            if (i2 <= 0 && aVar2.f32139m) {
                aVar = aVar2;
            } else if (i2 > 0) {
                break;
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public final C17954o0 mo47622e() {
        return this.f31843r;
    }

    /* renamed from: f */
    public final void mo47623f(C14304h hVar) {
        C14323k kVar = (C14323k) hVar;
        kVar.f31926c.mo47766a(kVar);
        for (C14325m mVar : kVar.f31943t) {
            if (mVar.f31954D) {
                for (C14325m.C14328c cVar : mVar.f31995v) {
                    cVar.mo47843i();
                    DrmSession drmSession = cVar.f32290i;
                    if (drmSession != null) {
                        drmSession.mo47274b(cVar.f32286e);
                        cVar.f32290i = null;
                        cVar.f32289h = null;
                    }
                }
            }
            mVar.f31983j.mo48165c(mVar);
            mVar.f31991r.removeCallbacksAndMessages((Object) null);
            mVar.f31958H = true;
            mVar.f31992s.clear();
        }
        kVar.f31940q = null;
    }

    /* renamed from: h */
    public final C14304h mo47624h(C14344i.C14345a aVar, C14003j jVar, long j) {
        C14344i.C14345a aVar2 = aVar;
        C14347j.C14348a aVar3 = new C14347j.C14348a(this.f31764c.f32163c, 0, aVar2);
        return new C14323k(this.f31832g, this.f31841p, this.f31834i, this.f31845t, this.f31836k, new C14216b.C14217a(this.f31765d.f31566c, 0, aVar2), this.f31837l, aVar3, jVar, this.f31835j, this.f31838m, this.f31839n, this.f31840o);
    }

    /* renamed from: l */
    public final void mo47625l() throws IOException {
        this.f31841p.mo47776n();
    }

    /* renamed from: o */
    public final void mo47626o(C14014t tVar) {
        this.f31845t = tVar;
        this.f31836k.prepare();
        this.f31841p.mo47775l(this.f31833h.f39189a, new C14347j.C14348a(this.f31764c.f32163c, 0, (C14344i.C14345a) null), this);
    }

    /* renamed from: q */
    public final void mo47627q() {
        this.f31841p.stop();
        this.f31836k.release();
    }
}
