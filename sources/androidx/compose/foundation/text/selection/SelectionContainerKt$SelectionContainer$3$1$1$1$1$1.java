package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1", mo70541f = "SelectionContainer.kt", mo70542l = {126}, mo70543m = "invokeSuspend")
public final class SelectionContainerKt$SelectionContainer$3$1$1$1$1$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0958l $observer;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(C0958l lVar, C19340c<? super SelectionContainerKt$SelectionContainer$3$1$1$1$1$1> cVar) {
        super(2, cVar);
        this.$observer = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SelectionContainerKt$SelectionContainer$3$1$1$1$1$1 selectionContainerKt$SelectionContainer$3$1$1$1$1$1 = new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(this.$observer, cVar);
        selectionContainerKt$SelectionContainer$3$1$1$1$1$1.L$0 = obj;
        return selectionContainerKt$SelectionContainer$3$1$1$1$1$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((SelectionContainerKt$SelectionContainer$3$1$1$1$1$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C0958l lVar = this.$observer;
            this.label = 1;
            if (LongPressTextDragObserverKt.m1969a((C1652w) this.L$0, lVar, this) == coroutineSingletons) {
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
