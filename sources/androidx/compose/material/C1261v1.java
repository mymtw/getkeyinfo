package androidx.compose.material;

import androidx.compose.animation.core.C0429h0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.v1 */
public final class C1261v1 {
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (r0 < ((java.lang.Number) r1.invoke(java.lang.Float.valueOf(r4), java.lang.Float.valueOf(r3))).floatValue()) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r0 > ((java.lang.Number) r1.invoke(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r4))).floatValue()) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        r0 = r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m2392a(float r15, float r16, java.util.Set r17, p753kq.C19861p r18, float r19, float r20) {
        /*
            r0 = r15
            r1 = r18
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r17.iterator()
        L_0x000e:
            boolean r5 = r4.hasNext()
            r6 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r4.next()
            r10 = r5
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            double r10 = (double) r10
            double r12 = (double) r0
            double r12 = r12 + r6
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x002e
            r8 = r9
        L_0x002e:
            if (r8 == 0) goto L_0x000e
            r3.add(r5)
            goto L_0x000e
        L_0x0034:
            java.lang.Float r3 = kotlin.collections.C19327t.m32647c1(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r17.iterator()
        L_0x0041:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r5.next()
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            double r11 = (double) r11
            double r13 = (double) r0
            double r13 = r13 - r6
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x005b
            r11 = r9
            goto L_0x005c
        L_0x005b:
            r11 = r8
        L_0x005c:
            if (r11 == 0) goto L_0x0041
            r4.add(r10)
            goto L_0x0041
        L_0x0062:
            java.lang.Float r4 = kotlin.collections.C19327t.m32648d1(r4)
            if (r3 != 0) goto L_0x0072
            if (r4 == 0) goto L_0x006f
            java.util.List r3 = p568fn.C17782b.m29864d0(r4)
            goto L_0x009a
        L_0x006f:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x009a
        L_0x0072:
            if (r4 != 0) goto L_0x0079
            java.util.List r3 = p568fn.C17782b.m29864d0(r3)
            goto L_0x009a
        L_0x0079:
            float r5 = r3.floatValue()
            float r6 = r4.floatValue()
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0087
            r5 = r9
            goto L_0x0088
        L_0x0087:
            r5 = r8
        L_0x0088:
            if (r5 == 0) goto L_0x008f
            java.util.List r3 = p568fn.C17782b.m29864d0(r3)
            goto L_0x009a
        L_0x008f:
            r5 = 2
            java.lang.Float[] r5 = new java.lang.Float[r5]
            r5[r8] = r3
            r5[r9] = r4
            java.util.List r3 = p568fn.C17782b.m29865e0(r5)
        L_0x009a:
            int r4 = r3.size()
            if (r4 == 0) goto L_0x0102
            if (r4 == r9) goto L_0x00f7
            java.lang.Object r4 = r3.get(r8)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            java.lang.Object r3 = r3.get(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x00d7
            int r2 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00c0
            r4 = r3
            goto L_0x0105
        L_0x00c0:
            java.lang.Float r2 = java.lang.Float.valueOf(r4)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            java.lang.Object r1 = r1.invoke(r2, r5)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00d7:
            float r2 = -r2
            int r2 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00dd
            goto L_0x0105
        L_0x00dd:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            java.lang.Object r1 = r1.invoke(r2, r5)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
        L_0x00f3:
            r0 = r3
            goto L_0x0104
        L_0x00f5:
            r0 = r4
            goto L_0x0104
        L_0x00f7:
            java.lang.Object r0 = r3.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L_0x0104
        L_0x0102:
            r0 = r16
        L_0x0104:
            r4 = r0
        L_0x0105:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C1261v1.m2392a(float, float, java.util.Set, kq.p, float, float):float");
    }

    /* renamed from: b */
    public static final Float m2393b(Object obj, Map map) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C19383o.m32792b(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    /* renamed from: c */
    public static C1268y m2394c(C1302d dVar) {
        C1302d dVar2 = dVar;
        dVar2.mo5465u(469524104);
        C1345l1 l1Var = ColorsKt.f2187a;
        long h = ((C1259v) dVar2.mo5410J(l1Var)).mo5361h();
        long b = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), 0.6f);
        long j = ((C1259v) dVar2.mo5410J(l1Var)).mo5363j();
        long b2 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), C19543e0.m33299P(dVar));
        long b3 = C1545s.m3356b(h, C19543e0.m33299P(dVar));
        Object[] objArr = {new C1545s(h), new C1545s(b), new C1545s(j), new C1545s(b2), new C1545s(b3)};
        dVar2.mo5465u(-568225417);
        boolean z = false;
        for (int i = 0; i < 5; i++) {
            z |= dVar2.mo5408I(objArr[i]);
        }
        Object v = dVar.mo5467v();
        if (z || v == C1302d.C1303a.f2828a) {
            long j2 = b3;
            C1268y yVar = r3;
            long j3 = h;
            C1268y yVar2 = new C1268y(j, C1545s.m3356b(j, 0.0f), h, C1545s.m3356b(h, 0.0f), b2, C1545s.m3356b(b2, 0.0f), j2, j3, b, b2, j2);
            C1268y yVar3 = yVar;
            dVar2.mo5454o(yVar3);
            v = yVar3;
        }
        dVar.mo5406H();
        C1268y yVar4 = (C1268y) v;
        dVar.mo5406H();
        return yVar4;
    }

    /* renamed from: d */
    public static C1436d m2395d(C1436d dVar, SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, C0640j jVar, C19861p pVar, C1213m1 m1Var, float f, int i) {
        C1213m1 m1Var2;
        C1213m1 m1Var3;
        C1436d dVar2 = dVar;
        int i2 = i;
        boolean z3 = (i2 & 8) != 0 ? true : z;
        boolean z4 = (i2 & 16) != 0 ? false : z2;
        C0640j jVar2 = (i2 & 32) != 0 ? null : jVar;
        SwipeableKt$swipeable$1 swipeableKt$swipeable$1 = (i2 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : pVar;
        if ((i2 & 128) != 0) {
            C0429h0<Float> h0Var = C1258u1.f2630a;
            Set keySet = map.keySet();
            C19383o.m32797g(keySet, "anchors");
            if (keySet.size() <= 1) {
                m1Var3 = null;
            } else {
                Float c1 = C19327t.m32647c1(keySet);
                C19383o.m32794d(c1);
                float floatValue = c1.floatValue();
                Float d1 = C19327t.m32648d1(keySet);
                C19383o.m32794d(d1);
                m1Var3 = new C1213m1(floatValue - d1.floatValue(), 10.0f, 10.0f);
            }
            m1Var2 = m1Var3;
        } else {
            m1Var2 = m1Var;
        }
        float f2 = (i2 & 256) != 0 ? C1258u1.f2631b : f;
        C19383o.m32797g(dVar, "$this$swipeable");
        C19383o.m32797g(swipeableState, "state");
        C19383o.m32797g(orientation, "orientation");
        C19383o.m32797g(swipeableKt$swipeable$1, "thresholds");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new SwipeableKt$swipeable$3(map, swipeableState, orientation, z3, jVar2, z4, m1Var2, swipeableKt$swipeable$1, f2));
    }
}
