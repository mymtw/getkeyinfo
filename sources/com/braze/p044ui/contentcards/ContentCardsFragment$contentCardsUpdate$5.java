package com.braze.p044ui.contentcards;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5", mo70541f = "ContentCardsFragment.kt", mo70542l = {308}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5 */
public final class ContentCardsFragment$contentCardsUpdate$5 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ ContentCardsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$contentCardsUpdate$5(ContentCardsFragment contentCardsFragment, C19340c<? super ContentCardsFragment$contentCardsUpdate$5> cVar) {
        super(1, cVar);
        this.this$0 = contentCardsFragment;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new ContentCardsFragment$contentCardsUpdate$5(this.this$0, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((ContentCardsFragment$contentCardsUpdate$5) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ContentCardsFragment contentCardsFragment = this.this$0;
            this.label = 1;
            if (contentCardsFragment.networkUnavailable(this) == coroutineSingletons) {
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
