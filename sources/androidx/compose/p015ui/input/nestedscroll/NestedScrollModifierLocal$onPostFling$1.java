package androidx.compose.p015ui.input.nestedscroll;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", mo70541f = "NestedScrollModifierLocal.kt", mo70542l = {94, 96}, mo70543m = "onPostFling-RZ2iAVY")
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 */
public final class NestedScrollModifierLocal$onPostFling$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollModifierLocal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, C19340c<? super NestedScrollModifierLocal$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = nestedScrollModifierLocal;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3814a(0, 0, this);
    }
}
