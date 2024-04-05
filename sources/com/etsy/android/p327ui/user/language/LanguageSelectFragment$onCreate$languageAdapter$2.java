package com.etsy.android.p327ui.user.language;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.language.LanguageSelectFragment$onCreate$languageAdapter$2 */
public final class LanguageSelectFragment$onCreate$languageAdapter$2 extends Lambda implements C19857l<C11609i, C19394m> {
    public final /* synthetic */ LanguageSelectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguageSelectFragment$onCreate$languageAdapter$2(LanguageSelectFragment languageSelectFragment) {
        super(1);
        this.this$0 = languageSelectFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11609i) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11609i iVar) {
        C19383o.m32797g(iVar, "newLanguage");
        this.this$0.onLanguageSelected(iVar);
    }
}
