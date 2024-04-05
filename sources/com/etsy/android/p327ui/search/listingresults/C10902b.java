package com.etsy.android.p327ui.search.listingresults;

import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;
import p472wb.C13799a;
import p472wb.C13801b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.listingresults.b */
public final class C10902b extends C13801b {

    /* renamed from: I */
    public final C19846a<Boolean> f24206I;

    public C10902b(C13799a aVar, C19846a<Boolean> aVar2) {
        super(aVar);
        this.f24206I = aVar2;
    }

    /* renamed from: f */
    public final int mo36216f(C13186o oVar) {
        C19383o.m32797g(oVar, "item");
        return (!this.f24206I.invoke().booleanValue() || oVar.getViewType() != R.id.view_type_listing_card) ? super.mo36216f(oVar) : R.id.view_type_listing_card_3x3;
    }
}
