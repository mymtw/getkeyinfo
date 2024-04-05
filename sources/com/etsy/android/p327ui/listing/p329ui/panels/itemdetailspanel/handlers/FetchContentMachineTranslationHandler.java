package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import androidx.compose.animation.C0472h;
import com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.search.savedsearch.C8981e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p321cc.C8567a;
import p342ed.C12683b;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.FetchContentMachineTranslationHandler */
public final class FetchContentMachineTranslationHandler {

    /* renamed from: a */
    public final C12683b f23050a;

    /* renamed from: b */
    public final C13461f f23051b;

    /* renamed from: c */
    public final C13573c f23052c;

    /* renamed from: d */
    public final C10101d f23053d;

    public FetchContentMachineTranslationHandler(C12683b bVar, C13461f fVar, C13573c cVar, C10101d dVar) {
        C19383o.m32797g(bVar, "machineTranslationRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar, "listingDisposable");
        this.f23050a = bVar;
        this.f23051b = fVar;
        this.f23052c = cVar;
        this.f23053d = dVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34077a(ListingViewState.C10092d dVar) {
        this.f23052c.mo38043a(new C13597g.C13731t(true));
        String str = dVar.f22238f.f22803f.f22848f.f23021m;
        if (str != null) {
            C12683b bVar = this.f23050a;
            long f = dVar.mo33477f();
            bVar.getClass();
            C8071s<C20145v<ListingMachineTranslationTranslatedFields>> c = bVar.f27962a.mo45457c(f, str);
            C8981e eVar = new C8981e(2);
            c.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0472h.m1243e(this.f23051b, new C19211l(new C19208j(c, eVar), new C8567a(3))), new FetchContentMachineTranslationHandler$handle$1$1(this), new FetchContentMachineTranslationHandler$handle$1$2(this));
            C7091a aVar = this.f23053d.f22277a;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        } else {
            mo34078b();
            C19394m mVar = C19394m.f43287a;
        }
        return C13574d.C13575a.f29662a;
    }

    /* renamed from: b */
    public final void mo34078b() {
        this.f23052c.mo38043a(new C13597g.C13731t(false));
        this.f23052c.mo38043a(C13597g.C13765y.f30296a);
    }
}
