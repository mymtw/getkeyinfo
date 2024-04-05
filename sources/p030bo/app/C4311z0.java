package p030bo.app;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.braze.support.BrazeLogger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p301z3.C8434d;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.z0 */
public final class C4311z0 implements C3666f2 {

    /* renamed from: a */
    private final C4261w4 f9512a;

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<C8434d<?>>> f9513b = new ConcurrentHashMap();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<C8434d<?>>> f9514c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentMap<Class<?>, Object> f9515d = new ConcurrentHashMap();

    /* renamed from: e */
    private final ReentrantLock f9516e = new ReentrantLock();

    /* renamed from: f */
    private final ReentrantLock f9517f = new ReentrantLock();

    /* renamed from: g */
    private final ReentrantLock f9518g = new ReentrantLock();

    /* renamed from: bo.app.z0$a */
    public static final class C4312a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<T> f9519b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4312a(Class<T> cls) {
            super(0);
            this.f9519b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9519b, "Publishing cached event for class: ");
        }
    }

    /* renamed from: bo.app.z0$b */
    public static final class C4313b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<T> f9520b;

        /* renamed from: c */
        public final /* synthetic */ CopyOnWriteArraySet<C8434d<?>> f9521c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4313b(Class<T> cls, CopyOnWriteArraySet<C8434d<?>> copyOnWriteArraySet) {
            super(0);
            this.f9520b = cls;
            this.f9521c = copyOnWriteArraySet;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Triggering ");
            h.append(this.f9520b.getName());
            h.append(" on ");
            h.append(this.f9521c.size());
            h.append(" subscribers.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.z0$c */
    public static final class C4314c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<T> f9522b;

        /* renamed from: c */
        public final /* synthetic */ T f9523c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4314c(Class<T> cls, T t) {
            super(0);
            this.f9522b = cls;
            this.f9523c = t;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("SDK is disabled. Not publishing event class: ");
            h.append(this.f9522b.getName());
            h.append(" and message: ");
            h.append(this.f9523c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.z0$d */
    public static final class C4315d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<T> f9524b;

        /* renamed from: c */
        public final /* synthetic */ T f9525c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4315d(Class<T> cls, T t) {
            super(0);
            this.f9524b = cls;
            this.f9525c = t;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f9524b.getName() + " fired: " + this.f9525c;
        }
    }

    @C19060c(mo70540c = "com.braze.events.EventManager$publish$3", mo70541f = "EventManager.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.z0$e */
    public static final class C4316e extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f9526b;

        /* renamed from: c */
        public final /* synthetic */ C8434d<T> f9527c;

        /* renamed from: d */
        public final /* synthetic */ T f9528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4316e(C8434d<T> dVar, T t, C19340c<? super C4316e> cVar) {
            super(2, cVar);
            this.f9527c = dVar;
            this.f9528d = t;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C4316e) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C4316e(this.f9527c, this.f9528d, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f9526b == 0) {
                C0761x.m1684O0(obj);
                this.f9527c.mo13107a(this.f9528d);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.z0$f */
    public static final class C4317f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Class<T> f9529b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4317f(Class<T> cls) {
            super(0);
            this.f9529b = cls;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9529b, "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: ");
        }
    }

    public C4311z0(C4261w4 w4Var) {
        C19383o.m32797g(w4Var, "sdkEnablementProvider");
        this.f9512a = w4Var;
    }

    /* renamed from: a */
    public <T> boolean mo13287a(C8434d<T> dVar, Class<T> cls) {
        C19383o.m32797g(dVar, "subscriber");
        C19383o.m32797g(cls, "eventClass");
        ReentrantLock reentrantLock = this.f9517f;
        reentrantLock.lock();
        try {
            return m9978a(dVar, cls, this.f9514c);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public <T> boolean mo13288b(C8434d<T> dVar, Class<T> cls) {
        C19383o.m32797g(dVar, "subscriber");
        C19383o.m32797g(cls, "eventClass");
        ReentrantLock reentrantLock = this.f9516e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = this.f9513b.get(cls);
            if (copyOnWriteArraySet == null) {
                reentrantLock.unlock();
                return false;
            }
            boolean a = m9977a((CopyOnWriteArraySet<C8434d<?>>) copyOnWriteArraySet, dVar);
            reentrantLock.unlock();
            return a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public <T> void mo13289c(C8434d<T> dVar, Class<T> cls) {
        C19383o.m32797g(dVar, "subscriber");
        C19383o.m32797g(cls, "eventClass");
        ReentrantLock reentrantLock = this.f9516e;
        reentrantLock.lock();
        try {
            m9978a(dVar, cls, this.f9513b);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        if (r1.isEmpty() == false) goto L_0x0088;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void mo13286a(T r14, java.lang.Class<T> r15) {
        /*
            r13 = this;
            java.lang.String r0 = "eventClass"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            bo.app.w4 r0 = r13.f9512a
            boolean r0 = r0.mo14147a()
            if (r0 == 0) goto L_0x001c
            com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
            bo.app.z0$c r5 = new bo.app.z0$c
            r5.<init>(r15, r14)
            r3 = 0
            r4 = 0
            r6 = 7
            r2 = r13
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            return
        L_0x001c:
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.f11932a
            bo.app.z0$d r11 = new bo.app.z0$d
            r11.<init>(r15, r14)
            r9 = 0
            r10 = 0
            r12 = 7
            r8 = r13
            com.braze.support.BrazeLogger.m11282d(r7, r8, r9, r10, r11, r12)
            r0 = 0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<z3.d<?>>> r1 = r13.f9513b
            java.lang.Object r1 = r1.get(r15)
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            r2 = 1
            if (r1 == 0) goto L_0x005e
            java.util.concurrent.CopyOnWriteArraySet r3 = r13.m9975a(r15, (java.util.concurrent.CopyOnWriteArraySet<p301z3.C8434d<?>>) r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x003e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0057
            java.lang.Object r4 = r3.next()
            z3.d r4 = (p301z3.C8434d) r4
            com.braze.coroutine.BrazeCoroutineScope r5 = com.braze.coroutine.BrazeCoroutineScope.f11696b
            bo.app.z0$e r6 = new bo.app.z0$e
            r7 = 0
            r6.<init>(r4, r14, r7)
            r4 = 3
            kotlinx.coroutines.C19697g.m33468f(r5, r7, r7, r6, r4)
            goto L_0x003e
        L_0x0057:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x005e
            r0 = r2
        L_0x005e:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<z3.d<?>>> r1 = r13.f9514c
            java.lang.Object r1 = r1.get(r15)
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            if (r1 == 0) goto L_0x0087
            java.util.concurrent.CopyOnWriteArraySet r3 = r13.m9975a(r15, (java.util.concurrent.CopyOnWriteArraySet<p301z3.C8434d<?>>) r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0070:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r3.next()
            z3.d r4 = (p301z3.C8434d) r4
            r4.mo13107a(r14)
            goto L_0x0070
        L_0x0080:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r2 = r0
        L_0x0088:
            if (r2 != 0) goto L_0x00ae
            if (r14 == 0) goto L_0x00ae
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.I
            bo.app.z0$f r7 = new bo.app.z0$f
            r7.<init>(r15)
            r6 = 0
            r8 = 6
            r4 = r13
            com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
            java.util.concurrent.locks.ReentrantLock r0 = r13.f9518g
            r0.lock()
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.lang.Object> r1 = r13.f9515d     // Catch:{ all -> 0x00a9 }
            r1.put(r15, r14)     // Catch:{ all -> 0x00a9 }
            r0.unlock()
            goto L_0x00ae
        L_0x00a9:
            r14 = move-exception
            r0.unlock()
            throw r14
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4311z0.mo13286a(java.lang.Object, java.lang.Class):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo13285a() {
        ReentrantLock reentrantLock = this.f9516e;
        reentrantLock.lock();
        try {
            this.f9513b.clear();
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f9517f;
            reentrantLock2.lock();
            try {
                this.f9514c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = new java.util.concurrent.CopyOnWriteArraySet();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> boolean m9978a(p301z3.C8434d<T> r2, java.lang.Class<T> r3, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<p301z3.C8434d<?>>> r4) {
        /*
            r1 = this;
            java.lang.Object r0 = r4.get(r3)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            if (r0 != 0) goto L_0x0017
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            java.lang.Object r4 = r4.putIfAbsent(r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4
            if (r4 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r0 = r4
        L_0x0017:
            boolean r2 = r0.add(r2)
            r1.m9976a(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4311z0.m9978a(z3.d, java.lang.Class, java.util.concurrent.ConcurrentMap):boolean");
    }

    /* renamed from: a */
    private final <T> void m9976a(Class<T> cls) {
        ReentrantLock reentrantLock = this.f9518g;
        reentrantLock.lock();
        try {
            if (this.f9515d.containsKey(cls)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4312a(cls), 6);
                Object remove = this.f9515d.remove(cls);
                if (remove != null) {
                    mo13286a(remove, cls);
                }
            }
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    private final <T> boolean m9977a(CopyOnWriteArraySet<C8434d<?>> copyOnWriteArraySet, C8434d<T> dVar) {
        return copyOnWriteArraySet.remove(dVar);
    }

    /* renamed from: a */
    private final <T> CopyOnWriteArraySet<C8434d<T>> m9975a(Class<T> cls, CopyOnWriteArraySet<C8434d<?>> copyOnWriteArraySet) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4313b(cls, copyOnWriteArraySet), 7);
        return copyOnWriteArraySet;
    }
}
