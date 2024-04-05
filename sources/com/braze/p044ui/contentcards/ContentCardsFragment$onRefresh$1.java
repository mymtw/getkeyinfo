package com.braze.p044ui.contentcards;

import androidx.compose.foundation.layout.C0761x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1", mo70541f = "ContentCardsFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1 */
public final class ContentCardsFragment$onRefresh$1 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ ContentCardsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onRefresh$1(ContentCardsFragment contentCardsFragment, C19340c<? super ContentCardsFragment$onRefresh$1> cVar) {
        super(1, cVar);
        this.this$0 = contentCardsFragment;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new ContentCardsFragment$onRefresh$1(this.this$0, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((ContentCardsFragment$onRefresh$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            SwipeRefreshLayout contentCardsSwipeLayout = this.this$0.getContentCardsSwipeLayout();
            if (contentCardsSwipeLayout != null) {
                contentCardsSwipeLayout.setRefreshing(false);
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
