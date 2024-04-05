package p247t8;

import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import org.json.JSONObject;

/* renamed from: t8.e */
public final class C8047e {

    /* renamed from: a */
    public String f17565a;

    /* renamed from: b */
    public String f17566b;

    /* renamed from: c */
    public String f17567c;

    /* renamed from: d */
    public String f17568d;

    /* renamed from: e */
    public String f17569e = "";

    /* renamed from: f */
    public String f17570f = "";

    /* renamed from: g */
    public String f17571g = "";

    public C8047e(String str) {
        this.f17568d = str;
    }

    public C8047e(char[] cArr) {
        this.f17568d = new String(cArr);
    }

    /* renamed from: a */
    public final void mo20605a(C6272b bVar) {
        this.f17571g = bVar.mo17771b();
        this.f17570f = bVar.mo17770a();
        this.f17569e = bVar.mo17790u();
    }

    /* renamed from: b */
    public final JSONObject mo20606b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("errorCode", this.f17565a);
        jSONObject.putOpt("errorComponent", "C");
        jSONObject.putOpt("errorDescription", this.f17566b);
        jSONObject.putOpt("errorDetail", this.f17567c);
        jSONObject.putOpt("errorMessageType", "CRes");
        jSONObject.putOpt("messageType", "Erro");
        jSONObject.putOpt("messageVersion", this.f17568d);
        jSONObject.putOpt("sdkTransID", this.f17569e);
        jSONObject.putOpt("threeDSServerTransID", this.f17570f);
        jSONObject.putOpt("acsTransID", this.f17571g);
        return jSONObject;
    }
}
