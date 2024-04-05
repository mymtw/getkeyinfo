package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.p327ui.util.C11777e;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p400mf.C13073a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.add.FavoriteAndCollectionRepository$favoriteListing$2 */
public final class FavoriteAndCollectionRepository$favoriteListing$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C13073a $listener;
    public final /* synthetic */ C11777e $spec;
    public final /* synthetic */ FavoriteAndCollectionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteAndCollectionRepository$favoriteListing$2(FavoriteAndCollectionRepository favoriteAndCollectionRepository, C11777e eVar, C13073a aVar) {
        super(0);
        this.this$0 = favoriteAndCollectionRepository;
        this.$spec = eVar;
        this.$listener = aVar;
    }

    public final void invoke() {
        FavoriteAndCollectionRepository favoriteAndCollectionRepository = this.this$0;
        boolean z = !this.$spec.f26242b;
        C13073a aVar = this.$listener;
        favoriteAndCollectionRepository.getClass();
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.mo31346a();
        } else {
            aVar.mo31347b();
        }
    }
}
