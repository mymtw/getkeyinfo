package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations;

import androidx.compose.animation.C0472h;
import com.etsy.android.lib.models.apiv3.NewTranslatedReview;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p321cc.C8568b;
import p342ed.C12683b;
import p402n9.C13093m;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.translations.TranslateReviewClickedHandler */
public final class TranslateReviewClickedHandler {

    /* renamed from: a */
    public final C12683b f23111a;

    /* renamed from: b */
    public final C13461f f23112b;

    /* renamed from: c */
    public final C13573c f23113c;

    /* renamed from: d */
    public final C10101d f23114d;

    public TranslateReviewClickedHandler(C12683b bVar, C13461f fVar, C13573c cVar, C10101d dVar) {
        C19383o.m32797g(bVar, "machineTranslationRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar, "listingDisposable");
        this.f23111a = bVar;
        this.f23112b = fVar;
        this.f23113c = cVar;
        this.f23114d = dVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34126a(ListingViewState.C10092d dVar, C13597g.C13611b5 b5Var) {
        C19383o.m32797g(b5Var, "event");
        Long l = dVar.mo33484l();
        Long transactionId = b5Var.f30084a.getTransactionId();
        String str = dVar.f22242j.f22900h;
        MachineTranslationViewState translationState = b5Var.f30084a.getTranslationState();
        if (transactionId == null) {
            return C13574d.C13575a.f29662a;
        }
        if (b5Var.f30084a.getTranslatedReview() != null) {
            this.f23113c.mo38043a(new C13597g.C13722r4(transactionId.longValue(), b5Var.f30084a.getTranslatedReview(), b5Var.f30084a.getTranslationState()));
        } else if (l == null || str == null) {
            mo34127b(transactionId.longValue(), translationState);
        } else {
            C12683b bVar = this.f23111a;
            long longValue = l.longValue();
            long longValue2 = transactionId.longValue();
            bVar.getClass();
            C8071s<C20145v<NewTranslatedReview>> a = bVar.f27962a.mo45455a(longValue, longValue2, str);
            C8568b bVar2 = new C8568b(4);
            a.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0472h.m1243e(this.f23112b, new C19211l(new C19208j(a, bVar2), new C13093m(1))), new TranslateReviewClickedHandler$handle$1(this, transactionId, translationState), new TranslateReviewClickedHandler$handle$2(this, transactionId, translationState));
            C7091a aVar = this.f23114d.f22277a;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        }
        return C13574d.C13575a.f29662a;
    }

    /* renamed from: b */
    public final void mo34127b(long j, MachineTranslationViewState machineTranslationViewState) {
        this.f23113c.mo38043a(new C13597g.C13606b0(j, machineTranslationViewState));
    }
}
