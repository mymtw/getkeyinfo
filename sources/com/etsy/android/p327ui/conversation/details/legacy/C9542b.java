package com.etsy.android.p327ui.conversation.details.legacy;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.b */
public final /* synthetic */ class C9542b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ LegacyConversationDetailsFragment f21162b;

    public /* synthetic */ C9542b(LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
        this.f21162b = legacyConversationDetailsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LegacyConversationDetailsFragment.m34951showMarkAsTrashConfirmation$lambda6(this.f21162b, dialogInterface, i);
    }
}
