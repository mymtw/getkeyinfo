package com.etsy.android.p327ui.conversation.details.legacy;

import android.content.DialogInterface;
import com.etsy.android.p327ui.user.language.LanguageSelectFragment;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.c */
public final /* synthetic */ class C9543c implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21163b;

    public /* synthetic */ C9543c(int i) {
        this.f21163b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f21163b) {
            case 0:
                LegacyConversationDetailsFragment.m34952showMarkAsTrashConfirmation$lambda7(dialogInterface, i);
                return;
            default:
                LanguageSelectFragment.m35065showConfirmationDialog$lambda1(dialogInterface, i);
                return;
        }
    }
}
