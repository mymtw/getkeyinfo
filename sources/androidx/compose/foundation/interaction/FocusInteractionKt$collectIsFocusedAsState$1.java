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

@C19060c(mo70540c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", mo70541f = "FocusInteraction.kt", mo70542l = {69}, mo70543m = "invokeSuspend")
final class FocusInteractionKt$collectIsFocusedAsState$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1338j0<Boolean> $isFocused;
    public final /* synthetic */ C0639i $this_collectIsFocusedAsState;
    public int label;

    /* renamed from: androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$a */
    public static final class C0625a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ List<C0632b> f1369b;

        /* renamed from: c */
        public final /* synthetic */ C1338j0<Boolean> f1370c;

        public C0625a(ArrayList arrayList, C1338j0 j0Var) {
            this.f1369b = arrayList;
            this.f1370c = j0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            C0638h hVar = (C0638h) obj;
            if (hVar instanceof C0632b) {
                this.f1369b.add(hVar);
            } else if (hVar instanceof C0633c) {
                this.f1369b.remove(((C0633c) hVar).f1377a);
            }
            this.f1370c.setValue(Boolean.valueOf(!this.f1369b.isEmpty()));
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusInteractionKt$collectIsFocusedAsState$1(C0639i iVar, C1338j0<Boolean> j0Var, C19340c<? super FocusInteractionKt$collectIsFocusedAsState$1> cVar) {
        super(2, cVar);
        this.$this_collectIsFocusedAsState = iVar;
        this.$isFocused = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FocusInteractionKt$collectIsFocusedAsState$1(this.$this_collectIsFocusedAsState, this.$isFocused, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ArrayList arrayList = new ArrayList();
            C19671s1 c = this.$this_collectIsFocusedAsState.mo3869c();
            C0625a aVar = new C0625a(arrayList, this.$isFocused);
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
