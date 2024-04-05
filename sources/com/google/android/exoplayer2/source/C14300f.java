package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.trackselection.C14386b;
import java.io.IOException;
import p505aj.C14003j;
import p513bj.C14049b0;
import p594jh.C17918h1;
import p595ji.C18000l;

/* renamed from: com.google.android.exoplayer2.source.f */
public final class C14300f implements C14304h, C14304h.C14305a {

    /* renamed from: b */
    public final C14344i.C14345a f31812b;

    /* renamed from: c */
    public final long f31813c;

    /* renamed from: d */
    public final C14003j f31814d;

    /* renamed from: e */
    public C14344i f31815e;

    /* renamed from: f */
    public C14304h f31816f;

    /* renamed from: g */
    public C14304h.C14305a f31817g;

    /* renamed from: h */
    public long f31818h = -9223372036854775807L;

    public C14300f(C14344i.C14345a aVar, C14003j jVar, long j) {
        this.f31812b = aVar;
        this.f31814d = jVar;
        this.f31813c = j;
    }

    /* renamed from: a */
    public final boolean mo1409a() {
        C14304h hVar = this.f31816f;
        return hVar != null && hVar.mo1409a();
    }

    /* renamed from: b */
    public final long mo1410b() {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo1410b();
    }

    /* renamed from: c */
    public final boolean mo1411c(long j) {
        C14304h hVar = this.f31816f;
        return hVar != null && hVar.mo1411c(j);
    }

    /* renamed from: d */
    public final long mo1412d() {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo1412d();
    }

    /* renamed from: e */
    public final void mo1413e(long j) {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        hVar.mo1413e(j);
    }

    /* renamed from: f */
    public final long mo47669f(C14386b[] bVarArr, boolean[] zArr, C18000l[] lVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f31818h;
        if (j3 == -9223372036854775807L || j != this.f31813c) {
            j2 = j;
        } else {
            this.f31818h = -9223372036854775807L;
            j2 = j3;
        }
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo47669f(bVarArr, zArr, lVarArr, zArr2, j2);
    }

    /* renamed from: g */
    public final void mo47694g(C14344i.C14345a aVar) {
        long j = this.f31813c;
        long j2 = this.f31818h;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        C14344i iVar = this.f31815e;
        iVar.getClass();
        C14304h h = iVar.mo47624h(aVar, this.f31814d, j);
        this.f31816f = h;
        if (this.f31817g != null) {
            h.mo47673k(this, j);
        }
    }

    /* renamed from: h */
    public final void mo47695h() {
        if (this.f31816f != null) {
            C14344i iVar = this.f31815e;
            iVar.getClass();
            iVar.mo47623f(this.f31816f);
        }
    }

    /* renamed from: i */
    public final long mo47671i(long j) {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo47671i(j);
    }

    /* renamed from: j */
    public final long mo47672j() {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo47672j();
    }

    /* renamed from: k */
    public final void mo47673k(C14304h.C14305a aVar, long j) {
        this.f31817g = aVar;
        C14304h hVar = this.f31816f;
        if (hVar != null) {
            long j2 = this.f31813c;
            long j3 = this.f31818h;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            hVar.mo47673k(this, j2);
        }
    }

    /* renamed from: l */
    public final void mo47674l(C14372q qVar) {
        C14304h hVar = (C14304h) qVar;
        C14304h.C14305a aVar = this.f31817g;
        int i = C14049b0.f30913a;
        aVar.mo47674l(this);
    }

    /* renamed from: m */
    public final void mo47675m(C14304h hVar) {
        C14304h.C14305a aVar = this.f31817g;
        int i = C14049b0.f30913a;
        aVar.mo47675m(this);
    }

    /* renamed from: o */
    public final void mo47676o() throws IOException {
        try {
            C14304h hVar = this.f31816f;
            if (hVar != null) {
                hVar.mo47676o();
                return;
            }
            C14344i iVar = this.f31815e;
            if (iVar != null) {
                iVar.mo47625l();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: q */
    public final TrackGroupArray mo47677q() {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo47677q();
    }

    /* renamed from: t */
    public final void mo47678t(long j, boolean z) {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        hVar.mo47678t(j, z);
    }

    /* renamed from: u */
    public final long mo47679u(long j, C17918h1 h1Var) {
        C14304h hVar = this.f31816f;
        int i = C14049b0.f30913a;
        return hVar.mo47679u(j, h1Var);
    }
}
