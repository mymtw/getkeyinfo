package p030bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.foundation.layout.C0761x;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.h0 */
public final class C3700h0 {

    /* renamed from: n */
    public static final C3706c f8461n = new C3706c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8462a;

    /* renamed from: b */
    private final C3675g0 f8463b;

    /* renamed from: c */
    private BroadcastReceiver f8464c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f8465d;

    /* renamed from: e */
    private final C3615d1 f8466e = new C3615d1((int) TimeUnit.MINUTES.toMillis(5), 0, 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3783i5 f8467f = C3783i5.NO_SESSION;

    /* renamed from: g */
    private long f8468g = -1;

    /* renamed from: h */
    private volatile boolean f8469h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ConnectivityManager f8470i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4103q3 f8471j;

    /* renamed from: k */
    private C19699g1 f8472k;

    /* renamed from: l */
    private int f8473l;

    /* renamed from: m */
    private boolean f8474m;

    /* renamed from: bo.app.h0$a */
    public static final class C3701a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public final /* synthetic */ C3700h0 f8475a;

        public C3701a(C3700h0 h0Var) {
            this.f8475a = h0Var;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C19383o.m32797g(network, "network");
            C19383o.m32797g(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            this.f8475a.m8695a(networkCapabilities);
        }

        public void onLost(Network network) {
            C19383o.m32797g(network, "network");
            super.onLost(network);
            Network activeNetwork = this.f8475a.f8470i.getActiveNetwork();
            C3700h0 h0Var = this.f8475a;
            h0Var.m8695a(h0Var.f8470i.getNetworkCapabilities(activeNetwork));
        }
    }

    /* renamed from: bo.app.h0$b */
    public static final class C3702b extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C3700h0 f8476a;

        /* renamed from: b */
        public final /* synthetic */ C3666f2 f8477b;

        @C19060c(mo70540c = "com.braze.dispatch.DataSyncPolicyProvider$2$onReceive$1", mo70541f = "DataSyncPolicyProvider.kt", mo70542l = {}, mo70543m = "invokeSuspend")
        /* renamed from: bo.app.h0$b$a */
        public static final class C3703a extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

            /* renamed from: b */
            public int f8478b;

            /* renamed from: c */
            private /* synthetic */ Object f8479c;

            /* renamed from: d */
            public final /* synthetic */ C3700h0 f8480d;

            /* renamed from: e */
            public final /* synthetic */ Intent f8481e;

            /* renamed from: f */
            public final /* synthetic */ C3666f2 f8482f;

            /* renamed from: g */
            public final /* synthetic */ BroadcastReceiver.PendingResult f8483g;

            /* renamed from: bo.app.h0$b$a$a */
            public static final class C3704a extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public static final C3704a f8484b = new C3704a();

                public C3704a() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Retrieving connectivity event data in background";
                }
            }

            /* renamed from: bo.app.h0$b$a$b */
            public static final class C3705b extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public static final C3705b f8485b = new C3705b();

                public C3705b() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Failed to process connectivity event.";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3703a(C3700h0 h0Var, Intent intent, C3666f2 f2Var, BroadcastReceiver.PendingResult pendingResult, C19340c<? super C3703a> cVar) {
                super(2, cVar);
                this.f8480d = h0Var;
                this.f8481e = intent;
                this.f8482f = f2Var;
                this.f8483g = pendingResult;
            }

            /* renamed from: a */
            public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                return ((C3703a) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
            }

            public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                C3703a aVar = new C3703a(this.f8480d, this.f8481e, this.f8482f, this.f8483g, cVar);
                aVar.f8479c = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f8478b == 0) {
                    C0761x.m1684O0(obj);
                    C19525d0 d0Var = (C19525d0) this.f8479c;
                    BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var, BrazeLogger.Priority.V, (Throwable) null, C3704a.f8484b, 6);
                    try {
                        C3700h0 h0Var = this.f8480d;
                        h0Var.f8471j = C4238v.m9715a(this.f8481e, h0Var.f8470i);
                        this.f8480d.mo13347c();
                    } catch (Exception e) {
                        Exception exc = e;
                        BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var, BrazeLogger.Priority.E, exc, C3705b.f8485b, 4);
                        this.f8480d.m8696a(this.f8482f, (Throwable) exc);
                    }
                    this.f8483g.finish();
                    return C19394m.f43287a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C3702b(C3700h0 h0Var, C3666f2 f2Var) {
            this.f8476a = h0Var;
            this.f8477b = f2Var;
        }

        public void onReceive(Context context, Intent intent) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent, "intent");
            Intent intent2 = intent;
            C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C3703a(this.f8476a, intent2, this.f8477b, goAsync(), (C19340c<? super C3703a>) null), 3);
        }
    }

    /* renamed from: bo.app.h0$c */
    public static final class C3706c {
        private C3706c() {
        }

        public /* synthetic */ C3706c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.h0$d */
    public /* synthetic */ class C3707d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8486a;

        static {
            int[] iArr = new int[C4103q3.values().length];
            iArr[C4103q3.NONE.ordinal()] = 1;
            iArr[C4103q3.BAD.ordinal()] = 2;
            iArr[C4103q3.GREAT.ordinal()] = 3;
            iArr[C4103q3.GOOD.ordinal()] = 4;
            f8486a = iArr;
        }
    }

    /* renamed from: bo.app.h0$e */
    public static final class C3708e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3708e f8487b = new C3708e();

        public C3708e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received network error event. Backing off.";
        }
    }

    /* renamed from: bo.app.h0$f */
    public static final class C3709f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3700h0 f8488b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3709f(C3700h0 h0Var) {
            super(0);
            this.f8488b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Long.valueOf(this.f8488b.mo13346b()), "Received successful request flush. Default flush interval reset to ");
        }
    }

    /* renamed from: bo.app.h0$g */
    public static final class C3710g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8489b;

        /* renamed from: c */
        public final /* synthetic */ C3700h0 f8490c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3710g(long j, C3700h0 h0Var) {
            super(0);
            this.f8489b = j;
            this.f8490c = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Kicking off the Sync Job. initialDelaysMs: ");
            h.append(this.f8489b);
            h.append(": currentIntervalMs ");
            h.append(this.f8490c.mo13346b());
            h.append(" ms");
            return h.toString();
        }
    }

    @C19060c(mo70540c = "com.braze.dispatch.DataSyncPolicyProvider$kickoffSyncJob$2", mo70541f = "DataSyncPolicyProvider.kt", mo70542l = {169, 173}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.h0$h */
    public static final class C3711h extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public long f8491b;

        /* renamed from: c */
        public int f8492c;

        /* renamed from: d */
        private /* synthetic */ Object f8493d;

        /* renamed from: e */
        public final /* synthetic */ C3700h0 f8494e;

        /* renamed from: f */
        public final /* synthetic */ long f8495f;

        /* renamed from: bo.app.h0$h$a */
        public static final class C3712a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C3712a f8496b = new C3712a();

            public C3712a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush from automatic sync policy";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3711h(C3700h0 h0Var, long j, C19340c<? super C3711h> cVar) {
            super(2, cVar);
            this.f8494e = h0Var;
            this.f8495f = j;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C3711h) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C3711h hVar = new C3711h(this.f8494e, this.f8495f, cVar);
            hVar.f8493d = obj;
            return hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.d0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.f8492c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                long r3 = r11.f8491b
                java.lang.Object r1 = r11.f8493d
                kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r12)
                r12 = r11
            L_0x0016:
                r9 = r3
                goto L_0x006b
            L_0x0018:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0020:
                long r3 = r11.f8491b
                java.lang.Object r1 = r11.f8493d
                kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r12)
                goto L_0x0048
            L_0x002a:
                androidx.compose.foundation.layout.C0761x.m1684O0(r12)
                java.lang.Object r12 = r11.f8493d
                r1 = r12
                kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                bo.app.h0 r12 = r11.f8494e
                long r4 = r12.mo13346b()
                long r6 = r11.f8495f
                r11.f8493d = r1
                r11.f8491b = r4
                r11.f8492c = r3
                java.lang.Object r12 = p628nj.C18263b.m30814I(r6, r11)
                if (r12 != r0) goto L_0x0047
                return r0
            L_0x0047:
                r3 = r4
            L_0x0048:
                com.braze.Braze$Companion r12 = com.braze.Braze.f11170m
                bo.app.h0 r5 = r11.f8494e
                android.content.Context r5 = r5.f8462a
                com.braze.Braze r12 = r12.mo15515f(r5)
                r12.mo15510z()
                r12 = r11
            L_0x0058:
                boolean r5 = kotlinx.coroutines.C19697g.m33467e(r1)
                if (r5 == 0) goto L_0x0088
                r12.f8493d = r1
                r12.f8491b = r3
                r12.f8492c = r2
                java.lang.Object r5 = p628nj.C18263b.m30814I(r3, r12)
                if (r5 != r0) goto L_0x0016
                return r0
            L_0x006b:
                com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.V
                bo.app.h0$h$a r7 = p030bo.app.C3700h0.C3711h.C3712a.f8496b
                r6 = 0
                r8 = 6
                r4 = r1
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                com.braze.Braze$Companion r3 = com.braze.Braze.f11170m
                bo.app.h0 r4 = r12.f8494e
                android.content.Context r4 = r4.f8462a
                com.braze.Braze r3 = r3.mo15515f(r4)
                r3.mo15510z()
                r3 = r9
                goto L_0x0058
            L_0x0088:
                kotlin.m r12 = kotlin.C19394m.f43287a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3700h0.C3711h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: bo.app.h0$i */
    public static final class C3713i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3700h0 f8497b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3713i(C3700h0 h0Var) {
            super(0);
            this.f8497b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Data flush interval is ");
            h.append(this.f8497b.mo13346b());
            h.append(" ms. Not scheduling a proceeding data flush.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h0$j */
    public static final class C3714j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3714j f8498b = new C3714j();

        public C3714j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log throwable.";
        }
    }

    /* renamed from: bo.app.h0$k */
    public static final class C3715k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3700h0 f8499b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3715k(C3700h0 h0Var) {
            super(0);
            this.f8499b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("recalculateDispatchState called with session state: ");
            h.append(this.f8499b.f8467f);
            h.append(" lastNetworkLevel: ");
            h.append(this.f8499b.f8471j);
            return h.toString();
        }
    }

    /* renamed from: bo.app.h0$l */
    public static final class C3716l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3700h0 f8500b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3716l(C3700h0 h0Var) {
            super(0);
            this.f8500b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Flush interval was too low (");
            h.append(this.f8500b.mo13346b());
            h.append("), moving to minimum of 1000 ms");
            return h.toString();
        }
    }

    /* renamed from: bo.app.h0$m */
    public static final class C3717m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3700h0 f8501b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3717m(C3700h0 h0Var) {
            super(0);
            this.f8501b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Long.valueOf(this.f8501b.mo13346b()), "currentIntervalMs: ");
        }
    }

    /* renamed from: bo.app.h0$n */
    public static final class C3718n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8502b;

        /* renamed from: c */
        public final /* synthetic */ C3700h0 f8503c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3718n(long j, C3700h0 h0Var) {
            super(0);
            this.f8502b = j;
            this.f8503c = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Data flush interval has changed from ");
            h.append(this.f8502b);
            h.append(" ms to ");
            h.append(this.f8503c.mo13346b());
            h.append(" ms after connectivity state change to: ");
            h.append(this.f8503c.f8471j);
            h.append(" and session state: ");
            h.append(this.f8503c.f8467f);
            return h.toString();
        }
    }

    /* renamed from: bo.app.h0$o */
    public static final class C3719o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f8504b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3719o(long j) {
            super(0);
            this.f8504b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0087d.m236f(C0072d.m201h("Posting new sync runnable with delay "), this.f8504b, " ms");
        }
    }

    /* renamed from: bo.app.h0$p */
    public static final class C3720p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3720p f8505b = new C3720p();

        public C3720p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is already running. Ignoring request.";
        }
    }

    /* renamed from: bo.app.h0$q */
    public static final class C3721q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3721q f8506b = new C3721q();

        public C3721q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Data sync started";
        }
    }

    /* renamed from: bo.app.h0$r */
    public static final class C3722r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3722r f8507b = new C3722r();

        public C3722r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is not running. Ignoring request.";
        }
    }

    /* renamed from: bo.app.h0$s */
    public static final class C3723s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3723s f8508b = new C3723s();

        public C3723s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Data sync stopped";
        }
    }

    /* renamed from: bo.app.h0$t */
    public static final class C3724t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3724t f8509b = new C3724t();

        public C3724t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to unregister Connectivity callback";
        }
    }

    public C3700h0(Context context, C3666f2 f2Var, C3675g0 g0Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(f2Var, "eventPublisher");
        C19383o.m32797g(g0Var, "dataSyncConfigurationProvider");
        this.f8462a = context;
        this.f8463b = g0Var;
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.f8470i = (ConnectivityManager) systemService;
            this.f8471j = C4103q3.NONE;
            if (Build.VERSION.SDK_INT >= 30) {
                this.f8465d = new C3701a(this);
            } else {
                this.f8464c = new C3702b(this, f2Var);
            }
            mo13344a(f2Var);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: e */
    public final synchronized boolean mo13349e() {
        if (this.f8469h) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3720p.f8505b, 7);
            return false;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3721q.f8506b, 7);
        mo13348d();
        m8706b(this.f8468g);
        this.f8469h = true;
        return true;
    }

    /* renamed from: f */
    public final synchronized boolean mo13350f() {
        if (!this.f8469h) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3722r.f8507b, 7);
            return false;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3723s.f8508b, 7);
        m8694a();
        mo13351g();
        this.f8469h = false;
        return true;
    }

    /* renamed from: g */
    public final void mo13351g() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = this.f8470i;
                ConnectivityManager.NetworkCallback networkCallback = this.f8465d;
                if (networkCallback != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                } else {
                    C19383o.m32805o("connectivityNetworkCallback");
                    throw null;
                }
            } else {
                this.f8462a.unregisterReceiver(this.f8464c);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3724t.f8509b, 4);
        }
    }

    /* renamed from: b */
    public final long mo13346b() {
        return this.f8468g;
    }

    /* renamed from: c */
    public final void mo13347c() {
        long j;
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C3715k(this), 6);
        long j2 = this.f8468g;
        if (this.f8467f == C3783i5.NO_SESSION || this.f8474m || this.f8473l >= 50) {
            this.f8468g = -1;
        } else {
            int i = C3707d.f8486a[this.f8471j.ordinal()];
            if (i == 1) {
                j = -1;
            } else if (i == 2) {
                j = this.f8463b.mo13311a();
            } else if (i == 3) {
                j = this.f8463b.mo13313c();
            } else if (i == 4) {
                j = this.f8463b.mo13312b();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f8468g = j;
            if (j != -1 && j < 1000) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new C3716l(this), 6);
                this.f8468g = 1000;
            }
        }
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C3717m(this), 6);
        if (j2 != this.f8468g) {
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C3718n(j2, this), 7);
            m8706b(this.f8468g);
        }
    }

    /* renamed from: d */
    public final void mo13348d() {
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f8470i;
            ConnectivityManager.NetworkCallback networkCallback = this.f8465d;
            if (networkCallback != null) {
                connectivityManager.registerDefaultNetworkCallback(networkCallback);
                m8695a(this.f8470i.getNetworkCapabilities(this.f8470i.getActiveNetwork()));
                return;
            }
            C19383o.m32805o("connectivityNetworkCallback");
            throw null;
        }
        this.f8462a.registerReceiver(this.f8464c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: b */
    private final void m8706b(long j) {
        m8694a();
        if (this.f8468g >= 1000) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3719o(j), 7);
            this.f8472k = m8693a(j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13345a(boolean z) {
        this.f8474m = z;
        mo13347c();
        if (z) {
            mo13350f();
        } else {
            mo13349e();
        }
    }

    /* renamed from: a */
    private final C19699g1 m8693a(long j) {
        if (this.f8468g >= 1000) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3710g(j, this), 6);
            return C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C3711h(this, j, (C19340c<? super C3711h>) null), 3);
        }
        Braze.f11170m.mo15515f(this.f8462a).mo15510z();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3713i(this), 7);
        return null;
    }

    /* renamed from: a */
    private final void m8694a() {
        C19699g1 g1Var = this.f8472k;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        this.f8472k = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8696a(C3666f2 f2Var, Throwable th) {
        try {
            f2Var.mo13286a(th, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3714j.f8498b, 4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8695a(NetworkCapabilities networkCapabilities) {
        this.f8471j = C4238v.m9716a(networkCapabilities);
        mo13347c();
    }

    /* renamed from: a */
    public final void mo13344a(C3666f2 f2Var) {
        C19383o.m32797g(f2Var, "eventManager");
        f2Var.mo13287a(new C4250v6(this, 0), C3736h5.class);
        f2Var.mo13287a(new C4268w6(this), C3841j5.class);
        f2Var.mo13287a(new C4284x6(this, 0), C4104q4.class);
        f2Var.mo13287a(new C4308y6(this, 0), C4139r4.class);
        f2Var.mo13287a(new C4349z6(this, 0), C3605c5.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8700a(C3700h0 h0Var, C3736h5 h5Var) {
        C19383o.m32797g(h0Var, "this$0");
        C19383o.m32797g(h5Var, "it");
        h0Var.f8467f = C3783i5.OPEN_SESSION;
        h0Var.f8473l = 0;
        h0Var.mo13347c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8701a(C3700h0 h0Var, C3841j5 j5Var) {
        C19383o.m32797g(h0Var, "this$0");
        C19383o.m32797g(j5Var, "it");
        h0Var.f8467f = C3783i5.NO_SESSION;
        h0Var.mo13347c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8703a(C3700h0 h0Var, C4104q4 q4Var) {
        C19383o.m32797g(h0Var, "this$0");
        C19383o.m32797g(q4Var, "it");
        BrazeLogger.m11282d(BrazeLogger.f11932a, h0Var, (BrazeLogger.Priority) null, (Throwable) null, C3708e.f8487b, 7);
        long j = h0Var.f8468g;
        h0Var.m8706b(j + ((long) h0Var.f8466e.mo13189a((int) j)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8704a(C3700h0 h0Var, C4139r4 r4Var) {
        C19383o.m32797g(h0Var, "this$0");
        C19383o.m32797g(r4Var, "it");
        if (h0Var.f8466e.mo13190b()) {
            h0Var.f8466e.mo13191c();
            BrazeLogger.m11282d(BrazeLogger.f11932a, h0Var, (BrazeLogger.Priority) null, (Throwable) null, new C3709f(h0Var), 7);
            h0Var.m8706b(h0Var.f8468g);
        }
        h0Var.f8473l = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8698a(C3700h0 h0Var, C3605c5 c5Var) {
        C19383o.m32797g(h0Var, "this$0");
        C19383o.m32797g(c5Var, "$dstr$responseError");
        if (c5Var.mo13165a() instanceof C4235u4) {
            h0Var.f8473l++;
            h0Var.mo13347c();
        }
    }
}
