package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.R;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyDraftMessage;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$sendMessage$2 */
final /* synthetic */ class LegacyConversationDetailsPresenter$sendMessage$2 extends FunctionReferenceImpl implements C19857l<Throwable, C19394m> {
    public LegacyConversationDetailsPresenter$sendMessage$2(Object obj) {
        super(1, obj, LegacyConversationDetailsPresenter.class, "onSendError", "onSendError(Ljava/lang/Throwable;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "p0");
        LegacyConversationDetailsPresenter legacyConversationDetailsPresenter = (LegacyConversationDetailsPresenter) this.receiver;
        legacyConversationDetailsPresenter.f21135q.setSending(false);
        LegacyDraftMessage legacyDraftMessage = legacyConversationDetailsPresenter.f21136r;
        LegacyDraftMessage.Status status = LegacyDraftMessage.Status.IN_DRAFT;
        legacyDraftMessage.getClass();
        C19383o.m32797g(status, "<set-?>");
        legacyDraftMessage.f21158g = status;
        legacyConversationDetailsPresenter.mo32104a();
        legacyConversationDetailsPresenter.f21120b.hideLoadingDialog();
        legacyConversationDetailsPresenter.f21120b.showError((int) R.string.convo_status_failed);
    }
}
