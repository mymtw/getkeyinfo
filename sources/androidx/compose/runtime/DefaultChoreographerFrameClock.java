package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p753kq.C19857l;
import p753kq.C19861p;
import p768rq.C20153b;

public final class DefaultChoreographerFrameClock implements C1321f0 {

    /* renamed from: b */
    public static final DefaultChoreographerFrameClock f2759b = new DefaultChoreographerFrameClock();

    /* renamed from: c */
    public static final Choreographer f2760c = ((Choreographer) C19697g.m33469g(C19729m.f43681a.mo72111E0(), new DefaultChoreographerFrameClock$choreographer$1((C19340c<? super DefaultChoreographerFrameClock$choreographer$1>) null)));

    /* renamed from: androidx.compose.runtime.DefaultChoreographerFrameClock$a */
    public static final class C1280a implements Choreographer.FrameCallback {

        /* renamed from: b */
        public final /* synthetic */ C19747k<R> f2761b;

        /* renamed from: c */
        public final /* synthetic */ C19857l<Long, R> f2762c;

        public C1280a(C19753l lVar, C19857l lVar2) {
            this.f2761b = lVar;
            this.f2762c = lVar2;
        }

        public final void doFrame(long j) {
            Object obj;
            C19747k<R> kVar = this.f2761b;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f2759b;
            try {
                obj = Result.m35480constructorimpl(this.f2762c.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                obj = Result.m35480constructorimpl(C0761x.m1673J(th));
            }
            kVar.resumeWith(obj);
        }
    }

    static {
        C20153b bVar = C19760n0.f43719a;
    }

    /* renamed from: Q */
    public final <R> Object mo5381Q(C19857l<? super Long, ? extends R> lVar, C19340c<? super R> cVar) {
        C19753l lVar2 = new C19753l(1, C19388s.m32873m0(cVar));
        lVar2.mo72548n();
        C1280a aVar = new C1280a(lVar2, lVar);
        f2760c.postFrameCallback(aVar);
        lVar2.mo72497O(new DefaultChoreographerFrameClock$withFrameNanos$2$1(aVar));
        Object l = lVar2.mo72547l();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return l;
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
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
