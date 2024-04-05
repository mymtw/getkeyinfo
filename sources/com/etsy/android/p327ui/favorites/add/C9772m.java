package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.favorites.add.C9749a0;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.subjects.PublishSubject;
import p287xp.C8339g;
import p400mf.C13074b;
import p400mf.C13079d;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.favorites.add.m */
public final /* synthetic */ class C9772m implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ FavoriteAndCollectionRepository f21612b;

    /* renamed from: c */
    public final /* synthetic */ C9783r f21613c;

    public /* synthetic */ C9772m(FavoriteAndCollectionRepository favoriteAndCollectionRepository, C9783r rVar) {
        this.f21612b = favoriteAndCollectionRepository;
        this.f21613c = rVar;
    }

    public final Object apply(Object obj) {
        FavoriteAndCollectionRepository favoriteAndCollectionRepository = this.f21612b;
        C9783r rVar = this.f21613c;
        C9749a0 a0Var = (C9749a0) obj;
        C19383o.m32797g(favoriteAndCollectionRepository, "this$0");
        C19383o.m32797g(rVar, "$spec");
        C19383o.m32797g(a0Var, "it");
        if (a0Var instanceof C9749a0.C9751b) {
            List<ListingLike> list = rVar.f21627c;
            String key = ((C9749a0.C9751b) a0Var).f21579a.getKey();
            if (key == null) {
                key = "";
            }
            List d0 = C17782b.m29864d0(key);
            PublishSubject<C13074b> publishSubject = C13079d.f28754a;
            C19383o.m32797g(list, "listings");
            for (ListingLike listingLike : list) {
                PublishSubject<C13074b> publishSubject2 = C13079d.f28754a;
                C13079d.f28754a.onNext(new C13074b.C13075a(listingLike.getListingId().getIdAsLongDeprecated(), true, d0, listingLike));
            }
        }
        return a0Var;
    }
}
