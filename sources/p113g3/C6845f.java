package p113g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6930b;
import p125h3.C6933e;
import p125h3.C6944p;
import p149j3.C7103d;
import p167l3.C7242h;
import p206p3.C7658d;
import p214q3.C7720c;
import p772tq.C20203a;

/* renamed from: g3.f */
public final class C6845f implements C6843d, C6928a.C6929a, C6849j {

    /* renamed from: a */
    public final Path f15075a;

    /* renamed from: b */
    public final LPaint f15076b = new LPaint(1);

    /* renamed from: c */
    public final C4845a f15077c;

    /* renamed from: d */
    public final String f15078d;

    /* renamed from: e */
    public final boolean f15079e;

    /* renamed from: f */
    public final ArrayList f15080f = new ArrayList();

    /* renamed from: g */
    public final C6930b f15081g;

    /* renamed from: h */
    public final C6933e f15082h;

    /* renamed from: i */
    public C6944p f15083i;

    /* renamed from: j */
    public final LottieDrawable f15084j;

    public C6845f(LottieDrawable lottieDrawable, C4845a aVar, C7242h hVar) {
        Path path = new Path();
        this.f15075a = path;
        this.f15077c = aVar;
        this.f15078d = hVar.f16082c;
        this.f15079e = hVar.f16085f;
        this.f15084j = lottieDrawable;
        if (hVar.f16083d == null || hVar.f16084e == null) {
            this.f15081g = null;
            this.f15082h = null;
            return;
        }
        path.setFillType(hVar.f16081b);
        C6928a<Integer, Integer> a = hVar.f16083d.mo19485a();
        this.f15081g = (C6930b) a;
        a.mo19077a(this);
        aVar.mo14606e(a);
        C6928a<Integer, Integer> a2 = hVar.f16084e.mo19485a();
        this.f15082h = (C6933e) a2;
        a2.mo19077a(this);
        aVar.mo14606e(a2);
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15084j.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C6841b bVar = list2.get(i);
            if (bVar instanceof C6852l) {
                this.f15080f.add((C6852l) bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        if (obj == C4840k.f10876a) {
            this.f15081g.mo19087k(cVar);
        } else if (obj == C4840k.f10879d) {
            this.f15082h.mo19087k(cVar);
        } else if (obj != C4840k.f10874B) {
        } else {
            if (cVar == null) {
                this.f15083i = null;
                return;
            }
            C6944p pVar = new C6944p(cVar, null);
            this.f15083i = pVar;
            pVar.mo19077a(this);
            this.f15077c.mo14606e(this.f15083i);
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        this.f15075a.reset();
        for (int i = 0; i < this.f15080f.size(); i++) {
            this.f15075a.addPath(((C6852l) this.f15080f.get(i)).getPath(), matrix);
        }
        this.f15075a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public final void mo14607f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15079e) {
            LPaint lPaint = this.f15076b;
            C6930b bVar = this.f15081g;
            lPaint.setColor(bVar.mo19088l(bVar.mo19078b(), bVar.mo19080d()));
            LPaint lPaint2 = this.f15076b;
            PointF pointF = C7658d.f16962a;
            lPaint2.setAlpha(Math.max(0, Math.min(255, (int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f15082h.mo19083g()).intValue())) / 100.0f) * 255.0f))));
            C6944p pVar = this.f15083i;
            if (pVar != null) {
                this.f15076b.setColorFilter((ColorFilter) pVar.mo19083g());
            }
            this.f15075a.reset();
            for (int i2 = 0; i2 < this.f15080f.size(); i2++) {
                this.f15075a.addPath(((C6852l) this.f15080f.get(i2)).getPath(), matrix);
            }
            canvas.drawPath(this.f15075a, this.f15076b);
            C20203a.m34518A();
        }
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }

    public final String getName() {
        return this.f15078d;
    }
}
