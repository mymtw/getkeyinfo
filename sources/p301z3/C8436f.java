package p301z3;

import com.braze.models.inappmessage.C5483a;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p030bo.app.C4173s2;
import p030bo.app.C4275x2;

/* renamed from: z3.f */
public final class C8436f {

    /* renamed from: a */
    public final C4173s2 f18451a;

    /* renamed from: b */
    public final C4275x2 f18452b;

    /* renamed from: c */
    public final C5483a f18453c;

    /* renamed from: d */
    public final String f18454d;

    public C8436f(C4173s2 s2Var, C4275x2 x2Var, C5483a aVar, String str) {
        C19383o.m32797g(s2Var, "triggerEvent");
        C19383o.m32797g(x2Var, "triggerAction");
        C19383o.m32797g(aVar, "inAppMessage");
        this.f18451a = s2Var;
        this.f18452b = x2Var;
        this.f18453c = aVar;
        this.f18454d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8436f)) {
            return false;
        }
        C8436f fVar = (C8436f) obj;
        return C19383o.m32792b(this.f18451a, fVar.f18451a) && C19383o.m32792b(this.f18452b, fVar.f18452b) && C19383o.m32792b(this.f18453c, fVar.f18453c) && C19383o.m32792b(this.f18454d, fVar.f18454d);
    }

    public final int hashCode() {
        int hashCode = (this.f18453c.hashCode() + ((this.f18452b.hashCode() + (this.f18451a.hashCode() * 31)) * 31)) * 31;
        String str = this.f18454d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonUtils.m11315f((JSONObject) this.f18453c.forJsonPut());
    }
}
