package p125h3;

import android.graphics.PointF;
import java.util.List;
import p003a2.C0023f;
import p206p3.C7658d;
import p214q3.C7718a;
import p214q3.C7720c;
import p214q3.C7721d;

/* renamed from: h3.k */
public final class C6939k extends C6934f<C7721d> {

    /* renamed from: l */
    public final C7721d f15371l = new C7721d();

    public C6939k(List<C7718a<C7721d>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        T t;
        T t2 = aVar.f17114b;
        if (t2 == null || (t = aVar.f17115c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C7721d dVar = (C7721d) t2;
        C7721d dVar2 = (C7721d) t;
        C7720c<A> cVar = this.f15353e;
        if (cVar != null) {
            aVar.f17118f.floatValue();
            mo19081e();
            C7721d dVar3 = (C7721d) cVar.mo20193b(dVar, dVar2);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        C7721d dVar4 = this.f15371l;
        float f2 = dVar.f17131a;
        float f3 = dVar2.f17131a;
        PointF pointF = C7658d.f16962a;
        float b = C0023f.m103b(f3, f2, f, f2);
        float f4 = dVar.f17132b;
        float b2 = C0023f.m103b(dVar2.f17132b, f4, f, f4);
        dVar4.f17131a = b;
        dVar4.f17132b = b2;
        return dVar4;
    }
}
