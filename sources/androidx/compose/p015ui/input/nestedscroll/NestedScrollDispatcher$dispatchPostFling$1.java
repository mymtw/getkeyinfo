package androidx.compose.p015ui.input.nestedscroll;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", mo70541f = "NestedScrollModifier.kt", mo70542l = {217}, mo70543m = "dispatchPostFling-RZ2iAVY")
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, C19340c<? super NestedScrollDispatcher$dispatchPostFling$1> cVar) {
        super(cVar);
        this.this$0 = nestedScrollDispatcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo6535a(0, 0, this);
    }
}
