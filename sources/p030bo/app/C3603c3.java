package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19453g;
import org.json.JSONObject;

/* renamed from: bo.app.c3 */
public final class C3603c3 {

    /* renamed from: a */
    private final C4173s2 f8298a;

    /* renamed from: b */
    private final C4275x2 f8299b;

    /* renamed from: c */
    private final C5483a f8300c;

    /* renamed from: d */
    private final String f8301d;

    public C3603c3(C4173s2 s2Var, C4275x2 x2Var, C5483a aVar, String str) {
        C19383o.m32797g(s2Var, "triggerEvent");
        C19383o.m32797g(x2Var, "triggeredAction");
        C19383o.m32797g(aVar, "inAppMessage");
        this.f8298a = s2Var;
        this.f8299b = x2Var;
        this.f8300c = aVar;
        this.f8301d = str;
    }

    /* renamed from: a */
    public final C4173s2 mo13157a() {
        return this.f8298a;
    }

    /* renamed from: b */
    public final C4275x2 mo13158b() {
        return this.f8299b;
    }

    /* renamed from: c */
    public final C5483a mo13159c() {
        return this.f8300c;
    }

    /* renamed from: d */
    public final String mo13160d() {
        return this.f8301d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3603c3)) {
            return false;
        }
        C3603c3 c3Var = (C3603c3) obj;
        return C19383o.m32792b(this.f8298a, c3Var.f8298a) && C19383o.m32792b(this.f8299b, c3Var.f8299b) && C19383o.m32792b(this.f8300c, c3Var.f8300c) && C19383o.m32792b(this.f8301d, c3Var.f8301d);
    }

    public int hashCode() {
        int hashCode = (this.f8300c.hashCode() + ((this.f8299b.hashCode() + (this.f8298a.hashCode() * 31)) * 31)) * 31;
        String str = this.f8301d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\n             ");
        h.append(JsonUtils.m11315f((JSONObject) this.f8300c.forJsonPut()));
        h.append("\n             Triggered Action Id: ");
        h.append(this.f8299b.getId());
        h.append("\n             Trigger Event: ");
        h.append(this.f8298a);
        h.append("\n             User Id: ");
        h.append(this.f8301d);
        h.append("\n        ");
        return C19453g.m33013Q0(h.toString());
    }
}
