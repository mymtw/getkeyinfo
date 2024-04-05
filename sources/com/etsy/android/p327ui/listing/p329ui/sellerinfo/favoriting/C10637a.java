package com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.p327ui.util.C11782j;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p425q9.C13265p;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.favoriting.a */
public final class C10637a {

    /* renamed from: a */
    public final C13265p f23360a;

    /* renamed from: b */
    public final C11780h f23361b;

    /* renamed from: c */
    public final C13461f f23362c;

    /* renamed from: d */
    public final C10101d f23363d;

    /* renamed from: e */
    public final C8672b f23364e;

    /* renamed from: f */
    public final C13573c f23365f;

    public C10637a(C13265p pVar, C11780h hVar, C13461f fVar, C10101d dVar, C8672b bVar, C13573c cVar) {
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23360a = pVar;
        this.f23361b = hVar;
        this.f23362c = fVar;
        this.f23363d = dVar;
        this.f23364e = bVar;
        this.f23365f = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34279a(C13597g.C13704p0 p0Var) {
        C19383o.m32797g(p0Var, "event");
        if (!this.f23360a.mo45960e()) {
            this.f23365f.mo38043a(new C13597g.C13645g4(p0Var.f30215a, p0Var.f30216b));
        } else {
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f23362c, C0072d.m199f(this.f23362c, this.f23361b.mo38047a(new C11782j(new EtsyId(p0Var.f30215a), p0Var.f30216b, p0Var.f30217c), this.f23364e))), new FavoriteShopHandler$handle$1(LogCatKt.m17045a()), FavoriteShopHandler$handle$2.INSTANCE);
            C7091a aVar = this.f23363d.f22277a;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        }
        return C13574d.C13575a.f29662a;
    }
}
