package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import p460ue.C13492b;

/* renamed from: com.etsy.android.ui.shop.viewholder.f */
public final class C11272f extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13492b f24885b;

    /* renamed from: c */
    public final /* synthetic */ C11274g f24886c;

    public C11272f(C11274g gVar, C13492b bVar) {
        this.f24886c = gVar;
        this.f24885b = bVar;
    }

    public final void onViewClick(View view) {
        C13492b bVar = this.f24885b;
        if (bVar != null) {
            boolean z = !bVar.f29523b;
            bVar.f29523b = z;
            if (z) {
                C11274g gVar = this.f24886c;
                C11266c cVar = gVar.f24891f;
                int adapterPosition = gVar.getAdapterPosition();
                cVar.f28980b.mo21333d("shop_announcement_view", (Map<? extends AnalyticsProperty, Object>) null);
                cVar.f24872d.mo31300i(adapterPosition);
                return;
            }
            C11274g gVar2 = this.f24886c;
            C11266c cVar2 = gVar2.f24891f;
            int adapterPosition2 = gVar2.getAdapterPosition();
            cVar2.f28980b.mo21333d("shop_announcement_hide", (Map<? extends AnalyticsProperty, Object>) null);
            cVar2.f24872d.mo31300i(adapterPosition2);
        }
    }
}
