package androidx.compose.foundation.interaction;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1338j0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19671s1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", mo70541f = "PressInteraction.kt", mo70542l = {85}, mo70543m = "invokeSuspend")
final class PressInteractionKt$collectIsPressedAsState$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1338j0<Boolean> $isPressed;
    public final /* synthetic */ C0639i $this_collectIsPressedAsState;
    public int label;

    /* renamed from: androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$a */
    public static final class C0627a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ List<C0643m> f1373b;

        /* renamed from: c */
        public final /* synthetic */ C1338j0<Boolean> f1374c;

        public C0627a(ArrayList arrayList, C1338j0 j0Var) {
            this.f1373b = arrayList;
            this.f1374c = j0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            C0638h hVar = (C0638h) obj;
            if (hVar instanceof C0643m) {
                this.f1373b.add(hVar);
            } else if (hVar instanceof C0644n) {
                this.f1373b.remove(((C0644n) hVar).f1382a);
            } else if (hVar instanceof C0642l) {
                this.f1373b.remove(((C0642l) hVar).f1380a);
            }
            this.f1374c.setValue(Boolean.valueOf(!this.f1373b.isEmpty()));
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1(C0639i iVar, C1338j0<Boolean> j0Var, C19340c<? super PressInteractionKt$collectIsPressedAsState$1> cVar) {
        super(2, cVar);
        this.$this_collectIsPressedAsState = iVar;
        this.$isPressed = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PressInteractionKt$collectIsPressedAsState$1(this.$this_collectIsPressedAsState, this.$isPressed, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PressInteractionKt$collectIsPressedAsState$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ArrayList arrayList = new ArrayList();
            C19671s1 c = this.$this_collectIsPressedAsState.mo3869c();
            C0627a aVar = new C0627a(arrayList, this.$isPressed);
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
