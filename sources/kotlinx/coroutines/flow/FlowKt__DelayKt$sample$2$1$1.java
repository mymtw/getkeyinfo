package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C19503g;
import kotlinx.coroutines.channels.C19515q;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p744gq.C19060c;
import p753kq.C19861p;
import p772tq.C20203a;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", mo70541f = "Delay.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements C19861p<C19503g<? extends Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    public final /* synthetic */ C19515q<C19394m> $ticker;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, C19515q<C19394m> qVar, C19340c<? super FlowKt__DelayKt$sample$2$1$1> cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, cVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m35491invokeWpGqRn0(((C19503g) obj).f43450a, (C19340c) obj2);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m35491invokeWpGqRn0(Object obj, C19340c<? super C19394m> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(new C19503g(obj), cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            T t = ((C19503g) this.L$0).f43450a;
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            boolean z = t instanceof C19503g.C19505b;
            if (!z) {
                ref$ObjectRef.element = t;
            }
            C19515q<C19394m> qVar = this.$ticker;
            if (z) {
                Throwable a = C19503g.m33187a(t);
                if (a == null) {
                    qVar.mo72134a(new ChildCancelledException());
                    ref$ObjectRef.element = C20203a.f44780j;
                } else {
                    throw a;
                }
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
