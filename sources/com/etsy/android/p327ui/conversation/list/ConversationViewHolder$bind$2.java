package com.etsy.android.p327ui.conversation.list;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p354gc.C12763b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.ConversationViewHolder$bind$2 */
public final class ConversationViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C12763b $conversation;
    public final /* synthetic */ ConversationViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationViewHolder$bind$2(ConversationViewHolder conversationViewHolder, C12763b bVar) {
        super(1);
        this.this$0 = conversationViewHolder;
        this.$conversation = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f21223c.invoke(this.$conversation);
    }
}
