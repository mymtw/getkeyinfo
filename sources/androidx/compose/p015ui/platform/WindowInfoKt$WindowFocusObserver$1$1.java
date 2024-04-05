package androidx.compose.p015ui.platform;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1333i1;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", mo70541f = "WindowInfo.kt", mo70542l = {47}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1 */
final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<C19857l<Boolean, C19394m>> $callback;
    public final /* synthetic */ C1863p1 $windowInfo;
    public int label;

    /* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1$a */
    public static final class C1799a implements C19600e<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ C1342k1<C19857l<Boolean, C19394m>> f4051b;

        public C1799a(C1342k1<? extends C19857l<? super Boolean, C19394m>> k1Var) {
            this.f4051b = k1Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            Object invoke = this.f4051b.getValue().invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$1$1(C1863p1 p1Var, C1342k1<? extends C19857l<? super Boolean, C19394m>> k1Var, C19340c<? super WindowInfoKt$WindowFocusObserver$1$1> cVar) {
        super(2, cVar);
        this.$windowInfo = p1Var;
        this.$callback = k1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C1863p1 p1Var = this.$windowInfo;
            C19665q1 b = C1333i1.m2796b(new C19846a<Boolean>() {
                public final Boolean invoke() {
                    return Boolean.valueOf(p1Var.mo7272a());
                }
            });
            C1799a aVar = new C1799a(this.$callback);
            this.label = 1;
            if (b.collect(aVar, this) == coroutineSingletons) {
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
