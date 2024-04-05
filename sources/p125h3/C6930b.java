package p125h3;

import androidx.compose.p015ui.text.input.C1993m;
import java.util.List;
import p206p3.C7658d;
import p214q3.C7718a;
import p214q3.C7720c;

/* renamed from: h3.b */
public final class C6930b extends C6934f<Integer> {
    public C6930b(List<C7718a<Integer>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        return Integer.valueOf(mo19088l(aVar, f));
    }

    /* renamed from: l */
    public final int mo19088l(C7718a<Integer> aVar, float f) {
        T t = aVar.f17114b;
        if (t == null || aVar.f17115c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f17115c).intValue();
        C7720c<A> cVar = this.f15353e;
        if (cVar != null) {
            aVar.f17118f.floatValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            mo19081e();
            Integer num = (Integer) cVar.mo20193b(valueOf, valueOf2);
            if (num != null) {
                return num.intValue();
            }
        }
        return C1993m.m4380z(C7658d.m14697b(f, 0.0f, 1.0f), intValue, intValue2);
    }
}
