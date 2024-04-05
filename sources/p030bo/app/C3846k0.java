package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.k0 */
public final class C3846k0 extends C3511a<C3821j0> {

    /* renamed from: e */
    public static final C3847a f8723e = new C3847a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final BrazeConfigurationProvider f8724b;

    /* renamed from: c */
    public final SharedPreferences f8725c;

    /* renamed from: d */
    private C3821j0 f8726d;

    /* renamed from: bo.app.k0$a */
    public static final class C3847a {
        private C3847a() {
        }

        public /* synthetic */ C3847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.k0$b */
    public static final class C3848b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3848b f8727b = new C3848b();

        public C3848b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception confirming and unlocking device cache.";
        }
    }

    /* renamed from: bo.app.k0$c */
    public static final class C3849c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3849c f8728b = new C3849c();

        public C3849c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Device object cache cleared.";
        }
    }

    /* renamed from: bo.app.k0$d */
    public static final class C3850d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3850d f8729b = new C3850d();

        public C3850d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception confirming and unlocking Json objects.";
        }
    }

    /* renamed from: bo.app.k0$e */
    public static final class C3851e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3851e f8730b = new C3851e();

        public C3851e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.";
        }
    }

    /* renamed from: bo.app.k0$f */
    public static final class C3852f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3852f f8731b = new C3852f();

        public C3852f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception creating dirty outbound device. Returning the whole device.";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3846k0(Context context, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    /* renamed from: a */
    public final void mo13557a(C3821j0 j0Var) {
        this.f8726d = j0Var;
    }

    /* renamed from: e */
    public final void mo13559e() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C3849c.f8728b, 6);
        this.f8725c.edit().clear().apply();
    }

    /* renamed from: f */
    public C3821j0 mo13010d() {
        String str = "{}";
        C3821j0 j0Var = this.f8726d;
        Iterator<String> it = null;
        JSONObject w = j0Var == null ? null : j0Var.forJsonPut();
        JSONObject jSONObject = new JSONObject();
        try {
            String string = this.f8725c.getString("cached_device", str);
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3850d.f8729b, 4);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (w != null) {
            it = w.keys();
        }
        while (true) {
            boolean z = true;
            if (it == null || !it.hasNext()) {
                z = false;
            }
            if (!z) {
                return C3821j0.f8669m.mo13536a(this.f8724b, jSONObject2);
            }
            String next = it.next();
            Object opt = w.opt(next);
            Object opt2 = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    if (opt2 != null) {
                        try {
                            if (JsonUtils.m11310a((JSONObject) opt, (JSONObject) opt2)) {
                            }
                        } catch (JSONException e2) {
                            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e2, C3851e.f8730b, 4);
                            return this.f8726d;
                        }
                    }
                    jSONObject2.put(next, opt);
                } else if (!C19383o.m32792b(opt, opt2)) {
                    try {
                        jSONObject2.put(next, opt);
                    } catch (JSONException e3) {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e3, C3852f.f8731b, 4);
                        return this.f8726d;
                    }
                }
            }
        }
    }

    public C3846k0(Context context, String str, String str2) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f8724b = new BrazeConfigurationProvider(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(StringUtils.m11341b(context, str, str2), "com.appboy.storage.device_cache.v3"), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f8725c = sharedPreferences;
    }

    /* renamed from: a */
    public void mo13007b(C3821j0 j0Var, boolean z) {
        String str = "{}";
        C19383o.m32797g(j0Var, "outboundObject");
        if (z) {
            try {
                String string = this.f8725c.getString("cached_device", str);
                if (string != null) {
                    str = string;
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONObject w = j0Var.forJsonPut();
                SharedPreferences.Editor edit = this.f8725c.edit();
                edit.putString("cached_device", JsonUtils.m11316g(jSONObject, w).toString());
                edit.apply();
            } catch (JSONException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3848b.f8727b, 4);
            }
        }
    }
}
