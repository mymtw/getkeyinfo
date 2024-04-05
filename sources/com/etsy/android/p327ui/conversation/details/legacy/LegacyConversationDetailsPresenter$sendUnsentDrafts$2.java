package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.p327ui.conversation.details.C9565r;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$sendUnsentDrafts$2 */
public final class LegacyConversationDetailsPresenter$sendUnsentDrafts$2 extends Lambda implements C19857l<C9565r, C19394m> {
    public final /* synthetic */ LegacyDraftMessage $draft;
    public final /* synthetic */ Ref$IntRef $draftsToSend;
    public final /* synthetic */ ArrayList<LegacyDraftMessage> $unsentList;
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$sendUnsentDrafts$2(ArrayList<LegacyDraftMessage> arrayList, LegacyDraftMessage legacyDraftMessage, LegacyConversationDetailsPresenter legacyConversationDetailsPresenter, Ref$IntRef ref$IntRef) {
        super(1);
        this.$unsentList = arrayList;
        this.$draft = legacyDraftMessage;
        this.this$0 = legacyConversationDetailsPresenter;
        this.$draftsToSend = ref$IntRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9565r) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9565r rVar) {
        if (rVar instanceof C9565r.C9567b) {
            this.$unsentList.remove(this.$draft);
            this.this$0.f21120b.hideLoadingDialog();
            Ref$IntRef ref$IntRef = this.$draftsToSend;
            int i = ref$IntRef.element - 1;
            ref$IntRef.element = i;
            if (i == 0) {
                this.this$0.f21135q.setSending(false);
            }
        } else if (rVar instanceof C9565r.C9566a) {
            Ref$IntRef ref$IntRef2 = this.$draftsToSend;
            int i2 = ref$IntRef2.element - 1;
            ref$IntRef2.element = i2;
            if (i2 == 0) {
                this.this$0.f21135q.setSending(false);
            }
        }
    }
}
