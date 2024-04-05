package androidx.compose.p015ui.platform;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19689x1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", mo70541f = "WindowRecomposer.android.kt", mo70542l = {386}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 */
public final class C1805x93d788e4 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19689x1<Float> $durationScaleStateFlow;
    public final /* synthetic */ C1868r0 $it;
    public int label;

    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1$a */
    public static final class C1806a implements C19600e<Float> {

        /* renamed from: b */
        public final /* synthetic */ C1868r0 f4058b;

        public C1806a(C1868r0 r0Var) {
            this.f4058b = r0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            this.f4058b.f4130b.setValue(Float.valueOf(((Number) obj).floatValue()));
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1805x93d788e4(C19689x1<Float> x1Var, C1868r0 r0Var, C19340c<? super C1805x93d788e4> cVar) {
        super(2, cVar);
        this.$durationScaleStateFlow = x1Var;
        this.$it = r0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new C1805x93d788e4(this.$durationScaleStateFlow, this.$it, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((C1805x93d788e4) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19689x1<Float> x1Var = this.$durationScaleStateFlow;
            C1806a aVar = new C1806a(this.$it);
            this.label = 1;
            if (x1Var.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
