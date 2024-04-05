package com.etsy.android.p327ui.conversation.list.ccm;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p040c9.C4632mc;
import p740eq.C19011a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListFragment$viewModel$2 */
public final class ConversationListFragment$viewModel$2 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ ConversationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListFragment$viewModel$2(ConversationListFragment conversationListFragment) {
        super(0);
        this.this$0 = conversationListFragment;
    }

    public final C2870k0.C2872b invoke() {
        C19011a<ConversationListViewModel> viewModelProvider = this.this$0.getViewModelProvider();
        C19383o.m32797g(viewModelProvider, "<this>");
        return new C4632mc(viewModelProvider);
    }
}
