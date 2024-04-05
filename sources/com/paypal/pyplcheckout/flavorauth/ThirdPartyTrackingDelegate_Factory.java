package com.paypal.pyplcheckout.flavorauth;

import dagger.internal.C17555d;

public final class ThirdPartyTrackingDelegate_Factory implements C17555d<ThirdPartyTrackingDelegate> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ThirdPartyTrackingDelegate_Factory INSTANCE = new ThirdPartyTrackingDelegate_Factory();

        private InstanceHolder() {
        }
    }

    public static ThirdPartyTrackingDelegate_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ThirdPartyTrackingDelegate newInstance() {
        return new ThirdPartyTrackingDelegate();
    }

    public ThirdPartyTrackingDelegate get() {
        return newInstance();
    }
}
