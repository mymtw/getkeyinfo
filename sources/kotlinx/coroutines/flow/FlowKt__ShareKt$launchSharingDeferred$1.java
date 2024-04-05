package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19771r;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", mo70541f = "Share.kt", mo70542l = {340}, mo70543m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19771r<C19689x1<Object>> $result;
    public final /* synthetic */ C19597d<Object> $upstream;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a */
    public static final class C19564a<T> implements C19600e {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<C19656n1<T>> f43542b;

        /* renamed from: c */
        public final /* synthetic */ C19525d0 f43543c;

        /* renamed from: d */
        public final /* synthetic */ C19771r<C19689x1<T>> f43544d;

        public C19564a(Ref$ObjectRef<C19656n1<T>> ref$ObjectRef, C19525d0 d0Var, C19771r<C19689x1<T>> rVar) {
            this.f43542b = ref$ObjectRef;
            this.f43543c = d0Var;
            this.f43544d = rVar;
        }

        public final Object emit(T t, C19340c<? super C19394m> cVar) {
            C19394m mVar;
            C19656n1 n1Var = (C19656n1) this.f43542b.element;
            if (n1Var == null) {
                mVar = null;
            } else {
                n1Var.setValue(t);
                mVar = C19394m.f43287a;
            }
            if (mVar == null) {
                C19525d0 d0Var = this.f43543c;
                Ref$ObjectRef<C19656n1<T>> ref$ObjectRef = this.f43542b;
                C19771r<C19689x1<T>> rVar = this.f43544d;
                T g = C19388s.m32862g(t);
                rVar.mo72564B(new C19662p1(g, C1993m.m4345F(d0Var.getCoroutineContext())));
                ref$ObjectRef.element = g;
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(C19597d<Object> dVar, C19771r<C19689x1<Object>> rVar, C19340c<? super FlowKt__ShareKt$launchSharingDeferred$1> cVar) {
        super(2, cVar);
        this.$upstream = dVar;
        this.$result = rVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, cVar);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C19597d<Object> dVar = this.$upstream;
            C19564a aVar = new C19564a(ref$ObjectRef, d0Var, this.$result);
            this.label = 1;
            if (dVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                this.$result.mo72565x(th);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
