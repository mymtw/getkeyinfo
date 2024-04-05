package p125h3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p214q3.C7718a;
import p214q3.C7720c;

/* renamed from: h3.i */
public final class C6937i extends C6934f<PointF> {

    /* renamed from: l */
    public final PointF f15366l = new PointF();

    /* renamed from: m */
    public final float[] f15367m = new float[2];

    /* renamed from: n */
    public C6936h f15368n;

    /* renamed from: o */
    public PathMeasure f15369o = new PathMeasure();

    public C6937i(List<? extends C7718a<PointF>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        C6936h hVar = (C6936h) aVar;
        Path path = hVar.f15364o;
        if (path == null) {
            return (PointF) aVar.f17114b;
        }
        C7720c<A> cVar = this.f15353e;
        if (cVar != null) {
            hVar.f17118f.floatValue();
            T t = hVar.f17114b;
            T t2 = hVar.f17115c;
            mo19081e();
            PointF pointF = (PointF) cVar.mo20193b(t, t2);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f15368n != hVar) {
            this.f15369o.setPath(path, false);
            this.f15368n = hVar;
        }
        PathMeasure pathMeasure = this.f15369o;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.f15367m, (float[]) null);
        PointF pointF2 = this.f15366l;
        float[] fArr = this.f15367m;
        pointF2.set(fArr[0], fArr[1]);
        return this.f15366l;
    }
}
