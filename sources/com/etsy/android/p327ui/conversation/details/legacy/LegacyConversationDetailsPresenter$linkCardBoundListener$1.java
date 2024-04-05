package com.etsy.android.p327ui.conversation.details.legacy;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.conversation.details.C9563p;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20016y;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p354gc.C12775i;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$linkCardBoundListener$1 */
public final class LegacyConversationDetailsPresenter$linkCardBoundListener$1 implements C9563p {

    /* renamed from: a */
    public final /* synthetic */ LegacyConversationDetailsPresenter f21144a;

    public LegacyConversationDetailsPresenter$linkCardBoundListener$1(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        this.f21144a = legacyConversationDetailsPresenter;
    }

    /* renamed from: a */
    public final void mo32113a(int i, C12775i iVar) {
        if ((iVar != null ? iVar.f28228a : null) != null) {
            if (iVar.f28229b.length() == 0) {
                LegacyConversationRepository legacyConversationRepository = this.f21144a.f21119a;
                String l = iVar.f28228a.toString();
                legacyConversationRepository.getClass();
                C19383o.m32797g(l, "listingId");
                C9548h hVar = legacyConversationRepository.f21146a;
                C20016y.C20017a aVar = C20016y.f44360a;
                C20002r.f44260f.getClass();
                C20002r b = C20002r.C20003a.m34244b("text/plain");
                aVar.getClass();
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21144a.f21121c, C0072d.m199f(this.f21144a.f21121c, hVar.mo32146a(C20016y.C20017a.m34281b(l, b)))), new C9535x118a2ea1(this.f21144a), new C9536x118a2ea2(iVar, this.f21144a, i));
                C7091a aVar2 = this.f21144a.f21132n;
                C19383o.m32798h(aVar2, "compositeDisposable");
                aVar2.mo19403b(e);
            }
        }
    }
}
