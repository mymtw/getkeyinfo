package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements C19857l<C19340c<? super Object>, Object> {
    public final /* synthetic */ C1950f $font;
    public int label;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, C1950f fVar, C19340c<? super AsyncFontListLoader$load$2$typeface$1> cVar) {
        super(1, cVar);
        this.this$0 = asyncFontListLoader;
        this.$font = fVar;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, cVar);
    }

    public final Object invoke(C19340c<Object> cVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            AsyncFontListLoader asyncFontListLoader = this.this$0;
            C1950f fVar = this.$font;
            this.label = 1;
            obj = asyncFontListLoader.mo7502e(fVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
