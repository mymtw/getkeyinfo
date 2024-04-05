package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.facebook.login.LoginFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.channels.C19503g;
import p568fn.C17782b;
import p744gq.C19060c;
import p753kq.C19846a;

/* renamed from: bo.app.q0 */
public final class C4089q0 implements C3620d2 {

    /* renamed from: j */
    public static final C4090a f9102j = new C4090a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C4107q6 f9103a;

    /* renamed from: b */
    private final C3581b2 f9104b;

    /* renamed from: c */
    private final BrazeConfigurationProvider f9105c;

    /* renamed from: d */
    private final C4246v4 f9106d;

    /* renamed from: e */
    private final C4279x4 f9107e;

    /* renamed from: f */
    private final C19499d<C4296y1> f9108f = C17782b.m29872l(1000, (BufferOverflow) null, 6);

    /* renamed from: g */
    private final ConcurrentHashMap<String, C4208t1> f9109g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private final ConcurrentHashMap<String, C4208t1> f9110h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private final AtomicInteger f9111i = new AtomicInteger(0);

    /* renamed from: bo.app.q0$a */
    public static final class C4090a {

        /* renamed from: bo.app.q0$a$a */
        public static final class C4091a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ C4246v4 f9112b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4091a(C4246v4 v4Var) {
                super(0);
                this.f9112b = v4Var;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Adding SDK Auth token to request '");
                h.append(this.f9112b.mo14134a());
                h.append('\'');
                return h.toString();
            }
        }

        /* renamed from: bo.app.q0$a$b */
        public static final class C4092b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4092b f9113b = new C4092b();

            public C4092b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK Auth is disabled, not adding token to request";
            }
        }

        private C4090a() {
        }

        public /* synthetic */ C4090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo13902a(C3581b2 b2Var, BrazeConfigurationProvider brazeConfigurationProvider, C4246v4 v4Var, C4296y1 y1Var) {
            C19383o.m32797g(b2Var, "deviceDataProvider");
            C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
            C19383o.m32797g(v4Var, "sdkAuthenticationCache");
            C19383o.m32797g(y1Var, "brazeRequest");
            String deviceId = b2Var.getDeviceId();
            if (deviceId != null) {
                y1Var.mo13960b(deviceId);
            }
            y1Var.mo13967f(brazeConfigurationProvider.getBrazeApiKey().toString());
            y1Var.mo13968g(Constants.APPBOY_SDK_VERSION);
            y1Var.mo13958a(Long.valueOf(DateTimeUtils.m11302d()));
            if (brazeConfigurationProvider.isSdkAuthenticationEnabled()) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4091a(v4Var), 6);
                y1Var.mo13963d(v4Var.mo14134a());
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C4092b.f9113b, 6);
        }
    }

    /* renamed from: bo.app.q0$b */
    public static final class C4093b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4093b f9114b = new C4093b();

        public C4093b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Network requests are offline, not adding request to queue.";
        }
    }

    /* renamed from: bo.app.q0$c */
    public static final class C4094c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4296y1 f9115b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4094c(C4296y1 y1Var) {
            super(0);
            this.f9115b = y1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9115b, "A maximum of 5 invalid api key errors reached. Device data will remain unaffected after dropping this request ");
        }
    }

    /* renamed from: bo.app.q0$d */
    public static final class C4095d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9116b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4095d(String str) {
            super(0);
            this.f9116b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9116b, "Added request to dispatcher with parameters: \n");
        }
    }

    /* renamed from: bo.app.q0$e */
    public static final class C4096e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9117b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4096e(String str) {
            super(0);
            this.f9117b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9117b, "Could not add request to dispatcher as queue is full or closed. Marking as complete. Incoming Request: \n");
        }
    }

    /* renamed from: bo.app.q0$f */
    public static final class C4097f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4208t1 f9118b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4097f(C4208t1 t1Var) {
            super(0);
            this.f9118b = t1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Event dispatched: ");
            h.append(this.f9118b.forJsonPut());
            h.append(" with uid: ");
            h.append(this.f9118b.mo13454r());
            return h.toString();
        }
    }

    /* renamed from: bo.app.q0$g */
    public static final class C4098g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4098g f9119b = new C4098g();

        public C4098g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
        }
    }

    /* renamed from: bo.app.q0$h */
    public static final class C4099h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4099h f9120b = new C4099h();

        public C4099h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Flushing pending events to dispatcher map";
        }
    }

    @C19060c(mo70540c = "com.braze.dispatch.DispatchManager", mo70541f = "DispatchManager.kt", mo70542l = {168}, mo70543m = "takeRequest")
    /* renamed from: bo.app.q0$i */
    public static final class C4100i extends ContinuationImpl {

        /* renamed from: b */
        public Object f9121b;

        /* renamed from: c */
        public /* synthetic */ Object f9122c;

        /* renamed from: d */
        public final /* synthetic */ C4089q0 f9123d;

        /* renamed from: e */
        public int f9124e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4100i(C4089q0 q0Var, C19340c<? super C4100i> cVar) {
            super(cVar);
            this.f9123d = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9122c = obj;
            this.f9124e |= Integer.MIN_VALUE;
            return this.f9123d.mo13893a((C19340c<? super C4296y1>) this);
        }
    }

    public C4089q0(C4107q6 q6Var, C3581b2 b2Var, BrazeConfigurationProvider brazeConfigurationProvider, C4246v4 v4Var, C4279x4 x4Var, C3666f2 f2Var) {
        C19383o.m32797g(q6Var, "userCache");
        C19383o.m32797g(b2Var, "deviceDataProvider");
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        C19383o.m32797g(v4Var, "sdkAuthenticationCache");
        C19383o.m32797g(x4Var, "sdkMetadataCache");
        C19383o.m32797g(f2Var, "internalEventPublisher");
        this.f9103a = q6Var;
        this.f9104b = b2Var;
        this.f9105c = brazeConfigurationProvider;
        this.f9106d = v4Var;
        this.f9107e = x4Var;
        f2Var.mo13287a(new C4284x6(this, 1), C3690g3.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9382a(C4089q0 q0Var, C3690g3 g3Var) {
        C19383o.m32797g(q0Var, "this$0");
        C19383o.m32797g(g3Var, "it");
        q0Var.f9111i.incrementAndGet();
    }

    /* renamed from: b */
    public synchronized void mo13898b(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        this.f9110h.putIfAbsent(t1Var.mo13454r(), t1Var);
    }

    /* renamed from: c */
    public final boolean mo13900c() {
        Braze.Companion companion = Braze.f11170m;
        return Braze.f11178u;
    }

    /* renamed from: d */
    public final C4296y1 mo13901d() {
        C4296y1 y1Var = (C4296y1) C19503g.m33188b(this.f9108f.mo72144w());
        if (y1Var == null) {
            return null;
        }
        mo13897b(y1Var);
        return y1Var;
    }

    /* renamed from: a */
    public final synchronized C3845k mo13892a() {
        LinkedHashSet linkedHashSet;
        Collection<C4208t1> values = this.f9109g.values();
        C19383o.m32796f(values, "brazeEventMap.values");
        linkedHashSet = new LinkedHashSet();
        Iterator<C4208t1> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4208t1 next = it.next();
            C19383o.m32796f(next, "event");
            linkedHashSet.add(next);
            values.remove(next);
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C4097f(next), 7);
            if (linkedHashSet.size() >= 32) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, C4098g.f9119b, 6);
                break;
            }
        }
        return new C3845k(linkedHashSet);
    }

    /* renamed from: b */
    public final boolean mo13899b() {
        return !this.f9108f.isEmpty();
    }

    /* renamed from: b */
    public final synchronized C4296y1 mo13897b(C4296y1 y1Var) {
        C19383o.m32797g(y1Var, "brazeRequest");
        y1Var.mo13116a(this.f9103a.mo13934f());
        f9102j.mo13902a(this.f9104b, this.f9105c, this.f9106d, y1Var);
        if (y1Var.mo13434g()) {
            mo13896a(y1Var);
        }
        return y1Var;
    }

    /* renamed from: a */
    public synchronized void mo13895a(C3670f5 f5Var) {
        C19383o.m32797g(f5Var, "sessionId");
        if (!this.f9110h.isEmpty()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4099h.f9120b, 7);
            Collection<C4208t1> values = this.f9110h.values();
            C19383o.m32796f(values, "pendingBrazeEventMap.values");
            for (C4208t1 a : values) {
                a.mo13445a(f5Var);
            }
            this.f9109g.putAll(this.f9110h);
            this.f9110h.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13893a(kotlin.coroutines.C19340c<? super p030bo.app.C4296y1> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p030bo.app.C4089q0.C4100i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            bo.app.q0$i r0 = (p030bo.app.C4089q0.C4100i) r0
            int r1 = r0.f9124e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9124e = r1
            goto L_0x0018
        L_0x0013:
            bo.app.q0$i r0 = new bo.app.q0$i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9122c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f9124e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f9121b
            bo.app.q0 r0 = (p030bo.app.C4089q0) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlinx.coroutines.channels.d<bo.app.y1> r5 = r4.f9108f
            r0.f9121b = r4
            r0.f9124e = r3
            java.lang.Object r5 = r5.mo72138o(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            bo.app.y1 r5 = (p030bo.app.C4296y1) r5
            bo.app.y1 r5 = r0.mo13897b((p030bo.app.C4296y1) r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4089q0.mo13893a(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public synchronized void mo13196a(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        this.f9109g.putIfAbsent(t1Var.mo13454r(), t1Var);
    }

    /* renamed from: a */
    public void mo13894a(C3666f2 f2Var, C4296y1 y1Var) {
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        if (mo13900c()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C4093b.f9114b, 6);
        } else if (this.f9111i.get() >= 5) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C4094c(y1Var), 6);
        } else {
            String f = JsonUtils.m11315f(y1Var.mo13119l());
            y1Var.mo13566a(f2Var);
            if (!(this.f9108f.mo72199l(y1Var) instanceof C19503g.C19505b)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4095d(f), 6);
                return;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, (Throwable) null, new C4096e(f), 6);
            y1Var.mo13569b(f2Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13896a(p030bo.app.C4296y1 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "brazeRequest"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)     // Catch:{ all -> 0x0066 }
            bo.app.b2 r0 = r2.f9104b     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r0.mo13137c()     // Catch:{ all -> 0x0066 }
            r3.mo13961c(r0)     // Catch:{ all -> 0x0066 }
            com.braze.configuration.BrazeConfigurationProvider r0 = r2.f9105c     // Catch:{ all -> 0x0066 }
            com.appboy.enums.SdkFlavor r0 = r0.getSdkFlavor()     // Catch:{ all -> 0x0066 }
            r3.mo13957a((com.appboy.enums.SdkFlavor) r0)     // Catch:{ all -> 0x0066 }
            bo.app.b2 r0 = r2.f9104b     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r0.mo13133a()     // Catch:{ all -> 0x0066 }
            r3.mo13965e(r0)     // Catch:{ all -> 0x0066 }
            bo.app.b2 r0 = r2.f9104b     // Catch:{ all -> 0x0066 }
            bo.app.j0 r0 = r0.mo13136b()     // Catch:{ all -> 0x0066 }
            r3.mo13954a((p030bo.app.C3821j0) r0)     // Catch:{ all -> 0x0066 }
            r1 = 1
            if (r0 != 0) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            boolean r0 = r0.mo13523v()     // Catch:{ all -> 0x0066 }
            if (r0 != r1) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x003d
            bo.app.q6 r0 = r2.f9103a     // Catch:{ all -> 0x0066 }
            r0.mo13938h()     // Catch:{ all -> 0x0066 }
        L_0x003d:
            bo.app.q6 r0 = r2.f9103a     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r0.mo13005a()     // Catch:{ all -> 0x0066 }
            bo.app.y3 r0 = (p030bo.app.C4298y3) r0     // Catch:{ all -> 0x0066 }
            r3.mo13956a((p030bo.app.C4298y3) r0)     // Catch:{ all -> 0x0066 }
            bo.app.k r0 = r2.mo13892a()     // Catch:{ all -> 0x0066 }
            r3.mo13955a((p030bo.app.C3845k) r0)     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.mo13552a()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0064
            bo.app.x4 r0 = r2.f9107e     // Catch:{ all -> 0x0066 }
            com.braze.configuration.BrazeConfigurationProvider r1 = r2.f9105c     // Catch:{ all -> 0x0066 }
            java.util.EnumSet r1 = r1.getSdkMetadata()     // Catch:{ all -> 0x0066 }
            java.util.EnumSet r0 = r0.mo14177b(r1)     // Catch:{ all -> 0x0066 }
            r3.mo13959a((java.util.EnumSet<com.braze.enums.BrazeSdkMetadata>) r0)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r2)
            return
        L_0x0066:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4089q0.mo13896a(bo.app.y1):void");
    }
}
