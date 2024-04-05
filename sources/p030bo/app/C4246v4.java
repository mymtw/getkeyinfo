package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.v4 */
public final class C4246v4 {

    /* renamed from: e */
    public static final C4247a f9391e = new C4247a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f9392a;

    /* renamed from: b */
    private final String f9393b;

    /* renamed from: c */
    private final String f9394c;

    /* renamed from: d */
    private final SharedPreferences f9395d;

    /* renamed from: bo.app.v4$a */
    public static final class C4247a {
        private C4247a() {
        }

        public /* synthetic */ C4247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.v4$b */
    public static final class C4248b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9396b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4248b(String str) {
            super(0);
            this.f9396b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9396b, "Setting signature to: ");
        }
    }

    public C4246v4(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f9392a = context;
        this.f9393b = str;
        this.f9394c = str2;
        this.f9395d = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.braze.storage.sdk_auth_cache"), 0);
    }

    /* renamed from: a */
    public final String mo14134a() {
        return this.f9395d.getString("auth_signature", (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4246v4)) {
            return false;
        }
        C4246v4 v4Var = (C4246v4) obj;
        return C19383o.m32792b(this.f9392a, v4Var.f9392a) && C19383o.m32792b(this.f9393b, v4Var.f9393b) && C19383o.m32792b(this.f9394c, v4Var.f9394c);
    }

    public int hashCode() {
        int hashCode = this.f9392a.hashCode() * 31;
        String str = this.f9393b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9394c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SdkAuthenticationCache(context=");
        h.append(this.f9392a);
        h.append(", userId=");
        h.append(this.f9393b);
        h.append(", apiKey=");
        h.append(this.f9394c);
        h.append(')');
        return h.toString();
    }

    /* renamed from: a */
    public final void mo14135a(String str) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4248b(str), 6);
        this.f9395d.edit().putString("auth_signature", str).apply();
    }
}
