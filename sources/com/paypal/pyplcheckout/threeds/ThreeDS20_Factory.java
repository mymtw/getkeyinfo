package com.paypal.pyplcheckout.threeds;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ThreeDS20_Factory implements C17555d<ThreeDS20> {
    private final C19011a<ThreeDs20Info> threeDs20InfoProvider;

    public ThreeDS20_Factory(C19011a<ThreeDs20Info> aVar) {
        this.threeDs20InfoProvider = aVar;
    }

    public static ThreeDS20_Factory create(C19011a<ThreeDs20Info> aVar) {
        return new ThreeDS20_Factory(aVar);
    }

    public static ThreeDS20 newInstance(ThreeDs20Info threeDs20Info) {
        return new ThreeDS20(threeDs20Info);
    }

    public ThreeDS20 get() {
        return newInstance(this.threeDs20InfoProvider.get());
    }
}
