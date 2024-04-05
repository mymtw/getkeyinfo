package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.lib.models.conversation.ccm.ConversationMetadata;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.ccm.C9510o;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p354gc.C12764c;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.l */
public final /* synthetic */ class C9507l implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ ConversationAction f21080b;

    /* renamed from: c */
    public final /* synthetic */ C9510o f21081c;

    public /* synthetic */ C9507l(ConversationAction conversationAction, C9510o oVar) {
        this.f21080b = conversationAction;
        this.f21081c = oVar;
    }

    public final void accept(Object obj) {
        ConversationAction conversationAction = this.f21080b;
        C9510o oVar = this.f21081c;
        ConversationMetadata conversationMetadata = (ConversationMetadata) obj;
        C19383o.m32797g(conversationAction, "$action");
        C19383o.m32797g(oVar, "this$0");
        int i = C9510o.C9511a.f21088a[conversationAction.ordinal()];
        if (i == 1) {
            C9477c cVar = oVar.f21087b;
            C19383o.m32796f(conversationMetadata, "it");
            cVar.mo31975g(C12764c.m20410a(conversationMetadata));
        } else if (i == 2 || i == 3) {
            oVar.f21087b.mo31970b(conversationMetadata.getConversationId());
        }
    }
}
