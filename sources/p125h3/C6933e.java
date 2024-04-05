package p125h3;

import android.graphics.PointF;
import java.util.List;
import p206p3.C7658d;
import p214q3.C7718a;
import p214q3.C7720c;

/* renamed from: h3.e */
public final class C6933e extends C6934f<Integer> {
    public C6933e(List<C7718a<Integer>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        return Integer.valueOf(mo19091l(aVar, f));
    }

    /* renamed from: l */
    public final int mo19091l(C7718a<Integer> aVar, float f) {
        if (aVar.f17114b == null || aVar.f17115c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C7720c<A> cVar = this.f15353e;
        if (cVar != null) {
            aVar.f17118f.floatValue();
            T t = aVar.f17114b;
            T t2 = aVar.f17115c;
            mo19081e();
            Integer num = (Integer) cVar.mo20193b(t, t2);
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.f17121i == 784923401) {
            aVar.f17121i = ((Integer) aVar.f17114b).intValue();
        }
        int i = aVar.f17121i;
        if (aVar.f17122j == 784923401) {
            aVar.f17122j = ((Integer) aVar.f17115c).intValue();
        }
        int i2 = aVar.f17122j;
        PointF pointF = C7658d.f16962a;
        return (int) ((f * ((float) (i2 - i))) + ((float) i));
    }
}
