package com.paypal.pyplcheckout.p543di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.internal.build.BuildValidator;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationSession;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeSdk;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.utils.AmplitudeUtils;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.VersionUtils;
import java.util.Date;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p253u3.C8134a;
import p253u3.C8139f;

/* renamed from: com.paypal.pyplcheckout.di.AppModule */
public final class AppModule {
    public final C8139f providesAmplitudeClient() {
        return C8134a.m16364a((String) null);
    }

    public final AmplitudeSdk providesAmplitudeInitializer$pyplcheckout_externalThreedsRelease(DebugConfigManager debugConfigManager, AmplitudeUtils amplitudeUtils, Context context) {
        C19383o.m32797g(debugConfigManager, "debugConfigManager");
        C19383o.m32797g(amplitudeUtils, "amplitudeUtils");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return new AmplitudeSdk(debugConfigManager, 3, amplitudeUtils, context);
    }

    public final BuildValidator providesBuildValidator() {
        return new BuildValidator(VersionUtils.INSTANCE.getSdkVersion(), (Date) null, 2, (DefaultConstructorMarker) null);
    }

    public final AndroidSDKVersionProvider providesBuildVersion() {
        return new AndroidSDKVersionProvider(0, 1, (DefaultConstructorMarker) null);
    }

    public final DebugConfigManager providesDebugConfigManager() {
        DebugConfigManager instance = DebugConfigManager.getInstance();
        C19383o.m32796f(instance, "getInstance()");
        return instance;
    }

    public final Events providesEvents() {
        return Events.Companion.getInstance();
    }

    public final FeatureFlagManager providesFeatureFlagManager$pyplcheckout_externalThreedsRelease() {
        return FeatureFlagManager.INSTANCE;
    }

    /* renamed from: providesInstrumentationSession$pyplcheckout_externalThreedsRelease */
    public final InstrumentationSession mo64217xbc1aba2f() {
        return new InstrumentationSession();
    }

    public final boolean providesIs1P$pyplcheckout_externalThreedsRelease() {
        return false;
    }

    public final boolean providesIsDebug$pyplcheckout_externalThreedsRelease() {
        return false;
    }

    public final Handler providesMainHandler(Looper looper) {
        C19383o.m32797g(looper, "looper");
        return new Handler(looper);
    }

    public final Looper providesMainLooper() {
        Looper mainLooper = Looper.getMainLooper();
        C19383o.m32796f(mainLooper, "getMainLooper()");
        return mainLooper;
    }

    public final PYPLCheckoutUtils providesPyplCheckoutUtils() {
        return PYPLCheckoutUtils.Companion.getInstance();
    }
}
