package com.etsy.android.p327ui.listing.p329ui.pushoptin;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.pushoptin.ConversationPushOptInBottomSheetFragment$onCreateView$2 */
public final class ConversationPushOptInBottomSheetFragment$onCreateView$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ConversationPushOptInBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationPushOptInBottomSheetFragment$onCreateView$2(ConversationPushOptInBottomSheetFragment conversationPushOptInBottomSheetFragment) {
        super(1);
        this.this$0 = conversationPushOptInBottomSheetFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.userDismissed = true;
        this.this$0.dismiss();
    }
}
