package p113g3;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.compose.p015ui.platform.C1830f0;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6931c;
import p125h3.C6938j;
import p149j3.C7103d;
import p167l3.C7239e;
import p206p3.C7658d;
import p214q3.C7720c;

/* renamed from: g3.n */
public final class C6855n implements C6928a.C6929a, C6849j, C6852l {

    /* renamed from: a */
    public final Path f15135a = new Path();

    /* renamed from: b */
    public final RectF f15136b = new RectF();

    /* renamed from: c */
    public final String f15137c;

    /* renamed from: d */
    public final boolean f15138d;

    /* renamed from: e */
    public final LottieDrawable f15139e;

    /* renamed from: f */
    public final C6928a<?, PointF> f15140f;

    /* renamed from: g */
    public final C6938j f15141g;

    /* renamed from: h */
    public final C6931c f15142h;

    /* renamed from: i */
    public C1830f0 f15143i = new C1830f0(2, 0);

    /* renamed from: j */
    public boolean f15144j;

    public C6855n(LottieDrawable lottieDrawable, C4845a aVar, C7239e eVar) {
        this.f15137c = eVar.f16067a;
        this.f15138d = eVar.f16071e;
        this.f15139e = lottieDrawable;
        C6928a<PointF, PointF> a = eVar.f16068b.mo19485a();
        this.f15140f = a;
        C6928a<PointF, PointF> a2 = eVar.f16069c.mo19485a();
        this.f15141g = (C6938j) a2;
        C6928a<Float, Float> a3 = eVar.f16070d.mo19485a();
        this.f15142h = (C6931c) a3;
        aVar.mo14606e(a);
        aVar.mo14606e(a2);
        aVar.mo14606e(a3);
        a.mo19077a(this);
        a2.mo19077a(this);
        a3.mo19077a(this);
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15144j = false;
        this.f15139e.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                C6841b bVar = (C6841b) arrayList.get(i);
                if (bVar instanceof C6859r) {
                    C6859r rVar = (C6859r) bVar;
                    if (rVar.f15168c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f15143i.f4088a).add(rVar);
                        rVar.mo18981c(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        if (obj == C4840k.f10883h) {
            this.f15141g.mo19087k(cVar);
        } else if (obj == C4840k.f10885j) {
            this.f15140f.mo19087k(cVar);
        } else if (obj == C4840k.f10884i) {
            this.f15142h.mo19087k(cVar);
        }
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }

    public final String getName() {
        return this.f15137c;
    }

    public final Path getPath() {
        if (this.f15144j) {
            return this.f15135a;
        }
        this.f15135a.reset();
        if (this.f15138d) {
            this.f15144j = true;
            return this.f15135a;
        }
        PointF pointF = (PointF) this.f15141g.mo19083g();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        C6931c cVar = this.f15142h;
        float l = cVar == null ? 0.0f : cVar.mo19089l();
        float min = Math.min(f, f2);
        if (l > min) {
            l = min;
        }
        PointF g = this.f15140f.mo19083g();
        this.f15135a.moveTo(g.x + f, (g.y - f2) + l);
        this.f15135a.lineTo(g.x + f, (g.y + f2) - l);
        int i = (l > 0.0f ? 1 : (l == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f15136b;
            float f3 = g.x + f;
            float f4 = l * 2.0f;
            float f5 = g.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            this.f15135a.arcTo(this.f15136b, 0.0f, 90.0f, false);
        }
        this.f15135a.lineTo((g.x - f) + l, g.y + f2);
        if (i > 0) {
            RectF rectF2 = this.f15136b;
            float f6 = g.x - f;
            float f7 = g.y + f2;
            float f8 = l * 2.0f;
            rectF2.set(f6, f7 - f8, f8 + f6, f7);
            this.f15135a.arcTo(this.f15136b, 90.0f, 90.0f, false);
        }
        this.f15135a.lineTo(g.x - f, (g.y - f2) + l);
        if (i > 0) {
            RectF rectF3 = this.f15136b;
            float f9 = g.x - f;
            float f10 = g.y - f2;
            float f11 = l * 2.0f;
            rectF3.set(f9, f10, f9 + f11, f11 + f10);
            this.f15135a.arcTo(this.f15136b, 180.0f, 90.0f, false);
        }
        this.f15135a.lineTo((g.x + f) - l, g.y - f2);
        if (i > 0) {
            RectF rectF4 = this.f15136b;
            float f12 = g.x + f;
            float f13 = l * 2.0f;
            float f14 = g.y - f2;
            rectF4.set(f12 - f13, f14, f12, f13 + f14);
            this.f15135a.arcTo(this.f15136b, 270.0f, 90.0f, false);
        }
        this.f15135a.close();
        this.f15143i.mo7211c(this.f15135a);
        this.f15144j = true;
        return this.f15135a;
    }
}
