package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.C0628a;
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

@C19060c(mo70540c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1", mo70541f = "DragInteraction.kt", mo70542l = {84}, mo70543m = "invokeSuspend")
final class DragInteractionKt$collectIsDraggedAsState$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1338j0<Boolean> $isDragged;
    public final /* synthetic */ C0639i $this_collectIsDraggedAsState;
    public int label;

    /* renamed from: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$a */
    public static final class C0624a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ List<C0628a.C0630b> f1367b;

        /* renamed from: c */
        public final /* synthetic */ C1338j0<Boolean> f1368c;

        public C0624a(ArrayList arrayList, C1338j0 j0Var) {
            this.f1367b = arrayList;
            this.f1368c = j0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            C0638h hVar = (C0638h) obj;
            if (hVar instanceof C0628a.C0630b) {
                this.f1367b.add(hVar);
            } else if (hVar instanceof C0628a.C0631c) {
                this.f1367b.remove(((C0628a.C0631c) hVar).f1376a);
            } else if (hVar instanceof C0628a.C0629a) {
                this.f1367b.remove(((C0628a.C0629a) hVar).f1375a);
            }
            this.f1368c.setValue(Boolean.valueOf(!this.f1367b.isEmpty()));
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragInteractionKt$collectIsDraggedAsState$1(C0639i iVar, C1338j0<Boolean> j0Var, C19340c<? super DragInteractionKt$collectIsDraggedAsState$1> cVar) {
        super(2, cVar);
        this.$this_collectIsDraggedAsState = iVar;
        this.$isDragged = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DragInteractionKt$collectIsDraggedAsState$1(this.$this_collectIsDraggedAsState, this.$isDragged, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DragInteractionKt$collectIsDraggedAsState$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ArrayList arrayList = new ArrayList();
            C19671s1 c = this.$this_collectIsDraggedAsState.mo3869c();
            C0624a aVar = new C0624a(arrayList, this.$isDragged);
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
