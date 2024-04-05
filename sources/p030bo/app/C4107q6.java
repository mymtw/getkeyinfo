package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.appboy.enums.Gender;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopRelatedLink;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.q6 */
public final class C4107q6 extends C3511a<C4298y3> {

    /* renamed from: g */
    public static final C4108a f9136g = new C4108a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C3777i2 f9137b;

    /* renamed from: c */
    private final C4261w4 f9138c;

    /* renamed from: d */
    private final SharedPreferences f9139d;

    /* renamed from: e */
    private final SharedPreferences f9140e;

    /* renamed from: f */
    private String f9141f;

    /* renamed from: bo.app.q6$a */
    public static final class C4108a {
        private C4108a() {
        }

        public /* synthetic */ C4108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.q6$b */
    public static final class C4109b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4109b f9142b = new C4109b();

        public C4109b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No push token available to add to attributes object.";
        }
    }

    /* renamed from: bo.app.q6$c */
    public static final class C4110c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4110c f9143b = new C4110c();

        public C4110c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Couldn't add push token to outbound json";
        }
    }

    /* renamed from: bo.app.q6$d */
    public static final class C4111d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4111d f9144b = new C4111d();

        public C4111d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not create custom attributes json object from preferences";
        }
    }

    /* renamed from: bo.app.q6$e */
    public static final class C4112e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4112e f9145b = new C4112e();

        public C4112e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add merged custom attributes back to user object.";
        }
    }

    /* renamed from: bo.app.q6$f */
    public static final class C4113f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4113f f9146b = new C4113f();

        public C4113f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Push token cache cleared.";
        }
    }

    /* renamed from: bo.app.q6$g */
    public static final class C4114g extends Lambda implements C19857l<String, C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4107q6 f9147b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4114g(C4107q6 q6Var) {
            super(1);
            this.f9147b = q6Var;
        }

        /* renamed from: a */
        public final void mo13948a(String str) {
            C19383o.m32797g(str, "it");
            boolean unused = this.f9147b.m9412c("user_id", str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13948a((String) obj);
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.q6$h */
    public static final class C4115h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9148b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4115h(String str) {
            super(0);
            this.f9148b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9148b, "Failed to load user object json from prefs with json string: ");
        }
    }

    /* renamed from: bo.app.q6$i */
    public static final class C4116i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9149b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f9150c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4116i(String str, JSONObject jSONObject) {
            super(0);
            this.f9149b = str;
            this.f9150c = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to write to user object json from prefs with key: [");
            h.append(this.f9149b);
            h.append("] value: [");
            h.append(this.f9150c);
            h.append("] ");
            return h.toString();
        }
    }

    /* renamed from: bo.app.q6$j */
    public static final class C4117j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4117j f9151b = new C4117j();

        public C4117j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not writing to user cache.";
        }
    }

    /* renamed from: bo.app.q6$k */
    public static final class C4118k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9152b;

        /* renamed from: c */
        public final /* synthetic */ Object f9153c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4118k(String str, Object obj) {
            super(0);
            this.f9152b = str;
            this.f9153c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Could not write to custom attributes json object with key: [");
            h.append(this.f9152b);
            h.append("] value: [");
            return C0073e.m209i(h, this.f9153c, ']');
        }
    }

    /* renamed from: bo.app.q6$l */
    public static final class C4119l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9154b;

        /* renamed from: c */
        public final /* synthetic */ Object f9155c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4119l(String str, Object obj) {
            super(0);
            this.f9154b = str;
            this.f9155c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to write to user object json from prefs with key: [");
            h.append(this.f9154b);
            h.append("] value: [");
            return C0073e.m209i(h, this.f9155c, ']');
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4107q6(Context context, C3777i2 i2Var, C4261w4 w4Var, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i2Var, w4Var, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    /* renamed from: e */
    private final JSONObject m9413e() {
        JSONObject g = mo13936g();
        if (g.has(ShopHomeSortOption.SORT_CUSTOM)) {
            try {
                JSONObject jSONObject = g.getJSONObject(ShopHomeSortOption.SORT_CUSTOM);
                C19383o.m32796f(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
                return jSONObject;
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4111d.f9144b, 4);
            }
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public final synchronized boolean mo13931c(String str) {
        return m9412c("email", str);
    }

    /* renamed from: f */
    public final String mo13934f() {
        return this.f9141f;
    }

    /* renamed from: g */
    public final JSONObject mo13936g() {
        String string = this.f9139d.getString("user_cache_attributes_object", (String) null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C4115h(string), 4);
            return new JSONObject();
        }
    }

    /* renamed from: h */
    public final synchronized boolean mo13939h(String str) {
        return m9412c(ResponseConstants.PHONE, str);
    }

    /* renamed from: i */
    public final synchronized void mo13941i(String str) {
        this.f9141f = str;
        m9412c("user_id", str);
    }

    /* renamed from: j */
    public final synchronized boolean mo13942j(String str) {
        C19383o.m32797g(str, "key");
        return mo13930b(ValidationUtils.m11346a(str), JSONObject.NULL);
    }

    public C4107q6(Context context, C3777i2 i2Var, C4261w4 w4Var, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(i2Var, "pushRegistrationDataProvider");
        C19383o.m32797g(w4Var, "sdkEnablementProvider");
        this.f9137b = i2Var;
        this.f9138c = w4Var;
        this.f9141f = str;
        String b = StringUtils.m11341b(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(b, "com.appboy.storage.user_cache.v3"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f9139d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(C19383o.m32802l(b, "com.braze.storage.user_cache.push_token_store"), 0);
        C19383o.m32796f(sharedPreferences2, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f9140e = sharedPreferences2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m9412c(String str, Object obj) {
        Object obj2;
        JSONObject g = mo13936g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C4119l(str, obj), 4);
                return false;
            }
        } else {
            obj2 = obj;
        }
        g.put(str, obj2);
        return m9411b(g);
    }

    /* renamed from: a */
    public final synchronized void mo13919a(Gender gender) {
        m9412c("gender", gender == null ? null : gender.forJsonPut());
    }

    /* renamed from: b */
    public final synchronized boolean mo13929b(String str) {
        C19383o.m32797g(str, "dateString");
        return m9412c("dob", str);
    }

    /* renamed from: d */
    public final synchronized void mo13932d(String str) {
        m9412c(ResponseConstants.FIRST_NAME, str);
    }

    /* renamed from: f */
    public final synchronized void mo13935f(String str) {
        m9412c("language", str);
    }

    /* renamed from: h */
    public final synchronized void mo13938h() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C4113f.f9146b, 6);
        this.f9140e.edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void mo13924a(String str) {
        m9412c("country", str);
    }

    /* renamed from: b */
    public final synchronized void mo13928b(NotificationSubscriptionType notificationSubscriptionType) {
        m9412c("push_subscribe", notificationSubscriptionType == null ? null : notificationSubscriptionType.forJsonPut());
    }

    /* renamed from: i */
    public C4298y3 mo13010d() {
        String str = this.f9141f;
        C4114g gVar = new C4114g(this);
        String str2 = StringUtils.f11974a;
        if (!(str == null || str.length() == 0)) {
            gVar.invoke(str);
        }
        JSONObject g = mo13936g();
        mo13925a(g);
        this.f9139d.edit().clear().apply();
        return new C4298y3(g);
    }

    /* renamed from: a */
    public final synchronized void mo13920a(NotificationSubscriptionType notificationSubscriptionType) {
        m9412c("email_subscribe", notificationSubscriptionType == null ? null : notificationSubscriptionType.forJsonPut());
    }

    /* renamed from: b */
    private final boolean m9411b(JSONObject jSONObject) {
        if (this.f9138c.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4117j.f9151b, 6);
            return false;
        }
        this.f9139d.edit().putString("user_cache_attributes_object", jSONObject.toString()).apply();
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo13923a(TwitterUser twitterUser) {
        mo13927a(ShopRelatedLink.TWITTER_TITLE, twitterUser == null ? null : twitterUser.forJsonPut());
    }

    /* renamed from: g */
    public final synchronized void mo13937g(String str) {
        m9412c("last_name", str);
    }

    /* renamed from: a */
    public final synchronized void mo13922a(FacebookUser facebookUser) {
        mo13927a("facebook", facebookUser == null ? null : facebookUser.forJsonPut());
    }

    /* renamed from: e */
    public final synchronized void mo13933e(String str) {
        m9412c("home_city", str);
    }

    /* renamed from: a */
    public final synchronized void mo13921a(AttributionData attributionData) {
        mo13927a("ab_install_attribution", attributionData == null ? null : attributionData.forJsonPut());
    }

    /* renamed from: a */
    public final synchronized boolean mo13926a(String str, Object obj) {
        C19383o.m32797g(str, "key");
        C19383o.m32797g(obj, "value");
        return mo13930b(str, obj);
    }

    /* renamed from: a */
    public final void mo13925a(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "outboundJson");
        try {
            String a = this.f9137b.mo13439a();
            if (a == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4109b.f9142b, 7);
            } else if (!C19383o.m32792b(a, this.f9140e.getString("push_token", (String) null))) {
                jSONObject.put("push_token", a);
            }
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4110c.f9143b, 4);
        }
    }

    /* renamed from: b */
    public final boolean mo13930b(String str, Object obj) {
        Object obj2;
        C19383o.m32797g(str, "key");
        JSONObject e = m9413e();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e2) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e2, new C4118k(str, obj), 4);
                return false;
            }
        } else {
            obj2 = obj;
        }
        e.put(str, obj2);
        return m9412c(ShopHomeSortOption.SORT_CUSTOM, e);
    }

    /* renamed from: a */
    public void mo13007b(C4298y3 y3Var, boolean z) {
        C19383o.m32797g(y3Var, "outboundObject");
        JSONObject w = y3Var.mo14211w();
        if (!z) {
            JSONObject g = mo13936g();
            String str = JsonUtils.f11953a;
            C19383o.m32797g(w, "<this>");
            C19383o.m32797g(g, "otherJson");
            JSONObject g2 = JsonUtils.m11316g(w, g);
            g2.remove("push_token");
            JSONObject optJSONObject = g.optJSONObject(ShopHomeSortOption.SORT_CUSTOM);
            JSONObject optJSONObject2 = w.optJSONObject(ShopHomeSortOption.SORT_CUSTOM);
            if (optJSONObject != null && optJSONObject2 != null) {
                try {
                    g2.put(ShopHomeSortOption.SORT_CUSTOM, JsonUtils.m11316g(optJSONObject2, optJSONObject));
                } catch (JSONException e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4112e.f9145b, 4);
                }
            } else if (optJSONObject != null) {
                g2.put(ShopHomeSortOption.SORT_CUSTOM, optJSONObject);
            } else if (optJSONObject2 != null) {
                g2.put(ShopHomeSortOption.SORT_CUSTOM, optJSONObject2);
            }
            this.f9139d.edit().putString("user_cache_attributes_object", g2.toString()).apply();
        } else if (w.has("push_token")) {
            this.f9140e.edit().putString("push_token", w.optString("push_token")).apply();
        }
    }

    /* renamed from: a */
    public final boolean mo13927a(String str, JSONObject jSONObject) {
        C19383o.m32797g(str, "key");
        JSONObject g = mo13936g();
        if (jSONObject == null) {
            try {
                g.put(str, JSONObject.NULL);
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C4116i(str, jSONObject), 4);
                return false;
            }
        } else {
            JSONObject optJSONObject = g.optJSONObject(str);
            if (optJSONObject != null) {
                String str2 = JsonUtils.f11953a;
                g.put(str, JsonUtils.m11316g(optJSONObject, jSONObject));
            } else {
                g.put(str, jSONObject);
            }
        }
        return m9411b(g);
    }
}
