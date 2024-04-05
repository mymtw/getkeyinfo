package p717yh;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p513bj.C14075p;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.a0 */
public final class C18837a0 {

    /* renamed from: a */
    public final List<Format> f41710a;

    /* renamed from: b */
    public final C18368v[] f41711b;

    public C18837a0(List<Format> list) {
        this.f41710a = list;
        this.f41711b = new C18368v[list.size()];
    }

    /* renamed from: a */
    public final void mo70280a(C18351j jVar, C18848e0.C18852d dVar) {
        for (int i = 0; i < this.f41711b.length; i++) {
            dVar.mo70293a();
            dVar.mo70294b();
            C18368v r = jVar.mo4164r(dVar.f41795d, 3);
            Format format = this.f41710a.get(i);
            String str = format.sampleMimeType;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            C14075p.m21692d(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = format.f31288id;
            if (str2 == null) {
                dVar.mo70294b();
                str2 = dVar.f41796e;
            }
            Format.C14176b bVar = new Format.C14176b();
            bVar.f31293a = str2;
            bVar.f31303k = str;
            bVar.f31296d = format.selectionFlags;
            bVar.f31295c = format.language;
            bVar.f31291C = format.accessibilityChannel;
            bVar.f31305m = format.initializationData;
            r.mo47752a(bVar.mo47144a());
            this.f41711b[i] = r;
        }
    }
}
