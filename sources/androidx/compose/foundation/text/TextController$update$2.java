package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.TextController$update$2", mo70541f = "CoreText.kt", mo70542l = {191}, mo70543m = "invokeSuspend")
public final class TextController$update$2 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$update$2(TextController textController, C19340c<? super TextController$update$2> cVar) {
        super(2, cVar);
        this.this$0 = textController;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TextController$update$2 textController$update$2 = new TextController$update$2(this.this$0, cVar);
        textController$update$2.L$0 = obj;
        return textController$update$2;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((TextController$update$2) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1652w wVar = (C1652w) this.L$0;
            C0958l lVar = this.this$0.f1925d;
            if (lVar != null) {
                this.label = 1;
                if (LongPressTextDragObserverKt.m1970b(wVar, lVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                C19383o.m32805o("longPressDragObserver");
                throw null;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
