package com.paypal.pyplcheckout.common.cache;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CacheConfigManager {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CheckoutCache checkoutCache;
    private boolean isDataStoreFeatureEnabled;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CacheConfigManager getInstance() {
            return SdkComponent.Companion.getInstance().getCacheConfigManager();
        }
    }

    public CacheConfigManager(CheckoutCache checkoutCache2) {
        C19383o.m32797g(checkoutCache2, "checkoutCache");
        this.checkoutCache = checkoutCache2;
    }

    public static /* synthetic */ void isDataStoreFeatureEnabled$annotations() {
    }

    public final void cacheStickinessId(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "stickinessId");
        if (this.isDataStoreFeatureEnabled) {
            this.checkoutCache.getCache().setStringDataForPref(StringPreferenceConstants.STICKINESS_ID.name(), str);
        } else {
            Cache.INSTANCE.cacheStickinessId(context, str);
        }
    }

    public final String getStickinessId(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return this.isDataStoreFeatureEnabled ? this.checkoutCache.getCache().getStringDataForPref(StringPreferenceConstants.STICKINESS_ID.name()) : Cache.getStickinessId(context);
    }

    public final boolean isDataStoreFeatureEnabled() {
        return this.isDataStoreFeatureEnabled;
    }

    public final void setDataStoreFeatureEnabled(boolean z) {
        this.isDataStoreFeatureEnabled = z;
    }
}
