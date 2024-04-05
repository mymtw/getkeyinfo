package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1333i1;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;
import p764pq.C20057i;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1", mo70541f = "LazyGridItemProviderImpl.kt", mo70542l = {53}, mo70543m = "invokeSuspend")
final class LazyGridItemProviderImplKt$rememberItemProvider$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1338j0<C20057i> $nearestItemsRangeState;
    public final /* synthetic */ LazyGridState $state;
    public int label;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1$a */
    public static final class C0785a implements C19600e<C20057i> {

        /* renamed from: b */
        public final /* synthetic */ C1338j0<C20057i> f1646b;

        public C0785a(C1338j0<C20057i> j0Var) {
            this.f1646b = j0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            this.f1646b.setValue((C20057i) obj);
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImplKt$rememberItemProvider$1(LazyGridState lazyGridState, C1338j0<C20057i> j0Var, C19340c<? super LazyGridItemProviderImplKt$rememberItemProvider$1> cVar) {
        super(2, cVar);
        this.$state = lazyGridState;
        this.$nearestItemsRangeState = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LazyGridItemProviderImplKt$rememberItemProvider$1(this.$state, this.$nearestItemsRangeState, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LazyGridItemProviderImplKt$rememberItemProvider$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final LazyGridState lazyGridState = this.$state;
            C19665q1 b = C1333i1.m2796b(new C19846a<C20057i>() {
                public final C20057i invoke() {
                    int e = (lazyGridState.mo4313e() / 90) * 90;
                    return C19388s.m32816D0(Math.max(e - 200, 0), e + 90 + 200);
                }
            });
            C0785a aVar = new C0785a(this.$nearestItemsRangeState);
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
