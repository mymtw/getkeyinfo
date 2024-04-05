package com.etsy.android.p327ui.user.language;

import com.etsy.android.p327ui.user.language.C11597d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.language.LanguageSelectFragment$initViewStates$2 */
public final class LanguageSelectFragment$initViewStates$2 extends Lambda implements C19857l<C11597d, C19394m> {
    public final /* synthetic */ LanguageSelectFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguageSelectFragment$initViewStates$2(LanguageSelectFragment languageSelectFragment) {
        super(1);
        this.this$0 = languageSelectFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11597d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11597d dVar) {
        C19383o.m32797g(dVar, "state");
        if (dVar instanceof C11597d.C11601d) {
            this.this$0.showLoadingView();
        } else if (dVar instanceof C11597d.C11602e) {
            this.this$0.showLanguages(((C11597d.C11602e) dVar).f25690a);
        } else if (dVar instanceof C11597d.C11598a) {
            this.this$0.showEmptyView();
        } else if (dVar instanceof C11597d.C11599b) {
            this.this$0.showErrorView();
        } else if (dVar instanceof C11597d.C11600c) {
            this.this$0.toHome();
        }
    }
}
