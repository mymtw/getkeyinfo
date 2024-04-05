package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListFragment$onCreate$1 */
public final class LegacyConversationListFragment$onCreate$1 extends Lambda implements C19857l<EtsyId, C19394m> {
    public final /* synthetic */ LegacyConversationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationListFragment$onCreate$1(LegacyConversationListFragment legacyConversationListFragment) {
        super(1);
        this.this$0 = legacyConversationListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EtsyId) obj);
        return C19394m.f43287a;
    }

    public final void invoke(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "it");
        this.this$0.presenter.mo32218a().navigateToUserWebView(etsyId);
    }
}
