package androidx.compose.p015ui.platform;

import android.view.Choreographer;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1321f0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock */
public final class AndroidUiFrameClock implements C1321f0 {

    /* renamed from: b */
    public final Choreographer f4011b;

    /* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$a */
    public static final class C1785a implements Choreographer.FrameCallback {

        /* renamed from: b */
        public final /* synthetic */ C19747k<R> f4012b;

        /* renamed from: c */
        public final /* synthetic */ C19857l<Long, R> f4013c;

        public C1785a(C19753l lVar, AndroidUiFrameClock androidUiFrameClock, C19857l lVar2) {
            this.f4012b = lVar;
            this.f4013c = lVar2;
        }

        public final void doFrame(long j) {
            Object obj;
            C19747k<R> kVar = this.f4012b;
            try {
                obj = Result.m35480constructorimpl(this.f4013c.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                obj = Result.m35480constructorimpl(C0761x.m1673J(th));
            }
            kVar.resumeWith(obj);
        }
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this.f4011b = choreographer;
    }

    /* renamed from: Q */
    public final <R> Object mo5381Q(C19857l<? super Long, ? extends R> lVar, C19340c<? super R> cVar) {
        CoroutineContext.C19335a aVar = cVar.getContext().get(C19341d.C19342a.f43195b);
        AndroidUiDispatcher androidUiDispatcher = aVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) aVar : null;
        C19753l lVar2 = new C19753l(1, C19388s.m32873m0(cVar));
        lVar2.mo72548n();
        C1785a aVar2 = new C1785a(lVar2, this, lVar);
        if (androidUiDispatcher == null || !C19383o.m32792b(androidUiDispatcher.f4001c, this.f4011b)) {
            this.f4011b.postFrameCallback(aVar2);
            lVar2.mo72497O(new AndroidUiFrameClock$withFrameNanos$2$2(this, aVar2));
        } else {
            synchronized (androidUiDispatcher.f4003e) {
                androidUiDispatcher.f4005g.add(aVar2);
                if (!androidUiDispatcher.f4008j) {
                    androidUiDispatcher.f4008j = true;
                    androidUiDispatcher.f4001c.postFrameCallback(androidUiDispatcher.f4009k);
                }
                C19394m mVar = C19394m.f43287a;
            }
            lVar2.mo72497O(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, aVar2));
        }
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
