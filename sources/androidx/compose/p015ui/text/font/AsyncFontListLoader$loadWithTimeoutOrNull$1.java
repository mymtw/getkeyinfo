package androidx.compose.p015ui.text.font;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {304}, mo70543m = "loadWithTimeoutOrNull$ui_text_release")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, C19340c<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> cVar) {
        super(cVar);
        this.this$0 = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7502e((C1950f) null, this);
    }
}
