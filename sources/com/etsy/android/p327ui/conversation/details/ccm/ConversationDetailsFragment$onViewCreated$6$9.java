package com.etsy.android.p327ui.conversation.details.ccm;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onViewCreated$6$9 */
public final class ConversationDetailsFragment$onViewCreated$6$9 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onViewCreated$6$9(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        this.this$0.showErrorAlert(i);
    }
}
