package p125h3;

import android.graphics.PointF;
import java.util.List;
import p003a2.C0023f;
import p214q3.C7718a;
import p214q3.C7720c;

/* renamed from: h3.j */
public final class C6938j extends C6934f<PointF> {

    /* renamed from: l */
    public final PointF f15370l = new PointF();

    public C6938j(List<C7718a<PointF>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        T t;
        T t2 = aVar.f17114b;
        if (t2 == null || (t = aVar.f17115c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C7720c<A> cVar = this.f15353e;
        if (cVar != null) {
            aVar.f17118f.floatValue();
            mo19081e();
            PointF pointF3 = (PointF) cVar.mo20193b(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f15370l;
        float f2 = pointF.x;
        float b = C0023f.m103b(pointF2.x, f2, f, f2);
        float f3 = pointF.y;
        pointF4.set(b, ((pointF2.y - f3) * f) + f3);
        return this.f15370l;
    }
}
