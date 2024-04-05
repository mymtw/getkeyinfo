package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import p407nf.C13113a;

public final class ListingCard3x3ViewHolder$bindFavoriteButton$1 extends TrackingOnClickListener {
    public final /* synthetic */ FavHeartButton $favButton;
    public final /* synthetic */ C12005q $viewModel;
    public final /* synthetic */ C12004p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCard3x3ViewHolder$bindFavoriteButton$1(C12004p pVar, C12005q qVar, FavHeartButton favHeartButton, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = pVar;
        this.$viewModel = qVar;
        this.$favButton = favHeartButton;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        C12004p pVar = this.this$0;
        C13113a aVar = pVar.f26747c;
        if (aVar != null) {
            aVar.mo31348d(this.$viewModel.f26754a, this.$favButton, pVar.getAdapterPosition());
            NavigationExtensionsKt.m17420a(this.$favButton, 500);
        }
    }
}
