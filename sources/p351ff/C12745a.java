package p351ff;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;

/* renamed from: ff.a */
public final class C12745a extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ShopCard f28151b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12745a(PredefinedAnalyticsProperty predefinedAnalyticsProperty, EtsyId etsyId, ShopCard shopCard) {
        super((AnalyticsProperty) predefinedAnalyticsProperty, etsyId);
        this.f28151b = shopCard;
    }

    public final void onViewClick(View view) {
        C19421p.m32933W(view.getContext(), new ShopHomeKey(C19421p.m32935c0(view.getContext()), this.f28151b.getShopId(), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, this.f28151b.getUserId(), false, (String) null, (Bundle) null, 256, (DefaultConstructorMarker) null));
    }
}
