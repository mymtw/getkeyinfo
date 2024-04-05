package p196o3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;

/* renamed from: o3.c */
public final class C7517c {

    /* renamed from: a */
    public static JsonReader.C4854a f16769a = JsonReader.C4854a.m10470a(Constants.APPBOY_PUSH_CONTENT_KEY, Constants.APPBOY_PUSH_PRIORITY_KEY, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static JsonReader.C4854a f16770b = JsonReader.C4854a.m10470a("k");

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r5 = p196o3.C7519d.m14505a(r0, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (((java.util.List) r5.f15969c).isEmpty() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r16 = java.lang.Float.valueOf(0.0f);
        r17 = java.lang.Float.valueOf(0.0f);
        r9 = r1;
        r12 = (java.util.List) r5.f15969c;
        r10 = r5;
        r26 = r6;
        r18 = r13;
        r13 = r7;
        r1 = new p214q3.C7718a(r28, r16, r17, (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(r8.f10852l));
        r12.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        r10 = r5;
        r26 = r6;
        r18 = r13;
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (((p214q3.C7718a) ((java.util.List) r10.f15969c).get(0)).f17114b != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        ((java.util.List) r10.f15969c).set(0, new p214q3.C7718a(r28, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(r8.f10852l)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00de, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00df, code lost:
        r6 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0120, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0121, code lost:
        r13 = r18;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d0, code lost:
        if ((r0.f17131a == 1.0f && r0.f17132b == 1.0f) != false) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0222, code lost:
        if (((java.lang.Float) ((p214q3.C7718a) ((java.util.List) r12.f15969c).get(0)).f17114b).floatValue() == 0.0f) goto L_0x022a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0205  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p158k3.C7188k m14504a(com.airbnb.lottie.parser.moshi.C4863a r27, com.airbnb.lottie.C4828c r28) throws java.io.IOException {
        /*
            r0 = r27
            r8 = r28
            com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = r27.mo14635k()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r2 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            r10 = 0
            if (r1 != r2) goto L_0x000f
            r11 = 1
            goto L_0x0010
        L_0x000f:
            r11 = r10
        L_0x0010:
            if (r11 == 0) goto L_0x0015
            r27.mo14626b()
        L_0x0015:
            r1 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0021:
            boolean r2 = r27.mo14629f()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0126
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = f16769a
            int r2 = r0.mo14637r(r2)
            switch(r2) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00e2;
                case 3: goto L_0x0059;
                case 4: goto L_0x005e;
                case 5: goto L_0x0054;
                case 6: goto L_0x004f;
                case 7: goto L_0x004a;
                case 8: goto L_0x0045;
                case 9: goto L_0x0040;
                default: goto L_0x0033;
            }
        L_0x0033:
            r26 = r6
            r18 = r13
            r13 = r7
            r27.mo14638t()
            r27.mo14639u()
            goto L_0x0121
        L_0x0040:
            k3.b r13 = p196o3.C7519d.m14505a(r0, r8, r10)
            goto L_0x0021
        L_0x0045:
            k3.b r14 = p196o3.C7519d.m14505a(r0, r8, r10)
            goto L_0x0021
        L_0x004a:
            k3.b r23 = p196o3.C7519d.m14505a(r0, r8, r10)
            goto L_0x0021
        L_0x004f:
            k3.b r22 = p196o3.C7519d.m14505a(r0, r8, r10)
            goto L_0x0021
        L_0x0054:
            k3.d r21 = p196o3.C7519d.m14506b(r27, r28)
            goto L_0x0021
        L_0x0059:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r8.mo14581a(r1)
        L_0x005e:
            k3.b r5 = p196o3.C7519d.m14505a(r0, r8, r10)
            java.lang.Object r1 = r5.f15969c
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r5.f15969c
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            q3.a r2 = new q3.a
            java.lang.Float r16 = java.lang.Float.valueOf(r3)
            java.lang.Float r17 = java.lang.Float.valueOf(r3)
            r18 = 0
            r19 = 0
            float r1 = r8.f10852l
            java.lang.Float r20 = java.lang.Float.valueOf(r1)
            r1 = r2
            r3 = r2
            r2 = r28
            r9 = r3
            r3 = r16
            r12 = r4
            r4 = r17
            r10 = r5
            r5 = r18
            r26 = r6
            r6 = r19
            r18 = r13
            r13 = r7
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.add(r9)
            goto L_0x00de
        L_0x00a2:
            r10 = r5
            r26 = r6
            r18 = r13
            r13 = r7
            java.lang.Object r1 = r10.f15969c
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            q3.a r1 = (p214q3.C7718a) r1
            T r1 = r1.f17114b
            if (r1 != 0) goto L_0x00de
            java.lang.Object r1 = r10.f15969c
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            q3.a r12 = new q3.a
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            r6 = 0
            r7 = 0
            float r1 = r8.f10852l
            java.lang.Float r19 = java.lang.Float.valueOf(r1)
            r1 = r12
            r2 = r28
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = 0
            r9.set(r1, r12)
        L_0x00de:
            r1 = r10
        L_0x00df:
            r6 = r26
            goto L_0x0120
        L_0x00e2:
            r18 = r13
            r13 = r7
            k3.f r6 = new k3.f
            o3.a0 r2 = p196o3.C7514a0.f16764a
            java.util.ArrayList r2 = p196o3.C7539r.m14520a(r4, r8, r2, r0)
            r6.<init>(r2)
            goto L_0x0120
        L_0x00f1:
            r26 = r6
            r18 = r13
            k3.l r7 = p196o3.C7513a.m14501b(r27, r28)
            goto L_0x0121
        L_0x00fa:
            r26 = r6
            r18 = r13
            r13 = r7
            r27.mo14626b()
        L_0x0102:
            boolean r2 = r27.mo14629f()
            if (r2 == 0) goto L_0x011c
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = f16770b
            int r2 = r0.mo14637r(r2)
            if (r2 == 0) goto L_0x0117
            r27.mo14638t()
            r27.mo14639u()
            goto L_0x0102
        L_0x0117:
            r8.a r15 = p196o3.C7513a.m14500a(r27, r28)
            goto L_0x0102
        L_0x011c:
            r27.mo14628e()
            goto L_0x00df
        L_0x0120:
            r7 = r13
        L_0x0121:
            r13 = r18
            r10 = 0
            goto L_0x0021
        L_0x0126:
            r26 = r6
            r18 = r13
            r13 = r7
            if (r11 == 0) goto L_0x0130
            r27.mo14628e()
        L_0x0130:
            if (r15 == 0) goto L_0x0150
            boolean r0 = r15.mo19487c()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r15.f17221b
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            q3.a r0 = (p214q3.C7718a) r0
            T r0 = r0.f17114b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r3, r3)
            if (r0 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r0 = 0
            goto L_0x0151
        L_0x0150:
            r0 = 1
        L_0x0151:
            if (r0 == 0) goto L_0x0154
            r15 = 0
        L_0x0154:
            if (r13 == 0) goto L_0x0178
            boolean r0 = r13 instanceof p158k3.C7185h
            if (r0 != 0) goto L_0x0176
            boolean r0 = r13.mo19487c()
            if (r0 == 0) goto L_0x0176
            java.util.List r0 = r13.mo19486b()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            q3.a r0 = (p214q3.C7718a) r0
            T r0 = r0.f17114b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r3, r3)
            if (r0 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r0 = 0
            goto L_0x0179
        L_0x0178:
            r0 = 1
        L_0x0179:
            if (r0 == 0) goto L_0x017c
            r13 = 0
        L_0x017c:
            if (r1 == 0) goto L_0x019e
            boolean r0 = r1.mo19487c()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r0 = r1.f15969c
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            q3.a r0 = (p214q3.C7718a) r0
            T r0 = r0.f17114b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r0 = 0
            goto L_0x019f
        L_0x019e:
            r0 = 1
        L_0x019f:
            if (r0 == 0) goto L_0x01a6
            r6 = r26
            r20 = 0
            goto L_0x01aa
        L_0x01a6:
            r20 = r1
            r6 = r26
        L_0x01aa:
            if (r6 == 0) goto L_0x01d5
            boolean r0 = r6.mo19487c()
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r6.f15969c
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            q3.a r0 = (p214q3.C7718a) r0
            T r0 = r0.f17114b
            q3.d r0 = (p214q3.C7721d) r0
            float r1 = r0.f17131a
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01cf
            float r0 = r0.f17132b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01cf
            r0 = 1
            goto L_0x01d0
        L_0x01cf:
            r0 = 0
        L_0x01d0:
            if (r0 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r0 = 0
            goto L_0x01d6
        L_0x01d5:
            r0 = 1
        L_0x01d6:
            if (r0 == 0) goto L_0x01db
            r19 = 0
            goto L_0x01dd
        L_0x01db:
            r19 = r6
        L_0x01dd:
            if (r14 == 0) goto L_0x01ff
            boolean r0 = r14.mo19487c()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r14.f15969c
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            q3.a r0 = (p214q3.C7718a) r0
            T r0 = r0.f17114b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            r2 = 0
            goto L_0x0200
        L_0x01ff:
            r2 = 1
        L_0x0200:
            if (r2 == 0) goto L_0x0203
            r14 = 0
        L_0x0203:
            if (r18 == 0) goto L_0x0228
            boolean r0 = r18.mo19487c()
            r12 = r18
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r12.f15969c
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            q3.a r0 = (p214q3.C7718a) r0
            T r0 = r0.f17114b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0226
            goto L_0x022a
        L_0x0225:
            r1 = 0
        L_0x0226:
            r9 = r1
            goto L_0x022b
        L_0x0228:
            r12 = r18
        L_0x022a:
            r9 = 1
        L_0x022b:
            if (r9 == 0) goto L_0x0230
            r25 = 0
            goto L_0x0232
        L_0x0230:
            r25 = r12
        L_0x0232:
            k3.k r0 = new k3.k
            r16 = r0
            r17 = r15
            r18 = r13
            r24 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p196o3.C7517c.m14504a(com.airbnb.lottie.parser.moshi.a, com.airbnb.lottie.c):k3.k");
    }
}
