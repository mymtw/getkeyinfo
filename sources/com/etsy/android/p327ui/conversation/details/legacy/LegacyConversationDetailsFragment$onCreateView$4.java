package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.p327ui.conversation.details.C9559o;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsFragment$onCreateView$4 */
public final class LegacyConversationDetailsFragment$onCreateView$4 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ LegacyConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsFragment$onCreateView$4(LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
        super(1);
        this.this$0 = legacyConversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        LegacyConversationDetailsPresenter presenter = this.this$0.getPresenter();
        C9559o[] oVarArr = presenter.f21134p;
        C9559o oVar = oVarArr[i];
        oVarArr[i] = C9559o.C9562c.f21220a;
        if (oVar instanceof C9559o.C9560a) {
            ((C9559o.C9560a) oVar).f21218b.delete();
        }
        presenter.f21120b.removeImageAttachment(i);
        presenter.mo32105b();
        presenter.mo32104a();
    }
}
