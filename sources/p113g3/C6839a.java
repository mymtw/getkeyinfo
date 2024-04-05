package p113g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6931c;
import p125h3.C6933e;
import p125h3.C6944p;
import p149j3.C7103d;
import p158k3.C7179b;
import p158k3.C7181d;
import p206p3.C7658d;
import p206p3.C7659e;
import p214q3.C7720c;
import p772tq.C20203a;

/* renamed from: g3.a */
public abstract class C6839a implements C6928a.C6929a, C6849j, C6843d {

    /* renamed from: a */
    public final PathMeasure f15040a = new PathMeasure();

    /* renamed from: b */
    public final Path f15041b = new Path();

    /* renamed from: c */
    public final Path f15042c = new Path();

    /* renamed from: d */
    public final RectF f15043d = new RectF();

    /* renamed from: e */
    public final LottieDrawable f15044e;

    /* renamed from: f */
    public final C4845a f15045f;

    /* renamed from: g */
    public final ArrayList f15046g = new ArrayList();

    /* renamed from: h */
    public final float[] f15047h;

    /* renamed from: i */
    public final LPaint f15048i;

    /* renamed from: j */
    public final C6931c f15049j;

    /* renamed from: k */
    public final C6933e f15050k;

    /* renamed from: l */
    public final ArrayList f15051l;

    /* renamed from: m */
    public final C6931c f15052m;

    /* renamed from: n */
    public C6944p f15053n;

    /* renamed from: g3.a$a */
    public static final class C6840a {

        /* renamed from: a */
        public final ArrayList f15054a = new ArrayList();

        /* renamed from: b */
        public final C6859r f15055b;

        public C6840a(C6859r rVar) {
            this.f15055b = rVar;
        }
    }

    public C6839a(LottieDrawable lottieDrawable, C4845a aVar, Paint.Cap cap, Paint.Join join, float f, C7181d dVar, C7179b bVar, List<C7179b> list, C7179b bVar2) {
        LPaint lPaint = new LPaint(1);
        this.f15048i = lPaint;
        this.f15044e = lottieDrawable;
        this.f15045f = aVar;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.f15050k = (C6933e) dVar.mo19485a();
        this.f15049j = (C6931c) bVar.mo19485a();
        if (bVar2 == null) {
            this.f15052m = null;
        } else {
            this.f15052m = (C6931c) bVar2.mo19485a();
        }
        this.f15051l = new ArrayList(list.size());
        this.f15047h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f15051l.add(list.get(i).mo19485a());
        }
        aVar.mo14606e(this.f15050k);
        aVar.mo14606e(this.f15049j);
        for (int i2 = 0; i2 < this.f15051l.size(); i2++) {
            aVar.mo14606e((C6928a) this.f15051l.get(i2));
        }
        C6931c cVar = this.f15052m;
        if (cVar != null) {
            aVar.mo14606e(cVar);
        }
        this.f15050k.mo19077a(this);
        this.f15049j.mo19077a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C6928a) this.f15051l.get(i3)).mo19077a(this);
        }
        C6931c cVar2 = this.f15052m;
        if (cVar2 != null) {
            cVar2.mo19077a(this);
        }
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15044e.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        ArrayList arrayList = (ArrayList) list;
        C6840a aVar = null;
        C6859r rVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C6841b bVar = (C6841b) arrayList.get(size);
            if (bVar instanceof C6859r) {
                C6859r rVar2 = (C6859r) bVar;
                if (rVar2.f15168c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.mo18981c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            C6841b bVar2 = list2.get(size2);
            if (bVar2 instanceof C6859r) {
                C6859r rVar3 = (C6859r) bVar2;
                if (rVar3.f15168c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        this.f15046g.add(aVar);
                    }
                    C6840a aVar2 = new C6840a(rVar3);
                    rVar3.mo18981c(this);
                    aVar = aVar2;
                }
            }
            if (bVar2 instanceof C6852l) {
                if (aVar == null) {
                    aVar = new C6840a(rVar);
                }
                aVar.f15054a.add((C6852l) bVar2);
            }
        }
        if (aVar != null) {
            this.f15046g.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo14604c(C7720c cVar, Object obj) {
        if (obj == C4840k.f10879d) {
            this.f15050k.mo19087k(cVar);
        } else if (obj == C4840k.f10890o) {
            this.f15049j.mo19087k(cVar);
        } else if (obj != C4840k.f10874B) {
        } else {
            if (cVar == null) {
                this.f15053n = null;
                return;
            }
            C6944p pVar = new C6944p(cVar, null);
            this.f15053n = pVar;
            pVar.mo19077a(this);
            this.f15045f.mo14606e(this.f15053n);
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        this.f15041b.reset();
        for (int i = 0; i < this.f15046g.size(); i++) {
            C6840a aVar = (C6840a) this.f15046g.get(i);
            for (int i2 = 0; i2 < aVar.f15054a.size(); i2++) {
                this.f15041b.addPath(((C6852l) aVar.f15054a.get(i2)).getPath(), matrix);
            }
        }
        this.f15041b.computeBounds(this.f15043d, false);
        float l = this.f15049j.mo19089l();
        RectF rectF2 = this.f15043d;
        float f = l / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f15043d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C20203a.m34518A();
    }

    /* renamed from: f */
    public void mo14607f(Canvas canvas, Matrix matrix, int i) {
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr = C7659e.f16966d;
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix2.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            C20203a.m34518A();
            return;
        }
        C6933e eVar = this.f15050k;
        float l = (((float) i) / 255.0f) * ((float) eVar.mo19091l(eVar.mo19078b(), eVar.mo19080d()));
        float f = 100.0f;
        LPaint lPaint = this.f15048i;
        PointF pointF = C7658d.f16962a;
        lPaint.setAlpha(Math.max(0, Math.min(255, (int) ((l / 100.0f) * 255.0f))));
        this.f15048i.setStrokeWidth(C7659e.m14703d(matrix) * this.f15049j.mo19089l());
        if (this.f15048i.getStrokeWidth() <= 0.0f) {
            C20203a.m34518A();
            return;
        }
        float f2 = 1.0f;
        if (this.f15051l.isEmpty()) {
            C20203a.m34518A();
        } else {
            float d = C7659e.m14703d(matrix);
            for (int i2 = 0; i2 < this.f15051l.size(); i2++) {
                this.f15047h[i2] = ((Float) ((C6928a) this.f15051l.get(i2)).mo19083g()).floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr2 = this.f15047h;
                    if (fArr2[i2] < 1.0f) {
                        fArr2[i2] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f15047h;
                    if (fArr3[i2] < 0.1f) {
                        fArr3[i2] = 0.1f;
                    }
                }
                float[] fArr4 = this.f15047h;
                fArr4[i2] = fArr4[i2] * d;
            }
            C6931c cVar = this.f15052m;
            this.f15048i.setPathEffect(new DashPathEffect(this.f15047h, cVar == null ? 0.0f : ((Float) cVar.mo19083g()).floatValue() * d));
            C20203a.m34518A();
        }
        C6944p pVar = this.f15053n;
        if (pVar != null) {
            this.f15048i.setColorFilter((ColorFilter) pVar.mo19083g());
        }
        int i3 = 0;
        while (i3 < this.f15046g.size()) {
            C6840a aVar = (C6840a) this.f15046g.get(i3);
            if (aVar.f15055b != null) {
                this.f15041b.reset();
                int size = aVar.f15054a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f15041b.addPath(((C6852l) aVar.f15054a.get(size)).getPath(), matrix2);
                }
                this.f15040a.setPath(this.f15041b, z);
                float length = this.f15040a.getLength();
                while (this.f15040a.nextContour()) {
                    length += this.f15040a.getLength();
                }
                float floatValue = (((Float) aVar.f15055b.f15171f.mo19083g()).floatValue() * length) / 360.0f;
                float floatValue2 = ((((Float) aVar.f15055b.f15169d.mo19083g()).floatValue() * length) / f) + floatValue;
                float floatValue3 = ((((Float) aVar.f15055b.f15170e.mo19083g()).floatValue() * length) / f) + floatValue;
                int size2 = aVar.f15054a.size() - 1;
                float f3 = 0.0f;
                while (size2 >= 0) {
                    this.f15042c.set(((C6852l) aVar.f15054a.get(size2)).getPath());
                    this.f15042c.transform(matrix2);
                    this.f15040a.setPath(this.f15042c, z);
                    float length2 = this.f15040a.getLength();
                    if (floatValue3 > length) {
                        float f4 = floatValue3 - length;
                        if (f4 < f3 + length2 && f3 < f4) {
                            C7659e.m14700a(this.f15042c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f4 / length2, f2), 0.0f);
                            canvas2.drawPath(this.f15042c, this.f15048i);
                            f3 += length2;
                            size2--;
                            z = false;
                            f2 = 1.0f;
                        }
                    }
                    float f5 = f3 + length2;
                    if (f5 >= floatValue2 && f3 <= floatValue3) {
                        if (f5 > floatValue3 || floatValue2 >= f3) {
                            C7659e.m14700a(this.f15042c, floatValue2 < f3 ? 0.0f : (floatValue2 - f3) / length2, floatValue3 > f5 ? 1.0f : (floatValue3 - f3) / length2, 0.0f);
                            canvas2.drawPath(this.f15042c, this.f15048i);
                        } else {
                            canvas2.drawPath(this.f15042c, this.f15048i);
                        }
                    }
                    f3 += length2;
                    size2--;
                    z = false;
                    f2 = 1.0f;
                }
                C20203a.m34518A();
            } else {
                this.f15041b.reset();
                for (int size3 = aVar.f15054a.size() - 1; size3 >= 0; size3--) {
                    this.f15041b.addPath(((C6852l) aVar.f15054a.get(size3)).getPath(), matrix2);
                }
                C20203a.m34518A();
                canvas2.drawPath(this.f15041b, this.f15048i);
                C20203a.m34518A();
            }
            i3++;
            z = false;
            f2 = 1.0f;
            f = 100.0f;
        }
        C20203a.m34518A();
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }
}
