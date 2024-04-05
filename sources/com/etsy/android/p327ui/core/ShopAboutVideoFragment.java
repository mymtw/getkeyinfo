package com.etsy.android.p327ui.core;

import android.os.Bundle;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.uikit.p331ui.core.VideoFragment;
import java.util.HashMap;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.core.ShopAboutVideoFragment */
public class ShopAboutVideoFragment extends VideoFragment {
    /* access modifiers changed from: private */
    public EtsyId mShopId;

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mShopId = new EtsyId(getArguments().getString("shop_id"));
    }

    public void onVideoError() {
        super.onVideoError();
        C8703p analyticsContext = getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.mo21333d("shop_about_video_playback_error", new HashMap<AnalyticsProperty, Object>() {
                {
                    put(PredefinedAnalyticsProperty.SHOP_ID, ShopAboutVideoFragment.this.mShopId.getId());
                }
            });
        }
        C18263b.f40051O.mo45474a("shop.about.video.playback_error");
    }

    public void onVideoPrepared() {
        C8703p analyticsContext = getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.mo21333d("shop_about_video_played", new HashMap<AnalyticsProperty, Object>() {
                {
                    put(PredefinedAnalyticsProperty.SHOP_ID, ShopAboutVideoFragment.this.mShopId.getId());
                }
            });
        }
    }
}
