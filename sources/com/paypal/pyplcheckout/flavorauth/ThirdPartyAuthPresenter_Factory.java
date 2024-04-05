package com.paypal.pyplcheckout.flavorauth;

import dagger.internal.C17555d;

public final class ThirdPartyAuthPresenter_Factory implements C17555d<ThirdPartyAuthPresenter> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ThirdPartyAuthPresenter_Factory INSTANCE = new ThirdPartyAuthPresenter_Factory();

        private InstanceHolder() {
        }
    }

    public static ThirdPartyAuthPresenter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ThirdPartyAuthPresenter newInstance() {
        return new ThirdPartyAuthPresenter();
    }

    public ThirdPartyAuthPresenter get() {
        return newInstance();
    }
}
