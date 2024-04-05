package com.etsy.android.p327ui.conversation.list.ccm;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListFragment$onViewCreated$4 */
public final class ConversationListFragment$onViewCreated$4 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ ConversationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListFragment$onViewCreated$4(ConversationListFragment conversationListFragment) {
        super(1);
        this.this$0 = conversationListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        this.this$0.showErrorAlert(i);
    }
}
