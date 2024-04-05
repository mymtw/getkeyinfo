package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.R;
import com.etsy.android.p327ui.conversation.details.C9565r;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyDraftMessage;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$sendMessage$3 */
final class LegacyConversationDetailsPresenter$sendMessage$3 extends Lambda implements C19857l<C9565r, C19394m> {
    public final /* synthetic */ boolean $hasImageAttachments;
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$sendMessage$3(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter, boolean z) {
        super(1);
        this.this$0 = legacyConversationDetailsPresenter;
        this.$hasImageAttachments = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9565r) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9565r rVar) {
        LegacyConversationDetailsPresenter legacyConversationDetailsPresenter = this.this$0;
        C19383o.m32796f(rVar, "result");
        boolean z = this.$hasImageAttachments;
        boolean z2 = false;
        legacyConversationDetailsPresenter.f21135q.setSending(false);
        LegacyDraftMessage legacyDraftMessage = legacyConversationDetailsPresenter.f21136r;
        LegacyDraftMessage.Status status = LegacyDraftMessage.Status.IN_DRAFT;
        legacyDraftMessage.getClass();
        C19383o.m32797g(status, "<set-?>");
        legacyDraftMessage.f21158g = status;
        legacyConversationDetailsPresenter.mo32104a();
        legacyConversationDetailsPresenter.f21120b.hideLoadingDialog();
        if (rVar instanceof C9565r.C9567b) {
            legacyConversationDetailsPresenter.f21120b.onMessageSent();
            if (z) {
                legacyConversationDetailsPresenter.f21120b.refreshConversation();
            } else {
                legacyConversationDetailsPresenter.f21120b.addDraftToAdapter(legacyConversationDetailsPresenter.f21136r.mo32136a());
            }
            legacyConversationDetailsPresenter.f21120b.clearMessageInput();
        } else if (rVar instanceof C9565r.C9566a) {
            C9565r.C9566a aVar = (C9565r.C9566a) rVar;
            String str = aVar.f21221a;
            if (str != null) {
                if (str.length() > 0) {
                    z2 = true;
                }
            }
            if (z2) {
                legacyConversationDetailsPresenter.f21120b.showError((CharSequence) aVar.f21221a);
            } else {
                legacyConversationDetailsPresenter.f21120b.showError((int) R.string.convo_status_failed);
            }
        }
    }
}
