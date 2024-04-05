package p125h3;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0023f;
import p149j3.C7100a;
import p167l3.C7241g;
import p206p3.C7656b;
import p206p3.C7658d;
import p214q3.C7718a;

/* renamed from: h3.l */
public final class C6940l extends C6928a<C7241g, Path> {

    /* renamed from: l */
    public final C7241g f15372l = new C7241g();

    /* renamed from: m */
    public final Path f15373m = new Path();

    public C6940l(List<C7718a<C7241g>> list) {
        super(list);
    }

    /* renamed from: h */
    public final Object mo19084h(C7718a aVar, float f) {
        C7241g gVar = (C7241g) aVar.f17114b;
        C7241g gVar2 = (C7241g) aVar.f17115c;
        C7241g gVar3 = this.f15372l;
        if (gVar3.f16078b == null) {
            gVar3.f16078b = new PointF();
        }
        gVar3.f16079c = gVar.f16079c || gVar2.f16079c;
        if (gVar.f16077a.size() != gVar2.f16077a.size()) {
            StringBuilder h = C0072d.m201h("Curves must have the same number of control points. Shape 1: ");
            h.append(gVar.f16077a.size());
            h.append("\tShape 2: ");
            h.append(gVar2.f16077a.size());
            C7656b.m14695b(h.toString());
        }
        int min = Math.min(gVar.f16077a.size(), gVar2.f16077a.size());
        if (gVar3.f16077a.size() < min) {
            for (int size = gVar3.f16077a.size(); size < min; size++) {
                gVar3.f16077a.add(new C7100a());
            }
        } else if (gVar3.f16077a.size() > min) {
            for (int size2 = gVar3.f16077a.size() - 1; size2 >= min; size2--) {
                ArrayList arrayList = gVar3.f16077a;
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = gVar.f16078b;
        PointF pointF2 = gVar2.f16078b;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = C7658d.f16962a;
        float b = C0023f.m103b(f3, f2, f, f2);
        float f4 = pointF.y;
        float b2 = C0023f.m103b(pointF2.y, f4, f, f4);
        if (gVar3.f16078b == null) {
            gVar3.f16078b = new PointF();
        }
        gVar3.f16078b.set(b, b2);
        for (int size3 = gVar3.f16077a.size() - 1; size3 >= 0; size3--) {
            C7100a aVar2 = (C7100a) gVar.f16077a.get(size3);
            C7100a aVar3 = (C7100a) gVar2.f16077a.get(size3);
            PointF pointF4 = aVar2.f15793a;
            PointF pointF5 = aVar2.f15794b;
            PointF pointF6 = aVar2.f15795c;
            PointF pointF7 = aVar3.f15793a;
            PointF pointF8 = aVar3.f15794b;
            PointF pointF9 = aVar3.f15795c;
            float f5 = pointF4.x;
            float b3 = C0023f.m103b(pointF7.x, f5, f, f5);
            float f6 = pointF4.y;
            ((C7100a) gVar3.f16077a.get(size3)).f15793a.set(b3, C0023f.m103b(pointF7.y, f6, f, f6));
            float f7 = pointF5.x;
            float b4 = C0023f.m103b(pointF8.x, f7, f, f7);
            float f8 = pointF5.y;
            ((C7100a) gVar3.f16077a.get(size3)).f15794b.set(b4, C0023f.m103b(pointF8.y, f8, f, f8));
            float f9 = pointF6.x;
            float b5 = C0023f.m103b(pointF9.x, f9, f, f9);
            float f10 = pointF6.y;
            ((C7100a) gVar3.f16077a.get(size3)).f15795c.set(b5, C0023f.m103b(pointF9.y, f10, f, f10));
        }
        C7241g gVar4 = this.f15372l;
        Path path = this.f15373m;
        path.reset();
        PointF pointF10 = gVar4.f16078b;
        path.moveTo(pointF10.x, pointF10.y);
        C7658d.f16962a.set(pointF10.x, pointF10.y);
        for (int i = 0; i < gVar4.f16077a.size(); i++) {
            C7100a aVar4 = (C7100a) gVar4.f16077a.get(i);
            PointF pointF11 = aVar4.f15793a;
            PointF pointF12 = aVar4.f15794b;
            PointF pointF13 = aVar4.f15795c;
            if (!pointF11.equals(C7658d.f16962a) || !pointF12.equals(pointF13)) {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            } else {
                path.lineTo(pointF13.x, pointF13.y);
            }
            C7658d.f16962a.set(pointF13.x, pointF13.y);
        }
        if (gVar4.f16079c) {
            path.close();
        }
        return this.f15373m;
    }
}
