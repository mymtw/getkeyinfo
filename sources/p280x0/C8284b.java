package p280x0;

import android.util.TypedValue;

/* renamed from: x0.b */
public final class C8284b {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f18155a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m16575a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m16576b(r4, r6, r0, r5)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p280x0.C8284b.m16575a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m16576b(android.content.res.Resources r35, android.content.res.Resources.Theme r36, android.util.AttributeSet r37, android.content.res.XmlResourceParser r38) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            java.lang.String r3 = r38.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x034d
            int r3 = r38.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r38.next()
            if (r9 == r4) goto L_0x033c
            int r10 = r38.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x033c
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x032b
            if (r10 > r3) goto L_0x032b
            java.lang.String r9 = r38.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x032b
        L_0x0042:
            int[] r9 = p405nc.C13110a.f28826d
            if (r1 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r2, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r2, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x008f
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f18155a
            java.lang.Object r15 = r10.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L_0x006b
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r10.set(r15)
        L_0x006b:
            r0.getValue(r13, r15, r4)
            int r10 = r15.type
            r15 = 28
            if (r10 < r15) goto L_0x007a
            r15 = 31
            if (r10 > r15) goto L_0x007a
            r10 = r4
            goto L_0x007b
        L_0x007a:
            r10 = r7
        L_0x007b:
            if (r10 != 0) goto L_0x008f
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008a }
            android.content.res.ColorStateList r10 = m16575a(r0, r10, r1)     // Catch:{ Exception -> 0x008a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008a }
            goto L_0x0093
        L_0x008a:
            int r10 = r9.getColor(r7, r14)
            goto L_0x0093
        L_0x008f:
            int r10 = r9.getColor(r7, r14)
        L_0x0093:
            boolean r13 = r9.hasValue(r4)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x00a0
            float r11 = r9.getFloat(r4, r14)
            goto L_0x00ac
        L_0x00a0:
            boolean r13 = r9.hasValue(r11)
            if (r13 == 0) goto L_0x00ab
            float r11 = r9.getFloat(r11, r14)
            goto L_0x00ac
        L_0x00ab:
            r11 = r14
        L_0x00ac:
            boolean r13 = p002a1.C0006a.m80a()
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 4
            if (r13 == 0) goto L_0x00c0
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00c0
            float r13 = r9.getFloat(r12, r15)
            goto L_0x00c4
        L_0x00c0:
            float r13 = r9.getFloat(r4, r15)
        L_0x00c4:
            r9.recycle()
            int r9 = r37.getAttributeCount()
            int[] r15 = new int[r9]
            r4 = r7
            r12 = r4
        L_0x00cf:
            if (r4 >= r9) goto L_0x00ff
            int r14 = r2.getAttributeNameResource(r4)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r7) goto L_0x00f7
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r7) goto L_0x00f7
            r7 = 2130968628(0x7f040034, float:1.7545915E38)
            if (r14 == r7) goto L_0x00f7
            r7 = 2130969452(0x7f04036c, float:1.7547586E38)
            if (r14 == r7) goto L_0x00f7
            int r7 = r12 + 1
            r0 = 0
            boolean r19 = r2.getAttributeBooleanValue(r4, r0)
            if (r19 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            int r14 = -r14
        L_0x00f4:
            r15[r12] = r14
            r12 = r7
        L_0x00f7:
            int r4 = r4 + 1
            r0 = r35
            r7 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cf
        L_0x00ff:
            int[] r0 = android.util.StateSet.trimStateSet(r15, r12)
            r4 = 0
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 < 0) goto L_0x0110
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0110
            r7 = 1
            goto L_0x0111
        L_0x0110:
            r7 = 0
        L_0x0111:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0120
            if (r7 != 0) goto L_0x0120
            r4 = r0
            r28 = r3
            r16 = 1
            goto L_0x02e6
        L_0x0120:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = kotlinx.coroutines.C19543e0.m33285A(r11, r14, r12)
            if (r7 == 0) goto L_0x02d9
            x0.a r7 = p280x0.C8283a.m16572a(r10)
            float r10 = r7.f18149a
            float r7 = r7.f18150b
            x0.k r12 = p280x0.C8300k.f18186k
            double r14 = (double) r7
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x02cf
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 0
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x02cf
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x015c
            goto L_0x02cf
        L_0x015c:
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x0162
            r10 = r4
            goto L_0x0168
        L_0x0162:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0168:
            r20 = r4
            r15 = r7
            r14 = 0
            r19 = 1
        L_0x016e:
            float r21 = r20 - r7
            float r21 = java.lang.Math.abs(r21)
            r22 = 1053609165(0x3ecccccd, float:0.4)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 < 0) goto L_0x02be
            r21 = 1148846080(0x447a0000, float:1000.0)
            r23 = r4
            r24 = r9
            r22 = r21
            r25 = 0
        L_0x0185:
            float r26 = r23 - r24
            float r26 = java.lang.Math.abs(r26)
            r27 = 1008981770(0x3c23d70a, float:0.01)
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            r27 = 1073741824(0x40000000, float:2.0)
            if (r26 <= 0) goto L_0x027a
            float r26 = r24 - r23
            float r26 = r26 / r27
            float r4 = r26 + r23
            x0.a r9 = p280x0.C8283a.m16573b(r4, r15, r10)
            x0.k r1 = p280x0.C8300k.f18186k
            int r1 = r9.mo20889c(r1)
            int r9 = android.graphics.Color.red(r1)
            float r9 = p173m.C7279a.m13953k(r9)
            int r28 = android.graphics.Color.green(r1)
            float r28 = p173m.C7279a.m13953k(r28)
            int r29 = android.graphics.Color.blue(r1)
            float r29 = p173m.C7279a.m13953k(r29)
            float[][] r30 = p173m.C7279a.f16147j
            r16 = 1
            r30 = r30[r16]
            r18 = 0
            r31 = r30[r18]
            float r9 = r9 * r31
            r31 = r30[r16]
            float r28 = r28 * r31
            float r28 = r28 + r9
            r9 = 2
            r17 = r30[r9]
            float r29 = r29 * r17
            float r29 = r29 + r28
            r17 = 1120403456(0x42c80000, float:100.0)
            float r9 = r29 / r17
            r28 = 1007753895(0x3c111aa7, float:0.008856452)
            int r28 = (r9 > r28 ? 1 : (r9 == r28 ? 0 : -1))
            if (r28 > 0) goto L_0x01e8
            r28 = 1147261687(0x4461d2f7, float:903.2963)
            float r9 = r9 * r28
            r28 = r3
            goto L_0x01f7
        L_0x01e8:
            r28 = r3
            double r2 = (double) r9
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r9 = r2 - r3
        L_0x01f7:
            float r2 = r13 - r9
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x024f
            x0.a r1 = p280x0.C8283a.m16572a(r1)
            float r3 = r1.f18151c
            r29 = r2
            float r2 = r1.f18150b
            x0.a r2 = p280x0.C8283a.m16573b(r3, r2, r10)
            float r3 = r1.f18152d
            r30 = r4
            float r4 = r2.f18152d
            float r3 = r3 - r4
            float r4 = r1.f18153e
            r31 = r10
            float r10 = r2.f18153e
            float r4 = r4 - r10
            float r10 = r1.f18154f
            float r2 = r2.f18154f
            float r10 = r10 - r2
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r4 = r4 + r3
            float r10 = r10 * r10
            float r10 = r10 + r4
            double r2 = (double) r10
            double r2 = java.lang.Math.sqrt(r2)
            r32 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r4 = r0
            r10 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            double r0 = r0 * r32
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0256
            r22 = r0
            r25 = r10
            r21 = r29
            goto L_0x0256
        L_0x024f:
            r30 = r4
            r31 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = r0
        L_0x0256:
            r0 = 0
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0260
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0260
            goto L_0x0289
        L_0x0260:
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0267
            r23 = r30
            goto L_0x0269
        L_0x0267:
            r24 = r30
        L_0x0269:
            r1 = r36
            r2 = r37
            r9 = r17
            r3 = r28
            r10 = r31
            r34 = r4
            r4 = r0
            r0 = r34
            goto L_0x0185
        L_0x027a:
            r28 = r3
            r17 = r9
            r31 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r34 = r4
            r4 = r0
            r0 = r34
        L_0x0289:
            r2 = r25
            if (r19 == 0) goto L_0x029e
            if (r2 == 0) goto L_0x0294
            int r10 = r2.mo20889c(r12)
            goto L_0x02de
        L_0x0294:
            float r2 = r7 - r20
            float r2 = r2 / r27
            float r2 = r2 + r20
            r15 = r2
            r19 = 0
            goto L_0x02ad
        L_0x029e:
            if (r2 != 0) goto L_0x02a4
            r7 = r15
            r15 = r20
            goto L_0x02a5
        L_0x02a4:
            r14 = r2
        L_0x02a5:
            float r2 = r7 - r15
            float r2 = r2 / r27
            float r2 = r2 + r15
            r20 = r15
            r15 = r2
        L_0x02ad:
            r1 = r36
            r2 = r37
            r9 = r17
            r3 = r28
            r10 = r31
            r34 = r4
            r4 = r0
            r0 = r34
            goto L_0x016e
        L_0x02be:
            r4 = r0
            r28 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02ca
            int r10 = p173m.C7279a.m13952j(r13)
            goto L_0x02de
        L_0x02ca:
            int r10 = r14.mo20889c(r12)
            goto L_0x02de
        L_0x02cf:
            r4 = r0
            r28 = r3
            r16 = 1
            int r10 = p173m.C7279a.m13952j(r13)
            goto L_0x02de
        L_0x02d9:
            r4 = r0
            r28 = r3
            r16 = 1
        L_0x02de:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02e6:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L_0x02fb
            r1 = 4
            if (r8 > r1) goto L_0x02f2
            r1 = r2
            goto L_0x02f4
        L_0x02f2:
            int r1 = r8 * 2
        L_0x02f4:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r8)
            r5 = r1
        L_0x02fb:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x0319
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            int r2 = r8 * 2
        L_0x030e:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x0319:
            r6[r8] = r4
            int[][] r6 = (int[][]) r6
            r1 = r36
            r2 = r37
            r8 = r0
            r4 = r16
            r3 = r28
            r7 = 0
            r0 = r35
            goto L_0x0020
        L_0x032b:
            r28 = r3
            r16 = r4
            r0 = r35
            r1 = r36
            r2 = r37
            r4 = r16
            r3 = r28
            r7 = 0
            goto L_0x0020
        L_0x033c:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x034d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r38.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p280x0.C8284b.m16576b(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.content.res.XmlResourceParser):android.content.res.ColorStateList");
    }
}
