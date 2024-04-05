package p717yh;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.o */
public final class C18869o implements C18858j {

    /* renamed from: a */
    public final C14077r f41964a = new C14077r(10);

    /* renamed from: b */
    public C18368v f41965b;

    /* renamed from: c */
    public boolean f41966c;

    /* renamed from: d */
    public long f41967d;

    /* renamed from: e */
    public int f41968e;

    /* renamed from: f */
    public int f41969f;

    /* renamed from: a */
    public final void mo70281a(C14077r rVar) {
        C14075p.m21696h(this.f41965b);
        if (this.f41966c) {
            int i = rVar.f30988c - rVar.f30987b;
            int i2 = this.f41969f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(rVar.f30986a, rVar.f30987b, this.f41964a.f30986a, this.f41969f, min);
                if (this.f41969f + min == 10) {
                    this.f41964a.mo46935z(0);
                    if (73 == this.f41964a.mo46925p() && 68 == this.f41964a.mo46925p() && 51 == this.f41964a.mo46925p()) {
                        this.f41964a.mo46909A(3);
                        this.f41968e = this.f41964a.mo46924o() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f41966c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f41968e - this.f41969f);
            this.f41965b.mo69899d(min2, rVar);
            this.f41969f += min2;
        }
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41966c = false;
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        C18368v r = jVar.mo4164r(dVar.f41795d, 5);
        this.f41965b = r;
        Format.C14176b bVar = new Format.C14176b();
        dVar.mo70294b();
        bVar.f31293a = dVar.f41796e;
        bVar.f31303k = "application/id3";
        r.mo47752a(bVar.mo47144a());
    }

    /* renamed from: e */
    public final void mo70284e() {
        int i;
        C14075p.m21696h(this.f41965b);
        if (this.f41966c && (i = this.f41968e) != 0 && this.f41969f == i) {
            this.f41965b.mo47754c(this.f41967d, 1, i, 0, (C18368v.C18369a) null);
            this.f41966c = false;
        }
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        if ((i & 4) != 0) {
            this.f41966c = true;
            this.f41967d = j;
            this.f41968e = 0;
            this.f41969f = 0;
        }
    }
}
