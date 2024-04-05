package p717yh;

import com.google.android.exoplayer2.Format;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.s */
public final class C18873s implements C18881y {

    /* renamed from: a */
    public Format f42008a;

    /* renamed from: b */
    public C14086y f42009b;

    /* renamed from: c */
    public C18368v f42010c;

    public C18873s(String str) {
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31303k = str;
        this.f42008a = bVar.mo47144a();
    }

    /* renamed from: a */
    public final void mo70287a(C14077r rVar) {
        long j;
        C14075p.m21696h(this.f42009b);
        int i = C14049b0.f30913a;
        long c = this.f42009b.mo46959c();
        long j2 = -9223372036854775807L;
        if (c != -9223372036854775807L) {
            Format format = this.f42008a;
            if (c != format.subsampleOffsetUs) {
                Format.C14176b buildUpon = format.buildUpon();
                buildUpon.f31307o = c;
                Format a = buildUpon.mo47144a();
                this.f42008a = a;
                this.f42010c.mo47752a(a);
            }
            int i2 = rVar.f30988c - rVar.f30987b;
            this.f42010c.mo69899d(i2, rVar);
            C18368v vVar = this.f42010c;
            C14086y yVar = this.f42009b;
            synchronized (yVar) {
                long j3 = yVar.f31020d;
                if (j3 != -9223372036854775807L) {
                    j2 = yVar.f31019c + j3;
                } else {
                    long j4 = yVar.f31018b;
                    if (j4 != Long.MAX_VALUE) {
                        j = j4;
                    }
                }
                j = j2;
            }
            vVar.mo47754c(j, 1, i2, 0, (C18368v.C18369a) null);
        }
    }

    /* renamed from: b */
    public final void mo70288b(C14086y yVar, C18351j jVar, C18848e0.C18852d dVar) {
        this.f42009b = yVar;
        dVar.mo70293a();
        dVar.mo70294b();
        C18368v r = jVar.mo4164r(dVar.f41795d, 5);
        this.f42010c = r;
        r.mo47752a(this.f42008a);
    }
}
