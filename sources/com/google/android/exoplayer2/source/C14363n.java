package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.drm.C14215a;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.C14353l;
import com.google.android.exoplayer2.source.C14355m;
import com.google.android.exoplayer2.upstream.C14430a;
import com.google.android.exoplayer2.upstream.C14431b;
import p316be.C8549a;
import p505aj.C13999g;
import p505aj.C14003j;
import p505aj.C14007n;
import p505aj.C14014t;
import p594jh.C17939k1;
import p594jh.C17954o0;
import p595ji.C17989a;
import p595ji.C17991c;
import p595ji.C17999k;
import p595ji.C18003n;
import p644ph.C18347f;
import p644ph.C18353k;

/* renamed from: com.google.android.exoplayer2.source.n */
public final class C14363n extends C14289a implements C14355m.C14357b {

    /* renamed from: g */
    public final C17954o0 f32245g;

    /* renamed from: h */
    public final C17954o0.C17960f f32246h;

    /* renamed from: i */
    public final C13999g.C14000a f32247i;

    /* renamed from: j */
    public final C14353l.C14354a f32248j;

    /* renamed from: k */
    public final C14219c f32249k;

    /* renamed from: l */
    public final C14431b f32250l;

    /* renamed from: m */
    public final int f32251m;

    /* renamed from: n */
    public boolean f32252n = true;

    /* renamed from: o */
    public long f32253o = -9223372036854775807L;

    /* renamed from: p */
    public boolean f32254p;

    /* renamed from: q */
    public boolean f32255q;

    /* renamed from: r */
    public C14014t f32256r;

    /* renamed from: com.google.android.exoplayer2.source.n$a */
    public class C14364a extends C17991c {
        public C14364a(C18003n nVar) {
            super(nVar);
        }

        /* renamed from: f */
        public final C17939k1.C17941b mo47630f(int i, C17939k1.C17941b bVar, boolean z) {
            super.mo47630f(i, bVar, z);
            bVar.f39103f = true;
            return bVar;
        }

        /* renamed from: n */
        public final C17939k1.C17942c mo47631n(int i, C17939k1.C17942c cVar, long j) {
            super.mo47631n(i, cVar, j);
            cVar.f39118l = true;
            return cVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.n$b */
    public static final class C14365b implements C17999k {

        /* renamed from: a */
        public final C13999g.C14000a f32257a;

        /* renamed from: b */
        public C14353l.C14354a f32258b;

        /* renamed from: c */
        public C14215a f32259c = new C14215a();

        /* renamed from: d */
        public C14430a f32260d = new C14430a();

        /* renamed from: e */
        public int f32261e = 1048576;

        public C14365b(C14007n nVar, C18347f fVar) {
            C8549a aVar = new C8549a(fVar);
            this.f32257a = nVar;
            this.f32258b = aVar;
        }

        /* renamed from: a */
        public final C14344i mo47693a(C17954o0 o0Var) {
            o0Var.f39138b.getClass();
            Object obj = o0Var.f39138b.f39196h;
            return new C14363n(o0Var, this.f32257a, this.f32258b, this.f32259c.mo47322b(o0Var), this.f32260d, this.f32261e);
        }
    }

    public C14363n(C17954o0 o0Var, C13999g.C14000a aVar, C14353l.C14354a aVar2, C14219c cVar, C14430a aVar3, int i) {
        C17954o0.C17960f fVar = o0Var.f39138b;
        fVar.getClass();
        this.f32246h = fVar;
        this.f32245g = o0Var;
        this.f32247i = aVar;
        this.f32248j = aVar2;
        this.f32249k = cVar;
        this.f32250l = aVar3;
        this.f32251m = i;
    }

    /* renamed from: e */
    public final C17954o0 mo47622e() {
        return this.f32245g;
    }

    /* renamed from: f */
    public final void mo47623f(C14304h hVar) {
        C14355m mVar = (C14355m) hVar;
        if (mVar.f32216w) {
            for (C14368p pVar : mVar.f32213t) {
                pVar.mo47843i();
                DrmSession drmSession = pVar.f32290i;
                if (drmSession != null) {
                    drmSession.mo47274b(pVar.f32286e);
                    pVar.f32290i = null;
                    pVar.f32289h = null;
                }
            }
        }
        mVar.f32205l.mo48165c(mVar);
        mVar.f32210q.removeCallbacksAndMessages((Object) null);
        mVar.f32211r = null;
        mVar.f32194M = true;
    }

    /* renamed from: h */
    public final C14304h mo47624h(C14344i.C14345a aVar, C14003j jVar, long j) {
        C14344i.C14345a aVar2 = aVar;
        C13999g a = this.f32247i.mo46816a();
        C14014t tVar = this.f32256r;
        if (tVar != null) {
            a.mo46806e(tVar);
        }
        C17954o0.C17960f fVar = this.f32246h;
        return new C14355m(fVar.f39189a, a, new C17989a((C18353k) ((C8549a) this.f32248j).f18618b), this.f32249k, new C14216b.C14217a(this.f31765d.f31566c, 0, aVar2), this.f32250l, new C14347j.C14348a(this.f31764c.f32163c, 0, aVar2), this, jVar, fVar.f39194f, this.f32251m);
    }

    /* renamed from: l */
    public final void mo47625l() {
    }

    /* renamed from: o */
    public final void mo47626o(C14014t tVar) {
        this.f32256r = tVar;
        this.f32249k.prepare();
        mo47836r();
    }

    /* renamed from: q */
    public final void mo47627q() {
        this.f32249k.release();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.exoplayer2.source.n$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47836r() {
        /*
            r7 = this;
            ji.n r6 = new ji.n
            long r1 = r7.f32253o
            boolean r3 = r7.f32254p
            boolean r4 = r7.f32255q
            jh.o0 r5 = r7.f32245g
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            boolean r0 = r7.f32252n
            if (r0 == 0) goto L_0x0018
            com.google.android.exoplayer2.source.n$a r0 = new com.google.android.exoplayer2.source.n$a
            r0.<init>(r6)
            r6 = r0
        L_0x0018:
            r7.mo47660p(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14363n.mo47836r():void");
    }

    /* renamed from: s */
    public final void mo47837s(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f32253o;
        }
        if (this.f32252n || this.f32253o != j || this.f32254p != z || this.f32255q != z2) {
            this.f32253o = j;
            this.f32254p = z;
            this.f32255q = z2;
            this.f32252n = false;
            mo47836r();
        }
    }
}
