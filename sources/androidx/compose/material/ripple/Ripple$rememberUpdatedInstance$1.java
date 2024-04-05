package androidx.compose.material.ripple;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.interaction.C0628a;
import androidx.compose.foundation.interaction.C0632b;
import androidx.compose.foundation.interaction.C0633c;
import androidx.compose.foundation.interaction.C0635e;
import androidx.compose.foundation.interaction.C0636f;
import androidx.compose.foundation.interaction.C0638h;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.interaction.C0642l;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.interaction.C0644n;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19671s1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", mo70541f = "Ripple.kt", mo70542l = {356}, mo70543m = "invokeSuspend")
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1243i $instance;
    public final /* synthetic */ C0639i $interactionSource;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$a */
    public static final class C1229a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ C1243i f2559b;

        /* renamed from: c */
        public final /* synthetic */ C19525d0 f2560c;

        public C1229a(C1243i iVar, C19525d0 d0Var) {
            this.f2559b = iVar;
            this.f2560c = d0Var;
        }

        public final Object emit(C0638h hVar, C19340c<? super C19394m> cVar) {
            C0638h hVar2 = hVar;
            if (hVar2 instanceof C0643m) {
                this.f2559b.mo5301b((C0643m) hVar2, this.f2560c);
            } else if (hVar2 instanceof C0644n) {
                this.f2559b.mo5302d(((C0644n) hVar2).f1382a);
            } else if (hVar2 instanceof C0642l) {
                this.f2559b.mo5302d(((C0642l) hVar2).f1380a);
            } else {
                C1243i iVar = this.f2559b;
                C19525d0 d0Var = this.f2560c;
                iVar.getClass();
                C19383o.m32797g(hVar2, "interaction");
                C19383o.m32797g(d0Var, "scope");
                C1246l lVar = iVar.f2600b;
                lVar.getClass();
                boolean z = hVar2 instanceof C0635e;
                if (z) {
                    lVar.f2605d.add(hVar2);
                } else if (hVar2 instanceof C0636f) {
                    lVar.f2605d.remove(((C0636f) hVar2).f1378a);
                } else if (hVar2 instanceof C0632b) {
                    lVar.f2605d.add(hVar2);
                } else if (hVar2 instanceof C0633c) {
                    lVar.f2605d.remove(((C0633c) hVar2).f1377a);
                } else if (hVar2 instanceof C0628a.C0630b) {
                    lVar.f2605d.add(hVar2);
                } else if (hVar2 instanceof C0628a.C0631c) {
                    lVar.f2605d.remove(((C0628a.C0631c) hVar2).f1376a);
                } else if (hVar2 instanceof C0628a.C0629a) {
                    lVar.f2605d.remove(((C0628a.C0629a) hVar2).f1375a);
                }
                C0638h hVar3 = (C0638h) C19327t.m32646b1(lVar.f2605d);
                if (!C19383o.m32792b(lVar.f2606e, hVar3)) {
                    if (hVar3 != null) {
                        float f = z ? lVar.f2603b.getValue().f2593c : hVar2 instanceof C0632b ? lVar.f2603b.getValue().f2592b : hVar2 instanceof C0628a.C0630b ? lVar.f2603b.getValue().f2591a : 0.0f;
                        C0433j0<Float> j0Var = C1244j.f2601a;
                        C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$1(lVar, f, hVar3 instanceof C0635e ? C1244j.f2601a : hVar3 instanceof C0632b ? new C0433j0<>(45, (C0448r) C0450s.C0451a.f1169a, 2) : hVar3 instanceof C0628a.C0630b ? new C0433j0<>(45, (C0448r) C0450s.C0451a.f1169a, 2) : C1244j.f2601a, (C19340c<? super StateLayer$handleInteraction$1>) null), 3);
                    } else {
                        C0638h hVar4 = lVar.f2606e;
                        C0433j0<Float> j0Var2 = C1244j.f2601a;
                        C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$2(lVar, hVar4 instanceof C0635e ? C1244j.f2601a : hVar4 instanceof C0632b ? C1244j.f2601a : hVar4 instanceof C0628a.C0630b ? new C0433j0<>(150, (C0448r) C0450s.C0451a.f1169a, 2) : C1244j.f2601a, (C19340c<? super StateLayer$handleInteraction$2>) null), 3);
                    }
                    lVar.f2606e = hVar3;
                }
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(C0639i iVar, C1243i iVar2, C19340c<? super Ripple$rememberUpdatedInstance$1> cVar) {
        super(2, cVar);
        this.$interactionSource = iVar;
        this.$instance = iVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, cVar);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Ripple$rememberUpdatedInstance$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 c = this.$interactionSource.mo3869c();
            C1229a aVar = new C1229a(this.$instance, (C19525d0) this.L$0);
            this.label = 1;
            c.getClass();
            if (C19671s1.m33431k(c, aVar, this) == coroutineSingletons) {
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
