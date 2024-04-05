package com.braze.p044ui.contentcards;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p301z3.C8433c;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1", mo70541f = "ContentCardsFragment.kt", mo70542l = {268}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1 */
public final class ContentCardsFragment$handleContentCardsUpdatedEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C8433c $event;
    public int label;
    public final /* synthetic */ ContentCardsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$handleContentCardsUpdatedEvent$1(ContentCardsFragment contentCardsFragment, C8433c cVar, C19340c<? super ContentCardsFragment$handleContentCardsUpdatedEvent$1> cVar2) {
        super(2, cVar2);
        this.this$0 = contentCardsFragment;
        this.$event = cVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this.this$0, this.$event, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ContentCardsFragment$handleContentCardsUpdatedEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ContentCardsFragment contentCardsFragment = this.this$0;
            C8433c cVar = this.$event;
            this.label = 1;
            if (contentCardsFragment.contentCardsUpdate(cVar, this) == coroutineSingletons) {
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
