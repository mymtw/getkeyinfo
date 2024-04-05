package p030bo.app;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.t5 */
public final class C4215t5 extends C4008n6 {

    /* renamed from: m */
    public static final C4217b f9354m = new C4217b((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C4274x1 f9355i;

    /* renamed from: j */
    private String f9356j;

    /* renamed from: k */
    private final List<C3929l4> f9357k = new ArrayList();

    /* renamed from: l */
    private long f9358l = -1;

    /* renamed from: bo.app.t5$a */
    public static final class C4216a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f9359b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4216a(JSONObject jSONObject) {
            super(0);
            this.f9359b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f(this.f9359b), "Parsing templated triggered action with JSON: ");
        }
    }

    /* renamed from: bo.app.t5$b */
    public static final class C4217b {
        private C4217b() {
        }

        public /* synthetic */ C4217b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.t5$c */
    public /* synthetic */ class C4218c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9360a;

        static {
            int[] iArr = new int[C3964m4.values().length];
            iArr[C3964m4.IMAGE.ordinal()] = 1;
            iArr[C3964m4.ZIP.ordinal()] = 2;
            iArr[C3964m4.FILE.ordinal()] = 3;
            f9360a = iArr;
        }
    }

    /* renamed from: bo.app.t5$d */
    public static final class C4219d extends Lambda implements C19857l<Integer, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f9361b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4219d(JSONArray jSONArray) {
            super(1);
            this.f9361b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo14113a(int i) {
            return Boolean.valueOf(this.f9361b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14113a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.t5$e */
    public static final class C4220e extends Lambda implements C19857l<Integer, String> {

        /* renamed from: b */
        public final /* synthetic */ JSONArray f9362b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4220e(JSONArray jSONArray) {
            super(1);
            this.f9362b = jSONArray;
        }

        /* renamed from: a */
        public final String mo14114a(int i) {
            Object obj = this.f9362b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo14114a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.t5$f */
    public static final class C4221f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4221f f9363b = new C4221f();

        public C4221f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not convert TemplatedTriggeredAction to JSON";
        }
    }

    /* renamed from: bo.app.t5$g */
    public static final class C4222g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4215t5 f9364b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4222g(C4215t5 t5Var) {
            super(0);
            this.f9364b = t5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Posting templating request after delay of ");
            h.append(this.f9364b.mo13680f().mo13775g());
            h.append(" seconds.");
            return h.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4215t5(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject);
        C19383o.m32797g(jSONObject, "json");
        C19383o.m32797g(x1Var, "brazeManager");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4216a(jSONObject), 7);
        this.f9355i = x1Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string = jSONObject2.getString("trigger_id");
        C19383o.m32796f(string, "dataObject.getString(TRIGGER_ID)");
        this.f9356j = string;
        JSONArray optJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            m9678a(optJSONArray, C3964m4.IMAGE);
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            m9678a(optJSONArray2, C3964m4.ZIP);
        }
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            m9678a(optJSONArray3, C3964m4.FILE);
        }
    }

    /* renamed from: A */
    public final long mo14110A() {
        return this.f9358l;
    }

    /* renamed from: a */
    public void mo13245a(Context context, C3666f2 f2Var, C4173s2 s2Var, long j) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(s2Var, "triggerEvent");
        this.f9358l = j;
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4222g(this), 7);
        this.f9355i.mo13830a(this, s2Var);
    }

    /* renamed from: b */
    public List<C3929l4> mo13246b() {
        return new ArrayList(this.f9357k);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e = super.mo13247e();
            if (e == null) {
                return null;
            }
            e.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f9356j);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C3929l4 next : this.f9357k) {
                int i = C4218c.f9360a[next.mo13667a().ordinal()];
                if (i == 1) {
                    jSONArray.put(next.mo13668b());
                } else if (i == 2) {
                    jSONArray2.put(next.mo13668b());
                } else if (i == 3) {
                    jSONArray3.put(next.mo13668b());
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            e.put("data", jSONObject);
            return e;
        } catch (JSONException e2) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e2, C4221f.f9363b, 4);
            return null;
        }
    }

    /* renamed from: z */
    public final String mo14111z() {
        return this.f9356j;
    }

    /* renamed from: a */
    private final void m9678a(JSONArray jSONArray, C3964m4 m4Var) {
        Iterator it;
        if (jSONArray == null) {
            it = EmptyList.INSTANCE.iterator();
        } else {
            it = new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(SequencesKt___SequencesKt.m32984o1(C19327t.m32633O0(C19388s.m32816D0(0, jSONArray.length())), new C4219d(jSONArray)), new C4220e(jSONArray)));
        }
        while (it.hasNext()) {
            this.f9357k.add(new C3929l4(m4Var, (String) it.next()));
        }
    }
}
