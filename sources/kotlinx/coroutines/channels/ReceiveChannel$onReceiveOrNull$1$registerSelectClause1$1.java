package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", mo70541f = "Channel.kt", mo70542l = {375}, mo70543m = "invokeSuspend")
final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 extends SuspendLambda implements C19861p<C19503g<Object>, C19340c<Object>, Object> {
    public final /* synthetic */ C19861p<Object, C19340c<Object>, Object> $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(C19861p<Object, ? super C19340c<Object>, ? extends Object> pVar, C19340c<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> cVar) {
        super(2, cVar);
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.$block, cVar);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.L$0 = obj;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m35489invokeWpGqRn0(((C19503g) obj).f43450a, (C19340c) obj2);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m35489invokeWpGqRn0(Object obj, C19340c<Object> cVar) {
        return ((ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1) create(new C19503g(obj), cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Object obj2 = ((C19503g) this.L$0).f43450a;
            Throwable a = C19503g.m33187a(obj2);
            if (a == null) {
                C19861p<Object, C19340c<Object>, Object> pVar = this.$block;
                Object b = C19503g.m33188b(obj2);
                this.label = 1;
                obj = pVar.invoke(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                throw a;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
