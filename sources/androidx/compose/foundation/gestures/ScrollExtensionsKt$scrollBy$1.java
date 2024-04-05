package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", mo70541f = "ScrollExtensions.kt", mo70542l = {61}, mo70543m = "scrollBy")
final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public ScrollExtensionsKt$scrollBy$1(C19340c<? super ScrollExtensionsKt$scrollBy$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            scrollExtensionsKt$scrollBy$1 = this;
        } else {
            scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(this);
        }
        Object obj2 = scrollExtensionsKt$scrollBy$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollExtensionsKt$scrollBy$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(ref$FloatRef2, 0.0f, (C19340c<? super ScrollExtensionsKt$scrollBy$2>) null);
            scrollExtensionsKt$scrollBy$1.L$0 = ref$FloatRef2;
            scrollExtensionsKt$scrollBy$1.label = 1;
            if (null.mo3690a(MutatePriority.Default, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else if (i2 == 1) {
            ref$FloatRef = (Ref$FloatRef) scrollExtensionsKt$scrollBy$1.L$0;
            C0761x.m1684O0(obj2);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new Float(ref$FloatRef.element);
    }
}
