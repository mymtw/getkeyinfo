package com.etsy.android.p327ui.search.filters.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.adapter.a */
public final class C10757a extends RecyclerView.Adapter<C10758a> {

    /* renamed from: b */
    public final List<Country> f23704b;

    /* renamed from: c */
    public final C19857l<Country, C19394m> f23705c;

    /* renamed from: com.etsy.android.ui.search.filters.adapter.a$a */
    public final class C10758a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f23706b;

        public C10758a(View view) {
            super(view);
            View findViewById = this.itemView.findViewById(R.id.text_country);
            C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_country)");
            this.f23706b = (TextView) findViewById;
        }
    }

    public C10757a(C19857l lVar, List list) {
        C19383o.m32797g(list, ResponseConstants.COUNTRIES);
        this.f23704b = list;
        this.f23705c = lVar;
    }

    public final int getItemCount() {
        return this.f23704b.size();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10758a aVar = (C10758a) b0Var;
        C19383o.m32797g(aVar, "holder");
        Country country = this.f23704b.get(i);
        C19383o.m32797g(country, "country");
        aVar.f23706b.setText(country.getName());
        View view = aVar.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new CountrySelectorAdapter$CountriesViewHolder$bind$1(C10757a.this, country));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_country, viewGroup, false);
        C19383o.m32796f(h, "view");
        return new C10758a(h);
    }
}
