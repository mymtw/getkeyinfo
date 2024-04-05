package p654qi;

import java.util.List;
import p636oi.C18298b;

/* renamed from: qi.a */
public final class C18450a extends C18298b {

    /* renamed from: m */
    public final C18451b f40597m;

    public C18450a(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length;
        this.f40597m = new C18451b(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0253, code lost:
        if ((r1.f40613b + 1) == r3.f40607g.getHeight()) goto L_0x026a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p636oi.C18300d mo69840g(int r29, boolean r30, byte[] r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = 0
            if (r30 == 0) goto L_0x0026
            qi.b r2 = r0.f40597m
            qi.b$h r2 = r2.f40606f
            android.util.SparseArray<qi.b$f> r3 = r2.f40641c
            r3.clear()
            android.util.SparseArray<qi.b$a> r3 = r2.f40642d
            r3.clear()
            android.util.SparseArray<qi.b$c> r3 = r2.f40643e
            r3.clear()
            android.util.SparseArray<qi.b$a> r3 = r2.f40644f
            r3.clear()
            android.util.SparseArray<qi.b$c> r3 = r2.f40645g
            r3.clear()
            r2.f40646h = r1
            r2.f40647i = r1
        L_0x0026:
            qi.c r2 = new qi.c
            qi.b r3 = r0.f40597m
            r3.getClass()
            bj.q r4 = new bj.q
            r5 = r29
            r6 = r31
            r4.<init>((int) r5, (byte[]) r6)
        L_0x0036:
            int r5 = r4.mo46895b()
            r6 = 48
            r7 = 2
            r8 = 3
            r9 = 1
            if (r5 < r6) goto L_0x0228
            r5 = 8
            int r6 = r4.mo46901h(r5)
            r11 = 15
            if (r6 != r11) goto L_0x0228
            qi.b$h r6 = r3.f40606f
            int r11 = r4.mo46901h(r5)
            r12 = 16
            int r13 = r4.mo46901h(r12)
            int r14 = r4.mo46901h(r12)
            int r15 = r4.mo46897d()
            int r15 = r15 + r14
            int r1 = r14 * 8
            int r10 = r4.mo46895b()
            if (r1 <= r10) goto L_0x0078
            java.lang.String r1 = "DvbParser"
            java.lang.String r5 = "Data field length exceeds limit"
            android.util.Log.w(r1, r5)
            int r1 = r4.mo46895b()
            r4.mo46907n(r1)
            goto L_0x0225
        L_0x0078:
            r1 = 4
            switch(r11) {
                case 16: goto L_0x01be;
                case 17: goto L_0x0106;
                case 18: goto L_0x00e4;
                case 19: goto L_0x00c2;
                case 20: goto L_0x007e;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x021d
        L_0x007e:
            int r5 = r6.f40639a
            if (r13 != r5) goto L_0x021d
            r4.mo46907n(r1)
            boolean r1 = r4.mo46900g()
            r4.mo46907n(r8)
            int r17 = r4.mo46901h(r12)
            int r18 = r4.mo46901h(r12)
            if (r1 == 0) goto L_0x00af
            int r10 = r4.mo46901h(r12)
            int r1 = r4.mo46901h(r12)
            int r5 = r4.mo46901h(r12)
            int r7 = r4.mo46901h(r12)
            r20 = r1
            r21 = r5
            r22 = r7
            r19 = r10
            goto L_0x00b7
        L_0x00af:
            r20 = r17
            r22 = r18
            r19 = 0
            r21 = 0
        L_0x00b7:
            qi.b$b r1 = new qi.b$b
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6.f40646h = r1
            goto L_0x021d
        L_0x00c2:
            int r1 = r6.f40639a
            if (r13 != r1) goto L_0x00d3
            qi.b$c r1 = p654qi.C18451b.m31147f(r4)
            android.util.SparseArray<qi.b$c> r5 = r6.f40643e
            int r6 = r1.f40618a
            r5.put(r6, r1)
            goto L_0x021d
        L_0x00d3:
            int r1 = r6.f40640b
            if (r13 != r1) goto L_0x021d
            qi.b$c r1 = p654qi.C18451b.m31147f(r4)
            android.util.SparseArray<qi.b$c> r5 = r6.f40645g
            int r6 = r1.f40618a
            r5.put(r6, r1)
            goto L_0x021d
        L_0x00e4:
            int r1 = r6.f40639a
            if (r13 != r1) goto L_0x00f5
            qi.b$a r1 = p654qi.C18451b.m31146e(r4, r14)
            android.util.SparseArray<qi.b$a> r5 = r6.f40642d
            int r6 = r1.f40608a
            r5.put(r6, r1)
            goto L_0x021d
        L_0x00f5:
            int r1 = r6.f40640b
            if (r13 != r1) goto L_0x021d
            qi.b$a r1 = p654qi.C18451b.m31146e(r4, r14)
            android.util.SparseArray<qi.b$a> r5 = r6.f40644f
            int r6 = r1.f40608a
            r5.put(r6, r1)
            goto L_0x021d
        L_0x0106:
            qi.b$d r10 = r6.f40647i
            int r11 = r6.f40639a
            if (r13 != r11) goto L_0x021d
            if (r10 == 0) goto L_0x021d
            int r11 = r4.mo46901h(r5)
            r4.mo46907n(r1)
            boolean r18 = r4.mo46900g()
            r4.mo46907n(r8)
            int r19 = r4.mo46901h(r12)
            int r20 = r4.mo46901h(r12)
            r4.mo46901h(r8)
            int r21 = r4.mo46901h(r8)
            r4.mo46907n(r7)
            int r22 = r4.mo46901h(r5)
            int r23 = r4.mo46901h(r5)
            int r24 = r4.mo46901h(r1)
            int r25 = r4.mo46901h(r7)
            r4.mo46907n(r7)
            int r14 = r14 + -10
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
        L_0x0148:
            if (r14 <= 0) goto L_0x0182
            int r13 = r4.mo46901h(r12)
            int r12 = r4.mo46901h(r7)
            r4.mo46901h(r7)
            r5 = 12
            int r7 = r4.mo46901h(r5)
            r4.mo46907n(r1)
            int r5 = r4.mo46901h(r5)
            int r14 = r14 + -6
            if (r12 == r9) goto L_0x0169
            r9 = 2
            if (r12 != r9) goto L_0x0173
        L_0x0169:
            r9 = 8
            r4.mo46901h(r9)
            r4.mo46901h(r9)
            int r14 = r14 + -2
        L_0x0173:
            qi.b$g r9 = new qi.b$g
            r9.<init>(r7, r5)
            r8.put(r13, r9)
            r5 = 8
            r7 = 2
            r9 = 1
            r12 = 16
            goto L_0x0148
        L_0x0182:
            qi.b$f r1 = new qi.b$f
            r16 = r1
            r17 = r11
            r26 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r5 = r10.f40623b
            if (r5 != 0) goto L_0x01b6
            android.util.SparseArray<qi.b$f> r5 = r6.f40641c
            java.lang.Object r5 = r5.get(r11)
            qi.b$f r5 = (p654qi.C18451b.C18457f) r5
            if (r5 == 0) goto L_0x01b6
            android.util.SparseArray<qi.b$g> r5 = r5.f40636j
            r10 = 0
        L_0x019e:
            int r7 = r5.size()
            if (r10 >= r7) goto L_0x01b6
            android.util.SparseArray<qi.b$g> r7 = r1.f40636j
            int r8 = r5.keyAt(r10)
            java.lang.Object r9 = r5.valueAt(r10)
            qi.b$g r9 = (p654qi.C18451b.C18458g) r9
            r7.put(r8, r9)
            int r10 = r10 + 1
            goto L_0x019e
        L_0x01b6:
            android.util.SparseArray<qi.b$f> r5 = r6.f40641c
            int r6 = r1.f40627a
            r5.put(r6, r1)
            goto L_0x021d
        L_0x01be:
            int r5 = r6.f40639a
            if (r13 != r5) goto L_0x021d
            qi.b$d r5 = r6.f40647i
            r7 = 8
            r4.mo46901h(r7)
            int r1 = r4.mo46901h(r1)
            r8 = 2
            int r9 = r4.mo46901h(r8)
            r4.mo46907n(r8)
            int r14 = r14 + -2
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
        L_0x01dc:
            if (r14 <= 0) goto L_0x01fc
            int r10 = r4.mo46901h(r7)
            r4.mo46907n(r7)
            r11 = 16
            int r12 = r4.mo46901h(r11)
            int r13 = r4.mo46901h(r11)
            int r14 = r14 + -6
            qi.b$e r7 = new qi.b$e
            r7.<init>(r12, r13)
            r8.put(r10, r7)
            r7 = 8
            goto L_0x01dc
        L_0x01fc:
            qi.b$d r7 = new qi.b$d
            r7.<init>(r1, r9, r8)
            if (r9 == 0) goto L_0x0215
            r6.f40647i = r7
            android.util.SparseArray<qi.b$f> r1 = r6.f40641c
            r1.clear()
            android.util.SparseArray<qi.b$a> r1 = r6.f40642d
            r1.clear()
            android.util.SparseArray<qi.b$c> r1 = r6.f40643e
            r1.clear()
            goto L_0x021d
        L_0x0215:
            if (r5 == 0) goto L_0x021d
            int r5 = r5.f40622a
            if (r5 == r1) goto L_0x021d
            r6.f40647i = r7
        L_0x021d:
            int r1 = r4.mo46897d()
            int r15 = r15 - r1
            r4.mo46908o(r15)
        L_0x0225:
            r1 = 0
            goto L_0x0036
        L_0x0228:
            qi.b$h r1 = r3.f40606f
            qi.b$d r4 = r1.f40647i
            if (r4 != 0) goto L_0x0235
            java.util.List r1 = java.util.Collections.emptyList()
            r0 = r2
            goto L_0x0400
        L_0x0235:
            qi.b$b r1 = r1.f40646h
            if (r1 == 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            qi.b$b r1 = r3.f40604d
        L_0x023c:
            android.graphics.Bitmap r5 = r3.f40607g
            if (r5 == 0) goto L_0x0256
            int r6 = r1.f40612a
            r7 = 1
            int r6 = r6 + r7
            int r5 = r5.getWidth()
            if (r6 != r5) goto L_0x0257
            int r5 = r1.f40613b
            int r5 = r5 + r7
            android.graphics.Bitmap r6 = r3.f40607g
            int r6 = r6.getHeight()
            if (r5 == r6) goto L_0x026a
            goto L_0x0257
        L_0x0256:
            r7 = 1
        L_0x0257:
            int r5 = r1.f40612a
            int r5 = r5 + r7
            int r6 = r1.f40613b
            int r6 = r6 + r7
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7)
            r3.f40607g = r5
            android.graphics.Canvas r6 = r3.f40603c
            r6.setBitmap(r5)
        L_0x026a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.util.SparseArray<qi.b$e> r4 = r4.f40624c
            r6 = 0
        L_0x0272:
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x03f8
            android.graphics.Canvas r7 = r3.f40603c
            r7.save()
            java.lang.Object r7 = r4.valueAt(r6)
            qi.b$e r7 = (p654qi.C18451b.C18456e) r7
            int r9 = r4.keyAt(r6)
            qi.b$h r10 = r3.f40606f
            android.util.SparseArray<qi.b$f> r10 = r10.f40641c
            java.lang.Object r9 = r10.get(r9)
            qi.b$f r9 = (p654qi.C18451b.C18457f) r9
            int r10 = r7.f40625a
            int r11 = r1.f40614c
            int r10 = r10 + r11
            int r7 = r7.f40626b
            int r11 = r1.f40616e
            int r7 = r7 + r11
            int r11 = r9.f40629c
            int r11 = r11 + r10
            int r12 = r1.f40615d
            int r11 = java.lang.Math.min(r11, r12)
            int r12 = r9.f40630d
            int r12 = r12 + r7
            int r13 = r1.f40617f
            int r12 = java.lang.Math.min(r12, r13)
            android.graphics.Canvas r13 = r3.f40603c
            r13.clipRect(r10, r7, r11, r12)
            qi.b$h r11 = r3.f40606f
            android.util.SparseArray<qi.b$a> r11 = r11.f40642d
            int r12 = r9.f40632f
            java.lang.Object r11 = r11.get(r12)
            qi.b$a r11 = (p654qi.C18451b.C18452a) r11
            if (r11 != 0) goto L_0x02d0
            qi.b$h r11 = r3.f40606f
            android.util.SparseArray<qi.b$a> r11 = r11.f40644f
            int r12 = r9.f40632f
            java.lang.Object r11 = r11.get(r12)
            qi.b$a r11 = (p654qi.C18451b.C18452a) r11
            if (r11 != 0) goto L_0x02d0
            qi.b$a r11 = r3.f40605e
        L_0x02d0:
            android.util.SparseArray<qi.b$g> r12 = r9.f40636j
            r13 = 0
        L_0x02d3:
            int r14 = r12.size()
            if (r13 >= r14) goto L_0x035a
            int r14 = r12.keyAt(r13)
            java.lang.Object r15 = r12.valueAt(r13)
            qi.b$g r15 = (p654qi.C18451b.C18458g) r15
            qi.b$h r8 = r3.f40606f
            android.util.SparseArray<qi.b$c> r8 = r8.f40643e
            java.lang.Object r8 = r8.get(r14)
            qi.b$c r8 = (p654qi.C18451b.C18454c) r8
            if (r8 != 0) goto L_0x02f9
            qi.b$h r8 = r3.f40606f
            android.util.SparseArray<qi.b$c> r8 = r8.f40645g
            java.lang.Object r8 = r8.get(r14)
            qi.b$c r8 = (p654qi.C18451b.C18454c) r8
        L_0x02f9:
            if (r8 == 0) goto L_0x0342
            boolean r14 = r8.f40619b
            if (r14 == 0) goto L_0x0301
            r14 = 0
            goto L_0x0303
        L_0x0301:
            android.graphics.Paint r14 = r3.f40601a
        L_0x0303:
            int r0 = r9.f40631e
            r25 = r4
            int r4 = r15.f40637a
            int r4 = r4 + r10
            int r15 = r15.f40638b
            int r15 = r15 + r7
            r26 = r12
            android.graphics.Canvas r12 = r3.f40603c
            r27 = r2
            r2 = 3
            if (r0 != r2) goto L_0x031b
            int[] r2 = r11.f40611d
        L_0x0318:
            r31 = r6
            goto L_0x0324
        L_0x031b:
            r2 = 2
            if (r0 != r2) goto L_0x0321
            int[] r2 = r11.f40610c
            goto L_0x0318
        L_0x0321:
            int[] r2 = r11.f40609b
            goto L_0x0318
        L_0x0324:
            byte[] r6 = r8.f40620c
            r18 = r6
            r19 = r2
            r20 = r0
            r21 = r4
            r22 = r15
            r23 = r14
            r24 = r12
            p654qi.C18451b.m31145d(r18, r19, r20, r21, r22, r23, r24)
            byte[] r6 = r8.f40621d
            r8 = 1
            int r22 = r15 + 1
            r18 = r6
            p654qi.C18451b.m31145d(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x034b
        L_0x0342:
            r27 = r2
            r25 = r4
            r31 = r6
            r26 = r12
            r8 = 1
        L_0x034b:
            int r13 = r13 + 1
            r0 = r28
            r6 = r31
            r4 = r25
            r12 = r26
            r2 = r27
            r8 = 3
            goto L_0x02d3
        L_0x035a:
            r27 = r2
            r25 = r4
            r31 = r6
            r8 = 1
            boolean r0 = r9.f40628b
            if (r0 == 0) goto L_0x03a5
            int r0 = r9.f40631e
            r2 = 3
            if (r0 != r2) goto L_0x0372
            int[] r0 = r11.f40611d
            int r4 = r9.f40633g
            r0 = r0[r4]
            r4 = 2
            goto L_0x0382
        L_0x0372:
            r4 = 2
            if (r0 != r4) goto L_0x037c
            int[] r0 = r11.f40610c
            int r6 = r9.f40634h
            r0 = r0[r6]
            goto L_0x0382
        L_0x037c:
            int[] r0 = r11.f40609b
            int r6 = r9.f40635i
            r0 = r0[r6]
        L_0x0382:
            android.graphics.Paint r6 = r3.f40602b
            r6.setColor(r0)
            android.graphics.Canvas r0 = r3.f40603c
            float r6 = (float) r10
            float r11 = (float) r7
            int r12 = r9.f40629c
            int r12 = r12 + r10
            float r12 = (float) r12
            int r13 = r9.f40630d
            int r13 = r13 + r7
            float r13 = (float) r13
            android.graphics.Paint r14 = r3.f40602b
            r16 = r0
            r17 = r6
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r16.drawRect(r17, r18, r19, r20, r21)
            goto L_0x03a7
        L_0x03a5:
            r2 = 3
            r4 = 2
        L_0x03a7:
            oi.a$a r0 = new oi.a$a
            r0.<init>()
            android.graphics.Bitmap r6 = r3.f40607g
            int r11 = r9.f40629c
            int r12 = r9.f40630d
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r10, r7, r11, r12)
            r0.f40165b = r6
            float r6 = (float) r10
            int r10 = r1.f40612a
            float r10 = (float) r10
            float r6 = r6 / r10
            r0.f40171h = r6
            r6 = 0
            r0.f40172i = r6
            float r7 = (float) r7
            int r11 = r1.f40613b
            float r11 = (float) r11
            float r7 = r7 / r11
            r0.f40168e = r7
            r0.f40169f = r6
            r0.f40170g = r6
            int r6 = r9.f40629c
            float r6 = (float) r6
            float r6 = r6 / r10
            r0.f40175l = r6
            int r6 = r9.f40630d
            float r6 = (float) r6
            float r6 = r6 / r11
            r0.f40176m = r6
            oi.a r0 = r0.mo69838a()
            r5.add(r0)
            android.graphics.Canvas r0 = r3.f40603c
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.CLEAR
            r7 = 0
            r0.drawColor(r7, r6)
            android.graphics.Canvas r0 = r3.f40603c
            r0.restore()
            int r6 = r31 + 1
            r0 = r28
            r8 = r2
            r4 = r25
            r2 = r27
            goto L_0x0272
        L_0x03f8:
            r27 = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r0 = r27
        L_0x0400:
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p654qi.C18450a.mo69840g(int, boolean, byte[]):oi.d");
    }
}
