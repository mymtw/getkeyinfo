package p510ao;

import p683tn.C18567f;

/* renamed from: ao.a */
public final class C14038a implements C18567f {
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x060e, code lost:
        if (r1 != false) goto L_0x0610;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x032a A[LOOP:11: B:180:0x0328->B:181:0x032a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0170 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0160 A[LOOP:2: B:84:0x0132->B:98:0x0160, LOOP_END] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p699vn.C18667b mo4160f(java.lang.String r27, com.google.zxing.BarcodeFormat r28, java.util.EnumMap r29) throws com.google.zxing.WriterException {
        /*
            r26 = this;
            r0 = r27
            r1 = r29
            boolean r2 = r27.isEmpty()
            if (r2 != 0) goto L_0x07ee
            com.google.zxing.BarcodeFormat r2 = com.google.zxing.BarcodeFormat.QR_CODE
            r3 = r28
            if (r3 != r2) goto L_0x07de
            com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r2 = com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.L
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r4 = r1.containsKey(r3)
            if (r4 == 0) goto L_0x0026
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = r2.toString()
            com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r2 = com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.valueOf(r2)
        L_0x0026:
            com.google.zxing.EncodeHintType r3 = com.google.zxing.EncodeHintType.MARGIN
            boolean r4 = r1.containsKey(r3)
            r5 = 4
            if (r4 == 0) goto L_0x003c
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
            goto L_0x003d
        L_0x003c:
            r3 = r5
        L_0x003d:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r6 = r1.containsKey(r4)
            r8 = 1
            if (r6 == 0) goto L_0x0048
            r6 = r8
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r6 == 0) goto L_0x0054
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = r4.toString()
            goto L_0x0056
        L_0x0054:
            java.lang.String r4 = "ISO-8859-1"
        L_0x0056:
            java.lang.String r9 = "Shift_JIS"
            boolean r10 = r9.equals(r4)
            r11 = 96
            r12 = -1
            if (r10 == 0) goto L_0x008e
            byte[] r10 = r0.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x0088 }
            int r13 = r10.length
            int r14 = r13 % 2
            if (r14 == 0) goto L_0x006b
            goto L_0x0088
        L_0x006b:
            r14 = 0
        L_0x006c:
            if (r14 >= r13) goto L_0x0086
            byte r15 = r10[r14]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r7 = 129(0x81, float:1.81E-43)
            if (r15 < r7) goto L_0x007a
            r7 = 159(0x9f, float:2.23E-43)
            if (r15 <= r7) goto L_0x0083
        L_0x007a:
            r7 = 224(0xe0, float:3.14E-43)
            if (r15 < r7) goto L_0x0088
            r7 = 235(0xeb, float:3.3E-43)
            if (r15 <= r7) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            int r14 = r14 + 2
            goto L_0x006c
        L_0x0086:
            r7 = r8
            goto L_0x0089
        L_0x0088:
            r7 = 0
        L_0x0089:
            if (r7 == 0) goto L_0x008e
            com.google.zxing.qrcode.decoder.Mode r7 = com.google.zxing.qrcode.decoder.Mode.KANJI
            goto L_0x00c2
        L_0x008e:
            r7 = 0
            r10 = 0
            r13 = 0
        L_0x0091:
            int r14 = r27.length()
            if (r7 >= r14) goto L_0x00b6
            char r14 = r0.charAt(r7)
            r15 = 48
            if (r14 < r15) goto L_0x00a5
            r15 = 57
            if (r14 > r15) goto L_0x00a5
            r13 = r8
            goto L_0x00b0
        L_0x00a5:
            int[] r10 = p030bo.C14139c.f31152a
            if (r14 >= r11) goto L_0x00ac
            r10 = r10[r14]
            goto L_0x00ad
        L_0x00ac:
            r10 = r12
        L_0x00ad:
            if (r10 == r12) goto L_0x00b3
            r10 = r8
        L_0x00b0:
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00b3:
            com.google.zxing.qrcode.decoder.Mode r7 = com.google.zxing.qrcode.decoder.Mode.BYTE
            goto L_0x00c2
        L_0x00b6:
            if (r10 == 0) goto L_0x00bb
            com.google.zxing.qrcode.decoder.Mode r7 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC
            goto L_0x00c2
        L_0x00bb:
            if (r13 == 0) goto L_0x00c0
            com.google.zxing.qrcode.decoder.Mode r7 = com.google.zxing.qrcode.decoder.Mode.NUMERIC
            goto L_0x00c2
        L_0x00c0:
            com.google.zxing.qrcode.decoder.Mode r7 = com.google.zxing.qrcode.decoder.Mode.BYTE
        L_0x00c2:
            vn.a r10 = new vn.a
            r10.<init>()
            com.google.zxing.qrcode.decoder.Mode r13 = com.google.zxing.qrcode.decoder.Mode.BYTE
            r14 = 8
            if (r7 != r13) goto L_0x00e5
            if (r6 == 0) goto L_0x00e5
            com.google.zxing.common.CharacterSetECI r6 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r4)
            if (r6 == 0) goto L_0x00e5
            com.google.zxing.qrcode.decoder.Mode r13 = com.google.zxing.qrcode.decoder.Mode.ECI
            int r13 = r13.getBits()
            r10.mo70167b(r13, r5)
            int r6 = r6.getValue()
            r10.mo70167b(r6, r14)
        L_0x00e5:
            com.google.zxing.EncodeHintType r6 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r13 = r1.containsKey(r6)
            if (r13 == 0) goto L_0x00ef
            r13 = r8
            goto L_0x00f0
        L_0x00ef:
            r13 = 0
        L_0x00f0:
            if (r13 == 0) goto L_0x010d
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x010d
            com.google.zxing.qrcode.decoder.Mode r6 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            int r6 = r6.getBits()
            r10.mo70167b(r6, r5)
        L_0x010d:
            int r6 = r7.getBits()
            r10.mo70167b(r6, r5)
            vn.a r6 = new vn.a
            r6.<init>()
            int[] r13 = p030bo.C14139c.C14140a.f31153a
            int r15 = r7.ordinal()
            r13 = r13[r15]
            r15 = 2
            r11 = 7
            if (r13 == r8) goto L_0x01f2
            if (r13 == r15) goto L_0x01a8
            r15 = 3
            if (r13 == r15) goto L_0x0190
            if (r13 != r5) goto L_0x0180
            byte[] r4 = r0.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x0178 }
            int r9 = r4.length
            r13 = 0
        L_0x0132:
            if (r13 >= r9) goto L_0x0234
            byte r15 = r4[r13]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r16 = r13 + 1
            byte r8 = r4[r16]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r14
            r8 = r8 | r15
            r15 = 33088(0x8140, float:4.6366E-41)
            if (r8 < r15) goto L_0x014e
            r15 = 40956(0x9ffc, float:5.7392E-41)
            if (r8 > r15) goto L_0x014e
            r15 = 33088(0x8140, float:4.6366E-41)
            goto L_0x015b
        L_0x014e:
            r15 = 57408(0xe040, float:8.0446E-41)
            if (r8 < r15) goto L_0x015d
            r15 = 60351(0xebbf, float:8.457E-41)
            if (r8 > r15) goto L_0x015d
            r15 = 49472(0xc140, float:6.9325E-41)
        L_0x015b:
            int r8 = r8 - r15
            goto L_0x015e
        L_0x015d:
            r8 = r12
        L_0x015e:
            if (r8 == r12) goto L_0x0170
            int r15 = r8 >> 8
            int r15 = r15 * 192
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r8
            r8 = 13
            r6.mo70167b(r15, r8)
            int r13 = r13 + 2
            r8 = 1
            goto L_0x0132
        L_0x0170:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Invalid byte sequence"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0178:
            r0 = move-exception
            r1 = r0
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0180:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r2 = "Invalid mode: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0190:
            byte[] r4 = r0.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x01a0 }
            int r8 = r4.length
            r9 = 0
        L_0x0196:
            if (r9 >= r8) goto L_0x0234
            byte r13 = r4[r9]
            r6.mo70167b(r13, r14)
            int r9 = r9 + 1
            goto L_0x0196
        L_0x01a0:
            r0 = move-exception
            r1 = r0
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x01a8:
            int r4 = r27.length()
            r8 = 0
        L_0x01ad:
            if (r8 >= r4) goto L_0x0234
            char r9 = r0.charAt(r8)
            int[] r13 = p030bo.C14139c.f31152a
            r15 = 96
            if (r9 >= r15) goto L_0x01bc
            r9 = r13[r9]
            goto L_0x01bd
        L_0x01bc:
            r9 = r12
        L_0x01bd:
            if (r9 == r12) goto L_0x01ec
            int r15 = r8 + 1
            if (r15 >= r4) goto L_0x01e2
            char r15 = r0.charAt(r15)
            r14 = 96
            if (r15 >= r14) goto L_0x01ce
            r13 = r13[r15]
            goto L_0x01cf
        L_0x01ce:
            r13 = r12
        L_0x01cf:
            if (r13 == r12) goto L_0x01dc
            int r9 = r9 * 45
            int r9 = r9 + r13
            r13 = 11
            r6.mo70167b(r9, r13)
            int r8 = r8 + 2
            goto L_0x01e9
        L_0x01dc:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        L_0x01e2:
            r14 = 96
            r8 = 6
            r6.mo70167b(r9, r8)
            r8 = r15
        L_0x01e9:
            r14 = 8
            goto L_0x01ad
        L_0x01ec:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        L_0x01f2:
            int r4 = r27.length()
            r8 = 0
        L_0x01f7:
            if (r8 >= r4) goto L_0x0234
            char r9 = r0.charAt(r8)
            int r9 = r9 + -48
            int r13 = r8 + 2
            if (r13 >= r4) goto L_0x021e
            int r14 = r8 + 1
            char r14 = r0.charAt(r14)
            int r14 = r14 + -48
            char r13 = r0.charAt(r13)
            int r13 = r13 + -48
            int r9 = r9 * 100
            r15 = 10
            int r14 = r14 * r15
            int r14 = r14 + r9
            int r14 = r14 + r13
            r6.mo70167b(r14, r15)
            int r8 = r8 + 3
            goto L_0x01f7
        L_0x021e:
            int r8 = r8 + 1
            if (r8 >= r4) goto L_0x0230
            char r8 = r0.charAt(r8)
            int r8 = r8 + -48
            int r9 = r9 * 10
            int r9 = r9 + r8
            r6.mo70167b(r9, r11)
            r8 = r13
            goto L_0x01f7
        L_0x0230:
            r6.mo70167b(r9, r5)
            goto L_0x01f7
        L_0x0234:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r8 = r1.containsKey(r4)
            if (r8 == 0) goto L_0x028d
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            com.google.zxing.qrcode.decoder.a r1 = com.google.zxing.qrcode.decoder.C16997a.m28518b(r1)
            int r4 = r10.f41277c
            int r8 = r7.getCharacterCountBits(r1)
            int r8 = r8 + r4
            int r4 = r6.f41277c
            int r8 = r8 + r4
            int r4 = r1.f37374c
            com.google.zxing.qrcode.decoder.a$b[] r9 = r1.f37373b
            int r13 = r2.ordinal()
            r9 = r9[r13]
            int r13 = r9.f37377a
            com.google.zxing.qrcode.decoder.a$a[] r9 = r9.f37378b
            int r14 = r9.length
            r15 = 0
            r16 = 0
        L_0x0268:
            if (r15 >= r14) goto L_0x0274
            r12 = r9[r15]
            int r12 = r12.f37375a
            int r16 = r16 + r12
            int r15 = r15 + 1
            r12 = -1
            goto L_0x0268
        L_0x0274:
            int r16 = r16 * r13
            int r4 = r4 - r16
            int r8 = r8 + r11
            r9 = 8
            int r8 = r8 / r9
            if (r4 < r8) goto L_0x0280
            r4 = 1
            goto L_0x0281
        L_0x0280:
            r4 = 0
        L_0x0281:
            if (r4 == 0) goto L_0x0285
            goto L_0x031a
        L_0x0285:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Data too big for requested version"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x028d:
            r1 = 1
            com.google.zxing.qrcode.decoder.a r4 = com.google.zxing.qrcode.decoder.C16997a.m28518b(r1)
            int r1 = r10.f41277c
            int r4 = r7.getCharacterCountBits(r4)
            int r4 = r4 + r1
            int r1 = r6.f41277c
            int r4 = r4 + r1
            r1 = 1
        L_0x029d:
            java.lang.String r8 = "Data too big"
            r9 = 40
            if (r1 > r9) goto L_0x07d8
            com.google.zxing.qrcode.decoder.a r12 = com.google.zxing.qrcode.decoder.C16997a.m28518b(r1)
            int r13 = r12.f37374c
            com.google.zxing.qrcode.decoder.a$b[] r14 = r12.f37373b
            int r15 = r2.ordinal()
            r14 = r14[r15]
            int r15 = r14.f37377a
            com.google.zxing.qrcode.decoder.a$a[] r14 = r14.f37378b
            int r5 = r14.length
            r9 = 0
            r19 = 0
        L_0x02b9:
            if (r9 >= r5) goto L_0x02c5
            r11 = r14[r9]
            int r11 = r11.f37375a
            int r19 = r19 + r11
            int r9 = r9 + 1
            r11 = 7
            goto L_0x02b9
        L_0x02c5:
            int r19 = r19 * r15
            int r13 = r13 - r19
            r5 = 7
            int r11 = r4 + 7
            r5 = 8
            int r11 = r11 / r5
            if (r13 < r11) goto L_0x02d3
            r5 = 1
            goto L_0x02d4
        L_0x02d3:
            r5 = 0
        L_0x02d4:
            if (r5 == 0) goto L_0x07c2
            int r1 = r10.f41277c
            int r4 = r7.getCharacterCountBits(r12)
            int r4 = r4 + r1
            int r1 = r6.f41277c
            int r4 = r4 + r1
            r1 = 1
        L_0x02e1:
            r5 = 40
            if (r1 > r5) goto L_0x07bc
            com.google.zxing.qrcode.decoder.a r9 = com.google.zxing.qrcode.decoder.C16997a.m28518b(r1)
            int r11 = r9.f37374c
            com.google.zxing.qrcode.decoder.a$b[] r12 = r9.f37373b
            int r13 = r2.ordinal()
            r12 = r12[r13]
            int r13 = r12.f37377a
            com.google.zxing.qrcode.decoder.a$a[] r12 = r12.f37378b
            int r14 = r12.length
            r15 = 0
            r19 = 0
        L_0x02fb:
            if (r15 >= r14) goto L_0x0308
            r5 = r12[r15]
            int r5 = r5.f37375a
            int r19 = r19 + r5
            int r15 = r15 + 1
            r5 = 40
            goto L_0x02fb
        L_0x0308:
            int r19 = r19 * r13
            int r11 = r11 - r19
            r5 = 7
            int r12 = r4 + 7
            r5 = 8
            int r12 = r12 / r5
            if (r11 < r12) goto L_0x0316
            r5 = 1
            goto L_0x0317
        L_0x0316:
            r5 = 0
        L_0x0317:
            if (r5 == 0) goto L_0x07aa
            r1 = r9
        L_0x031a:
            vn.a r4 = new vn.a
            r4.<init>()
            int r5 = r10.f41277c
            int r8 = r4.f41277c
            int r8 = r8 + r5
            r4.mo70168c(r8)
            r8 = 0
        L_0x0328:
            if (r8 >= r5) goto L_0x0334
            boolean r9 = r10.mo70170d(r8)
            r4.mo70166a(r9)
            int r8 = r8 + 1
            goto L_0x0328
        L_0x0334:
            com.google.zxing.qrcode.decoder.Mode r5 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r7 != r5) goto L_0x0340
            int r0 = r6.f41277c
            r5 = 7
            int r0 = r0 + r5
            r5 = 8
            int r0 = r0 / r5
            goto L_0x0344
        L_0x0340:
            int r0 = r27.length()
        L_0x0344:
            int r5 = r7.getCharacterCountBits(r1)
            r7 = 1
            int r8 = r7 << r5
            if (r0 >= r8) goto L_0x078e
            r4.mo70167b(r0, r5)
            int r0 = r6.f41277c
            int r5 = r4.f41277c
            int r5 = r5 + r0
            r4.mo70168c(r5)
            r5 = 0
        L_0x0359:
            if (r5 >= r0) goto L_0x0365
            boolean r7 = r6.mo70170d(r5)
            r4.mo70166a(r7)
            int r5 = r5 + 1
            goto L_0x0359
        L_0x0365:
            com.google.zxing.qrcode.decoder.a$b[] r0 = r1.f37373b
            int r5 = r2.ordinal()
            r0 = r0[r5]
            int r5 = r1.f37374c
            int r6 = r0.f37377a
            com.google.zxing.qrcode.decoder.a$a[] r7 = r0.f37378b
            int r8 = r7.length
            r9 = 0
            r10 = 0
        L_0x0376:
            if (r9 >= r8) goto L_0x0380
            r11 = r7[r9]
            int r11 = r11.f37375a
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x0376
        L_0x0380:
            int r10 = r10 * r6
            int r5 = r5 - r10
            int r6 = r5 << 3
            int r7 = r4.f41277c
            if (r7 > r6) goto L_0x0770
            r7 = 0
        L_0x0389:
            r8 = 4
            if (r7 >= r8) goto L_0x0397
            int r8 = r4.f41277c
            if (r8 >= r6) goto L_0x0397
            r8 = 0
            r4.mo70166a(r8)
            int r7 = r7 + 1
            goto L_0x0389
        L_0x0397:
            r8 = 0
            int r7 = r4.f41277c
            r9 = 7
            r7 = r7 & r9
            r9 = 8
            if (r7 <= 0) goto L_0x03a9
        L_0x03a0:
            if (r7 >= r9) goto L_0x03a9
            r4.mo70166a(r8)
            int r7 = r7 + 1
            r8 = 0
            goto L_0x03a0
        L_0x03a9:
            int r7 = r4.f41277c
            r8 = 7
            int r7 = r7 + r8
            int r7 = r7 / r9
            int r7 = r5 - r7
            r8 = 0
        L_0x03b1:
            if (r8 >= r7) goto L_0x03c4
            r10 = r8 & 1
            if (r10 != 0) goto L_0x03ba
            r9 = 236(0xec, float:3.31E-43)
            goto L_0x03bc
        L_0x03ba:
            r9 = 17
        L_0x03bc:
            r10 = 8
            r4.mo70167b(r9, r10)
            int r8 = r8 + 1
            goto L_0x03b1
        L_0x03c4:
            int r7 = r4.f41277c
            if (r7 != r6) goto L_0x0768
            int r6 = r1.f37374c
            com.google.zxing.qrcode.decoder.a$a[] r0 = r0.f37378b
            int r7 = r0.length
            r8 = 0
            r10 = 0
        L_0x03cf:
            if (r8 >= r7) goto L_0x03d9
            r11 = r0[r8]
            int r11 = r11.f37375a
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L_0x03cf
        L_0x03d9:
            int r0 = r4.f41277c
            r7 = 7
            int r0 = r0 + r7
            r7 = 8
            int r0 = r0 / r7
            if (r0 != r5) goto L_0x0760
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
        L_0x03eb:
            if (r7 >= r10) goto L_0x04d0
            r13 = 1
            int[] r14 = new int[r13]
            int[] r15 = new int[r13]
            if (r7 >= r10) goto L_0x04c8
            int r13 = r6 % r10
            int r9 = r10 - r13
            int r19 = r6 / r10
            int r20 = r19 + 1
            int r21 = r5 / r10
            int r22 = r21 + 1
            r23 = r3
            int r3 = r19 - r21
            r19 = r2
            int r2 = r20 - r22
            if (r3 != r2) goto L_0x04c0
            r20 = r1
            int r1 = r9 + r13
            if (r10 != r1) goto L_0x04b8
            int r1 = r21 + r3
            int r1 = r1 * r9
            int r24 = r22 + r2
            int r24 = r24 * r13
            int r1 = r24 + r1
            if (r6 != r1) goto L_0x04b0
            r1 = 0
            if (r7 >= r9) goto L_0x0423
            r14[r1] = r21
            r15[r1] = r3
            goto L_0x0427
        L_0x0423:
            r14[r1] = r22
            r15[r1] = r2
        L_0x0427:
            r2 = r14[r1]
            byte[] r1 = new byte[r2]
            int r3 = r8 << 3
            r9 = r3
            r3 = 0
        L_0x042f:
            if (r3 >= r2) goto L_0x045e
            r21 = r6
            r29 = r10
            r6 = 8
            r13 = 0
            r10 = r9
            r9 = 0
        L_0x043a:
            if (r9 >= r6) goto L_0x0451
            boolean r6 = r4.mo70170d(r10)
            if (r6 == 0) goto L_0x044a
            int r6 = 7 - r9
            r17 = 1
            int r6 = r17 << r6
            r6 = r6 | r13
            r13 = r6
        L_0x044a:
            int r10 = r10 + 1
            int r9 = r9 + 1
            r6 = 8
            goto L_0x043a
        L_0x0451:
            int r6 = r3 + 0
            byte r9 = (byte) r13
            r1[r6] = r9
            int r3 = r3 + 1
            r9 = r10
            r6 = r21
            r10 = r29
            goto L_0x042f
        L_0x045e:
            r21 = r6
            r29 = r10
            r3 = 0
            r6 = r15[r3]
            int r3 = r2 + r6
            int[] r3 = new int[r3]
            r9 = 0
        L_0x046a:
            if (r9 >= r2) goto L_0x0475
            byte r10 = r1[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r3[r9] = r10
            int r9 = r9 + 1
            goto L_0x046a
        L_0x0475:
            androidx.room.m r9 = new androidx.room.m
            wn.a r10 = p707wn.C18753a.f41528k
            r9.<init>(r10)
            r9.mo12040a(r6, r3)
            byte[] r9 = new byte[r6]
            r10 = 0
        L_0x0482:
            if (r10 >= r6) goto L_0x048e
            int r13 = r2 + r10
            r13 = r3[r13]
            byte r13 = (byte) r13
            r9[r10] = r13
            int r10 = r10 + 1
            goto L_0x0482
        L_0x048e:
            bo.a r3 = new bo.a
            r3.<init>(r1, r9)
            r0.add(r3)
            int r11 = java.lang.Math.max(r11, r2)
            int r12 = java.lang.Math.max(r12, r6)
            r1 = 0
            r2 = r14[r1]
            int r8 = r8 + r2
            int r7 = r7 + 1
            r10 = r29
            r2 = r19
            r1 = r20
            r6 = r21
            r3 = r23
            goto L_0x03eb
        L_0x04b0:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Total bytes mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04b8:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "RS blocks mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04c0:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "EC bytes mismatch"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04c8:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Block ID too large"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04d0:
            r20 = r1
            r19 = r2
            r23 = r3
            r21 = r6
            if (r5 != r8) goto L_0x0758
            vn.a r1 = new vn.a
            r1.<init>()
            r2 = 0
        L_0x04e0:
            if (r2 >= r11) goto L_0x0502
            java.util.Iterator r3 = r0.iterator()
        L_0x04e6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ff
            java.lang.Object r4 = r3.next()
            bo.a r4 = (p030bo.C14137a) r4
            byte[] r4 = r4.f31147a
            int r5 = r4.length
            if (r2 >= r5) goto L_0x04e6
            byte r4 = r4[r2]
            r5 = 8
            r1.mo70167b(r4, r5)
            goto L_0x04e6
        L_0x04ff:
            int r2 = r2 + 1
            goto L_0x04e0
        L_0x0502:
            r2 = 0
        L_0x0503:
            if (r2 >= r12) goto L_0x0527
            java.util.Iterator r3 = r0.iterator()
        L_0x0509:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0522
            java.lang.Object r4 = r3.next()
            bo.a r4 = (p030bo.C14137a) r4
            byte[] r4 = r4.f31148b
            int r5 = r4.length
            if (r2 >= r5) goto L_0x0509
            byte r4 = r4[r2]
            r5 = 8
            r1.mo70167b(r4, r5)
            goto L_0x0509
        L_0x0522:
            r5 = 8
            int r2 = r2 + 1
            goto L_0x0503
        L_0x0527:
            r5 = 8
            int r0 = r1.f41277c
            r2 = 7
            int r0 = r0 + r2
            int r0 = r0 / r5
            r2 = r21
            if (r2 != r0) goto L_0x072f
            r9 = r20
            int r0 = r9.f37372a
            r2 = 4
            int r0 = r0 * r2
            r2 = 17
            int r0 = r0 + r2
            bo.b r2 = new bo.b
            r2.<init>(r0, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = -1
            r8 = 0
        L_0x0545:
            if (r8 >= r5) goto L_0x06e3
            r5 = r19
            p030bo.C14141d.m21891a(r1, r5, r9, r8, r2)
            r4 = 1
            int r6 = p001a0.C0005b.m16J(r2, r4)
            r4 = 0
            int r7 = p001a0.C0005b.m16J(r2, r4)
            int r7 = r7 + r6
            byte[][] r4 = r2.f31149a
            int r6 = r2.f31150b
            int r10 = r2.f31151c
            r11 = 0
            r12 = 0
        L_0x055f:
            r13 = -1
            int r14 = r10 + -1
            if (r11 >= r14) goto L_0x058e
            r14 = r4[r11]
            r16 = r10
            r15 = r12
            r12 = 0
        L_0x056a:
            int r10 = r6 + -1
            if (r12 >= r10) goto L_0x0588
            byte r10 = r14[r12]
            int r18 = r12 + 1
            byte r13 = r14[r18]
            if (r10 != r13) goto L_0x0584
            int r13 = r11 + 1
            r13 = r4[r13]
            byte r12 = r13[r12]
            if (r10 != r12) goto L_0x0584
            byte r12 = r13[r18]
            if (r10 != r12) goto L_0x0584
            int r15 = r15 + 1
        L_0x0584:
            r12 = r18
            r13 = -1
            goto L_0x056a
        L_0x0588:
            int r11 = r11 + 1
            r12 = r15
            r10 = r16
            goto L_0x055f
        L_0x058e:
            int r12 = r12 * 3
            int r12 = r12 + r7
            byte[][] r4 = r2.f31149a
            int r6 = r2.f31150b
            int r7 = r2.f31151c
            r10 = 0
            r11 = 0
        L_0x0599:
            if (r10 >= r7) goto L_0x06a0
            r13 = r11
            r11 = 0
        L_0x059d:
            if (r11 >= r6) goto L_0x0697
            r14 = r4[r10]
            int r15 = r11 + 6
            if (r15 >= r6) goto L_0x0613
            r16 = r6
            byte r6 = r14[r11]
            r27 = r1
            r1 = 1
            if (r6 != r1) goto L_0x0617
            int r6 = r11 + 1
            byte r6 = r14[r6]
            if (r6 != 0) goto L_0x0617
            int r6 = r11 + 2
            byte r6 = r14[r6]
            if (r6 != r1) goto L_0x0617
            int r6 = r11 + 3
            byte r6 = r14[r6]
            if (r6 != r1) goto L_0x0617
            int r6 = r11 + 4
            byte r6 = r14[r6]
            if (r6 != r1) goto L_0x0617
            int r6 = r11 + 5
            byte r6 = r14[r6]
            if (r6 != 0) goto L_0x0617
            byte r6 = r14[r15]
            if (r6 != r1) goto L_0x0617
            int r6 = r11 + -4
            r15 = 0
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.length
            int r15 = java.lang.Math.min(r11, r15)
        L_0x05dc:
            if (r6 >= r15) goto L_0x05ec
            r29 = r15
            byte r15 = r14[r6]
            if (r15 != r1) goto L_0x05e6
            r1 = 0
            goto L_0x05ed
        L_0x05e6:
            int r6 = r6 + 1
            r15 = r29
            r1 = 1
            goto L_0x05dc
        L_0x05ec:
            r1 = 1
        L_0x05ed:
            if (r1 != 0) goto L_0x0610
            int r1 = r11 + 7
            int r6 = r11 + 11
            r15 = 0
            int r1 = java.lang.Math.max(r1, r15)
            int r15 = r14.length
            int r6 = java.lang.Math.min(r6, r15)
        L_0x05fd:
            if (r1 >= r6) goto L_0x060d
            byte r15 = r14[r1]
            r29 = r6
            r6 = 1
            if (r15 != r6) goto L_0x0608
            r1 = 0
            goto L_0x060e
        L_0x0608:
            int r1 = r1 + 1
            r6 = r29
            goto L_0x05fd
        L_0x060d:
            r1 = 1
        L_0x060e:
            if (r1 == 0) goto L_0x0617
        L_0x0610:
            int r13 = r13 + 1
            goto L_0x0617
        L_0x0613:
            r27 = r1
            r16 = r6
        L_0x0617:
            int r1 = r10 + 6
            if (r1 >= r7) goto L_0x068f
            r6 = r4[r10]
            byte r6 = r6[r11]
            r14 = 1
            if (r6 != r14) goto L_0x068f
            int r6 = r10 + 1
            r6 = r4[r6]
            byte r6 = r6[r11]
            if (r6 != 0) goto L_0x068f
            int r6 = r10 + 2
            r6 = r4[r6]
            byte r6 = r6[r11]
            if (r6 != r14) goto L_0x068f
            int r6 = r10 + 3
            r6 = r4[r6]
            byte r6 = r6[r11]
            if (r6 != r14) goto L_0x068f
            int r6 = r10 + 4
            r6 = r4[r6]
            byte r6 = r6[r11]
            if (r6 != r14) goto L_0x068f
            int r6 = r10 + 5
            r6 = r4[r6]
            byte r6 = r6[r11]
            if (r6 != 0) goto L_0x068f
            r1 = r4[r1]
            byte r1 = r1[r11]
            if (r1 != r14) goto L_0x068f
            int r1 = r10 + -4
            r6 = 0
            int r1 = java.lang.Math.max(r1, r6)
            int r6 = r4.length
            int r6 = java.lang.Math.min(r10, r6)
        L_0x065c:
            if (r1 >= r6) goto L_0x066a
            r15 = r4[r1]
            byte r15 = r15[r11]
            if (r15 != r14) goto L_0x0666
            r1 = 0
            goto L_0x066b
        L_0x0666:
            int r1 = r1 + 1
            r14 = 1
            goto L_0x065c
        L_0x066a:
            r1 = 1
        L_0x066b:
            if (r1 != 0) goto L_0x068d
            int r1 = r10 + 7
            int r6 = r10 + 11
            r14 = 0
            int r1 = java.lang.Math.max(r1, r14)
            int r15 = r4.length
            int r6 = java.lang.Math.min(r6, r15)
        L_0x067b:
            if (r1 >= r6) goto L_0x068a
            r15 = r4[r1]
            byte r15 = r15[r11]
            r14 = 1
            if (r15 != r14) goto L_0x0686
            r1 = 0
            goto L_0x068b
        L_0x0686:
            int r1 = r1 + 1
            r14 = 0
            goto L_0x067b
        L_0x068a:
            r1 = 1
        L_0x068b:
            if (r1 == 0) goto L_0x068f
        L_0x068d:
            int r13 = r13 + 1
        L_0x068f:
            int r11 = r11 + 1
            r1 = r27
            r6 = r16
            goto L_0x059d
        L_0x0697:
            r27 = r1
            r16 = r6
            int r10 = r10 + 1
            r11 = r13
            goto L_0x0599
        L_0x06a0:
            r27 = r1
            int r11 = r11 * 40
            int r11 = r11 + r12
            byte[][] r1 = r2.f31149a
            int r4 = r2.f31150b
            int r6 = r2.f31151c
            r7 = 0
            r10 = 0
        L_0x06ad:
            if (r7 >= r6) goto L_0x06c3
            r12 = r1[r7]
            r13 = r10
            r10 = 0
        L_0x06b3:
            if (r10 >= r4) goto L_0x06bf
            byte r14 = r12[r10]
            r15 = 1
            if (r14 != r15) goto L_0x06bc
            int r13 = r13 + 1
        L_0x06bc:
            int r10 = r10 + 1
            goto L_0x06b3
        L_0x06bf:
            int r7 = r7 + 1
            r10 = r13
            goto L_0x06ad
        L_0x06c3:
            int r1 = r2.f31151c
            int r4 = r2.f31150b
            int r1 = r1 * r4
            int r4 = r10 << 1
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            r12 = 10
            int r4 = r4 * r12
            int r4 = r4 / r1
            int r4 = r4 * r12
            int r4 = r4 + r11
            if (r4 >= r0) goto L_0x06d9
            r0 = r4
            r3 = r8
        L_0x06d9:
            int r8 = r8 + 1
            r1 = r27
            r19 = r5
            r5 = 8
            goto L_0x0545
        L_0x06e3:
            r0 = r1
            r5 = r19
            p030bo.C14141d.m21891a(r0, r5, r9, r3, r2)
            int r0 = r2.f31150b
            int r1 = r2.f31151c
            r3 = 1
            int r4 = r23 << 1
            int r3 = r0 + r4
            int r4 = r4 + r1
            r5 = 200(0xc8, float:2.8E-43)
            int r6 = java.lang.Math.max(r5, r3)
            int r5 = java.lang.Math.max(r5, r4)
            int r3 = r6 / r3
            int r4 = r5 / r4
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r0 * r3
            int r4 = r6 - r4
            r9 = 2
            int r4 = r4 / r9
            int r7 = r1 * r3
            int r7 = r5 - r7
            int r7 = r7 / r9
            vn.b r8 = new vn.b
            r8.<init>(r6, r5)
            r5 = 0
        L_0x0716:
            if (r5 >= r1) goto L_0x072e
            r9 = r4
            r6 = 0
        L_0x071a:
            if (r6 >= r0) goto L_0x072a
            byte r10 = r2.mo47034a(r6, r5)
            r11 = 1
            if (r10 != r11) goto L_0x0726
            r8.mo70176c(r9, r7, r3, r3)
        L_0x0726:
            int r6 = r6 + 1
            int r9 = r9 + r3
            goto L_0x071a
        L_0x072a:
            int r5 = r5 + 1
            int r7 = r7 + r3
            goto L_0x0716
        L_0x072e:
            return r8
        L_0x072f:
            r0 = r1
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Interleaving error: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " and "
            r3.append(r2)
            int r0 = r0.f41277c
            r11 = 7
            int r0 = r0 + r11
            r13 = 8
            int r0 = r0 / r13
            r3.append(r0)
            java.lang.String r0 = " differ."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0758:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Data bytes does not match offset"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0760:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Number of bits and data bytes does not match"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0768:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Bits size does not equal capacity"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0770:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "data bits cannot fit in the QR Code"
            r1.<init>(r2)
            int r2 = r4.f41277c
            r1.append(r2)
            java.lang.String r2 = " > "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x078e:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is bigger than "
            r2.append(r0)
            r3 = 1
            int r8 = r8 - r3
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x07aa:
            r5 = r2
            r23 = r3
            r2 = 4
            r3 = 1
            r9 = 2
            r11 = 7
            r12 = 10
            r13 = 8
            int r1 = r1 + 1
            r2 = r5
            r3 = r23
            goto L_0x02e1
        L_0x07bc:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.lang.String) r8)
            throw r0
        L_0x07c2:
            r5 = r2
            r23 = r3
            r2 = 4
            r3 = 1
            r9 = 2
            r11 = 7
            r12 = 10
            r13 = 8
            int r1 = r1 + 1
            r3 = r23
            r25 = r5
            r5 = r2
            r2 = r25
            goto L_0x029d
        L_0x07d8:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>((java.lang.String) r8)
            throw r0
        L_0x07de:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r28)
            java.lang.String r2 = "Can only encode QR_CODE, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x07ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p510ao.C14038a.mo4160f(java.lang.String, com.google.zxing.BarcodeFormat, java.util.EnumMap):vn.b");
    }
}
