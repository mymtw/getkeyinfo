package com.etsy.android.p327ui.conversation.details.ccm;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.c */
public final /* synthetic */ class C9494c implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ConversationDetailsFragment f21056b;

    public /* synthetic */ C9494c(ConversationDetailsFragment conversationDetailsFragment) {
        this.f21056b = conversationDetailsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConversationDetailsFragment.m34943showArchiveConfirmation$lambda12(this.f21056b, dialogInterface, i);
    }
}
