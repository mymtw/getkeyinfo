package com.etsy.android.p327ui.conversation.list.ccm;

import android.os.Bundle;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListFragment$onCreate$1 */
public final class ConversationListFragment$onCreate$1 extends Lambda implements C19857l<EtsyId, C19394m> {
    public final /* synthetic */ ConversationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationListFragment$onCreate$1(ConversationListFragment conversationListFragment) {
        super(1);
        this.this$0 = conversationListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EtsyId) obj);
        return C19394m.f43287a;
    }

    public final void invoke(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "it");
        C12788a.m20424c(this.this$0.getActivity(), new UserProfileKey(C19421p.m32935c0(this.this$0.getActivity()), etsyId, (Bundle) null, 4, (DefaultConstructorMarker) null));
    }
}
