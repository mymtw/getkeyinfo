package p030bo.app;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.appboy.events.FeedUpdatedEvent;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import com.facebook.login.LoginFragment;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import org.json.JSONArray;
import org.json.JSONObject;
import p005a4.C0034a;
import p301z3.C8433c;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.s */
public final class C4152s {

    /* renamed from: j */
    public static final C4153a f9229j = new C4153a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String f9230k = BrazeLogger.m11287i(C4152s.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4296y1 f9231a;

    /* renamed from: b */
    private final C3689g2 f9232b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3666f2 f9233c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3666f2 f9234d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3661f1 f9235e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4274x1 f9236f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3551a5 f9237g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3517a0 f9238h;

    /* renamed from: i */
    private final Map<String, String> f9239i;

    /* renamed from: bo.app.s$a */
    public static final class C4153a {

        /* renamed from: bo.app.s$a$a */
        public static final class C4154a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Object f9240b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4154a(Object obj) {
                super(0);
                this.f9240b = obj;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f9240b, "Encountered exception while parsing server response for ");
            }
        }

        private C4153a() {
        }

        public /* synthetic */ C4153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m9559a(Object obj, C19846a<C19394m> aVar) {
            try {
                aVar.invoke();
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, obj, BrazeLogger.Priority.E, e, new C4154a(obj), 4);
            }
        }
    }

    /* renamed from: bo.app.s$b */
    public static final class C4155b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4179s4 f9241b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4155b(C4179s4 s4Var) {
            super(0);
            this.f9241b = s4Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Could not parse request parameters for POST request to ");
            h.append(this.f9241b);
            h.append(", cancelling request.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.s$c */
    public static final class C4156c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Exception f9242b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4156c(Exception exc) {
            super(0);
            this.f9242b = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9242b.getMessage(), "Experienced network communication exception processing API response. Sending network error event. ");
        }
    }

    /* renamed from: bo.app.s$d */
    public static final class C4157d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4157d f9243b = new C4157d();

        public C4157d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception processing API response. Failing task.";
        }
    }

    /* renamed from: bo.app.s$e */
    public static final class C4158e extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9244b;

        /* renamed from: c */
        public final /* synthetic */ C4309z f9245c;

        /* renamed from: d */
        public final /* synthetic */ String f9246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4158e(C4152s sVar, C4309z zVar, String str) {
            super(0);
            this.f9244b = sVar;
            this.f9245c = zVar;
            this.f9246d = str;
        }

        /* renamed from: a */
        public final void mo14042a() {
            C8433c a = this.f9244b.f9238h.mo13017a(this.f9245c, this.f9246d);
            if (a != null) {
                this.f9244b.f9234d.mo13286a(a, C8433c.class);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo14042a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$f */
    public static final class C4159f extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9247b;

        /* renamed from: c */
        public final /* synthetic */ JSONArray f9248c;

        /* renamed from: d */
        public final /* synthetic */ String f9249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4159f(C4152s sVar, JSONArray jSONArray, String str) {
            super(0);
            this.f9247b = sVar;
            this.f9248c = jSONArray;
            this.f9249d = str;
        }

        /* renamed from: a */
        public final void mo14043a() {
            FeedUpdatedEvent a = this.f9247b.f9235e.mo13276a(this.f9248c, this.f9249d);
            if (a != null) {
                this.f9247b.f9234d.mo13286a(a, FeedUpdatedEvent.class);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo14043a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$g */
    public static final class C4160g extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9250b;

        /* renamed from: c */
        public final /* synthetic */ List<C0034a> f9251c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4160g(C4152s sVar, List<C0034a> list) {
            super(0);
            this.f9250b = sVar;
            this.f9251c = list;
        }

        /* renamed from: a */
        public final void mo14044a() {
            this.f9250b.f9233c.mo13286a(new C3960m1(this.f9251c), C3960m1.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo14044a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$h */
    public static final class C4161h extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9252b;

        /* renamed from: c */
        public final /* synthetic */ C4299y4 f9253c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4161h(C4152s sVar, C4299y4 y4Var) {
            super(0);
            this.f9252b = sVar;
            this.f9253c = y4Var;
        }

        /* renamed from: a */
        public final void mo14045a() {
            this.f9252b.f9237g.mo13081b(this.f9253c);
            this.f9252b.f9233c.mo13286a(new C4322z4(this.f9253c), C4322z4.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo14045a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$i */
    public static final class C4162i extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9254b;

        /* renamed from: c */
        public final /* synthetic */ C5483a f9255c;

        /* renamed from: d */
        public final /* synthetic */ String f9256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4162i(C4152s sVar, C5483a aVar, String str) {
            super(0);
            this.f9254b = sVar;
            this.f9255c = aVar;
            this.f9256d = str;
        }

        /* renamed from: a */
        public final void mo14046a() {
            if (this.f9254b.f9231a instanceof C4180s5) {
                this.f9255c.mo15964T(((C4180s5) this.f9254b.f9231a).mo14064u());
                this.f9254b.f9233c.mo13286a(new C3603c3(((C4180s5) this.f9254b.f9231a).mo14065v(), ((C4180s5) this.f9254b.f9231a).mo14066w(), this.f9255c, this.f9256d), C3603c3.class);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo14046a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$j */
    public static final class C4163j extends Lambda implements C19846a<C19394m> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9257b;

        /* renamed from: c */
        public final /* synthetic */ List<C4275x2> f9258c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4163j(C4152s sVar, List<? extends C4275x2> list) {
            super(0);
            this.f9257b = sVar;
            this.f9258c = list;
        }

        /* renamed from: a */
        public final void mo14047a() {
            this.f9257b.f9233c.mo13286a(new C4043o6(this.f9258c), C4043o6.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo14047a();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$k */
    public static final class C4164k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9259b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4164k(String str) {
            super(0);
            this.f9259b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9259b, "Processing server response payload for user with id: ");
        }
    }

    /* renamed from: bo.app.s$l */
    public static final class C4165l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3961m2 f9260b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4165l(C3961m2 m2Var) {
            super(0);
            this.f9260b = m2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9260b.mo13306a(), "Received server error from request: ");
        }
    }

    /* renamed from: bo.app.s$m */
    public static final class C4166m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4152s f9261b;

        /* renamed from: c */
        public final /* synthetic */ int f9262c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4166m(C4152s sVar, int i) {
            super(0);
            this.f9261b = sVar;
            this.f9262c = i;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Retrying request: ");
            h.append(this.f9261b.f9231a);
            h.append(" after delay of ");
            return C0071c.m191c(h, this.f9262c, " ms");
        }
    }

    @C19060c(mo70540c = "com.braze.requests.BrazeRequestTask$processResponseError$3", mo70541f = "BrazeRequestTask.kt", mo70542l = {159}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.s$n */
    public static final class C4167n extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9263b;

        /* renamed from: c */
        public final /* synthetic */ int f9264c;

        /* renamed from: d */
        public final /* synthetic */ C4152s f9265d;

        /* renamed from: bo.app.s$n$a */
        public static final class C4168a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ C4152s f9266b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4168a(C4152s sVar) {
                super(0);
                this.f9266b = sVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f9266b.f9231a, "Adding retried request to dispatch: ");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4167n(int i, C4152s sVar, C19340c<? super C4167n> cVar) {
            super(2, cVar);
            this.f9264c = i;
            this.f9265d = sVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C4167n) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C4167n(this.f9264c, this.f9265d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f9263b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                this.f9263b = 1;
                if (C18263b.m30814I((long) this.f9264c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BrazeLogger.m11283e(C4152s.f9230k, BrazeLogger.Priority.V, (Throwable) null, new C4168a(this.f9265d), 12);
            this.f9265d.f9236f.mo13833a(this.f9265d.f9231a);
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.s$o */
    public static final class C4169o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4169o f9267b = new C4169o();

        public C4169o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Api response was null, failing task.";
        }
    }

    public C4152s(C4296y1 y1Var, C3689g2 g2Var, C3666f2 f2Var, C3666f2 f2Var2, C3661f1 f1Var, C4274x1 x1Var, C3551a5 a5Var, C3517a0 a0Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        C19383o.m32797g(g2Var, "httpConnector");
        C19383o.m32797g(f2Var, "internalPublisher");
        C19383o.m32797g(f2Var2, "externalPublisher");
        C19383o.m32797g(f1Var, "feedStorageProvider");
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(a5Var, "serverConfigStorage");
        C19383o.m32797g(a0Var, "contentCardsStorage");
        this.f9231a = y1Var;
        this.f9232b = g2Var;
        this.f9233c = f2Var;
        this.f9234d = f2Var2;
        this.f9235e = f1Var;
        this.f9236f = x1Var;
        this.f9237g = a5Var;
        this.f9238h = a0Var;
        Map<String, String> a = C4076p4.m9368a();
        this.f9239i = a;
        y1Var.mo13117a(a);
    }

    /* renamed from: b */
    public final C3608d mo14035b() {
        try {
            C4179s4 h = this.f9231a.mo13570h();
            JSONObject l = this.f9231a.mo13119l();
            if (l != null) {
                return new C3608d(this.f9232b.mo13326a(h, this.f9239i, l), this.f9231a, this.f9236f);
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4155b(h), 6);
            return null;
        } catch (Exception e) {
            if (e instanceof C4036o3) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C4156c(e), 4);
                this.f9233c.mo13286a(new C4104q4(this.f9231a), C4104q4.class);
                this.f9234d.mo13286a(new BrazeNetworkFailureEvent(e, this.f9231a), BrazeNetworkFailureEvent.class);
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4157d.f9243b, 4);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo14037c() {
        Class<C4069p0> cls = C4069p0.class;
        C3608d b = mo14035b();
        if (b != null) {
            mo14033a(b);
            this.f9233c.mo13286a(new C4139r4(this.f9231a), C4139r4.class);
            if (b.mo13174b() instanceof C4235u4) {
                this.f9233c.mo13286a(new C4069p0(this.f9231a), cls);
            } else {
                this.f9233c.mo13286a(new C4134r0(this.f9231a), C4134r0.class);
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4169o.f9267b, 6);
            C4075p3 p3Var = new C4075p3("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", this.f9231a);
            this.f9231a.mo13567a(this.f9233c, this.f9234d, (C3961m2) p3Var);
            this.f9233c.mo13286a(new C4069p0(this.f9231a), cls);
            mo14034a((C3961m2) p3Var);
        }
        this.f9231a.mo13569b(this.f9233c);
    }

    /* renamed from: a */
    public final void mo14033a(C3608d dVar) {
        C19383o.m32797g(dVar, "apiResponse");
        if (dVar.mo13174b() == null) {
            this.f9231a.mo13115a(this.f9233c, this.f9234d, dVar);
        } else {
            mo14034a(dVar.mo13174b());
            this.f9231a.mo13567a(this.f9233c, this.f9234d, dVar.mo13174b());
        }
        mo14036b(dVar);
    }

    /* renamed from: a */
    public final void mo14034a(C3961m2 m2Var) {
        C19383o.m32797g(m2Var, "responseError");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new C4165l(m2Var), 6);
        this.f9233c.mo13286a(new C3605c5(m2Var), C3605c5.class);
        if (this.f9231a.mo13568a(m2Var)) {
            int a = this.f9231a.mo13571m().mo13188a();
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C4166m(this, a), 7);
            C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C4167n(a, this, (C19340c<? super C4167n>) null), 3);
        }
    }

    /* renamed from: b */
    public final void mo14036b(C3608d dVar) {
        C19383o.m32797g(dVar, "apiResponse");
        String a = this.f9236f.mo13826a();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4164k(a), 6);
        m9545a(dVar.mo13175c(), a);
        m9542a(dVar.mo13173a(), a);
        m9541a(dVar.mo13179g());
        m9547b((List<? extends C4275x2>) dVar.mo13181i());
        m9544a(dVar.mo13176d());
        m9543a(dVar.mo13180h(), a);
    }

    /* renamed from: a */
    private final void m9545a(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            f9229j.m9559a(jSONArray, new C4159f(this, jSONArray, str));
        }
    }

    /* renamed from: a */
    private final void m9542a(C4309z zVar, String str) {
        if (zVar != null) {
            f9229j.m9559a(zVar, new C4158e(this, zVar, str));
        }
    }

    /* renamed from: a */
    private final void m9541a(C4299y4 y4Var) {
        if (y4Var != null) {
            f9229j.m9559a(y4Var, new C4161h(this, y4Var));
        }
    }

    /* renamed from: a */
    private final void m9544a(List<C0034a> list) {
        if (list != null) {
            f9229j.m9559a(list, new C4160g(this, list));
        }
    }

    /* renamed from: a */
    private final void m9543a(C5483a aVar, String str) {
        if (aVar != null) {
            f9229j.m9559a(aVar, new C4162i(this, aVar, str));
        }
    }

    /* renamed from: b */
    private final void m9547b(List<? extends C4275x2> list) {
        if (list != null) {
            f9229j.m9559a(list, new C4163j(this, list));
        }
    }
}
