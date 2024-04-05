package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.p327ui.conversation.details.C9531k;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListPresenter$startListeningForNotifications$2 */
final class LegacyConversationListPresenter$startListeningForNotifications$2 extends Lambda implements C19857l<C9531k, C19394m> {
    public final /* synthetic */ LegacyConversationListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationListPresenter$startListeningForNotifications$2(LegacyConversationListPresenter legacyConversationListPresenter) {
        super(1);
        this.this$0 = legacyConversationListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9531k) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9531k kVar) {
        this.this$0.mo32218a().refreshConvos();
    }
}
