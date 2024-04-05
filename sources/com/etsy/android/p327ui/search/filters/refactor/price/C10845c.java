package com.etsy.android.p327ui.search.filters.refactor.price;

import com.etsy.android.p327ui.search.filters.refactor.C10803g;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageRadioButton;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.c */
public final class C10845c implements CollageRadioGroup.C9044a {

    /* renamed from: a */
    public final /* synthetic */ PriceSearchFilterViewHolder f24038a;

    public C10845c(PriceSearchFilterViewHolder priceSearchFilterViewHolder) {
        this.f24038a = priceSearchFilterViewHolder;
    }

    /* renamed from: a */
    public final void mo30994a(boolean z, CollageRadioButton collageRadioButton) {
        C19383o.m32797g(collageRadioButton, "selectedButton");
        C10803g gVar = (C10803g) this.f24038a.f24026f.get(collageRadioButton);
        if (gVar != null) {
            this.f24038a.f24022b.invoke(new C10813l.C10821h(gVar));
        }
    }
}
