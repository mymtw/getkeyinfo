package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6944p;
import p149j3.C7103d;
import p158k3.C7179b;
import p177m3.C7314b;
import p177m3.C7315c;
import p177m3.C7316d;
import p177m3.C7317e;
import p177m3.C7318f;
import p193o.C7498f;
import p206p3.C7656b;
import p206p3.C7659e;
import p214q3.C7720c;
import p772tq.C20203a;

/* renamed from: com.airbnb.lottie.model.layer.b */
public final class C4847b extends C4845a {

    /* renamed from: A */
    public Boolean f11007A;

    /* renamed from: B */
    public Boolean f11008B;

    /* renamed from: v */
    public C6928a<Float, Float> f11009v;

    /* renamed from: w */
    public final ArrayList f11010w = new ArrayList();

    /* renamed from: x */
    public final RectF f11011x = new RectF();

    /* renamed from: y */
    public final RectF f11012y = new RectF();

    /* renamed from: z */
    public Paint f11013z = new Paint();

    /* renamed from: com.airbnb.lottie.model.layer.b$a */
    public static /* synthetic */ class C4848a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11014a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11014a = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11014a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C4847b.C4848a.<clinit>():void");
        }
    }

    public C4847b(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, C4828c cVar) {
        super(lottieDrawable, layer);
        C4845a aVar;
        C4845a aVar2;
        C7179b bVar = layer.f10980s;
        if (bVar != null) {
            C6928a<Float, Float> a = bVar.mo19485a();
            this.f11009v = a;
            mo14606e(a);
            this.f11009v.mo19077a(this);
        } else {
            this.f11009v = null;
        }
        C7498f fVar = new C7498f(cVar.f10849i.size());
        int size = list.size() - 1;
        C4845a aVar3 = null;
        while (true) {
            if (size >= 0) {
                Layer layer2 = list.get(size);
                switch (C4845a.C4846a.f11005a[layer2.f10966e.ordinal()]) {
                    case 1:
                        aVar2 = new C7316d(lottieDrawable, layer2);
                        break;
                    case 2:
                        aVar2 = new C4847b(lottieDrawable, layer2, cVar.f10843c.get(layer2.f10968g), cVar);
                        break;
                    case 3:
                        aVar2 = new C7317e(lottieDrawable, layer2);
                        break;
                    case 4:
                        aVar2 = new C7314b(lottieDrawable, layer2);
                        break;
                    case 5:
                        aVar2 = new C7315c(lottieDrawable, layer2);
                        break;
                    case 6:
                        aVar2 = new C7318f(lottieDrawable, layer2);
                        break;
                    default:
                        StringBuilder h = C0072d.m201h("Unknown layer type ");
                        h.append(layer2.f10966e);
                        C7656b.m14695b(h.toString());
                        aVar2 = null;
                        break;
                }
                if (aVar2 != null) {
                    fVar.mo19890h(aVar2.f10997n.f10965d, aVar2);
                    if (aVar3 != null) {
                        aVar3.f10999p = aVar2;
                        aVar3 = null;
                    } else {
                        this.f11010w.add(0, aVar2);
                        int i = C4848a.f11014a[layer2.f10982u.ordinal()];
                        if (i == 1 || i == 2) {
                            aVar3 = aVar2;
                        }
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < fVar.mo19891i(); i2++) {
                    if (fVar.f16720b) {
                        fVar.mo19888d();
                    }
                    C4845a aVar4 = (C4845a) fVar.mo19889f(fVar.f16721c[i2], (Long) null);
                    if (!(aVar4 == null || (aVar = (C4845a) fVar.mo19889f(aVar4.f10997n.f10967f, (Long) null)) == null)) {
                        aVar4.f11000q = aVar;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        super.mo14604c(cVar, obj);
        if (obj != C4840k.f10873A) {
            return;
        }
        if (cVar == null) {
            this.f11009v = null;
            return;
        }
        C6944p pVar = new C6944p(cVar, null);
        this.f11009v = pVar;
        mo14606e(pVar);
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        super.mo14605d(rectF, matrix, z);
        for (int size = this.f11010w.size() - 1; size >= 0; size--) {
            this.f11011x.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C4845a) this.f11010w.get(size)).mo14605d(this.f11011x, this.f10995l, true);
            rectF.union(this.f11011x);
        }
    }

    /* renamed from: j */
    public final void mo14612j(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.f11012y;
        Layer layer = this.f10997n;
        rectF.set(0.0f, 0.0f, (float) layer.f10976o, (float) layer.f10977p);
        matrix.mapRect(this.f11012y);
        boolean z = this.f10996m.isApplyingOpacityToLayersEnabled() && this.f11010w.size() > 1 && i != 255;
        if (z) {
            this.f11013z.setAlpha(i);
            RectF rectF2 = this.f11012y;
            Paint paint = this.f11013z;
            PathMeasure pathMeasure = C7659e.f16963a;
            canvas.saveLayer(rectF2, paint);
            C20203a.m34518A();
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f11010w.size() - 1; size >= 0; size--) {
            if (!this.f11012y.isEmpty() ? canvas.clipRect(this.f11012y) : true) {
                ((C4845a) this.f11010w.get(size)).mo14607f(canvas, matrix, i);
            }
        }
        canvas.restore();
        C20203a.m34518A();
    }

    /* renamed from: n */
    public final void mo14616n(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        for (int i2 = 0; i2 < this.f11010w.size(); i2++) {
            ((C4845a) this.f11010w.get(i2)).mo14608g(dVar, i, arrayList, dVar2);
        }
    }

    /* renamed from: o */
    public final void mo14617o(float f) {
        super.mo14617o(f);
        if (this.f11009v != null) {
            C4828c composition = this.f10996m.getComposition();
            f = ((this.f11009v.mo19083g().floatValue() * this.f10997n.f10963b.f10853m) - this.f10997n.f10963b.f10851k) / ((composition.f10852l - composition.f10851k) + 0.01f);
        }
        Layer layer = this.f10997n;
        float f2 = layer.f10974m;
        if (f2 != 0.0f) {
            f /= f2;
        }
        if (this.f11009v == null) {
            float f3 = layer.f10975n;
            C4828c cVar = layer.f10963b;
            f -= f3 / (cVar.f10852l - cVar.f10851k);
        }
        int size = this.f11010w.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C4845a) this.f11010w.get(size)).mo14617o(f);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public final boolean mo14618p() {
        if (this.f11008B == null) {
            for (int size = this.f11010w.size() - 1; size >= 0; size--) {
                C4845a aVar = (C4845a) this.f11010w.get(size);
                if (aVar instanceof C7316d) {
                    if (aVar.mo14613k()) {
                        this.f11008B = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof C4847b) && ((C4847b) aVar).mo14618p()) {
                    this.f11008B = Boolean.TRUE;
                    return true;
                }
            }
            this.f11008B = Boolean.FALSE;
        }
        return this.f11008B.booleanValue();
    }
}
