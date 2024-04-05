package com.etsy.android.p327ui.conversation.details.legacy;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$sendUnsentDrafts$1 */
public final class LegacyConversationDetailsPresenter$sendUnsentDrafts$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ Ref$IntRef $draftsToSend;
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$sendUnsentDrafts$1(Ref$IntRef ref$IntRef, LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        super(1);
        this.$draftsToSend = ref$IntRef;
        this.this$0 = legacyConversationDetailsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        Ref$IntRef ref$IntRef = this.$draftsToSend;
        int i = ref$IntRef.element - 1;
        ref$IntRef.element = i;
        if (i == 0) {
            this.this$0.f21135q.setSending(false);
        }
    }
}
