package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.lib.models.conversation.ccm.ConversationMetadata;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$markAsUnread$2 */
final class ConversationDetailsViewModel$markAsUnread$2 extends Lambda implements C19857l<ConversationMetadata, C19394m> {
    public final /* synthetic */ ConversationDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModel$markAsUnread$2(ConversationDetailsViewModel conversationDetailsViewModel) {
        super(1);
        this.this$0 = conversationDetailsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConversationMetadata) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ConversationMetadata conversationMetadata) {
        this.this$0.f21024g.mo34416c();
        C12060q.m19871b(this.this$0.f21008A, C19394m.f43287a);
    }
}
