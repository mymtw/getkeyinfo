package com.etsy.android.p327ui.shop.homesection;

import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.p326ui.DetailsBottomSheetDialogFragment;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import java.util.Map;
import p460ue.C13495e;

/* renamed from: com.etsy.android.ui.shop.homesection.i */
public final class C11159i extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C13495e f24669b;

    /* renamed from: c */
    public final /* synthetic */ C11160j f24670c;

    public C11159i(C11160j jVar, C13495e eVar) {
        this.f24670c = jVar;
        this.f24669b = eVar;
    }

    public final void onClick(View view) {
        this.f24670c.f26962b.mo21333d("trader_distinction_see_details_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        Bundle bundle = new Bundle();
        bundle.putString("title", this.f24670c.itemView.getContext().getString(R.string.seller_details_title));
        bundle.putString(DetailsBottomSheetNavigationKey.PARAM_BODY, this.f24669b.f29526b.getFormattedDetails());
        FragmentManager supportFragmentManager = ((FragmentActivity) this.f24670c.itemView.getContext()).getSupportFragmentManager();
        C2740a c = C0070b.m182c(supportFragmentManager, supportFragmentManager);
        c.mo10485g(0, c.mo10530e(bundle, DetailsBottomSheetDialogFragment.class), (String) null, 1);
        c.mo10483d();
    }
}
