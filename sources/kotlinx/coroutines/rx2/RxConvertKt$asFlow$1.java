package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C19506h;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.ProduceKt;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p248tp.C8065q;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", mo70541f = "RxConvert.kt", mo70542l = {95}, mo70543m = "invokeSuspend")
final class RxConvertKt$asFlow$1 extends SuspendLambda implements C19861p<C19513o<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C8065q<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$a */
    public static final class C19786a implements Observer<Object> {

        /* renamed from: b */
        public final /* synthetic */ C19513o<Object> f43753b;

        /* renamed from: c */
        public final /* synthetic */ AtomicReference<Disposable> f43754c;

        public C19786a(C19513o<Object> oVar, AtomicReference<Disposable> atomicReference) {
            this.f43753b = oVar;
            this.f43754c = atomicReference;
        }

        public final void onComplete() {
            this.f43753b.mo72187C((Throwable) null);
        }

        public final void onError(Throwable th) {
            this.f43753b.mo72187C(th);
        }

        public final void onNext(Object obj) {
            try {
                C19506h.m33189a(this.f43753b, obj);
            } catch (InterruptedException unused) {
            }
        }

        public final void onSubscribe(Disposable disposable) {
            boolean z;
            AtomicReference<Disposable> atomicReference = this.f43754c;
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, disposable)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                disposable.dispose();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asFlow$1(C8065q<Object> qVar, C19340c<? super RxConvertKt$asFlow$1> cVar) {
        super(2, cVar);
        this.$this_asFlow = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this.$this_asFlow, cVar);
        rxConvertKt$asFlow$1.L$0 = obj;
        return rxConvertKt$asFlow$1;
    }

    public final Object invoke(C19513o<Object> oVar, C19340c<? super C19394m> cVar) {
        return ((RxConvertKt$asFlow$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19513o oVar = (C19513o) this.L$0;
            final AtomicReference atomicReference = new AtomicReference();
            this.$this_asFlow.subscribe(new C19786a(oVar, atomicReference));
            C197851 r3 = new C19846a<C19394m>() {
                public final void invoke() {
                    Disposable andSet = atomicReference.getAndSet(EmptyDisposable.INSTANCE);
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            };
            this.label = 1;
            if (ProduceKt.m33138a(oVar, r3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
