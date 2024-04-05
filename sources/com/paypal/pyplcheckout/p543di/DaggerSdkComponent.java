package com.paypal.pyplcheckout.p543di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.google.gson.C16708i;
import com.google.gson.C16796j;
import com.paypal.checkout.approve.Approval;
import com.paypal.checkout.createorder.CreateOrderAction;
import com.paypal.checkout.createorder.CreateOrderActions;
import com.paypal.checkout.createorder.CreateOrderRequestFactory;
import com.paypal.checkout.createorder.p536ba.BaTokenToEcTokenAction;
import com.paypal.checkout.createorder.p536ba.BaTokenToEcTokenRequestFactory;
import com.paypal.checkout.fundingeligibility.FundingEligibilityRequestFactory;
import com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction;
import com.paypal.checkout.internal.build.BuildValidator;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.checkout.merchanttoken.GetLsatTokenAction;
import com.paypal.checkout.merchanttoken.LsatTokenRequestFactory;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction_Factory;
import com.paypal.checkout.order.AuthorizeOrderAction;
import com.paypal.checkout.order.CaptureOrderAction;
import com.paypal.checkout.order.GetOrderAction;
import com.paypal.checkout.order.GetOrderRequestFactory;
import com.paypal.checkout.order.OrderActions;
import com.paypal.checkout.order.UpdateOrderStatusAction;
import com.paypal.checkout.order.UpdateOrderStatusRequestFactory;
import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.checkout.order.actions.PatchAction_Factory;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementRequestFactory;
import com.paypal.checkout.order.patch.PatchOrderAction;
import com.paypal.checkout.order.patch.PatchOrderAction_Factory;
import com.paypal.checkout.order.patch.PatchOrderRequestFactory;
import com.paypal.checkout.order.patch.PatchOrderRequestFactory_Factory;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.addcard.AddCardViewModel_Factory;
import com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase;
import com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase_Factory;
import com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase;
import com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase_Factory;
import com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase_Factory;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveInputAddressUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveInputAddressUseCase_Factory;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveValidatedAddressUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveValidatedAddressUseCase_Factory;
import com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase_Factory;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewModel;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewModel_Factory;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment_MembersInjector;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment_MembersInjector;
import com.paypal.pyplcheckout.addressbook.viewmodel.AddressReviewViewModel;
import com.paypal.pyplcheckout.addressbook.viewmodel.AddressReviewViewModel_Factory;
import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import com.paypal.pyplcheckout.addressvalidation.AddressRepository_Factory;
import com.paypal.pyplcheckout.addressvalidation.ValidateAddressUseCase;
import com.paypal.pyplcheckout.addressvalidation.ValidateAddressUseCase_Factory;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel_Factory;
import com.paypal.pyplcheckout.auth.AuthHandlerProvider;
import com.paypal.pyplcheckout.auth.AuthHandlerProvider_Factory;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthParentFragment;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthParentFragment_MembersInjector;
import com.paypal.pyplcheckout.billingagreements.dagger.BillingAgreementsModule;
import com.paypal.pyplcheckout.billingagreements.dagger.BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory;
import com.paypal.pyplcheckout.billingagreements.dagger.C17197x5c872b9d;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsDao;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsCacheTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsCacheTypeUseCase_Factory;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase_Factory;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase_Factory;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsSetBalancePrefUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsSetBalancePrefUseCase_Factory;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel_Factory;
import com.paypal.pyplcheckout.common.cache.CacheConfigManager;
import com.paypal.pyplcheckout.common.cache.CheckoutCache;
import com.paypal.pyplcheckout.common.cache.CheckoutDataStore;
import com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi;
import com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi_Factory;
import com.paypal.pyplcheckout.common.instrumentation.AmplitudeManager;
import com.paypal.pyplcheckout.common.instrumentation.AmplitudeManager_Factory;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationSession;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.AmplitudeDao;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.dao.SharedPrefAmplitudeDao_Factory;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeSdk;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeService;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeService_Factory;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo_Factory;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository_Factory;
import com.paypal.pyplcheckout.crypto.NativePayWithCryptoCheck;
import com.paypal.pyplcheckout.crypto.NativePayWithCryptoCheck_Factory;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel_Factory;
import com.paypal.pyplcheckout.data.api.OkHttpClientFactory;
import com.paypal.pyplcheckout.data.daos.MerchantConfigDaoImpl;
import com.paypal.pyplcheckout.data.daos.MerchantConfigDaoImpl_Factory;
import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.data.repositories.AuthRepository_Factory;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository_Factory;
import com.paypal.pyplcheckout.domain.usecase.GetMerchantConfigUseCase;
import com.paypal.pyplcheckout.domain.usecase.GetMerchantConfigUseCase_Factory;
import com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase;
import com.paypal.pyplcheckout.eligibility.EligibilityManager;
import com.paypal.pyplcheckout.eligibility.EligibilityManager_Factory;
import com.paypal.pyplcheckout.eligibility.Native3pEligibilityCheck;
import com.paypal.pyplcheckout.eligibility.Native3pEligibilityCheck_Factory;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.flavorauth.ClearAccessTokenUseCase;
import com.paypal.pyplcheckout.flavorauth.ClearAccessTokenUseCase_Factory;
import com.paypal.pyplcheckout.flavorauth.FoundationRiskConfig;
import com.paypal.pyplcheckout.flavorauth.FoundationRiskConfig_Factory;
import com.paypal.pyplcheckout.flavorauth.LogoutUseCase;
import com.paypal.pyplcheckout.flavorauth.LogoutUseCase_Factory;
import com.paypal.pyplcheckout.flavorauth.NativeAuthAccessTokenUseCase;
import com.paypal.pyplcheckout.flavorauth.NativeAuthAccessTokenUseCase_Factory;
import com.paypal.pyplcheckout.flavorauth.PartnerAuthenticationProviderFactory;
import com.paypal.pyplcheckout.flavorauth.PartnerAuthenticationProviderFactory_Factory;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuthPresenter;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuthPresenter_Factory;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth_Factory;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyTrackingDelegate;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyTrackingDelegate_Factory;
import com.paypal.pyplcheckout.flavorauth.UpgradeAuthAccessTokenUseCase;
import com.paypal.pyplcheckout.flavorauth.UpgradeAuthAccessTokenUseCase_Factory;
import com.paypal.pyplcheckout.flavorauth.WebBasedAuthAccessTokenUseCase;
import com.paypal.pyplcheckout.flavorauth.WebBasedAuthAccessTokenUseCase_Factory;
import com.paypal.pyplcheckout.fundingOptions.dao.SharedPrefsFundingOptionsDao;
import com.paypal.pyplcheckout.fundingOptions.dao.SharedPrefsFundingOptionsDao_Factory;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase_Factory;
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel;
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel_Factory;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.BaseFragment_MembersInjector;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity_MembersInjector;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity_MembersInjector;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel_Factory;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment_MembersInjector;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel_Factory;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel_Factory;
import com.paypal.pyplcheckout.home.viewmodel.PostAuthSuccessHandler;
import com.paypal.pyplcheckout.home.viewmodel.PostAuthSuccessHandler_Factory;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.network.ConnectivityHandler;
import com.paypal.pyplcheckout.network.ConnectivityHandler_Factory;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.AbManager_Factory;
import com.paypal.pyplcheckout.p539ab.elmo.Elmo;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoApi;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoApi_Factory;
import com.paypal.pyplcheckout.p539ab.elmo.Elmo_Factory;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.viewmodel.CustomViewModelFactory;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse_Factory;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.CryptoRepository_Factory;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.Repository_Factory;
import com.paypal.pyplcheckout.services.api.CryptoQuoteTimer;
import com.paypal.pyplcheckout.services.api.CryptoQuoteTimer_Factory;
import com.paypal.pyplcheckout.services.api.LocaleMetadataApi;
import com.paypal.pyplcheckout.services.api.LocaleMetadataApi_Factory;
import com.paypal.pyplcheckout.services.api.interceptor.AccessTokenInterceptor;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import com.paypal.pyplcheckout.services.callbacks.ApprovePaymentCallback;
import com.paypal.pyplcheckout.services.callbacks.ApprovePaymentCallback_Factory;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback_MembersInjector;
import com.paypal.pyplcheckout.services.callbacks.UpdateCurrencyConversionCallback;
import com.paypal.pyplcheckout.services.callbacks.UpdateCurrencyConversionCallback_Factory;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler_Factory;
import com.paypal.pyplcheckout.state.dagger.CheckoutStateModule;
import com.paypal.pyplcheckout.state.dagger.CheckoutStateModule_ProvidesCheckoutStateDaoFactory;
import com.paypal.pyplcheckout.state.dagger.CheckoutStateModule_ProvidesCheckoutStateRepositoryFactory;
import com.paypal.pyplcheckout.state.data.daos.CheckoutStateDao;
import com.paypal.pyplcheckout.state.data.repositories.CheckoutStateRepository;
import com.paypal.pyplcheckout.state.usecase.GetCheckoutStateUseCase;
import com.paypal.pyplcheckout.state.usecase.GetCheckoutStateUseCase_Factory;
import com.paypal.pyplcheckout.state.usecase.SetCheckoutStateUseCase;
import com.paypal.pyplcheckout.state.usecase.SetCheckoutStateUseCase_Factory;
import com.paypal.pyplcheckout.threeds.ThreeDS20;
import com.paypal.pyplcheckout.threeds.ThreeDS20Activity;
import com.paypal.pyplcheckout.threeds.ThreeDS20Activity_MembersInjector;
import com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow;
import com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow_Factory;
import com.paypal.pyplcheckout.threeds.ThreeDSModule;
import com.paypal.pyplcheckout.threeds.ThreeDSModule_ProvidesThreeDS20Factory;
import com.paypal.pyplcheckout.threeds.ThreeDSModule_ProvidesThreeDS20InfoFactory;
import com.paypal.pyplcheckout.threeds.ThreeDSModule_ProvidesThreeDsDecisionFlowInfoFactory;
import com.paypal.pyplcheckout.threeds.ThreeDs20Info;
import com.paypal.pyplcheckout.threeds.ThreeDsDecisionFlowInfo;
import com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase;
import com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase_Factory;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase_Factory;
import com.paypal.pyplcheckout.userprofile.dao.ClientIdRepository;
import com.paypal.pyplcheckout.userprofile.dao.ClientIdRepository_Factory;
import com.paypal.pyplcheckout.userprofile.dao.SharedPrefsUserDao;
import com.paypal.pyplcheckout.userprofile.dao.SharedPrefsUserDao_Factory;
import com.paypal.pyplcheckout.userprofile.usecase.CacheClientIdUseCase;
import com.paypal.pyplcheckout.userprofile.usecase.GetCachedClientIdUseCase;
import com.paypal.pyplcheckout.userprofile.usecase.GetCachedClientIdUseCase_Factory;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserCountryUseCase;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserCountryUseCase_Factory;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase_Factory;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel_Factory;
import com.paypal.pyplcheckout.utils.AmplitudeUtils;
import com.paypal.pyplcheckout.utils.AmplitudeUtils_Factory;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.viewmodels.CancelViewModel;
import com.paypal.pyplcheckout.viewmodels.CancelViewModel_Factory;
import dagger.internal.C17554c;
import dagger.internal.C17556e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.DaggerSdkComponent */
public final class DaggerSdkComponent implements SdkComponent {
    private C19011a<AbManager> abManagerProvider;
    private C19011a<AddCardUseCase> addCardUseCaseProvider;
    private C19011a<AddCardViewModel> addCardViewModelProvider;
    private C19011a<AddShippingUseCase> addShippingUseCaseProvider;
    private C19011a<AddressAutoCompleteViewModel> addressAutoCompleteViewModelProvider;
    private C19011a<AddressRecommendationViewModel> addressRecommendationViewModelProvider;
    private C19011a<AddressRepository> addressRepositoryProvider;
    private C19011a<AddressReviewViewModel> addressReviewViewModelProvider;
    private C19011a<AmplitudeApi> amplitudeApiProvider;
    private C19011a<AmplitudeManager> amplitudeManagerProvider;
    private C19011a<AmplitudeRepository> amplitudeRepositoryProvider;
    private C19011a<AmplitudeService> amplitudeServiceProvider;
    private C19011a<AmplitudeUtils> amplitudeUtilsProvider;
    private final AppModule appModule;
    private C19011a<ApprovePaymentCallback> approvePaymentCallbackProvider;
    private C19011a<AuthHandlerProvider> authHandlerProvider;
    private C19011a<AuthRepository> authRepositoryProvider;
    private C19011a<AvailableBalanceViewModel> availableBalanceViewModelProvider;
    private C19011a<BillingAgreementsCacheTypeUseCase> billingAgreementsCacheTypeUseCaseProvider;
    private C19011a<BillingAgreementsGetBalancePrefUseCase> billingAgreementsGetBalancePrefUseCaseProvider;
    private C19011a<BillingAgreementsGetTypeUseCase> billingAgreementsGetTypeUseCaseProvider;
    private C19011a<BillingAgreementsSetBalancePrefUseCase> billingAgreementsSetBalancePrefUseCaseProvider;
    private C19011a<BillingAgreementsViewModel> billingAgreementsViewModelProvider;
    private C19011a<CancelViewModel> cancelViewModelProvider;
    private C19011a<CartViewModel> cartViewModelProvider;
    private C19011a<ClearAccessTokenUseCase> clearAccessTokenUseCaseProvider;
    private C19011a<ClientIdRepository> clientIdRepositoryProvider;
    private C19011a<ConnectivityHandler> connectivityHandlerProvider;
    private final Context context;
    private C19011a<Context> contextProvider;
    private final CoroutinesModule coroutinesModule;
    private C19011a<CryptoQuoteTimer> cryptoQuoteTimerProvider;
    private C19011a<CryptoRepository> cryptoRepositoryProvider;
    private C19011a<CryptoViewModel> cryptoViewModelProvider;
    private C19011a<DeviceInfo> deviceInfoProvider;
    private C19011a<EligibilityManager> eligibilityManagerProvider;
    private C19011a<ElmoApi> elmoApiProvider;
    private C19011a<Elmo> elmoProvider;
    private C19011a<FoundationRiskConfig> foundationRiskConfigProvider;
    private C19011a<FundingOptionsViewModel> fundingOptionsViewModelProvider;
    private C19011a<GetAddCardEnabledUseCase> getAddCardEnabledUseCaseProvider;
    private C19011a<GetCachedClientIdUseCase> getCachedClientIdUseCaseProvider;
    private C19011a<GetCheckoutStateUseCase> getCheckoutStateUseCaseProvider;
    private C19011a<GetMerchantConfigUseCase> getMerchantConfigUseCaseProvider;
    private C19011a<GetSelectedFundingOptionUseCase> getSelectedFundingOptionUseCaseProvider;
    private C19011a<GetUserCountryUseCase> getUserCountryUseCaseProvider;
    private C19011a<GetUserUseCase> getUserUseCaseProvider;
    private C19011a<LocaleMetadataApi> localeMetadataApiProvider;
    private C19011a<LogoutUseCase> logoutUseCaseProvider;
    private C19011a<MainPaysheetViewModel> mainPaysheetViewModelProvider;
    private C19011a<MerchantConfigDaoImpl> merchantConfigDaoImplProvider;
    private C19011a<MerchantConfigRepository> merchantConfigRepositoryProvider;
    private C19011a<Native3pEligibilityCheck> native3pEligibilityCheckProvider;
    private C19011a<NativeAuthAccessTokenUseCase> nativeAuthAccessTokenUseCaseProvider;
    private C19011a<NativePayWithCryptoCheck> nativePayWithCryptoCheckProvider;
    private final NetworkModule networkModule;
    private C19011a<PartnerAuthenticationProviderFactory> partnerAuthenticationProviderFactoryProvider;
    private C19011a<PatchAction> patchActionProvider;
    private C19011a<PatchOrderAction> patchOrderActionProvider;
    private C19011a<PatchOrderRequestFactory> patchOrderRequestFactoryProvider;
    private C19011a<PostAuthSuccessHandler> postAuthSuccessHandlerProvider;
    private C19011a<AccessTokenInterceptor> provideAccessTokenInterceptorProvider;
    private C19011a<AmplitudeDao> provideAmplitudeDao$pyplcheckout_externalThreedsReleaseProvider;
    private C19011a<NetworkRetryInterceptor> provideNetworkRetryInterceptorProvider;

    /* renamed from: providesAmplitudeInitializer$pyplcheckout_externalThreedsReleaseProvider */
    private C19011a<AmplitudeSdk> f37732xee563a57;
    private C19011a<C20009t> providesAuthenticatedOkHttpClientProvider;
    private C19011a<BillingAgreementsDao> providesBillingAgreementsDaoProvider;
    private C19011a<BillingAgreementsRepository> providesBillingAgreementsRepositoryProvider;
    private C19011a<AndroidSDKVersionProvider> providesBuildVersionProvider;
    private C19011a<CheckoutStateDao> providesCheckoutStateDaoProvider;
    private C19011a<CheckoutStateRepository> providesCheckoutStateRepositoryProvider;
    private C19011a<DebugConfigManager> providesDebugConfigManagerProvider;
    private C19011a<CoroutineDispatcher> providesDefaultDispatcherProvider;
    private C19011a<Locale> providesDeviceLocaleProvider;
    private C19011a<Events> providesEventsProvider;

    /* renamed from: providesFeatureFlagManager$pyplcheckout_externalThreedsReleaseProvider */
    private C19011a<FeatureFlagManager> f37733x572e043;
    private C19011a<C16796j> providesGsonBuilderProvider;
    private C19011a<C16708i> providesGsonProvider;
    private C19011a<CoroutineDispatcher> providesIODispatcherProvider;

    /* renamed from: providesInstrumentationSession$pyplcheckout_externalThreedsReleaseProvider */
    private C19011a<InstrumentationSession> f37734xbc4f8540;
    private C19011a<Boolean> providesIs1P$pyplcheckout_externalThreedsReleaseProvider;
    private C19011a<Boolean> providesIsDebug$pyplcheckout_externalThreedsReleaseProvider;
    private C19011a<CoroutineContext> providesMainCoroutineContextChildProvider;
    private C19011a<Handler> providesMainHandlerProvider;
    private C19011a<Looper> providesMainLooperProvider;
    private C19011a<C20009t.C20010a> providesOkHttpClientBuilderProvider;
    private C19011a<OkHttpClientFactory> providesOkHttpClientFactoryProvider;
    private C19011a<C20009t> providesOkHttpClientProvider;
    private C19011a<PYPLCheckoutUtils> providesPyplCheckoutUtilsProvider;
    private C19011a<C20011u.C20012a> providesRequestBuilderProvider;
    private C19011a<C19525d0> providesSupervisorIODispatcherProvider;
    private C19011a<ThreeDs20Info> providesThreeDS20InfoProvider;
    private C19011a<ThreeDS20> providesThreeDS20Provider;
    private C19011a<ThreeDsDecisionFlowInfo> providesThreeDsDecisionFlowInfoProvider;
    private C19011a<Repository> repositoryProvider;
    private C19011a<RetrieveInputAddressUseCase> retrieveInputAddressUseCaseProvider;
    private C19011a<RetrieveValidatedAddressUseCase> retrieveValidatedAddressUseCaseProvider;
    private final DaggerSdkComponent sdkComponent;
    private C19011a<SetCheckoutStateUseCase> setCheckoutStateUseCaseProvider;
    private C19011a<SharedPrefAmplitudeDao> sharedPrefAmplitudeDaoProvider;
    private C19011a<SharedPrefsFundingOptionsDao> sharedPrefsFundingOptionsDaoProvider;
    private C19011a<SharedPrefsUserDao> sharedPrefsUserDaoProvider;
    private C19011a<ShippingCallbackHandler> shippingCallbackHandlerProvider;
    private C19011a<StartAddCardThreeDsUseCase> startAddCardThreeDsUseCaseProvider;
    private C19011a<ThirdPartyAuthPresenter> thirdPartyAuthPresenterProvider;
    private C19011a<ThirdPartyAuth> thirdPartyAuthProvider;
    private C19011a<ThirdPartyTrackingDelegate> thirdPartyTrackingDelegateProvider;
    private C19011a<ThreeDSDecisionFlow> threeDSDecisionFlowProvider;
    private final ThreeDSModule threeDSModule;
    private C19011a<ThreeDSUseCase> threeDSUseCaseProvider;
    private C19011a<UpdateCurrencyConversionCallback> updateCurrencyConversionCallbackProvider;
    private C19011a<UpgradeAuthAccessTokenUseCase> upgradeAuthAccessTokenUseCaseProvider;
    private C19011a<UpgradeLsatTokenAction> upgradeLsatTokenActionProvider;
    private C19011a<UserViewModel> userViewModelProvider;
    private C19011a<ValidateAddressUseCase> validateAddressUseCaseProvider;
    private C19011a<ValidateAndAddAddressUseCase> validateAndAddAddressUseCaseProvider;
    private C19011a<WebBasedAuthAccessTokenUseCase> webBasedAuthAccessTokenUseCaseProvider;

    /* renamed from: com.paypal.pyplcheckout.di.DaggerSdkComponent$Factory */
    public static final class Factory implements SdkComponent.Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(int i) {
            this();
        }

        public SdkComponent create(Context context) {
            context.getClass();
            return new DaggerSdkComponent(new AppModule(), new CoroutinesModule(), new DeviceModule(), new NetworkModule(), new BillingAgreementsModule(), new ThreeDSModule(), new CheckoutStateModule(), context, 0);
        }
    }

    private DaggerSdkComponent(AppModule appModule2, CoroutinesModule coroutinesModule2, DeviceModule deviceModule, NetworkModule networkModule2, BillingAgreementsModule billingAgreementsModule, ThreeDSModule threeDSModule2, CheckoutStateModule checkoutStateModule, Context context2) {
        this.sdkComponent = this;
        this.appModule = appModule2;
        this.threeDSModule = threeDSModule2;
        this.coroutinesModule = coroutinesModule2;
        this.networkModule = networkModule2;
        this.context = context2;
        initialize(appModule2, coroutinesModule2, deviceModule, networkModule2, billingAgreementsModule, threeDSModule2, checkoutStateModule, context2);
        initialize2(appModule2, coroutinesModule2, deviceModule, networkModule2, billingAgreementsModule, threeDSModule2, checkoutStateModule, context2);
    }

    public /* synthetic */ DaggerSdkComponent(AppModule appModule2, CoroutinesModule coroutinesModule2, DeviceModule deviceModule, NetworkModule networkModule2, BillingAgreementsModule billingAgreementsModule, ThreeDSModule threeDSModule2, CheckoutStateModule checkoutStateModule, Context context2, int i) {
        this(appModule2, coroutinesModule2, deviceModule, networkModule2, billingAgreementsModule, threeDSModule2, checkoutStateModule, context2);
    }

    private Approval approval() {
        return new Approval(orderActions());
    }

    private AuthorizeOrderAction authorizeOrderAction() {
        return new AuthorizeOrderAction(updateOrderStatusAction(), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher(this.coroutinesModule));
    }

    private BaTokenToEcTokenAction baTokenToEcTokenAction() {
        return new BaTokenToEcTokenAction(baTokenToEcTokenRequestFactory(), this.providesOkHttpClientProvider.get(), this.providesGsonProvider.get(), CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule));
    }

    private BaTokenToEcTokenRequestFactory baTokenToEcTokenRequestFactory() {
        return new BaTokenToEcTokenRequestFactory(AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule), NetworkModule_ProvidesRequestBuilderFactory.providesRequestBuilder(this.networkModule));
    }

    private BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase() {
        return new BillingAgreementsGetTypeUseCase(this.providesBillingAgreementsRepositoryProvider.get());
    }

    private CaptureOrderAction captureOrderAction() {
        return new CaptureOrderAction(updateOrderStatusAction(), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher(this.coroutinesModule));
    }

    private CheckoutDataStore checkoutDataStore() {
        return new CheckoutDataStore(this.context);
    }

    private CreateLsatTokenAction createLsatTokenAction() {
        return new CreateLsatTokenAction(AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule), lsatTokenRequestFactory(), this.providesOkHttpClientProvider.get(), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher(this.coroutinesModule));
    }

    private CreateOrderAction createOrderAction() {
        return new CreateOrderAction(createOrderRequestFactory(), this.providesOkHttpClientProvider.get(), this.providesGsonProvider.get(), createLsatTokenAction(), this.repositoryProvider.get(), CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule));
    }

    private CreateOrderRequestFactory createOrderRequestFactory() {
        return new CreateOrderRequestFactory(NetworkModule_ProvidesRequestBuilderFactory.providesRequestBuilder(this.networkModule), this.providesGsonProvider.get());
    }

    private CustomViewModelFactory customViewModelFactory() {
        return new CustomViewModelFactory(mapOfClassOfAndProviderOfViewModel());
    }

    private ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl() {
        return new ExecuteBillingAgreementActionImpl(this.providesBillingAgreementsRepositoryProvider.get(), createLsatTokenAction(), executeBillingAgreementRequestFactory(), this.repositoryProvider.get(), this.providesOkHttpClientProvider.get(), this.providesGsonProvider.get(), CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule));
    }

    private ExecuteBillingAgreementRequestFactory executeBillingAgreementRequestFactory() {
        return new ExecuteBillingAgreementRequestFactory(AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule), NetworkModule_ProvidesRequestBuilderFactory.providesRequestBuilder(this.networkModule));
    }

    public static SdkComponent.Factory factory() {
        return new Factory(0);
    }

    private FundingEligibilityRequestFactory fundingEligibilityRequestFactory() {
        return new FundingEligibilityRequestFactory(AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule));
    }

    private GetLsatTokenAction getLsatTokenAction() {
        return new GetLsatTokenAction(this.repositoryProvider.get(), createLsatTokenAction());
    }

    private GetOrderAction getOrderAction() {
        return new GetOrderAction(CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule), getLsatTokenAction(), upgradeLsatTokenAction(), getOrderRequestFactory(), this.providesOkHttpClientProvider.get(), this.providesGsonProvider.get());
    }

    private GetOrderRequestFactory getOrderRequestFactory() {
        return new GetOrderRequestFactory(AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule), NetworkModule_ProvidesRequestBuilderFactory.providesRequestBuilder(this.networkModule));
    }

    private void initialize(AppModule appModule2, CoroutinesModule coroutinesModule2, DeviceModule deviceModule, NetworkModule networkModule2, BillingAgreementsModule billingAgreementsModule, ThreeDSModule threeDSModule2, CheckoutStateModule checkoutStateModule, Context context2) {
        NetworkModule networkModule3 = networkModule2;
        BillingAgreementsModule billingAgreementsModule2 = billingAgreementsModule;
        this.providesDebugConfigManagerProvider = AppModule_ProvidesDebugConfigManagerFactory.create(appModule2);
        this.contextProvider = C17556e.m29429a(context2);
        C19011a<C16708i> b = C17554c.m29427b(NetworkModule_ProvidesGsonFactory.create(networkModule2));
        this.providesGsonProvider = b;
        this.sharedPrefsFundingOptionsDaoProvider = C17554c.m29427b(SharedPrefsFundingOptionsDao_Factory.create(this.contextProvider, b));
        this.sharedPrefsUserDaoProvider = SharedPrefsUserDao_Factory.create(this.contextProvider, this.providesGsonProvider);
        this.providesPyplCheckoutUtilsProvider = AppModule_ProvidesPyplCheckoutUtilsFactory.create(appModule2);
        AppModule_ProvidesMainLooperFactory create = AppModule_ProvidesMainLooperFactory.create(appModule2);
        this.providesMainLooperProvider = create;
        this.providesMainHandlerProvider = AppModule_ProvidesMainHandlerFactory.create(appModule2, create);
        C19011a<C20009t> b2 = C17554c.m29427b(NetworkModule_ProvidesOkHttpClientFactory.create(networkModule2));
        this.providesOkHttpClientProvider = b2;
        this.elmoApiProvider = ElmoApi_Factory.create(b2);
        CoroutinesModule_ProvidesIODispatcherFactory create2 = CoroutinesModule_ProvidesIODispatcherFactory.create(coroutinesModule2);
        this.providesIODispatcherProvider = create2;
        Elmo_Factory create3 = Elmo_Factory.create(this.contextProvider, this.elmoApiProvider, create2);
        this.elmoProvider = create3;
        this.abManagerProvider = C17554c.m29427b(AbManager_Factory.create(create3, this.providesDebugConfigManagerProvider));
        AppModule_ProvidesEventsFactory create4 = AppModule_ProvidesEventsFactory.create(appModule2);
        this.providesEventsProvider = create4;
        ApprovePaymentCallback_Factory create5 = ApprovePaymentCallback_Factory.create(this.providesDebugConfigManagerProvider, this.providesPyplCheckoutUtilsProvider, this.providesMainHandlerProvider, this.abManagerProvider, create4);
        this.approvePaymentCallbackProvider = create5;
        this.updateCurrencyConversionCallbackProvider = UpdateCurrencyConversionCallback_Factory.create(create5, this.providesGsonProvider, this.abManagerProvider, this.providesEventsProvider);
        this.repositoryProvider = C17554c.m29427b(Repository_Factory.create(UserCheckoutResponse_Factory.create(), this.providesDebugConfigManagerProvider, this.sharedPrefsFundingOptionsDaoProvider, this.sharedPrefsUserDaoProvider, this.approvePaymentCallbackProvider, this.updateCurrencyConversionCallbackProvider));
        ThreeDSModule_ProvidesThreeDS20InfoFactory create6 = ThreeDSModule_ProvidesThreeDS20InfoFactory.create(threeDSModule2);
        this.providesThreeDS20InfoProvider = create6;
        this.providesThreeDS20Provider = ThreeDSModule_ProvidesThreeDS20Factory.create(threeDSModule2, create6);
        this.providesThreeDsDecisionFlowInfoProvider = ThreeDSModule_ProvidesThreeDsDecisionFlowInfoFactory.create(threeDSModule2);
        CoroutinesModule_ProvidesMainCoroutineContextChildFactory create7 = CoroutinesModule_ProvidesMainCoroutineContextChildFactory.create(coroutinesModule2);
        this.providesMainCoroutineContextChildProvider = create7;
        this.threeDSDecisionFlowProvider = C17554c.m29427b(ThreeDSDecisionFlow_Factory.create(this.providesEventsProvider, this.repositoryProvider, this.providesDebugConfigManagerProvider, this.contextProvider, this.providesThreeDS20Provider, this.providesThreeDsDecisionFlowInfoProvider, create7));
        this.eligibilityManagerProvider = EligibilityManager_Factory.create(this.providesEventsProvider, this.providesPyplCheckoutUtilsProvider, this.providesDebugConfigManagerProvider, this.abManagerProvider, this.repositoryProvider);
        NetworkModule_ProvidesGsonBuilderFactory create8 = NetworkModule_ProvidesGsonBuilderFactory.create(networkModule2);
        this.providesGsonBuilderProvider = create8;
        this.patchOrderRequestFactoryProvider = PatchOrderRequestFactory_Factory.create(create8);
        CoroutinesModule_ProvidesDefaultDispatcherFactory create9 = CoroutinesModule_ProvidesDefaultDispatcherFactory.create(coroutinesModule2);
        this.providesDefaultDispatcherProvider = create9;
        UpgradeLsatTokenAction_Factory create10 = UpgradeLsatTokenAction_Factory.create(this.repositoryProvider, create9);
        this.upgradeLsatTokenActionProvider = create10;
        PatchOrderAction_Factory create11 = PatchOrderAction_Factory.create(this.patchOrderRequestFactoryProvider, create10, this.providesOkHttpClientProvider, this.providesGsonProvider, this.providesIODispatcherProvider);
        this.patchOrderActionProvider = create11;
        PatchAction_Factory create12 = PatchAction_Factory.create(create11, this.providesEventsProvider, this.providesMainCoroutineContextChildProvider);
        this.patchActionProvider = create12;
        this.shippingCallbackHandlerProvider = C17554c.m29427b(ShippingCallbackHandler_Factory.create(this.providesDebugConfigManagerProvider, this.providesEventsProvider, this.repositoryProvider, create12));
        this.postAuthSuccessHandlerProvider = PostAuthSuccessHandler_Factory.create(this.providesDebugConfigManagerProvider, this.repositoryProvider, this.providesPyplCheckoutUtilsProvider, this.providesEventsProvider);
        this.native3pEligibilityCheckProvider = C17554c.m29427b(Native3pEligibilityCheck_Factory.create(this.abManagerProvider));
        C17216x57420088 create13 = C17216x57420088.create(appModule2);
        this.providesIs1P$pyplcheckout_externalThreedsReleaseProvider = create13;
        this.nativePayWithCryptoCheckProvider = C17554c.m29427b(NativePayWithCryptoCheck_Factory.create(this.abManagerProvider, create13));
        CoroutinesModule_ProvidesSupervisorIODispatcherFactory create14 = CoroutinesModule_ProvidesSupervisorIODispatcherFactory.create(coroutinesModule2);
        this.providesSupervisorIODispatcherProvider = create14;
        this.threeDSUseCaseProvider = C17554c.m29427b(ThreeDSUseCase_Factory.create(this.providesEventsProvider, create14, this.threeDSDecisionFlowProvider, this.repositoryProvider));
        CheckoutStateModule_ProvidesCheckoutStateDaoFactory create15 = CheckoutStateModule_ProvidesCheckoutStateDaoFactory.create(checkoutStateModule);
        this.providesCheckoutStateDaoProvider = create15;
        C19011a<CheckoutStateRepository> b3 = C17554c.m29427b(CheckoutStateModule_ProvidesCheckoutStateRepositoryFactory.create(checkoutStateModule, create15, this.providesSupervisorIODispatcherProvider));
        this.providesCheckoutStateRepositoryProvider = b3;
        this.setCheckoutStateUseCaseProvider = SetCheckoutStateUseCase_Factory.create(b3);
        this.foundationRiskConfigProvider = FoundationRiskConfig_Factory.create(this.contextProvider);
        C19011a<MerchantConfigDaoImpl> b4 = C17554c.m29427b(MerchantConfigDaoImpl_Factory.create());
        this.merchantConfigDaoImplProvider = b4;
        this.merchantConfigRepositoryProvider = C17554c.m29427b(MerchantConfigRepository_Factory.create(b4));
        this.thirdPartyAuthPresenterProvider = C17554c.m29427b(ThirdPartyAuthPresenter_Factory.create());
        C19011a<ThirdPartyTrackingDelegate> b5 = C17554c.m29427b(ThirdPartyTrackingDelegate_Factory.create());
        this.thirdPartyTrackingDelegateProvider = b5;
        C19011a<PartnerAuthenticationProviderFactory> b6 = C17554c.m29427b(PartnerAuthenticationProviderFactory_Factory.create(this.providesDebugConfigManagerProvider, this.foundationRiskConfigProvider, this.thirdPartyAuthPresenterProvider, b5));
        this.partnerAuthenticationProviderFactoryProvider = b6;
        this.nativeAuthAccessTokenUseCaseProvider = NativeAuthAccessTokenUseCase_Factory.create(b6, this.thirdPartyAuthPresenterProvider);
        this.upgradeAuthAccessTokenUseCaseProvider = UpgradeAuthAccessTokenUseCase_Factory.create(this.providesDebugConfigManagerProvider, this.partnerAuthenticationProviderFactoryProvider);
        this.webBasedAuthAccessTokenUseCaseProvider = WebBasedAuthAccessTokenUseCase_Factory.create(this.providesDebugConfigManagerProvider, this.foundationRiskConfigProvider);
        this.logoutUseCaseProvider = LogoutUseCase_Factory.create(this.partnerAuthenticationProviderFactoryProvider);
        C19011a<ClientIdRepository> b7 = C17554c.m29427b(ClientIdRepository_Factory.create());
        this.clientIdRepositoryProvider = b7;
        GetCachedClientIdUseCase_Factory create16 = GetCachedClientIdUseCase_Factory.create(b7);
        this.getCachedClientIdUseCaseProvider = create16;
        ThirdPartyAuth_Factory create17 = ThirdPartyAuth_Factory.create(this.providesDebugConfigManagerProvider, this.foundationRiskConfigProvider, this.abManagerProvider, this.merchantConfigRepositoryProvider, this.nativeAuthAccessTokenUseCaseProvider, this.upgradeAuthAccessTokenUseCaseProvider, this.webBasedAuthAccessTokenUseCaseProvider, this.logoutUseCaseProvider, create16);
        this.thirdPartyAuthProvider = create17;
        this.authRepositoryProvider = C17554c.m29427b(AuthRepository_Factory.create(create17, this.providesIs1P$pyplcheckout_externalThreedsReleaseProvider));
        this.providesRequestBuilderProvider = NetworkModule_ProvidesRequestBuilderFactory.create(networkModule2);
        this.providesOkHttpClientBuilderProvider = NetworkModule_ProvidesOkHttpClientBuilderFactory.create(networkModule2);
        NetworkModule_ProvideNetworkRetryInterceptorFactory create18 = NetworkModule_ProvideNetworkRetryInterceptorFactory.create(networkModule2);
        this.provideNetworkRetryInterceptorProvider = create18;
        this.providesOkHttpClientFactoryProvider = NetworkModule_ProvidesOkHttpClientFactoryFactory.create(networkModule3, this.providesOkHttpClientBuilderProvider, create18, this.providesDebugConfigManagerProvider);
        NetworkModule_ProvideAccessTokenInterceptorFactory create19 = NetworkModule_ProvideAccessTokenInterceptorFactory.create(networkModule3, this.authRepositoryProvider);
        this.provideAccessTokenInterceptorProvider = create19;
        this.providesAuthenticatedOkHttpClientProvider = C17554c.m29427b(NetworkModule_ProvidesAuthenticatedOkHttpClientFactory.create(networkModule3, this.providesOkHttpClientFactoryProvider, create19));
        DeviceModule_ProvidesDeviceLocaleFactory create20 = DeviceModule_ProvidesDeviceLocaleFactory.create(deviceModule);
        this.providesDeviceLocaleProvider = create20;
        LocaleMetadataApi_Factory create21 = LocaleMetadataApi_Factory.create(this.providesRequestBuilderProvider, this.providesIODispatcherProvider, this.providesAuthenticatedOkHttpClientProvider, create20);
        this.localeMetadataApiProvider = create21;
        this.addressRepositoryProvider = C17554c.m29427b(AddressRepository_Factory.create(this.providesEventsProvider, this.repositoryProvider, create21));
        AuthHandlerProvider_Factory create22 = AuthHandlerProvider_Factory.create(this.repositoryProvider, this.authRepositoryProvider, this.providesPyplCheckoutUtilsProvider);
        this.authHandlerProvider = create22;
        this.mainPaysheetViewModelProvider = MainPaysheetViewModel_Factory.create(this.repositoryProvider, this.abManagerProvider, this.threeDSDecisionFlowProvider, this.providesEventsProvider, this.providesPyplCheckoutUtilsProvider, this.eligibilityManagerProvider, this.shippingCallbackHandlerProvider, this.postAuthSuccessHandlerProvider, this.native3pEligibilityCheckProvider, this.nativePayWithCryptoCheckProvider, this.threeDSUseCaseProvider, this.setCheckoutStateUseCaseProvider, this.authRepositoryProvider, this.addressRepositoryProvider, create22);
        BillingAgreementsModule billingAgreementsModule3 = billingAgreementsModule;
        BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory create23 = BillingAgreementsModule_ProvidesBillingAgreementsDaoFactory.create(billingAgreementsModule3, this.contextProvider);
        this.providesBillingAgreementsDaoProvider = create23;
        C19011a<BillingAgreementsRepository> b8 = C17554c.m29427b(C17197x5c872b9d.create(billingAgreementsModule3, create23, this.providesSupervisorIODispatcherProvider));
        this.providesBillingAgreementsRepositoryProvider = b8;
        BillingAgreementsGetTypeUseCase_Factory create24 = BillingAgreementsGetTypeUseCase_Factory.create(b8);
        this.billingAgreementsGetTypeUseCaseProvider = create24;
        this.availableBalanceViewModelProvider = AvailableBalanceViewModel_Factory.create(this.repositoryProvider, this.providesEventsProvider, create24);
        this.getAddCardEnabledUseCaseProvider = C17554c.m29427b(GetAddCardEnabledUseCase_Factory.create(this.abManagerProvider, this.providesDebugConfigManagerProvider));
        this.startAddCardThreeDsUseCaseProvider = StartAddCardThreeDsUseCase_Factory.create(this.repositoryProvider, this.threeDSUseCaseProvider, this.providesSupervisorIODispatcherProvider);
        ClearAccessTokenUseCase_Factory create25 = ClearAccessTokenUseCase_Factory.create(this.partnerAuthenticationProviderFactoryProvider);
        this.clearAccessTokenUseCaseProvider = create25;
        AddCardUseCase_Factory create26 = AddCardUseCase_Factory.create(this.repositoryProvider, create25);
        this.addCardUseCaseProvider = create26;
        this.addCardViewModelProvider = AddCardViewModel_Factory.create(this.repositoryProvider, this.contextProvider, this.providesEventsProvider, this.providesGsonProvider, this.getAddCardEnabledUseCaseProvider, this.startAddCardThreeDsUseCaseProvider, create26, this.providesPyplCheckoutUtilsProvider, this.providesDebugConfigManagerProvider);
        this.addressAutoCompleteViewModelProvider = AddressAutoCompleteViewModel_Factory.create(this.repositoryProvider, this.abManagerProvider, this.providesEventsProvider, this.providesGsonProvider, this.providesDebugConfigManagerProvider);
        C19011a<CryptoRepository> b9 = C17554c.m29427b(CryptoRepository_Factory.create(this.repositoryProvider));
        this.cryptoRepositoryProvider = b9;
        this.fundingOptionsViewModelProvider = FundingOptionsViewModel_Factory.create(this.providesEventsProvider, this.repositoryProvider, b9);
        this.userViewModelProvider = UserViewModel_Factory.create(this.providesEventsProvider, this.repositoryProvider, this.providesPyplCheckoutUtilsProvider);
        this.cartViewModelProvider = CartViewModel_Factory.create(this.repositoryProvider, this.billingAgreementsGetTypeUseCaseProvider, this.abManagerProvider, this.providesDebugConfigManagerProvider);
        this.billingAgreementsGetBalancePrefUseCaseProvider = BillingAgreementsGetBalancePrefUseCase_Factory.create(this.providesSupervisorIODispatcherProvider, this.providesBillingAgreementsRepositoryProvider, this.repositoryProvider, this.billingAgreementsGetTypeUseCaseProvider);
        this.billingAgreementsSetBalancePrefUseCaseProvider = BillingAgreementsSetBalancePrefUseCase_Factory.create(this.providesBillingAgreementsRepositoryProvider);
        this.billingAgreementsCacheTypeUseCaseProvider = BillingAgreementsCacheTypeUseCase_Factory.create(this.providesBillingAgreementsRepositoryProvider);
        this.getSelectedFundingOptionUseCaseProvider = C17554c.m29427b(GetSelectedFundingOptionUseCase_Factory.create(this.providesEventsProvider, this.repositoryProvider, this.providesSupervisorIODispatcherProvider, this.getAddCardEnabledUseCaseProvider));
        C19011a<GetUserUseCase> b10 = C17554c.m29427b(GetUserUseCase_Factory.create(this.repositoryProvider, this.providesEventsProvider, this.providesSupervisorIODispatcherProvider));
        this.getUserUseCaseProvider = b10;
        C19011a<GetUserCountryUseCase> b11 = C17554c.m29427b(GetUserCountryUseCase_Factory.create(b10, this.providesSupervisorIODispatcherProvider));
        this.getUserCountryUseCaseProvider = b11;
        this.billingAgreementsViewModelProvider = BillingAgreementsViewModel_Factory.create(this.providesEventsProvider, this.repositoryProvider, this.billingAgreementsGetBalancePrefUseCaseProvider, this.billingAgreementsSetBalancePrefUseCaseProvider, this.billingAgreementsCacheTypeUseCaseProvider, this.billingAgreementsGetTypeUseCaseProvider, this.getSelectedFundingOptionUseCaseProvider, b11, this.providesPyplCheckoutUtilsProvider, this.providesBillingAgreementsRepositoryProvider);
        CryptoQuoteTimer_Factory create27 = CryptoQuoteTimer_Factory.create(this.repositoryProvider, this.cryptoRepositoryProvider, this.providesEventsProvider);
        this.cryptoQuoteTimerProvider = create27;
        this.cryptoViewModelProvider = CryptoViewModel_Factory.create(this.repositoryProvider, this.cryptoRepositoryProvider, this.providesEventsProvider, create27, this.getSelectedFundingOptionUseCaseProvider);
        this.getMerchantConfigUseCaseProvider = GetMerchantConfigUseCase_Factory.create(this.merchantConfigRepositoryProvider);
        GetCheckoutStateUseCase_Factory create28 = GetCheckoutStateUseCase_Factory.create(this.providesCheckoutStateRepositoryProvider);
        this.getCheckoutStateUseCaseProvider = create28;
        this.cancelViewModelProvider = CancelViewModel_Factory.create(this.getMerchantConfigUseCaseProvider, create28, this.providesIs1P$pyplcheckout_externalThreedsReleaseProvider);
        this.addShippingUseCaseProvider = AddShippingUseCase_Factory.create(this.addressRepositoryProvider);
        ValidateAddressUseCase_Factory create29 = ValidateAddressUseCase_Factory.create(this.addressRepositoryProvider);
        this.validateAddressUseCaseProvider = create29;
        ValidateAndAddAddressUseCase_Factory create30 = ValidateAndAddAddressUseCase_Factory.create(this.addShippingUseCaseProvider, create29, this.abManagerProvider);
        this.validateAndAddAddressUseCaseProvider = create30;
        this.addressReviewViewModelProvider = AddressReviewViewModel_Factory.create(create30);
        this.retrieveInputAddressUseCaseProvider = RetrieveInputAddressUseCase_Factory.create(this.addressRepositoryProvider);
        RetrieveValidatedAddressUseCase_Factory create31 = RetrieveValidatedAddressUseCase_Factory.create(this.addressRepositoryProvider);
        this.retrieveValidatedAddressUseCaseProvider = create31;
        this.addressRecommendationViewModelProvider = AddressRecommendationViewModel_Factory.create(this.retrieveInputAddressUseCaseProvider, create31, this.addShippingUseCaseProvider);
        AppModule_ProvidesBuildVersionFactory create32 = AppModule_ProvidesBuildVersionFactory.create(appModule2);
        this.providesBuildVersionProvider = create32;
        this.connectivityHandlerProvider = C17554c.m29427b(ConnectivityHandler_Factory.create(this.contextProvider, this.providesEventsProvider, create32));
        this.f37734xbc4f8540 = C17554c.m29427b(C17215x7ea269c9.create(appModule2));
    }

    private void initialize2(AppModule appModule2, CoroutinesModule coroutinesModule2, DeviceModule deviceModule, NetworkModule networkModule2, BillingAgreementsModule billingAgreementsModule, ThreeDSModule threeDSModule2, CheckoutStateModule checkoutStateModule, Context context2) {
        C17217x441ea270 create = C17217x441ea270.create(appModule2);
        this.providesIsDebug$pyplcheckout_externalThreedsReleaseProvider = create;
        AmplitudeUtils_Factory create2 = AmplitudeUtils_Factory.create(this.contextProvider, this.providesIs1P$pyplcheckout_externalThreedsReleaseProvider, create);
        this.amplitudeUtilsProvider = create2;
        this.f37732xee563a57 = C17554c.m29427b(C17213x276fd952.create(appModule2, this.providesDebugConfigManagerProvider, create2, this.contextProvider));
        SharedPrefAmplitudeDao_Factory create3 = SharedPrefAmplitudeDao_Factory.create(this.contextProvider, this.providesGsonProvider);
        this.sharedPrefAmplitudeDaoProvider = create3;
        this.provideAmplitudeDao$pyplcheckout_externalThreedsReleaseProvider = C17554c.m29427b(create3);
        C19011a<DeviceInfo> b = C17554c.m29427b(DeviceInfo_Factory.create(this.repositoryProvider, this.contextProvider));
        this.deviceInfoProvider = b;
        C19011a<AmplitudeApi> b2 = C17554c.m29427b(AmplitudeApi_Factory.create(this.amplitudeUtilsProvider, this.providesOkHttpClientProvider, this.providesGsonProvider, b));
        this.amplitudeApiProvider = b2;
        C19011a<AmplitudeRepository> b3 = C17554c.m29427b(AmplitudeRepository_Factory.create(this.provideAmplitudeDao$pyplcheckout_externalThreedsReleaseProvider, b2));
        this.amplitudeRepositoryProvider = b3;
        this.amplitudeServiceProvider = AmplitudeService_Factory.create(b3, this.providesSupervisorIODispatcherProvider, this.contextProvider, this.deviceInfoProvider, this.connectivityHandlerProvider);
        C19011a<FeatureFlagManager> b4 = C17554c.m29427b(C17214x3e3e4966.create(appModule2));
        this.f37733x572e043 = b4;
        this.amplitudeManagerProvider = C17554c.m29427b(AmplitudeManager_Factory.create(this.f37732xee563a57, this.amplitudeServiceProvider, b4));
    }

    private BaseCallback injectBaseCallback(BaseCallback baseCallback) {
        BaseCallback_MembersInjector.injectAbManager(baseCallback, this.abManagerProvider.get());
        BaseCallback_MembersInjector.injectEvents(baseCallback, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        return baseCallback;
    }

    private BaseFragment injectBaseFragment(BaseFragment baseFragment) {
        BaseFragment_MembersInjector.injectEvents(baseFragment, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        return baseFragment;
    }

    private HomeFragment injectHomeFragment(HomeFragment homeFragment) {
        BaseFragment_MembersInjector.injectEvents(homeFragment, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        HomeFragment_MembersInjector.injectFactory(homeFragment, customViewModelFactory());
        HomeFragment_MembersInjector.injectShippingCallbackHandler(homeFragment, this.shippingCallbackHandlerProvider.get());
        return homeFragment;
    }

    private NativeAuthParentFragment injectNativeAuthParentFragment(NativeAuthParentFragment nativeAuthParentFragment) {
        BaseFragment_MembersInjector.injectEvents(nativeAuthParentFragment, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        NativeAuthParentFragment_MembersInjector.injectThirdPartyAuthPresenter(nativeAuthParentFragment, this.thirdPartyAuthPresenterProvider.get());
        return nativeAuthParentFragment;
    }

    private PYPLAddressRecommendationFragment injectPYPLAddressRecommendationFragment(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment) {
        BaseFragment_MembersInjector.injectEvents(pYPLAddressRecommendationFragment, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        PYPLAddressRecommendationFragment_MembersInjector.injectFactory(pYPLAddressRecommendationFragment, customViewModelFactory());
        return pYPLAddressRecommendationFragment;
    }

    private PYPLHomeActivity injectPYPLHomeActivity(PYPLHomeActivity pYPLHomeActivity) {
        PYPLHomeActivity_MembersInjector.injectFactory(pYPLHomeActivity, customViewModelFactory());
        PYPLHomeActivity_MembersInjector.injectDebugConfigManager(pYPLHomeActivity, AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule));
        PYPLHomeActivity_MembersInjector.injectEvents(pYPLHomeActivity, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        PYPLHomeActivity_MembersInjector.injectThirdPartyAuthPresenter(pYPLHomeActivity, this.thirdPartyAuthPresenterProvider.get());
        return pYPLHomeActivity;
    }

    private PYPLInitiateCheckoutActivity injectPYPLInitiateCheckoutActivity(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity) {
        PYPLInitiateCheckoutActivity_MembersInjector.injectDebugConfigManager(pYPLInitiateCheckoutActivity, AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule));
        PYPLInitiateCheckoutActivity_MembersInjector.injectEvents(pYPLInitiateCheckoutActivity, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        PYPLInitiateCheckoutActivity_MembersInjector.injectAbManager(pYPLInitiateCheckoutActivity, this.abManagerProvider.get());
        return pYPLInitiateCheckoutActivity;
    }

    private PYPLNewShippingAddressReviewFragment injectPYPLNewShippingAddressReviewFragment(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment) {
        BaseFragment_MembersInjector.injectEvents(pYPLNewShippingAddressReviewFragment, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        PYPLNewShippingAddressReviewFragment_MembersInjector.injectFactory(pYPLNewShippingAddressReviewFragment, customViewModelFactory());
        return pYPLNewShippingAddressReviewFragment;
    }

    private ThreeDS20Activity injectThreeDS20Activity(ThreeDS20Activity threeDS20Activity) {
        ThreeDS20Activity_MembersInjector.injectThreeDS20(threeDS20Activity, threeDS20());
        ThreeDS20Activity_MembersInjector.injectEvents(threeDS20Activity, AppModule_ProvidesEventsFactory.providesEvents(this.appModule));
        return threeDS20Activity;
    }

    private LsatTokenRequestFactory lsatTokenRequestFactory() {
        return new LsatTokenRequestFactory(AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule));
    }

    private Map<Class<? extends C2866i0>, C19011a<C2866i0>> mapOfClassOfAndProviderOfViewModel() {
        LinkedHashMap y0 = C0761x.m1755y0(12);
        y0.put(MainPaysheetViewModel.class, this.mainPaysheetViewModelProvider);
        y0.put(AvailableBalanceViewModel.class, this.availableBalanceViewModelProvider);
        y0.put(AddCardViewModel.class, this.addCardViewModelProvider);
        y0.put(AddressAutoCompleteViewModel.class, this.addressAutoCompleteViewModelProvider);
        y0.put(FundingOptionsViewModel.class, this.fundingOptionsViewModelProvider);
        y0.put(UserViewModel.class, this.userViewModelProvider);
        y0.put(CartViewModel.class, this.cartViewModelProvider);
        y0.put(BillingAgreementsViewModel.class, this.billingAgreementsViewModelProvider);
        y0.put(CryptoViewModel.class, this.cryptoViewModelProvider);
        y0.put(CancelViewModel.class, this.cancelViewModelProvider);
        y0.put(AddressReviewViewModel.class, this.addressReviewViewModelProvider);
        y0.put(AddressRecommendationViewModel.class, this.addressRecommendationViewModelProvider);
        return y0.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y0);
    }

    private OrderActions orderActions() {
        return new OrderActions(captureOrderAction(), authorizeOrderAction(), patchAction(), executeBillingAgreementActionImpl(), getOrderAction(), CoroutinesModule_ProvidesMainCoroutineContextChildFactory.providesMainCoroutineContextChild(this.coroutinesModule));
    }

    private PatchAction patchAction() {
        return new PatchAction(patchOrderAction(), AppModule_ProvidesEventsFactory.providesEvents(this.appModule), CoroutinesModule_ProvidesMainCoroutineContextChildFactory.providesMainCoroutineContextChild(this.coroutinesModule));
    }

    private PatchOrderAction patchOrderAction() {
        return new PatchOrderAction(patchOrderRequestFactory(), upgradeLsatTokenAction(), this.providesOkHttpClientProvider.get(), this.providesGsonProvider.get(), CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule));
    }

    private PatchOrderRequestFactory patchOrderRequestFactory() {
        return new PatchOrderRequestFactory(NetworkModule_ProvidesGsonBuilderFactory.providesGsonBuilder(this.networkModule));
    }

    private ThreeDS20 threeDS20() {
        ThreeDSModule threeDSModule2 = this.threeDSModule;
        return ThreeDSModule_ProvidesThreeDS20Factory.providesThreeDS20(threeDSModule2, ThreeDSModule_ProvidesThreeDS20InfoFactory.providesThreeDS20Info(threeDSModule2));
    }

    private UpdateOrderStatusAction updateOrderStatusAction() {
        return new UpdateOrderStatusAction(new UpdateOrderStatusRequestFactory(), upgradeLsatTokenAction(), AppModule_ProvidesDebugConfigManagerFactory.providesDebugConfigManager(this.appModule), this.providesOkHttpClientProvider.get(), this.providesGsonProvider.get(), CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher(this.coroutinesModule));
    }

    private UpgradeLsatTokenAction upgradeLsatTokenAction() {
        return new UpgradeLsatTokenAction(this.repositoryProvider.get(), CoroutinesModule_ProvidesDefaultDispatcherFactory.providesDefaultDispatcher(this.coroutinesModule));
    }

    public AmplitudeManager getAmplitudeManager() {
        return this.amplitudeManagerProvider.get();
    }

    public AuthRepository getAuthRepository() {
        return this.authRepositoryProvider.get();
    }

    public BillingAgreementsGetBalancePrefUseCase getBillingAgreementsGetBalancePrefUseCase() {
        return new BillingAgreementsGetBalancePrefUseCase(CoroutinesModule_ProvidesSupervisorIODispatcherFactory.providesSupervisorIODispatcher(this.coroutinesModule), this.providesBillingAgreementsRepositoryProvider.get(), this.repositoryProvider.get(), billingAgreementsGetTypeUseCase());
    }

    public BillingAgreementsRepository getBillingAgreementsRepository() {
        return this.providesBillingAgreementsRepositoryProvider.get();
    }

    public BuildValidator getBuildValidator() {
        return AppModule_ProvidesBuildValidatorFactory.providesBuildValidator(this.appModule);
    }

    public AndroidSDKVersionProvider getBuildVersionProvider() {
        return AppModule_ProvidesBuildVersionFactory.providesBuildVersion(this.appModule);
    }

    public CheckoutCache getCache() {
        return new CheckoutCache(checkoutDataStore());
    }

    public CacheConfigManager getCacheConfigManager() {
        return new CacheConfigManager(getCache());
    }

    public CacheClientIdUseCase getCacheUseCase() {
        return new CacheClientIdUseCase(this.clientIdRepositoryProvider.get());
    }

    public CheckoutStateRepository getCheckoutStateRepository() {
        return this.providesCheckoutStateRepositoryProvider.get();
    }

    public ConnectivityHandler getConnectivityHandler() {
        return this.connectivityHandlerProvider.get();
    }

    public CreateOrderActions getCreateOrderActions() {
        return new CreateOrderActions(CoroutinesModule_ProvidesMainCoroutineContextChildFactory.providesMainCoroutineContextChild(this.coroutinesModule), createOrderAction(), baTokenToEcTokenAction(), this.repositoryProvider.get());
    }

    public CryptoRepository getCryptoRepo() {
        return this.cryptoRepositoryProvider.get();
    }

    public GetCheckoutStateUseCase getGetCheckoutStateUseCase() {
        return new GetCheckoutStateUseCase(this.providesCheckoutStateRepositoryProvider.get());
    }

    public GetLocaleMetadataUseCase getGetLocaleMetadataUseCase() {
        return new GetLocaleMetadataUseCase(this.addressRepositoryProvider.get());
    }

    public InstrumentationSession getInstrumentationSession() {
        return this.f37734xbc4f8540.get();
    }

    public MerchantActions getMerchantActions() {
        return new MerchantActions(approval());
    }

    public MerchantConfigRepository getMerchantConfigRepository() {
        return this.merchantConfigRepositoryProvider.get();
    }

    public Repository getRepository() {
        return this.repositoryProvider.get();
    }

    public RetrieveFundingEligibilityAction getRetrieveFundingEligibilityAction() {
        return new RetrieveFundingEligibilityAction(fundingEligibilityRequestFactory(), this.providesOkHttpClientProvider.get(), CoroutinesModule_ProvidesIODispatcherFactory.providesIODispatcher(this.coroutinesModule));
    }

    public SetCheckoutStateUseCase getSetCheckoutStateUseCase() {
        return new SetCheckoutStateUseCase(this.providesCheckoutStateRepositoryProvider.get());
    }

    public C2870k0.C2872b getViewModelProviderFactory() {
        return customViewModelFactory();
    }

    public void inject(PYPLHomeActivity pYPLHomeActivity) {
        injectPYPLHomeActivity(pYPLHomeActivity);
    }

    public void inject(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity) {
        injectPYPLInitiateCheckoutActivity(pYPLInitiateCheckoutActivity);
    }

    public void inject(BaseFragment baseFragment) {
        injectBaseFragment(baseFragment);
    }

    public void inject(HomeFragment homeFragment) {
        injectHomeFragment(homeFragment);
    }

    public void inject(NativeAuthParentFragment nativeAuthParentFragment) {
        injectNativeAuthParentFragment(nativeAuthParentFragment);
    }

    public void inject(ThreeDS20Activity threeDS20Activity) {
        injectThreeDS20Activity(threeDS20Activity);
    }

    public void inject(BaseCallback baseCallback) {
        injectBaseCallback(baseCallback);
    }

    public void inject(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment) {
        injectPYPLNewShippingAddressReviewFragment(pYPLNewShippingAddressReviewFragment);
    }

    public void inject(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment) {
        injectPYPLAddressRecommendationFragment(pYPLAddressRecommendationFragment);
    }
}
