package androidx.compose.p015ui.text.input;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.text.input.TextInputServiceAndroid", mo70541f = "TextInputServiceAndroid.android.kt", mo70542l = {189}, mo70543m = "textInputCommandEventLoop")
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 */
public final class TextInputServiceAndroid$textInputCommandEventLoop$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$textInputCommandEventLoop$1(TextInputServiceAndroid textInputServiceAndroid, C19340c<? super TextInputServiceAndroid$textInputCommandEventLoop$1> cVar) {
        super(cVar);
        this.this$0 = textInputServiceAndroid;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7642f(this);
    }
}
