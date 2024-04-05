package com.etsy.android.p327ui.conversation.list.ccm;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p354gc.C12763b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListFragment$onCreate$2 */
public final class ConversationListFragment$onCreate$2 extends Lambda implements C19857l<C12763b, C19394m> {
    public final /* synthetic */ ConversationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListFragment$onCreate$2(ConversationListFragment conversationListFragment) {
        super(1);
        this.this$0 = conversationListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12763b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C12763b bVar) {
        C19383o.m32797g(bVar, "it");
        this.this$0.launchConversation(bVar);
    }
}
