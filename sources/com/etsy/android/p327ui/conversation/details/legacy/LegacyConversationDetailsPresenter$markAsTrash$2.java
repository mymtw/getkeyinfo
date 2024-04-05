package com.etsy.android.p327ui.conversation.details.legacy;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$markAsTrash$2 */
final class LegacyConversationDetailsPresenter$markAsTrash$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$markAsTrash$2(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        super(0);
        this.this$0 = legacyConversationDetailsPresenter;
    }

    public final void invoke() {
        this.this$0.f21120b.onStatusChanged();
        this.this$0.f21120b.goBack();
        this.this$0.f21120b.hideLoadingDialog();
    }
}
