package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.TextController;
import androidx.compose.foundation.text.selection.C1008d;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.TextController$update$3", mo70541f = "CoreText.kt", mo70542l = {282}, mo70543m = "invokeSuspend")
public final class TextController$update$3 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ TextController.C0923b $mouseSelectionObserver;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$update$3(TextController.C0923b bVar, C19340c<? super TextController$update$3> cVar) {
        super(2, cVar);
        this.$mouseSelectionObserver = bVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TextController$update$3 textController$update$3 = new TextController$update$3(this.$mouseSelectionObserver, cVar);
        textController$update$3.L$0 = obj;
        return textController$update$3;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((TextController$update$3) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.label = 1;
            if (TextSelectionMouseDetectorKt.m2060b((C1652w) this.L$0, (C1008d) null, this) == coroutineSingletons) {
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
