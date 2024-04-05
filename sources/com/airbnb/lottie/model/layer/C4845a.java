package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C4851o;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p003a2.C0023f;
import p113g3.C6841b;
import p113g3.C6843d;
import p125h3.C6928a;
import p125h3.C6931c;
import p125h3.C6935g;
import p125h3.C6943o;
import p149j3.C7103d;
import p149j3.C7104e;
import p158k3.C7188k;
import p177m3.C7313a;
import p193o.C7500h;
import p206p3.C7657c;
import p206p3.C7659e;
import p214q3.C7720c;
import p214q3.C7721d;
import p772tq.C20203a;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class C4845a implements C6843d, C6928a.C6929a, C7104e {

    /* renamed from: a */
    public final Path f10984a = new Path();

    /* renamed from: b */
    public final Matrix f10985b = new Matrix();

    /* renamed from: c */
    public final LPaint f10986c;

    /* renamed from: d */
    public final LPaint f10987d;

    /* renamed from: e */
    public final LPaint f10988e;

    /* renamed from: f */
    public final LPaint f10989f;

    /* renamed from: g */
    public final LPaint f10990g;

    /* renamed from: h */
    public final RectF f10991h;

    /* renamed from: i */
    public final RectF f10992i;

    /* renamed from: j */
    public final RectF f10993j;

    /* renamed from: k */
    public final RectF f10994k;

    /* renamed from: l */
    public final Matrix f10995l;

    /* renamed from: m */
    public final LottieDrawable f10996m;

    /* renamed from: n */
    public final Layer f10997n;

    /* renamed from: o */
    public C6935g f10998o;

    /* renamed from: p */
    public C4845a f10999p;

    /* renamed from: q */
    public C4845a f11000q;

    /* renamed from: r */
    public List<C4845a> f11001r;

    /* renamed from: s */
    public final ArrayList f11002s;

    /* renamed from: t */
    public final C6943o f11003t;

    /* renamed from: u */
    public boolean f11004u;

    /* renamed from: com.airbnb.lottie.model.layer.a$a */
    public static /* synthetic */ class C4846a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11005a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f11006b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        static {
            /*
                com.airbnb.lottie.model.content.Mask$MaskMode[] r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11006b = r0
                r1 = 1
                com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11006b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.Mask$MaskMode r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f11006b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.model.layer.Layer$LayerType[] r3 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f11005a = r3
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f11005a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.model.layer.Layer$LayerType r3 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f11005a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f11005a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f11005a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f11005a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f11005a     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C4845a.C4846a.<clinit>():void");
        }
    }

    public C4845a(LottieDrawable lottieDrawable, Layer layer) {
        boolean z = true;
        this.f10986c = new LPaint(1);
        this.f10987d = new LPaint(1, PorterDuff.Mode.DST_IN);
        this.f10988e = new LPaint(1, PorterDuff.Mode.DST_OUT);
        LPaint lPaint = new LPaint(1);
        this.f10989f = lPaint;
        this.f10990g = new LPaint(PorterDuff.Mode.CLEAR);
        this.f10991h = new RectF();
        this.f10992i = new RectF();
        this.f10993j = new RectF();
        this.f10994k = new RectF();
        this.f10995l = new Matrix();
        this.f11002s = new ArrayList();
        this.f11004u = true;
        this.f10996m = lottieDrawable;
        this.f10997n = layer;
        C0023f.m110k(new StringBuilder(), layer.f10964c, "#draw");
        if (layer.f10982u == Layer.MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C7188k kVar = layer.f10970i;
        kVar.getClass();
        C6943o oVar = new C6943o(kVar);
        this.f11003t = oVar;
        oVar.mo19094b(this);
        List<Mask> list = layer.f10969h;
        if (list != null && !list.isEmpty()) {
            C6935g gVar = new C6935g(layer.f10969h);
            this.f10998o = gVar;
            Iterator it = gVar.f15361a.iterator();
            while (it.hasNext()) {
                ((C6928a) it.next()).mo19077a(this);
            }
            Iterator it2 = this.f10998o.f15362b.iterator();
            while (it2.hasNext()) {
                C6928a aVar = (C6928a) it2.next();
                mo14606e(aVar);
                aVar.mo19077a(this);
            }
        }
        if (!this.f10997n.f10981t.isEmpty()) {
            C6931c cVar = new C6931c(this.f10997n.f10981t);
            cVar.f15350b = true;
            cVar.mo19077a(new C7313a(this, cVar));
            z = ((Float) cVar.mo19083g()).floatValue() != 1.0f ? false : z;
            if (z != this.f11004u) {
                this.f11004u = z;
                this.f10996m.invalidateSelf();
            }
            mo14606e(cVar);
        } else if (true != this.f11004u) {
            this.f11004u = true;
            this.f10996m.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f10996m.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
    }

    /* renamed from: c */
    public void mo14604c(C7720c cVar, Object obj) {
        this.f11003t.mo19095c(cVar, obj);
    }

    /* renamed from: d */
    public void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        this.f10991h.set(0.0f, 0.0f, 0.0f, 0.0f);
        mo14610h();
        this.f10995l.set(matrix);
        if (z) {
            List<C4845a> list = this.f11001r;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f10995l.preConcat(this.f11001r.get(size).f11003t.mo19096d());
                }
            } else {
                C4845a aVar = this.f11000q;
                if (aVar != null) {
                    this.f10995l.preConcat(aVar.f11003t.mo19096d());
                }
            }
        }
        this.f10995l.preConcat(this.f11003t.mo19096d());
    }

    /* renamed from: e */
    public final void mo14606e(C6928a<?, ?> aVar) {
        if (aVar != null) {
            this.f11002s.add(aVar);
        }
    }

    /* renamed from: f */
    public final void mo14607f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        if (!this.f11004u || this.f10997n.f10983v) {
            C20203a.m34518A();
            return;
        }
        mo14610h();
        this.f10985b.reset();
        this.f10985b.set(matrix2);
        int i2 = 1;
        for (int size = this.f11001r.size() - 1; size >= 0; size--) {
            this.f10985b.preConcat(this.f11001r.get(size).f11003t.mo19096d());
        }
        C20203a.m34518A();
        C6928a<Integer, Integer> aVar = this.f11003t.f15386j;
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (aVar == null ? 100 : aVar.mo19083g().intValue()))) / 100.0f) * 255.0f);
        if ((this.f10999p != null) || mo14613k()) {
            mo14605d(this.f10991h, this.f10985b, false);
            RectF rectF = this.f10991h;
            if ((this.f10999p != null) && this.f10997n.f10982u != Layer.MatteType.INVERT) {
                this.f10993j.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f10999p.mo14605d(this.f10993j, matrix2, true);
                if (!rectF.intersect(this.f10993j)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.f10985b.preConcat(this.f11003t.mo19096d());
            RectF rectF2 = this.f10991h;
            Matrix matrix3 = this.f10985b;
            this.f10992i.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i3 = 2;
            int i4 = 3;
            if (mo14613k()) {
                int size2 = this.f10998o.f15363c.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Mask mask = this.f10998o.f15363c.get(i5);
                        this.f10984a.set((Path) ((C6928a) this.f10998o.f15361a.get(i5)).mo19083g());
                        this.f10984a.transform(matrix3);
                        int i6 = C4846a.f11006b[mask.f10916a.ordinal()];
                        if (i6 == i2 || ((i6 == i3 || i6 == i4) && mask.f10919d)) {
                            break;
                        }
                        this.f10984a.computeBounds(this.f10994k, false);
                        if (i5 == 0) {
                            this.f10992i.set(this.f10994k);
                        } else {
                            RectF rectF3 = this.f10992i;
                            rectF3.set(Math.min(rectF3.left, this.f10994k.left), Math.min(this.f10992i.top, this.f10994k.top), Math.max(this.f10992i.right, this.f10994k.right), Math.max(this.f10992i.bottom, this.f10994k.bottom));
                        }
                        i5++;
                        i2 = 1;
                        i3 = 2;
                        i4 = 3;
                    } else if (!rectF2.intersect(this.f10992i)) {
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            if (!this.f10991h.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f10991h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C20203a.m34518A();
            if (!this.f10991h.isEmpty()) {
                RectF rectF4 = this.f10991h;
                LPaint lPaint = this.f10986c;
                PathMeasure pathMeasure = C7659e.f16963a;
                canvas2.saveLayer(rectF4, lPaint);
                C20203a.m34518A();
                C20203a.m34518A();
                mo14611i(canvas);
                mo14612j(canvas2, this.f10985b, intValue);
                C20203a.m34518A();
                if (mo14613k()) {
                    Matrix matrix4 = this.f10985b;
                    canvas2.saveLayer(this.f10991h, this.f10987d);
                    C20203a.m34518A();
                    if (Build.VERSION.SDK_INT < 28) {
                        canvas2.drawColor(0);
                    }
                    C20203a.m34518A();
                    for (int i7 = 0; i7 < this.f10998o.f15363c.size(); i7++) {
                        Mask mask2 = this.f10998o.f15363c.get(i7);
                        C6928a aVar2 = (C6928a) this.f10998o.f15361a.get(i7);
                        C6928a aVar3 = (C6928a) this.f10998o.f15362b.get(i7);
                        int i8 = C4846a.f11006b[mask2.f10916a.ordinal()];
                        if (i8 == 1) {
                            if (i7 == 0) {
                                this.f10986c.setColor(-16777216);
                                this.f10986c.setAlpha(255);
                                canvas2.drawRect(this.f10991h, this.f10986c);
                            }
                            if (mask2.f10919d) {
                                RectF rectF5 = this.f10991h;
                                LPaint lPaint2 = this.f10988e;
                                PathMeasure pathMeasure2 = C7659e.f16963a;
                                canvas2.saveLayer(rectF5, lPaint2);
                                C20203a.m34518A();
                                canvas2.drawRect(this.f10991h, this.f10986c);
                                this.f10988e.setAlpha((int) (((float) ((Integer) aVar3.mo19083g()).intValue()) * 2.55f));
                                this.f10984a.set((Path) aVar2.mo19083g());
                                this.f10984a.transform(matrix4);
                                canvas2.drawPath(this.f10984a, this.f10988e);
                                canvas.restore();
                            } else {
                                this.f10984a.set((Path) aVar2.mo19083g());
                                this.f10984a.transform(matrix4);
                                canvas2.drawPath(this.f10984a, this.f10988e);
                            }
                        } else if (i8 != 2) {
                            if (i8 == 3) {
                                if (mask2.f10919d) {
                                    RectF rectF6 = this.f10991h;
                                    LPaint lPaint3 = this.f10986c;
                                    PathMeasure pathMeasure3 = C7659e.f16963a;
                                    canvas2.saveLayer(rectF6, lPaint3);
                                    C20203a.m34518A();
                                    canvas2.drawRect(this.f10991h, this.f10986c);
                                    this.f10984a.set((Path) aVar2.mo19083g());
                                    this.f10984a.transform(matrix4);
                                    this.f10986c.setAlpha((int) (((float) ((Integer) aVar3.mo19083g()).intValue()) * 2.55f));
                                    canvas2.drawPath(this.f10984a, this.f10988e);
                                    canvas.restore();
                                } else {
                                    this.f10984a.set((Path) aVar2.mo19083g());
                                    this.f10984a.transform(matrix4);
                                    this.f10986c.setAlpha((int) (((float) ((Integer) aVar3.mo19083g()).intValue()) * 2.55f));
                                    canvas2.drawPath(this.f10984a, this.f10986c);
                                }
                            }
                        } else if (mask2.f10919d) {
                            RectF rectF7 = this.f10991h;
                            LPaint lPaint4 = this.f10987d;
                            PathMeasure pathMeasure4 = C7659e.f16963a;
                            canvas2.saveLayer(rectF7, lPaint4);
                            C20203a.m34518A();
                            canvas2.drawRect(this.f10991h, this.f10986c);
                            this.f10988e.setAlpha((int) (((float) ((Integer) aVar3.mo19083g()).intValue()) * 2.55f));
                            this.f10984a.set((Path) aVar2.mo19083g());
                            this.f10984a.transform(matrix4);
                            canvas2.drawPath(this.f10984a, this.f10988e);
                            canvas.restore();
                        } else {
                            RectF rectF8 = this.f10991h;
                            LPaint lPaint5 = this.f10987d;
                            PathMeasure pathMeasure5 = C7659e.f16963a;
                            canvas2.saveLayer(rectF8, lPaint5);
                            C20203a.m34518A();
                            this.f10984a.set((Path) aVar2.mo19083g());
                            this.f10984a.transform(matrix4);
                            this.f10986c.setAlpha((int) (((float) ((Integer) aVar3.mo19083g()).intValue()) * 2.55f));
                            canvas2.drawPath(this.f10984a, this.f10986c);
                            canvas.restore();
                        }
                    }
                    z = true;
                    canvas.restore();
                    C20203a.m34518A();
                } else {
                    z = true;
                }
                if (this.f10999p != null ? z : false) {
                    canvas2.saveLayer(this.f10991h, this.f10989f);
                    C20203a.m34518A();
                    C20203a.m34518A();
                    mo14611i(canvas);
                    this.f10999p.mo14607f(canvas2, matrix2, intValue);
                    canvas.restore();
                    C20203a.m34518A();
                    C20203a.m34518A();
                }
                canvas.restore();
                C20203a.m34518A();
            }
            C20203a.m34518A();
            mo14614l();
            return;
        }
        this.f10985b.preConcat(this.f11003t.mo19096d());
        mo14612j(canvas2, this.f10985b, intValue);
        C20203a.m34518A();
        C20203a.m34518A();
        mo14614l();
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        if (dVar.mo19433c(i, this.f10997n.f10964c)) {
            if (!"__container".equals(this.f10997n.f10964c)) {
                String str = this.f10997n.f10964c;
                dVar2.getClass();
                C7103d dVar3 = new C7103d(dVar2);
                dVar3.f15803a.add(str);
                if (dVar.mo19431a(i, this.f10997n.f10964c)) {
                    C7103d dVar4 = new C7103d(dVar3);
                    dVar4.f15804b = this;
                    arrayList.add(dVar4);
                }
                dVar2 = dVar3;
            }
            if (dVar.mo19434d(i, this.f10997n.f10964c)) {
                mo14616n(dVar, dVar.mo19432b(i, this.f10997n.f10964c) + i, arrayList, dVar2);
            }
        }
    }

    public final String getName() {
        return this.f10997n.f10964c;
    }

    /* renamed from: h */
    public final void mo14610h() {
        if (this.f11001r == null) {
            if (this.f11000q == null) {
                this.f11001r = Collections.emptyList();
                return;
            }
            this.f11001r = new ArrayList();
            for (C4845a aVar = this.f11000q; aVar != null; aVar = aVar.f11000q) {
                this.f11001r.add(aVar);
            }
        }
    }

    /* renamed from: i */
    public final void mo14611i(Canvas canvas) {
        RectF rectF = this.f10991h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f10990g);
        C20203a.m34518A();
    }

    /* renamed from: j */
    public abstract void mo14612j(Canvas canvas, Matrix matrix, int i);

    /* renamed from: k */
    public final boolean mo14613k() {
        C6935g gVar = this.f10998o;
        return gVar != null && !gVar.f15361a.isEmpty();
    }

    /* renamed from: l */
    public final void mo14614l() {
        C4851o oVar = this.f10996m.getComposition().f10841a;
        String str = this.f10997n.f10964c;
        if (oVar.f11021a) {
            C7657c cVar = (C7657c) oVar.f11023c.get(str);
            if (cVar == null) {
                cVar = new C7657c();
                oVar.f11023c.put(str, cVar);
            }
            int i = cVar.f16961a + 1;
            cVar.f16961a = i;
            if (i == Integer.MAX_VALUE) {
                cVar.f16961a = i / 2;
            }
            if (str.equals("__container")) {
                Iterator it = oVar.f11022b.iterator();
                while (true) {
                    C7500h.C7501a aVar = (C7500h.C7501a) it;
                    if (aVar.hasNext()) {
                        ((C4851o.C4852a) aVar.next()).mo14624a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo14615m(C6928a<?, ?> aVar) {
        this.f11002s.remove(aVar);
    }

    /* renamed from: n */
    public void mo14616n(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
    }

    /* renamed from: o */
    public void mo14617o(float f) {
        C6943o oVar = this.f11003t;
        C6928a<Integer, Integer> aVar = oVar.f15386j;
        if (aVar != null) {
            aVar.mo19086j(f);
        }
        C6928a<?, Float> aVar2 = oVar.f15389m;
        if (aVar2 != null) {
            aVar2.mo19086j(f);
        }
        C6928a<?, Float> aVar3 = oVar.f15390n;
        if (aVar3 != null) {
            aVar3.mo19086j(f);
        }
        C6928a<PointF, PointF> aVar4 = oVar.f15382f;
        if (aVar4 != null) {
            aVar4.mo19086j(f);
        }
        C6928a<?, PointF> aVar5 = oVar.f15383g;
        if (aVar5 != null) {
            aVar5.mo19086j(f);
        }
        C6928a<C7721d, C7721d> aVar6 = oVar.f15384h;
        if (aVar6 != null) {
            aVar6.mo19086j(f);
        }
        C6928a<Float, Float> aVar7 = oVar.f15385i;
        if (aVar7 != null) {
            aVar7.mo19086j(f);
        }
        C6931c cVar = oVar.f15387k;
        if (cVar != null) {
            cVar.mo19086j(f);
        }
        C6931c cVar2 = oVar.f15388l;
        if (cVar2 != null) {
            cVar2.mo19086j(f);
        }
        if (this.f10998o != null) {
            for (int i = 0; i < this.f10998o.f15361a.size(); i++) {
                ((C6928a) this.f10998o.f15361a.get(i)).mo19086j(f);
            }
        }
        float f2 = this.f10997n.f10974m;
        if (f2 != 0.0f) {
            f /= f2;
        }
        C4845a aVar8 = this.f10999p;
        if (aVar8 != null) {
            aVar8.mo14617o(aVar8.f10997n.f10974m * f);
        }
        for (int i2 = 0; i2 < this.f11002s.size(); i2++) {
            ((C6928a) this.f11002s.get(i2)).mo19086j(f);
        }
    }
}
