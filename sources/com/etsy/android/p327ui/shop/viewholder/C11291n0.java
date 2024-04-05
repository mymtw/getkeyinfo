package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.shop.viewholder.n0 */
public final class C11291n0 extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final List<ShopHomeSortOption> f24920b;

    /* renamed from: c */
    public final C19857l<ShopHomeSortOption, C19394m> f24921c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11291n0(ViewGroup viewGroup, List<? extends ShopHomeSortOption> list, C19857l<? super ShopHomeSortOption, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_shop_sections_listing_sort, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(list, "sortOptions");
        this.f24920b = list;
        this.f24921c = lVar;
    }
}
