package androidx.compose.foundation.layout;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", mo70541f = "WindowInsetsConnection.android.kt", mo70542l = {304, 330, 355}, mo70543m = "fling-huYlsQE")
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    public float F$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, C19340c<? super WindowInsetsNestedScrollConnection$fling$1> cVar) {
        super(cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4016h(0, 0.0f, false, this);
    }
}
