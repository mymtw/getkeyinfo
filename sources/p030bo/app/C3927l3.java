package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p003a2.C0023f;

/* renamed from: bo.app.l3 */
public final class C3927l3 {

    /* renamed from: d */
    public static final C3928a f8831d = new C3928a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Integer f8832a;

    /* renamed from: b */
    private final Integer f8833b;

    /* renamed from: c */
    private final Integer f8834c;

    /* renamed from: bo.app.l3$a */
    public static final class C3928a {
        private C3928a() {
        }

        public /* synthetic */ C3928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C3927l3(Integer num, Integer num2, Integer num3) {
        this.f8832a = num;
        this.f8833b = num2;
        this.f8834c = num3;
    }

    /* renamed from: a */
    public final Integer mo13661a() {
        return this.f8832a;
    }

    /* renamed from: b */
    public final Integer mo13662b() {
        return this.f8834c;
    }

    /* renamed from: c */
    public final Integer mo13663c() {
        return this.f8833b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3927l3)) {
            return false;
        }
        C3927l3 l3Var = (C3927l3) obj;
        return C19383o.m32792b(this.f8832a, l3Var.f8832a) && C19383o.m32792b(this.f8833b, l3Var.f8833b) && C19383o.m32792b(this.f8834c, l3Var.f8834c);
    }

    public int hashCode() {
        Integer num = this.f8832a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f8833b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f8834c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("MessageButtonTheme(backgroundColor=");
        h.append(this.f8832a);
        h.append(", textColor=");
        h.append(this.f8833b);
        h.append(", borderColor=");
        return C0023f.m109j(h, this.f8834c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3927l3(JSONObject jSONObject) {
        this(JsonUtils.m11313d("bg_color", jSONObject), JsonUtils.m11313d(ResponseConstants.TEXT_COLOR, jSONObject), JsonUtils.m11313d("border_color", jSONObject));
        C19383o.m32797g(jSONObject, "buttonThemeJson");
    }
}
