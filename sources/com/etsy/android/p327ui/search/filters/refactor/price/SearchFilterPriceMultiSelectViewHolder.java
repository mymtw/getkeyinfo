package com.etsy.android.p327ui.search.filters.refactor.price;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10803g;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageTextInput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.SearchFilterPriceMultiSelectViewHolder */
public final class SearchFilterPriceMultiSelectViewHolder extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f24029b;

    /* renamed from: c */
    public final CollageContentToggle f24030c;

    /* renamed from: d */
    public final ArrayList f24031d;

    /* renamed from: e */
    public final CollageTextInput f24032e;

    /* renamed from: f */
    public final CollageTextInput f24033f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterPriceMultiSelectViewHolder(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_price_multiselect, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onChange");
        this.f24029b = lVar;
        View findViewById = this.itemView.findViewById(R.id.content_toggle_price_multiselect);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…toggle_price_multiselect)");
        this.f24030c = (CollageContentToggle) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.checkbox_price_multiselect_0);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…kbox_price_multiselect_0)");
        View findViewById3 = this.itemView.findViewById(R.id.checkbox_price_multiselect_1);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…kbox_price_multiselect_1)");
        View findViewById4 = this.itemView.findViewById(R.id.checkbox_price_multiselect_2);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…kbox_price_multiselect_2)");
        View findViewById5 = this.itemView.findViewById(R.id.checkbox_price_multiselect_3);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…kbox_price_multiselect_3)");
        View findViewById6 = this.itemView.findViewById(R.id.checkbox_price_multiselect_4);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.…kbox_price_multiselect_4)");
        View findViewById7 = this.itemView.findViewById(R.id.checkbox_price_multiselect_5);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.…kbox_price_multiselect_5)");
        this.f24031d = C17782b.m29866f0((CollageCheckbox) findViewById2, (CollageCheckbox) findViewById3, (CollageCheckbox) findViewById4, (CollageCheckbox) findViewById5, (CollageCheckbox) findViewById6, (CollageCheckbox) findViewById7);
        new LinkedHashMap();
        View findViewById8 = this.itemView.findViewById(R.id.min_price);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.id.min_price)");
        this.f24032e = (CollageTextInput) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.max_price);
        C19383o.m32796f(findViewById9, "itemView.findViewById(R.id.max_price)");
        this.f24033f = (CollageTextInput) findViewById9;
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.C10782c) {
            this.f24030c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f24030c.setDescription(searchFiltersUiGroupItem.mo35794c());
            SearchFiltersUiGroupItem.C10782c cVar = (SearchFiltersUiGroupItem.C10782c) searchFiltersUiGroupItem;
            List<C10803g> list = cVar.f23852e;
            int max = Math.max(this.f24031d.size(), list.size());
            for (int i = 0; i < max; i++) {
                if (C19327t.m32641W0(i, list) == null) {
                    ViewExtensions.m12860d((CollageCheckbox) this.f24031d.get(i));
                } else {
                    if (C19327t.m32641W0(i, this.f24031d) == null) {
                        Context context = this.itemView.getContext();
                        C19383o.m32796f(context, "itemView.context");
                        CollageCheckbox collageCheckbox = new CollageCheckbox(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        this.f24031d.add(collageCheckbox);
                        this.f24030c.addView(collageCheckbox);
                    }
                    CollageCheckbox collageCheckbox2 = (CollageCheckbox) this.f24031d.get(i);
                    C10803g gVar = list.get(i);
                    ViewExtensions.m12869m(collageCheckbox2);
                    C19383o.m32797g(collageCheckbox2, "<this>");
                    C19383o.m32797g(gVar, "priceSelectItem");
                    collageCheckbox2.setClickable(gVar.f23942g);
                    collageCheckbox2.setEnabled(gVar.f23942g);
                    collageCheckbox2.setText(gVar.f23937b);
                    collageCheckbox2.setChecked(gVar.f23938c);
                    collageCheckbox2.setOnCheckedChangeListener(new C10848f(this, gVar));
                }
            }
            CollageTextInput collageTextInput = this.f24032e;
            collageTextInput.setLabelText(cVar.f23853f);
            String str = null;
            collageTextInput.setTextChangeListener((TextWatcher) null);
            String text = collageTextInput.getText();
            BigDecimal bigDecimal = cVar.f23855h.f23786a;
            if (!C19383o.m32792b(text, bigDecimal != null ? bigDecimal.toString() : null)) {
                BigDecimal bigDecimal2 = cVar.f23855h.f23786a;
                collageTextInput.setText(bigDecimal2 != null ? bigDecimal2.toString() : null);
            }
            TextinputKt.m18959a(collageTextInput, new SearchFilterPriceMultiSelectViewHolder$bind$2$1(this));
            collageTextInput.setOnFocusChangeListener(new C10846d(this, searchFiltersUiGroupItem));
            if (!cVar.f23856i) {
                collageTextInput.clearFocus();
                ViewExtensions.m12861e(collageTextInput);
            }
            CollageTextInput collageTextInput2 = this.f24033f;
            collageTextInput2.setLabelText(cVar.f23854g);
            collageTextInput2.setTextChangeListener((TextWatcher) null);
            String text2 = collageTextInput2.getText();
            BigDecimal bigDecimal3 = cVar.f23855h.f23787b;
            if (!C19383o.m32792b(text2, bigDecimal3 != null ? bigDecimal3.toString() : null)) {
                BigDecimal bigDecimal4 = cVar.f23855h.f23787b;
                if (bigDecimal4 != null) {
                    str = bigDecimal4.toString();
                }
                collageTextInput2.setText(str);
            }
            TextinputKt.m18959a(collageTextInput2, new SearchFilterPriceMultiSelectViewHolder$bind$3$1(this));
            collageTextInput2.setOnFocusChangeListener(new C10847e(this, searchFiltersUiGroupItem));
            if (!cVar.f23856i) {
                collageTextInput2.clearFocus();
                ViewExtensions.m12861e(collageTextInput2);
            }
        }
    }
}
