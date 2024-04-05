package androidx.compose.foundation.lazy;

import android.support.p013v4.media.C0069a;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.saveable.C1374h;
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
import p753kq.C19857l;
import p753kq.C19861p;

final class LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1 extends Lambda implements C19857l<Integer, Boolean> {
    public final /* synthetic */ C19525d0 $coroutineScope;
    public final /* synthetic */ LazyListState $state;

    @C19060c(mo70540c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2", mo70541f = "LazySemantics.kt", mo70542l = {111}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2 */
    public static final class C07732 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C07732(lazyListState, i, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C07732) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                LazyListState lazyListState = lazyListState;
                int i2 = i;
                this.label = 1;
                C1374h hVar = LazyListState.f1600s;
                lazyListState.getClass();
                Object c = lazyListState.mo3690a(MutatePriority.Default, new LazyListState$scrollToItem$2(lazyListState, i2, 0, (C19340c<? super LazyListState$scrollToItem$2>) null), this);
                if (c != coroutineSingletons) {
                    c = C19394m.f43287a;
                }
                if (c == coroutineSingletons) {
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
    public LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1(LazyListState lazyListState, C19525d0 d0Var) {
        super(1);
        this.$state = lazyListState;
        this.$coroutineScope = d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Boolean invoke(final int i) {
        boolean z = i >= 0 && i < this.$state.mo4226g().mo4243a();
        final LazyListState lazyListState = this.$state;
        if (z) {
            C19697g.m33468f(this.$coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07732((C19340c<? super C07732>) null), 3);
            return Boolean.TRUE;
        }
        StringBuilder h = C0069a.m177h("Can't scroll to index ", i, ", it is out of bounds [0, ");
        h.append(lazyListState.mo4226g().mo4243a());
        h.append(')');
        throw new IllegalArgumentException(h.toString().toString());
    }
}
