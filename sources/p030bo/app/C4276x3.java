package p030bo.app;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p005a4.C0035b;

/* renamed from: bo.app.x3 */
public final class C4276x3 implements C0035b<JSONObject>, C3637e2 {

    /* renamed from: f */
    public static final C4278b f9426f = new C4278b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f9427b;

    /* renamed from: c */
    private final Boolean f9428c;

    /* renamed from: d */
    private final Boolean f9429d;

    /* renamed from: e */
    private final C4259w3 f9430e;

    /* renamed from: bo.app.x3$a */
    public static final class C4277a {

        /* renamed from: a */
        private String f9431a;

        /* renamed from: b */
        private Boolean f9432b;

        /* renamed from: c */
        private Boolean f9433c;

        /* renamed from: d */
        private C4259w3 f9434d;

        public C4277a(String str, Boolean bool, Boolean bool2, C4259w3 w3Var) {
            this.f9431a = str;
            this.f9432b = bool;
            this.f9433c = bool2;
            this.f9434d = w3Var;
        }

        /* renamed from: a */
        public final void mo14170a(String str) {
            this.f9431a = str;
        }

        /* renamed from: b */
        public final void mo14174b(Boolean bool) {
            this.f9433c = bool;
        }

        /* renamed from: c */
        public final C4277a mo14175c() {
            mo14174b(Boolean.TRUE);
            return this;
        }

        /* renamed from: a */
        public final void mo14169a(Boolean bool) {
            this.f9432b = bool;
        }

        /* renamed from: b */
        public final void mo14173b(C4259w3 w3Var) {
            this.f9434d = w3Var;
        }

        /* renamed from: a */
        public final C4277a mo14167a(C4259w3 w3Var) {
            C19383o.m32797g(w3Var, "outboundConfigParams");
            mo14173b(w3Var);
            return this;
        }

        /* renamed from: b */
        public final C4277a mo14172b(String str) {
            mo14170a(str);
            return this;
        }

        /* renamed from: a */
        public final C4276x3 mo14168a() {
            return new C4276x3(this.f9431a, this.f9432b, this.f9433c, this.f9434d, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C4277a mo14171b() {
            mo14169a(Boolean.TRUE);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C4277a(String str, Boolean bool, Boolean bool2, C4259w3 w3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : w3Var);
        }
    }

    /* renamed from: bo.app.x3$b */
    public static final class C4278b {
        private C4278b() {
        }

        public /* synthetic */ C4278b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C4276x3(String str, Boolean bool, Boolean bool2, C4259w3 w3Var) {
        this.f9427b = str;
        this.f9428c = bool;
        this.f9429d = bool2;
        this.f9430e = w3Var;
    }

    public /* synthetic */ C4276x3(String str, Boolean bool, Boolean bool2, C4259w3 w3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, bool2, w3Var);
    }

    /* renamed from: e */
    public boolean mo13244e() {
        C4259w3 w3Var;
        JSONObject v = forJsonPut();
        if (v.length() == 0) {
            return true;
        }
        if (this.f9428c == null && this.f9429d == null && (w3Var = this.f9430e) != null) {
            return w3Var.mo13244e();
        }
        if (v.length() == 1) {
            return v.has("user_id");
        }
        return false;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f9427b;
        if (!(str == null || str.length() == 0)) {
            jSONObject.put("user_id", this.f9427b);
        }
        Boolean bool = this.f9428c;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.f9429d;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        C4259w3 w3Var = this.f9430e;
        if (w3Var != null) {
            jSONObject.put("config", w3Var.forJsonPut());
        }
        return jSONObject;
    }

    /* renamed from: w */
    public final boolean mo14163w() {
        return this.f9430e != null;
    }

    /* renamed from: x */
    public final boolean mo14164x() {
        return this.f9428c != null;
    }

    /* renamed from: y */
    public final boolean mo14165y() {
        return this.f9429d != null;
    }

    /* renamed from: z */
    public final boolean mo14166z() {
        String str = this.f9427b;
        return !(str == null || str.length() == 0);
    }
}
