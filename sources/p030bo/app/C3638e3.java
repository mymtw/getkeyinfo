package p030bo.app;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p753kq.C19846a;

/* renamed from: bo.app.e3 */
public final class C3638e3 extends C4008n6 {

    /* renamed from: l */
    public static final C3641c f8363l = new C3641c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C5483a f8364i;

    /* renamed from: j */
    private final JSONObject f8365j;

    /* renamed from: k */
    private final C4274x1 f8366k;

    /* renamed from: bo.app.e3$a */
    public static final class C3639a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ JSONObject f8367b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3639a(JSONObject jSONObject) {
            super(0);
            this.f8367b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f(this.f8367b), "Attempting to parse in-app message triggered action with JSON: ");
        }
    }

    /* renamed from: bo.app.e3$b */
    public static final class C3640b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3640b f8368b = new C3640b();

        public C3640b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to parse in-app message triggered action.";
        }
    }

    /* renamed from: bo.app.e3$c */
    public static final class C3641c {
        private C3641c() {
        }

        public /* synthetic */ C3641c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.e3$d */
    public /* synthetic */ class C3642d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8369a;

        static {
            int[] iArr = new int[MessageType.values().length];
            iArr[MessageType.HTML_FULL.ordinal()] = 1;
            iArr[MessageType.FULL.ordinal()] = 2;
            iArr[MessageType.MODAL.ordinal()] = 3;
            iArr[MessageType.SLIDEUP.ordinal()] = 4;
            iArr[MessageType.HTML.ordinal()] = 5;
            f8369a = iArr;
        }
    }

    /* renamed from: bo.app.e3$e */
    public static final class C3643e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3638e3 f8370b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3643e(C3638e3 e3Var) {
            super(0);
            this.f8370b = e3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Attempting to publish in-app message after delay of ");
            h.append(this.f8370b.mo13680f().mo13775g());
            h.append(" seconds.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.e3$f */
    public static final class C3644f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4173s2 f8371b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3644f(C4173s2 s2Var) {
            super(0);
            this.f8371b = s2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Cannot perform triggered action for ");
            h.append(this.f8371b);
            h.append(" due to in-app message json being null");
            return h.toString();
        }
    }

    /* renamed from: bo.app.e3$g */
    public static final class C3645g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4173s2 f8372b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3645g(C4173s2 s2Var) {
            super(0);
            this.f8372b = s2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Cannot perform triggered action for ");
            h.append(this.f8372b);
            h.append(" due to deserialized in-app message being null");
            return h.toString();
        }
    }

    /* renamed from: bo.app.e3$h */
    public static final class C3646h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3646h f8373b = new C3646h();

        public C3646h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while performing triggered action.";
        }
    }

    /* renamed from: bo.app.e3$i */
    public static final class C3647i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3647i f8374b = new C3647i();

        public C3647i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "In-app message has no remote assets for prefetch. Returning empty list.";
        }
    }

    /* renamed from: bo.app.e3$j */
    public static final class C3648j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3638e3 f8375b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3648j(C3638e3 e3Var) {
            super(0);
            this.f8375b = e3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            C5483a a = this.f8375b.f8364i;
            return C19383o.m32802l(a == null ? null : a.mo16002R(), "Failed to return remote paths to assets for type: ");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3638e3(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject);
        C19383o.m32797g(jSONObject, "json");
        C19383o.m32797g(x1Var, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new C3639a(jSONObject), 6);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f8366k = x1Var;
        this.f8365j = jSONObject2;
        C19383o.m32796f(jSONObject2, "inAppMessageObject");
        C5483a a = C3582b3.m8482a(jSONObject2, x1Var);
        this.f8364i = a;
        if (a == null) {
            BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, C3640b.f8368b, 6);
            throw new IllegalArgumentException(C19383o.m32802l(JsonUtils.m11315f(jSONObject), "Failed to parse in-app message triggered action with JSON: "));
        }
    }

    /* renamed from: b */
    public List<C3929l4> mo13246b() {
        ArrayList arrayList = new ArrayList();
        C5483a aVar = this.f8364i;
        MessageType messageType = null;
        List<String> M = aVar == null ? null : aVar.mo15958M();
        if (M == null || M.isEmpty()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3647i.f8374b, 7);
            return arrayList;
        }
        C5483a aVar2 = this.f8364i;
        if (aVar2 != null) {
            messageType = aVar2.mo16002R();
        }
        int i = messageType == null ? -1 : C3642d.f8369a[messageType.ordinal()];
        if (i == 1) {
            arrayList.add(new C3929l4(C3964m4.ZIP, M.get(0)));
        } else if (i == 2 || i == 3 || i == 4) {
            arrayList.add(new C3929l4(C3964m4.IMAGE, M.get(0)));
        } else if (i != 5) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3648j(this), 6);
        } else {
            for (String l4Var : M) {
                arrayList.add(new C3929l4(C3964m4.FILE, l4Var));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e = super.mo13247e();
            if (e == null) {
                return null;
            }
            C5483a aVar = this.f8364i;
            e.put("data", aVar == null ? null : (JSONObject) aVar.forJsonPut());
            e.put("type", "inapp");
            return e;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo13245a(Context context, C3666f2 f2Var, C4173s2 s2Var, long j) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(s2Var, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C3643e(this), 7);
            JSONObject jSONObject = this.f8365j;
            if (jSONObject == null) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new C3644f(s2Var), 6);
                return;
            }
            C5483a a = C3582b3.m8482a(jSONObject, this.f8366k);
            if (a == null) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new C3645g(s2Var), 6);
                return;
            }
            a.mo15954G(mo13782y());
            a.mo15964T(j);
            f2Var.mo13286a(new C3603c3(s2Var, this, a, this.f8366k.mo13826a()), C3603c3.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, e, C3646h.f8373b, 4);
        }
    }
}
