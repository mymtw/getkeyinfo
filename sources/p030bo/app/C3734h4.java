package p030bo.app;

import com.appboy.Constants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: bo.app.h4 */
public final class C3734h4 extends C3787j {

    /* renamed from: j */
    public static final C3735a f8521j = new C3735a((DefaultConstructorMarker) null);

    private C3734h4(C3600c1 c1Var, JSONObject jSONObject) {
        super(c1Var, jSONObject, (double) ShadowDrawableWrapper.COS_45, (String) null, 12, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ C3734h4(C3600c1 c1Var, JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, jSONObject);
    }

    /* renamed from: bo.app.h4$a */
    public static final class C3735a {
        private C3735a() {
        }

        public /* synthetic */ C3735a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3734h4 mo13385a(String str) {
            C19383o.m32797g(str, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
            return new C3734h4(C3600c1.PUSH_CLICKED, jSONObject, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final String mo13386a(C4208t1 t1Var) {
            C19383o.m32797g(t1Var, "event");
            String string = t1Var.mo13452k().getString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            C19383o.m32796f(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
            return string;
        }
    }
}
