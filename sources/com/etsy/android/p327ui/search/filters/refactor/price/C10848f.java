package com.etsy.android.p327ui.search.filters.refactor.price;

import com.etsy.android.p327ui.search.filters.refactor.C10803g;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.stylekit.views.CollageCheckbox;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.f */
public final class C10848f implements CollageCheckbox.C9027c {

    /* renamed from: a */
    public final /* synthetic */ SearchFilterPriceMultiSelectViewHolder f24043a;

    /* renamed from: b */
    public final /* synthetic */ C10803g f24044b;

    public C10848f(SearchFilterPriceMultiSelectViewHolder searchFilterPriceMultiSelectViewHolder, C10803g gVar) {
        this.f24043a = searchFilterPriceMultiSelectViewHolder;
        this.f24044b = gVar;
    }

    /* renamed from: a */
    public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
        C19383o.m32797g(collageCheckbox, "selectedButton");
        this.f24043a.f24029b.invoke(new C10813l.C10823j(this.f24044b, z));
    }
}
