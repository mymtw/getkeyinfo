package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.facebook.login.LoginFragment;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p030bo.app.C4026o0;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.f */
public final class C3654f implements C3620d2 {

    /* renamed from: i */
    public static final C3655a f8385i = new C3655a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f8386j = BrazeLogger.m11287i(C3654f.class);

    /* renamed from: a */
    private final BrazeConfigurationProvider f8387a;

    /* renamed from: b */
    private final C3926l2 f8388b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4089q0 f8389c;

    /* renamed from: d */
    private final boolean f8390d;

    /* renamed from: e */
    private final ReentrantLock f8391e = new ReentrantLock();

    /* renamed from: f */
    private final C4170s0 f8392f;

    /* renamed from: g */
    private volatile boolean f8393g;

    /* renamed from: h */
    private volatile C19699g1 f8394h;

    /* renamed from: bo.app.f$a */
    public static final class C3655a {
        private C3655a() {
        }

        public /* synthetic */ C3655a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.f$b */
    public /* synthetic */ class C3656b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8395a;

        static {
            int[] iArr = new int[C4026o0.C4029b.values().length];
            iArr[C4026o0.C4029b.ADD_PENDING_BRAZE_EVENT.ordinal()] = 1;
            iArr[C4026o0.C4029b.ADD_BRAZE_EVENT.ordinal()] = 2;
            iArr[C4026o0.C4029b.FLUSH_PENDING_BRAZE_EVENTS.ordinal()] = 3;
            iArr[C4026o0.C4029b.ADD_REQUEST.ordinal()] = 4;
            f8395a = iArr;
        }
    }

    @C19060c(mo70540c = "com.braze.dispatch.AutomaticDispatchDecorator$kickoffDispatchJob$1", mo70541f = "AutomaticDispatchDecorator.kt", mo70542l = {128}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.f$c */
    public static final class C3657c extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f8396b;

        /* renamed from: c */
        private /* synthetic */ Object f8397c;

        /* renamed from: d */
        public final /* synthetic */ C3654f f8398d;

        /* renamed from: bo.app.f$c$a */
        public static final class C3658a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Exception f8399b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3658a(Exception exc) {
                super(0);
                this.f8399b = exc;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Automatic thread interrupted! This is usually the result of calling changeUser(). [");
                h.append(this.f8399b);
                h.append(']');
                return h.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3657c(C3654f fVar, C19340c<? super C3657c> cVar) {
            super(2, cVar);
            this.f8398d = fVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C3657c) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C3657c cVar2 = new C3657c(this.f8398d, cVar);
            cVar2.f8397c = obj;
            return cVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[SYNTHETIC, Splitter:B:14:0x0030] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.f8396b
                r2 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r9.f8397c
                kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ Exception -> 0x0014 }
                r3 = r1
                r1 = r0
                r0 = r9
                goto L_0x0046
            L_0x0014:
                r10 = move-exception
                r3 = r1
                r1 = r0
                r0 = r9
                goto L_0x0056
            L_0x0019:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0021:
                androidx.compose.foundation.layout.C0761x.m1684O0(r10)
                java.lang.Object r10 = r9.f8397c
                kotlinx.coroutines.d0 r10 = (kotlinx.coroutines.C19525d0) r10
                r1 = r10
                r10 = r9
            L_0x002a:
                boolean r3 = kotlinx.coroutines.C19697g.m33467e(r1)
                if (r3 == 0) goto L_0x006a
                bo.app.f r3 = r10.f8398d     // Catch:{ Exception -> 0x0050 }
                bo.app.q0 r3 = r3.f8389c     // Catch:{ Exception -> 0x0050 }
                r10.f8397c = r1     // Catch:{ Exception -> 0x0050 }
                r10.f8396b = r2     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r3 = r3.mo13893a((kotlin.coroutines.C19340c<? super p030bo.app.C4296y1>) r10)     // Catch:{ Exception -> 0x0050 }
                if (r3 != r0) goto L_0x0041
                return r0
            L_0x0041:
                r8 = r0
                r0 = r10
                r10 = r3
                r3 = r1
                r1 = r8
            L_0x0046:
                bo.app.y1 r10 = (p030bo.app.C4296y1) r10     // Catch:{ Exception -> 0x004e }
                bo.app.f r4 = r0.f8398d     // Catch:{ Exception -> 0x004e }
                r4.m8607a((p030bo.app.C4296y1) r10)     // Catch:{ Exception -> 0x004e }
                goto L_0x0066
            L_0x004e:
                r10 = move-exception
                goto L_0x0056
            L_0x0050:
                r3 = move-exception
                r8 = r0
                r0 = r10
                r10 = r3
                r3 = r1
                r1 = r8
            L_0x0056:
                java.lang.String r4 = p030bo.app.C3654f.f8386j
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.V
                bo.app.f$c$a r6 = new bo.app.f$c$a
                r6.<init>(r10)
                r7 = 8
                com.braze.support.BrazeLogger.m11283e(r4, r5, r10, r6, r7)
            L_0x0066:
                r10 = r0
                r0 = r1
                r1 = r3
                goto L_0x002a
            L_0x006a:
                kotlin.m r10 = kotlin.C19394m.f43287a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3654f.C3657c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: bo.app.f$d */
    public static final class C3659d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3659d f8400b = new C3659d();

        public C3659d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Automatic request execution start was previously requested, continuing without action.";
        }
    }

    public C3654f(BrazeConfigurationProvider brazeConfigurationProvider, C3666f2 f2Var, C3926l2 l2Var, C4089q0 q0Var, boolean z) {
        C19383o.m32797g(brazeConfigurationProvider, "appConfigurationProvider");
        C19383o.m32797g(f2Var, "internalIEventMessenger");
        C19383o.m32797g(l2Var, "requestExecutor");
        C19383o.m32797g(q0Var, "dispatchManager");
        this.f8387a = brazeConfigurationProvider;
        this.f8388b = l2Var;
        this.f8389c = q0Var;
        this.f8390d = z;
        this.f8392f = new C4170s0(f2Var, z);
        f2Var.mo13287a(new C4223t6(this, f2Var), C4026o0.class);
    }

    /* renamed from: b */
    private final C3769i0 m8608b() {
        return new C3769i0(this.f8387a.getBaseUrlForRequests(), (C4276x3) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    private final C19699g1 m8611c() {
        return C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C3657c(this, (C19340c<? super C3657c>) null), 3);
    }

    /* renamed from: d */
    public final void mo13271d() {
        ReentrantLock reentrantLock = this.f8391e;
        reentrantLock.lock();
        try {
            if (this.f8393g) {
                BrazeLogger.m11283e(f8386j, (BrazeLogger.Priority) null, (Throwable) null, C3659d.f8400b, 14);
                return;
            }
            this.f8394h = m8611c();
            this.f8393g = true;
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo13270b(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        this.f8389c.mo13898b(t1Var);
    }

    /* renamed from: b */
    private final void m8610b(C4296y1 y1Var) {
        if (y1Var.mo13118b() || this.f8390d) {
            this.f8392f.mo13659a(y1Var);
        } else {
            this.f8388b.mo13659a(y1Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8605a(C3654f fVar, C3666f2 f2Var, C4026o0 o0Var) {
        C19383o.m32797g(fVar, "this$0");
        C19383o.m32797g(f2Var, "$internalIEventMessenger");
        C19383o.m32797g(o0Var, "$dstr$commandType$brazeEvent$sessionId$brazeRequest");
        C4026o0.C4029b a = o0Var.mo13799a();
        C4208t1 b = o0Var.mo13800b();
        C3670f5 c = o0Var.mo13801c();
        C4296y1 d = o0Var.mo13802d();
        int i = C3656b.f8395a[a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && d != null) {
                        fVar.mo13268a(f2Var, d);
                    }
                } else if (c != null) {
                    fVar.mo13269a(c);
                }
            } else if (b != null) {
                fVar.mo13196a(b);
            }
        } else if (b != null) {
            fVar.mo13270b(b);
        }
    }

    /* renamed from: a */
    public void mo13196a(C4208t1 t1Var) {
        C19383o.m32797g(t1Var, "event");
        this.f8389c.mo13196a(t1Var);
    }

    /* renamed from: a */
    public void mo13268a(C3666f2 f2Var, C4296y1 y1Var) {
        C19383o.m32797g(f2Var, "internalEventPublisher");
        C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
        this.f8389c.mo13894a(f2Var, y1Var);
    }

    /* renamed from: a */
    public void mo13269a(C3670f5 f5Var) {
        C19383o.m32797g(f5Var, "sessionId");
        this.f8389c.mo13895a(f5Var);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo13267a(C3666f2 f2Var) {
        C19383o.m32797g(f2Var, "eventMessenger");
        ReentrantLock reentrantLock = this.f8391e;
        reentrantLock.lock();
        try {
            C19699g1 g1Var = this.f8394h;
            if (g1Var != null) {
                g1Var.mo72134a((CancellationException) null);
            }
            this.f8394h = null;
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            if (!this.f8389c.mo13899b()) {
                this.f8389c.mo13894a(f2Var, (C4296y1) m8608b());
            }
            C4296y1 d = this.f8389c.mo13901d();
            if (d != null) {
                m8610b(d);
            }
            f2Var.mo13285a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8607a(C4296y1 y1Var) {
        if (y1Var.mo13118b() || this.f8390d) {
            this.f8392f.mo13660b(y1Var);
        } else {
            this.f8388b.mo13660b(y1Var);
        }
    }
}
