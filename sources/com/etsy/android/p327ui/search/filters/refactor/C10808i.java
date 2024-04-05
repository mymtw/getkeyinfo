package com.etsy.android.p327ui.search.filters.refactor;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.category.SearchFiltersCategoryViewHolder;
import com.etsy.android.p327ui.search.filters.refactor.location.SearchFiltersShopLocationViewHolder;
import com.etsy.android.p327ui.search.filters.refactor.price.PriceSearchFilterViewHolder;
import com.etsy.android.p327ui.search.filters.refactor.price.SearchFilterPriceMultiSelectViewHolder;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p399me.C13057g;
import p399me.C13060j;
import p399me.C13061k;
import p399me.C13063m;
import p399me.C13065o;
import p399me.C13067q;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.i */
public final class C10808i extends C3200w<SearchFiltersUiGroupItem, C10862y> {

    /* renamed from: c */
    public final C19857l<C10813l, C19394m> f23946c;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.i$a */
    public static final class C10809a extends C3167n.C3172e<SearchFiltersUiGroupItem> {

        /* renamed from: a */
        public static final C10809a f23947a = new C10809a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((SearchFiltersUiGroupItem) obj, (SearchFiltersUiGroupItem) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(((SearchFiltersUiGroupItem) obj).mo35793b(), ((SearchFiltersUiGroupItem) obj2).mo35793b());
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.i$b */
    public /* synthetic */ class C10810b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23948a;

        static {
            int[] iArr = new int[SearchFiltersViewType.values().length];
            iArr[SearchFiltersViewType.NONE.ordinal()] = 1;
            iArr[SearchFiltersViewType.BOTTOM_DIVIDER.ordinal()] = 2;
            iArr[SearchFiltersViewType.SHOP_LOCATION.ordinal()] = 3;
            iArr[SearchFiltersViewType.SORT_BY.ordinal()] = 4;
            iArr[SearchFiltersViewType.CATEGORY.ordinal()] = 5;
            iArr[SearchFiltersViewType.ITEM_TYPE.ordinal()] = 6;
            iArr[SearchFiltersViewType.SHIPS_TO.ordinal()] = 7;
            iArr[SearchFiltersViewType.SHIPPING.ordinal()] = 8;
            iArr[SearchFiltersViewType.MULTI_SELECT.ordinal()] = 9;
            iArr[SearchFiltersViewType.SIZE.ordinal()] = 10;
            iArr[SearchFiltersViewType.COLOR.ordinal()] = 11;
            iArr[SearchFiltersViewType.PRICE.ordinal()] = 12;
            iArr[SearchFiltersViewType.PRICE_MULTI_SELECT.ordinal()] = 13;
            iArr[SearchFiltersViewType.OTHER_OPTIONS.ordinal()] = 14;
            f23948a = iArr;
        }
    }

    public C10808i(C19857l<? super C10813l, C19394m> lVar) {
        super(C10809a.f23947a);
        this.f23946c = lVar;
    }

    public final int getItemViewType(int i) {
        return ((SearchFiltersUiGroupItem) getItem(i)).mo35796e().ordinal();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10862y yVar = (C10862y) b0Var;
        C19383o.m32797g(yVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        yVar.mo35868e((SearchFiltersUiGroupItem) item);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        SearchFiltersViewType[] values = SearchFiltersViewType.values();
        switch (C10810b.f23948a[((i < 0 || i > C19318k.m32614f1(values)) ? SearchFiltersViewType.NONE : values[i]).ordinal()]) {
            case 1:
                return new C10800e(viewGroup);
            case 2:
                return new C10786a(viewGroup);
            case 3:
                return new SearchFiltersShopLocationViewHolder(viewGroup, this.f23946c);
            case 4:
                return new C13067q(viewGroup, this.f23946c);
            case 5:
                return new SearchFiltersCategoryViewHolder(viewGroup, this.f23946c);
            case 6:
                return new C13060j(viewGroup, this.f23946c);
            case 7:
                return new ShipsToSearchFilterViewHolder(viewGroup, this.f23946c);
            case 8:
                return new C10790b0(viewGroup, this.f23946c);
            case 9:
                return new C13061k(viewGroup, this.f23946c);
            case 10:
                return new C13065o(viewGroup, this.f23946c);
            case 11:
                return new C13057g(viewGroup, this.f23946c);
            case 12:
                return new PriceSearchFilterViewHolder(viewGroup, this.f23946c);
            case 13:
                return new SearchFilterPriceMultiSelectViewHolder(viewGroup, this.f23946c);
            case 14:
                return new C13063m(viewGroup, this.f23946c);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
