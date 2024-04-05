package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.ListingCard;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.d */
public final /* synthetic */ class C9167d implements View.OnLongClickListener {

    /* renamed from: b */
    public final /* synthetic */ C9171e f20179b;

    /* renamed from: c */
    public final /* synthetic */ ListingCard f20180c;

    public /* synthetic */ C9167d(C9171e eVar, ListingCard listingCard) {
        this.f20179b = eVar;
        this.f20180c = listingCard;
    }

    public final boolean onLongClick(View view) {
        C9171e eVar = this.f20179b;
        ListingCard listingCard = this.f20180c;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(listingCard, "$listing");
        eVar.f20189c.f20044f.mo31350f(listingCard);
        return true;
    }
}
