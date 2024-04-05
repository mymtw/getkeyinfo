package androidx.compose.p015ui.text.font;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {272, 285}, mo70543m = "load")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, C19340c<? super AsyncFontListLoader$load$1> cVar) {
        super(cVar);
        this.this$0 = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7501d(this);
    }
}
