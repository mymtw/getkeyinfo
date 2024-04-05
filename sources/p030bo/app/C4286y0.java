package p030bo.app;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.braze.Braze;
import com.braze.C5381b;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19699g1;
import p030bo.app.C4276x3;
import p301z3.C8434d;
import p301z3.C8436f;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.y0 */
public final class C4286y0 {

    /* renamed from: a */
    private final Context f9446a;

    /* renamed from: b */
    private final C3729h2 f9447b;

    /* renamed from: c */
    private final C3620d2 f9448c;

    /* renamed from: d */
    public final C4274x1 f9449d;

    /* renamed from: e */
    private final C4107q6 f9450e;

    /* renamed from: f */
    private final C3846k0 f9451f;

    /* renamed from: g */
    private final C4210t2 f9452g;

    /* renamed from: h */
    private final C4258w2 f9453h;

    /* renamed from: i */
    private final C3575b1 f9454i;

    /* renamed from: j */
    private final C3879l f9455j;

    /* renamed from: k */
    private final C4281x5 f9456k;

    /* renamed from: l */
    private final C3666f2 f9457l;

    /* renamed from: m */
    private final BrazeConfigurationProvider f9458m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C3517a0 f9459n;

    /* renamed from: o */
    private final C4279x4 f9460o;

    /* renamed from: p */
    private final C3551a5 f9461p;

    /* renamed from: q */
    public final AtomicBoolean f9462q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f9463r = new AtomicBoolean(false);

    /* renamed from: s */
    private C3628d6 f9464s;

    /* renamed from: t */
    private C19699g1 f9465t;

    /* renamed from: bo.app.y0$a */
    public static final class C4287a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4287a f9466b = new C4287a();

        public C4287a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    /* renamed from: bo.app.y0$b */
    public static final class C4288b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f9467b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4288b(C4275x2 x2Var) {
            super(0);
            this.f9467b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9467b.getId(), "Could not publish in-app message with trigger action id: ");
        }
    }

    /* renamed from: bo.app.y0$c */
    public static final class C4289c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4289c f9468b = new C4289c();

        public C4289c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger refresh.";
        }
    }

    /* renamed from: bo.app.y0$d */
    public static final class C4290d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f9469b;

        /* renamed from: c */
        public final /* synthetic */ int f9470c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4290d(long j, int i) {
            super(0);
            this.f9469b = j;
            this.f9470c = i;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("ContentCardRetryEvent received. timeInMS: ");
            h.append(this.f9469b);
            h.append(", retryCount: ");
            h.append(this.f9470c);
            return h.toString();
        }
    }

    @C19060c(mo70540c = "com.braze.events.EventListenerFactory$retryContentCardsEventSubscriber$1$2", mo70541f = "EventListenerFactory.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.y0$e */
    public static final class C4291e extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9471b;

        /* renamed from: c */
        public final /* synthetic */ C4286y0 f9472c;

        /* renamed from: d */
        public final /* synthetic */ int f9473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4291e(C4286y0 y0Var, int i, C19340c<? super C4291e> cVar) {
            super(1, cVar);
            this.f9472c = y0Var;
            this.f9473d = i;
        }

        /* renamed from: a */
        public final Object invoke(C19340c<? super C19394m> cVar) {
            return ((C4291e) create(cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(C19340c<?> cVar) {
            return new C4291e(this.f9472c, this.f9473d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f9471b == 0) {
                C0761x.m1684O0(obj);
                C4286y0 y0Var = this.f9472c;
                y0Var.f9449d.mo13827a(y0Var.f9459n.mo13033e(), this.f9472c.f9459n.mo13035f(), this.f9473d);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.y0$f */
    public static final class C4292f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4292f f9474b = new C4292f();

        public C4292f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Session start event for new session received.";
        }
    }

    /* renamed from: bo.app.y0$g */
    public static final class C4293g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4293g f9475b = new C4293g();

        public C4293g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
        }
    }

    /* renamed from: bo.app.y0$h */
    public static final class C4294h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4294h f9476b = new C4294h();

        public C4294h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log the storage exception.";
        }
    }

    /* renamed from: bo.app.y0$i */
    public static final class C4295i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4295i f9477b = new C4295i();

        public C4295i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger update due to trigger-eligible push click event";
        }
    }

    public C4286y0(Context context, C3729h2 h2Var, C3620d2 d2Var, C4274x1 x1Var, C4107q6 q6Var, C3846k0 k0Var, C4210t2 t2Var, C4258w2 w2Var, C3575b1 b1Var, C3879l lVar, C4281x5 x5Var, C3666f2 f2Var, BrazeConfigurationProvider brazeConfigurationProvider, C3517a0 a0Var, C4279x4 x4Var, C3551a5 a5Var) {
        Context context2 = context;
        C3729h2 h2Var2 = h2Var;
        C3620d2 d2Var2 = d2Var;
        C4274x1 x1Var2 = x1Var;
        C4107q6 q6Var2 = q6Var;
        C3846k0 k0Var2 = k0Var;
        C4210t2 t2Var2 = t2Var;
        C4258w2 w2Var2 = w2Var;
        C3575b1 b1Var2 = b1Var;
        C3879l lVar2 = lVar;
        C4281x5 x5Var2 = x5Var;
        C3666f2 f2Var2 = f2Var;
        BrazeConfigurationProvider brazeConfigurationProvider2 = brazeConfigurationProvider;
        C3517a0 a0Var2 = a0Var;
        C19383o.m32797g(context2, "applicationContext");
        C19383o.m32797g(h2Var2, "locationManager");
        C19383o.m32797g(d2Var2, "dispatchManager");
        C19383o.m32797g(x1Var2, "brazeManager");
        C19383o.m32797g(q6Var2, "userCache");
        C19383o.m32797g(k0Var2, "deviceCache");
        C19383o.m32797g(t2Var2, "triggerManager");
        C19383o.m32797g(w2Var2, "triggerReEligibilityManager");
        C19383o.m32797g(b1Var2, "eventStorageManager");
        C19383o.m32797g(lVar2, "geofenceManager");
        C19383o.m32797g(x5Var2, "testUserDeviceLoggingManager");
        C19383o.m32797g(f2Var2, "externalEventPublisher");
        C19383o.m32797g(brazeConfigurationProvider2, "configurationProvider");
        C19383o.m32797g(a0Var2, "contentCardsStorageProvider");
        C19383o.m32797g(x4Var, "sdkMetadataCache");
        C3551a5 a5Var2 = a5Var;
        C19383o.m32797g(a5Var2, "serverConfigStorageProvider");
        this.f9446a = context2;
        this.f9447b = h2Var2;
        this.f9448c = d2Var2;
        this.f9449d = x1Var2;
        this.f9450e = q6Var2;
        this.f9451f = k0Var2;
        this.f9452g = t2Var2;
        this.f9453h = w2Var2;
        this.f9454i = b1Var2;
        this.f9455j = lVar2;
        this.f9456k = x5Var2;
        this.f9457l = f2Var2;
        this.f9458m = brazeConfigurationProvider2;
        this.f9459n = a0Var2;
        this.f9460o = x4Var;
        this.f9461p = a5Var2;
    }

    /* renamed from: f */
    private final C8434d<C3962m3> m9846f() {
        return new C3563a7(this, 1);
    }

    /* renamed from: g */
    private final C8434d<C4269x> m9848g() {
        return new C4120q7(this);
    }

    /* renamed from: h */
    private final C8434d<C4322z4> m9850h() {
        return new C4082p7(this);
    }

    /* renamed from: j */
    private final C8434d<C3692g5> m9853j() {
        return new C4009n7(this);
    }

    /* renamed from: k */
    private final C8434d<C4007n5> m9855k() {
        return new C3594b7(this, 1);
    }

    /* renamed from: m */
    private final C8434d<C3672f6> m9858m() {
        return new C4349z6(this, 1);
    }

    /* renamed from: n */
    private final C8434d<C3967m6> m9860n() {
        return new C4308y6(this, 1);
    }

    /* renamed from: b */
    public final C8434d<C4069p0> mo14190b() {
        return new C3878k7(this);
    }

    /* renamed from: c */
    public final C8434d<C4134r0> mo14191c() {
        return new C3629d7(this, 1);
    }

    /* renamed from: d */
    public final C8434d<C3960m1> mo14192d() {
        return new C3844j7(this);
    }

    /* renamed from: e */
    public final C8434d<C3603c3> mo14193e() {
        return new C4250v6(this, 1);
    }

    /* renamed from: i */
    public final C8434d<C3651e5> mo14194i() {
        return new C4151r7(this);
    }

    /* renamed from: l */
    public final C8434d<C3628d6> mo14195l() {
        return new C3968m7(this);
    }

    /* renamed from: o */
    public final C8434d<C4043o6> mo14196o() {
        return new C4188s7(this);
    }

    /* renamed from: p */
    public final C4107q6 mo14197p() {
        return this.f9450e;
    }

    /* renamed from: q */
    public final void mo14198q() {
        C3628d6 d6Var;
        if (this.f9463r.compareAndSet(true, false) && (d6Var = this.f9464s) != null) {
            this.f9452g.mo13388a((C4173s2) new C3691g4(d6Var.mo13219a(), d6Var.mo13220b()));
            this.f9464s = null;
        }
    }

    /* renamed from: r */
    public final void mo14199r() {
        if (this.f9462q.compareAndSet(true, false)) {
            this.f9452g.mo13388a((C4173s2) new C4234u3());
        }
    }

    /* renamed from: s */
    public final void mo14200s() {
        if (this.f9449d.mo13843c()) {
            this.f9462q.set(true);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4289c.f9468b, 7);
            this.f9449d.mo13832a(new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null).mo14175c());
            this.f9449d.mo13837a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9837a(C4286y0 y0Var, C4134r0 r0Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(r0Var, "$dstr$brazeRequest");
        C4296y1 a = r0Var.mo13990a();
        C3821j0 f = a.mo13966f();
        boolean z = true;
        if (f != null) {
            y0Var.f9451f.mo13006a(f, true);
        }
        C4298y3 d = a.mo13962d();
        if (d != null) {
            y0Var.mo14197p().mo13006a(d, true);
        }
        C3845k e = a.mo13964e();
        if (e != null) {
            y0Var.f9454i.mo13127a((Set<? extends C4208t1>) e.mo13553b());
        }
        C4276x3 c = a.mo13433c();
        if (c != null && c.mo14165y()) {
            y0Var.f9449d.mo13837a(false);
        }
        EnumSet<BrazeSdkMetadata> i = a.mo13969i();
        if (i != null) {
            y0Var.f9460o.mo14176a(i);
        }
        C4276x3 c2 = a.mo13433c();
        if (c2 == null || !c2.mo14163w()) {
            z = false;
        }
        if (z) {
            y0Var.f9461p.mo13096r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9836a(C4286y0 y0Var, C4069p0 p0Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(p0Var, "$dstr$brazeRequest");
        C4296y1 a = p0Var.mo13871a();
        C4276x3 c = a.mo13433c();
        boolean z = false;
        if (c != null && c.mo14165y()) {
            y0Var.mo14199r();
            y0Var.mo14198q();
            y0Var.f9449d.mo13837a(true);
        }
        C3821j0 f = a.mo13966f();
        if (f != null) {
            y0Var.f9451f.mo13006a(f, false);
        }
        C4298y3 d = a.mo13962d();
        if (d != null) {
            y0Var.mo14197p().mo13006a(d, false);
            if (d.mo14211w().has("push_token")) {
                y0Var.mo14197p().mo13938h();
            }
        }
        C3845k e = a.mo13964e();
        if (e != null) {
            for (C4208t1 a2 : e.mo13553b()) {
                y0Var.f9448c.mo13196a(a2);
            }
        }
        C4276x3 c2 = a.mo13433c();
        if (c2 != null && c2.mo14163w()) {
            z = true;
        }
        if (z) {
            y0Var.f9461p.mo13096r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9828a(C4286y0 y0Var, C3651e5 e5Var) {
        C4286y0 y0Var2 = y0Var;
        C19383o.m32797g(y0Var2, "this$0");
        C19383o.m32797g(e5Var, "it");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, y0Var, (BrazeLogger.Priority) null, (Throwable) null, C4292f.f9474b, 7);
        C4208t1 a = C3787j.f8608h.mo13460a(e5Var.mo13258a().mo13210n());
        if (a != null) {
            a.mo13445a(e5Var.mo13258a().mo13210n());
        }
        if (a != null) {
            y0Var2.f9449d.mo13838a(a);
        }
        y0Var2.f9447b.mo13378a();
        y0Var2.f9449d.mo13837a(true);
        y0Var2.f9450e.mo13938h();
        y0Var2.f9451f.mo13559e();
        y0Var.mo14200s();
        if (y0Var2.f9458m.isAutomaticGeofenceRequestsEnabled()) {
            C5381b.m10967g(y0Var2.f9446a, false);
        } else {
            BrazeLogger.m11282d(brazeLogger, y0Var, (BrazeLogger.Priority) null, (Throwable) null, C4293g.f9475b, 7);
        }
        C4274x1.m9763a(y0Var2.f9449d, y0Var2.f9459n.mo13033e(), y0Var2.f9459n.mo13035f(), 0, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9832a(C4286y0 y0Var, C3962m3 m3Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(m3Var, "it");
        y0Var.f9449d.mo13837a(true);
        y0Var.mo14200s();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9830a(C4286y0 y0Var, C3692g5 g5Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(g5Var, "message");
        y0Var.m9825a(g5Var);
        Braze.f11170m.mo15515f(y0Var.f9446a).mo15510z();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9840a(C4286y0 y0Var, C4322z4 z4Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(z4Var, "$dstr$serverConfig");
        C4299y4 a = z4Var.mo14256a();
        y0Var.f9455j.mo13597a(a);
        y0Var.f9456k.mo14179a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9831a(C4286y0 y0Var, C3960m1 m1Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(m1Var, "$dstr$geofences");
        y0Var.f9455j.mo13598a(m1Var.mo13711a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9827a(C4286y0 y0Var, C3628d6 d6Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(d6Var, "message");
        y0Var.f9463r.set(true);
        y0Var.f9464s = d6Var;
        BrazeLogger.m11282d(BrazeLogger.f11932a, y0Var, BrazeLogger.Priority.I, (Throwable) null, C4295i.f9477b, 6);
        y0Var.f9449d.mo13832a(new C4276x3.C4277a((String) null, (Boolean) null, (Boolean) null, (C4259w3) null, 15, (DefaultConstructorMarker) null).mo14175c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9835a(C4286y0 y0Var, C4043o6 o6Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(o6Var, "$dstr$triggeredActions");
        y0Var.f9452g.mo13390a(o6Var.mo13822a());
        y0Var.mo14199r();
        y0Var.mo14198q();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9829a(C4286y0 y0Var, C3672f6 f6Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(f6Var, "$dstr$triggerEvent");
        y0Var.f9452g.mo13388a(f6Var.mo13299a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9826a(C4286y0 y0Var, C3603c3 c3Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(c3Var, "$dstr$triggerEvent$triggeredAction$inAppMessage$userId");
        C4173s2 a = c3Var.mo13157a();
        C4275x2 b = c3Var.mo13158b();
        C5483a c = c3Var.mo13159c();
        String d = c3Var.mo13160d();
        synchronized (y0Var.f9453h) {
            if (y0Var.f9453h.mo13582b(b)) {
                y0Var.f9457l.mo13286a(new C8436f(a, b, c, d), C8436f.class);
                y0Var.f9453h.mo13581a(b, DateTimeUtils.m11302d());
                y0Var.f9452g.mo13387a(DateTimeUtils.m11302d());
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, y0Var, (BrazeLogger.Priority) null, (Throwable) null, new C4288b(b), 7);
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9833a(C4286y0 y0Var, C3967m6 m6Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(m6Var, "$dstr$originalTriggerEvent$failedTriggeredAction");
        y0Var.f9452g.mo13389a(m6Var.mo13716a(), m6Var.mo13717b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9839a(C4286y0 y0Var, C4269x xVar) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(xVar, "$dstr$timeInMs$retryCount");
        long a = xVar.mo14151a();
        int b = xVar.mo14152b();
        BrazeLogger.m11282d(BrazeLogger.f11932a, y0Var, BrazeLogger.Priority.V, (Throwable) null, new C4290d(a, b), 6);
        C19699g1 g1Var = y0Var.f9465t;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.f11696b;
        y0Var.f9465t = BrazeCoroutineScope.m11007c(Long.valueOf(a), new C4291e(y0Var, b, (C19340c<? super C4291e>) null));
    }

    /* renamed from: a */
    private final C8434d<C4251w> m9824a() {
        return new C3938l7(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9838a(C4286y0 y0Var, C4251w wVar) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(wVar, "it");
        C19699g1 g1Var = y0Var.f9465t;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        y0Var.f9465t = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9834a(C4286y0 y0Var, C4007n5 n5Var) {
        C19383o.m32797g(y0Var, "this$0");
        C19383o.m32797g(n5Var, "storageException");
        try {
            y0Var.f9449d.mo13834a((Throwable) n5Var);
        } catch (Exception e) {
            C4286y0 y0Var2 = y0Var;
            BrazeLogger.m11282d(BrazeLogger.f11932a, y0Var2, BrazeLogger.Priority.E, e, C4294h.f9476b, 4);
        }
    }

    /* renamed from: a */
    public final void mo14189a(C3666f2 f2Var) {
        C19383o.m32797g(f2Var, "eventMessenger");
        f2Var.mo13287a(mo14190b(), C4069p0.class);
        f2Var.mo13287a(mo14191c(), C4134r0.class);
        f2Var.mo13287a(mo14194i(), C3651e5.class);
        f2Var.mo13287a(m9853j(), C3692g5.class);
        f2Var.mo13287a(mo14195l(), C3628d6.class);
        f2Var.mo13287a(m9850h(), C4322z4.class);
        f2Var.mo13287a(mo14188a((Semaphore) null), Throwable.class);
        f2Var.mo13287a(m9855k(), C4007n5.class);
        f2Var.mo13287a(mo14196o(), C4043o6.class);
        f2Var.mo13287a(m9846f(), C3962m3.class);
        f2Var.mo13287a(mo14192d(), C3960m1.class);
        f2Var.mo13287a(m9858m(), C3672f6.class);
        f2Var.mo13287a(mo14193e(), C3603c3.class);
        f2Var.mo13287a(m9860n(), C3967m6.class);
        f2Var.mo13287a(m9848g(), C4269x.class);
        f2Var.mo13287a(m9824a(), C4251w.class);
    }

    /* renamed from: a */
    public final C8434d<Throwable> mo14188a(Semaphore semaphore) {
        return new C4044o7(this, semaphore);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9841a(C4286y0 y0Var, Semaphore semaphore, Throwable th) {
        C19383o.m32797g(y0Var, "this$0");
        if (th != null) {
            try {
                y0Var.f9449d.mo13841b(th);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, y0Var, BrazeLogger.Priority.E, e, C4287a.f9466b, 4);
                if (semaphore == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (semaphore != null) {
                    semaphore.release();
                }
                throw th2;
            }
        }
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    /* renamed from: a */
    private final void m9825a(C3692g5 g5Var) {
        C3624d5 a = g5Var.mo13332a();
        C4208t1 a2 = C3787j.f8608h.mo13459a(a.mo13212v());
        if (a2 != null) {
            a2.mo13445a(a.mo13210n());
            this.f9449d.mo13838a(a2);
        }
    }
}
