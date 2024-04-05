package com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers;

import androidx.compose.animation.C0472h;
import com.etsy.android.lib.models.apiv3.TranslatedFaq;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p342ed.C12683b;
import p361hc.C12810b;
import p425q9.C13250b;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.ui.panels.faqs.handlers.FetchFaqMachineTranslationHandler */
public final class FetchFaqMachineTranslationHandler {

    /* renamed from: a */
    public final C12683b f23000a;

    /* renamed from: b */
    public final C13461f f23001b;

    /* renamed from: c */
    public final C13573c f23002c;

    /* renamed from: d */
    public final C10101d f23003d;

    public FetchFaqMachineTranslationHandler(C12683b bVar, C13461f fVar, C13573c cVar, C10101d dVar) {
        C19383o.m32797g(bVar, "machineTranslationRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar, "listingDisposable");
        this.f23000a = bVar;
        this.f23001b = fVar;
        this.f23002c = cVar;
        this.f23003d = dVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34043a(ListingViewState.C10092d dVar) {
        this.f23002c.mo38043a(new C13597g.C13662j0(true));
        Long l = dVar.mo33484l();
        String str = dVar.f22242j.f22900h;
        if (l == null || str == null) {
            mo34044b();
        } else {
            C12683b bVar = this.f23000a;
            long longValue = l.longValue();
            bVar.getClass();
            C8071s<C20145v<List<TranslatedFaq>>> b = bVar.f27962a.mo45456b(longValue, str);
            C12810b bVar2 = new C12810b(1);
            b.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0472h.m1243e(this.f23001b, new C19211l(new C19208j(b, bVar2), new C13250b(4))), new FetchFaqMachineTranslationHandler$handle$1(this), new FetchFaqMachineTranslationHandler$handle$2(this, str));
            C7091a aVar = this.f23003d.f22277a;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        }
        return C13574d.C13575a.f29662a;
    }

    /* renamed from: b */
    public final void mo34044b() {
        this.f23002c.mo38043a(new C13597g.C13662j0(false));
        this.f23002c.mo38043a(C13597g.C13771z.f30302a);
    }
}
