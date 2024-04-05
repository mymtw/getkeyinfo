package p030bo.app;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.app.z */
public final class C4309z {

    /* renamed from: e */
    public static final C4310a f9507e = new C4310a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final long f9508a;

    /* renamed from: b */
    private final long f9509b;

    /* renamed from: c */
    private final boolean f9510c;

    /* renamed from: d */
    private final JSONArray f9511d;

    /* renamed from: bo.app.z$a */
    public static final class C4310a {
        private C4310a() {
        }

        public /* synthetic */ C4310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4309z(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "jsonObject");
        this.f9508a = jSONObject.optLong("last_card_updated_at", -1);
        this.f9509b = jSONObject.optLong("last_full_sync_at", -1);
        this.f9510c = jSONObject.optBoolean("full_sync", false);
        this.f9511d = jSONObject.optJSONArray("cards");
    }

    /* renamed from: a */
    public final JSONArray mo14244a() {
        return this.f9511d;
    }

    /* renamed from: b */
    public final long mo14245b() {
        return this.f9508a;
    }

    /* renamed from: c */
    public final long mo14246c() {
        return this.f9509b;
    }

    /* renamed from: d */
    public final boolean mo14247d() {
        return this.f9510c;
    }

    public C4309z(String str) {
        C19383o.m32797g(str, "serializedCardJson");
        this.f9510c = false;
        this.f9508a = -1;
        this.f9509b = -1;
        this.f9511d = new JSONArray().put(new JSONObject(str));
    }
}
