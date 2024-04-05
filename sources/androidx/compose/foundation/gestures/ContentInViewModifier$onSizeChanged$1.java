package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p288y.C8345d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", mo70541f = "Scrollable.kt", mo70542l = {578}, mo70543m = "invokeSuspend")
final class ContentInViewModifier$onSizeChanged$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C8345d $adjustedBounds;
    public final /* synthetic */ C8345d $focusedBounds;
    public int label;
    public final /* synthetic */ ContentInViewModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$onSizeChanged$1(ContentInViewModifier contentInViewModifier, C8345d dVar, C8345d dVar2, C19340c<? super ContentInViewModifier$onSizeChanged$1> cVar) {
        super(2, cVar);
        this.this$0 = contentInViewModifier;
        this.$focusedBounds = dVar;
        this.$adjustedBounds = dVar2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ContentInViewModifier$onSizeChanged$1(this.this$0, this.$focusedBounds, this.$adjustedBounds, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ContentInViewModifier$onSizeChanged$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ContentInViewModifier contentInViewModifier = this.this$0;
            C8345d dVar = this.$focusedBounds;
            C8345d dVar2 = this.$adjustedBounds;
            this.label = 1;
            int i2 = ContentInViewModifier.f1306j;
            if (contentInViewModifier.mo3729e(dVar, dVar2, this) == coroutineSingletons) {
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
