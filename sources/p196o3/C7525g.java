package p196o3;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: o3.g */
public final class C7525g {

    /* renamed from: a */
    public static JsonReader.C4854a f16778a = JsonReader.C4854a.m10470a("ty", "d");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v2, types: [l3.b] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r16v6, types: [l3.a] */
    /* JADX WARNING: type inference failed for: r16v7, types: [l3.h] */
    /* JADX WARNING: type inference failed for: r17v27, types: [l3.d] */
    /* JADX WARNING: type inference failed for: r17v28, types: [com.airbnb.lottie.model.content.a] */
    /* JADX WARNING: type inference failed for: r16v8, types: [l3.e] */
    /* JADX WARNING: type inference failed for: r16v9, types: [l3.f] */
    /* JADX WARNING: type inference failed for: r16v10, types: [com.airbnb.lottie.model.content.PolystarShape] */
    /* JADX WARNING: type inference failed for: r17v29, types: [com.airbnb.lottie.model.content.ShapeStroke] */
    /* JADX WARNING: type inference failed for: r16v11, types: [com.airbnb.lottie.model.content.ShapeTrimPath] */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p167l3.C7236b m14509a(com.airbnb.lottie.parser.moshi.C4863a r31, com.airbnb.lottie.C4828c r32) throws java.io.IOException {
        /*
            r0 = r31
            r1 = r32
            r31.mo14626b()
            r2 = 2
            r3 = r2
        L_0x0009:
            boolean r4 = r31.mo14629f()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x002c
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = f16778a
            int r4 = r0.mo14637r(r4)
            if (r4 == 0) goto L_0x0027
            if (r4 == r6) goto L_0x0022
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x0009
        L_0x0022:
            int r3 = r31.mo14633i()
            goto L_0x0009
        L_0x0027:
            java.lang.String r4 = r31.mo14634j()
            goto L_0x002d
        L_0x002c:
            r4 = r5
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            return r5
        L_0x0030:
            int r7 = r4.hashCode()
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 0
            switch(r7) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c7;
                case 3295: goto L_0x00bc;
                case 3307: goto L_0x00b1;
                case 3308: goto L_0x00a6;
                case 3488: goto L_0x009b;
                case 3633: goto L_0x0090;
                case 3646: goto L_0x0083;
                case 3669: goto L_0x0075;
                case 3679: goto L_0x0067;
                case 3681: goto L_0x0059;
                case 3705: goto L_0x004b;
                case 3710: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x00dd
        L_0x003d:
            java.lang.String r7 = "tr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0047
            goto L_0x00dd
        L_0x0047:
            r7 = 12
            goto L_0x00de
        L_0x004b:
            java.lang.String r7 = "tm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0055
            goto L_0x00dd
        L_0x0055:
            r7 = 11
            goto L_0x00de
        L_0x0059:
            java.lang.String r7 = "st"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0063
            goto L_0x00dd
        L_0x0063:
            r7 = 10
            goto L_0x00de
        L_0x0067:
            java.lang.String r7 = "sr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0071
            goto L_0x00dd
        L_0x0071:
            r7 = 9
            goto L_0x00de
        L_0x0075:
            java.lang.String r7 = "sh"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x007f
            goto L_0x00dd
        L_0x007f:
            r7 = 8
            goto L_0x00de
        L_0x0083:
            java.lang.String r7 = "rp"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x008d
            goto L_0x00dd
        L_0x008d:
            r7 = 7
            goto L_0x00de
        L_0x0090:
            java.lang.String r7 = "rc"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0099
            goto L_0x00dd
        L_0x0099:
            r7 = 6
            goto L_0x00de
        L_0x009b:
            java.lang.String r7 = "mm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00a4
            goto L_0x00dd
        L_0x00a4:
            r7 = r8
            goto L_0x00de
        L_0x00a6:
            java.lang.String r7 = "gs"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00af
            goto L_0x00dd
        L_0x00af:
            r7 = r9
            goto L_0x00de
        L_0x00b1:
            java.lang.String r7 = "gr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00ba
            goto L_0x00dd
        L_0x00ba:
            r7 = r10
            goto L_0x00de
        L_0x00bc:
            java.lang.String r7 = "gf"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00c5
            goto L_0x00dd
        L_0x00c5:
            r7 = r2
            goto L_0x00de
        L_0x00c7:
            java.lang.String r7 = "fl"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            r7 = r6
            goto L_0x00de
        L_0x00d2:
            java.lang.String r7 = "el"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r7 = r11
            goto L_0x00de
        L_0x00dd:
            r7 = -1
        L_0x00de:
            r13 = 0
            java.lang.String r14 = "d"
            java.lang.String r15 = "g"
            java.lang.String r5 = "o"
            r12 = 1065353216(0x3f800000, float:1.0)
            switch(r7) {
                case 0: goto L_0x0640;
                case 1: goto L_0x05dc;
                case 2: goto L_0x053f;
                case 3: goto L_0x04f8;
                case 4: goto L_0x03cf;
                case 5: goto L_0x0392;
                case 6: goto L_0x034a;
                case 7: goto L_0x0302;
                case 8: goto L_0x02bf;
                case 9: goto L_0x0254;
                case 10: goto L_0x015c;
                case 11: goto L_0x0107;
                case 12: goto L_0x0101;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown shape type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            p206p3.C7656b.m14695b(r1)
            r5 = 0
            goto L_0x0695
        L_0x0101:
            k3.k r5 = p196o3.C7517c.m14504a(r31, r32)
            goto L_0x0695
        L_0x0107:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7526g0.f16779a
            r22 = r11
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0115:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x0153
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7526g0.f16779a
            int r3 = r0.mo14637r(r3)
            if (r3 == 0) goto L_0x014e
            if (r3 == r6) goto L_0x0149
            if (r3 == r2) goto L_0x0144
            if (r3 == r10) goto L_0x013f
            if (r3 == r9) goto L_0x0136
            if (r3 == r8) goto L_0x0131
            r31.mo14639u()
            goto L_0x0115
        L_0x0131:
            boolean r22 = r31.mo14630g()
            goto L_0x0115
        L_0x0136:
            int r3 = r31.mo14633i()
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r18 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.forId(r3)
            goto L_0x0115
        L_0x013f:
            java.lang.String r17 = r31.mo14634j()
            goto L_0x0115
        L_0x0144:
            k3.b r21 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x0115
        L_0x0149:
            k3.b r20 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x0115
        L_0x014e:
            k3.b r19 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x0115
        L_0x0153:
            com.airbnb.lottie.model.content.ShapeTrimPath r5 = new com.airbnb.lottie.model.content.ShapeTrimPath
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0695
        L_0x015c:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7524f0.f16776a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r27 = r11
            r26 = r13
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x0175:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x0249
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7524f0.f16776a
            int r4 = r0.mo14637r(r4)
            switch(r4) {
                case 0: goto L_0x0243;
                case 1: goto L_0x0234;
                case 2: goto L_0x022e;
                case 3: goto L_0x0228;
                case 4: goto L_0x021b;
                case 5: goto L_0x020e;
                case 6: goto L_0x0205;
                case 7: goto L_0x01ff;
                case 8: goto L_0x0188;
                default: goto L_0x0184;
            }
        L_0x0184:
            r31.mo14639u()
            goto L_0x0175
        L_0x0188:
            r31.mo14625a()
        L_0x018b:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x01ed
            r31.mo14626b()
            r4 = 0
            r7 = 0
        L_0x0196:
            boolean r8 = r31.mo14629f()
            if (r8 == 0) goto L_0x01b7
            com.airbnb.lottie.parser.moshi.JsonReader$a r8 = p196o3.C7524f0.f16777b
            int r8 = r0.mo14637r(r8)
            if (r8 == 0) goto L_0x01b2
            if (r8 == r6) goto L_0x01ad
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x0196
        L_0x01ad:
            k3.b r4 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x0196
        L_0x01b2:
            java.lang.String r7 = r31.mo14634j()
            goto L_0x0196
        L_0x01b7:
            r31.mo14628e()
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 100: goto L_0x01d8;
                case 103: goto L_0x01cf;
                case 111: goto L_0x01c6;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            r7 = -1
            goto L_0x01e0
        L_0x01c6:
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x01cd
            goto L_0x01c4
        L_0x01cd:
            r7 = r2
            goto L_0x01e0
        L_0x01cf:
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x01d6
            goto L_0x01c4
        L_0x01d6:
            r7 = r6
            goto L_0x01e0
        L_0x01d8:
            boolean r7 = r7.equals(r14)
            if (r7 != 0) goto L_0x01df
            goto L_0x01c4
        L_0x01df:
            r7 = r11
        L_0x01e0:
            switch(r7) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01e7;
                case 2: goto L_0x01e4;
                default: goto L_0x01e3;
            }
        L_0x01e3:
            goto L_0x018b
        L_0x01e4:
            r19 = r4
            goto L_0x018b
        L_0x01e7:
            r1.f10854n = r6
            r3.add(r4)
            goto L_0x018b
        L_0x01ed:
            r31.mo14627d()
            int r4 = r3.size()
            if (r4 != r6) goto L_0x0175
            java.lang.Object r4 = r3.get(r11)
            r3.add(r4)
            goto L_0x0175
        L_0x01ff:
            boolean r27 = r31.mo14630g()
            goto L_0x0175
        L_0x0205:
            double r7 = r31.mo14632h()
            float r4 = (float) r7
            r26 = r4
            goto L_0x0175
        L_0x020e:
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r7 = r31.mo14633i()
            int r7 = r7 - r6
            r25 = r4[r7]
            goto L_0x0175
        L_0x021b:
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r7 = r31.mo14633i()
            int r7 = r7 - r6
            r24 = r4[r7]
            goto L_0x0175
        L_0x0228:
            k3.d r22 = p196o3.C7519d.m14506b(r31, r32)
            goto L_0x0175
        L_0x022e:
            k3.b r23 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x0175
        L_0x0234:
            k3.a r4 = new k3.a
            o3.f r7 = p196o3.C7523f.f16775a
            java.util.ArrayList r7 = p196o3.C7539r.m14520a(r12, r1, r7, r0)
            r4.<init>(r7)
            r21 = r4
            goto L_0x0175
        L_0x0243:
            java.lang.String r18 = r31.mo14634j()
            goto L_0x0175
        L_0x0249:
            com.airbnb.lottie.model.content.ShapeStroke r5 = new com.airbnb.lottie.model.content.ShapeStroke
            r17 = r5
            r20 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0695
        L_0x0254:
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p196o3.C7545x.f16809a
            r26 = r11
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x026a:
            boolean r2 = r31.mo14629f()
            if (r2 == 0) goto L_0x02b6
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p196o3.C7545x.f16809a
            int r2 = r0.mo14637r(r2)
            switch(r2) {
                case 0: goto L_0x02b1;
                case 1: goto L_0x02a8;
                case 2: goto L_0x02a3;
                case 3: goto L_0x029e;
                case 4: goto L_0x0299;
                case 5: goto L_0x0294;
                case 6: goto L_0x028f;
                case 7: goto L_0x028a;
                case 8: goto L_0x0285;
                case 9: goto L_0x0280;
                default: goto L_0x0279;
            }
        L_0x0279:
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x026a
        L_0x0280:
            boolean r26 = r31.mo14630g()
            goto L_0x026a
        L_0x0285:
            k3.b r24 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x026a
        L_0x028a:
            k3.b r22 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x026a
        L_0x028f:
            k3.b r25 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x026a
        L_0x0294:
            k3.b r23 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x026a
        L_0x0299:
            k3.b r21 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x026a
        L_0x029e:
            k3.l r20 = p196o3.C7513a.m14501b(r31, r32)
            goto L_0x026a
        L_0x02a3:
            k3.b r19 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x026a
        L_0x02a8:
            int r2 = r31.mo14633i()
            com.airbnb.lottie.model.content.PolystarShape$Type r18 = com.airbnb.lottie.model.content.PolystarShape.Type.forValue(r2)
            goto L_0x026a
        L_0x02b1:
            java.lang.String r17 = r31.mo14634j()
            goto L_0x026a
        L_0x02b6:
            com.airbnb.lottie.model.content.PolystarShape r5 = new com.airbnb.lottie.model.content.PolystarShape
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0695
        L_0x02bf:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7522e0.f16774a
            r4 = r11
            r3 = 0
            r5 = 0
        L_0x02c4:
            boolean r7 = r31.mo14629f()
            if (r7 == 0) goto L_0x02fb
            com.airbnb.lottie.parser.moshi.JsonReader$a r7 = p196o3.C7522e0.f16774a
            int r7 = r0.mo14637r(r7)
            if (r7 == 0) goto L_0x02f6
            if (r7 == r6) goto L_0x02f1
            if (r7 == r2) goto L_0x02e1
            if (r7 == r10) goto L_0x02dc
            r31.mo14639u()
            goto L_0x02c4
        L_0x02dc:
            boolean r4 = r31.mo14630g()
            goto L_0x02c4
        L_0x02e1:
            k3.g r3 = new k3.g
            float r7 = p206p3.C7659e.m14702c()
            o3.b0 r8 = p196o3.C7516b0.f16767a
            java.util.ArrayList r7 = p196o3.C7539r.m14520a(r7, r1, r8, r0)
            r3.<init>(r7)
            goto L_0x02c4
        L_0x02f1:
            int r11 = r31.mo14633i()
            goto L_0x02c4
        L_0x02f6:
            java.lang.String r5 = r31.mo14634j()
            goto L_0x02c4
        L_0x02fb:
            l3.j r1 = new l3.j
            r1.<init>(r5, r11, r3, r4)
            goto L_0x053c
        L_0x0302:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7547z.f16811a
            r21 = r11
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x030e:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x0341
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7547z.f16811a
            int r3 = r0.mo14637r(r3)
            if (r3 == 0) goto L_0x033c
            if (r3 == r6) goto L_0x0337
            if (r3 == r2) goto L_0x0332
            if (r3 == r10) goto L_0x032d
            if (r3 == r9) goto L_0x0328
            r31.mo14639u()
            goto L_0x030e
        L_0x0328:
            boolean r21 = r31.mo14630g()
            goto L_0x030e
        L_0x032d:
            k3.k r20 = p196o3.C7517c.m14504a(r31, r32)
            goto L_0x030e
        L_0x0332:
            k3.b r19 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x030e
        L_0x0337:
            k3.b r18 = p196o3.C7519d.m14505a(r0, r1, r11)
            goto L_0x030e
        L_0x033c:
            java.lang.String r17 = r31.mo14634j()
            goto L_0x030e
        L_0x0341:
            l3.f r5 = new l3.f
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0695
        L_0x034a:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7546y.f16810a
            r21 = r11
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0356:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x0389
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7546y.f16810a
            int r3 = r0.mo14637r(r3)
            if (r3 == 0) goto L_0x0384
            if (r3 == r6) goto L_0x037f
            if (r3 == r2) goto L_0x037a
            if (r3 == r10) goto L_0x0375
            if (r3 == r9) goto L_0x0370
            r31.mo14639u()
            goto L_0x0356
        L_0x0370:
            boolean r21 = r31.mo14630g()
            goto L_0x0356
        L_0x0375:
            k3.b r20 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x0356
        L_0x037a:
            k3.e r19 = p196o3.C7519d.m14507c(r31, r32)
            goto L_0x0356
        L_0x037f:
            k3.l r18 = p196o3.C7513a.m14501b(r31, r32)
            goto L_0x0356
        L_0x0384:
            java.lang.String r17 = r31.mo14634j()
            goto L_0x0356
        L_0x0389:
            l3.e r5 = new l3.e
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0695
        L_0x0392:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7542u.f16806a
            r3 = 0
            r5 = 0
        L_0x0396:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x03c2
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7542u.f16806a
            int r4 = r0.mo14637r(r4)
            if (r4 == 0) goto L_0x03bd
            if (r4 == r6) goto L_0x03b4
            if (r4 == r2) goto L_0x03af
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x0396
        L_0x03af:
            boolean r11 = r31.mo14630g()
            goto L_0x0396
        L_0x03b4:
            int r3 = r31.mo14633i()
            com.airbnb.lottie.model.content.MergePaths$MergePathsMode r3 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.forId(r3)
            goto L_0x0396
        L_0x03bd:
            java.lang.String r5 = r31.mo14634j()
            goto L_0x0396
        L_0x03c2:
            com.airbnb.lottie.model.content.MergePaths r2 = new com.airbnb.lottie.model.content.MergePaths
            r2.<init>(r5, r3, r11)
            java.lang.String r3 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r1.mo14581a(r3)
            r5 = r2
            goto L_0x0695
        L_0x03cf:
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p196o3.C7534n.f16789a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r30 = r11
            r27 = r13
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 0
        L_0x03ee:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x04ed
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7534n.f16789a
            int r3 = r0.mo14637r(r3)
            switch(r3) {
                case 0: goto L_0x04e7;
                case 1: goto L_0x04b1;
                case 2: goto L_0x04ab;
                case 3: goto L_0x049c;
                case 4: goto L_0x0496;
                case 5: goto L_0x0490;
                case 6: goto L_0x048a;
                case 7: goto L_0x047d;
                case 8: goto L_0x0470;
                case 9: goto L_0x0467;
                case 10: goto L_0x0462;
                case 11: goto L_0x0404;
                default: goto L_0x03fd;
            }
        L_0x03fd:
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x03ee
        L_0x0404:
            r31.mo14625a()
        L_0x0407:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x0451
            r31.mo14626b()
            r3 = 0
            r4 = 0
        L_0x0412:
            boolean r7 = r31.mo14629f()
            if (r7 == 0) goto L_0x0433
            com.airbnb.lottie.parser.moshi.JsonReader$a r7 = p196o3.C7534n.f16791c
            int r7 = r0.mo14637r(r7)
            if (r7 == 0) goto L_0x042e
            if (r7 == r6) goto L_0x0429
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x0412
        L_0x0429:
            k3.b r3 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x0412
        L_0x042e:
            java.lang.String r4 = r31.mo14634j()
            goto L_0x0412
        L_0x0433:
            r31.mo14628e()
            boolean r7 = r4.equals(r5)
            if (r7 == 0) goto L_0x043f
            r29 = r3
            goto L_0x0407
        L_0x043f:
            boolean r7 = r4.equals(r14)
            if (r7 != 0) goto L_0x044b
            boolean r4 = r4.equals(r15)
            if (r4 == 0) goto L_0x0407
        L_0x044b:
            r1.f10854n = r6
            r2.add(r3)
            goto L_0x0407
        L_0x0451:
            r31.mo14627d()
            int r3 = r2.size()
            if (r3 != r6) goto L_0x03ee
            java.lang.Object r3 = r2.get(r11)
            r2.add(r3)
            goto L_0x03ee
        L_0x0462:
            boolean r30 = r31.mo14630g()
            goto L_0x03ee
        L_0x0467:
            double r3 = r31.mo14632h()
            float r3 = (float) r3
            r27 = r3
            goto L_0x03ee
        L_0x0470:
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r3 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r4 = r31.mo14633i()
            int r4 = r4 - r6
            r26 = r3[r4]
            goto L_0x03ee
        L_0x047d:
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r3 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r4 = r31.mo14633i()
            int r4 = r4 - r6
            r25 = r3[r4]
            goto L_0x03ee
        L_0x048a:
            k3.b r24 = p196o3.C7519d.m14505a(r0, r1, r6)
            goto L_0x03ee
        L_0x0490:
            k3.e r23 = p196o3.C7519d.m14507c(r31, r32)
            goto L_0x03ee
        L_0x0496:
            k3.e r22 = p196o3.C7519d.m14507c(r31, r32)
            goto L_0x03ee
        L_0x049c:
            int r3 = r31.mo14633i()
            if (r3 != r6) goto L_0x04a5
            com.airbnb.lottie.model.content.GradientType r3 = com.airbnb.lottie.model.content.GradientType.LINEAR
            goto L_0x04a7
        L_0x04a5:
            com.airbnb.lottie.model.content.GradientType r3 = com.airbnb.lottie.model.content.GradientType.RADIAL
        L_0x04a7:
            r19 = r3
            goto L_0x03ee
        L_0x04ab:
            k3.d r21 = p196o3.C7519d.m14506b(r31, r32)
            goto L_0x03ee
        L_0x04b1:
            r31.mo14626b()
            r3 = -1
        L_0x04b5:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x04e2
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7534n.f16790b
            int r4 = r0.mo14637r(r4)
            if (r4 == 0) goto L_0x04dd
            if (r4 == r6) goto L_0x04cc
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x04b5
        L_0x04cc:
            k3.c r4 = new k3.c
            o3.l r7 = new o3.l
            r7.<init>(r3)
            java.util.ArrayList r7 = p196o3.C7539r.m14520a(r12, r1, r7, r0)
            r4.<init>(r7)
            r20 = r4
            goto L_0x04b5
        L_0x04dd:
            int r3 = r31.mo14633i()
            goto L_0x04b5
        L_0x04e2:
            r31.mo14628e()
            goto L_0x03ee
        L_0x04e7:
            java.lang.String r18 = r31.mo14634j()
            goto L_0x03ee
        L_0x04ed:
            com.airbnb.lottie.model.content.a r5 = new com.airbnb.lottie.model.content.a
            r17 = r5
            r28 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0695
        L_0x04f8:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7520d0.f16772a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
        L_0x0500:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x0537
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7520d0.f16772a
            int r4 = r0.mo14637r(r4)
            if (r4 == 0) goto L_0x0532
            if (r4 == r6) goto L_0x052d
            if (r4 == r2) goto L_0x0516
            r31.mo14639u()
            goto L_0x0500
        L_0x0516:
            r31.mo14625a()
        L_0x0519:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x0529
            l3.b r4 = m14509a(r31, r32)
            if (r4 == 0) goto L_0x0519
            r3.add(r4)
            goto L_0x0519
        L_0x0529:
            r31.mo14627d()
            goto L_0x0500
        L_0x052d:
            boolean r11 = r31.mo14630g()
            goto L_0x0500
        L_0x0532:
            java.lang.String r5 = r31.mo14634j()
            goto L_0x0500
        L_0x0537:
            l3.i r1 = new l3.i
            r1.<init>(r11, r5, r3)
        L_0x053c:
            r5 = r1
            goto L_0x0695
        L_0x053f:
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p196o3.C7533m.f16787a
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
            r20 = r2
            r25 = r11
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x0553:
            boolean r2 = r31.mo14629f()
            if (r2 == 0) goto L_0x05d3
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p196o3.C7533m.f16787a
            int r2 = r0.mo14637r(r2)
            switch(r2) {
                case 0: goto L_0x05ce;
                case 1: goto L_0x0599;
                case 2: goto L_0x0594;
                case 3: goto L_0x0586;
                case 4: goto L_0x0581;
                case 5: goto L_0x057c;
                case 6: goto L_0x056e;
                case 7: goto L_0x0569;
                default: goto L_0x0562;
            }
        L_0x0562:
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x0553
        L_0x0569:
            boolean r25 = r31.mo14630g()
            goto L_0x0553
        L_0x056e:
            int r2 = r31.mo14633i()
            if (r2 != r6) goto L_0x0577
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
            goto L_0x0579
        L_0x0577:
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0579:
            r20 = r2
            goto L_0x0553
        L_0x057c:
            k3.e r24 = p196o3.C7519d.m14507c(r31, r32)
            goto L_0x0553
        L_0x0581:
            k3.e r23 = p196o3.C7519d.m14507c(r31, r32)
            goto L_0x0553
        L_0x0586:
            int r2 = r31.mo14633i()
            if (r2 != r6) goto L_0x058f
            com.airbnb.lottie.model.content.GradientType r2 = com.airbnb.lottie.model.content.GradientType.LINEAR
            goto L_0x0591
        L_0x058f:
            com.airbnb.lottie.model.content.GradientType r2 = com.airbnb.lottie.model.content.GradientType.RADIAL
        L_0x0591:
            r19 = r2
            goto L_0x0553
        L_0x0594:
            k3.d r22 = p196o3.C7519d.m14506b(r31, r32)
            goto L_0x0553
        L_0x0599:
            r31.mo14626b()
            r2 = -1
        L_0x059d:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x05ca
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7533m.f16788b
            int r3 = r0.mo14637r(r3)
            if (r3 == 0) goto L_0x05c5
            if (r3 == r6) goto L_0x05b4
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x059d
        L_0x05b4:
            k3.c r3 = new k3.c
            o3.l r4 = new o3.l
            r4.<init>(r2)
            java.util.ArrayList r4 = p196o3.C7539r.m14520a(r12, r1, r4, r0)
            r3.<init>(r4)
            r21 = r3
            goto L_0x059d
        L_0x05c5:
            int r2 = r31.mo14633i()
            goto L_0x059d
        L_0x05ca:
            r31.mo14628e()
            goto L_0x0553
        L_0x05ce:
            java.lang.String r18 = r31.mo14634j()
            goto L_0x0553
        L_0x05d3:
            l3.d r5 = new l3.d
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0695
        L_0x05dc:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7518c0.f16771a
            r3 = r6
            r18 = r11
            r22 = r18
            r17 = 0
            r20 = 0
            r21 = 0
        L_0x05e9:
            boolean r4 = r31.mo14629f()
            if (r4 == 0) goto L_0x062f
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7518c0.f16771a
            int r4 = r0.mo14637r(r4)
            if (r4 == 0) goto L_0x062a
            if (r4 == r6) goto L_0x061c
            if (r4 == r2) goto L_0x0617
            if (r4 == r10) goto L_0x0612
            if (r4 == r9) goto L_0x060d
            if (r4 == r8) goto L_0x0608
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x05e9
        L_0x0608:
            boolean r22 = r31.mo14630g()
            goto L_0x05e9
        L_0x060d:
            int r3 = r31.mo14633i()
            goto L_0x05e9
        L_0x0612:
            boolean r18 = r31.mo14630g()
            goto L_0x05e9
        L_0x0617:
            k3.d r21 = p196o3.C7519d.m14506b(r31, r32)
            goto L_0x05e9
        L_0x061c:
            k3.a r4 = new k3.a
            o3.f r5 = p196o3.C7523f.f16775a
            java.util.ArrayList r5 = p196o3.C7539r.m14520a(r12, r1, r5, r0)
            r4.<init>(r5)
            r20 = r4
            goto L_0x05e9
        L_0x062a:
            java.lang.String r17 = r31.mo14634j()
            goto L_0x05e9
        L_0x062f:
            if (r3 != r6) goto L_0x0634
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.WINDING
            goto L_0x0636
        L_0x0634:
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0636:
            r19 = r1
            l3.h r5 = new l3.h
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0695
        L_0x0640:
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p196o3.C7521e.f16773a
            if (r3 != r10) goto L_0x0646
            r3 = r6
            goto L_0x0647
        L_0x0646:
            r3 = r11
        L_0x0647:
            r20 = r3
            r21 = r11
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0651:
            boolean r3 = r31.mo14629f()
            if (r3 == 0) goto L_0x068e
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p196o3.C7521e.f16773a
            int r3 = r0.mo14637r(r3)
            if (r3 == 0) goto L_0x0689
            if (r3 == r6) goto L_0x0684
            if (r3 == r2) goto L_0x067f
            if (r3 == r10) goto L_0x067a
            if (r3 == r9) goto L_0x066e
            r31.mo14638t()
            r31.mo14639u()
            goto L_0x0651
        L_0x066e:
            int r3 = r31.mo14633i()
            if (r3 != r10) goto L_0x0677
            r20 = r6
            goto L_0x0651
        L_0x0677:
            r20 = r11
            goto L_0x0651
        L_0x067a:
            boolean r21 = r31.mo14630g()
            goto L_0x0651
        L_0x067f:
            k3.e r19 = p196o3.C7519d.m14507c(r31, r32)
            goto L_0x0651
        L_0x0684:
            k3.l r18 = p196o3.C7513a.m14501b(r31, r32)
            goto L_0x0651
        L_0x0689:
            java.lang.String r17 = r31.mo14634j()
            goto L_0x0651
        L_0x068e:
            l3.a r5 = new l3.a
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0695:
            boolean r1 = r31.mo14629f()
            if (r1 == 0) goto L_0x069f
            r31.mo14639u()
            goto L_0x0695
        L_0x069f:
            r31.mo14628e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p196o3.C7525g.m14509a(com.airbnb.lottie.parser.moshi.a, com.airbnb.lottie.c):l3.b");
    }
}
