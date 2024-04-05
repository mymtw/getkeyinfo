package p030bo.app;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.sync.C19816d;
import kotlinx.coroutines.sync.C19817e;
import kotlinx.coroutines.sync.C19818f;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: bo.app.a */
public abstract class C3511a<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C19816d f8139a = new C19817e(0);

    /* renamed from: bo.app.a$a */
    public static final class C3512a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ T f8140b;

        /* renamed from: c */
        public final /* synthetic */ boolean f8141c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3512a(T t, boolean z) {
            super(0);
            this.f8140b = t;
            this.f8141c = z;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Tried to confirm outboundObject [");
            h.append(this.f8140b);
            h.append("] with success [");
            h.append(this.f8141c);
            h.append("], but the cache wasn't locked, so not doing anything.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.a$b */
    public static final class C3513b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3511a<T> f8142b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3513b(C3511a<T> aVar) {
            super(0);
            this.f8142b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8142b, "Notifying confirmAndUnlock listeners for cache: ");
        }
    }

    /* renamed from: bo.app.a$c */
    public static final class C3514c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3511a<T> f8143b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3514c(C3511a<T> aVar) {
            super(0);
            this.f8143b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8143b, "Cache locked successfully for export: ");
        }
    }

    /* renamed from: bo.app.a$d */
    public static final class C3515d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3515d f8144b = new C3515d();

        public C3515d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received call to export dirty object, but the cache was already locked.";
        }
    }

    @C19060c(mo70540c = "com.braze.storage.AbstractLockedCache$lockAndUnlock$1", mo70541f = "AbstractLockedCache.kt", mo70542l = {90}, mo70543m = "invokeSuspend")
    /* renamed from: bo.app.a$e */
    public static final class C3516e extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public Object f8145b;

        /* renamed from: c */
        public int f8146c;

        /* renamed from: d */
        public final /* synthetic */ C3511a<T> f8147d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3516e(C3511a<T> aVar, C19340c<? super C3516e> cVar) {
            super(2, cVar);
            this.f8147d = aVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C3516e) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C3516e(this.f8147d, cVar);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C19816d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f8146c;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19816d a = this.f8147d.f8139a;
                this.f8145b = a;
                this.f8146c = 1;
                if (a.mo72654c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = a;
            } else if (i == 1) {
                dVar = (C19816d) this.f8145b;
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C19394m mVar = C19394m.f43287a;
                dVar.release();
                return C19394m.f43287a;
            } catch (Throwable th) {
                dVar.release();
                throw th;
            }
        }
    }

    public C3511a() {
        int i = C19818f.f43814a;
    }

    /* renamed from: b */
    public abstract void mo13007b(T t, boolean z);

    /* renamed from: b */
    public final boolean mo13008b() {
        return this.f8139a.mo72652a() == 0;
    }

    /* renamed from: c */
    public final void mo13009c() {
        Object unused = C19697g.m33469g(EmptyCoroutineContext.INSTANCE, new C3516e(this, (C19340c<? super C3516e>) null));
    }

    /* renamed from: d */
    public abstract T mo13010d();

    /* renamed from: a */
    public final synchronized T mo13005a() {
        T t;
        if (this.f8139a.mo72653b()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3514c(this), 7);
            t = mo13010d();
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3515d.f8144b, 7);
            t = null;
        }
        return t;
    }

    /* renamed from: a */
    public final synchronized boolean mo13006a(T t, boolean z) {
        if (this.f8139a.mo72652a() != 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3512a(t, z), 6);
            return false;
        }
        mo13007b(t, z);
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3513b(this), 6);
        this.f8139a.release();
        return true;
    }
}
