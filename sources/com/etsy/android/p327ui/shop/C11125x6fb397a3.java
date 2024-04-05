package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.shop.ShopSectionListingsFragment$ShopSectionListingsAdapter$onCreateHeaderViewHolder$1 */
public /* synthetic */ class C11125x6fb397a3 extends FunctionReferenceImpl implements C19857l<ShopHomeSortOption, C19394m> {
    public C11125x6fb397a3(Object obj) {
        super(1, obj, ShopSectionListingsFragment.class, "onSortOptionSelected", "onSortOptionSelected(Lcom/etsy/android/lib/models/datatypes/ShopHomeSortOption;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ShopHomeSortOption) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ShopHomeSortOption shopHomeSortOption) {
        C19383o.m32797g(shopHomeSortOption, "p0");
        ((ShopSectionListingsFragment) this.receiver).onSortOptionSelected(shopHomeSortOption);
    }
}
