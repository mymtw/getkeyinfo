package com.etsy.android.p327ui.conversation.details.legacy;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.d */
public final /* synthetic */ class C9544d implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ LegacyConversationDetailsFragment f21164b;

    public /* synthetic */ C9544d(LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
        this.f21164b = legacyConversationDetailsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LegacyConversationDetailsFragment.m34949showMarkAsSpamConfirmation$lambda4(this.f21164b, dialogInterface, i);
    }
}
