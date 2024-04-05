package com.etsy.android.lib.logger;

import android.os.Bundle;
import androidx.room.C3217a;
import com.etsy.android.lib.logger.C8701o;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;

public final class ViewAnalyticsParameters {

    /* renamed from: a */
    public static final C8668a f19047a = new C8668a();

    /* renamed from: b */
    public static final C8669b f19048b = new C8669b();

    /* renamed from: c */
    public static final C3217a f19049c = new C3217a(1);

    /* renamed from: d */
    public static final C8670c f19050d = new C8670c();

    /* renamed from: e */
    public static final HashMap<String, C8701o> f19051e = new HashMap<String, C8701o>() {
        {
            put("convo_id", new C8701o("convo_id", PredefinedAnalyticsProperty.CONVERSATION_ID, ViewAnalyticsParameters.f19048b));
            PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.RECEIPT_ID;
            C3217a aVar = ViewAnalyticsParameters.f19049c;
            put(ResponseConstants.RECEIPT_ID, new C8701o(ResponseConstants.RECEIPT_ID, predefinedAnalyticsProperty, aVar));
            put("listing_id", new C8701o("listing_id", PredefinedAnalyticsProperty.LISTING_ID, aVar));
            put("shop_id", new C8701o("shop_id", PredefinedAnalyticsProperty.SHOP_ID, aVar));
            put("local_market_id", new C8701o("local_market_id", PredefinedAnalyticsProperty.LOCAL_MARKET_ID, aVar));
            PredefinedAnalyticsProperty predefinedAnalyticsProperty2 = PredefinedAnalyticsProperty.USER_NAME;
            C8668a aVar2 = ViewAnalyticsParameters.f19047a;
            put(ResponseConstants.USERNAME, new C8701o(ResponseConstants.USERNAME, predefinedAnalyticsProperty2, aVar2));
            put("url", new C8701o("url", PredefinedAnalyticsProperty.URL, aVar2));
            put("accepted_structured_policies", new C8701o("accepted_structured_policies", PredefinedAnalyticsProperty.ACCEPTED_STRUCTURED_POLICIES, ViewAnalyticsParameters.f19050d));
            put(".loc", new C8701o(".loc", PredefinedAnalyticsProperty.LOC, aVar2));
            put(".ref", new C8701o(".ref", PredefinedAnalyticsProperty.REFERRER, aVar2));
            put(ResponseConstants.CONTENT_SOURCE, new C8701o(ResponseConstants.CONTENT_SOURCE, PredefinedAnalyticsProperty.CONTENT_SOURCE, aVar2));
        }
    };

    /* renamed from: com.etsy.android.lib.logger.ViewAnalyticsParameters$a */
    public class C8668a implements C8701o.C8702a {
        /* renamed from: a */
        public final Object mo11995a(Bundle bundle, String str) {
            return bundle.getString(str);
        }
    }

    /* renamed from: com.etsy.android.lib.logger.ViewAnalyticsParameters$b */
    public class C8669b implements C8701o.C8702a {
        /* renamed from: a */
        public final Object mo11995a(Bundle bundle, String str) {
            return Integer.valueOf(bundle.getInt(str));
        }
    }

    /* renamed from: com.etsy.android.lib.logger.ViewAnalyticsParameters$c */
    public class C8670c implements C8701o.C8702a {
        /* renamed from: a */
        public final Object mo11995a(Bundle bundle, String str) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
    }
}
