package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$getConversation$2 */
final class ConversationDetailsViewModel$getConversation$2 extends Lambda implements C19857l<ConversationResponse, C19394m> {
    public final /* synthetic */ ConversationDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModel$getConversation$2(ConversationDetailsViewModel conversationDetailsViewModel) {
        super(1);
        this.this$0 = conversationDetailsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConversationResponse) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ConversationResponse conversationResponse) {
        ConversationDetailsViewModel conversationDetailsViewModel = this.this$0;
        C19383o.m32796f(conversationResponse, "result");
        ConversationDetailsViewModel.m17868c(conversationDetailsViewModel, conversationResponse);
    }
}
