package p030bo.app;

import com.appboy.Constants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: bo.app.e4 */
public final class C3649e4 extends C3787j {

    /* renamed from: k */
    public static final C3650a f8376k = new C3650a((DefaultConstructorMarker) null);

    /* renamed from: j */
    private final boolean f8377j;

    /* renamed from: bo.app.e4$a */
    public static final class C3650a {
        private C3650a() {
        }

        public /* synthetic */ C3650a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4208t1 mo13257a(String str, String str2, String str3) {
            C19383o.m32797g(str, "campaignId");
            C19383o.m32797g(str2, "actionId");
            C19383o.m32797g(str3, "actionType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
            jSONObject.put(Constants.APPBOY_PUSH_CONTENT_KEY, str2);
            return new C3649e4(C3600c1.PUSH_ACTION_BUTTON_CLICKED, jSONObject, str3, (DefaultConstructorMarker) null);
        }
    }

    private C3649e4(C3600c1 c1Var, JSONObject jSONObject, String str) {
        super(c1Var, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
        this.f8377j = C19383o.m32792b(str, Constants.APPBOY_PUSH_ACTION_TYPE_NONE);
    }

    public /* synthetic */ C3649e4(C3600c1 c1Var, JSONObject jSONObject, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, jSONObject, str);
    }

    /* renamed from: x */
    public final boolean mo13256x() {
        return this.f8377j;
    }
}
