package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.util.C11777e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.subjects.PublishSubject;
import p400mf.C13073a;
import p400mf.C13074b;
import p400mf.C13079d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.FavoriteAndCollectionRepository$favoriteListing$1 */
public final class FavoriteAndCollectionRepository$favoriteListing$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C13073a $listener;
    public final /* synthetic */ C11777e $spec;
    public final /* synthetic */ FavoriteAndCollectionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteAndCollectionRepository$favoriteListing$1(FavoriteAndCollectionRepository favoriteAndCollectionRepository, C11777e eVar, C13073a aVar) {
        super(1);
        this.this$0 = favoriteAndCollectionRepository;
        this.$spec = eVar;
        this.$listener = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        FavoriteAndCollectionRepository favoriteAndCollectionRepository = this.this$0;
        long idAsLongDeprecated = this.$spec.f26241a.getListingId().getIdAsLongDeprecated();
        C11777e eVar = this.$spec;
        boolean z = eVar.f26242b;
        ListingLike listingLike = eVar.f26241a;
        favoriteAndCollectionRepository.getClass();
        PublishSubject<C13074b> publishSubject = C13079d.f28754a;
        C19383o.m32797g(listingLike, ResponseConstants.LISTING);
        C13079d.f28754a.onNext(new C13074b.C13076b(idAsLongDeprecated, z, listingLike));
        FavoriteAndCollectionRepository favoriteAndCollectionRepository2 = this.this$0;
        boolean z2 = this.$spec.f26242b;
        C13073a aVar = this.$listener;
        favoriteAndCollectionRepository2.getClass();
        if (aVar == null) {
            return;
        }
        if (z2) {
            aVar.mo31346a();
        } else {
            aVar.mo31347b();
        }
    }
}
