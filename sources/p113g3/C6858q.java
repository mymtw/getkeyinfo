package p113g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C4845a;
import p125h3.C6928a;
import p125h3.C6930b;
import p125h3.C6944p;
import p214q3.C7720c;

/* renamed from: g3.q */
public final class C6858q extends C6839a {

    /* renamed from: o */
    public final C4845a f15161o;

    /* renamed from: p */
    public final String f15162p;

    /* renamed from: q */
    public final boolean f15163q;

    /* renamed from: r */
    public final C6930b f15164r;

    /* renamed from: s */
    public C6944p f15165s;

    public C6858q(LottieDrawable lottieDrawable, C4845a aVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, aVar, shapeStroke.f10938g.toPaintCap(), shapeStroke.f10939h.toPaintJoin(), shapeStroke.f10940i, shapeStroke.f10936e, shapeStroke.f10937f, shapeStroke.f10934c, shapeStroke.f10933b);
        this.f15161o = aVar;
        this.f15162p = shapeStroke.f10932a;
        this.f15163q = shapeStroke.f10941j;
        C6928a<Integer, Integer> a = shapeStroke.f10935d.mo19485a();
        this.f15164r = (C6930b) a;
        a.mo19077a(this);
        aVar.mo14606e(a);
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        super.mo14604c(cVar, obj);
        if (obj == C4840k.f10877b) {
            this.f15164r.mo19087k(cVar);
        } else if (obj != C4840k.f10874B) {
        } else {
            if (cVar == null) {
                this.f15165s = null;
                return;
            }
            C6944p pVar = new C6944p(cVar, null);
            this.f15165s = pVar;
            pVar.mo19077a(this);
            this.f15161o.mo14606e(this.f15164r);
        }
    }

    /* renamed from: f */
    public final void mo14607f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15163q) {
            LPaint lPaint = this.f15048i;
            C6930b bVar = this.f15164r;
            lPaint.setColor(bVar.mo19088l(bVar.mo19078b(), bVar.mo19080d()));
            C6944p pVar = this.f15165s;
            if (pVar != null) {
                this.f15048i.setColorFilter((ColorFilter) pVar.mo19083g());
            }
            super.mo14607f(canvas, matrix, i);
        }
    }

    public final String getName() {
        return this.f15162p;
    }
}
