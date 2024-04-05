package p030bo.app;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import com.appboy.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.login.LoginFragment;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import org.json.JSONObject;
import p030bo.app.C4276x3;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.p */
public final class C4045p implements C4274x1 {

    /* renamed from: s */
    public static final C4046a f9029s = new C4046a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private static final String[] f9030t = {"android.os.deadsystemexception"};

    /* renamed from: a */
    private final String f9031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4189t f9032b;

    /* renamed from: c */
    private final C3666f2 f9033c;

    /* renamed from: d */
    private final BrazeConfigurationProvider f9034d;

    /* renamed from: e */
    private final C3551a5 f9035e;

    /* renamed from: f */
    private final C3575b1 f9036f;

    /* renamed from: g */
    private boolean f9037g;

    /* renamed from: h */
    private final C4083q f9038h;

    /* renamed from: i */
    private final C4261w4 f9039i;

    /* renamed from: j */
    private final AtomicInteger f9040j = new AtomicInteger(0);

    /* renamed from: k */
    private final AtomicInteger f9041k = new AtomicInteger(0);

    /* renamed from: l */
    private final ReentrantLock f9042l = new ReentrantLock();

    /* renamed from: m */
    private final ReentrantLock f9043m = new ReentrantLock();

    /* renamed from: n */
    private C19699g1 f9044n = C1993m.m4368l();

    /* renamed from: o */
    private final C4270x0 f9045o;

    /* renamed from: p */
    private volatile String f9046p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicBoolean f9047q;

    /* renamed from: r */
    private Class<? extends Activity> f9048r;

    /* renamed from: bo.app.p$a */
    public static final class C4046a {
        private C4046a() {
        }

        public /* synthetic */ C4046a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m9333a(boolean z, C4208t1 t1Var) {
            if (!z) {
                return false;
            }
            if (t1Var.mo13451j() == C3600c1.PUSH_ACTION_BUTTON_CLICKED) {
                return !((C3649e4) t1Var).mo13256x();
            }
            if (t1Var.mo13451j() == C3600c1.PUSH_CLICKED || t1Var.mo13451j() == C3600c1.PUSH_STORY_PAGE_CLICK) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: bo.app.p$b */
    public static final class C4047b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4047b f9049b = new C4047b();

        public C4047b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not adding request to dispatch.";
        }
    }

    /* renamed from: bo.app.p$c */
    public static final class C4048c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4048c f9050b = new C4048c();

        public C4048c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not closing session.";
        }
    }

    /* renamed from: bo.app.p$d */
    public static final class C4049d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Activity f9051b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4049d(Activity activity) {
            super(0);
            this.f9051b = activity;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9051b.getLocalClassName(), "Closed session with activity: ");
        }
    }

    /* renamed from: bo.app.p$e */
    public static final class C4050e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4050e f9052b = new C4050e();

        public C4050e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not force closing session.";
        }
    }

    /* renamed from: bo.app.p$f */
    public static final class C4051f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Throwable f9053b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4051f(Throwable th) {
            super(0);
            this.f9053b = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9053b, "Not logging duplicate error: ");
        }
    }

    /* renamed from: bo.app.p$g */
    public static final class C4052g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4052g f9054b = new C4052g();

        public C4052g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    /* renamed from: bo.app.p$h */
    public static final class C4053h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9055b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4053h(C4208t1 t1Var) {
            super(0);
            this.f9055b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9055b, "SDK is disabled. Not logging event: ");
        }
    }

    /* renamed from: bo.app.p$i */
    public static final class C4054i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9056b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4054i(C4208t1 t1Var) {
            super(0);
            this.f9056b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9056b, "Not processing event after validation failed: ");
        }
    }

    /* renamed from: bo.app.p$j */
    public static final class C4055j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9057b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4055j(C4208t1 t1Var) {
            super(0);
            this.f9057b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f((JSONObject) this.f9057b.forJsonPut()), "Not adding session id to event: ");
        }
    }

    /* renamed from: bo.app.p$k */
    public static final class C4056k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9058b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4056k(C4208t1 t1Var) {
            super(0);
            this.f9058b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f((JSONObject) this.f9058b.forJsonPut()), "Not adding user id to event: ");
        }
    }

    /* renamed from: bo.app.p$l */
    public static final class C4057l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9059b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4057l(C4208t1 t1Var) {
            super(0);
            this.f9059b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(JsonUtils.m11315f((JSONObject) this.f9059b.forJsonPut()), "Attempting to log event: ");
        }
    }

    /* renamed from: bo.app.p$m */
    public static final class C4058m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4058m f9060b = new C4058m();

        public C4058m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Publishing an internal push body clicked event for any awaiting triggers.";
        }
    }

    /* renamed from: bo.app.p$n */
    public static final class C4059n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4059n f9061b = new C4059n();

        public C4059n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Adding push click to dispatcher pending list";
        }
    }

    @C19060c(mo70540c = "com.braze.managers.BrazeManager$logEvent$3", mo70541f = "BrazeManager.kt", mo70542l = {236}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.p$o */
    public static final class C4060o extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9062b;

        /* renamed from: c */
        public final /* synthetic */ C4045p f9063c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4060o(C4045p pVar, C19340c<? super C4060o> cVar) {
            super(2, cVar);
            this.f9063c = pVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C4060o) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C4060o(this.f9063c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f9062b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                this.f9062b = 1;
                if (C18263b.m30814I(1000, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f9063c.mo13839b();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.p$p */
    public static final class C4061p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4061p f9064b = new C4061p();

        public C4061p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    /* renamed from: bo.app.p$q */
    public static final class C4062q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4045p f9065b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4062q(C4045p pVar) {
            super(0);
            this.f9065b = pVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9065b.f9032b.mo14075g(), "Completed the openSession call. Starting or continuing session ");
        }
    }

    /* renamed from: bo.app.p$r */
    public static final class C4063r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4063r f9066b = new C4063r();

        public C4063r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    /* renamed from: bo.app.p$s */
    public static final class C4064s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Activity f9067b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4064s(Activity activity) {
            super(0);
            this.f9067b = activity;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9067b.getLocalClassName(), "Opened session with activity: ");
        }
    }

    /* renamed from: bo.app.p$t */
    public static final class C4065t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4065t f9068b = new C4065t();

        public C4065t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get local class name for activity when opening session";
        }
    }

    /* renamed from: bo.app.p$u */
    public static final class C4066u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4066u f9069b = new C4066u();

        public C4066u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence report for geofence event.";
        }
    }

    /* renamed from: bo.app.p$v */
    public static final class C4067v extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4067v f9070b = new C4067v();

        public C4067v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence request for location.";
        }
    }

    /* renamed from: bo.app.p$w */
    public static final class C4068w extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4045p f9071b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4068w(C4045p pVar) {
            super(0);
            this.f9071b = pVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9071b.f9047q, "Updated shouldRequestTriggersInNextRequest to: ");
        }
    }

    public C4045p(Context context, String str, String str2, C4189t tVar, C3666f2 f2Var, BrazeConfigurationProvider brazeConfigurationProvider, C3551a5 a5Var, C3575b1 b1Var, boolean z, C4083q qVar, C4261w4 w4Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str2, "apiKey");
        C19383o.m32797g(tVar, "sessionManager");
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        C19383o.m32797g(b1Var, "eventStorageManager");
        C19383o.m32797g(qVar, "messagingSessionManager");
        C19383o.m32797g(w4Var, "sdkEnablementProvider");
        this.f9031a = str;
        this.f9032b = tVar;
        this.f9033c = f2Var;
        this.f9034d = brazeConfigurationProvider;
        this.f9035e = a5Var;
        this.f9036f = b1Var;
        this.f9037g = z;
        this.f9038h = qVar;
        this.f9039i = w4Var;
        this.f9045o = new C4270x0(context, mo13826a(), str2);
        this.f9046p = "";
        this.f9047q = new AtomicBoolean(false);
    }

    /* renamed from: c */
    public boolean mo13843c() {
        return this.f9047q.get();
    }

    public void closeSession(Activity activity) {
        C19383o.m32797g(activity, "activity");
        if (this.f9039i.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4048c.f9050b, 6);
        } else if (this.f9048r == null || C19383o.m32792b(activity.getClass(), this.f9048r)) {
            this.f9038h.mo13887c();
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4049d(activity), 6);
            this.f9032b.mo14081o();
        }
    }

    /* renamed from: d */
    public void mo13845d() {
        if (this.f9039i.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4061p.f9064b, 6);
            return;
        }
        this.f9032b.mo14079m();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C4062q(this), 6);
    }

    /* renamed from: e */
    public void mo13846e() {
        if (this.f9039i.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4050e.f9052b, 6);
            return;
        }
        this.f9048r = null;
        this.f9032b.mo14078l();
    }

    /* renamed from: f */
    public C3670f5 mo13847f() {
        return this.f9032b.mo14075g();
    }

    public void openSession(Activity activity) {
        C19383o.m32797g(activity, "activity");
        if (this.f9039i.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4063r.f9066b, 6);
            return;
        }
        mo13845d();
        this.f9048r = activity.getClass();
        this.f9038h.mo13886b();
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4064s(activity), 6);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4065t.f9068b, 4);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private final boolean m9310c(Throwable th) {
        ReentrantLock reentrantLock = this.f9043m;
        reentrantLock.lock();
        try {
            this.f9040j.getAndIncrement();
            if (!C19383o.m32792b(this.f9046p, th.getMessage()) || this.f9041k.get() <= 3 || this.f9040j.get() >= 100) {
                if (C19383o.m32792b(this.f9046p, th.getMessage())) {
                    this.f9041k.getAndIncrement();
                } else {
                    this.f9041k.set(0);
                }
                if (this.f9040j.get() >= 100) {
                    this.f9040j.set(0);
                }
                this.f9046p = th.getMessage();
                reentrantLock.unlock();
                return false;
            }
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: a */
    public String mo13826a() {
        return this.f9031a;
    }

    /* renamed from: b */
    public void mo13842b(boolean z) {
        this.f9037g = z;
    }

    /* renamed from: a */
    public void mo13837a(boolean z) {
        this.f9047q.set(z);
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4068w(this), 6);
    }

    /* renamed from: b */
    public void mo13841b(Throwable th) {
        C19383o.m32797g(th, "throwable");
        mo13835a(th, true);
    }

    /* renamed from: b */
    public void mo13839b() {
        mo13832a(new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null));
    }

    /* renamed from: a */
    public boolean mo13838a(C4208t1 t1Var) {
        boolean z;
        Class<C4026o0> cls = C4026o0.class;
        C19383o.m32797g(t1Var, "event");
        boolean z2 = false;
        if (this.f9039i.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4053h(t1Var), 6);
            return false;
        }
        ReentrantLock reentrantLock = this.f9042l;
        reentrantLock.lock();
        try {
            if (!this.f9045o.mo14158a(t1Var)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4054i(t1Var), 6);
                return false;
            }
            if (this.f9032b.mo14077j() || this.f9032b.mo14075g() == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4055j(t1Var), 7);
                z = true;
            } else {
                t1Var.mo13445a(this.f9032b.mo14075g());
                z = false;
            }
            String a = mo13826a();
            if (a == null || a.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                t1Var.mo13446a(mo13826a());
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4056k(t1Var), 7);
            }
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new C4057l(t1Var), 6);
            if (t1Var.mo13451j() == C3600c1.PUSH_CLICKED) {
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C4058m.f9060b, 7);
                mo13828a((C3734h4) t1Var);
            }
            if (!t1Var.mo13447d()) {
                this.f9036f.mo13126a(t1Var);
            }
            if (f9029s.m9333a(z, t1Var)) {
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C4059n.f9061b, 7);
                this.f9033c.mo13286a(C4026o0.f8992e.mo13809b(t1Var), cls);
            } else {
                this.f9033c.mo13286a(C4026o0.f8992e.mo13807a(t1Var), cls);
            }
            if (t1Var.mo13451j() == C3600c1.SESSION_START) {
                this.f9033c.mo13286a(C4026o0.f8992e.mo13806a(t1Var.mo13453n()), cls);
            }
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            if (z) {
                this.f9044n.mo72134a((CancellationException) null);
                this.f9044n = C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C4060o(this, (C19340c<? super C4060o>) null), 3);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo13840b(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "geofenceEvent");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4066u.f9069b, 7);
        mo13833a((C4296y1) new C3827j1(this.f9034d.getBaseUrlForRequests(), t1Var));
    }

    /* renamed from: a */
    public void mo13834a(Throwable th) {
        C19383o.m32797g(th, "throwable");
        mo13835a(th, false);
    }

    /* renamed from: a */
    public void mo13832a(C4276x3.C4277a aVar) {
        C19383o.m32797g(aVar, "respondWithBuilder");
        Pair<Long, Boolean> a = this.f9035e.mo13078a();
        if (a != null) {
            aVar.mo14167a(new C4259w3(a.getFirst().longValue(), a.getSecond().booleanValue()));
        }
        if (this.f9047q.get()) {
            aVar.mo14175c();
        }
        aVar.mo14170a(mo13826a());
        mo13833a((C4296y1) new C3769i0(this.f9034d.getBaseUrlForRequests(), aVar.mo14168a()));
        this.f9047q.set(false);
    }

    /* renamed from: a */
    public void mo13831a(C4257w1 w1Var) {
        C19383o.m32797g(w1Var, "location");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4067v.f9070b, 7);
        mo13833a((C4296y1) new C3773i1(this.f9034d.getBaseUrlForRequests(), w1Var));
    }

    /* renamed from: a */
    public void mo13833a(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        if (this.f9039i.mo14147a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C4047b.f9049b, 6);
            return;
        }
        this.f9033c.mo13286a(C4026o0.f8992e.mo13808a(y1Var), C4026o0.class);
    }

    /* renamed from: a */
    public void mo13830a(C4215t5 t5Var, C4173s2 s2Var) {
        C19383o.m32797g(t5Var, "templatedTriggeredAction");
        C19383o.m32797g(s2Var, "triggerEvent");
        mo13833a((C4296y1) new C4180s5(this.f9034d.getBaseUrlForRequests(), t5Var, s2Var, this, mo13826a()));
    }

    /* renamed from: a */
    public void mo13829a(C4173s2 s2Var) {
        C19383o.m32797g(s2Var, "triggerEvent");
        this.f9033c.mo13286a(new C3672f6(s2Var), C3672f6.class);
    }

    /* renamed from: a */
    public void mo13836a(List<String> list, long j) {
        C19383o.m32797g(list, "deviceLogs");
        mo13833a((C4296y1) new C4264w5(this.f9034d.getBaseUrlForRequests(), list, j, mo13826a()));
    }

    /* renamed from: a */
    public void mo13827a(long j, long j2, int i) {
        mo13833a((C4296y1) new C3570b0(this.f9034d.getBaseUrlForRequests(), j, j2, mo13826a(), i));
    }

    /* renamed from: a */
    public final void mo13835a(Throwable th, boolean z) {
        C19383o.m32797g(th, "throwable");
        try {
            if (m9310c(th)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4051f(th), 6);
                return;
            }
            String th2 = th.toString();
            String[] strArr = f9030t;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                Locale locale = Locale.US;
                C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                String lowerCase = th2.toLowerCase(locale);
                C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (C19459m.m33036e1(lowerCase, str, false)) {
                    return;
                }
            }
            C4208t1 a = C3787j.f8608h.mo13472a(th, mo13847f(), z);
            if (a != null) {
                mo13838a(a);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4052g.f9054b, 4);
        }
    }

    /* renamed from: a */
    public final void mo13828a(C3734h4 h4Var) {
        C19383o.m32797g(h4Var, "notificationTrackingBrazeEvent");
        String optString = h4Var.mo13452k().optString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, "");
        C3666f2 f2Var = this.f9033c;
        C19383o.m32796f(optString, "campaignId");
        f2Var.mo13286a(new C3628d6(optString, h4Var), C3628d6.class);
    }
}
