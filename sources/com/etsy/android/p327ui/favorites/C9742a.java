package com.etsy.android.p327ui.favorites;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.favorites.add.FavoriteAndCollectionRepository;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey;
import com.etsy.android.p327ui.util.C11777e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p119g9.C6896a;
import p356ge.C12788a;
import p400mf.C13073a;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.favorites.a */
public final class C9742a implements C6896a {

    /* renamed from: a */
    public final FavoriteAndCollectionRepository f21537a;

    /* renamed from: b */
    public final C13265p f21538b;

    public C9742a(FavoriteAndCollectionRepository favoriteAndCollectionRepository, C13265p pVar) {
        C19383o.m32797g(favoriteAndCollectionRepository, "repo");
        C19383o.m32797g(pVar, "session");
        this.f21537a = favoriteAndCollectionRepository;
        this.f21538b = pVar;
    }

    /* renamed from: a */
    public final void mo19010a(ListingLike listingLike, FragmentActivity fragmentActivity, C13073a aVar) {
        C19383o.m32797g(listingLike, "listingLike");
        C19383o.m32797g(fragmentActivity, "activity");
        C11777e eVar = new C11777e(listingLike, listingLike.isFavorite(), this.f21538b.mo45960e());
        boolean z = listingLike.isFavorite() && !listingLike.hasCollections();
        this.f21537a.mo32721b(eVar, aVar);
        if (!z) {
            C12788a.m20424c(fragmentActivity, new AddToListBottomSheetKey(C19421p.m32935c0(fragmentActivity), listingLike, true));
        }
    }

    /* renamed from: b */
    public final void mo19011b(ListingLike listingLike, FragmentActivity fragmentActivity) {
        C19383o.m32797g(listingLike, "listingLike");
        C19383o.m32797g(fragmentActivity, "activity");
        C12788a.m20424c(fragmentActivity, new AddToListBottomSheetKey(C19421p.m32935c0(fragmentActivity), listingLike, false, 4, (DefaultConstructorMarker) null));
    }
}
