package com.etsy.android.p327ui.search.filters.refactor.location;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.C10862y;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.location.SearchFiltersShopLocationViewHolder */
public final class SearchFiltersShopLocationViewHolder extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f23980b;

    /* renamed from: c */
    public final CollageContentToggle f23981c;

    /* renamed from: d */
    public final CollageRadioGroup f23982d;

    /* renamed from: e */
    public final CollageRadioButton f23983e;

    /* renamed from: f */
    public final CollageRadioButton f23984f;

    /* renamed from: g */
    public final CollageRadioButton f23985g;

    /* renamed from: h */
    public final CollageTextInput f23986h;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.location.SearchFiltersShopLocationViewHolder$a */
    public static final class C10834a implements CollageRadioGroup.C9044a {

        /* renamed from: a */
        public final /* synthetic */ SearchFiltersShopLocationViewHolder f23987a;

        public C10834a(SearchFiltersShopLocationViewHolder searchFiltersShopLocationViewHolder) {
            this.f23987a = searchFiltersShopLocationViewHolder;
        }

        /* renamed from: a */
        public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
            C19383o.m32797g(collageRadioButton, "selectedButton");
            C19857l<C10813l, C19394m> lVar = this.f23987a.f23980b;
            Object tag = collageRadioButton.getTag();
            C19383o.m32795e(tag, "null cannot be cast to non-null type kotlin.String");
            lVar.invoke(new C10813l.C10827n((String) tag, z));
        }
    }

    static {
        CollageTextInput.C9047a aVar = CollageTextInput.Companion;
        CollageRadioButton.C9043b bVar = CollageRadioButton.Companion;
        int i = CollageRadioGroup.$stable;
        int i2 = CollageContentToggle.$stable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersShopLocationViewHolder(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_shop_location, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onItemChange");
        this.f23980b = lVar;
        View findViewById = this.itemView.findViewById(R.id.content_toggle_shop_location);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ent_toggle_shop_location)");
        this.f23981c = (CollageContentToggle) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.radio_group_item_shop_location);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…group_item_shop_location)");
        this.f23982d = (CollageRadioGroup) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.radio_button_anywhere);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.radio_button_anywhere)");
        this.f23983e = (CollageRadioButton) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.radio_button_country);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.radio_button_country)");
        this.f23984f = (CollageRadioButton) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.radio_button_custom_location);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…o_button_custom_location)");
        this.f23985g = (CollageRadioButton) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.text_input_shop_location);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.…text_input_shop_location)");
        this.f23986h = (CollageTextInput) findViewById6;
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.C10785f) {
            this.f23981c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f23981c.setDescription(searchFiltersUiGroupItem.mo35794c());
            SearchFiltersUiGroupItem.C10785f fVar = (SearchFiltersUiGroupItem.C10785f) searchFiltersUiGroupItem;
            this.f23983e.setText(fVar.f23874d.f23925b);
            this.f23983e.setChecked(fVar.f23874d.f23926c);
            this.f23983e.setTag(fVar.f23874d.f23924a);
            this.f23984f.setText(fVar.f23875e.f23929b);
            this.f23984f.setChecked(fVar.f23875e.f23930c);
            this.f23984f.setTag(fVar.f23875e.f23928a);
            this.f23985g.setText(fVar.f23876f.f23908b);
            this.f23985g.setChecked(fVar.f23876f.f23909c);
            this.f23985g.setTag(fVar.f23876f.f23907a);
            this.f23982d.setOnCheckedChangeListener(new C10834a(this));
            this.f23986h.setOnFocusChangeListener(new C10835a(this));
            this.f23986h.setLabelText(searchFiltersUiGroupItem.mo35795d());
            this.f23986h.setTextChangeListener((TextWatcher) null);
            if (!C19383o.m32792b(this.f23986h.getText(), fVar.f23876f.f23910d)) {
                this.f23986h.setText(fVar.f23876f.f23910d);
            }
            TextinputKt.m18959a(this.f23986h, new SearchFiltersShopLocationViewHolder$bind$3(this));
        }
    }
}
