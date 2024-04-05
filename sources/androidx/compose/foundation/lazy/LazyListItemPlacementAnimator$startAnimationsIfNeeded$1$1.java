package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0429h0;
import androidx.compose.animation.core.C0454t;
import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7287g;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", mo70541f = "LazyListItemPlacementAnimator.kt", mo70542l = {400}, mo70543m = "invokeSuspend")
public final class LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0454t<C7287g> $animationSpec;
    public final /* synthetic */ C0867z $placeableInfo;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(C0867z zVar, C0454t<C7287g> tVar, C19340c<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1> cVar) {
        super(2, cVar);
        this.$placeableInfo = zVar;
        this.$animationSpec = tVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.$placeableInfo, this.$animationSpec, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C0422e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            if (((Boolean) this.$placeableInfo.f1874b.f1009d.getValue()).booleanValue()) {
                C0454t<C7287g> tVar = this.$animationSpec;
                eVar = tVar instanceof C0429h0 ? (C0429h0) tVar : C0828k.f1784a;
            } else {
                eVar = this.$animationSpec;
            }
            C0422e eVar2 = eVar;
            C0867z zVar = this.$placeableInfo;
            Animatable<C7287g, C0428h> animatable = zVar.f1874b;
            C7287g gVar = new C7287g(zVar.f1875c);
            this.label = 1;
            if (Animatable.m1065d(animatable, gVar, eVar2, (Float) null, (C19857l) null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (CancellationException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$placeableInfo.f1876d.setValue(Boolean.FALSE);
        return C19394m.f43287a;
    }
}
