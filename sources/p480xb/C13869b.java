package p480xb;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.wallet.PaymentData;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;

/* renamed from: xb.b */
public final class C13869b {

    /* renamed from: a */
    public final String f30521a;

    /* renamed from: b */
    public final String f30522b;

    /* renamed from: c */
    public final String f30523c;

    /* renamed from: d */
    public final String f30524d;

    /* renamed from: e */
    public final String f30525e;

    /* renamed from: f */
    public final C13871c f30526f;

    /* renamed from: g */
    public final String f30527g;

    /* renamed from: h */
    public final String f30528h;

    /* renamed from: i */
    public final C13868a f30529i;

    /* renamed from: xb.b$a */
    public static final class C13870a {
        /* renamed from: a */
        public static C13869b m21399a(PaymentData paymentData) throws JSONException {
            String str;
            C13868a aVar;
            C19383o.m32797g(paymentData, "paymentData");
            String json = paymentData.toJson();
            if (json == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(json).getJSONObject("paymentMethodData");
            String string = jSONObject.getString("description");
            C19383o.m32796f(string, "paymentMethodData.getString(\"description\")");
            String string2 = jSONObject.getString("type");
            C19383o.m32796f(string2, "paymentMethodData.getString(\"type\")");
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
            String string3 = jSONObject2.getString("type");
            C19383o.m32796f(string3, "tokenizationData.getString(\"type\")");
            JSONObject jSONObject3 = new JSONObject(jSONObject2.getString(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN));
            String string4 = jSONObject3.getString("signature");
            C19383o.m32796f(string4, "token.getString(\"signature\")");
            String string5 = jSONObject3.getString("protocolVersion");
            C19383o.m32796f(string5, "token.getString(\"protocolVersion\")");
            String string6 = jSONObject3.getString("signedMessage");
            C19383o.m32796f(string6, "tokenSignedMessageJSON");
            JSONObject jSONObject4 = new JSONObject(string6);
            String string7 = jSONObject4.getString("encryptedMessage");
            C19383o.m32796f(string7, "rootObj.getString(\"encryptedMessage\")");
            String string8 = jSONObject4.getString("ephemeralPublicKey");
            C19383o.m32796f(string8, "rootObj.getString(\"ephemeralPublicKey\")");
            String string9 = jSONObject4.getString("tag");
            C19383o.m32796f(string9, "rootObj.getString(\"tag\")");
            C13871c cVar = new C13871c(string7, string8, string9);
            JSONObject jSONObject5 = jSONObject.getJSONObject("info");
            String string10 = jSONObject5.getString("cardNetwork");
            C19383o.m32796f(string10, "info.getString(\"cardNetwork\")");
            String string11 = jSONObject5.getString("cardDetails");
            C19383o.m32796f(string11, "info.getString(\"cardDetails\")");
            JSONObject optJSONObject = jSONObject5.optJSONObject("billingAddress");
            if (optJSONObject != null) {
                String string12 = optJSONObject.getString("name");
                C19383o.m32796f(string12, "rootObj.getString(\"name\")");
                String string13 = optJSONObject.getString("address1");
                C19383o.m32796f(string13, "rootObj.getString(\"address1\")");
                String string14 = optJSONObject.getString("address2");
                C19383o.m32796f(string14, "rootObj.getString(\"address2\")");
                String string15 = optJSONObject.getString("address3");
                C19383o.m32796f(string15, "rootObj.getString(\"address3\")");
                String string16 = optJSONObject.getString("postalCode");
                C19383o.m32796f(string16, "rootObj.getString(\"postalCode\")");
                String string17 = optJSONObject.getString("sortingCode");
                C19383o.m32796f(string17, "rootObj.getString(\"sortingCode\")");
                String string18 = optJSONObject.getString("locality");
                str = string11;
                C19383o.m32796f(string18, "rootObj.getString(\"locality\")");
                String string19 = optJSONObject.getString("administrativeArea");
                C19383o.m32796f(string19, "rootObj.getString(\"administrativeArea\")");
                String string20 = optJSONObject.getString("countryCode");
                C19383o.m32796f(string20, "rootObj.getString(\"countryCode\")");
                aVar = new C13868a(string12, string13, string14, string15, string16, string17, string18, string19, string20);
            } else {
                str = string11;
                aVar = null;
            }
            return new C13869b(string, string2, string3, string4, string5, cVar, string10, str, aVar);
        }
    }

    public C13869b(String str, String str2, String str3, String str4, String str5, C13871c cVar, String str6, String str7, C13868a aVar) {
        this.f30521a = str;
        this.f30522b = str2;
        this.f30523c = str3;
        this.f30524d = str4;
        this.f30525e = str5;
        this.f30526f = cVar;
        this.f30527g = str6;
        this.f30528h = str7;
        this.f30529i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13869b)) {
            return false;
        }
        C13869b bVar = (C13869b) obj;
        return C19383o.m32792b(this.f30521a, bVar.f30521a) && C19383o.m32792b(this.f30522b, bVar.f30522b) && C19383o.m32792b(this.f30523c, bVar.f30523c) && C19383o.m32792b(this.f30524d, bVar.f30524d) && C19383o.m32792b(this.f30525e, bVar.f30525e) && C19383o.m32792b(this.f30526f, bVar.f30526f) && C19383o.m32792b(this.f30527g, bVar.f30527g) && C19383o.m32792b(this.f30528h, bVar.f30528h) && C19383o.m32792b(this.f30529i, bVar.f30529i);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f30528h, C0023f.m105e(this.f30527g, (this.f30526f.hashCode() + C0023f.m105e(this.f30525e, C0023f.m105e(this.f30524d, C0023f.m105e(this.f30523c, C0023f.m105e(this.f30522b, this.f30521a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31);
        C13868a aVar = this.f30529i;
        return e + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ParsedPaymentData(cardDescription=");
        h.append(this.f30521a);
        h.append(", type=");
        h.append(this.f30522b);
        h.append(", tokenType=");
        h.append(this.f30523c);
        h.append(", tokenSignature=");
        h.append(this.f30524d);
        h.append(", tokenProtocol=");
        h.append(this.f30525e);
        h.append(", signedMessage=");
        h.append(this.f30526f);
        h.append(", infoCardNetwork=");
        h.append(this.f30527g);
        h.append(", infoCardDetails=");
        h.append(this.f30528h);
        h.append(", infoCardBillingAddress=");
        h.append(this.f30529i);
        h.append(')');
        return h.toString();
    }
}
