package com.etsy.android.p327ui.search.filters.refactor.price;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10803g;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import com.etsy.android.stylekit.views.CollageTextInput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.PriceSearchFilterViewHolder */
public final class PriceSearchFilterViewHolder extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f24022b;

    /* renamed from: c */
    public final CollageContentToggle f24023c;

    /* renamed from: d */
    public final CollageRadioGroup f24024d;

    /* renamed from: e */
    public final ArrayList f24025e;

    /* renamed from: f */
    public final LinkedHashMap f24026f = new LinkedHashMap();

    /* renamed from: g */
    public final CollageTextInput f24027g;

    /* renamed from: h */
    public final CollageTextInput f24028h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceSearchFilterViewHolder(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_price, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onChange");
        this.f24022b = lVar;
        View findViewById = this.itemView.findViewById(R.id.content_toggle_price);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.content_toggle_price)");
        this.f24023c = (CollageContentToggle) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.price_groups);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.price_groups)");
        CollageRadioGroup collageRadioGroup = (CollageRadioGroup) findViewById2;
        this.f24024d = collageRadioGroup;
        View findViewById3 = this.itemView.findViewById(R.id.radio_price_0);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.radio_price_0)");
        View findViewById4 = this.itemView.findViewById(R.id.radio_price_1);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.radio_price_1)");
        View findViewById5 = this.itemView.findViewById(R.id.radio_price_2);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.radio_price_2)");
        View findViewById6 = this.itemView.findViewById(R.id.radio_price_3);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.radio_price_3)");
        View findViewById7 = this.itemView.findViewById(R.id.radio_price_4);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.id.radio_price_4)");
        View findViewById8 = this.itemView.findViewById(R.id.radio_price_5);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.id.radio_price_5)");
        this.f24025e = C17782b.m29866f0((CollageRadioButton) findViewById3, (CollageRadioButton) findViewById4, (CollageRadioButton) findViewById5, (CollageRadioButton) findViewById6, (CollageRadioButton) findViewById7, (CollageRadioButton) findViewById8);
        View findViewById9 = this.itemView.findViewById(R.id.min_price);
        C19383o.m32796f(findViewById9, "itemView.findViewById(R.id.min_price)");
        this.f24027g = (CollageTextInput) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.max_price);
        C19383o.m32796f(findViewById10, "itemView.findViewById(R.id.max_price)");
        this.f24028h = (CollageTextInput) findViewById10;
        collageRadioGroup.setOnCheckedChangeListener(new C10845c(this));
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.C10783d) {
            this.f24023c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f24023c.setDescription(searchFiltersUiGroupItem.mo35794c());
            this.f24026f.clear();
            SearchFiltersUiGroupItem.C10783d dVar = (SearchFiltersUiGroupItem.C10783d) searchFiltersUiGroupItem;
            int size = dVar.f23861e.size();
            int i = 0;
            if (size == 0) {
                ViewExtensions.m12860d(this.f24024d);
            } else {
                ViewExtensions.m12869m(this.f24024d);
                if (this.f24025e.size() > size) {
                    int size2 = this.f24025e.size();
                    while (size < size2) {
                        ViewExtensions.m12860d((View) this.f24025e.get(size));
                        size++;
                    }
                } else if (this.f24025e.size() < size) {
                    int size3 = size - this.f24025e.size();
                    for (int i2 = 0; i2 < size3; i2++) {
                        Context context = this.f24023c.getContext();
                        C19383o.m32796f(context, "contentToggle.context");
                        CollageRadioButton collageRadioButton = new CollageRadioButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        collageRadioButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        collageRadioButton.setDirection(1);
                        this.f24025e.add(collageRadioButton);
                        this.f24024d.addView(collageRadioButton);
                    }
                }
            }
            Iterator<T> it = dVar.f23861e.iterator();
            while (true) {
                String str = null;
                if (it.hasNext()) {
                    T next = it.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        C10803g gVar = (C10803g) next;
                        CollageRadioButton collageRadioButton2 = (CollageRadioButton) this.f24025e.get(i);
                        ViewExtensions.m12869m(collageRadioButton2);
                        collageRadioButton2.setText(gVar.f23937b);
                        collageRadioButton2.setChecked(gVar.f23938c);
                        this.f24026f.put(collageRadioButton2, gVar);
                        i = i3;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                } else {
                    this.f24023c.setExpanded(searchFiltersUiGroupItem.mo35792a());
                    CollageTextInput collageTextInput = this.f24027g;
                    collageTextInput.setLabelText(dVar.f23862f);
                    collageTextInput.setTextChangeListener((TextWatcher) null);
                    String text = collageTextInput.getText();
                    BigDecimal bigDecimal = dVar.f23864h.f23786a;
                    if (!C19383o.m32792b(text, bigDecimal != null ? bigDecimal.toString() : null)) {
                        BigDecimal bigDecimal2 = dVar.f23864h.f23786a;
                        collageTextInput.setText(bigDecimal2 != null ? bigDecimal2.toString() : null);
                    }
                    TextinputKt.m18959a(collageTextInput, new PriceSearchFilterViewHolder$bind$2$1(this));
                    collageTextInput.setOnFocusChangeListener(new C10843a(this, searchFiltersUiGroupItem));
                    if (!dVar.f23865i) {
                        collageTextInput.clearFocus();
                        ViewExtensions.m12861e(collageTextInput);
                    }
                    CollageTextInput collageTextInput2 = this.f24028h;
                    collageTextInput2.setLabelText(dVar.f23863g);
                    collageTextInput2.setTextChangeListener((TextWatcher) null);
                    String text2 = collageTextInput2.getText();
                    BigDecimal bigDecimal3 = dVar.f23864h.f23787b;
                    if (!C19383o.m32792b(text2, bigDecimal3 != null ? bigDecimal3.toString() : null)) {
                        BigDecimal bigDecimal4 = dVar.f23864h.f23787b;
                        if (bigDecimal4 != null) {
                            str = bigDecimal4.toString();
                        }
                        collageTextInput2.setText(str);
                    }
                    TextinputKt.m18959a(collageTextInput2, new PriceSearchFilterViewHolder$bind$3$1(this));
                    collageTextInput2.setOnFocusChangeListener(new C10844b(this, searchFiltersUiGroupItem));
                    if (!dVar.f23865i) {
                        collageTextInput2.clearFocus();
                        ViewExtensions.m12861e(collageTextInput2);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
