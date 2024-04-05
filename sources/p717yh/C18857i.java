package p717yh;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.i */
public final class C18857i implements C18858j {

    /* renamed from: a */
    public final List<C18848e0.C18849a> f41834a;

    /* renamed from: b */
    public final C18368v[] f41835b;

    /* renamed from: c */
    public boolean f41836c;

    /* renamed from: d */
    public int f41837d;

    /* renamed from: e */
    public int f41838e;

    /* renamed from: f */
    public long f41839f;

    public C18857i(List<C18848e0.C18849a> list) {
        this.f41834a = list;
        this.f41835b = new C18368v[list.size()];
    }

    /* renamed from: a */
    public final void mo70281a(C14077r rVar) {
        boolean z;
        boolean z2;
        if (this.f41836c) {
            if (this.f41837d == 2) {
                if (rVar.f30988c - rVar.f30987b == 0) {
                    z2 = false;
                } else {
                    if (rVar.mo46925p() != 32) {
                        this.f41836c = false;
                    }
                    this.f41837d--;
                    z2 = this.f41836c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f41837d == 1) {
                if (rVar.f30988c - rVar.f30987b == 0) {
                    z = false;
                } else {
                    if (rVar.mo46925p() != 0) {
                        this.f41836c = false;
                    }
                    this.f41837d--;
                    z = this.f41836c;
                }
                if (!z) {
                    return;
                }
            }
            int i = rVar.f30987b;
            int i2 = rVar.f30988c - i;
            for (C18368v d : this.f41835b) {
                rVar.mo46935z(i);
                d.mo69899d(i2, rVar);
            }
            this.f41838e += i2;
        }
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41836c = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        for (int i = 0; i < this.f41835b.length; i++) {
            C18848e0.C18849a aVar = this.f41834a.get(i);
            dVar.mo70293a();
            dVar.mo70294b();
            C18368v r = jVar.mo4164r(dVar.f41795d, 3);
            Format.C14176b bVar = new Format.C14176b();
            dVar.mo70294b();
            bVar.f31293a = dVar.f41796e;
            bVar.f31303k = "application/dvbsubs";
            bVar.f31305m = Collections.singletonList(aVar.f41788b);
            bVar.f31295c = aVar.f41787a;
            r.mo47752a(bVar.mo47144a());
            this.f41835b[i] = r;
        }
    }

    /* renamed from: e */
    public final void mo70284e() {
        if (this.f41836c) {
            for (C18368v c : this.f41835b) {
                c.mo47754c(this.f41839f, 1, this.f41838e, 0, (C18368v.C18369a) null);
            }
            this.f41836c = false;
        }
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        if ((i & 4) != 0) {
            this.f41836c = true;
            this.f41839f = j;
            this.f41838e = 0;
            this.f41837d = 2;
        }
    }
}
