package p125h3;

import android.graphics.PointF;
import java.util.List;
import p003a2.C0023f;
import p206p3.C7658d;
import p214q3.C7718a;
import p214q3.C7720c;

/* renamed from: h3.c */
public final class C6931c extends C6934f<Float> {
    public C6931c(List<C7718a<Float>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        return Float.valueOf(mo19090m(aVar, f));
    }

    /* renamed from: l */
    public final float mo19089l() {
        return mo19090m(mo19078b(), mo19080d());
    }

    /* renamed from: m */
    public final float mo19090m(C7718a<Float> aVar, float f) {
        if (aVar.f17114b == null || aVar.f17115c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C7720c<A> cVar = this.f15353e;
        if (cVar != null) {
            aVar.f17118f.floatValue();
            T t = aVar.f17114b;
            T t2 = aVar.f17115c;
            mo19081e();
            Float f2 = (Float) cVar.mo20193b(t, t2);
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        if (aVar.f17119g == -3987645.8f) {
            aVar.f17119g = ((Float) aVar.f17114b).floatValue();
        }
        float f3 = aVar.f17119g;
        if (aVar.f17120h == -3987645.8f) {
            aVar.f17120h = ((Float) aVar.f17115c).floatValue();
        }
        float f4 = aVar.f17120h;
        PointF pointF = C7658d.f16962a;
        return C0023f.m103b(f4, f3, f, f3);
    }
}
