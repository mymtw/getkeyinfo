package kotlinx.coroutines.reactive;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C19519u;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectClause2$clause$1", mo70541f = "Publish.kt", mo70542l = {110}, mo70543m = "invokeSuspend")
final class PublisherCoroutine$registerSelectClause2$clause$1 extends SuspendLambda implements C19857l<C19340c<Object>, Object> {
    public final /* synthetic */ C19861p<C19519u<Object>, C19340c<Object>, Object> $block;
    public final /* synthetic */ Object $element;
    public int label;
    public final /* synthetic */ PublisherCoroutine<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PublisherCoroutine$registerSelectClause2$clause$1(PublisherCoroutine<Object> publisherCoroutine, Object obj, C19861p<? super C19519u<Object>, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super PublisherCoroutine$registerSelectClause2$clause$1> cVar) {
        super(1, cVar);
        this.this$0 = publisherCoroutine;
        this.$element = obj;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new PublisherCoroutine$registerSelectClause2$clause$1(this.this$0, this.$element, this.$block, cVar);
    }

    public final Object invoke(C19340c<Object> cVar) {
        return ((PublisherCoroutine$registerSelectClause2$clause$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PublisherCoroutine<Object> publisherCoroutine = this.this$0;
            Object obj2 = this.$element;
            AtomicLongFieldUpdater atomicLongFieldUpdater = PublisherCoroutine.f43736d;
            throw publisherCoroutine.mo72573E0(obj2);
        } else if (i == 1) {
            C0761x.m1684O0(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
