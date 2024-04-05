package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19753l;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class BroadcastFrameClock implements C1321f0 {

    /* renamed from: b */
    public final C19846a<C19394m> f2682b;

    /* renamed from: c */
    public final Object f2683c = new Object();

    /* renamed from: d */
    public Throwable f2684d;

    /* renamed from: e */
    public List<C1275a<?>> f2685e = new ArrayList();

    /* renamed from: f */
    public List<C1275a<?>> f2686f = new ArrayList();

    /* renamed from: androidx.compose.runtime.BroadcastFrameClock$a */
    public static final class C1275a<R> {

        /* renamed from: a */
        public final C19857l<Long, R> f2687a;

        /* renamed from: b */
        public final C19340c<R> f2688b;

        public C1275a(C19857l lVar, C19753l lVar2) {
            C19383o.m32797g(lVar, "onFrame");
            this.f2687a = lVar;
            this.f2688b = lVar2;
        }
    }

    public BroadcastFrameClock(C19846a<C19394m> aVar) {
        this.f2682b = aVar;
    }

    /* renamed from: Q */
    public final <R> Object mo5381Q(C19857l<? super Long, ? extends R> lVar, C19340c<? super R> cVar) {
        C19846a<C19394m> aVar;
        C19753l lVar2 = new C19753l(1, C19388s.m32873m0(cVar));
        lVar2.mo72548n();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.f2683c) {
            Throwable th = this.f2684d;
            if (th != null) {
                lVar2.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
            } else {
                ref$ObjectRef.element = new C1275a(lVar, lVar2);
                boolean z = !this.f2685e.isEmpty();
                List<C1275a<?>> list = this.f2685e;
                T t = ref$ObjectRef.element;
                if (t != null) {
                    list.add((C1275a) t);
                    boolean z2 = !z;
                    lVar2.mo72497O(new BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                    if (z2 && (aVar = this.f2682b) != null) {
                        try {
                            aVar.invoke();
                        } catch (Throwable th2) {
                            synchronized (this.f2683c) {
                                if (this.f2684d == null) {
                                    this.f2684d = th2;
                                    List<C1275a<?>> list2 = this.f2685e;
                                    int size = list2.size();
                                    for (int i = 0; i < size; i++) {
                                        list2.get(i).f2688b.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th2)));
                                    }
                                    this.f2685e.clear();
                                    C19394m mVar = C19394m.f43287a;
                                }
                            }
                        }
                    }
                } else {
                    C19383o.m32805o("awaiter");
                    throw null;
                }
            }
        }
        Object l = lVar2.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }

    /* renamed from: c */
    public final boolean mo5382c() {
        boolean z;
        synchronized (this.f2683c) {
            z = !this.f2685e.isEmpty();
        }
        return z;
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    /* renamed from: i */
    public final void mo5385i(long j) {
        Object obj;
        synchronized (this.f2683c) {
            List<C1275a<?>> list = this.f2685e;
            this.f2685e = this.f2686f;
            this.f2686f = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1275a aVar = list.get(i);
                C19340c<R> cVar = aVar.f2688b;
                try {
                    obj = Result.m35480constructorimpl(aVar.f2687a.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    obj = Result.m35480constructorimpl(C0761x.m1673J(th));
                }
                cVar.resumeWith(obj);
            }
            list.clear();
            C19394m mVar = C19394m.f43287a;
        }
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }
}
