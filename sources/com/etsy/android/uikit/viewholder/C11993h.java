package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.views.FavHeartButton;
import p407nf.C13113a;

/* renamed from: com.etsy.android.uikit.viewholder.h */
public final /* synthetic */ class C11993h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C11994i f26704b;

    /* renamed from: c */
    public final /* synthetic */ ListingCardUiModel f26705c;

    /* renamed from: d */
    public final /* synthetic */ FavHeartButton f26706d;

    public /* synthetic */ C11993h(C11994i iVar, ListingCardUiModel listingCardUiModel, FavHeartButton favHeartButton) {
        this.f26704b = iVar;
        this.f26705c = listingCardUiModel;
        this.f26706d = favHeartButton;
    }

    public final void onClick(View view) {
        C11994i iVar = this.f26704b;
        ListingCardUiModel listingCardUiModel = this.f26705c;
        FavHeartButton favHeartButton = this.f26706d;
        C13113a aVar = iVar.f26724t;
        if (aVar != null) {
            aVar.mo31348d(listingCardUiModel, favHeartButton, iVar.getAdapterPosition());
            NavigationExtensionsKt.m17420a(favHeartButton, 500);
        }
    }
}
