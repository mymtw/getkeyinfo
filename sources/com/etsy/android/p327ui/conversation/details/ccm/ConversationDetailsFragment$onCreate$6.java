package com.etsy.android.p327ui.conversation.details.ccm;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p456ua.C13461f;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onCreate$6 */
public final class ConversationDetailsFragment$onCreate$6 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onCreate$6(ConversationDetailsFragment conversationDetailsFragment) {
        super(0);
        this.this$0 = conversationDetailsFragment;
    }

    public final void invoke() {
        ConversationDetailsViewModel access$getViewModel = this.this$0.getViewModel();
        Long l = access$getViewModel.f21018K;
        if (l != null) {
            C19202e a = C9510o.m17879a(access$getViewModel.f21023f, access$getViewModel.f21011D, access$getViewModel.f21012E, CursorDirection.OLDER, l.longValue(), 16);
            access$getViewModel.f21019b.getClass();
            SubscribersKt.m32500e(C0391c.m1056b(access$getViewModel.f21019b, a.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$onScrolledToEndOfMessages$1$1(access$getViewModel), new ConversationDetailsViewModel$onScrolledToEndOfMessages$1$2(access$getViewModel));
        }
    }
}
