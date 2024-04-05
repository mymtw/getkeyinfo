package com.cardinalcommerce.cardinalmobilesdk.p045a.p047c;

import androidx.preference.C3039b;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.p070f.C6297o;
import com.etsy.android.lib.requests.EtsyRequest;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p103f5.C6789d;
import p115g5.C6881a;
import p127h5.C6954a;
import p139i5.C6993a;
import p247t8.C8045c;
import p257u8.C8171a;

/* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.d */
public class C6139d extends C6270a {

    /* renamed from: e */
    private static final C6993a f13262e = C6993a.m13555g();

    /* renamed from: a */
    private final String f13263a;

    /* renamed from: b */
    private final C6881a f13264b;

    /* renamed from: c */
    private final C8045c f13265c;

    /* renamed from: d */
    private char[] f13266d;

    /* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.d$a */
    public static /* synthetic */ class C6140a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13267a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.cardinalcommerce.shared.cs.b.a[] r0 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13267a = r0
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.PROTOCOL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.MALFORMED_URL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13267a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6139d.C6140a.<clinit>():void");
        }
    }

    public C6139d(C8045c cVar, C6881a aVar, String str) {
        this.f13264b = aVar;
        this.f13266d = cVar.f17545e;
        this.f13265c = cVar;
        this.f13263a = str;
        f13262e.mo19175a("CardinalContinue", "Challenge task initialized", String.valueOf(cVar.f17557q));
        try {
            super.mo17766a(str + "Order/JWT/StepUp", String.valueOf(m12265a(cVar)), (int) EtsyRequest.DEFAULT_TIMEOUT);
        } catch (JSONException e) {
            C6993a aVar2 = f13262e;
            String arrays = Arrays.toString(e.getStackTrace());
            String valueOf = String.valueOf(cVar.f17557q);
            aVar2.getClass();
            aVar2.mo19177d(String.valueOf(10611), arrays, valueOf);
            m12266a(new C6789d(10611));
        }
    }

    /* renamed from: a */
    private String m12264a(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private JSONObject m12265a(C8045c cVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("ChallengeCancel", m12264a(cVar.f17545e));
        jSONObject2.putOpt("ChallengeDataEntry", m12264a(cVar.f17546f));
        jSONObject2.putOpt("ChallengeHTMLDataEntry", m12264a(cVar.f17547g));
        jSONObject2.putOpt("OobContinue", Boolean.valueOf(cVar.f17550j));
        jSONObject2.putOpt("ResendChallenge", m12264a(cVar.f17551k));
        jSONObject2.putOpt("TransactionId", m12264a(cVar.f17556p));
        jSONObject2.putOpt("ChallengeNoEntry", m12264a(cVar.f17555o));
        jSONObject2.putOpt("RequestorAppUrl", m12264a(cVar.f17554n));
        jSONObject2.putOpt("WhiteListDataEntry", m12264a(cVar.f17553m));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putOpt("PaymentType", "cca");
        jSONObject3.putOpt("StepUp", jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putOpt("Agent", "CardinalMobileSdk_Android");
        jSONObject4.putOpt("Version", C8171a.f17936i);
        jSONObject.putOpt("BrowserPayload", jSONObject3);
        jSONObject.putOpt("Client", jSONObject4);
        char[] cArr = cVar.f17557q;
        if (cArr.length != 0) {
            jSONObject.putOpt("ConsumerSessionId", m12264a(cArr));
        }
        char[] cArr2 = cVar.f17558r;
        if (cArr2.length != 0) {
            jSONObject.putOpt("ServerJWT", m12264a(cArr2));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m12266a(C6789d dVar) {
        ((C6297o) this.f13264b).mo17850c(new ValidateResponse(false, CardinalActionCode.ERROR, dVar), "");
    }

    public void onPreExecute() {
        super.onPreExecute();
        if (C3039b.m7186u(this.f13266d)) {
            return;
        }
        if (Arrays.equals(this.f13266d, C8171a.f17933f) || Arrays.equals(this.f13266d, C8171a.f17934g)) {
            ((C6297o) this.f13264b).mo17850c(new ValidateResponse(false, CardinalActionCode.CANCEL, new C6789d(0, "")), (String) null);
        }
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
        C6789d dVar;
        super.mo17212a(exc, aVar);
        int i = C6140a.f13267a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            C6993a aVar2 = f13262e;
            String arrays = Arrays.toString(exc.getStackTrace());
            String valueOf = String.valueOf(this.f13265c.f17557q);
            aVar2.getClass();
            aVar2.mo19177d(String.valueOf(10612), arrays, valueOf);
            dVar = new C6789d(10612);
        } else if (i == 3) {
            C6993a aVar3 = f13262e;
            String arrays2 = Arrays.toString(exc.getStackTrace());
            String valueOf2 = String.valueOf(this.f13265c.f17557q);
            aVar3.getClass();
            aVar3.mo19177d(String.valueOf(10615), arrays2, valueOf2);
            dVar = new C6789d(10615);
        } else if (i == 4) {
            C6993a aVar4 = f13262e;
            String arrays3 = Arrays.toString(exc.getStackTrace());
            String valueOf3 = String.valueOf(this.f13265c.f17557q);
            aVar4.getClass();
            aVar4.mo19177d(String.valueOf(10613), arrays3, valueOf3);
            dVar = new C6789d(10613);
        } else if (i == 5) {
            C6993a aVar5 = f13262e;
            String arrays4 = Arrays.toString(exc.getStackTrace());
            String valueOf4 = String.valueOf(this.f13265c.f17557q);
            aVar5.getClass();
            aVar5.mo19177d(String.valueOf(10614), arrays4, valueOf4);
            dVar = new C6789d(10614);
        } else {
            return;
        }
        m12266a(dVar);
    }

    /* renamed from: a */
    public void mo17213a(String str) {
        C6954a aVar;
        if ((!Arrays.equals(this.f13266d, C8171a.f17933f) || !Arrays.equals(this.f13266d, C8171a.f17934g)) && C3039b.m7186u(this.f13266d)) {
            try {
                aVar = new C6954a(str);
            } catch (UnsupportedOperationException | JSONException e) {
                C6993a aVar2 = f13262e;
                String arrays = Arrays.toString(e.getStackTrace());
                String valueOf = String.valueOf(this.f13265c.f17557q);
                aVar2.getClass();
                aVar2.mo19177d(String.valueOf(10611), arrays, valueOf);
                m12266a(new C6789d(10611));
                aVar = null;
            }
            if (aVar != null) {
                int i = aVar.f15426a;
                if (i == 0) {
                    C6272b bVar = aVar.f15432g;
                    if (bVar != null) {
                        ((C6297o) this.f13264b).mo17848a(bVar);
                    } else if (aVar.f15428c) {
                        ((C6297o) this.f13264b).mo17850c(aVar.f15431f, aVar.f15430e);
                    } else {
                        ((C6297o) this.f13264b).mo17850c(new ValidateResponse(false, CardinalActionCode.ERROR, new C6789d(10702)), (String) null);
                    }
                } else {
                    ((C6297o) this.f13264b).mo17850c(new ValidateResponse(false, CardinalActionCode.ERROR, new C6789d(i, aVar.f15427b)), (String) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
        C6993a aVar = f13262e;
        String valueOf = String.valueOf(this.f13265c.f17557q);
        aVar.getClass();
        aVar.mo19177d(String.valueOf(i), str, valueOf);
        m12266a(new C6789d(10612));
    }
}
