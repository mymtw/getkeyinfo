package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.p327ui.conversation.details.C9559o;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onViewCreated$5 */
public final class ConversationDetailsFragment$onViewCreated$5 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onViewCreated$5(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        ConversationDetailsViewModel access$getViewModel = this.this$0.getViewModel();
        C9559o[] oVarArr = access$getViewModel.f21015H;
        C9559o oVar = oVarArr[i];
        oVarArr[i] = C9559o.C9562c.f21220a;
        access$getViewModel.mo32010f();
        access$getViewModel.mo32011g();
        if (oVar instanceof C9559o.C9560a) {
            ((C9559o.C9560a) oVar).f21218b.delete();
        }
    }
}
