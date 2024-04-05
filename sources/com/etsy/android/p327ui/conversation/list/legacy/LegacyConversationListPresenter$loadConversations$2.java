package com.etsy.android.p327ui.conversation.list.legacy;

import com.etsy.android.R;
import com.etsy.android.p327ui.conversation.list.legacy.C9600h;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListPresenter$loadConversations$2 */
public final class LegacyConversationListPresenter$loadConversations$2 extends Lambda implements C19857l<C9600h, C19394m> {
    public final /* synthetic */ LegacyConversationListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationListPresenter$loadConversations$2(LegacyConversationListPresenter legacyConversationListPresenter) {
        super(1);
        this.this$0 = legacyConversationListPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9600h) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9600h hVar) {
        LegacyConversationListPresenter legacyConversationListPresenter = this.this$0;
        C19383o.m32796f(hVar, "result");
        legacyConversationListPresenter.getClass();
        if (hVar instanceof C9600h.C9602b) {
            C9600h.C9602b bVar = (C9600h.C9602b) hVar;
            legacyConversationListPresenter.mo32220c(bVar.f21291a, bVar.f21292b, bVar.f21293c);
        } else if (hVar instanceof C9600h.C9601a) {
            C9600h.C9601a aVar = (C9600h.C9601a) hVar;
            if (aVar.f21288a.isEmpty()) {
                legacyConversationListPresenter.mo32218a().showErrorView();
            } else {
                legacyConversationListPresenter.mo32220c(aVar.f21288a, aVar.f21289b, aVar.f21290c);
                legacyConversationListPresenter.mo32218a().showErrorSnackbar(R.string.convo_error);
            }
            legacyConversationListPresenter.mo32218a().stopRefreshing();
        }
    }
}
