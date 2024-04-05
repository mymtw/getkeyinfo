package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.l6 */
public abstract class C3935l6 implements C4275x2 {

    /* renamed from: g */
    public static final C3936a f8842g = new C3936a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f8843b;

    /* renamed from: c */
    private final C4004n2 f8844c;

    /* renamed from: d */
    private final boolean f8845d;

    /* renamed from: e */
    private C3784i6 f8846e;

    /* renamed from: f */
    private final List<C4137r2> f8847f;

    /* renamed from: bo.app.l6$a */
    public static final class C3936a {
        private C3936a() {
        }

        public /* synthetic */ C3936a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.l6$b */
    public static final class C3937b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3935l6 f8848b;

        /* renamed from: c */
        public final /* synthetic */ C4173s2 f8849c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3937b(C3935l6 l6Var, C4173s2 s2Var) {
            super(0);
            this.f8848b = l6Var;
            this.f8849c = s2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Triggered action ");
            h.append(this.f8848b.getId());
            h.append(" not eligible to be triggered by ");
            h.append(this.f8849c.mo13075d());
            h.append(" event. Current device time outside triggered action time window.");
            return h.toString();
        }
    }

    public C3935l6(JSONObject jSONObject) {
        C19383o.m32797g(jSONObject, "json");
        ArrayList arrayList = new ArrayList();
        this.f8847f = arrayList;
        String string = jSONObject.getString("id");
        C19383o.m32796f(string, "json.getString(ID)");
        this.f8843b = string;
        this.f8844c = new C4212t4(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            List<C4137r2> a = C3843j6.m8952a(jSONArray);
            C19383o.m32796f(a, "parseTriggerConditions(triggers)");
            arrayList.addAll(a);
        }
        this.f8845d = jSONObject.optBoolean("prefetch", true);
    }

    /* renamed from: v */
    private final boolean m9106v() {
        return this.f8844c.mo13776h() == -1 || DateTimeUtils.m11302d() < this.f8844c.mo13776h();
    }

    /* renamed from: w */
    private final boolean m9107w() {
        return this.f8844c.mo13774c() == -1 || DateTimeUtils.m11302d() > this.f8844c.mo13774c();
    }

    /* renamed from: x */
    private final boolean m9108x() {
        return m9107w() && m9106v();
    }

    /* renamed from: a */
    public void mo13678a(C3784i6 i6Var) {
        this.f8846e = i6Var;
    }

    /* renamed from: b */
    public boolean mo13679b(C4173s2 s2Var) {
        C19383o.m32797g(s2Var, "event");
        if (!m9108x()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3937b(this, s2Var), 7);
            return false;
        }
        Iterator<C4137r2> it = this.f8847f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().mo13074a(s2Var)) {
                break;
            } else {
                i++;
            }
        }
        return i != -1;
    }

    /* renamed from: e */
    public JSONObject mo13247e() {
        try {
            JSONObject jSONObject = (JSONObject) this.f8844c.forJsonPut();
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put("id", this.f8843b);
            JSONArray jSONArray = new JSONArray();
            for (C4137r2 forJsonPut : this.f8847f) {
                jSONArray.put(forJsonPut.forJsonPut());
            }
            jSONObject.put("trigger_condition", jSONArray);
            jSONObject.put("prefetch", this.f8845d);
            return jSONObject;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: f */
    public final C4004n2 mo13680f() {
        return this.f8844c;
    }

    public abstract /* synthetic */ Object forJsonPut();

    public final String getId() {
        return this.f8843b;
    }

    /* renamed from: i */
    public C3784i6 mo13682i() {
        return this.f8846e;
    }

    /* renamed from: m */
    public final boolean mo13683m() {
        return this.f8845d;
    }
}
