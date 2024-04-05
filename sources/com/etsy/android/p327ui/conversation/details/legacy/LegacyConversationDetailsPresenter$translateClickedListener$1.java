package com.etsy.android.p327ui.conversation.details.legacy;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.conversation.details.C9568s;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p354gc.C12783l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$translateClickedListener$1 */
public final class LegacyConversationDetailsPresenter$translateClickedListener$1 implements C9568s {

    /* renamed from: a */
    public final /* synthetic */ LegacyConversationDetailsPresenter f21145a;

    public LegacyConversationDetailsPresenter$translateClickedListener$1(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        this.f21145a = legacyConversationDetailsPresenter;
    }

    /* renamed from: a */
    public final void mo31996a(int i, C12783l lVar) {
        C19383o.m32797g(lVar, "messageObject");
        EtsyId etsyId = new EtsyId(lVar.f28245b);
        int i2 = lVar.f28250g;
        LegacyConversationRepository legacyConversationRepository = this.f21145a.f21119a;
        legacyConversationRepository.getClass();
        String language = C19383o.m32792b(Locale.getDefault().getLanguage(), "en") ? "en-US" : Locale.getDefault().getLanguage();
        C9548h hVar = legacyConversationRepository.f21146a;
        C19383o.m32796f(language, "languageCode");
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21145a.f21121c, C0072d.m199f(this.f21145a.f21121c, hVar.mo32147b(etsyId, i2, language))), new C9539x3e0488dd(lVar, this.f21145a, i), new C9540x3e0488de(lVar, this.f21145a, i));
        C7091a aVar = this.f21145a.f21132n;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }
}
