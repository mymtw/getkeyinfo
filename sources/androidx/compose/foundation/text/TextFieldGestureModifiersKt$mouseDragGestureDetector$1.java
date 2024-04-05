package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.text.selection.C1008d;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", mo70541f = "TextFieldGestureModifiers.kt", mo70542l = {56}, mo70543m = "invokeSuspend")
final class TextFieldGestureModifiersKt$mouseDragGestureDetector$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1008d $observer;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldGestureModifiersKt$mouseDragGestureDetector$1(C1008d dVar, C19340c<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1> cVar) {
        super(2, cVar);
        this.$observer = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TextFieldGestureModifiersKt$mouseDragGestureDetector$1 textFieldGestureModifiersKt$mouseDragGestureDetector$1 = new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(this.$observer, cVar);
        textFieldGestureModifiersKt$mouseDragGestureDetector$1.L$0 = obj;
        return textFieldGestureModifiersKt$mouseDragGestureDetector$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((TextFieldGestureModifiersKt$mouseDragGestureDetector$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1008d dVar = this.$observer;
            this.label = 1;
            if (TextSelectionMouseDetectorKt.m2060b((C1652w) this.L$0, dVar, this) == coroutineSingletons) {
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
