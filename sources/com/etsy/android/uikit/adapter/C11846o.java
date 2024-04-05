package com.etsy.android.uikit.adapter;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.uikit.view.C11950e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.uikit.adapter.o */
public final class C11846o implements C11950e {

    /* renamed from: a */
    public final /* synthetic */ C11842l f26339a;

    /* renamed from: b */
    public final /* synthetic */ ListingImage f26340b;

    /* renamed from: c */
    public final /* synthetic */ View f26341c;

    public C11846o(C11842l lVar, ListingImage listingImage, View view) {
        this.f26339a = lVar;
        this.f26340b = listingImage;
        this.f26341c = view;
    }

    /* renamed from: a */
    public final String mo38324a(int i, int i2) {
        C11842l lVar = this.f26339a;
        ListingImage listingImage = this.f26340b;
        C19383o.m32796f(listingImage, "listingImage");
        return C11842l.m19513A(lVar, listingImage, i, i2);
    }

    /* renamed from: b */
    public final void mo38325b() {
        C11842l lVar = this.f26339a;
        View view = this.f26341c;
        lVar.getClass();
        view.findViewById(R.id.activity_indicator).setVisibility(8);
    }

    public final void onFailed() {
        C11842l lVar = this.f26339a;
        View view = this.f26341c;
        lVar.getClass();
        view.findViewById(R.id.activity_indicator).setVisibility(8);
    }
}
