package p127h5;

import android.util.Base64;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.C19382n;
import org.json.JSONObject;

/* renamed from: h5.a */
public final class C6954a {

    /* renamed from: a */
    public int f15426a;

    /* renamed from: b */
    public String f15427b;

    /* renamed from: c */
    public boolean f15428c;

    /* renamed from: d */
    public String f15429d;

    /* renamed from: e */
    public String f15430e;

    /* renamed from: f */
    public ValidateResponse f15431f;

    /* renamed from: g */
    public C6272b f15432g;

    public C6954a(String str) {
        String optString = new JSONObject(C19382n.m32758m(str)).optString("Payload", "");
        if (optString != null && !optString.equalsIgnoreCase("")) {
            JSONObject jSONObject = new JSONObject(optString);
            this.f15428c = jSONObject.optBoolean("Successful", false);
            this.f15426a = jSONObject.optInt("ErrorNumber", 0);
            this.f15427b = jSONObject.optString("ErrorDescription", "");
            String optString2 = jSONObject.optString("CRes", "");
            this.f15429d = optString2;
            if (optString2 != null && !optString2.equalsIgnoreCase("")) {
                this.f15432g = new C6272b(new String(Base64.decode(this.f15429d, 0), StandardCharsets.UTF_8));
            }
            String optString3 = jSONObject.optString("ValidateResponse", "");
            this.f15430e = optString3;
            if (optString3 != null && !optString3.equalsIgnoreCase("")) {
                this.f15431f = new ValidateResponse(this.f15430e);
            }
        }
    }
}
