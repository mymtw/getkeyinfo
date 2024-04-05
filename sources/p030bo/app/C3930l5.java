package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.l5 */
public final class C3930l5 implements C4074p2 {

    /* renamed from: b */
    public static final C3931a f8837b = new C3931a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f8838a;

    /* renamed from: bo.app.l5$a */
    public static final class C3931a {
        private C3931a() {
        }

        public /* synthetic */ C3931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.l5$b */
    public static final class C3932b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3932b f8839b = new C3932b();

        public C3932b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set end time to now for session json data";
        }
    }

    /* renamed from: bo.app.l5$c */
    public static final class C3933c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3933c f8840b = new C3933c();

        public C3933c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No stored open session in storage.";
        }
    }

    /* renamed from: bo.app.l5$d */
    public static final class C3934d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3934d f8841b = new C3934d();

        public C3934d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not create new mutable session for open session.";
        }
    }

    public C3930l5(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f8838a = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.appboy.storage.session_storage"), 0);
    }

    /* renamed from: a */
    public C3624d5 mo13672a() {
        String str = "";
        if (!this.f8838a.contains("current_open_session")) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3933c.f8840b, 7);
            return null;
        }
        try {
            String string = this.f8838a.getString(this.f8838a.getString("current_open_session", str), str);
            if (string != null) {
                str = string;
            }
            return new C3624d5(new JSONObject(str));
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3934d.f8841b, 4);
            return null;
        }
    }

    /* renamed from: a */
    public void mo13673a(C3624d5 d5Var) {
        C19383o.m32797g(d5Var, "session");
        String f5Var = d5Var.mo13210n().toString();
        JSONObject e = d5Var.forJsonPut();
        SharedPreferences.Editor edit = this.f8838a.edit();
        m9099a(e);
        edit.putString(f5Var, e.toString());
        if (!d5Var.mo13215y()) {
            edit.putString("current_open_session", f5Var);
        } else if (C19383o.m32792b(this.f8838a.getString("current_open_session", ""), f5Var)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: a */
    public void mo13674a(String str) {
        C19383o.m32797g(str, "sessionId");
        SharedPreferences.Editor edit = this.f8838a.edit();
        edit.remove(str);
        if (C19383o.m32792b(str, this.f8838a.getString("current_open_session", (String) null))) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: a */
    private final void m9099a(JSONObject jSONObject) {
        if (!jSONObject.has("end_time")) {
            try {
                jSONObject.put("end_time", DateTimeUtils.m11303e());
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3932b.f8839b, 4);
            }
        }
    }
}
