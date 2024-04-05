package p113g3;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import com.airbnb.lottie.C4840k;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.C4844a;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C4845a;
import p125h3.C6928a;
import p125h3.C6932d;
import p125h3.C6938j;
import p125h3.C6944p;
import p167l3.C7237c;
import p193o.C7498f;
import p214q3.C7720c;

/* renamed from: g3.h */
public final class C6847h extends C6839a {

    /* renamed from: o */
    public final String f15103o;

    /* renamed from: p */
    public final boolean f15104p;

    /* renamed from: q */
    public final C7498f<LinearGradient> f15105q = new C7498f<>();

    /* renamed from: r */
    public final C7498f<RadialGradient> f15106r = new C7498f<>();

    /* renamed from: s */
    public final RectF f15107s = new RectF();

    /* renamed from: t */
    public final GradientType f15108t;

    /* renamed from: u */
    public final int f15109u;

    /* renamed from: v */
    public final C6932d f15110v;

    /* renamed from: w */
    public final C6938j f15111w;

    /* renamed from: x */
    public final C6938j f15112x;

    /* renamed from: y */
    public C6944p f15113y;

    public C6847h(LottieDrawable lottieDrawable, C4845a aVar, C4844a aVar2) {
        super(lottieDrawable, aVar, aVar2.f10956h.toPaintCap(), aVar2.f10957i.toPaintJoin(), aVar2.f10958j, aVar2.f10952d, aVar2.f10955g, aVar2.f10959k, aVar2.f10960l);
        this.f15103o = aVar2.f10949a;
        this.f15108t = aVar2.f10950b;
        this.f15104p = aVar2.f10961m;
        this.f15109u = (int) (lottieDrawable.getComposition().mo14582b() / 32.0f);
        C6928a<C7237c, C7237c> a = aVar2.f10951c.mo19485a();
        this.f15110v = (C6932d) a;
        a.mo19077a(this);
        aVar.mo14606e(a);
        C6928a<PointF, PointF> a2 = aVar2.f10953e.mo19485a();
        this.f15111w = (C6938j) a2;
        a2.mo19077a(this);
        aVar.mo14606e(a2);
        C6928a<PointF, PointF> a3 = aVar2.f10954f.mo19485a();
        this.f15112x = (C6938j) a3;
        a3.mo19077a(this);
        aVar.mo14606e(a3);
    }

    /* renamed from: c */
    public final void mo14604c(C7720c cVar, Object obj) {
        super.mo14604c(cVar, obj);
        if (obj != C4840k.f10875C) {
            return;
        }
        if (cVar == null) {
            C6944p pVar = this.f15113y;
            if (pVar != null) {
                this.f15045f.mo14615m(pVar);
            }
            this.f15113y = null;
            return;
        }
        C6944p pVar2 = new C6944p(cVar, null);
        this.f15113y = pVar2;
        pVar2.mo19077a(this);
        this.f15045f.mo14606e(this.f15113y);
    }

    /* renamed from: e */
    public final int[] mo18977e(int[] iArr) {
        C6944p pVar = this.f15113y;
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

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14607f(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f15104p
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f15107s
            r3 = 0
            r0.mo14605d(r2, r1, r3)
            com.airbnb.lottie.model.content.GradientType r2 = r0.f15108t
            com.airbnb.lottie.model.content.GradientType r3 = com.airbnb.lottie.model.content.GradientType.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x005d
            int r2 = r16.mo18978h()
            o.f<android.graphics.LinearGradient> r3 = r0.f15105q
            long r5 = (long) r2
            java.lang.Object r2 = r3.mo19889f(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0027
            goto L_0x00ab
        L_0x0027:
            h3.j r2 = r0.f15111w
            java.lang.Object r2 = r2.mo19083g()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            h3.j r3 = r0.f15112x
            java.lang.Object r3 = r3.mo19083g()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            h3.d r4 = r0.f15110v
            java.lang.Object r4 = r4.mo19083g()
            l3.c r4 = (p167l3.C7237c) r4
            int[] r7 = r4.f16058b
            int[] r13 = r0.mo18977e(r7)
            float[] r14 = r4.f16057a
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            o.f<android.graphics.LinearGradient> r3 = r0.f15105q
            r3.mo19890h(r5, r2)
            goto L_0x00ab
        L_0x005d:
            int r2 = r16.mo18978h()
            o.f<android.graphics.RadialGradient> r3 = r0.f15106r
            long r5 = (long) r2
            java.lang.Object r2 = r3.mo19889f(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006d
            goto L_0x00ab
        L_0x006d:
            h3.j r2 = r0.f15111w
            java.lang.Object r2 = r2.mo19083g()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            h3.j r3 = r0.f15112x
            java.lang.Object r3 = r3.mo19083g()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            h3.d r4 = r0.f15110v
            java.lang.Object r4 = r4.mo19083g()
            l3.c r4 = (p167l3.C7237c) r4
            int[] r7 = r4.f16058b
            int[] r12 = r0.mo18977e(r7)
            float[] r13 = r4.f16057a
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r7 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r7, r2)
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            o.f<android.graphics.RadialGradient> r3 = r0.f15106r
            r3.mo19890h(r5, r2)
        L_0x00ab:
            r2.setLocalMatrix(r1)
            com.airbnb.lottie.animation.LPaint r3 = r0.f15048i
            r3.setShader(r2)
            super.mo14607f(r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p113g3.C6847h.mo14607f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f15103o;
    }

    /* renamed from: h */
    public final int mo18978h() {
        int round = Math.round(this.f15111w.f15352d * ((float) this.f15109u));
        int round2 = Math.round(this.f15112x.f15352d * ((float) this.f15109u));
        int round3 = Math.round(this.f15110v.f15352d * ((float) this.f15109u));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
