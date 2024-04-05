package com.etsy.android.lib.core;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentActivity;
import androidx.multidex.MultiDexApplication;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.requests.LocaleRepository;
import com.etsy.android.uikit.util.C11905i;
import com.squareup.moshi.C17414y;
import p346fa.C12703a;
import p409o9.C13128h;
import p448ta.C13388d;
import p456ua.C13461f;
import p470w9.C13794b;
import p486y9.C13886b;

public abstract class EtsyApplication extends MultiDexApplication {
    private static EtsyApplication sInstance;
    private static final Object sLock = new Object();

    public static EtsyApplication get() {
        EtsyApplication etsyApplication;
        synchronized (sLock) {
            etsyApplication = sInstance;
            if (etsyApplication == null) {
                throw new IllegalStateException("Context was not initialized in onCreate() of the Application base class");
            }
        }
        return etsyApplication;
    }

    public static void initializeContext(EtsyApplication etsyApplication) {
        sInstance = etsyApplication;
    }

    public abstract C8672b getAnalyticsTracker();

    @Deprecated
    public abstract C13128h getConfigRepository();

    @Deprecated
    public abstract C13886b getConfigUpdateStream();

    @Deprecated
    public abstract C13794b getCountriesRepository();

    public abstract Class<? extends FragmentActivity> getDeepLinkRoutingActivity();

    @Deprecated
    public abstract C8618c getEtsyConfigMap();

    public abstract String getFileProviderAuthority();

    @Deprecated
    public abstract C11905i getFollowRepository();

    @Deprecated
    public abstract C12703a getGrafana();

    @Deprecated
    public abstract LocaleRepository getLocaleRepository();

    @Deprecated
    public abstract C17414y getMoshi();

    @Deprecated
    public abstract C8617e getNativeConfigs();

    @Deprecated
    public abstract C13388d getRegionsRepository();

    @Deprecated
    public abstract C13461f getRxSchedulers();

    public abstract String getVersionName();

    public abstract boolean isAppInBackground();

    public void onCreate() {
        super.onCreate();
        synchronized (sLock) {
            sInstance = this;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public abstract void setAwaitConfigsOnNextLaunch();
}
