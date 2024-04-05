package com.cardinalcommerce.shared.p065cs.p069e;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.cardinalcommerce.shared.cs.e.b */
public class C6272b implements Serializable {

    /* renamed from: A */
    private String f13754A;

    /* renamed from: B */
    private String f13755B;

    /* renamed from: C */
    private String f13756C;

    /* renamed from: D */
    private String f13757D;

    /* renamed from: E */
    private String f13758E;

    /* renamed from: F */
    private String f13759F;

    /* renamed from: G */
    private boolean f13760G;

    /* renamed from: H */
    private String f13761H;

    /* renamed from: a */
    public C6276i f13762a;

    /* renamed from: b */
    public boolean f13763b = false;

    /* renamed from: c */
    public String f13764c = "";

    /* renamed from: d */
    private String f13765d;

    /* renamed from: e */
    private String f13766e;

    /* renamed from: f */
    private String f13767f;

    /* renamed from: g */
    private String f13768g;

    /* renamed from: h */
    private String f13769h;

    /* renamed from: i */
    private String f13770i;

    /* renamed from: j */
    private String f13771j;

    /* renamed from: k */
    private String f13772k;

    /* renamed from: l */
    private String f13773l;

    /* renamed from: m */
    private String f13774m;

    /* renamed from: n */
    private ArrayList<C6275h> f13775n;

    /* renamed from: o */
    private String f13776o;

    /* renamed from: p */
    private String f13777p;

    /* renamed from: q */
    private C6273f f13778q;

    /* renamed from: r */
    private String f13779r;

    /* renamed from: s */
    private String f13780s;

    /* renamed from: t */
    private String f13781t;

    /* renamed from: u */
    private String f13782u;

    /* renamed from: v */
    private String f13783v;

    /* renamed from: w */
    private String f13784w;

    /* renamed from: x */
    private C6273f f13785x;

    /* renamed from: y */
    private String f13786y;

    /* renamed from: z */
    private String f13787z;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01fe A[SYNTHETIC, Splitter:B:47:0x01fe] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6272b(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r16.<init>()
            r1 = 0
            r0.f13763b = r1
            java.lang.String r2 = ""
            r0.f13764c = r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r4 = r17
            r3.<init>(r4)
            com.cardinalcommerce.shared.cs.e.i r4 = new com.cardinalcommerce.shared.cs.e.i
            r4.<init>()
            r0.f13762a = r4
            java.lang.String r4 = "threeDSServerTransID"
            java.lang.String r5 = r3.optString(r4)
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25347t(r5)
            r0.f13760G = r6
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r6, r4)
            r0.f13765d = r5
            java.lang.String r4 = "acsCounterAtoS"
            java.lang.String r5 = r3.optString(r4)
            r6 = 3
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25308U(r6, r5)
            r0.f13760G = r6
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r6, r4)
            r0.f13758E = r5
            java.lang.String r4 = "acsTransID"
            java.lang.String r5 = r3.optString(r4)
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25347t(r5)
            r0.f13760G = r6
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r6, r4)
            r0.f13766e = r5
            java.lang.String r4 = "acsHTML"
            java.lang.String r4 = r3.optString(r4)
            r0.f13767f = r4
            java.lang.String r4 = "acsHTMLRefresh"
            java.lang.String r4 = r3.optString(r4)
            r0.f13761H = r4
            java.lang.String r4 = "acsUiType"
            java.lang.String r4 = r3.optString(r4, r2)
            boolean r5 = r4.equalsIgnoreCase(r2)
            r6 = 1
            r7 = 2
            if (r5 != 0) goto L_0x0083
            boolean r5 = com.google.android.play.core.assetpacks.C15588c1.m25343r(r7, r4)
            if (r5 == 0) goto L_0x0084
            int r8 = java.lang.Integer.parseInt(r4)
            if (r8 < 0) goto L_0x0081
            r9 = 5
            if (r8 <= r9) goto L_0x0084
        L_0x0081:
            r5 = r1
            goto L_0x0084
        L_0x0083:
            r5 = r6
        L_0x0084:
            r0.f13760G = r5
            com.cardinalcommerce.shared.cs.e.i r8 = r0.f13762a
            java.lang.String r9 = "uiType"
            r8.mo17804a(r5, r9)
            r0.f13768g = r4
            java.lang.String r4 = "challengeAddInfo"
            java.lang.String r5 = r3.optString(r4)
            r8 = 256(0x100, float:3.59E-43)
            boolean r9 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r5)
            r0.f13760G = r9
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a
            r10.mo17804a(r9, r4)
            r0.f13769h = r5
            java.lang.String r5 = "challengeCompletionInd"
            java.lang.String r9 = r3.optString(r5)
            java.lang.String r10 = "Y"
            java.lang.String r11 = "N"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            boolean r11 = com.google.android.play.core.assetpacks.C15588c1.m25308U(r6, r9)
            if (r11 == 0) goto L_0x00c7
            r11 = r1
            r12 = r11
        L_0x00ba:
            if (r11 >= r7) goto L_0x00c8
            r13 = r10[r11]
            if (r12 != 0) goto L_0x00c4
            boolean r12 = r9.equalsIgnoreCase(r13)
        L_0x00c4:
            int r11 = r11 + 1
            goto L_0x00ba
        L_0x00c7:
            r12 = r1
        L_0x00c8:
            r0.f13760G = r12
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r12, r5)
            r0.f13770i = r9
            java.lang.String r5 = "challengeInfoHeader"
            java.lang.String r7 = r3.optString(r5)
            r9 = 45
            boolean r10 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r7)
            r0.f13760G = r10
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r10, r5)
            r0.f13771j = r7
            java.lang.String r5 = "challengeInfoLabel"
            java.lang.String r7 = r3.optString(r5)
            boolean r10 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r7)
            r0.f13760G = r10
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r10, r5)
            r0.f13772k = r7
            java.lang.String r5 = "challengeInfoText"
            java.lang.String r7 = r3.optString(r5, r2)
            r10 = 350(0x15e, float:4.9E-43)
            boolean r10 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r10, r7)
            r0.f13760G = r10
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r10, r5)
            java.lang.String r5 = "line.separator"
            java.lang.String r5 = java.lang.System.getProperty(r5)
            java.util.Objects.requireNonNull(r5)
            java.lang.String r10 = "\\n"
            java.lang.String r5 = r7.replace(r10, r5)
            r0.f13773l = r5
            java.lang.String r5 = "challengeInfoTextIndicator"
            java.lang.String r7 = r3.optString(r5, r2)
            boolean r10 = r7.equals(r2)
            if (r10 == 0) goto L_0x012a
            goto L_0x0136
        L_0x012a:
            boolean r10 = r7.equals(r2)
            if (r10 != 0) goto L_0x0138
            int r10 = r7.length()
            if (r10 > r6) goto L_0x0138
        L_0x0136:
            r10 = r6
            goto L_0x0139
        L_0x0138:
            r10 = r1
        L_0x0139:
            r0.f13760G = r10
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r10, r5)
            r0.f13774m = r7
            java.lang.String r5 = "challengeSelectInfo"
            java.lang.String r5 = r3.optString(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r10 = r5.length()
            if (r10 <= 0) goto L_0x0160
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0159 }
            r10.<init>(r5)     // Catch:{ JSONException -> 0x0159 }
            goto L_0x0161
        L_0x0159:
            com.cardinalcommerce.shared.cs.e.i r5 = r0.f13762a
            java.lang.String r10 = "ChallengeSelectInfo"
            r5.mo17804a(r1, r10)
        L_0x0160:
            r10 = 0
        L_0x0161:
            if (r10 == 0) goto L_0x01b2
            int r5 = r10.length()
            if (r5 <= 0) goto L_0x01b2
            r5 = r1
        L_0x016a:
            int r11 = r10.length()
            if (r5 >= r11) goto L_0x01b2
            org.json.JSONObject r11 = r10.getJSONObject(r5)
            java.util.Iterator r12 = r11.keys()
        L_0x0178:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01ad
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            com.cardinalcommerce.shared.cs.e.i r14 = r0.f13762a
            boolean r15 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r13)
            java.lang.String r6 = "challengeSelectInfo name"
            r14.mo17804a(r15, r6)
            java.lang.Object r6 = r11.get(r13)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.cardinalcommerce.shared.cs.e.i r14 = r0.f13762a
            boolean r15 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r6)
            java.lang.String r1 = "challengeSelectInfo value"
            r14.mo17804a(r15, r1)
            com.cardinalcommerce.shared.cs.e.h r1 = new com.cardinalcommerce.shared.cs.e.h
            r1.<init>(r13, r6)
            r7.add(r1)
            r1 = 0
            r6 = 1
            goto L_0x0178
        L_0x01ad:
            int r5 = r5 + 1
            r1 = 0
            r6 = 1
            goto L_0x016a
        L_0x01b2:
            r0.f13775n = r7
            java.lang.String r1 = "expandInfoLabel"
            java.lang.String r5 = r3.optString(r1)
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r5)
            r0.f13760G = r6
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r6, r1)
            r0.f13776o = r5
            java.lang.String r1 = "expandInfoText"
            java.lang.String r5 = r3.optString(r1)
            boolean r6 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r5)
            r0.f13760G = r6
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r6, r1)
            r0.f13777p = r5
            com.cardinalcommerce.shared.cs.e.f r1 = new com.cardinalcommerce.shared.cs.e.f
            java.lang.String r5 = "issuerImage"
            java.lang.String r6 = r3.optString(r5)
            r1.<init>(r6)
            boolean r6 = r1.f13788a
            r0.f13760G = r6
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r6, r5)
            r0.f13778q = r1
            java.lang.String r1 = "messageExtension"
            java.lang.String r1 = r3.optString(r1)
            boolean r5 = r1.equals(r2)
            r6 = 64
            if (r5 != 0) goto L_0x0292
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0289 }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x0289 }
            int r7 = r5.length()     // Catch:{ JSONException -> 0x0289 }
            r10 = 10
            if (r7 <= r10) goto L_0x0213
            com.cardinalcommerce.shared.cs.e.i r5 = r0.f13762a     // Catch:{ JSONException -> 0x0289 }
            r7 = 0
            r5.mo17804a(r7, r1)     // Catch:{ JSONException -> 0x0289 }
            goto L_0x0292
        L_0x0213:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0289 }
            r7.<init>()     // Catch:{ JSONException -> 0x0289 }
            r7 = 0
        L_0x0219:
            int r10 = r5.length()     // Catch:{ JSONException -> 0x0289 }
            if (r7 >= r10) goto L_0x0292
            org.json.JSONObject r10 = r5.getJSONObject(r7)     // Catch:{ JSONException -> 0x0289 }
            com.cardinalcommerce.shared.cs.e.g r11 = new com.cardinalcommerce.shared.cs.e.g     // Catch:{ JSONException -> 0x0289 }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x0289 }
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r12 = r11.mo17797a()     // Catch:{ JSONException -> 0x0289 }
            boolean r12 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r6, r12)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r13 = "Message Extension Name"
            r10.mo17804a(r12, r13)     // Catch:{ JSONException -> 0x0289 }
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r12 = r11.mo17798b()     // Catch:{ JSONException -> 0x0289 }
            boolean r12 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r6, r12)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r13 = "Message Extension ID"
            r10.mo17804a(r12, r13)     // Catch:{ JSONException -> 0x0289 }
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r12 = r11.mo17799c()     // Catch:{ JSONException -> 0x0289 }
            r13 = 8059(0x1f7b, float:1.1293E-41)
            boolean r12 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r13, r12)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r13 = "Message Extension Data"
            r10.mo17804a(r12, r13)     // Catch:{ JSONException -> 0x0289 }
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a     // Catch:{ JSONException -> 0x0289 }
            boolean r12 = r11.f13793b     // Catch:{ JSONException -> 0x0289 }
            if (r12 != 0) goto L_0x025f
            r12 = 1
            goto L_0x0260
        L_0x025f:
            r12 = 0
        L_0x0260:
            java.lang.String r13 = "Message Extension criticality Indicator"
            r10.mo17804a(r12, r13)     // Catch:{ JSONException -> 0x0289 }
            boolean r10 = r11.f13793b     // Catch:{ JSONException -> 0x0289 }
            if (r10 == 0) goto L_0x0286
            r10 = 1
            r0.f13763b = r10     // Catch:{ JSONException -> 0x0289 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0289 }
            r10.<init>()     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r11 = r11.f13792a     // Catch:{ JSONException -> 0x0289 }
            r10.append(r11)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r11 = ","
            r10.append(r11)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r11 = r0.f13764c     // Catch:{ JSONException -> 0x0289 }
            r10.append(r11)     // Catch:{ JSONException -> 0x0289 }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x0289 }
            r0.f13764c = r10     // Catch:{ JSONException -> 0x0289 }
        L_0x0286:
            int r7 = r7 + 1
            goto L_0x0219
        L_0x0289:
            com.cardinalcommerce.shared.cs.e.i r5 = r0.f13762a
            java.lang.String r7 = "Message Extension"
            r10 = 0
            r5.mo17804a(r10, r7)
            goto L_0x0293
        L_0x0292:
            r10 = 0
        L_0x0293:
            r0.f13779r = r1
            java.lang.String r1 = "messageType"
            java.lang.String r5 = r3.optString(r1)
            r7 = 4
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25308U(r7, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r7, r1)
            r0.f13780s = r5
            java.lang.String r1 = "messageVersion"
            java.lang.String r5 = r3.optString(r1)
            r7 = 8
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r7, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r7, r1)
            r0.f13781t = r5
            java.lang.String r1 = "oobAppURL"
            java.lang.String r5 = r3.optString(r1)
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r7, r1)
            r0.f13782u = r5
            java.lang.String r1 = "oobAppLabel"
            java.lang.String r5 = r3.optString(r1)
            java.lang.String r7 = r0.f13782u
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r7)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r7, r1)
            r0.f13783v = r5
            java.lang.String r1 = "oobContinueLabel"
            java.lang.String r5 = r3.optString(r1)
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r7, r1)
            r0.f13784w = r5
            com.cardinalcommerce.shared.cs.e.f r1 = new com.cardinalcommerce.shared.cs.e.f
            java.lang.String r5 = "psImage"
            java.lang.String r7 = r3.optString(r5)
            r1.<init>(r7)
            boolean r7 = r1.f13788a
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r11 = r0.f13762a
            r11.mo17804a(r7, r5)
            r0.f13785x = r1
            java.lang.String r1 = "resendInformationLabel"
            java.lang.String r5 = r3.optString(r1, r2)
            boolean r7 = r5.equals(r2)
            if (r7 == 0) goto L_0x031c
            goto L_0x0328
        L_0x031c:
            boolean r7 = r5.equals(r2)
            if (r7 != 0) goto L_0x0329
            int r7 = r5.length()
            if (r7 > r9) goto L_0x0329
        L_0x0328:
            r10 = 1
        L_0x0329:
            r0.f13760G = r10
            com.cardinalcommerce.shared.cs.e.i r7 = r0.f13762a
            r7.mo17804a(r10, r1)
            r0.f13786y = r5
            java.lang.String r1 = "sdkTransID"
            java.lang.String r5 = r3.optString(r1)
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25347t(r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a
            r10.mo17804a(r7, r1)
            r0.f13787z = r5
            java.lang.String r1 = "submitAuthenticationLabel"
            java.lang.String r5 = r3.optString(r1, r2)
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a
            r10.mo17804a(r7, r1)
            r0.f13754A = r5
            java.lang.String r1 = "transStatus"
            java.lang.String r5 = r3.optString(r1)
            r7 = 1
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r7, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r10 = r0.f13762a
            r10.mo17804a(r7, r1)
            r0.f13755B = r5
            java.lang.String r1 = "whyInfoLabel"
            java.lang.String r5 = r3.optString(r1)
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r9, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r9 = r0.f13762a
            r9.mo17804a(r7, r1)
            r0.f13756C = r5
            java.lang.String r1 = "whyInfoText"
            java.lang.String r5 = r3.optString(r1)
            boolean r7 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r5)
            r0.f13760G = r7
            com.cardinalcommerce.shared.cs.e.i r9 = r0.f13762a
            r9.mo17804a(r7, r1)
            r0.f13757D = r5
            java.lang.String r1 = r16.mo17786q()
            if (r1 == 0) goto L_0x03d0
            java.lang.String r1 = r16.mo17786q()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x03d0
            java.lang.String r1 = r16.mo17786q()
            java.lang.String r5 = "2.1.0"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x03d0
            java.lang.String r1 = "whitelistingInfoText"
            java.lang.String r3 = r3.optString(r1)
            boolean r5 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r6, r3)
            r0.f13760G = r5
            com.cardinalcommerce.shared.cs.e.i r6 = r0.f13762a
            r6.mo17804a(r5, r1)
            r0.f13759F = r3
            r0.f13761H = r2
            boolean r1 = com.google.android.play.core.assetpacks.C15588c1.m25269A(r8, r2)
            r0.f13760G = r1
            com.cardinalcommerce.shared.cs.e.i r3 = r0.f13762a
            r3.mo17804a(r1, r4)
            r0.f13769h = r2
        L_0x03d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.p069e.C6272b.<init>(java.lang.String):void");
    }

    /* renamed from: A */
    public String mo17769A() {
        return this.f13759F;
    }

    /* renamed from: a */
    public String mo17770a() {
        return this.f13765d;
    }

    /* renamed from: b */
    public String mo17771b() {
        return this.f13766e;
    }

    /* renamed from: c */
    public String mo17772c() {
        return this.f13767f;
    }

    /* renamed from: d */
    public String mo17773d() {
        return this.f13761H;
    }

    /* renamed from: e */
    public String mo17774e() {
        return this.f13768g;
    }

    /* renamed from: f */
    public String mo17775f() {
        return this.f13769h;
    }

    /* renamed from: g */
    public String mo17776g() {
        return this.f13770i;
    }

    /* renamed from: h */
    public String mo17777h() {
        return this.f13771j;
    }

    /* renamed from: i */
    public String mo17778i() {
        return this.f13772k;
    }

    /* renamed from: j */
    public String mo17779j() {
        return this.f13773l;
    }

    /* renamed from: k */
    public String mo17780k() {
        return this.f13774m;
    }

    /* renamed from: l */
    public ArrayList<C6275h> mo17781l() {
        return this.f13775n;
    }

    /* renamed from: m */
    public String mo17782m() {
        return this.f13776o;
    }

    /* renamed from: n */
    public String mo17783n() {
        return this.f13777p;
    }

    /* renamed from: o */
    public C6273f mo17784o() {
        return this.f13778q;
    }

    /* renamed from: p */
    public String mo17785p() {
        return this.f13780s;
    }

    /* renamed from: q */
    public String mo17786q() {
        return this.f13781t;
    }

    /* renamed from: r */
    public String mo17787r() {
        return this.f13784w;
    }

    /* renamed from: s */
    public C6273f mo17788s() {
        return this.f13785x;
    }

    /* renamed from: t */
    public String mo17789t() {
        return this.f13786y;
    }

    /* renamed from: u */
    public String mo17790u() {
        return this.f13787z;
    }

    /* renamed from: v */
    public String mo17791v() {
        return this.f13754A;
    }

    /* renamed from: w */
    public String mo17792w() {
        return this.f13755B;
    }

    /* renamed from: x */
    public String mo17793x() {
        return this.f13756C;
    }

    /* renamed from: y */
    public String mo17794y() {
        return this.f13757D;
    }

    /* renamed from: z */
    public String mo17795z() {
        return this.f13758E;
    }
}
