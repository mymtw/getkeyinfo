package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.runtime.C1338j0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.HoverableKt$hoverable$2", mo70541f = "Hoverable.kt", mo70542l = {62}, mo70543m = "invoke$emitEnter")
final class HoverableKt$hoverable$2$invoke$emitEnter$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public HoverableKt$hoverable$2$invoke$emitEnter$1(C19340c<? super HoverableKt$hoverable$2$invoke$emitEnter$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.access$invoke$emitEnter((C0640j) null, (C1338j0) null, this);
    }
}
