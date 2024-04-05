package com.cardinalcommerce.cardinalmobilesdk.p045a.p047c;

import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import com.etsy.android.lib.requests.EtsyRequest;
import java.util.Arrays;
import kotlin.jvm.internal.C19382n;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p103f5.C6787b;
import p103f5.C6789d;
import p103f5.C6791f;
import p115g5.C6882b;
import p139i5.C6993a;
import p151j5.C7119b;
import p257u8.C8171a;

/* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.c */
public class C6137c extends C6270a {

    /* renamed from: c */
    private static final C6993a f13258c = C6993a.m13555g();

    /* renamed from: a */
    private final String f13259a;

    /* renamed from: b */
    private final C6882b f13260b;

    /* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.c$a */
    public static /* synthetic */ class C6138a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13261a;

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
                f13261a = r0
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13261a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13261a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.PROTOCOL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13261a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.MALFORMED_URL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13261a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6137c.C6138a.<clinit>():void");
        }
    }

    public C6137c(C6882b bVar, String str, String str2) {
        this.f13260b = bVar;
        this.f13259a = str2;
        m12260b(str);
    }

    /* renamed from: b */
    private void m12260b(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Order", new JSONObject());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("Agent", "CardinalMobileSdk_Android");
        jSONObject2.put("Version", C8171a.f17936i);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("cca", true);
        jSONObject.put("SupportsAlternativePayments", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("BrowserPayload", jSONObject);
        jSONObject4.put("ConsumerSessionId", (Object) null);
        jSONObject4.put("Client", jSONObject2);
        jSONObject4.put("ServerJWT", str);
        super.mo17766a(C0023f.m110k(new StringBuilder(), this.f13259a, "Order/JWT/Init"), jSONObject4.toString(), (int) EtsyRequest.DEFAULT_TIMEOUT);
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
        C6789d dVar;
        C6882b bVar;
        super.mo17212a(exc, aVar);
        int i = C6138a.f13261a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            C6993a aVar2 = f13258c;
            String arrays = Arrays.toString(exc.getStackTrace());
            aVar2.getClass();
            aVar2.mo19177d(String.valueOf(10212), arrays, (String) null);
            bVar = this.f13260b;
            dVar = new C6789d(10212);
        } else if (i == 3) {
            C6993a aVar3 = f13258c;
            String arrays2 = Arrays.toString(exc.getStackTrace());
            aVar3.getClass();
            aVar3.mo19177d(String.valueOf(10213), arrays2, (String) null);
            bVar = this.f13260b;
            dVar = new C6789d(10213);
        } else if (i == 4) {
            C6993a aVar4 = f13258c;
            String arrays3 = Arrays.toString(exc.getStackTrace());
            aVar4.getClass();
            aVar4.mo19177d(String.valueOf(10211), arrays3, (String) null);
            bVar = this.f13260b;
            dVar = new C6789d(10211);
        } else if (i == 5) {
            C6993a aVar5 = f13258c;
            String arrays4 = Arrays.toString(exc.getStackTrace());
            aVar5.getClass();
            aVar5.mo19177d(String.valueOf(10216), arrays4, (String) null);
            bVar = this.f13260b;
            dVar = new C6789d(10216);
        } else {
            return;
        }
        ((C6787b) bVar).mo18927e(dVar);
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
        super.mo17214a(str, i);
        C6789d dVar = new C6789d(i, str);
        f13258c.mo19179h(dVar, (String) null);
        ((C6787b) this.f13260b).mo18927e(dVar);
    }

    /* renamed from: a */
    public void mo17213a(String str) {
        try {
            if (str.isEmpty()) {
                ((C6787b) this.f13260b).mo18927e(new C6789d(10219));
                return;
            }
            char[] cArr = C8171a.f17928a;
            C6791f j = C19382n.m32753j(str);
            int i = j.f14955b;
            if (i != 0) {
                C6789d dVar = new C6789d(i, j.f14956c);
                f13258c.mo19179h(dVar, j.f14957d);
                ((C6787b) this.f13260b).mo18927e(dVar);
                return;
            }
            C7119b bVar = j.f14954a;
            int i2 = bVar.f15831b;
            if (i2 != 0) {
                C6789d dVar2 = new C6789d(i2, bVar.f15832c);
                f13258c.mo19179h(dVar2, j.f14957d);
                ((C6787b) this.f13260b).mo18927e(dVar2);
                return;
            }
            f13258c.mo19175a("CardinalInit", "Init Successful", (String) null);
            ((C6787b) this.f13260b).mo18928f(j);
        } catch (JSONException e) {
            C6993a aVar = f13258c;
            String arrays = Arrays.toString(e.getStackTrace());
            aVar.getClass();
            aVar.mo19177d(String.valueOf(10206), arrays, (String) null);
            ((C6787b) this.f13260b).mo18927e(new C6789d(10206, e.getLocalizedMessage()));
        }
    }
}
