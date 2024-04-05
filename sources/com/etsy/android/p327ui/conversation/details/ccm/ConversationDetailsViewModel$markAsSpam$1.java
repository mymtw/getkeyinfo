package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.R;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$markAsSpam$1 */
final class ConversationDetailsViewModel$markAsSpam$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ ConversationDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModel$markAsSpam$1(ConversationDetailsViewModel conversationDetailsViewModel) {
        super(1);
        this.this$0 = conversationDetailsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f21038u.setValue(null);
        C12060q.m19871b(this.this$0.f21042y, Integer.valueOf(R.string.conversation_error_mark_spam));
    }
}
