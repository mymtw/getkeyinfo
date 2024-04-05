package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.p327ui.listing.p329ui.pushoptin.ConversationPushOptInBottomSheetKey;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p356ge.C12790b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onViewCreated$6$6 */
public final class ConversationDetailsFragment$onViewCreated$6$6 extends Lambda implements C19857l<C19394m, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onViewCreated$6$6(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C19394m) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C19394m mVar) {
        C19383o.m32797g(mVar, "it");
        C12790b.m20430b(this.this$0, new ConversationPushOptInBottomSheetKey(C12790b.m20432d(this.this$0), "conversation_details"));
    }
}
