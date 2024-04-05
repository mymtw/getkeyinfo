package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.R;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.EtsyWebKey;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onCreate$5 */
public final class ConversationDetailsFragment$onCreate$5 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onCreate$5(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "it");
        C12788a.m20424c(this.this$0.getActivity(), new EtsyWebKey(C19421p.m32935c0(this.this$0.getActivity()), 18, str, this.this$0.getString(R.string.help_with_order)));
    }
}
