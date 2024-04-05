package com.etsy.android.p327ui.conversation.details.ccm;

import android.widget.EditText;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onViewCreated$6$5 */
public final class ConversationDetailsFragment$onViewCreated$6$5 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onViewCreated$6$5(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "it");
        EditText access$getMessageInputView$p = this.this$0.messageInputView;
        if (access$getMessageInputView$p != null) {
            access$getMessageInputView$p.setText(str);
        }
    }
}
