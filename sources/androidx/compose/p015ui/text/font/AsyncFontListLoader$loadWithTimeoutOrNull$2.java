package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {305}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Object>, Object> {
    public final /* synthetic */ C1950f $this_loadWithTimeoutOrNull;
    public int label;
    public final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, C1950f fVar, C19340c<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> cVar) {
        super(2, cVar);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = fVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1963q qVar = this.this$0.f4382f;
            C1950f fVar = this.$this_loadWithTimeoutOrNull;
            this.label = 1;
            obj = qVar.mo7529c(fVar, this);
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
