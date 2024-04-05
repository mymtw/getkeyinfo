package p206p3;

import android.graphics.PointF;
import java.util.ArrayList;
import p113g3.C6849j;
import p149j3.C7103d;

/* renamed from: p3.d */
public final class C7658d {

    /* renamed from: a */
    public static PointF f16962a = new PointF();

    /* renamed from: a */
    public static PointF m14696a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m14697b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m14698c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: d */
    public static void m14699d(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2, C6849j jVar) {
        if (dVar.mo19431a(i, jVar.getName())) {
            String name = jVar.getName();
            dVar2.getClass();
            C7103d dVar3 = new C7103d(dVar2);
            dVar3.f15803a.add(name);
            C7103d dVar4 = new C7103d(dVar3);
            dVar4.f15804b = jVar;
            arrayList.add(dVar4);
        }
    }
}
