package p651po;

import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth;
import java.util.Map;

/* renamed from: po.a */
public final class C18420a {

    /* renamed from: a */
    public String f40511a;

    /* renamed from: b */
    public String f40512b = "nativexo://paypalpay";

    /* renamed from: c */
    public String f40513c;

    /* renamed from: d */
    public String f40514d;

    /* renamed from: e */
    public String f40515e;

    /* renamed from: f */
    public Map<String, String> f40516f;

    public C18420a(C18421b bVar) {
        this.f40511a = bVar.f40517a;
        this.f40513c = bVar.f40518b;
        this.f40515e = ThirdPartyAuth.NATIVEXO_SCOPES;
        this.f40514d = bVar.f40519c;
        this.f40516f = bVar.f40520d;
    }
}
