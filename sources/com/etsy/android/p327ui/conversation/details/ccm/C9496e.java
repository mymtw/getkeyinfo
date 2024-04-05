package com.etsy.android.p327ui.conversation.details.ccm;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.e */
public final /* synthetic */ class C9496e implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ConversationDetailsFragment f21057b;

    public /* synthetic */ C9496e(ConversationDetailsFragment conversationDetailsFragment) {
        this.f21057b = conversationDetailsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationDetailsFragment.m34945showMarkAsSpamConfirmation$lambda14(this.f21057b, dialogInterface, i);
    }
}
