package p113g3;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4845a;
import java.util.ArrayList;
import java.util.List;
import p125h3.C6928a;
import p125h3.C6932d;
import p125h3.C6933e;
import p125h3.C6938j;
import p125h3.C6944p;
import p149j3.C7103d;
import p167l3.C7237c;
import p167l3.C7238d;
import p193o.C7498f;
import p206p3.C7658d;
import p214q3.C7720c;

/* renamed from: g3.g */
public final class C6846g implements C6843d, C6928a.C6929a, C6849j {

    /* renamed from: a */
    public final String f15085a;

    /* renamed from: b */
    public final boolean f15086b;

    /* renamed from: c */
    public final C4845a f15087c;

    /* renamed from: d */
    public final C7498f<LinearGradient> f15088d = new C7498f<>();

    /* renamed from: e */
    public final C7498f<RadialGradient> f15089e = new C7498f<>();

    /* renamed from: f */
    public final Path f15090f;

    /* renamed from: g */
    public final LPaint f15091g;

    /* renamed from: h */
    public final RectF f15092h;

    /* renamed from: i */
    public final ArrayList f15093i;

    /* renamed from: j */
    public final GradientType f15094j;

    /* renamed from: k */
    public final C6932d f15095k;

    /* renamed from: l */
    public final C6933e f15096l;

    /* renamed from: m */
    public final C6938j f15097m;

    /* renamed from: n */
    public final C6938j f15098n;

    /* renamed from: o */
    public C6944p f15099o;

    /* renamed from: p */
    public C6944p f15100p;

    /* renamed from: q */
    public final LottieDrawable f15101q;

    /* renamed from: r */
    public final int f15102r;

    public C6846g(LottieDrawable lottieDrawable, C4845a aVar, C7238d dVar) {
        Path path = new Path();
        this.f15090f = path;
        this.f15091g = new LPaint(1);
        this.f15092h = new RectF();
        this.f15093i = new ArrayList();
        this.f15087c = aVar;
        this.f15085a = dVar.f16065g;
        this.f15086b = dVar.f16066h;
        this.f15101q = lottieDrawable;
        this.f15094j = dVar.f16059a;
        path.setFillType(dVar.f16060b);
        this.f15102r = (int) (lottieDrawable.getComposition().mo14582b() / 32.0f);
        C6928a<C7237c, C7237c> a = dVar.f16061c.mo19485a();
        this.f15095k = (C6932d) a;
        a.mo19077a(this);
        aVar.mo14606e(a);
        C6928a<Integer, Integer> a2 = dVar.f16062d.mo19485a();
        this.f15096l = (C6933e) a2;
        a2.mo19077a(this);
        aVar.mo14606e(a2);
        C6928a<PointF, PointF> a3 = dVar.f16063e.mo19485a();
        this.f15097m = (C6938j) a3;
        a3.mo19077a(this);
        aVar.mo14606e(a3);
        C6928a<PointF, PointF> a4 = dVar.f16064f.mo19485a();
        this.f15098n = (C6938j) a4;
        a4.mo19077a(this);
        aVar.mo14606e(a4);
    }

    /* renamed from: a */
    public final void mo14602a() {
        this.f15101q.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo14603b(List<C6841b> list, List<C6841b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C6841b bVar = list2.get(i);
            if (bVar instanceof C6852l) {
                this.f15093i.add((C6852l) bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        if (obj == C4840k.f10879d) {
            this.f15096l.mo19087k(cVar);
        } else if (obj == C4840k.f10874B) {
            if (cVar == null) {
                this.f15099o = null;
                return;
            }
            C6944p pVar = new C6944p(cVar, null);
            this.f15099o = pVar;
            pVar.mo19077a(this);
            this.f15087c.mo14606e(this.f15099o);
        } else if (obj != C4840k.f10875C) {
        } else {
            if (cVar == null) {
                C6944p pVar2 = this.f15100p;
                if (pVar2 != null) {
                    this.f15087c.mo14615m(pVar2);
                }
                this.f15100p = null;
                return;
            }
            C6944p pVar3 = new C6944p(cVar, null);
            this.f15100p = pVar3;
            pVar3.mo19077a(this);
            this.f15087c.mo14606e(this.f15100p);
        }
    }

    /* renamed from: d */
    public final void mo14605d(RectF rectF, Matrix matrix, boolean z) {
        this.f15090f.reset();
        for (int i = 0; i < this.f15093i.size(); i++) {
            this.f15090f.addPath(((C6852l) this.f15093i.get(i)).getPath(), matrix);
        }
        this.f15090f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: e */
    public final int[] mo18975e(int[] iArr) {
        C6944p pVar = this.f15100p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.mo19083g();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r3v25, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14607f(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.f15086b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f15090f
            r2.reset()
            r2 = 0
            r3 = r2
        L_0x0010:
            java.util.ArrayList r4 = r0.f15093i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f15090f
            java.util.ArrayList r5 = r0.f15093i
            java.lang.Object r5 = r5.get(r3)
            g3.l r5 = (p113g3.C6852l) r5
            android.graphics.Path r5 = r5.getPath()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f15090f
            android.graphics.RectF r4 = r0.f15092h
            r3.computeBounds(r4, r2)
            com.airbnb.lottie.model.content.GradientType r3 = r0.f15094j
            com.airbnb.lottie.model.content.GradientType r4 = com.airbnb.lottie.model.content.GradientType.LINEAR
            r5 = 0
            if (r3 != r4) goto L_0x0082
            int r3 = r17.mo18976h()
            o.f<android.graphics.LinearGradient> r4 = r0.f15088d
            long r6 = (long) r3
            java.lang.Object r3 = r4.mo19889f(r6, r5)
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            if (r3 == 0) goto L_0x004b
            goto L_0x00d9
        L_0x004b:
            h3.j r3 = r0.f15097m
            java.lang.Object r3 = r3.mo19083g()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            h3.j r4 = r0.f15098n
            java.lang.Object r4 = r4.mo19083g()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            h3.d r5 = r0.f15095k
            java.lang.Object r5 = r5.mo19083g()
            l3.c r5 = (p167l3.C7237c) r5
            int[] r8 = r5.f16058b
            int[] r14 = r0.mo18975e(r8)
            float[] r15 = r5.f16057a
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient
            float r10 = r3.x
            float r11 = r3.y
            float r12 = r4.x
            float r13 = r4.y
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            o.f<android.graphics.LinearGradient> r3 = r0.f15088d
            r3.mo19890h(r6, r5)
            r3 = r5
            goto L_0x00d9
        L_0x0082:
            int r3 = r17.mo18976h()
            o.f<android.graphics.RadialGradient> r4 = r0.f15089e
            long r6 = (long) r3
            java.lang.Object r3 = r4.mo19889f(r6, r5)
            android.graphics.RadialGradient r3 = (android.graphics.RadialGradient) r3
            if (r3 == 0) goto L_0x0092
            goto L_0x00d9
        L_0x0092:
            h3.j r3 = r0.f15097m
            java.lang.Object r3 = r3.mo19083g()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            h3.j r4 = r0.f15098n
            java.lang.Object r4 = r4.mo19083g()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            h3.d r5 = r0.f15095k
            java.lang.Object r5 = r5.mo19083g()
            l3.c r5 = (p167l3.C7237c) r5
            int[] r8 = r5.f16058b
            int[] r13 = r0.mo18975e(r8)
            float[] r14 = r5.f16057a
            float r10 = r3.x
            float r11 = r3.y
            float r3 = r4.x
            float r4 = r4.y
            float r3 = r3 - r10
            double r8 = (double) r3
            float r4 = r4 - r11
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r8, r3)
            float r3 = (float) r3
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00cb
            r3 = 981668463(0x3a83126f, float:0.001)
        L_0x00cb:
            r12 = r3
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            o.f<android.graphics.RadialGradient> r4 = r0.f15089e
            r4.mo19890h(r6, r3)
        L_0x00d9:
            r3.setLocalMatrix(r1)
            com.airbnb.lottie.animation.LPaint r1 = r0.f15091g
            r1.setShader(r3)
            h3.p r1 = r0.f15099o
            if (r1 == 0) goto L_0x00f0
            com.airbnb.lottie.animation.LPaint r3 = r0.f15091g
            java.lang.Object r1 = r1.mo19083g()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r3.setColorFilter(r1)
        L_0x00f0:
            r1 = r20
            float r1 = (float) r1
            r3 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r3
            h3.e r4 = r0.f15096l
            java.lang.Object r4 = r4.mo19083g()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r1 = r1 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            float r1 = r1 * r3
            int r1 = (int) r1
            com.airbnb.lottie.animation.LPaint r3 = r0.f15091g
            android.graphics.PointF r4 = p206p3.C7658d.f16962a
            r4 = 255(0xff, float:3.57E-43)
            int r1 = java.lang.Math.min(r4, r1)
            int r1 = java.lang.Math.max(r2, r1)
            r3.setAlpha(r1)
            android.graphics.Path r1 = r0.f15090f
            com.airbnb.lottie.animation.LPaint r2 = r0.f15091g
            r3 = r18
            r3.drawPath(r1, r2)
            p772tq.C20203a.m34518A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113g3.C6846g.mo14607f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: g */
    public final void mo14608g(C7103d dVar, int i, ArrayList arrayList, C7103d dVar2) {
        C7658d.m14699d(dVar, i, arrayList, dVar2, this);
    }

    public final String getName() {
        return this.f15085a;
    }

    /* renamed from: h */
    public final int mo18976h() {
        int round = Math.round(this.f15097m.f15352d * ((float) this.f15102r));
        int round2 = Math.round(this.f15098n.f15352d * ((float) this.f15102r));
        int round3 = Math.round(this.f15095k.f15352d * ((float) this.f15102r));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
