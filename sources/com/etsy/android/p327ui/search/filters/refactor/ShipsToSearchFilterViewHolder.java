package com.etsy.android.p327ui.search.filters.refactor;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.stylekit.views.CollageContentToggle;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.ShipsToSearchFilterViewHolder */
public final class ShipsToSearchFilterViewHolder extends C10862y {

    /* renamed from: b */
    public final C19857l<C10813l, C19394m> f23881b;

    /* renamed from: c */
    public final CollageContentToggle f23882c;

    /* renamed from: d */
    public final TextView f23883d;

    /* renamed from: e */
    public final Button f23884e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShipsToSearchFilterViewHolder(ViewGroup viewGroup, C19857l<? super C10813l, C19394m> lVar) {
        super(C0114h.m305j0(viewGroup, R.layout.search_filters_item_ships_to, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(lVar, "onChange");
        this.f23881b = lVar;
        View findViewById = this.itemView.findViewById(R.id.content_toggle_ships_to);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.….content_toggle_ships_to)");
        this.f23882c = (CollageContentToggle) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_country);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.text_country)");
        this.f23883d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.button_update);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.button_update)");
        this.f23884e = (Button) findViewById3;
    }

    /* renamed from: e */
    public final void mo35868e(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        if (searchFiltersUiGroupItem instanceof SearchFiltersUiGroupItem.C10784e) {
            this.f23882c.setTitle(searchFiltersUiGroupItem.mo35795d());
            this.f23882c.setDescription(searchFiltersUiGroupItem.mo35794c());
            this.f23883d.setText(((SearchFiltersUiGroupItem.C10784e) searchFiltersUiGroupItem).f23869d);
            ViewExtensions.m12866j(this.f23884e, new ShipsToSearchFilterViewHolder$bind$1(this));
        }
    }
}
