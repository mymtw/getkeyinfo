package com.paypal.pyplcheckout.p543di;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthParentFragment;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback;
import com.paypal.pyplcheckout.threeds.ThreeDS20Activity;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.di.SdkComponentKt */
public final class SdkComponentKt {
    public static final <VM extends C2866i0> C19285c<VM> activityViewModels(Context context, SdkComponent sdkComponent, C19846a<? extends C2870k0.C2872b> aVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(sdkComponent, "sdkComponent");
        C19383o.m32797g(aVar, "factoryProducer");
        if (!(context instanceof ComponentActivity)) {
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        ComponentActivity componentActivity = (ComponentActivity) context;
        C19383o.m32804n();
        throw null;
    }

    public static C19285c activityViewModels$default(Context context, SdkComponent sdkComponent, C19846a aVar, int i, Object obj) {
        Context context2 = context;
        SdkComponent instance = (i & 2) != 0 ? SdkComponent.Companion.getInstance() : sdkComponent;
        C19846a sdkComponentKt$activityViewModels$1 = (i & 4) != 0 ? new SdkComponentKt$activityViewModels$1(instance) : aVar;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(instance, "sdkComponent");
        C19383o.m32797g(sdkComponentKt$activityViewModels$1, "factoryProducer");
        if (!(context2 instanceof ComponentActivity)) {
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        ComponentActivity componentActivity = (ComponentActivity) context2;
        C19383o.m32804n();
        throw null;
    }

    public static final void inject(PYPLHomeActivity pYPLHomeActivity) {
        C19383o.m32797g(pYPLHomeActivity, "activity");
        SdkComponent.Companion.getInstance().inject(pYPLHomeActivity);
    }

    public static final void inject(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity) {
        C19383o.m32797g(pYPLInitiateCheckoutActivity, "activity");
        SdkComponent.Companion.getInstance().inject(pYPLInitiateCheckoutActivity);
    }

    public static final void inject(BaseFragment baseFragment) {
        C19383o.m32797g(baseFragment, "fragment");
        SdkComponent.Companion.getInstance().inject(baseFragment);
    }

    public static final void inject(HomeFragment homeFragment) {
        C19383o.m32797g(homeFragment, "fragment");
        SdkComponent.Companion.getInstance().inject(homeFragment);
    }

    public static final <VM extends C2866i0> C19285c<VM> activityViewModels(ComponentActivity componentActivity, SdkComponent sdkComponent, C19846a<? extends C2870k0.C2872b> aVar) {
        C19383o.m32797g(componentActivity, "activity");
        C19383o.m32797g(sdkComponent, "sdkComponent");
        C19383o.m32797g(aVar, "factoryProducer");
        C19383o.m32804n();
        throw null;
    }

    public static final void inject(NativeAuthParentFragment nativeAuthParentFragment) {
        C19383o.m32797g(nativeAuthParentFragment, "fragment");
        SdkComponent.Companion.getInstance().inject(nativeAuthParentFragment);
    }

    public static final void inject(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment) {
        C19383o.m32797g(pYPLNewShippingAddressReviewFragment, "fragment");
        SdkComponent.Companion.getInstance().inject(pYPLNewShippingAddressReviewFragment);
    }

    public static C19285c activityViewModels$default(ComponentActivity componentActivity, SdkComponent sdkComponent, C19846a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            sdkComponent = SdkComponent.Companion.getInstance();
        }
        if ((i & 4) != 0) {
            aVar = new SdkComponentKt$activityViewModels$3(sdkComponent);
        }
        C19383o.m32797g(componentActivity, "activity");
        C19383o.m32797g(sdkComponent, "sdkComponent");
        C19383o.m32797g(aVar, "factoryProducer");
        C19383o.m32804n();
        throw null;
    }

    public static final void inject(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment) {
        C19383o.m32797g(pYPLAddressRecommendationFragment, "fragment");
        SdkComponent.Companion.getInstance().inject(pYPLAddressRecommendationFragment);
    }

    public static final void inject(ThreeDS20Activity threeDS20Activity) {
        C19383o.m32797g(threeDS20Activity, "activity");
        SdkComponent.Companion.getInstance().inject(threeDS20Activity);
    }

    public static final void inject(BaseCallback baseCallback) {
        C19383o.m32797g(baseCallback, "callback");
        SdkComponent.Companion.getInstance().inject(baseCallback);
    }
}
