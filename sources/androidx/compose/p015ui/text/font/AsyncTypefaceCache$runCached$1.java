package androidx.compose.p015ui.text.font;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.ui.text.font.AsyncTypefaceCache", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {399}, mo70543m = "runCached")
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, C19340c<? super AsyncTypefaceCache$runCached$1> cVar) {
        super(cVar);
        this.this$0 = asyncTypefaceCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7505b((C1950f) null, (C1963q) null, false, (C19857l<? super C19340c<Object>, ? extends Object>) null, this);
    }
}
