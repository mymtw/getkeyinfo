package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {151}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1 */
public final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ AsyncFontListLoader $asyncLoader;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader asyncFontListLoader, C19340c<? super FontListFontFamilyTypefaceAdapter$resolve$1> cVar) {
        super(2, cVar);
        this.$asyncLoader = asyncFontListLoader;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.$asyncLoader, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            AsyncFontListLoader asyncFontListLoader = this.$asyncLoader;
            this.label = 1;
            if (asyncFontListLoader.mo7501d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
