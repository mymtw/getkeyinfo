package androidx.compose.p015ui.graphics.vector;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1489a;
import androidx.compose.p015ui.graphics.C1527j;
import androidx.compose.p015ui.graphics.C1529k;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p288y.C8347f;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt */
public final class VectorPainterKt {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3392a(androidx.compose.p015ui.graphics.vector.C1581i r23, java.util.Map<java.lang.String, ? extends androidx.compose.p015ui.graphics.vector.C1580h> r24, androidx.compose.runtime.C1302d r25, int r26, int r27) {
        /*
            r0 = r23
            r1 = r26
            r2 = r27
            java.lang.String r3 = "group"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            r3 = -446179233(0xffffffffe567d85f, float:-6.8428625E22)
            r4 = r25
            androidx.compose.runtime.ComposerImpl r3 = r4.mo5440h(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002b
            boolean r4 = r3.mo5408I(r0)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0032
            r4 = r4 | 16
        L_0x0032:
            if (r6 != r5) goto L_0x0049
            r4 = r4 & 91
            r5 = 18
            if (r4 != r5) goto L_0x0049
            boolean r4 = r3.mo5442i()
            if (r4 != 0) goto L_0x0041
            goto L_0x0049
        L_0x0041:
            r3.mo5396C()
            r0 = r24
            r1 = r3
            goto L_0x01ed
        L_0x0049:
            r3.mo5466u0()
            r4 = r1 & 1
            if (r4 == 0) goto L_0x005b
            boolean r4 = r3.mo5425Y()
            if (r4 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            r3.mo5396C()
            goto L_0x0063
        L_0x005b:
            if (r6 == 0) goto L_0x0063
            java.util.Map r4 = kotlin.collections.C19294b0.m32559p0()
            r15 = r4
            goto L_0x0065
        L_0x0063:
            r15 = r24
        L_0x0065:
            r3.mo5419S()
            java.util.List<androidx.compose.ui.graphics.vector.k> r4 = r0.f3536k
            java.util.Iterator r22 = r4.iterator()
        L_0x006e:
            boolean r4 = r22.hasNext()
            if (r4 == 0) goto L_0x01eb
            java.lang.Object r4 = r22.next()
            androidx.compose.ui.graphics.vector.k r4 = (androidx.compose.p015ui.graphics.vector.C1584k) r4
            boolean r5 = r4 instanceof androidx.compose.p015ui.graphics.vector.C1585l
            java.lang.String r6 = "property"
            if (r5 == 0) goto L_0x0137
            r5 = -326285835(0xffffffffec8d45f5, float:-1.3663112E27)
            r3.mo5465u(r5)
            androidx.compose.ui.graphics.vector.l r4 = (androidx.compose.p015ui.graphics.vector.C1585l) r4
            java.lang.String r5 = r4.f3539b
            java.lang.Object r5 = r15.get(r5)
            androidx.compose.ui.graphics.vector.h r5 = (androidx.compose.p015ui.graphics.vector.C1580h) r5
            androidx.compose.ui.graphics.vector.m$c r5 = androidx.compose.p015ui.graphics.vector.C1586m.C1589c.f3555a
            java.util.List<androidx.compose.ui.graphics.vector.d> r7 = r4.f3540c
            kotlin.jvm.internal.C19383o.m32797g(r5, r6)
            int r5 = r4.f3541d
            java.lang.String r8 = r4.f3539b
            androidx.compose.ui.graphics.vector.m$a r9 = androidx.compose.p015ui.graphics.vector.C1586m.C1587a.f3553a
            androidx.compose.ui.graphics.m r10 = r4.f3542e
            kotlin.jvm.internal.C19383o.m32797g(r9, r6)
            androidx.compose.ui.graphics.vector.m$b r9 = androidx.compose.p015ui.graphics.vector.C1586m.C1588b.f3554a
            float r11 = r4.f3543f
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            kotlin.jvm.internal.C19383o.m32797g(r9, r6)
            float r9 = r11.floatValue()
            androidx.compose.ui.graphics.vector.m$i r11 = androidx.compose.p015ui.graphics.vector.C1586m.C1595i.f3561a
            androidx.compose.ui.graphics.m r12 = r4.f3544g
            kotlin.jvm.internal.C19383o.m32797g(r11, r6)
            androidx.compose.ui.graphics.vector.m$j r11 = androidx.compose.p015ui.graphics.vector.C1586m.C1596j.f3562a
            float r13 = r4.f3545h
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            kotlin.jvm.internal.C19383o.m32797g(r11, r6)
            float r11 = r13.floatValue()
            androidx.compose.ui.graphics.vector.m$k r13 = androidx.compose.p015ui.graphics.vector.C1586m.C1597k.f3563a
            float r14 = r4.f3546i
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            kotlin.jvm.internal.C19383o.m32797g(r13, r6)
            float r13 = r14.floatValue()
            int r14 = r4.f3547j
            r16 = r15
            int r15 = r4.f3548k
            float r0 = r4.f3549l
            androidx.compose.ui.graphics.vector.m$p r1 = androidx.compose.p015ui.graphics.vector.C1586m.C1602p.f3568a
            float r2 = r4.f3550m
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            float r1 = r2.floatValue()
            androidx.compose.ui.graphics.vector.m$n r2 = androidx.compose.p015ui.graphics.vector.C1586m.C1600n.f3566a
            r25 = r3
            float r3 = r4.f3551n
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            kotlin.jvm.internal.C19383o.m32797g(r2, r6)
            float r2 = r3.floatValue()
            androidx.compose.ui.graphics.vector.m$o r3 = androidx.compose.p015ui.graphics.vector.C1586m.C1601o.f3567a
            float r4 = r4.f3552o
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            kotlin.jvm.internal.C19383o.m32797g(r3, r6)
            float r17 = r4.floatValue()
            r19 = 8
            r20 = 0
            r21 = 0
            r4 = r7
            r6 = r8
            r7 = r10
            r8 = r9
            r9 = r12
            r10 = r11
            r11 = r13
            r12 = r14
            r13 = r15
            r3 = 0
            r14 = r0
            r0 = r16
            r15 = r1
            r16 = r2
            r18 = r25
            androidx.compose.p015ui.graphics.vector.VectorComposeKt.m3386b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r25
            r1.mo5418R(r3)
        L_0x012d:
            r2 = r27
            r15 = r0
            r3 = r1
            r0 = r23
            r1 = r26
            goto L_0x006e
        L_0x0137:
            r1 = r3
            r0 = r15
            r3 = 0
            boolean r2 = r4 instanceof androidx.compose.p015ui.graphics.vector.C1581i
            if (r2 == 0) goto L_0x01e0
            r2 = -326283977(0xffffffffec8d4d37, float:-1.3665854E27)
            r1.mo5465u(r2)
            r2 = r4
            androidx.compose.ui.graphics.vector.i r2 = (androidx.compose.p015ui.graphics.vector.C1581i) r2
            java.lang.String r5 = r2.f3527b
            java.lang.Object r5 = r0.get(r5)
            androidx.compose.ui.graphics.vector.h r5 = (androidx.compose.p015ui.graphics.vector.C1580h) r5
            java.lang.String r5 = r2.f3527b
            androidx.compose.ui.graphics.vector.m$f r7 = androidx.compose.p015ui.graphics.vector.C1586m.C1592f.f3558a
            float r8 = r2.f3528c
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            kotlin.jvm.internal.C19383o.m32797g(r7, r6)
            float r7 = r8.floatValue()
            androidx.compose.ui.graphics.vector.m$g r8 = androidx.compose.p015ui.graphics.vector.C1586m.C1593g.f3559a
            float r9 = r2.f3531f
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            kotlin.jvm.internal.C19383o.m32797g(r8, r6)
            float r8 = r9.floatValue()
            androidx.compose.ui.graphics.vector.m$h r9 = androidx.compose.p015ui.graphics.vector.C1586m.C1594h.f3560a
            float r10 = r2.f3532g
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            kotlin.jvm.internal.C19383o.m32797g(r9, r6)
            float r9 = r10.floatValue()
            androidx.compose.ui.graphics.vector.m$l r10 = androidx.compose.p015ui.graphics.vector.C1586m.C1598l.f3564a
            float r11 = r2.f3533h
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            kotlin.jvm.internal.C19383o.m32797g(r10, r6)
            float r10 = r11.floatValue()
            androidx.compose.ui.graphics.vector.m$m r11 = androidx.compose.p015ui.graphics.vector.C1586m.C1599m.f3565a
            float r12 = r2.f3534i
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            kotlin.jvm.internal.C19383o.m32797g(r11, r6)
            float r11 = r12.floatValue()
            androidx.compose.ui.graphics.vector.m$d r12 = androidx.compose.p015ui.graphics.vector.C1586m.C1590d.f3556a
            float r13 = r2.f3529d
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            kotlin.jvm.internal.C19383o.m32797g(r12, r6)
            float r12 = r13.floatValue()
            androidx.compose.ui.graphics.vector.m$e r13 = androidx.compose.p015ui.graphics.vector.C1586m.C1591e.f3557a
            float r14 = r2.f3530e
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            kotlin.jvm.internal.C19383o.m32797g(r13, r6)
            float r13 = r14.floatValue()
            androidx.compose.ui.graphics.vector.m$c r14 = androidx.compose.p015ui.graphics.vector.C1586m.C1589c.f3555a
            java.util.List<androidx.compose.ui.graphics.vector.d> r2 = r2.f3535j
            kotlin.jvm.internal.C19383o.m32797g(r14, r6)
            r6 = 1450046638(0x566df4ae, float:6.5408787E13)
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 r14 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
            r14.<init>(r4, r0)
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = p628nj.C18263b.m30805A(r1, r6, r14)
            r15 = 939524096(0x38000000, float:3.0517578E-5)
            r16 = 0
            r4 = r5
            r5 = r7
            r6 = r12
            r7 = r13
            r12 = r2
            r13 = r14
            r14 = r1
            androidx.compose.p015ui.graphics.vector.VectorComposeKt.m3385a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.mo5418R(r3)
            goto L_0x012d
        L_0x01e0:
            r2 = -326282507(0xffffffffec8d52f5, float:-1.3668024E27)
            r1.mo5465u(r2)
            r1.mo5418R(r3)
            goto L_0x012d
        L_0x01eb:
            r1 = r3
            r0 = r15
        L_0x01ed:
            androidx.compose.runtime.v0 r1 = r1.mo5421U()
            if (r1 != 0) goto L_0x01f4
            goto L_0x0201
        L_0x01f4:
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2 r2 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
            r3 = r23
            r4 = r26
            r5 = r27
            r2.<init>(r3, r0, r4, r5)
            r1.f3081d = r2
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.vector.VectorPainterKt.m3392a(androidx.compose.ui.graphics.vector.i, java.util.Map, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: b */
    public static final VectorPainter m3393b(C1553c cVar, C1302d dVar) {
        C19383o.m32797g(cVar, ResponseConstants.IMAGE);
        dVar.mo5465u(1413834416);
        float f = cVar.f3429b;
        float f2 = cVar.f3430c;
        float f3 = cVar.f3431d;
        float f4 = cVar.f3432e;
        String str = cVar.f3428a;
        long j = cVar.f3434g;
        int i = cVar.f3435h;
        boolean z = cVar.f3436i;
        ComposableLambdaImpl A = C18263b.m30805A(dVar, 1873274766, new VectorPainterKt$rememberVectorPainter$3(cVar));
        dVar.mo5465u(1068590786);
        C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
        float B0 = bVar.mo3789B0(f);
        float B02 = bVar.mo3789B0(f2);
        if (Float.isNaN(f3)) {
            f3 = B0;
        }
        if (Float.isNaN(f4)) {
            f4 = B02;
        }
        C1545s sVar = new C1545s(j);
        C1527j jVar = new C1527j(i);
        dVar.mo5465u(511388516);
        boolean I = dVar.mo5408I(sVar) | dVar.mo5408I(jVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            if (!C1545s.m3357c(j, C1545s.f3364i)) {
                v = new C1546t(Build.VERSION.SDK_INT >= 29 ? C1529k.f3326a.mo6367a(j, i) : new PorterDuffColorFilter(C18263b.m30859o0(j), C1489a.m3160b(i)));
            } else {
                v = null;
            }
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1546t tVar = (C1546t) v;
        dVar.mo5465u(-492369756);
        Object v2 = dVar.mo5467v();
        if (v2 == C1302d.C1303a.f2828a) {
            v2 = new VectorPainter();
            dVar.mo5454o(v2);
        }
        dVar.mo5406H();
        VectorPainter vectorPainter = (VectorPainter) v2;
        vectorPainter.f3399f.setValue(new C8347f(C0114h.m319t(B0, B02)));
        vectorPainter.f3400g.setValue(Boolean.valueOf(z));
        vectorPainter.f3401h.f3394f.setValue(tVar);
        vectorPainter.mo6432e(str, f3, f4, A, dVar, 35840);
        dVar.mo5406H();
        dVar.mo5406H();
        return vectorPainter;
    }
}
