package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", mo70541f = "ScrollExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Ref$FloatRef $consumed;
    public final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(Ref$FloatRef ref$FloatRef, float f, C19340c<? super ScrollExtensionsKt$scrollBy$2> cVar) {
        super(2, cVar);
        this.$consumed = ref$FloatRef;
        this.$value = f;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, cVar);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((ScrollExtensionsKt$scrollBy$2) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.$consumed.element = ((C0614l) this.L$0).mo3737a(this.$value);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
