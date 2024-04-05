package com.etsy.android.p327ui.user.language;

import android.content.DialogInterface;

/* renamed from: com.etsy.android.ui.user.language.f */
public final /* synthetic */ class C11604f implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ LanguageSelectFragment f25692b;

    /* renamed from: c */
    public final /* synthetic */ C11609i f25693c;

    public /* synthetic */ C11604f(LanguageSelectFragment languageSelectFragment, C11609i iVar) {
        this.f25692b = languageSelectFragment;
        this.f25693c = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LanguageSelectFragment.m35064showConfirmationDialog$lambda0(this.f25692b, this.f25693c, dialogInterface, i);
    }
}
