package p350fe;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

/* renamed from: fe.b */
public final class C12725b {

    /* renamed from: a */
    public final JSONObject f28044a;

    /* renamed from: b */
    public final Bundle f28045b;

    /* renamed from: c */
    public final Bundle f28046c;

    public C12725b() {
        this((JSONObject) null, (Bundle) null, (Bundle) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12725b)) {
            return false;
        }
        C12725b bVar = (C12725b) obj;
        return C19383o.m32792b(this.f28044a, bVar.f28044a) && C19383o.m32792b(this.f28045b, bVar.f28045b) && C19383o.m32792b(this.f28046c, bVar.f28046c);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.f28044a;
        int i = 0;
        int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        Bundle bundle = this.f28045b;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Bundle bundle2 = this.f28046c;
        if (bundle2 != null) {
            i = bundle2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DeepLinkErrorInfo(params=");
        h.append(this.f28044a);
        h.append(", intentExtras=");
        h.append(this.f28045b);
        h.append(", referralArgs=");
        h.append(this.f28046c);
        h.append(')');
        return h.toString();
    }

    public C12725b(JSONObject jSONObject, Bundle bundle, Bundle bundle2) {
        this.f28044a = jSONObject;
        this.f28045b = bundle;
        this.f28046c = bundle2;
    }
}
