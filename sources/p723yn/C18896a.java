package p723yn;

import java.lang.reflect.Array;
import p683tn.C18567f;
import p699vn.C18667b;

/* renamed from: yn.a */
public final class C18896a implements C18567f {
    /* renamed from: a */
    public static C18667b m31983a(byte[][] bArr, int i) {
        int i2 = i * 2;
        int length = bArr.length + i2;
        C18667b bVar = new C18667b(bArr[0].length + i2, length);
        int length2 = bVar.f41281e.length;
        for (int i3 = 0; i3 < length2; i3++) {
            bVar.f41281e[i3] = 0;
        }
        int i4 = (length - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    bVar.mo70175b(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return bVar;
    }

    /* renamed from: b */
    public static byte[][] m31984b(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x037d: MOVE  (r9v3 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x043a A[LOOP:13: B:211:0x0438->B:212:0x043a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04e0  */
    /* renamed from: f */
    public final p699vn.C18667b mo4160f(java.lang.String r23, com.google.zxing.BarcodeFormat r24, java.util.EnumMap r25) throws com.google.zxing.WriterException {
        /*
            r22 = this;
            r0 = r23
            r1 = r25
            com.google.zxing.BarcodeFormat r2 = com.google.zxing.BarcodeFormat.PDF_417
            r3 = r24
            if (r3 != r2) goto L_0x04ef
            com.google.zxing.pdf417.encoder.Compaction r2 = com.google.zxing.pdf417.encoder.Compaction.AUTO
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.PDF417_COMPACT
            boolean r4 = r1.containsKey(r3)
            if (r4 == 0) goto L_0x0025
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = r3.toString()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.PDF417_COMPACTION
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x003a
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = r2.toString()
            com.google.zxing.pdf417.encoder.Compaction r2 = com.google.zxing.pdf417.encoder.Compaction.valueOf(r2)
        L_0x003a:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.PDF417_DIMENSIONS
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x0050
            java.lang.Object r4 = r1.get(r4)
            zn.a r4 = (p731zn.C18970a) r4
            r4.getClass()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            goto L_0x0056
        L_0x0050:
            r4 = 2
            r5 = 30
            r6 = 2
            r7 = 30
        L_0x0056:
            com.google.zxing.EncodeHintType r8 = com.google.zxing.EncodeHintType.MARGIN
            boolean r9 = r1.containsKey(r8)
            if (r9 == 0) goto L_0x006b
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            goto L_0x006d
        L_0x006b:
            r8 = 30
        L_0x006d:
            com.google.zxing.EncodeHintType r9 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r10 = r1.containsKey(r9)
            if (r10 == 0) goto L_0x0082
            java.lang.Object r9 = r1.get(r9)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            goto L_0x0083
        L_0x0082:
            r9 = 2
        L_0x0083:
            com.google.zxing.EncodeHintType r10 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L_0x0098
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            java.lang.String r10 = "Error correction level must be between 0 and 8!"
            if (r9 < 0) goto L_0x04e8
            r11 = 8
            if (r9 > r11) goto L_0x04e8
            int r11 = r9 + 1
            r12 = 1
            int r11 = r12 << r11
            byte[] r12 = p731zn.C18971b.f42290a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r13 = r23.length()
            r12.<init>(r13)
            r13 = 900(0x384, float:1.261E-42)
            if (r1 != 0) goto L_0x00b8
            java.nio.charset.Charset r1 = p731zn.C18971b.f42294e
            goto L_0x0114
        L_0x00b8:
            java.nio.charset.Charset r14 = p731zn.C18971b.f42294e
            boolean r14 = r14.equals(r1)
            if (r14 != 0) goto L_0x0114
            java.lang.String r14 = r1.name()
            com.google.zxing.common.CharacterSetECI r14 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r14)
            if (r14 == 0) goto L_0x0114
            int r14 = r14.getValue()
            if (r14 < 0) goto L_0x00dc
            if (r14 >= r13) goto L_0x00dc
            r13 = 927(0x39f, float:1.299E-42)
            r12.append(r13)
            char r13 = (char) r14
            r12.append(r13)
            goto L_0x0114
        L_0x00dc:
            r15 = 810900(0xc5f94, float:1.136313E-39)
            if (r14 >= r15) goto L_0x00f4
            r15 = 926(0x39e, float:1.298E-42)
            r12.append(r15)
            int r15 = r14 / 900
            int r15 = r15 + -1
            char r15 = (char) r15
            r12.append(r15)
            int r14 = r14 % r13
            char r13 = (char) r14
            r12.append(r13)
            goto L_0x0114
        L_0x00f4:
            r13 = 811800(0xc6318, float:1.137574E-39)
            if (r14 >= r13) goto L_0x0104
            r13 = 925(0x39d, float:1.296E-42)
            r12.append(r13)
            int r15 = r15 - r14
            char r13 = (char) r15
            r12.append(r13)
            goto L_0x0114
        L_0x0104:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r2 = "ECI number not in valid range from 0..811799, but was "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0114:
            int r13 = r23.length()
            int[] r14 = p731zn.C18971b.C18972a.f42295a
            int r2 = r2.ordinal()
            r2 = r14[r2]
            r14 = 3
            r15 = 1
            if (r2 == r15) goto L_0x02c6
            r15 = 2
            if (r2 == r15) goto L_0x02b2
            if (r2 == r14) goto L_0x029e
            r2 = 0
            r14 = 0
        L_0x012b:
            r15 = 0
        L_0x012c:
            if (r2 >= r13) goto L_0x0293
            r24 = r15
            int r15 = r23.length()
            r16 = 48
            if (r2 >= r15) goto L_0x0163
            char r17 = r0.charAt(r2)
            r18 = 0
            r25 = r10
            r10 = r16
            r16 = r8
            r8 = r17
            r17 = r3
            r3 = r2
        L_0x0149:
            if (r8 < r10) goto L_0x0151
            r10 = 57
            if (r8 > r10) goto L_0x0151
            r10 = 1
            goto L_0x0152
        L_0x0151:
            r10 = 0
        L_0x0152:
            if (r10 == 0) goto L_0x016b
            if (r3 >= r15) goto L_0x016b
            int r18 = r18 + 1
            int r3 = r3 + 1
            if (r3 >= r15) goto L_0x0160
            char r8 = r0.charAt(r3)
        L_0x0160:
            r10 = 48
            goto L_0x0149
        L_0x0163:
            r17 = r3
            r16 = r8
            r25 = r10
            r18 = 0
        L_0x016b:
            r3 = r18
            r8 = 13
            if (r3 < r8) goto L_0x0182
            r8 = 902(0x386, float:1.264E-42)
            r12.append(r8)
            p731zn.C18971b.m32089b(r12, r2, r3, r0)
            int r2 = r2 + r3
            r14 = 2
            r10 = r25
            r8 = r16
            r3 = r17
            goto L_0x012b
        L_0x0182:
            int r10 = r23.length()
            r15 = r2
        L_0x0187:
            if (r15 >= r10) goto L_0x01e8
            char r18 = r0.charAt(r15)
            r19 = 0
            r20 = r19
            r19 = r4
            r4 = r20
            r21 = r18
            r18 = r9
            r9 = r21
        L_0x019b:
            if (r4 >= r8) goto L_0x01bc
            r8 = 48
            if (r9 < r8) goto L_0x01a7
            r8 = 57
            if (r9 > r8) goto L_0x01a7
            r8 = 1
            goto L_0x01a8
        L_0x01a7:
            r8 = 0
        L_0x01a8:
            if (r8 == 0) goto L_0x01ba
            if (r15 >= r10) goto L_0x01ba
            int r4 = r4 + 1
            int r15 = r15 + 1
            if (r15 >= r10) goto L_0x01b7
            char r8 = r0.charAt(r15)
            r9 = r8
        L_0x01b7:
            r8 = 13
            goto L_0x019b
        L_0x01ba:
            r8 = 13
        L_0x01bc:
            if (r4 < r8) goto L_0x01c1
            int r15 = r15 - r2
            int r15 = r15 - r4
            goto L_0x01ed
        L_0x01c1:
            if (r4 > 0) goto L_0x01e1
            char r4 = r0.charAt(r15)
            r9 = 9
            if (r4 == r9) goto L_0x01dc
            r9 = 10
            if (r4 == r9) goto L_0x01dc
            if (r4 == r8) goto L_0x01dc
            r8 = 32
            if (r4 < r8) goto L_0x01da
            r8 = 126(0x7e, float:1.77E-43)
            if (r4 > r8) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r4 = 0
            goto L_0x01dd
        L_0x01dc:
            r4 = 1
        L_0x01dd:
            if (r4 == 0) goto L_0x01ec
            int r15 = r15 + 1
        L_0x01e1:
            r8 = 13
            r9 = r18
            r4 = r19
            goto L_0x0187
        L_0x01e8:
            r19 = r4
            r18 = r9
        L_0x01ec:
            int r15 = r15 - r2
        L_0x01ed:
            r4 = 5
            if (r15 >= r4) goto L_0x0275
            if (r3 != r13) goto L_0x01f4
            goto L_0x0275
        L_0x01f4:
            java.nio.charset.CharsetEncoder r3 = r1.newEncoder()
            int r4 = r23.length()
            r8 = r2
        L_0x01fd:
            if (r8 >= r4) goto L_0x0253
            char r9 = r0.charAt(r8)
            r10 = 0
        L_0x0204:
            r15 = 13
            if (r10 >= r15) goto L_0x0220
            r15 = 48
            if (r9 < r15) goto L_0x0212
            r15 = 57
            if (r9 > r15) goto L_0x0212
            r9 = 1
            goto L_0x0213
        L_0x0212:
            r9 = 0
        L_0x0213:
            if (r9 == 0) goto L_0x0220
            int r10 = r10 + 1
            int r9 = r8 + r10
            if (r9 >= r4) goto L_0x0220
            char r9 = r0.charAt(r9)
            goto L_0x0204
        L_0x0220:
            r9 = 13
            if (r10 < r9) goto L_0x0225
            goto L_0x0253
        L_0x0225:
            char r9 = r0.charAt(r8)
            boolean r10 = r3.canEncode(r9)
            if (r10 == 0) goto L_0x0232
            int r8 = r8 + 1
            goto L_0x01fd
        L_0x0232:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non-encodable character detected: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " (Unicode: "
            r1.append(r2)
            r1.append(r9)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0253:
            int r8 = r8 - r2
            if (r8 != 0) goto L_0x0257
            r8 = 1
        L_0x0257:
            int r8 = r8 + r2
            java.lang.String r2 = r0.substring(r2, r8)
            byte[] r2 = r2.getBytes(r1)
            int r3 = r2.length
            r4 = 1
            if (r3 != r4) goto L_0x026d
            if (r14 != 0) goto L_0x026d
            r3 = 0
            p731zn.C18971b.m32088a(r2, r4, r3, r12)
            r15 = r24
            goto L_0x0273
        L_0x026d:
            int r3 = r2.length
            p731zn.C18971b.m32088a(r2, r3, r14, r12)
            r14 = 1
            r15 = 0
        L_0x0273:
            r2 = r8
            goto L_0x0287
        L_0x0275:
            if (r14 == 0) goto L_0x027f
            r3 = 900(0x384, float:1.261E-42)
            r12.append(r3)
            r3 = 0
            r14 = 0
            goto L_0x0281
        L_0x027f:
            r3 = r24
        L_0x0281:
            int r3 = p731zn.C18971b.m32090c(r0, r2, r15, r12, r3)
            int r2 = r2 + r15
            r15 = r3
        L_0x0287:
            r10 = r25
            r8 = r16
            r3 = r17
            r9 = r18
            r4 = r19
            goto L_0x012c
        L_0x0293:
            r17 = r3
            r19 = r4
            r16 = r8
            r18 = r9
            r25 = r10
            goto L_0x02d4
        L_0x029e:
            r17 = r3
            r19 = r4
            r16 = r8
            r18 = r9
            r25 = r10
            r1 = 902(0x386, float:1.264E-42)
            r12.append(r1)
            r1 = 0
            p731zn.C18971b.m32089b(r12, r1, r13, r0)
            goto L_0x02d4
        L_0x02b2:
            r17 = r3
            r19 = r4
            r16 = r8
            r18 = r9
            r25 = r10
            byte[] r1 = r0.getBytes(r1)
            int r2 = r1.length
            r3 = 1
            p731zn.C18971b.m32088a(r1, r2, r3, r12)
            goto L_0x02d4
        L_0x02c6:
            r17 = r3
            r19 = r4
            r16 = r8
            r18 = r9
            r25 = r10
            r1 = 0
            p731zn.C18971b.m32090c(r0, r1, r13, r12, r1)
        L_0x02d4:
            java.lang.String r1 = r12.toString()
            int r2 = r1.length()
            r3 = 0
            r4 = 0
            r8 = r19
        L_0x02e0:
            if (r8 > r5) goto L_0x0324
            int r9 = r2 + 1
            int r9 = r9 + r11
            int r10 = r9 / r8
            int r10 = r10 + 1
            int r12 = r8 * r10
            int r9 = r9 + r8
            if (r12 < r9) goto L_0x02f0
            int r10 = r10 + -1
        L_0x02f0:
            if (r10 < r6) goto L_0x0324
            if (r10 > r7) goto L_0x0321
            int r9 = r8 * 17
            int r9 = r9 + 69
            float r9 = (float) r9
            r12 = 1052166324(0x3eb6c8b4, float:0.357)
            float r9 = r9 * r12
            float r12 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r13
            float r9 = r9 / r12
            if (r4 == 0) goto L_0x0316
            r12 = 1077936128(0x40400000, float:3.0)
            float r13 = r9 - r12
            float r13 = java.lang.Math.abs(r13)
            float r12 = r3 - r12
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0321
        L_0x0316:
            r3 = 2
            int[] r3 = new int[r3]
            r4 = 0
            r3[r4] = r8
            r4 = 1
            r3[r4] = r10
            r4 = r3
            r3 = r9
        L_0x0321:
            int r8 = r8 + 1
            goto L_0x02e0
        L_0x0324:
            if (r4 != 0) goto L_0x0341
            int r3 = r2 + 1
            int r3 = r3 + r11
            int r5 = r3 / r19
            int r5 = r5 + 1
            int r7 = r19 * r5
            int r3 = r3 + r19
            if (r7 < r3) goto L_0x0335
            int r5 = r5 + -1
        L_0x0335:
            if (r5 >= r6) goto L_0x0341
            r3 = 2
            int[] r4 = new int[r3]
            r3 = 0
            r4[r3] = r19
            r5 = 1
            r4[r5] = r6
            goto L_0x0343
        L_0x0341:
            r3 = 0
            r5 = 1
        L_0x0343:
            if (r4 == 0) goto L_0x04e0
            r3 = r4[r3]
            r4 = r4[r5]
            int r6 = r3 * r4
            int r6 = r6 - r11
            int r7 = r2 + 1
            if (r6 <= r7) goto L_0x0354
            int r6 = r6 - r2
            int r6 = r6 + -1
            goto L_0x0355
        L_0x0354:
            r6 = 0
        L_0x0355:
            int r7 = r11 + r2
            int r7 = r7 + r5
            r8 = 929(0x3a1, float:1.302E-42)
            if (r7 > r8) goto L_0x04c3
            int r2 = r2 + r6
            int r2 = r2 + r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            char r2 = (char) r2
            r0.append(r2)
            r0.append(r1)
            r1 = 0
        L_0x036b:
            if (r1 >= r6) goto L_0x0375
            r2 = 900(0x384, float:1.261E-42)
            r0.append(r2)
            int r1 = r1 + 1
            goto L_0x036b
        L_0x0375:
            java.lang.String r0 = r0.toString()
            if (r18 < 0) goto L_0x04bb
            r1 = 8
            r9 = r18
            if (r9 > r1) goto L_0x04bb
            char[] r1 = new char[r11]
            int r2 = r0.length()
            r5 = 0
        L_0x0388:
            if (r5 >= r2) goto L_0x03bd
            char r6 = r0.charAt(r5)
            int r7 = r11 + -1
            char r10 = r1[r7]
            int r6 = r6 + r10
            int r6 = r6 % r8
        L_0x0394:
            if (r7 <= 0) goto L_0x03ab
            int[][] r10 = p235s6.C7893w0.f17353b
            r10 = r10[r9]
            r10 = r10[r7]
            int r10 = r10 * r6
            int r10 = r10 % r8
            int r10 = 929 - r10
            int r12 = r7 + -1
            char r13 = r1[r12]
            int r13 = r13 + r10
            int r13 = r13 % r8
            char r10 = (char) r13
            r1[r7] = r10
            r7 = r12
            goto L_0x0394
        L_0x03ab:
            int[][] r7 = p235s6.C7893w0.f17353b
            r7 = r7[r9]
            r10 = 0
            r7 = r7[r10]
            int r6 = r6 * r7
            int r6 = r6 % r8
            int r6 = 929 - r6
            int r6 = r6 % r8
            char r6 = (char) r6
            r1[r10] = r6
            int r5 = r5 + 1
            goto L_0x0388
        L_0x03bd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
        L_0x03c2:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x03d5
            char r5 = r1[r11]
            if (r5 == 0) goto L_0x03cf
            int r5 = 929 - r5
            char r5 = (char) r5
            r1[r11] = r5
        L_0x03cf:
            char r5 = r1[r11]
            r2.append(r5)
            goto L_0x03c2
        L_0x03d5:
            java.lang.String r1 = r2.toString()
            bj.q r2 = new bj.q
            r2.<init>((int) r4, (int) r3)
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
            r1 = 0
            r5 = 0
        L_0x03e4:
            if (r5 >= r4) goto L_0x0478
            int r6 = r5 % 3
            int r7 = r2.f30982a
            int r7 = r7 + 1
            r2.f30982a = r7
            r7 = 130728(0x1fea8, float:1.83189E-40)
            t5.d1 r8 = r2.mo46898e()
            r10 = 17
            p235s6.C7823a0.m15094g(r7, r10, r8)
            if (r6 != 0) goto L_0x0408
            int r7 = r5 / 3
            int r7 = r7 * 30
            int r8 = r4 + -1
            int r8 = r8 / 3
            int r8 = r8 + r7
            int r11 = r3 + -1
            goto L_0x0419
        L_0x0408:
            r7 = 1
            if (r6 != r7) goto L_0x041b
            int r7 = r5 / 3
            int r7 = r7 * 30
            int r8 = r9 * 3
            int r8 = r8 + r7
            int r11 = r4 + -1
            int r12 = r11 % 3
            int r8 = r8 + r12
            int r11 = r11 / 3
        L_0x0419:
            int r11 = r11 + r7
            goto L_0x042a
        L_0x041b:
            int r7 = r5 / 3
            int r7 = r7 * 30
            int r8 = r3 + -1
            int r8 = r8 + r7
            int r11 = r9 * 3
            int r11 = r11 + r7
            int r7 = r4 + -1
            int r7 = r7 % 3
            int r11 = r11 + r7
        L_0x042a:
            int[][] r7 = p235s6.C7823a0.f17286c
            r7 = r7[r6]
            r7 = r7[r8]
            t5.d1 r8 = r2.mo46898e()
            p235s6.C7823a0.m15094g(r7, r10, r8)
            r7 = 0
        L_0x0438:
            if (r7 >= r3) goto L_0x0450
            int[][] r8 = p235s6.C7823a0.f17286c
            r8 = r8[r6]
            char r12 = r0.charAt(r1)
            r8 = r8[r12]
            t5.d1 r12 = r2.mo46898e()
            p235s6.C7823a0.m15094g(r8, r10, r12)
            int r1 = r1 + 1
            int r7 = r7 + 1
            goto L_0x0438
        L_0x0450:
            r7 = 260649(0x3fa29, float:3.65247E-40)
            if (r17 == 0) goto L_0x045e
            t5.d1 r6 = r2.mo46898e()
            r8 = 1
            p235s6.C7823a0.m15094g(r7, r8, r6)
            goto L_0x0474
        L_0x045e:
            int[][] r8 = p235s6.C7823a0.f17286c
            r6 = r8[r6]
            r6 = r6[r11]
            t5.d1 r8 = r2.mo46898e()
            p235s6.C7823a0.m15094g(r6, r10, r8)
            r6 = 18
            t5.d1 r8 = r2.mo46898e()
            p235s6.C7823a0.m15094g(r7, r6, r8)
        L_0x0474:
            int r5 = r5 + 1
            goto L_0x03e4
        L_0x0478:
            r0 = 4
            r1 = 1
            byte[][] r0 = r2.mo46899f(r1, r0)
            r1 = 0
            r3 = r0[r1]
            int r3 = r3.length
            int r4 = r0.length
            if (r3 >= r4) goto L_0x0487
            r3 = 1
            goto L_0x0488
        L_0x0487:
            r3 = r1
        L_0x0488:
            if (r3 == 0) goto L_0x0490
            byte[][] r0 = m31984b(r0)
            r3 = 1
            goto L_0x0491
        L_0x0490:
            r3 = r1
        L_0x0491:
            r1 = r0[r1]
            int r1 = r1.length
            r4 = 200(0xc8, float:2.8E-43)
            int r1 = r4 / r1
            int r5 = r0.length
            int r4 = r4 / r5
            if (r1 >= r4) goto L_0x049d
            goto L_0x049e
        L_0x049d:
            r1 = r4
        L_0x049e:
            r4 = 1
            if (r1 <= r4) goto L_0x04b4
            int r0 = r1 << 2
            byte[][] r0 = r2.mo46899f(r1, r0)
            if (r3 == 0) goto L_0x04ad
            byte[][] r0 = m31984b(r0)
        L_0x04ad:
            r8 = r16
            vn.b r0 = m31983a(r0, r8)
            goto L_0x04ba
        L_0x04b4:
            r8 = r16
            vn.b r0 = m31983a(r0, r8)
        L_0x04ba:
            return r0
        L_0x04bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r25
            r0.<init>(r1)
            throw r0
        L_0x04c3:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Encoded message contains too many code words, message too big ("
            r2.<init>(r3)
            int r0 = r23.length()
            r2.append(r0)
            java.lang.String r0 = " bytes)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x04e0:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Unable to fit message in columns"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04e8:
            r1 = r10
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r24)
            java.lang.String r2 = "Can only encode PDF_417, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p723yn.C18896a.mo4160f(java.lang.String, com.google.zxing.BarcodeFormat, java.util.EnumMap):vn.b");
    }
}
