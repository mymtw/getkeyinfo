package p196o3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;

/* renamed from: o3.s */
public final class C7540s {

    /* renamed from: a */
    public static final JsonReader.C4854a f16799a = JsonReader.C4854a.m10470a("nm", "ind", "refId", "ty", ResponseConstants.PARENT, "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", Constants.APPBOY_PUSH_TITLE_KEY, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    public static final JsonReader.C4854a f16800b = JsonReader.C4854a.m10470a("d", Constants.APPBOY_PUSH_CONTENT_KEY);

    /* renamed from: c */
    public static final JsonReader.C4854a f16801c = JsonReader.C4854a.m10470a("nm");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.airbnb.lottie.model.content.Mask$MaskMode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: k3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: k3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: k3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: k3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: k3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: k3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: k3.g} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007e, code lost:
        r39 = r6;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0393, code lost:
        r11 = r0;
        r2 = r6;
        r6 = r39;
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03a8, code lost:
        r2 = r6;
        r6 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03ab, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03eb, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03ed, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03ee, code lost:
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b5, code lost:
        r39 = r6;
        r40 = r14;
        r6 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.layer.Layer m14522a(com.airbnb.lottie.parser.moshi.C4863a r42, com.airbnb.lottie.C4828c r43) throws java.io.IOException {
        /*
            r0 = r42
            r7 = r43
            com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.NONE
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r42.mo14626b()
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r3 = 0
            java.lang.String r5 = "UNSET"
            r13 = 0
            r15 = -1
            r30 = r1
            r24 = r2
            r21 = r3
            r22 = r21
            r23 = r22
            r26 = r23
            r27 = r26
            r32 = r27
            r1 = r11
            r25 = r1
            r17 = r15
            r6 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r14 = r13
            r13 = r5
            r5 = r25
            r11 = r0
        L_0x004c:
            boolean r34 = r42.mo14629f()
            if (r34 == 0) goto L_0x03f1
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = f16799a
            int r4 = r11.mo14637r(r4)
            r2 = 1
            switch(r4) {
                case 0: goto L_0x03e1;
                case 1: goto L_0x03d7;
                case 2: goto L_0x03cc;
                case 3: goto L_0x03ae;
                case 4: goto L_0x039a;
                case 5: goto L_0x0380;
                case 6: goto L_0x036c;
                case 7: goto L_0x035c;
                case 8: goto L_0x0350;
                case 9: goto L_0x0336;
                case 10: goto L_0x023c;
                case 11: goto L_0x021d;
                case 12: goto L_0x010f;
                case 13: goto L_0x00be;
                case 14: goto L_0x00ae;
                case 15: goto L_0x00a6;
                case 16: goto L_0x0098;
                case 17: goto L_0x008a;
                case 18: goto L_0x0084;
                case 19: goto L_0x0079;
                case 20: goto L_0x0074;
                case 21: goto L_0x006f;
                case 22: goto L_0x006a;
                default: goto L_0x005c;
            }
        L_0x005c:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            r42.mo14638t()
            r42.mo14639u()
            goto L_0x03ed
        L_0x006a:
            boolean r32 = r42.mo14630g()
            goto L_0x007e
        L_0x006f:
            java.lang.String r6 = r42.mo14634j()
            goto L_0x007e
        L_0x0074:
            k3.b r31 = p196o3.C7519d.m14505a(r11, r7, r3)
            goto L_0x007e
        L_0x0079:
            double r4 = r42.mo14632h()
            float r5 = (float) r4
        L_0x007e:
            r39 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03a8
        L_0x0084:
            double r1 = r42.mo14632h()
            float r1 = (float) r1
            goto L_0x00b5
        L_0x008a:
            int r2 = r42.mo14633i()
            float r2 = (float) r2
            float r4 = p206p3.C7659e.m14702c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r27 = r2
            goto L_0x00b5
        L_0x0098:
            int r2 = r42.mo14633i()
            float r2 = (float) r2
            float r4 = p206p3.C7659e.m14702c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r26 = r2
            goto L_0x00b5
        L_0x00a6:
            double r3 = r42.mo14632h()
            float r2 = (float) r3
            r25 = r2
            goto L_0x00b5
        L_0x00ae:
            double r2 = r42.mo14632h()
            float r2 = (float) r2
            r24 = r2
        L_0x00b5:
            r39 = r6
            r40 = r14
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ee
        L_0x00be:
            r42.mo14625a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x00c6:
            boolean r3 = r42.mo14629f()
            if (r3 == 0) goto L_0x00f0
            r42.mo14626b()
        L_0x00cf:
            boolean r3 = r42.mo14629f()
            if (r3 == 0) goto L_0x00ec
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = f16801c
            int r3 = r11.mo14637r(r3)
            if (r3 == 0) goto L_0x00e4
            r42.mo14638t()
            r42.mo14639u()
            goto L_0x00cf
        L_0x00e4:
            java.lang.String r3 = r42.mo14634j()
            r2.add(r3)
            goto L_0x00cf
        L_0x00ec:
            r42.mo14628e()
            goto L_0x00c6
        L_0x00f0:
            r42.mo14627d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r7.mo14581a(r2)
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ed
        L_0x010f:
            r42.mo14626b()
        L_0x0112:
            boolean r3 = r42.mo14629f()
            if (r3 == 0) goto L_0x0211
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = f16800b
            int r3 = r11.mo14637r(r3)
            if (r3 == 0) goto L_0x01f6
            if (r3 == r2) goto L_0x0129
            r42.mo14638t()
            r42.mo14639u()
            goto L_0x0112
        L_0x0129:
            r42.mo14625a()
            boolean r3 = r42.mo14629f()
            if (r3 == 0) goto L_0x01e1
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7515b.f16765a
            r42.mo14626b()
            r3 = 0
        L_0x0138:
            boolean r4 = r42.mo14629f()
            if (r4 == 0) goto L_0x01cb
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7515b.f16765a
            int r4 = r11.mo14637r(r4)
            if (r4 == 0) goto L_0x014d
            r42.mo14638t()
            r42.mo14639u()
            goto L_0x0138
        L_0x014d:
            r42.mo14626b()
            r3 = 0
            r4 = 0
            r37 = 0
            r38 = 0
        L_0x0156:
            boolean r29 = r42.mo14629f()
            if (r29 == 0) goto L_0x01b3
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p196o3.C7515b.f16766b
            int r2 = r11.mo14637r(r2)
            if (r2 == 0) goto L_0x019a
            r39 = r6
            r6 = 1
            if (r2 == r6) goto L_0x0187
            r6 = 2
            if (r2 == r6) goto L_0x017e
            r6 = 3
            if (r2 == r6) goto L_0x0178
            r42.mo14638t()
            r42.mo14639u()
            r40 = r14
            goto L_0x01ad
        L_0x0178:
            r2 = 1
            k3.b r4 = p196o3.C7519d.m14505a(r11, r7, r2)
            goto L_0x0184
        L_0x017e:
            r2 = 1
            r6 = 3
            k3.b r3 = p196o3.C7519d.m14505a(r11, r7, r2)
        L_0x0184:
            r6 = r39
            goto L_0x01b1
        L_0x0187:
            r6 = 3
            k3.a r2 = new k3.a
            o3.f r6 = p196o3.C7523f.f16775a
            r40 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r6 = p196o3.C7539r.m14520a(r14, r7, r6, r0)
            r2.<init>(r6)
            r38 = r2
            goto L_0x01ad
        L_0x019a:
            r39 = r6
            r40 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            k3.a r2 = new k3.a
            o3.f r6 = p196o3.C7523f.f16775a
            java.util.ArrayList r6 = p196o3.C7539r.m14520a(r14, r7, r6, r0)
            r2.<init>(r6)
            r37 = r2
        L_0x01ad:
            r6 = r39
            r14 = r40
        L_0x01b1:
            r2 = 1
            goto L_0x0156
        L_0x01b3:
            r39 = r6
            r40 = r14
            r42.mo14628e()
            k3.j r2 = new k3.j
            r6 = r37
            r14 = r38
            r2.<init>(r6, r14, r3, r4)
            r3 = r2
            r6 = r39
            r14 = r40
            r2 = 1
            goto L_0x0138
        L_0x01cb:
            r39 = r6
            r40 = r14
            r42.mo14628e()
            if (r3 != 0) goto L_0x01dd
            k3.j r2 = new k3.j
            r4 = 0
            r2.<init>(r4, r4, r4, r4)
            r29 = r2
            goto L_0x01e6
        L_0x01dd:
            r4 = 0
            r29 = r3
            goto L_0x01e6
        L_0x01e1:
            r39 = r6
            r40 = r14
            r4 = 0
        L_0x01e6:
            boolean r2 = r42.mo14629f()
            if (r2 == 0) goto L_0x01f0
            r42.mo14639u()
            goto L_0x01e6
        L_0x01f0:
            r42.mo14627d()
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x020a
        L_0x01f6:
            r39 = r6
            r40 = r14
            r4 = 0
            k3.i r2 = new k3.i
            o3.h r3 = p196o3.C7527h.f16780a
            r6 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r3 = p196o3.C7539r.m14520a(r6, r7, r3, r11)
            r2.<init>(r3)
            r28 = r2
        L_0x020a:
            r6 = r39
            r14 = r40
            r2 = 1
            goto L_0x0112
        L_0x0211:
            r39 = r6
            r40 = r14
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r42.mo14628e()
            goto L_0x03ee
        L_0x021d:
            r39 = r6
            r40 = r14
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r42.mo14625a()
        L_0x0227:
            boolean r2 = r42.mo14629f()
            if (r2 == 0) goto L_0x0237
            l3.b r2 = p196o3.C7525g.m14509a(r42, r43)
            if (r2 == 0) goto L_0x0227
            r8.add(r2)
            goto L_0x0227
        L_0x0237:
            r42.mo14627d()
            goto L_0x03ed
        L_0x023c:
            r39 = r6
            r40 = r14
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r42.mo14625a()
        L_0x0246:
            boolean r2 = r42.mo14629f()
            if (r2 == 0) goto L_0x0328
            r42.mo14626b()
            r2 = r4
            r3 = r2
            r11 = r3
            r14 = 0
        L_0x0253:
            boolean r15 = r42.mo14629f()
            if (r15 == 0) goto L_0x031a
            java.lang.String r15 = r42.mo14685R()
            r15.getClass()
            int r34 = r15.hashCode()
            r35 = -1
            switch(r34) {
                case 111: goto L_0x028d;
                case 3588: goto L_0x0282;
                case 104433: goto L_0x0277;
                case 3357091: goto L_0x026c;
                default: goto L_0x0269;
            }
        L_0x0269:
            r4 = r35
            goto L_0x0297
        L_0x026c:
            java.lang.String r4 = "mode"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0275
            goto L_0x0269
        L_0x0275:
            r4 = 3
            goto L_0x0297
        L_0x0277:
            java.lang.String r4 = "inv"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0280
            goto L_0x0269
        L_0x0280:
            r4 = 2
            goto L_0x0297
        L_0x0282:
            java.lang.String r4 = "pt"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x028b
            goto L_0x0269
        L_0x028b:
            r4 = 1
            goto L_0x0297
        L_0x028d:
            java.lang.String r4 = "o"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L_0x0296
            goto L_0x0269
        L_0x0296:
            r4 = 0
        L_0x0297:
            switch(r4) {
                case 0: goto L_0x0313;
                case 1: goto L_0x0303;
                case 2: goto L_0x02fe;
                case 3: goto L_0x029f;
                default: goto L_0x029a;
            }
        L_0x029a:
            r42.mo14639u()
            goto L_0x0317
        L_0x029f:
            java.lang.String r2 = r42.mo14634j()
            r2.getClass()
            int r4 = r2.hashCode()
            switch(r4) {
                case 97: goto L_0x02c6;
                case 105: goto L_0x02ba;
                case 115: goto L_0x02ae;
                default: goto L_0x02ad;
            }
        L_0x02ad:
            goto L_0x02d1
        L_0x02ae:
            java.lang.String r4 = "s"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02b7
            goto L_0x02d1
        L_0x02b7:
            r35 = 2
            goto L_0x02d1
        L_0x02ba:
            java.lang.String r4 = "i"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02c3
            goto L_0x02d1
        L_0x02c3:
            r35 = 1
            goto L_0x02d1
        L_0x02c6:
            java.lang.String r4 = "a"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02cf
            goto L_0x02d1
        L_0x02cf:
            r35 = 0
        L_0x02d1:
            switch(r35) {
                case 0: goto L_0x02fb;
                case 1: goto L_0x02f3;
                case 2: goto L_0x02f0;
                default: goto L_0x02d4;
            }
        L_0x02d4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown mask mode "
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = ". Defaulting to Add."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            p206p3.C7656b.m14695b(r2)
            com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0317
        L_0x02f0:
            com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT
            goto L_0x0317
        L_0x02f3:
            java.lang.String r2 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r7.mo14581a(r2)
            com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT
            goto L_0x0317
        L_0x02fb:
            com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0317
        L_0x02fe:
            boolean r14 = r42.mo14630g()
            goto L_0x0317
        L_0x0303:
            k3.g r3 = new k3.g
            float r4 = p206p3.C7659e.m14702c()
            o3.b0 r15 = p196o3.C7516b0.f16767a
            java.util.ArrayList r4 = p196o3.C7539r.m14520a(r4, r7, r15, r0)
            r3.<init>(r4)
            goto L_0x0317
        L_0x0313:
            k3.d r11 = p196o3.C7519d.m14506b(r42, r43)
        L_0x0317:
            r4 = 0
            goto L_0x0253
        L_0x031a:
            r42.mo14628e()
            com.airbnb.lottie.model.content.Mask r4 = new com.airbnb.lottie.model.content.Mask
            r4.<init>(r2, r3, r11, r14)
            r10.add(r4)
            r4 = 0
            goto L_0x0246
        L_0x0328:
            int r2 = r10.size()
            int r3 = r7.f10855o
            int r3 = r3 + r2
            r7.f10855o = r3
            r42.mo14627d()
            goto L_0x03ed
        L_0x0336:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            com.airbnb.lottie.model.layer.Layer$MatteType[] r2 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
            int r3 = r42.mo14633i()
            r30 = r2[r3]
            int r2 = r7.f10855o
            r3 = 1
            int r2 = r2 + r3
            r7.f10855o = r2
            r14 = r40
            goto L_0x03eb
        L_0x0350:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            k3.k r20 = p196o3.C7517c.m14504a(r42, r43)
            goto L_0x03eb
        L_0x035c:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = r42.mo14634j()
            int r23 = android.graphics.Color.parseColor(r2)
            goto L_0x03eb
        L_0x036c:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = r42.mo14633i()
            float r2 = (float) r2
            float r3 = p206p3.C7659e.m14702c()
            float r3 = r3 * r2
            int r2 = (int) r3
            r22 = r2
            goto L_0x0393
        L_0x0380:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = r42.mo14633i()
            float r2 = (float) r2
            float r3 = p206p3.C7659e.m14702c()
            float r3 = r3 * r2
            int r2 = (int) r3
            r21 = r2
        L_0x0393:
            r11 = r0
            r2 = r6
            r6 = r39
            r14 = r40
            goto L_0x03ab
        L_0x039a:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = r42.mo14633i()
            long r2 = (long) r2
            r11 = r0
            r17 = r2
        L_0x03a8:
            r2 = r6
            r6 = r39
        L_0x03ab:
            r3 = 0
            goto L_0x004c
        L_0x03ae:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = r42.mo14633i()
            com.airbnb.lottie.model.layer.Layer$LayerType r3 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN
            int r4 = r3.ordinal()
            if (r2 >= r4) goto L_0x03c9
            com.airbnb.lottie.model.layer.Layer$LayerType[] r3 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
            r2 = r3[r2]
            r16 = r2
            goto L_0x03ed
        L_0x03c9:
            r16 = r3
            goto L_0x03ed
        L_0x03cc:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r19 = r42.mo14634j()
            goto L_0x03eb
        L_0x03d7:
            r39 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = r42.mo14633i()
            long r14 = (long) r2
            goto L_0x03eb
        L_0x03e1:
            r39 = r6
            r40 = r14
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r13 = r42.mo14634j()
        L_0x03eb:
            r11 = r0
            goto L_0x03a8
        L_0x03ed:
            r11 = r0
        L_0x03ee:
            r14 = r40
            goto L_0x03a8
        L_0x03f1:
            r39 = r6
            r40 = r14
            r42.mo14628e()
            float r11 = r1 / r24
            float r14 = r5 / r24
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0423
            q3.a r6 = new q3.a
            r4 = 0
            r5 = 0
            java.lang.Float r34 = java.lang.Float.valueOf(r11)
            r0 = r6
            r1 = r43
            r2 = r12
            r3 = r12
            r36 = r8
            r35 = r10
            r10 = r39
            r8 = r6
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r8)
            goto L_0x0429
        L_0x0423:
            r36 = r8
            r35 = r10
            r10 = r39
        L_0x0429:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x042f
            goto L_0x0432
        L_0x042f:
            float r0 = r7.f10852l
            r14 = r0
        L_0x0432:
            q3.a r8 = new q3.a
            r33 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r14)
            r4 = 0
            r0 = r8
            r1 = r43
            r2 = r9
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r8)
            q3.a r8 = new q3.a
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r8
            r2 = r12
            r3 = r12
            r4 = r33
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r8)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x046c
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0471
        L_0x046c:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.mo14581a(r0)
        L_0x0471:
            com.airbnb.lottie.model.layer.Layer r33 = new com.airbnb.lottie.model.layer.Layer
            r0 = r33
            r1 = r36
            r2 = r43
            r3 = r13
            r4 = r40
            r6 = r16
            r7 = r17
            r9 = r19
            r10 = r35
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r21 = r15
            r15 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: p196o3.C7540s.m14522a(com.airbnb.lottie.parser.moshi.a, com.airbnb.lottie.c):com.airbnb.lottie.model.layer.Layer");
    }
}
