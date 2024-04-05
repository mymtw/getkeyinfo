package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19861p;

final class LazySemanticsKt$lazyListSemantics$1$scrollByAction$1 extends Lambda implements C19861p<Float, Float, Boolean> {
    public final /* synthetic */ C19525d0 $coroutineScope;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ LazyListState $state;

    @C19060c(mo70540c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1", mo70541f = "LazySemantics.kt", mo70542l = {95}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1 */
    public static final class C07721 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C07721(lazyListState, f, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C07721) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                LazyListState lazyListState = lazyListState;
                float f = f;
                this.label = 1;
                if (ScrollExtensionsKt.m1395a(lazyListState, f, C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7), this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyListSemantics$1$scrollByAction$1(boolean z, C19525d0 d0Var, LazyListState lazyListState) {
        super(2);
        this.$isVertical = z;
        this.$coroutineScope = d0Var;
        this.$state = lazyListState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }

    public final Boolean invoke(final float f, float f2) {
        if (this.$isVertical) {
            f = f2;
        }
        C19525d0 d0Var = this.$coroutineScope;
        final LazyListState lazyListState = this.$state;
        C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C07721((C19340c<? super C07721>) null), 3);
        return Boolean.TRUE;
    }
}
