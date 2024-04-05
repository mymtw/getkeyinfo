package com.cardinalcommerce.emvco.p063a.p064e;

import android.os.AsyncTask;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.preference.C3039b;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6238c;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6241f;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6244i;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6253k;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.Payload;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.p069e.C6276i;
import com.google.android.play.core.assetpacks.C15588c1;
import java.net.URI;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import kotlin.reflect.C19421p;
import org.json.JSONException;
import org.json.JSONObject;
import p095e8.C6756a;
import p142i8.C6998a;
import p154j8.C7155a;
import p163k8.C7208a;
import p172l8.C7278a;
import p192n8.C7492a;
import p201o8.C7636a;
import p201o8.C7637b;
import p211p8.C7708a;
import p247t8.C8043a;
import p247t8.C8044b;
import p247t8.C8045c;
import p247t8.C8047e;
import p257u8.C8171a;
import p268v8.C8219a;

/* renamed from: com.cardinalcommerce.emvco.a.e.c */
public class C6260c extends C6270a {

    /* renamed from: a */
    private final C7208a f13727a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public char[] f13728b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SecretKey f13729c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public byte[] f13730d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7278a f13731e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final char[] f13732f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final char[] f13733g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final char[] f13734h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8045c f13735i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public char[] f13736j;

    /* renamed from: k */
    private C7492a f13737k;

    /* renamed from: com.cardinalcommerce.emvco.a.e.c$a */
    public class C6261a implements Runnable {
        public C6261a() {
        }

        public final void run() {
            C3039b.m7156Z(C6260c.this.f13728b);
            SecretKey unused = C6260c.this.f13729c = null;
            byte[] unused2 = C6260c.this.f13730d = null;
            C7278a unused3 = C6260c.this.f13731e;
            C7278a.f16135c = null;
            C7278a unused4 = C6260c.this.f13731e = null;
            C3039b.m7156Z(C6260c.this.f13732f);
            C3039b.m7156Z(C6260c.this.f13733g);
            C3039b.m7156Z(C6260c.this.f13734h);
            C8045c f = C6260c.this.f13735i;
            f.getClass();
            AsyncTask.execute(new C8043a(f));
            AsyncTask.execute(new C8044b(f));
            C8045c unused5 = C6260c.this.f13735i = null;
            C3039b.m7156Z(C6260c.this.f13736j);
        }
    }

    /* renamed from: com.cardinalcommerce.emvco.a.e.c$b */
    public static /* synthetic */ class C6262b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13739a;

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
                f13739a = r0
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13739a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.IO_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13739a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.PROTOCOL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13739a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.MALFORMED_URL_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13739a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.cardinalcommerce.shared.cs.b.a r1 = com.cardinalcommerce.shared.p065cs.p067b.C6266a.SOCKET_TIMEOUT_EXCEPTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.emvco.p063a.p064e.C6260c.C6262b.<clinit>():void");
        }
    }

    public C6260c(C7208a aVar, C7708a aVar2, C7155a aVar3, int i) {
        this.f13737k = C7492a.m14431g();
        C7278a.f16135c = null;
        C7278a a = C7278a.m13942a();
        this.f13731e = a;
        aVar3.getClass();
        a.f16137b = null;
        this.f13732f = C3039b.m7190y((String) null);
        throw null;
    }

    /* renamed from: a */
    private static String m12559a(JWEObject jWEObject, SecretKey secretKey, int i, int i2) {
        jWEObject.mo17683a((C6244i) new C6756a(Arrays.copyOfRange(secretKey.getEncoded(), i, i2)));
        return jWEObject.mo17712a().toString();
    }

    /* renamed from: a */
    private String m12560a(String str, SecretKey secretKey) {
        return m12573b(str, secretKey);
    }

    /* renamed from: a */
    private C8219a m12564a(C8047e eVar) {
        String str = eVar.f17570f;
        return new C8219a(eVar.f17565a, eVar.f17566b);
    }

    /* renamed from: b */
    private String m12573b(String str, SecretKey secretKey) {
        return m12559a(JWEObject.m12462b(str), secretKey, 16, 32);
    }

    /* renamed from: b */
    private void m12575b() {
        C8045c cVar = this.f13735i;
        if (cVar != null) {
            AsyncTask.execute(new C8043a(cVar));
        }
    }

    /* renamed from: b */
    private void m12579b(String str) {
        if (!m12585c(str)) {
            m12565a(new C6272b(m12560a(str, this.f13729c)));
        } else {
            m12568a(new JSONObject(str));
        }
    }

    /* renamed from: b */
    private void m12580b(C8047e eVar) {
        char[] cArr = this.f13728b;
        if (cArr != null && cArr.length > 0) {
            new C6264e(eVar, new String(cArr)).execute(new Void[0]);
        }
    }

    /* renamed from: b */
    private void m12581b(C8219a aVar) {
        new String(this.f13732f);
        this.f13727a.mo17849a("ProtocolError", new C7636a());
    }

    /* renamed from: b */
    private byte[] m12582b(JSONObject jSONObject) {
        return m12586c(jSONObject);
    }

    /* renamed from: c */
    private void m12583c() {
        this.f13727a.mo17849a("CancelTimeout", (C15588c1) null);
    }

    /* renamed from: c */
    private void m12584c(C6272b bVar) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "102";
        eVar.f17566b = "Message Version Number received is not valid for the receiving component.";
        eVar.f17567c = new String(this.f13731e.f16137b);
        eVar.mo20605a(bVar);
        m12580b(eVar);
        m12581b(m12564a(eVar));
    }

    /* renamed from: c */
    private boolean m12585c(String str) {
        return str.replaceAll("[\\s|\\u00A0]+", "").contains("\"messageType\":\"Erro\"");
    }

    /* renamed from: d */
    private void m12588d() {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "402";
        eVar.f17566b = "Transaction Timed Out";
        eVar.f17567c = "For example, a slowly processing back-end system.";
        eVar.f17570f = new String(this.f13733g);
        eVar.f17571g = new String(this.f13734h);
        eVar.f17569e = new String(this.f13732f);
        m12580b(eVar);
        m12570a(m12564a(eVar));
    }

    /* renamed from: e */
    private void m12591e(String str) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "101";
        eVar.f17566b = str;
        eVar.f17567c = "CRes";
        eVar.f17570f = new String(this.f13733g);
        eVar.f17571g = new String(this.f13734h);
        eVar.f17569e = new String(this.f13732f);
        m12570a(m12564a(eVar));
    }

    /* renamed from: a */
    public void mo17762a() {
        AsyncTask.execute(new C6261a());
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
        this.f13737k.mo19849i(String.valueOf(i), str);
        super.mo17214a(str, i);
        m12591e("ACS not reachable");
        this.f13737k.mo19848h("Challenge Task finished");
        m12575b();
    }

    public void onPreExecute() {
        super.onPreExecute();
        if (C3039b.m7186u(this.f13736j)) {
            return;
        }
        if (Arrays.equals(this.f13736j, C8171a.f17933f) || Arrays.equals(this.f13736j, C8171a.f17934g)) {
            m12583c();
        }
    }

    /* renamed from: b */
    private void m12576b(C6272b bVar) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "202";
        eVar.f17566b = "Critical message extension not recognised.";
        eVar.f17567c = bVar.f13764c;
        eVar.mo20605a(bVar);
        m12580b(eVar);
        m12581b(m12564a(eVar));
    }

    public C6260c(C7208a aVar, C8045c cVar) {
        this.f13731e = C7278a.m13942a();
        this.f13737k = C7492a.m14431g();
        this.f13735i = cVar;
        this.f13731e.getClass();
        this.f13727a = aVar;
        throw null;
    }

    /* renamed from: a */
    private void m12565a(C6272b bVar) {
        String str;
        if (!bVar.mo17785p().equals("CRes")) {
            C7492a aVar = this.f13737k;
            aVar.getClass();
            aVar.mo19849i(String.valueOf(12101), "Error 101 Created: Message Description Invalid");
            m12589d("Message is not CRes");
        } else if (!C19421p.m32954s(bVar).mo17805a()) {
            C7492a aVar2 = this.f13737k;
            aVar2.getClass();
            aVar2.mo19849i(String.valueOf(12201), "Error 201 Created: Required data element missing");
            m12566a(bVar, C19421p.m32954s(bVar));
        } else if (!C8171a.f17929b.contains(bVar.mo17786q())) {
            C7492a aVar3 = this.f13737k;
            aVar3.getClass();
            aVar3.mo19849i(String.valueOf(12102), "Error 102 Created: Invalid Message Version");
            m12584c(bVar);
        } else if (bVar.f13763b) {
            C7492a aVar4 = this.f13737k;
            aVar4.getClass();
            aVar4.mo19849i(String.valueOf(12202), "Error 202 Created: SDK is Critical");
            m12576b(bVar);
        } else if (!bVar.f13762a.mo17805a()) {
            m12577b(bVar, bVar.f13762a);
        } else {
            if (!bVar.mo17770a().equals(new String(this.f13733g))) {
                C7492a aVar5 = this.f13737k;
                aVar5.getClass();
                aVar5.mo19849i(String.valueOf(12301), "Error 301 Created: Invalid ThreeDSServerTransID");
                str = "ThreeDSServerTransID";
            } else if (!bVar.mo17771b().equals(new String(this.f13734h))) {
                C7492a aVar6 = this.f13737k;
                aVar6.getClass();
                aVar6.mo19849i(String.valueOf(12301), "Error 301 Created: Invalid AcsTransId");
                str = "AcsTransId";
            } else if (!bVar.mo17790u().equalsIgnoreCase(new String(this.f13732f))) {
                C7492a aVar7 = this.f13737k;
                aVar7.getClass();
                aVar7.mo19849i(String.valueOf(12301), "Error 301 Created: Invalid SdkTransactionID");
                str = "sdkTransactionID";
            } else if (Integer.parseInt(bVar.mo17795z()) != this.f13731e.f16136a - 1) {
                C7492a aVar8 = this.f13737k;
                aVar8.getClass();
                aVar8.mo19849i(String.valueOf(12302), "Error 302 Created: Data could not be decrypted");
                m12567a(bVar, "AcsCounterAtoS");
                return;
            } else {
                this.f13727a.mo17848a(bVar);
                return;
            }
            m12578b(bVar, str);
        }
    }

    /* renamed from: b */
    private void m12577b(C6272b bVar, C6276i iVar) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "203";
        eVar.f17566b = "Data element not in the required format or value is invalid as defined in Table A.1,";
        eVar.f17567c = iVar.mo17806b();
        eVar.mo20605a(bVar);
        m12580b(eVar);
        m12581b(m12564a(eVar));
        C7492a aVar = this.f13737k;
        StringBuilder h = C0072d.m201h("Error 203 Created: \n");
        h.append(eVar.f17566b);
        h.append(" - ");
        h.append(eVar.f17567c);
        String sb = h.toString();
        aVar.getClass();
        aVar.mo19849i(String.valueOf(12203), sb);
    }

    /* renamed from: c */
    private byte[] m12586c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            int i = this.f13731e.f16136a;
            byte parseByte = Byte.parseByte("" + i);
            JWEAlgorithm jWEAlgorithm = JWEAlgorithm.f13581h;
            EncryptionMethod encryptionMethod = EncryptionMethod.f13571g;
            if (jWEAlgorithm.mo17701a().equals(C6236a.f13635a.mo17701a())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            } else if (encryptionMethod != null) {
                JWEHeader jWEHeader = r4;
                JWEHeader jWEHeader2 = new JWEHeader(jWEAlgorithm, encryptionMethod, (C6241f) null, (String) null, (Set<String>) null, (URI) null, (JWK) null, (URI) null, (Base64URL) null, (Base64URL) null, (List<Base64>) null, (String) jSONObject2.get("acsTransID"), (JWK) null, (C6238c) null, (Base64URL) null, (Base64URL) null, (Base64URL) null, 0, (Base64URL) null, (Base64URL) null, (Map<String, Object>) null, (Base64URL) null);
                jSONObject2.put("sdkCounterStoA", String.format("%03d", new Object[]{Byte.valueOf(parseByte)}));
                JWEObject jWEObject = new JWEObject(jWEHeader, new Payload(jSONObject.toString()));
                jWEObject.mo17684a((C6253k) new C6998a(Arrays.copyOfRange(this.f13729c.getEncoded(), 0, 16), parseByte));
                byte[] bytes = jWEObject.mo17691h().getBytes();
                int i2 = i + 1;
                if (i2 != 0) {
                    this.f13731e.f16136a = i2;
                    return bytes;
                }
                throw new RuntimeException("SdkCounterStoA zero");
            } else {
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
        } catch (Exception e) {
            C7492a aVar = this.f13737k;
            StringBuilder h = C0072d.m201h("JWE Encryption Failed \n");
            h.append(e.getLocalizedMessage());
            String sb = h.toString();
            aVar.getClass();
            aVar.mo19849i(String.valueOf(11418), sb);
            return jSONObject.toString().getBytes();
        }
    }

    /* renamed from: d */
    private void m12589d(String str) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "101";
        eVar.f17566b = str;
        eVar.f17567c = "CRes";
        eVar.f17570f = new String(this.f13733g);
        eVar.f17571g = new String(this.f13734h);
        eVar.f17569e = new String(this.f13732f);
        m12580b(eVar);
        m12581b(m12564a(eVar));
    }

    /* renamed from: a */
    private void m12566a(C6272b bVar, C6276i iVar) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "201";
        eVar.f17566b = "A message element required as defined in Table A.1 is missing from the message.";
        eVar.f17567c = iVar.mo17806b();
        eVar.mo20605a(bVar);
        m12580b(eVar);
        m12581b(m12564a(eVar));
    }

    /* renamed from: b */
    private void m12578b(C6272b bVar, String str) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "301";
        eVar.f17566b = "Transaction ID received is not valid for the receiving component.";
        eVar.f17567c = str;
        eVar.mo20605a(bVar);
        m12580b(eVar);
        m12581b(m12564a(eVar));
    }

    /* renamed from: a */
    private void m12567a(C6272b bVar, String str) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "302";
        eVar.f17566b = "Data could not be decrypted by the receiving system due to technical or other reason.";
        eVar.f17567c = str;
        eVar.mo20605a(bVar);
        m12580b(eVar);
        m12581b(m12564a(eVar));
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
        super.mo17212a(exc, aVar);
        int i = C6262b.f13739a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            C7492a aVar2 = this.f13737k;
            StringBuilder h = C0072d.m201h("Error 101 Created: Message is not CRes \n");
            h.append(exc.getLocalizedMessage());
            String sb = h.toString();
            aVar2.getClass();
            aVar2.mo19849i(String.valueOf(12101), sb);
            m12591e("Invalid Formatted Message");
        } else if (i == 3 || i == 4 || i == 5) {
            m12588d();
        }
        this.f13737k.mo19848h("Challenge Task finished");
        m12575b();
    }

    /* renamed from: a */
    public void mo17213a(String str) {
        String str2;
        if (!C3039b.m7186u(this.f13736j)) {
            return;
        }
        if (!Arrays.equals(this.f13736j, C8171a.f17933f) || !Arrays.equals(this.f13736j, C8171a.f17934g)) {
            try {
                if (str.isEmpty()) {
                    m12589d("Message is not CRes");
                } else {
                    m12579b(str);
                }
            } catch (JOSEException e) {
                e = e;
                C7492a aVar = this.f13737k;
                aVar.getClass();
                aVar.mo19849i(String.valueOf(12101), "Error 101 Created: Error Decrypting response" + e.getLocalizedMessage());
                str2 = "Invalid Message from the ACS";
            } catch (ParseException e2) {
                e = e2;
                C7492a aVar2 = this.f13737k;
                aVar2.getClass();
                aVar2.mo19849i(String.valueOf(12101), "Error 101 Created: Error Decrypting response" + e.getLocalizedMessage());
                str2 = "Invalid Message from the ACS";
            } catch (JSONException e3) {
                C7492a aVar3 = this.f13737k;
                aVar3.getClass();
                aVar3.mo19849i(String.valueOf(12101), "Error 101 Created: Response is in invalid format" + e3.getLocalizedMessage());
                str2 = "Invalid Formatted Message";
            } catch (Throwable th) {
                this.f13737k.mo19848h("Challenge Task finished");
                m12575b();
                throw th;
            }
            this.f13737k.mo19848h("Challenge Task finished");
            m12575b();
        }
        return;
        m12589d(str2);
        this.f13737k.mo19848h("Challenge Task finished");
        m12575b();
    }

    /* renamed from: a */
    private void m12568a(JSONObject jSONObject) {
        String optString = jSONObject.optString("errorCode", "");
        if (!optString.isEmpty()) {
            String optString2 = jSONObject.optString("errorDescription", "");
            String optString3 = jSONObject.optString("errorDetail", "");
            C8047e eVar = new C8047e(new String(this.f13731e.f16137b));
            eVar.f17565a = optString;
            eVar.f17566b = optString2;
            eVar.f17567c = optString3;
            m12581b(m12564a(eVar));
            return;
        }
        C7492a aVar = this.f13737k;
        aVar.getClass();
        aVar.mo19849i(String.valueOf(12101), "Error 101 Created: Message is not CRes - Challenge Decrypted CardinalError");
        m12591e(C0326j.m864i("Message is not CRes ", jSONObject.optString("errorDescription", "Challenge Decrypted CardinalError")));
    }

    /* renamed from: a */
    private void m12569a(C8045c cVar) {
        C8047e eVar = new C8047e(this.f13731e.f16137b);
        eVar.f17565a = "203";
        eVar.f17566b = "Data element not in the required format or value is invalid as defined in Table A.1,";
        eVar.f17567c = cVar.f17542b.mo17806b();
        eVar.f17571g = Arrays.toString(cVar.f17544d);
        eVar.f17570f = Arrays.toString(cVar.f17543c);
        eVar.f17569e = Arrays.toString(cVar.f17552l);
        m12580b(eVar);
        m12581b(m12564a(eVar));
        C7492a aVar = this.f13737k;
        StringBuilder h = C0072d.m201h("Error 203 Created: \n");
        h.append(eVar.f17566b);
        h.append(" - ");
        h.append(eVar.f17567c);
        String sb = h.toString();
        aVar.getClass();
        aVar.mo19849i(String.valueOf(12203), sb);
    }

    /* renamed from: a */
    private void m12570a(C8219a aVar) {
        String str = aVar.f18045a;
        this.f13727a.mo17849a("RunTimeError", new C7637b());
    }
}
