package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C19503g;
import p744gq.C19060c;
import p753kq.C19861p;
import p772tq.C20203a;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", mo70541f = "Delay.kt", mo70542l = {243}, mo70543m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements C19861p<C19503g<? extends Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19600e<Object> $downstream;
    public final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, C19600e<Object> eVar, C19340c<? super FlowKt__DelayKt$debounceInternal$1$3$2> cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, cVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m35490invokeWpGqRn0(((C19503g) obj).f43450a, (C19340c) obj2);
    }

    /* renamed from: invoke-WpGqRn0  reason: not valid java name */
    public final Object m35490invokeWpGqRn0(Object obj, C19340c<? super C19394m> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new C19503g(obj), cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            T t = ((C19503g) this.L$0).f43450a;
            ref$ObjectRef = this.$lastValue;
            boolean z = t instanceof C19503g.C19505b;
            if (!z) {
                ref$ObjectRef.element = t;
            }
            C19600e<Object> eVar = this.$downstream;
            if (z) {
                Throwable a = C19503g.m33187a(t);
                if (a == null) {
                    T t2 = ref$ObjectRef.element;
                    if (t2 != null) {
                        if (t2 == C20203a.f44778h) {
                            t2 = null;
                        }
                        this.L$0 = t;
                        this.L$1 = ref$ObjectRef;
                        this.label = 1;
                        if (eVar.emit(t2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.element = C20203a.f44780j;
                } else {
                    throw a;
                }
            }
            return C19394m.f43287a;
        } else if (i == 1) {
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = C20203a.f44780j;
        return C19394m.f43287a;
    }
}
