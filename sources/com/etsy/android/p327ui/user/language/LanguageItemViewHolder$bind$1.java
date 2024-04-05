package com.etsy.android.p327ui.user.language;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.language.LanguageItemViewHolder$bind$1 */
final class LanguageItemViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11609i $selectedLanguage;
    public final /* synthetic */ C11596c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguageItemViewHolder$bind$1(C11596c cVar, C11609i iVar) {
        super(1);
        this.this$0 = cVar;
        this.$selectedLanguage = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f25684c.invoke(this.$selectedLanguage);
    }
}
