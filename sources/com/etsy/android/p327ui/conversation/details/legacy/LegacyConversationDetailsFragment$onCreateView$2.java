package com.etsy.android.p327ui.conversation.details.legacy;

import android.view.View;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyDraftMessage;
import java.io.File;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p354gc.C12766d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsFragment$onCreateView$2 */
public final class LegacyConversationDetailsFragment$onCreateView$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ LegacyConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsFragment$onCreateView$2(LegacyConversationDetailsFragment legacyConversationDetailsFragment) {
        super(1);
        this.this$0 = legacyConversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        LegacyConversationDetailsPresenter presenter = this.this$0.getPresenter();
        C12766d dVar = presenter.f21137s;
        if (dVar != null && !presenter.f21135q.isSending()) {
            LegacyDraftMessage legacyDraftMessage = presenter.f21136r;
            LegacyDraftMessage.Status status = legacyDraftMessage.f21158g;
            LegacyDraftMessage.Status status2 = LegacyDraftMessage.Status.IN_DRAFT;
            if (status == status2) {
                legacyDraftMessage.f21152a = presenter.f21130l.getIdAsLongDeprecated();
                LegacyDraftMessage legacyDraftMessage2 = presenter.f21136r;
                legacyDraftMessage2.f21154c = dVar.f28216a.f28208b.f28261c;
                legacyDraftMessage2.f21160i = presenter.mo32106c();
            }
            boolean z = !presenter.mo32106c().isEmpty();
            if (z) {
                presenter.f21120b.showLoadingDialog(R.string.uploading_images);
            }
            LegacyDraftMessage legacyDraftMessage3 = presenter.f21136r;
            LegacyDraftMessage.Status status3 = LegacyDraftMessage.Status.SENDING;
            legacyDraftMessage3.getClass();
            C19383o.m32797g(status3, "<set-?>");
            legacyDraftMessage3.f21158g = status3;
            presenter.f21135q.setSending(true);
            if (presenter.f21128j.mo29933a()) {
                presenter.mo32108e(presenter.f21138t);
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(presenter.f21121c, C0472h.m1243e(presenter.f21121c, presenter.f21119a.mo32129a(presenter.f21136r))), new LegacyConversationDetailsPresenter$sendMessage$2(presenter), new LegacyConversationDetailsPresenter$sendMessage$3(presenter, z));
                C7091a aVar = presenter.f21132n;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
            } else {
                LegacyDraftMessage legacyDraftMessage4 = presenter.f21136r;
                long j = legacyDraftMessage4.f21152a;
                String str = legacyDraftMessage4.f21153b;
                String str2 = legacyDraftMessage4.f21154c;
                boolean z2 = legacyDraftMessage4.f21155d;
                int i = legacyDraftMessage4.f21156e;
                int i2 = legacyDraftMessage4.f21157f;
                LegacyDraftMessage.Status status4 = legacyDraftMessage4.f21158g;
                long j2 = legacyDraftMessage4.f21159h;
                List<? extends File> list = legacyDraftMessage4.f21160i;
                C19383o.m32797g(str, "message");
                C19383o.m32797g(status4, ResponseConstants.STATUS);
                C19383o.m32797g(list, "imageAttachments");
                presenter.f21138t.add(new LegacyDraftMessage(j, str, str2, z2, i, i2, status4, j2, list));
                presenter.f21135q.setSending(false);
                LegacyDraftMessage legacyDraftMessage5 = presenter.f21136r;
                legacyDraftMessage5.getClass();
                LegacyDraftMessage.Status status5 = status2;
                C19383o.m32797g(status5, "<set-?>");
                legacyDraftMessage5.f21158g = status5;
                presenter.mo32104a();
                presenter.f21120b.addDraftToAdapter(presenter.f21136r.mo32136a());
                presenter.f21120b.clearMessageInput();
            }
            presenter.mo32104a();
        }
    }
}
