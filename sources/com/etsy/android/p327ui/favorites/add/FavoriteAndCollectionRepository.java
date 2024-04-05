package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CollectionV3;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.push.settings.C8848c;
import com.etsy.android.p327ui.util.C11777e;
import com.etsy.android.p327ui.util.C11780h;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.PublishSubject;
import p248tp.C8048a;
import p248tp.C8066r;
import p248tp.C8071s;
import p400mf.C13073a;
import p400mf.C13074b;
import p400mf.C13079d;
import p425q9.C13260k;
import p456ua.C13461f;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.add.FavoriteAndCollectionRepository */
public final class FavoriteAndCollectionRepository {

    /* renamed from: a */
    public final C11780h f21563a;

    /* renamed from: b */
    public final C9766h f21564b;

    /* renamed from: c */
    public final C9790y f21565c;

    /* renamed from: d */
    public final C13461f f21566d;

    public FavoriteAndCollectionRepository(C11780h hVar, C9766h hVar2, C9790y yVar, C13461f fVar) {
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(hVar2, "collectionRepository");
        C19383o.m32797g(yVar, "multiListingRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f21563a = hVar;
        this.f21564b = hVar2;
        this.f21565c = yVar;
        this.f21566d = fVar;
    }

    /* renamed from: a */
    public final C19208j mo32720a(C9783r rVar) {
        C9790y yVar = this.f21565c;
        yVar.getClass();
        C8071s<C20145v<CollectionV3>> a = yVar.f21646b.mo32775a(new AddToListBody(rVar.f21625a, rVar.f21626b, rVar.f21628d.getPrivacyLevelString()));
        C8848c cVar = new C8848c(yVar, 2);
        a.getClass();
        return new C19208j(new C19211l(new C19208j(a, cVar), new C13260k(6)), new C9772m(this, rVar));
    }

    /* renamed from: b */
    public final void mo32721b(C11777e eVar, C13073a aVar) {
        ListingLike listingLike = eVar.f26241a;
        PublishSubject<C13074b> publishSubject = C13079d.f28754a;
        C19383o.m32797g(listingLike, ResponseConstants.LISTING);
        C13079d.f28754a.onNext(new C13074b.C13076b(eVar.f26241a.getListingId().getIdAsLongDeprecated(), !eVar.f26242b, listingLike));
        C11780h hVar = this.f21563a;
        hVar.getClass();
        C8048a a = eVar.f26242b ? hVar.f26247b.mo38049a(eVar.f26241a.getListingId().getId()) : hVar.f26247b.mo38051c(C19421p.m32931U(new Pair("listing_id", eVar.f26241a.getListingId().getId())));
        this.f21566d.getClass();
        C8066r b = C13461f.m21235b();
        a.getClass();
        CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(a, b);
        this.f21566d.getClass();
        SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new FavoriteAndCollectionRepository$favoriteListing$1(this, eVar, aVar), new FavoriteAndCollectionRepository$favoriteListing$2(this, eVar, aVar));
    }
}
