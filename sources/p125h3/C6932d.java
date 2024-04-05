package p125h3;

import android.graphics.PointF;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.List;
import p003a2.C0023f;
import p167l3.C7237c;
import p206p3.C7658d;
import p214q3.C7718a;

/* renamed from: h3.d */
public final class C6932d extends C6934f<C7237c> {

    /* renamed from: l */
    public final C7237c f15360l;

    public C6932d(List<C7718a<C7237c>> list) {
        super(list);
        int i = 0;
        C7237c cVar = (C7237c) list.get(0).f17114b;
        i = cVar != null ? cVar.f16058b.length : i;
        this.f15360l = new C7237c(new float[i], new int[i]);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        C7237c cVar = this.f15360l;
        C7237c cVar2 = (C7237c) aVar.f17114b;
        C7237c cVar3 = (C7237c) aVar.f17115c;
        cVar.getClass();
        if (cVar2.f16058b.length == cVar3.f16058b.length) {
            int i = 0;
            while (true) {
                int[] iArr = cVar2.f16058b;
                if (i >= iArr.length) {
                    return this.f15360l;
                }
                float[] fArr = cVar.f16057a;
                float f2 = cVar2.f16057a[i];
                float f3 = cVar3.f16057a[i];
                PointF pointF = C7658d.f16962a;
                fArr[i] = C0023f.m103b(f3, f2, f, f2);
                cVar.f16058b[i] = C1993m.m4380z(f, iArr[i], cVar3.f16058b[i]);
                i++;
            }
        } else {
            StringBuilder h = C0072d.m201h("Cannot interpolate between gradients. Lengths vary (");
            h.append(cVar2.f16058b.length);
            h.append(" vs ");
            throw new IllegalArgumentException(C0071c.m191c(h, cVar3.f16058b.length, ")"));
        }
    }
}
