package com.etsy.android.p327ui.favorites;

import com.etsy.android.lib.models.cardviewelement.Page;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p464va.C13554f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$onLoadSuccess$2 */
public final class FavoritesTabFragment$onLoadSuccess$2 extends Lambda implements C19857l<Page, C19394m> {
    public final /* synthetic */ C13554f.C13556b $result;
    public final /* synthetic */ FavoritesTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesTabFragment$onLoadSuccess$2(FavoritesTabFragment favoritesTabFragment, C13554f.C13556b bVar) {
        super(1);
        this.this$0 = favoritesTabFragment;
        this.$result = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Page) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Page page) {
        this.this$0.onLoadComplete(page);
        this.this$0.setUpPagination(this.$result.f29642c);
    }
}
