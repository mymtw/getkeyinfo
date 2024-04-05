package com.paypal.pyplcheckout.p543di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C2870k0;
import com.paypal.checkout.createorder.CreateOrderActions;
import com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction;
import com.paypal.checkout.internal.build.BuildValidator;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthParentFragment;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase;
import com.paypal.pyplcheckout.common.cache.CacheConfigManager;
import com.paypal.pyplcheckout.common.cache.CheckoutCache;
import com.paypal.pyplcheckout.common.instrumentation.AmplitudeManager;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationSession;
import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.network.ConnectivityHandler;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import com.paypal.pyplcheckout.state.usecase.GetCheckoutStateUseCase;
import com.paypal.pyplcheckout.state.usecase.SetCheckoutStateUseCase;
import com.paypal.pyplcheckout.threeds.ThreeDS20Activity;
import com.paypal.pyplcheckout.userprofile.usecase.CacheClientIdUseCase;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.di.SdkComponent */
public interface SdkComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.paypal.pyplcheckout.di.SdkComponent$Companion */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static SdkComponent instance;

        private Companion() {
        }

        private final void initEagerSingletons() {
            SdkComponent sdkComponent = instance;
            if (sdkComponent != null) {
                sdkComponent.getConnectivityHandler();
            }
        }

        public final SdkComponent create(Application application) {
            C19383o.m32797g(application, "application");
            SdkComponent sdkComponent = instance;
            if (sdkComponent != null) {
                return sdkComponent;
            }
            SdkComponent create = DaggerSdkComponent.factory().create(application);
            instance = create;
            $$INSTANCE.initEagerSingletons();
            return create;
        }

        public final SdkComponent getInstance() {
            SdkComponent sdkComponent = instance;
            if (sdkComponent != null) {
                return sdkComponent;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: com.paypal.pyplcheckout.di.SdkComponent$Factory */
    public interface Factory {
        SdkComponent create(Context context);
    }

    static SdkComponent create(Application application) {
        return Companion.create(application);
    }

    static SdkComponent getInstance() {
        return Companion.getInstance();
    }

    AmplitudeManager getAmplitudeManager();

    AuthRepository getAuthRepository();

    BillingAgreementsGetBalancePrefUseCase getBillingAgreementsGetBalancePrefUseCase();

    BillingAgreementsRepository getBillingAgreementsRepository();

    BuildValidator getBuildValidator();

    AndroidSDKVersionProvider getBuildVersionProvider();

    CheckoutCache getCache();

    CacheConfigManager getCacheConfigManager();

    CacheClientIdUseCase getCacheUseCase();

    CheckoutStateRepository getCheckoutStateRepository();

    ConnectivityHandler getConnectivityHandler();

    CreateOrderActions getCreateOrderActions();

    CryptoRepository getCryptoRepo();

    GetCheckoutStateUseCase getGetCheckoutStateUseCase();

    GetLocaleMetadataUseCase getGetLocaleMetadataUseCase();

    InstrumentationSession getInstrumentationSession();

    MerchantActions getMerchantActions();

    MerchantConfigRepository getMerchantConfigRepository();

    Repository getRepository();

    RetrieveFundingEligibilityAction getRetrieveFundingEligibilityAction();

    SetCheckoutStateUseCase getSetCheckoutStateUseCase();

    C2870k0.C2872b getViewModelProviderFactory();

    void inject(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment);

    void inject(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment);

    void inject(NativeAuthParentFragment nativeAuthParentFragment);

    void inject(BaseFragment baseFragment);

    void inject(PYPLHomeActivity pYPLHomeActivity);

    void inject(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity);

    void inject(HomeFragment homeFragment);

    void inject(BaseCallback baseCallback);

    void inject(ThreeDS20Activity threeDS20Activity);
}
