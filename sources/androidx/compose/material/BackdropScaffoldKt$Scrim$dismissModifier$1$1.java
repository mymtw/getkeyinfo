package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1", mo70541f = "BackdropScaffold.kt", mo70542l = {394}, mo70543m = "invokeSuspend")
final class BackdropScaffoldKt$Scrim$dismissModifier$1$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<C19394m> $onDismiss;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$Scrim$dismissModifier$1$1(C19846a<C19394m> aVar, C19340c<? super BackdropScaffoldKt$Scrim$dismissModifier$1$1> cVar) {
        super(2, cVar);
        this.$onDismiss = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        BackdropScaffoldKt$Scrim$dismissModifier$1$1 backdropScaffoldKt$Scrim$dismissModifier$1$1 = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(this.$onDismiss, cVar);
        backdropScaffoldKt$Scrim$dismissModifier$1$1.L$0 = obj;
        return backdropScaffoldKt$Scrim$dismissModifier$1$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((BackdropScaffoldKt$Scrim$dismissModifier$1$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19846a<C19394m> aVar = this.$onDismiss;
            C10471 r3 = new C19857l<C8343c, C19394m>() {
                public /* synthetic */ Object invoke(Object obj) {
                    m34744invokek4lQ0M(((C8343c) obj).f18299a);
                    return C19394m.f43287a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m34744invokek4lQ0M(long j) {
                    aVar.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.m1414f((C1652w) this.L$0, (C19862q) null, r3, this, 7) == coroutineSingletons) {
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
