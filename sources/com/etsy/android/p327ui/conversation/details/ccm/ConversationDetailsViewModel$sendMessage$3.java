package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.p327ui.conversation.details.models.DraftMessage;
import com.etsy.android.p327ui.conversation.details.models.Message;
import com.etsy.android.util.C12060q;
import java.io.File;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel$sendMessage$3 */
final class ConversationDetailsViewModel$sendMessage$3 extends Lambda implements C19857l<Message, C19394m> {
    public final /* synthetic */ List<File> $attachedImages;
    public final /* synthetic */ ConversationDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModel$sendMessage$3(ConversationDetailsViewModel conversationDetailsViewModel, List<? extends File> list) {
        super(1);
        this.this$0 = conversationDetailsViewModel;
        this.$attachedImages = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Message) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Message message) {
        ConversationDetailsViewModel conversationDetailsViewModel = this.this$0;
        boolean z = !this.$attachedImages.isEmpty();
        DraftMessage draftMessage = conversationDetailsViewModel.f21016I;
        DraftMessage.Status status = DraftMessage.Status.IN_DRAFT;
        draftMessage.getClass();
        C19383o.m32797g(status, "<set-?>");
        draftMessage.f21179e = status;
        C12060q.m19871b(conversationDetailsViewModel.f21034q, "");
        conversationDetailsViewModel.f21038u.setValue(null);
        conversationDetailsViewModel.mo32011g();
        int length = conversationDetailsViewModel.f21015H.length;
        for (int i = 0; i < length; i++) {
            C9559o[] oVarArr = conversationDetailsViewModel.f21015H;
            C9559o oVar = oVarArr[i];
            oVarArr[i] = C9559o.C9562c.f21220a;
            if (oVar instanceof C9559o.C9560a) {
                ((C9559o.C9560a) oVar).f21218b.delete();
            }
        }
        conversationDetailsViewModel.f21030m.setValue(conversationDetailsViewModel.f21015H);
        conversationDetailsViewModel.mo32010f();
        conversationDetailsViewModel.mo32011g();
        conversationDetailsViewModel.f21016I.f21181g = conversationDetailsViewModel.mo32008d();
        if (z || conversationDetailsViewModel.f21017J == null) {
            conversationDetailsViewModel.mo32009e();
        }
        if (conversationDetailsViewModel.f21025h.mo45425a() && conversationDetailsViewModel.f21017J == null) {
            C12060q.m19871b(conversationDetailsViewModel.f21036s, C19394m.f43287a);
            conversationDetailsViewModel.f21025h.mo45426b();
        }
    }
}
