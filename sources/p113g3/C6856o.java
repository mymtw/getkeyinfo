package p113g3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6931c;
import p125h3.C6943o;
import p149j3.C7103d;
import p158k3.C7188k;
import p167l3.C7240f;
import p206p3.C7658d;
import p214q3.C7720c;

/* renamed from: g3.o */
public final class C6856o implements C6843d, C6852l, C6848i, C6928a.C6929a, C6849j {

    /* renamed from: a */
    public final Matrix f15145a = new Matrix();

    /* renamed from: b */
    public final Path f15146b = new Path();

    /* renamed from: c */
    public final LottieDrawable f15147c;

    /* renamed from: d */
    public final C4845a f15148d;

    /* renamed from: e */
    public final String f15149e;

    /* renamed from: f */
    public final boolean f15150f;

    /* renamed from: g */
    public final C6931c f15151g;

    /* renamed from: h */
    public final C6931c f15152h;

    /* renamed from: i */
    public final C6943o f15153i;

    /* renamed from: j */
    public C6842c f15154j;

    public C6856o(LottieDrawable lottieDrawable, C4845a aVar, C7240f fVar) {
        this.f15147c = lottieDrawable;
        this.f15148d = aVar;
        this.f15149e = fVar.f16072a;
        this.f15150f = fVar.f16076e;
        C6928a<Float, Float> a = fVar.f16073b.mo19485a();
        this.f15151g = (C6931c) a;
        aVar.mo14606e(a);
        a.mo19077a(this);
        C6928a<Float, Float> a2 = fVar.f16074c.mo19485a();
        this.f15152h = (C6931c) a2;
        aVar.mo14606e(a2);
        a2.mo19077a(this);
        C7188k kVar = fVar.f16075d;
        kVar.getClass();
        C6943o oVar = new C6943o(kVar);
        this.f15153i = oVar;
        oVar.mo19093a(aVar);
        oVar.mo19094b(this);
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15147c.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        this.f15154j.mo14603b(list, list2);
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        if (!this.f15153i.mo19095c(cVar, obj)) {
            if (obj == C4840k.f10892q) {
                this.f15151g.mo19087k(cVar);
            } else if (obj == C4840k.f10893r) {
                this.f15152h.mo19087k(cVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        this.f15154j.mo14605d(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18979e(java.util.ListIterator<p113g3.C6841b> r9) {
        /*
            r8 = this;
            g3.c r0 = r8.f15154j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            g3.c r9 = new g3.c
            com.airbnb.lottie.LottieDrawable r2 = r8.f15147c
            com.airbnb.lottie.model.layer.a r3 = r8.f15148d
            boolean r5 = r8.f15150f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f15154j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113g3.C6856o.mo18979e(java.util.ListIterator):void");
    }

    /* renamed from: f */
    public final void mo14607f(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f15151g.mo19083g()).floatValue();
        float floatValue2 = ((Float) this.f15152h.mo19083g()).floatValue();
        float floatValue3 = this.f15153i.f15389m.mo19083g().floatValue() / 100.0f;
        float floatValue4 = this.f15153i.f15390n.mo19083g().floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.f15145a.set(matrix);
                float f = (float) i2;
                this.f15145a.preConcat(this.f15153i.mo19097e(f + floatValue2));
                PointF pointF = C7658d.f16962a;
                this.f15154j.mo14607f(canvas, this.f15145a, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * ((float) i)));
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }

    public final String getName() {
        return this.f15149e;
    }

    public final Path getPath() {
        Path path = this.f15154j.getPath();
        this.f15146b.reset();
        float floatValue = ((Float) this.f15151g.mo19083g()).floatValue();
        float floatValue2 = ((Float) this.f15152h.mo19083g()).floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i < 0) {
                return this.f15146b;
            }
            this.f15145a.set(this.f15153i.mo19097e(((float) i) + floatValue2));
            this.f15146b.addPath(path, this.f15145a);
        }
    }
}
