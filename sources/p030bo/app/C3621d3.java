package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p003a2.C0023f;

/* renamed from: bo.app.d3 */
public final class C3621d3 {

    /* renamed from: h */
    public static final C3622a f8330h = new C3622a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Integer f8331a;

    /* renamed from: b */
    private final Integer f8332b;

    /* renamed from: c */
    private final Integer f8333c;

    /* renamed from: d */
    private final Integer f8334d;

    /* renamed from: e */
    private final Integer f8335e;

    /* renamed from: f */
    private final Integer f8336f;

    /* renamed from: g */
    private final Integer f8337g;

    /* renamed from: bo.app.d3$a */
    public static final class C3622a {
        private C3622a() {
        }

        public /* synthetic */ C3622a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C3621d3(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f8331a = num;
        this.f8332b = num2;
        this.f8333c = num3;
        this.f8334d = num4;
        this.f8335e = num5;
        this.f8336f = num6;
        this.f8337g = num7;
    }

    /* renamed from: a */
    public final Integer mo13197a() {
        return this.f8331a;
    }

    /* renamed from: b */
    public final Integer mo13198b() {
        return this.f8333c;
    }

    /* renamed from: c */
    public final Integer mo13199c() {
        return this.f8337g;
    }

    /* renamed from: d */
    public final Integer mo13200d() {
        return this.f8336f;
    }

    /* renamed from: e */
    public final Integer mo13201e() {
        return this.f8335e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3621d3)) {
            return false;
        }
        C3621d3 d3Var = (C3621d3) obj;
        return C19383o.m32792b(this.f8331a, d3Var.f8331a) && C19383o.m32792b(this.f8332b, d3Var.f8332b) && C19383o.m32792b(this.f8333c, d3Var.f8333c) && C19383o.m32792b(this.f8334d, d3Var.f8334d) && C19383o.m32792b(this.f8335e, d3Var.f8335e) && C19383o.m32792b(this.f8336f, d3Var.f8336f) && C19383o.m32792b(this.f8337g, d3Var.f8337g);
    }

    /* renamed from: f */
    public final Integer mo13203f() {
        return this.f8334d;
    }

    /* renamed from: g */
    public final Integer mo13204g() {
        return this.f8332b;
    }

    public int hashCode() {
        Integer num = this.f8331a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f8332b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f8333c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f8334d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f8335e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f8336f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f8337g;
        if (num7 != null) {
            i = num7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InAppMessageTheme(backgroundColor=");
        h.append(this.f8331a);
        h.append(", textColor=");
        h.append(this.f8332b);
        h.append(", closeButtonColor=");
        h.append(this.f8333c);
        h.append(", iconColor=");
        h.append(this.f8334d);
        h.append(", iconBackgroundColor=");
        h.append(this.f8335e);
        h.append(", headerTextColor=");
        h.append(this.f8336f);
        h.append(", frameColor=");
        return C0023f.m109j(h, this.f8337g, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3621d3(JSONObject jSONObject) {
        this(JsonUtils.m11313d("bg_color", jSONObject), JsonUtils.m11313d(ResponseConstants.TEXT_COLOR, jSONObject), JsonUtils.m11313d("close_btn_color", jSONObject), JsonUtils.m11313d("icon_color", jSONObject), JsonUtils.m11313d("icon_bg_color", jSONObject), JsonUtils.m11313d("header_text_color", jSONObject), JsonUtils.m11313d("frame_color", jSONObject));
        C19383o.m32797g(jSONObject, "messageThemeJson");
    }
}
