package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.R;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$loadContent$1 */
final class LegacyConversationDetailsPresenter$loadContent$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$loadContent$1(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        super(1);
        this.this$0 = legacyConversationDetailsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f21120b.showError((int) R.string.no_internet);
        this.this$0.f21120b.stopRefreshing();
    }
}
