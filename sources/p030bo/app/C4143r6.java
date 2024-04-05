package p030bo.app;

import android.app.AlarmManager;
import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
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
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.r6 */
public final class C4143r6 implements C4297y2 {

    /* renamed from: A */
    private final C3517a0 f9191A;

    /* renamed from: B */
    private final C3926l2 f9192B;

    /* renamed from: a */
    private final String f9193a;

    /* renamed from: b */
    private final String f9194b;

    /* renamed from: c */
    private final C4261w4 f9195c;

    /* renamed from: d */
    private final C3591b5 f9196d;

    /* renamed from: e */
    private final C3551a5 f9197e;

    /* renamed from: f */
    public C4107q6 f9198f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3846k0 f9199g;

    /* renamed from: h */
    private final C4311z0 f9200h;

    /* renamed from: i */
    private final C3654f f9201i;

    /* renamed from: j */
    private final C3930l5 f9202j;

    /* renamed from: k */
    private final C4252w0 f9203k;

    /* renamed from: l */
    private final C4286y0 f9204l;

    /* renamed from: m */
    private final C3700h0 f9205m;

    /* renamed from: n */
    private final C4189t f9206n;

    /* renamed from: o */
    private final C3857k5 f9207o;

    /* renamed from: p */
    private final C3539a1 f9208p;

    /* renamed from: q */
    private final C3575b1 f9209q;

    /* renamed from: r */
    private final C3581b2 f9210r;

    /* renamed from: s */
    private final C4246v4 f9211s;

    /* renamed from: t */
    private final C4083q f9212t;

    /* renamed from: u */
    private final C4279x4 f9213u;

    /* renamed from: v */
    private final C4274x1 f9214v;

    /* renamed from: w */
    private final C3738h6 f9215w;

    /* renamed from: x */
    private final C3879l f9216x;

    /* renamed from: y */
    private final C4010o f9217y;

    /* renamed from: z */
    private final C3661f1 f9218z;

    @C19060c(mo70540c = "com.braze.managers.UserDependencyManager$requestClose$1", mo70541f = "UserDependencyManager.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.r6$a */
    public static final class C4144a extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9219b;

        /* renamed from: c */
        private /* synthetic */ Object f9220c;

        /* renamed from: d */
        public final /* synthetic */ C4143r6 f9221d;

        /* renamed from: bo.app.r6$a$a */
        public static final class C4145a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4145a f9222b = new C4145a();

            public C4145a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "User cache was locked, waiting.";
            }
        }

        /* renamed from: bo.app.r6$a$b */
        public static final class C4146b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4146b f9223b = new C4146b();

            public C4146b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "User cache notified. Continuing UserDependencyManager shutdown";
            }
        }

        /* renamed from: bo.app.r6$a$c */
        public static final class C4147c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4147c f9224b = new C4147c();

            public C4147c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Device cache was locked, waiting.";
            }
        }

        /* renamed from: bo.app.r6$a$d */
        public static final class C4148d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4148d f9225b = new C4148d();

            public C4148d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Device cache notified. Continuing UserDependencyManager shutdown";
            }
        }

        /* renamed from: bo.app.r6$a$e */
        public static final class C4149e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4149e f9226b = new C4149e();

            public C4149e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Exception while shutting down dispatch manager. Continuing.";
            }
        }

        /* renamed from: bo.app.r6$a$f */
        public static final class C4150f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4150f f9227b = new C4150f();

            public C4150f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Exception while stopping data sync. Continuing.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4144a(C4143r6 r6Var, C19340c<? super C4144a> cVar) {
            super(2, cVar);
            this.f9221d = r6Var;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C4144a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C4144a aVar = new C4144a(this.f9221d, cVar);
            aVar.f9220c = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f9219b == 0) {
                C0761x.m1684O0(obj);
                C19525d0 d0Var = (C19525d0) this.f9220c;
                try {
                    if (this.f9221d.mo14009b().mo13008b()) {
                        BrazeLogger brazeLogger = BrazeLogger.f11932a;
                        BrazeLogger.m11282d(brazeLogger, d0Var, BrazeLogger.Priority.I, (Throwable) null, C4145a.f9222b, 6);
                        this.f9221d.mo14009b().mo13009c();
                        BrazeLogger.m11282d(brazeLogger, d0Var, (BrazeLogger.Priority) null, (Throwable) null, C4146b.f9223b, 7);
                    }
                    if (this.f9221d.f9199g.mo13008b()) {
                        BrazeLogger brazeLogger2 = BrazeLogger.f11932a;
                        BrazeLogger.m11282d(brazeLogger2, d0Var, BrazeLogger.Priority.I, (Throwable) null, C4147c.f9224b, 6);
                        this.f9221d.f9199g.mo13009c();
                        BrazeLogger.m11282d(brazeLogger2, d0Var, (BrazeLogger.Priority) null, (Throwable) null, C4148d.f9225b, 7);
                    }
                    this.f9221d.mo14020m().mo13267a((C3666f2) this.f9221d.mo14017j());
                } catch (Exception e) {
                    C19525d0 d0Var2 = d0Var;
                    BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var2, BrazeLogger.Priority.W, e, C4149e.f9226b, 4);
                }
                try {
                    this.f9221d.mo14010c().mo13350f();
                } catch (Exception e2) {
                    C19525d0 d0Var3 = d0Var;
                    BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var3, BrazeLogger.Priority.W, e2, C4150f.f9227b, 4);
                }
                this.f9221d.mo14017j().mo13286a(new C4251w(), C4251w.class);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C4143r6(Context context, C4174s3 s3Var, BrazeConfigurationProvider brazeConfigurationProvider, C3666f2 f2Var, C3602c2 c2Var, C3777i2 i2Var, boolean z, boolean z2, C4281x5 x5Var) {
        Context context2 = context;
        BrazeConfigurationProvider brazeConfigurationProvider2 = brazeConfigurationProvider;
        C19383o.m32797g(context2, "applicationContext");
        C19383o.m32797g(s3Var, "offlineUserStorageProvider");
        C19383o.m32797g(brazeConfigurationProvider2, "configurationProvider");
        C19383o.m32797g(f2Var, "externalEventPublisher");
        C19383o.m32797g(c2Var, "deviceIdProvider");
        C19383o.m32797g(i2Var, "registrationDataProvider");
        C19383o.m32797g(x5Var, "testUserDeviceLoggingManager");
        String a = s3Var.mo14055a();
        this.f9193a = a;
        String iVar = brazeConfigurationProvider.getBrazeApiKey().toString();
        this.f9194b = iVar;
        C4261w4 w4Var = new C4261w4(context2);
        this.f9195c = w4Var;
        C3591b5 b5Var = new C3591b5(context2);
        this.f9196d = b5Var;
        this.f9197e = new C3551a5(context2, iVar, b5Var);
        this.f9200h = new C4311z0(w4Var);
        C3930l5 l5Var = new C3930l5(context2, a, iVar);
        this.f9202j = l5Var;
        C4252w0 w0Var = new C4252w0(l5Var, mo14017j());
        this.f9203k = w0Var;
        this.f9205m = new C3700h0(context2, mo14017j(), new C3675g0(context2));
        C4311z0 j = mo14017j();
        Object systemService = context2.getSystemService("alarm");
        if (systemService != null) {
            C4189t tVar = r1;
            AlarmManager alarmManager = (AlarmManager) systemService;
            C4261w4 w4Var2 = w4Var;
            String str = iVar;
            C4189t tVar2 = new C4189t(context, w0Var, j, f2Var, alarmManager, brazeConfigurationProvider.getSessionTimeoutSeconds(), brazeConfigurationProvider.isSessionStartBasedTimeoutEnabled());
            this.f9206n = tVar;
            C3857k5 k5Var = new C3857k5(context2, a, str);
            this.f9207o = k5Var;
            C3539a1 a1Var = new C3539a1(k5Var, mo14017j());
            this.f9208p = a1Var;
            this.f9209q = new C3575b1(a1Var);
            this.f9211s = new C4246v4(context2, a, str);
            this.f9212t = new C4083q(context2, mo14017j(), mo14011d());
            C4279x4 x4Var = new C4279x4(context2, a, str);
            this.f9213u = x4Var;
            C4189t r = mo14025r();
            C4311z0 j2 = mo14017j();
            C3551a5 d = mo14011d();
            Context context3 = context;
            C4045p pVar = r1;
            String str2 = a;
            C3575b1 e = mo14012e();
            C4279x4 x4Var2 = x4Var;
            C4045p pVar2 = new C4045p(context3, a, str, r, j2, brazeConfigurationProvider, d, e, z2, mo14024q(), w4Var2);
            this.f9214v = pVar;
            BrazeConfigurationProvider brazeConfigurationProvider3 = brazeConfigurationProvider;
            this.f9215w = new C3738h6(context3, mo14019l(), mo14017j(), brazeConfigurationProvider3, str2, str);
            this.f9216x = new C3879l(context3, str, mo14019l(), brazeConfigurationProvider3, mo14011d(), mo14017j());
            Context context4 = context;
            this.f9217y = new C4010o(context4, mo14019l(), brazeConfigurationProvider2);
            String str3 = str2;
            this.f9218z = new C3661f1(context4, str3, mo14019l());
            this.f9191A = new C3517a0(context, str3, str, mo14019l(), (String) null, 16, (DefaultConstructorMarker) null);
            C4037o4 o4Var = new C4037o4(C4101q1.m9405a(), mo14017j(), f2Var, mo14013f(), mo14011d(), mo14016i(), mo14019l());
            this.f9192B = o4Var;
            if (C19383o.m32792b(str3, "")) {
                Context context5 = context;
                mo14008a(new C4107q6(context5, i2Var, w4Var2, (String) null, (String) null, 24, (DefaultConstructorMarker) null));
                this.f9199g = new C3846k0(context5, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
            } else {
                mo14008a(new C4107q6(context, i2Var, w4Var2, str3, str));
                this.f9199g = new C3846k0(context4, str3, str);
            }
            this.f9210r = new C3910l0(context4, brazeConfigurationProvider2, c2Var, this.f9199g);
            C4089q0 q0Var = new C4089q0(mo14009b(), mo14023p(), brazeConfigurationProvider, mo14021n(), x4Var2, mo14017j());
            mo14010c().mo13345a(z2);
            this.f9201i = new C3654f(brazeConfigurationProvider, mo14017j(), o4Var, q0Var, z);
            C4286y0 y0Var = r1;
            C4286y0 y0Var2 = new C4286y0(context, mo14014g(), mo14020m(), mo14019l(), mo14009b(), this.f9199g, mo14018k(), mo14018k().mo13397f(), mo14012e(), mo14015h(), x5Var, f2Var, brazeConfigurationProvider, mo14016i(), x4Var2, mo14011d());
            this.f9204l = y0Var;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
    }

    /* renamed from: b */
    public C4107q6 mo14009b() {
        C4107q6 q6Var = this.f9198f;
        if (q6Var != null) {
            return q6Var;
        }
        C19383o.m32805o("userCache");
        throw null;
    }

    /* renamed from: c */
    public C3700h0 mo14010c() {
        return this.f9205m;
    }

    /* renamed from: d */
    public C3551a5 mo14011d() {
        return this.f9197e;
    }

    /* renamed from: e */
    public C3575b1 mo14012e() {
        return this.f9209q;
    }

    /* renamed from: f */
    public C3661f1 mo14013f() {
        return this.f9218z;
    }

    /* renamed from: g */
    public C4010o mo14014g() {
        return this.f9217y;
    }

    /* renamed from: h */
    public C3879l mo14015h() {
        return this.f9216x;
    }

    /* renamed from: i */
    public C3517a0 mo14016i() {
        return this.f9191A;
    }

    /* renamed from: j */
    public C4311z0 mo14017j() {
        return this.f9200h;
    }

    /* renamed from: k */
    public C3738h6 mo14018k() {
        return this.f9215w;
    }

    /* renamed from: l */
    public C4274x1 mo14019l() {
        return this.f9214v;
    }

    /* renamed from: m */
    public C3654f mo14020m() {
        return this.f9201i;
    }

    /* renamed from: n */
    public C4246v4 mo14021n() {
        return this.f9211s;
    }

    /* renamed from: o */
    public C4286y0 mo14022o() {
        return this.f9204l;
    }

    /* renamed from: p */
    public C3581b2 mo14023p() {
        return this.f9210r;
    }

    /* renamed from: q */
    public C4083q mo14024q() {
        return this.f9212t;
    }

    /* renamed from: r */
    public C4189t mo14025r() {
        return this.f9206n;
    }

    /* renamed from: a */
    public void mo14008a(C4107q6 q6Var) {
        C19383o.m32797g(q6Var, "<set-?>");
        this.f9198f = q6Var;
    }

    /* renamed from: a */
    public void mo14007a() {
        C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C4144a(this, (C19340c<? super C4144a>) null), 3);
    }
}
