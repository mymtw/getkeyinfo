package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p248tp.C8063o;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", mo70541f = "RxConvert.kt", mo70542l = {114}, mo70543m = "invokeSuspend")
final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C8063o $emitter;
    public final /* synthetic */ C19597d $this_asObservable;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$a */
    public static final class C19787a<T> implements C19600e {

        /* renamed from: b */
        public final /* synthetic */ C8063o<T> f43755b;

        public C19787a(C8063o<T> oVar) {
            this.f43755b = oVar;
        }

        public final Object emit(T t, C19340c<? super C19394m> cVar) {
            this.f43755b.onNext(t);
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asObservable$1$job$1(C19597d dVar, C8063o oVar, C19340c cVar) {
        super(2, cVar);
        this.$this_asObservable = dVar;
        this.$emitter = oVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1(this.$this_asObservable, this.$emitter, cVar);
        rxConvertKt$asObservable$1$job$1.L$0 = obj;
        return rxConvertKt$asObservable$1$job$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((RxConvertKt$asObservable$1$job$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        C19525d0 d0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var2 = (C19525d0) this.L$0;
            try {
                C19597d dVar = this.$this_asObservable;
                C19787a aVar = new C19787a(this.$emitter);
                this.L$0 = d0Var2;
                this.label = 1;
                if (dVar.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                d0Var = d0Var2;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                d0Var = d0Var2;
                th = th3;
                if (th instanceof CancellationException) {
                    this.$emitter.onComplete();
                } else if (!this.$emitter.tryOnError(th)) {
                    C19789b.m33749b(th, d0Var.getCoroutineContext());
                }
                return C19394m.f43287a;
            }
        } else if (i == 1) {
            d0Var = (C19525d0) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$emitter.onComplete();
        return C19394m.f43287a;
    }
}
