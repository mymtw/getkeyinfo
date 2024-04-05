package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", mo70541f = "AndroidFontLoader.android.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2 */
final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Typeface>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1968t $this_loadAsync;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt$loadAsync$2(C1968t tVar, Context context, C19340c<? super AndroidFontLoader_androidKt$loadAsync$2> cVar) {
        super(2, cVar);
        this.$this_loadAsync = tVar;
        this.$context = context;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.$this_loadAsync, this.$context, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super Typeface> cVar) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C1968t tVar = this.$this_loadAsync;
            return C1969u.f4427a.mo7587a(this.$context, tVar);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
