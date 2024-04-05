package p717yh;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18343b;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.f0 */
public final class C18854f0 {

    /* renamed from: a */
    public final List<Format> f41819a;

    /* renamed from: b */
    public final C18368v[] f41820b;

    public C18854f0(List<Format> list) {
        this.f41819a = list;
        this.f41820b = new C18368v[list.size()];
    }

    /* renamed from: a */
    public final void mo70296a(C14077r rVar, long j) {
        if (rVar.f30988c - rVar.f30987b >= 9) {
            int c = rVar.mo46912c();
            int c2 = rVar.mo46912c();
            int p = rVar.mo46925p();
            if (c == 434 && c2 == 1195456820 && p == 3) {
                C18343b.m30977b(j, rVar, this.f41820b);
            }
        }
    }

    /* renamed from: b */
    public final void mo70297b(C18351j jVar, C18848e0.C18852d dVar) {
        for (int i = 0; i < this.f41820b.length; i++) {
            dVar.mo70293a();
            dVar.mo70294b();
            C18368v r = jVar.mo4164r(dVar.f41795d, 3);
            Format format = this.f41819a.get(i);
            String str = format.sampleMimeType;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            C14075p.m21692d(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            Format.C14176b bVar = new Format.C14176b();
            dVar.mo70294b();
            bVar.f31293a = dVar.f41796e;
            bVar.f31303k = str;
            bVar.f31296d = format.selectionFlags;
            bVar.f31295c = format.language;
            bVar.f31291C = format.accessibilityChannel;
            bVar.f31305m = format.initializationData;
            r.mo47752a(bVar.mo47144a());
            this.f41820b[i] = r;
        }
    }
}
