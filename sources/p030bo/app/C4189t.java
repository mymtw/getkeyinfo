package p030bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
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
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.t */
public final class C4189t {

    /* renamed from: l */
    public static final C4190a f9301l = new C4190a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final long f9302m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final long f9303n;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f9304a;

    /* renamed from: b */
    private final C4074p2 f9305b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3666f2 f9306c;

    /* renamed from: d */
    private final C3666f2 f9307d;

    /* renamed from: e */
    private final AlarmManager f9308e;

    /* renamed from: f */
    private final int f9309f;

    /* renamed from: g */
    private final boolean f9310g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ReentrantLock f9311h = new ReentrantLock();

    /* renamed from: i */
    private final String f9312i;

    /* renamed from: j */
    private C19699g1 f9313j = C1993m.m4368l();

    /* renamed from: k */
    private C4005n3 f9314k;

    /* renamed from: bo.app.t$a */
    public static final class C4190a {
        private C4190a() {
        }

        public /* synthetic */ C4190a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo14082a() {
            return C4189t.f9303n;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0029 A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002b A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo14084a(double r6, double r8, int r10, boolean r11) {
            /*
                r5 = this;
                java.util.TimeZone r0 = com.braze.support.DateTimeUtils.f11946a
                long r0 = java.lang.System.currentTimeMillis()
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                long r3 = (long) r10
                long r3 = r2.toMillis(r3)
                if (r11 == 0) goto L_0x001f
                long r6 = (long) r6
                long r6 = r2.toMillis(r6)
                long r6 = r6 + r3
                long r8 = r5.mo14082a()
                long r8 = r8 + r6
                int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r6 > 0) goto L_0x002b
                goto L_0x0029
            L_0x001f:
                long r6 = (long) r8
                long r6 = r2.toMillis(r6)
                long r6 = r6 + r3
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 > 0) goto L_0x002b
            L_0x0029:
                r6 = 1
                goto L_0x002c
            L_0x002b:
                r6 = 0
            L_0x002c:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4189t.C4190a.mo14084a(double, double, int, boolean):boolean");
        }

        /* renamed from: a */
        public final long mo14083a(C4005n3 n3Var, int i, boolean z) {
            C19383o.m32797g(n3Var, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis((long) i);
            if (!z) {
                return millis;
            }
            long millis2 = timeUnit.toMillis((long) n3Var.mo13214x());
            TimeZone timeZone = DateTimeUtils.f11946a;
            return Math.max(mo14082a(), (millis2 + millis) - System.currentTimeMillis());
        }
    }

    /* renamed from: bo.app.t$b */
    public static final class C4191b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4191b f9315b = new C4191b();

        public C4191b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cancelling session seal alarm";
        }
    }

    /* renamed from: bo.app.t$c */
    public static final class C4192c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4192c f9316b = new C4192c();

        public C4192c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to cancel session seal alarm";
        }
    }

    /* renamed from: bo.app.t$d */
    public static final class C4193d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f9317b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4193d(long j) {
            super(0);
            this.f9317b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0087d.m236f(C0072d.m201h("Creating a session seal alarm with a delay of "), this.f9317b, " ms");
        }
    }

    /* renamed from: bo.app.t$e */
    public static final class C4194e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4194e f9318b = new C4194e();

        public C4194e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to create session seal alarm";
        }
    }

    /* renamed from: bo.app.t$f */
    public static final class C4195f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4005n3 f9319b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4195f(C4005n3 n3Var) {
            super(0);
            this.f9319b = n3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9319b.mo13210n(), "Clearing completely dispatched sealed session ");
        }
    }

    /* renamed from: bo.app.t$g */
    public static final class C4196g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4005n3 f9320b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4196g(C4005n3 n3Var) {
            super(0);
            this.f9320b = n3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9320b.mo13210n(), "New session created with ID: ");
        }
    }

    /* renamed from: bo.app.t$h */
    public static final class C4197h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4197h f9321b = new C4197h();

        public C4197h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Getting the stored open session";
        }
    }

    /* renamed from: bo.app.t$i */
    public static final class C4198i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4005n3 f9322b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4198i(C4005n3 n3Var) {
            super(0);
            this.f9322b = n3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9322b.mo13210n(), "Checking if this session needs to be sealed: ");
        }
    }

    /* renamed from: bo.app.t$j */
    public static final class C4199j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4005n3 f9323b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4199j(C4005n3 n3Var) {
            super(0);
            this.f9323b = n3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Session [");
            h.append(this.f9323b.mo13210n());
            h.append("] being sealed because its end time is over the grace period. Session: ");
            h.append(this.f9323b);
            return h.toString();
        }
    }

    /* renamed from: bo.app.t$k */
    public static final class C4200k extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C4189t f9324a;

        /* renamed from: bo.app.t$k$a */
        public static final class C4201a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4201a f9325b = new C4201a();

            public C4201a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Session seal logic executing in broadcast";
            }
        }

        @C19060c(mo70540c = "com.braze.managers.BrazeSessionManager$sessionSealReceiver$1$onReceive$2", mo70541f = "BrazeSessionManager.kt", mo70542l = {}, mo70543m = "invokeSuspend")
        /* renamed from: bo.app.t$k$b */
        public static final class C4202b extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

            /* renamed from: b */
            public int f9326b;

            /* renamed from: c */
            private /* synthetic */ Object f9327c;

            /* renamed from: d */
            public final /* synthetic */ C4189t f9328d;

            /* renamed from: e */
            public final /* synthetic */ BroadcastReceiver.PendingResult f9329e;

            /* renamed from: bo.app.t$k$b$a */
            public static final class C4203a extends Lambda implements C19846a<String> {

                /* renamed from: b */
                public static final C4203a f9330b = new C4203a();

                public C4203a() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Failed to log throwable during seal session.";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4202b(C4189t tVar, BroadcastReceiver.PendingResult pendingResult, C19340c<? super C4202b> cVar) {
                super(2, cVar);
                this.f9328d = tVar;
                this.f9329e = pendingResult;
            }

            /* renamed from: a */
            public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                return ((C4202b) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
            }

            public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                C4202b bVar = new C4202b(this.f9328d, this.f9329e, cVar);
                bVar.f9327c = obj;
                return bVar;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r0 = r6.f9326b
                    if (r0 != 0) goto L_0x0045
                    androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                    java.lang.Object r7 = r6.f9327c
                    r1 = r7
                    kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                    bo.app.t r7 = r6.f9328d
                    java.util.concurrent.locks.ReentrantLock r7 = r7.f9311h
                    bo.app.t r0 = r6.f9328d
                    r7.lock()
                    r0.m9623k()     // Catch:{ Exception -> 0x001f }
                    goto L_0x0034
                L_0x001d:
                    r0 = move-exception
                    goto L_0x0041
                L_0x001f:
                    r3 = move-exception
                    bo.app.f2 r0 = r0.f9306c     // Catch:{ Exception -> 0x002a }
                    java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
                    r0.mo13286a(r3, r2)     // Catch:{ Exception -> 0x002a }
                    goto L_0x0034
                L_0x002a:
                    com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a     // Catch:{ all -> 0x001d }
                    com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.E     // Catch:{ all -> 0x001d }
                    bo.app.t$k$b$a r4 = p030bo.app.C4189t.C4200k.C4202b.C4203a.f9330b     // Catch:{ all -> 0x001d }
                    r5 = 4
                    com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x001d }
                L_0x0034:
                    kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x001d }
                    r7.unlock()
                    android.content.BroadcastReceiver$PendingResult r7 = r6.f9329e
                    r7.finish()
                    kotlin.m r7 = kotlin.C19394m.f43287a
                    return r7
                L_0x0041:
                    r7.unlock()
                    throw r0
                L_0x0045:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4189t.C4200k.C4202b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C4200k(C4189t tVar) {
            this.f9324a = tVar;
        }

        public void onReceive(Context context, Intent intent) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent, "intent");
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C4201a.f9325b, 6);
            C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C4202b(this.f9324a, goAsync(), (C19340c<? super C4202b>) null), 3);
        }
    }

    @C19060c(mo70540c = "com.braze.managers.BrazeSessionManager$startSessionStopFlushTimer$1", mo70541f = "BrazeSessionManager.kt", mo70542l = {328}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.t$l */
    public static final class C4204l extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9331b;

        /* renamed from: c */
        private /* synthetic */ Object f9332c;

        /* renamed from: d */
        public final /* synthetic */ C4189t f9333d;

        /* renamed from: bo.app.t$l$a */
        public static final class C4205a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4205a f9334b = new C4205a();

            public C4205a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush on internal session close flush timer.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4204l(C4189t tVar, C19340c<? super C4204l> cVar) {
            super(2, cVar);
            this.f9333d = tVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C4204l) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C4204l lVar = new C4204l(this.f9333d, cVar);
            lVar.f9332c = obj;
            return lVar;
        }

        public final Object invokeSuspend(Object obj) {
            C19525d0 d0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f9331b;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19525d0 d0Var2 = (C19525d0) this.f9332c;
                long a = C4189t.f9302m;
                this.f9332c = d0Var2;
                this.f9331b = 1;
                if (C18263b.m30814I(a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                d0Var = d0Var2;
            } else if (i == 1) {
                C0761x.m1684O0(obj);
                d0Var = (C19525d0) this.f9332c;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var, (BrazeLogger.Priority) null, (Throwable) null, C4205a.f9334b, 7);
            Braze.f11170m.mo15515f(this.f9333d.f9304a).mo15510z();
            return C19394m.f43287a;
        }
    }

    /* renamed from: bo.app.t$m */
    public static final class C4206m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4005n3 f9335b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4206m(C4005n3 n3Var) {
            super(0);
            this.f9335b = n3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9335b.mo13210n(), "Closed session with id ");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9302m = timeUnit.toMillis(10);
        f9303n = timeUnit.toMillis(10);
    }

    public C4189t(Context context, C4074p2 p2Var, C3666f2 f2Var, C3666f2 f2Var2, AlarmManager alarmManager, int i, boolean z) {
        C19383o.m32797g(context, "applicationContext");
        C19383o.m32797g(p2Var, "sessionStorageManager");
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(f2Var2, "externalEventPublisher");
        C19383o.m32797g(alarmManager, "alarmManager");
        this.f9304a = context;
        this.f9305b = p2Var;
        this.f9306c = f2Var;
        this.f9307d = f2Var2;
        this.f9308e = alarmManager;
        this.f9309f = i;
        this.f9310g = z;
        C4200k kVar = new C4200k(this);
        String l = C19383o.m32802l(".intent.BRAZE_SESSION_SHOULD_SEAL", context.getPackageName());
        this.f9312i = l;
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(kVar, new IntentFilter(l), 4);
        } else {
            context.registerReceiver(kVar, new IntentFilter(l));
        }
    }

    /* renamed from: e */
    private final void m9620e() {
        C4005n3 n3Var = this.f9314k;
        if (n3Var != null) {
            long a = f9301l.mo14083a(n3Var, this.f9309f, this.f9310g);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4193d(a), 7);
            try {
                Intent intent = new Intent(this.f9312i);
                intent.putExtra("session_id", n3Var.toString());
                IntentUtils intentUtils = IntentUtils.f11948a;
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f9304a, 0, intent, 1140850688);
                AlarmManager alarmManager = this.f9308e;
                TimeZone timeZone = DateTimeUtils.f11946a;
                alarmManager.set(1, System.currentTimeMillis() + a, broadcast);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4194e.f9318b, 4);
            }
        }
    }

    /* renamed from: f */
    private final boolean m9621f() {
        ReentrantLock reentrantLock = this.f9311h;
        reentrantLock.lock();
        try {
            m9623k();
            C4005n3 h = mo14076h();
            boolean z = false;
            if (h != null) {
                if (!h.mo13215y()) {
                    if (h.mo13213w() != null) {
                        h.mo13207a((Double) null);
                        z = true;
                    }
                    return z;
                }
            }
            m9622i();
            if (h != null) {
                if (h.mo13215y()) {
                    z = true;
                }
            }
            if (z) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4195f(h), 7);
                this.f9305b.mo13674a(h.mo13210n().toString());
            }
            z = true;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    private final void m9622i() {
        C4005n3 n3Var = new C4005n3((C3670f5) null, ShadowDrawableWrapper.COS_45, (Double) null, false, 15, (DefaultConstructorMarker) null);
        this.f9314k = n3Var;
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C4196g(n3Var), 6);
        this.f9306c.mo13286a(new C3651e5(n3Var), C3651e5.class);
        this.f9307d.mo13286a(new SessionStateChangedEvent(n3Var.mo13210n().toString(), SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m9623k() {
        ReentrantLock reentrantLock = this.f9311h;
        reentrantLock.lock();
        try {
            if (mo14076h() == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4197h.f9321b, 7);
                C3624d5 a = this.f9305b.mo13672a();
                mo14073a(a == null ? null : a.mo13216z());
            }
            C4005n3 h = mo14076h();
            if (h != null) {
                BrazeLogger brazeLogger = BrazeLogger.f11932a;
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C4198i(h), 7);
                Double w = h.mo13213w();
                if (w != null && !h.mo13215y()) {
                    if (f9301l.mo14084a(h.mo13214x(), w.doubleValue(), this.f9309f, this.f9310g)) {
                        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new C4199j(h), 6);
                        mo14078l();
                        C4074p2 p2Var = this.f9305b;
                        C4005n3 h2 = mo14076h();
                        p2Var.mo13674a(String.valueOf(h2 == null ? null : h2.mo13210n()));
                        mo14073a((C4005n3) null);
                    }
                }
                C19394m mVar = C19394m.f43287a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final C3670f5 mo14075g() {
        ReentrantLock reentrantLock = this.f9311h;
        reentrantLock.lock();
        try {
            m9623k();
            C4005n3 h = mo14076h();
            return h == null ? null : h.mo13210n();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final C4005n3 mo14076h() {
        return this.f9314k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1.mo13215y() == true) goto L_0x0015;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14077j() {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f9311h
            r0.lock()
            bo.app.n3 r1 = r3.mo14076h()     // Catch:{ all -> 0x0019 }
            r2 = 1
            if (r1 != 0) goto L_0x000d
            goto L_0x0014
        L_0x000d:
            boolean r1 = r1.mo13215y()     // Catch:{ all -> 0x0019 }
            if (r1 != r2) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r0.unlock()
            return r2
        L_0x0019:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4189t.mo14077j():boolean");
    }

    /* renamed from: l */
    public final void mo14078l() {
        C4005n3 n3Var = this.f9314k;
        if (n3Var != null) {
            ReentrantLock reentrantLock = this.f9311h;
            reentrantLock.lock();
            try {
                n3Var.mo13780A();
                this.f9305b.mo13673a((C3624d5) n3Var);
                this.f9306c.mo13286a(new C3692g5(n3Var), C3692g5.class);
                this.f9307d.mo13286a(new SessionStateChangedEvent(n3Var.mo13210n().toString(), SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                C19394m mVar = C19394m.f43287a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: m */
    public final void mo14079m() {
        ReentrantLock reentrantLock = this.f9311h;
        reentrantLock.lock();
        try {
            if (m9621f()) {
                C4005n3 h = mo14076h();
                if (h != null) {
                    this.f9305b.mo13673a((C3624d5) h);
                }
            }
            mo14074d();
            m9618c();
            this.f9306c.mo13286a(C3736h5.f8523b, C3736h5.class);
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final void mo14080n() {
        this.f9313j.mo72134a((CancellationException) null);
        this.f9313j = C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C4204l(this, (C19340c<? super C4204l>) null), 3);
    }

    /* renamed from: o */
    public final void mo14081o() {
        ReentrantLock reentrantLock = this.f9311h;
        reentrantLock.lock();
        try {
            m9621f();
            C4005n3 h = mo14076h();
            if (h != null) {
                h.mo13207a(Double.valueOf(DateTimeUtils.m11303e()));
                this.f9305b.mo13673a((C3624d5) h);
                mo14080n();
                m9620e();
                this.f9306c.mo13286a(C3841j5.f8718b, C3841j5.class);
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4206m(h), 7);
                C19394m mVar = C19394m.f43287a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    private final void m9618c() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4191b.f9315b, 7);
        try {
            Intent intent = new Intent(this.f9312i);
            intent.putExtra("session_id", String.valueOf(this.f9314k));
            IntentUtils intentUtils = IntentUtils.f11948a;
            this.f9308e.cancel(PendingIntent.getBroadcast(this.f9304a, 0, intent, 1140850688));
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4192c.f9316b, 4);
        }
    }

    /* renamed from: d */
    public final void mo14074d() {
        this.f9313j.mo72134a((CancellationException) null);
    }

    /* renamed from: a */
    public final void mo14073a(C4005n3 n3Var) {
        this.f9314k = n3Var;
    }
}
