package com.paypal.pyplcheckout.model;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.compose.animation.C0388a;
import androidx.room.C3229f;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.cancel.OnCancel;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;
import com.paypal.checkout.createorder.UserActionKt;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.error.OnError;
import com.paypal.checkout.fundingeligibility.FundingEligibilityResponse;
import com.paypal.checkout.order.Order;
import com.paypal.checkout.paymentbutton.PaymentButtonFundingType;
import com.paypal.checkout.shipping.OnShippingChange;
import com.paypal.pyplcheckout.addcard.UpgradeAccessToken;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressReviewViewListenerImpl;
import com.paypal.pyplcheckout.addressbook.model.NewShippingAddressViewListenerImpl;
import com.paypal.pyplcheckout.auth.NativeCheckoutWebSSO;
import com.paypal.pyplcheckout.auth.UserAuthentication;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewListenerImpl;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.model.HomeViewListenerImpl;
import com.paypal.pyplcheckout.home.view.BaseActivity;
import com.paypal.pyplcheckout.info.model.PayPalTransactionHeaderViewListenerImpl;
import com.paypal.pyplcheckout.interfaces.PayPalCheckoutCompleteListener;
import com.paypal.pyplcheckout.interfaces.SDKInterceptor;
import com.paypal.pyplcheckout.merchantIntegration.ShippingCallbacks;
import com.paypal.pyplcheckout.navigation.ContentPage;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.BillingAddressRequest;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.providerIntegration.ExtendedCheckoutConfig;
import com.paypal.pyplcheckout.sca.StrongCustomerAuthStepUp;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.shippingmethods.model.ShippingMethodsViewListenerImpl;
import com.paypal.pyplcheckout.threeds.model.PayPalThreeDSV1ViewListenerImpl;
import com.paypal.pyplcheckout.userprofile.model.UserProfileViewListenerImpl;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p156k.C7168e;
import p306z8.C8481h;
import p562ep.C17733a;

public class DebugConfigManager {
    private static final String TAG = "DebugConfigManager";
    private static DebugConfigManager instance;
    private ContentPage addressBookContentPage = null;
    private AddressBookViewListenerImpl addressBookContentPageListener = null;
    private ContentPage billingAgreementsTermsContentPage = null;
    private String buyerLanguage = null;
    private BaseActivity checkoutBaseActivity = null;
    private CheckoutEnvironment checkoutEnvironment = new CheckoutEnvironment();
    private String clientId;
    private ContentRouter contentRouter;
    private ContentPage cryptoConsentViewContentPage = null;
    private CryptoConsentViewListenerImpl cryptoConsentViewListener = null;
    private CurrencyCode currencyCode = null;
    private ContentPage currencyConversionContentPage = null;
    private ConversionRateViewListenerImpl currencyConversionContentPageListener = null;
    private boolean didCustomTabOpen = false;
    private boolean didPYPLActivityPause = false;
    private boolean didReturnFromWeb = false;
    private String domain = null;
    private List<String> enableFundingOptions = new ArrayList();
    private List<String> enabledElmoAbExperiment = Collections.emptyList();
    private String facilitatorClientId = null;
    private String firebaseSessionId;
    private FundingEligibilityResponse fundingEligibilityResponse;
    private ContentPage homeContentPage = null;
    private HomeViewListenerImpl homeContentPageListener = null;
    private Map<String, String> initParams = new HashMap();
    private boolean isABConfigurationRequested = false;
    private boolean isCCTReturn = false;
    private boolean isCheckoutJSSession = false;
    private Boolean isDebug = null;
    private boolean isFallBack = false;
    private boolean isNativeAddCardEnabled = false;
    private boolean isOnboardingComplete = false;
    private boolean isShippingCallbackEnabled;
    private boolean isSmartPaymentCheckout = false;
    private boolean isSmartPaymentPopupCheckout = false;
    private String loadingText;
    private String merchantCartUrl = null;
    private String merchantRedirectURL = null;
    private HashMap<String, String> merchantURLQueryParams = new HashMap<>();
    private String merchantURLScheme = null;
    private WebView merchantWebView = null;
    private NativeCheckoutWebSSO nativeCheckoutWebSSO = null;
    private ContentPage newShippingAddressContentPage = null;
    private NewShippingAddressViewListenerImpl newShippingAddressContentPageListener = null;
    private ContentPage newShippingAddressReviewContentPage = null;
    private NewShippingAddressReviewViewListenerImpl newShippingAddressReviewViewListener = null;
    private OnApprove onApprove;
    private OnCancel onCancel;
    private OnError onError;
    private OnShippingChange onShippingChange;
    private String orderAuthorizeUrl = null;
    private String orderCaptureUrl = null;
    private Repository.PayModeEnum payMode = null;
    private PEnums.PayPalChannelInfo payPalChannelInfo = null;
    private PayPalTransactionHeaderViewListenerImpl payPalTransactionDetailsHeaderViewListener = null;
    private PaymentButtonFundingType paymentButtonFundingType;
    private PayPalCheckoutCompleteListener paypalCheckoutCompleteListener = null;
    private SDKInterceptor postApproveSDKIntercept;
    private SDKInterceptor postReviewSDKIntercept;
    private SDKInterceptor preReviewSDKIntercept;
    private String productName;
    private UserAuthentication providerAuth = null;
    private Context providerContext = null;
    private ContentPage rateProtectionContentPage = null;
    private RateProtectionViewListenerImpl rateProtectionContentPageListener = null;
    private ShippingCallbacks shippingCallbacks = null;
    private ContentPage shippingMethodContentPage = null;
    private ShippingMethodsViewListenerImpl shippingMethodContentPageListener = null;
    private boolean shouldDisableScrimBackground = false;
    private boolean shouldEnableBillingAgreements = false;
    private boolean shouldFailEligibilityCall;
    private boolean shouldFallBackToWeb = true;
    private boolean shouldShowCloseButton = true;
    private boolean shouldShowExitDialogWithRadioButtons = true;
    private boolean shouldTurnOnFallbackExperiment = false;
    private boolean shouldUseBodyContainerPadding = false;
    private StrongCustomerAuthStepUp strongCustomerAuthStepUp = null;
    private ContentPage threeDSContentPage = null;
    private PayPalThreeDSV1ViewListenerImpl threeDSContentPageListener = null;
    private ContentPage transactionDetailsContentPage = null;
    private UserAction userAction = null;
    private ContentPage userProfileContentPage = null;
    private UserProfileViewListenerImpl userProfileContentPageListener = null;

    private DebugConfigManager() {
    }

    private void checkClientIdChanged(String str) {
        String str2 = this.clientId;
        if (str2 != null && !str2.equals(str)) {
            SdkComponent.getInstance().getCacheUseCase().invoke();
        }
    }

    public static synchronized DebugConfigManager getInstance() {
        DebugConfigManager debugConfigManager;
        synchronized (DebugConfigManager.class) {
            if (instance == null) {
                instance = new DebugConfigManager();
            }
            debugConfigManager = instance;
        }
        return debugConfigManager;
    }

    private void setExtendedValues(ExtendedCheckoutConfig extendedCheckoutConfig) {
        setValues(extendedCheckoutConfig);
        setStrongCustomerAuthStepUp(extendedCheckoutConfig.getStrongCustomerAuthStepUp());
        setNativeCheckoutWebSSO(extendedCheckoutConfig.getNativeCheckoutWebSSO());
        setInternalContentPagesConfig(extendedCheckoutConfig);
        setPreReviewSDKIntercept(extendedCheckoutConfig.getPreReviewSDKInterceptor());
        setPostReviewSDKIntercept(extendedCheckoutConfig.getPostReviewSDKIntercept());
        setPostApproveSDKIntercept(extendedCheckoutConfig.getPostApproveSDKInterceptor());
        setShouldFallBackToWeb(extendedCheckoutConfig.shouldFallBackToWeb());
        setShouldShowExitDialogWithRadioButtons(extendedCheckoutConfig.shouldShowExitDialogWithRadioButtons());
        setShouldFailEligibilityCall(extendedCheckoutConfig.shouldFailEligibilityCall());
        setProductName(extendedCheckoutConfig.getProductName());
        setShouldDisableScrimBackground(extendedCheckoutConfig.shouldDisableScrimBackground());
        setShouldEnableBillingAgreements(extendedCheckoutConfig.shouldEnableBillingAgreements());
        if (this.isDebug == null) {
            setIsDebug(Boolean.valueOf(PYPLCheckoutUtils.getInstance().evaluateDebug()));
        }
    }

    private void setInternalContentPagesConfig(ExtendedCheckoutConfig extendedCheckoutConfig) {
        setUserProfileContentPage(extendedCheckoutConfig.getUserProfileContentPage());
        setUserProfileContentPageListener(extendedCheckoutConfig.getUserProfileContentPageListener());
        setAddressBookContentPage(extendedCheckoutConfig.getAddressBookContentPage());
        setAddressBookContentPageListener(extendedCheckoutConfig.getAddressBookContentPageListener());
        setCurrencyConversionContentPage(extendedCheckoutConfig.getCurrencyConversionContentPage());
        setCurrencyConversionContentPageListener(extendedCheckoutConfig.getCurrencyConversionContentPageListener());
        setCryptoConsentViewContentPage(extendedCheckoutConfig.getCryptoConsentContentPage());
        setCryptoConsentViewListener(extendedCheckoutConfig.getCryptoConsentContentPageListener());
        setRateProtectionContentPage(extendedCheckoutConfig.getRateProtectionContentPage());
        setRateProtectionContentPageListener(extendedCheckoutConfig.getRateProtectionContentPageListener());
        setShippingMethodContentPage(extendedCheckoutConfig.getShippingMethodContentPage());
        setShippingMethodContentPageListener(extendedCheckoutConfig.getShippingMethodContentPageListener());
        setHomeContentPage(extendedCheckoutConfig.getHomeContentPage());
        setHomeContentPageListener(extendedCheckoutConfig.getHomeContentPageListener());
        setThreeDSContentPage(extendedCheckoutConfig.getThreeDSContentPage());
        setThreeDSContentPageListener(extendedCheckoutConfig.getThreeDSContentPageListener());
        setBillingAgreementsTermsContentPage(extendedCheckoutConfig.getBillingAgreementTermsContentPage());
    }

    private void setIsDebug(Boolean bool) {
        this.isDebug = bool;
    }

    private void setMerchantRedirectURL(String str) {
        this.merchantRedirectURL = str;
    }

    private void setMerchantURLScheme(String str) {
        this.merchantURLScheme = str;
    }

    private void setNativeCheckoutWebSSO(NativeCheckoutWebSSO nativeCheckoutWebSSO2) {
        this.nativeCheckoutWebSSO = nativeCheckoutWebSSO2;
    }

    private void setPaypalCheckoutCompleteListener(PayPalCheckoutCompleteListener payPalCheckoutCompleteListener) {
        this.paypalCheckoutCompleteListener = payPalCheckoutCompleteListener;
    }

    private void setPostApproveSDKIntercept(SDKInterceptor sDKInterceptor) {
        this.postApproveSDKIntercept = sDKInterceptor;
    }

    private void setPreReviewSDKIntercept(SDKInterceptor sDKInterceptor) {
        this.preReviewSDKIntercept = sDKInterceptor;
    }

    private void setReferrerPackage(Uri uri) {
        SdkComponent.getInstance().getRepository().setReferrerPackage(uri);
    }

    private void setShippingCallbacks(ShippingCallbacks shippingCallbacks2) {
        this.shippingCallbacks = shippingCallbacks2;
    }

    private void setValues(ExtendedCheckoutConfig extendedCheckoutConfig) {
        setCheckoutEnvironment(extendedCheckoutConfig.getEnvironment());
        setMerchantURLScheme(extendedCheckoutConfig.getMerchantUrlScheme());
        setMerchantRedirectURL(extendedCheckoutConfig.getMerchantRedirectUrl());
        setClientId(extendedCheckoutConfig.getClientId());
        setMerchantURLQueryParams(extendedCheckoutConfig.getMerchantQueryParams());
        setPaypalCheckoutCompleteListener(extendedCheckoutConfig.getPayPalCheckoutCompleteListener());
        setShippingCallbacks(extendedCheckoutConfig.getShippingCallbacks());
        setIsDebug(extendedCheckoutConfig.isDebug());
        setShouldFailEligibilityCall(extendedCheckoutConfig.shouldFailEligibilityCall());
        setContentRouter(ContentRouter.INSTANCE);
        setABConfigurationRequested(extendedCheckoutConfig.isABConfigurationRequested());
        setEnabledElmoAbExperiment(extendedCheckoutConfig.getEnabledElmoAbExperiment());
        setShouldTurnOnFallbackExperiment(extendedCheckoutConfig.shouldTurnOnFallbackExperiment());
        setLoadingText(extendedCheckoutConfig.getLoadingText());
        setShouldShowCloseButton(extendedCheckoutConfig.shouldShowCloseButton());
        setShouldUseBodyContainerPadding(extendedCheckoutConfig.shouldUseBodyContainerPadding());
    }

    private boolean verifyExtendedConfig(String str) {
        return TextUtils.isEmpty(str) || Arrays.asList(new String[]{"ARSwS0VNqpmnu-zumKX2ZNxfKLHV9M86WS61-hWy8iMezFS8wIoFaFSwIiiKo2t73O1K_zQ6n6WbrYBD", "AQ04yLjwYNK_cZvD-S-HZY1TwV22AygaJ0JSiYdyqTcfcwRL6i8thQxKdTCZROmUou86wza_xoDk1WGz", "AX93NErgg-F0VeBQ6pNLwa2VKQdw3BnKDvBnasIe_pKoprQyz6NiSf6XS7I1Qtro-VD4GP-AJdjT0Uz4", "AYLa6UCw47Baut1LJ3TojVJBDe8ZkzAutZjWP7fVOCafaJ8em97GrHFW7EJXKcMjGcueM-R_AFa-cadq", "B_AtwZ4XoUiwjVQ1NTPjFJS9yo4lYDXIOrGHZimceQ_wQX-jPsD-aXbfG2v2s-s7UwmtKS-O1uGYOLKkK8", "AYLa6UCw47Baut1LJ3TojVJBDe8ZkzAutZjWP7fVOCafaJ8em97GrHFW7EJXKcMjGcueM-R_AFa-cadq"}).contains(str);
    }

    public void NewShippingAddressViewListenerImpl(NewShippingAddressViewListenerImpl newShippingAddressViewListenerImpl) {
        this.newShippingAddressContentPageListener = newShippingAddressViewListenerImpl;
    }

    public boolean checkCheckoutJSSession() {
        return this.isCheckoutJSSession;
    }

    public boolean checkIsFallback() {
        return this.isFallBack;
    }

    public ContentPage getAddressBookContentPage() {
        return this.addressBookContentPage;
    }

    public AddressBookViewListenerImpl getAddressBookContentPageListener() {
        return this.addressBookContentPageListener;
    }

    public Context getApplicationContext() {
        Context context = this.providerContext;
        if (context == null) {
            context = this.checkoutBaseActivity;
        }
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public ApprovePaymentResponse getApprovePaymentResponse() {
        return SdkComponent.getInstance().getRepository().getApprovePaymentResponse();
    }

    public ContentPage getBillingAgreementsTermsContentPage() {
        return this.billingAgreementsTermsContentPage;
    }

    public String getButtonSessionId() {
        return SdkComponent.getInstance().getRepository().getSmartPaymentButtonSessionId();
    }

    public String getButtonVersion() {
        return SdkComponent.getInstance().getRepository().getButtonVersion();
    }

    public String getBuyerIPCountry() {
        return SdkComponent.getInstance().getRepository().getBuyerIPCountry();
    }

    public String getBuyerLanguage() {
        return this.buyerLanguage;
    }

    public BaseActivity getCheckoutBaseActivity() {
        return this.checkoutBaseActivity;
    }

    public CheckoutEnvironment getCheckoutEnvironment() {
        return this.checkoutEnvironment;
    }

    public CheckoutSession getCheckoutSession() {
        return SdkComponent.getInstance().getRepository().getCheckoutSession();
    }

    public String getCheckoutToken() {
        return SdkComponent.getInstance().getRepository().getPaymentToken();
    }

    public String getClientId() {
        return this.clientId;
    }

    public ContentRouter getContentRouter() {
        return this.contentRouter;
    }

    public InternalCorrelationIds getCorrelationIds() {
        return SdkComponent.getInstance().getRepository().getCorrelationIds();
    }

    public ContentPage getCryptoConsentViewContentPage() {
        return this.cryptoConsentViewContentPage;
    }

    public CryptoConsentViewListenerImpl getCryptoConsentViewListener() {
        return this.cryptoConsentViewListener;
    }

    public CurrencyCode getCurrencyCode() {
        return this.currencyCode;
    }

    public ContentPage getCurrencyConversionContentPage() {
        return this.currencyConversionContentPage;
    }

    public ConversionRateViewListenerImpl getCurrencyConversionContentPageListener() {
        return this.currencyConversionContentPageListener;
    }

    public C7168e.C7169a getCustomTabsIntentBuilder() {
        return new C7168e.C7169a();
    }

    public String getDBInstanceId() {
        return SdkComponent.getInstance().getRepository().getDBInstance();
    }

    public boolean getDidCustomTabOpen() {
        return this.didCustomTabOpen;
    }

    public boolean getDidPYPLActivityPause() {
        return this.didPYPLActivityPause;
    }

    public boolean getDidReturnFromWeb() {
        return this.didReturnFromWeb;
    }

    public String getDomain() {
        return this.domain;
    }

    public List<String> getEnableFundingOptions() {
        return this.enableFundingOptions;
    }

    public List<String> getEnabledElmoAbExperiment() {
        return this.enabledElmoAbExperiment;
    }

    public String getFacilitatorClientId() {
        return this.facilitatorClientId;
    }

    public String getFirebaseSessionId() {
        return SdkComponent.getInstance().getRepository().getFbSessionUid();
    }

    public FundingEligibilityResponse getFundingEligibilityResponse() {
        return this.fundingEligibilityResponse;
    }

    public List<FundingOption> getFundingOptions() {
        return SdkComponent.getInstance().getRepository().getFundingOptions();
    }

    public String getFundingSource() {
        return SdkComponent.getInstance().getRepository().getFundingSource();
    }

    public ContentPage getHomeContentPage() {
        return this.homeContentPage;
    }

    public HomeViewListenerImpl getHomeContentPageListener() {
        return this.homeContentPageListener;
    }

    public boolean getHostHandlesBlockingContingencies() {
        return SdkComponent.getInstance().getRepository().getHostHandlesBlockingContingencies();
    }

    public String getHostVersionName() {
        try {
            Context applicationContext = getApplicationContext();
            Objects.requireNonNull(applicationContext);
            Context context = applicationContext;
            return applicationContext.getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0).versionName;
        } catch (Exception e) {
            PLog.m28729e(TAG, e.getMessage());
            return "";
        }
    }

    public Map<String, String> getInitParams() {
        return this.initParams;
    }

    public String getLoadingText() {
        return this.loadingText;
    }

    public String getLsatToken() {
        if (SdkComponent.getInstance().getRepository().getLsatToken() != null) {
            return SdkComponent.getInstance().getRepository().getLsatToken();
        }
        PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E504, "LSAT token not set", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_LSAT_UPGRADE_REQUEST, PEnums.StateName.STARTUP);
        return "";
    }

    public String getMerchantCartUrl() {
        return this.merchantCartUrl;
    }

    public Order getMerchantOrderInfo() {
        return SdkComponent.getInstance().getRepository().getMerchantOrderInfo();
    }

    public String getMerchantRedirectURL() {
        return this.merchantRedirectURL;
    }

    public HashMap<String, String> getMerchantURLQueryParams() {
        return this.merchantURLQueryParams;
    }

    public String getMerchantURLScheme() {
        return this.merchantURLScheme;
    }

    public WebView getMerchantWebView() {
        return this.merchantWebView;
    }

    public NativeCheckoutWebSSO getNativeCheckoutWebSSO() {
        return this.nativeCheckoutWebSSO;
    }

    public ContentPage getNewShippingAddressContentPage() {
        return this.newShippingAddressContentPage;
    }

    public ContentPage getNewShippingAddressReviewContentPage() {
        return this.newShippingAddressReviewContentPage;
    }

    public NewShippingAddressReviewViewListenerImpl getNewShippingAddressReviewViewListenerImpl() {
        return this.newShippingAddressReviewViewListener;
    }

    public NewShippingAddressViewListenerImpl getNewShippingAddressViewListenerImpl() {
        return this.newShippingAddressContentPageListener;
    }

    public OnApprove getOnApprove() {
        return this.onApprove;
    }

    public OnCancel getOnCancel() {
        return this.onCancel;
    }

    public OnShippingChange getOnShippingChange() {
        return this.onShippingChange;
    }

    public String getOrderAuthorizeUrl() {
        return this.orderAuthorizeUrl;
    }

    public String getOrderCaptureUrl() {
        return this.orderCaptureUrl;
    }

    public Repository.PayModeEnum getPayMode() {
        return this.payMode;
    }

    public PEnums.PayPalChannelInfo getPayPalChannelInfo() {
        return this.payPalChannelInfo;
    }

    public PayPalTransactionHeaderViewListenerImpl getPayPalTransactionDetailsHeaderViewListener() {
        return this.payPalTransactionDetailsHeaderViewListener;
    }

    public PaymentButtonFundingType getPaymentButtonFundingType() {
        return this.paymentButtonFundingType;
    }

    public PayPalCheckoutCompleteListener getPaypalCheckoutCompleteListener() {
        return this.paypalCheckoutCompleteListener;
    }

    public SDKInterceptor getPostApproveSDKIntercept() {
        if (this.postApproveSDKIntercept == null) {
            this.postApproveSDKIntercept = new C3229f();
        }
        return this.postApproveSDKIntercept;
    }

    public SDKInterceptor getPostReviewSDKIntercept() {
        if (this.postReviewSDKIntercept == null) {
            this.postReviewSDKIntercept = new C0388a();
        }
        return this.postReviewSDKIntercept;
    }

    public SDKInterceptor getPreReviewSDKIntercept() {
        if (this.preReviewSDKIntercept == null) {
            this.preReviewSDKIntercept = new C8481h();
        }
        return this.preReviewSDKIntercept;
    }

    public String getProductName() {
        return this.productName;
    }

    public Context getProviderContext() {
        return this.providerContext;
    }

    public ContentPage getRateProtectionContentPage() {
        return this.rateProtectionContentPage;
    }

    public RateProtectionViewListenerImpl getRateProtectionContentPageListener() {
        return this.rateProtectionContentPageListener;
    }

    public Uri getReferrerPackage() {
        return SdkComponent.getInstance().getRepository().getReferrerPackage();
    }

    public long getSDKLaunchTime() {
        return SdkComponent.getInstance().getRepository().getSDKLaunchTime();
    }

    public FundingOption getSelectedFundingOption() {
        return SdkComponent.getInstance().getRepository().getSelectedFundingOption();
    }

    public ShippingCallbacks getShippingCallbacks() {
        return this.shippingCallbacks;
    }

    public ContentPage getShippingMethodContentPage() {
        return this.shippingMethodContentPage;
    }

    public ShippingMethodsViewListenerImpl getShippingMethodContentPageListener() {
        return this.shippingMethodContentPageListener;
    }

    public String getStickinessId() {
        return SdkComponent.getInstance().getRepository().getSmartPaymentButtonStickinessId();
    }

    public StrongCustomerAuthStepUp getStrongCustomerAuthStepUp() {
        return this.strongCustomerAuthStepUp;
    }

    public ContentPage getThreeDSContentPage() {
        return this.threeDSContentPage;
    }

    public PayPalThreeDSV1ViewListenerImpl getThreeDSContentPageListener() {
        return this.threeDSContentPageListener;
    }

    public ContentPage getTransactionDetailsContentPage() {
        return this.transactionDetailsContentPage;
    }

    public User getUser() {
        return SdkComponent.getInstance().getRepository().getUser();
    }

    public UserAction getUserAction() {
        return this.userAction;
    }

    public String getUserId() {
        return SdkComponent.getInstance().getRepository().getUserId();
    }

    public ContentPage getUserProfileContentPage() {
        return this.userProfileContentPage;
    }

    public UserProfileViewListenerImpl getUserProfileContentPageListener() {
        return this.userProfileContentPageListener;
    }

    public void invokeOnErrorCallback(Exception exc, ErrorReason errorReason, Handler handler) {
        OnError onError2 = this.onError;
        if (onError2 != null) {
            handler.post(new C17733a(onError2, exc, errorReason, this));
        }
    }

    public boolean isABConfigurationRequested() {
        return this.isABConfigurationRequested;
    }

    public boolean isCCTReturn() {
        return this.isCCTReturn;
    }

    public boolean isDebug() {
        Boolean bool = this.isDebug;
        return bool != null && bool.booleanValue();
    }

    public boolean isNativeAddCardEnabled() {
        return this.isNativeAddCardEnabled;
    }

    public boolean isOnboardingComplete() {
        return this.isOnboardingComplete;
    }

    public boolean isPropsSet() {
        return SdkComponent.getInstance().getRepository().getPropsSet();
    }

    public boolean isShippingCallbackEnabled() {
        boolean isEnabled = FeatureFlagManager.isEnabled(Feature.SHIPPING_CALLBACK).isEnabled();
        return this.isSmartPaymentCheckout ? this.isShippingCallbackEnabled && isEnabled : isEnabled;
    }

    public boolean isShouldUseBodyContainerPadding() {
        return this.shouldUseBodyContainerPadding;
    }

    public boolean isSkipEligibility() {
        return SdkComponent.getInstance().getRepository().isSkipEligibility();
    }

    public boolean isSmartPaymentCheckout() {
        return this.isSmartPaymentCheckout;
    }

    public boolean isSmartPaymentPopupCheckout() {
        return this.isSmartPaymentPopupCheckout;
    }

    public void reset() {
        this.merchantRedirectURL = null;
        this.providerContext = null;
        this.merchantURLQueryParams = new HashMap<>();
    }

    public void resetChecks() {
        this.didCustomTabOpen = false;
        this.didPYPLActivityPause = false;
        this.didReturnFromWeb = false;
        this.isCheckoutJSSession = false;
        this.isFallBack = false;
    }

    public void resetLsatToken() {
        SdkComponent.getInstance().getRepository().resetLsatToken();
    }

    public void setABConfigurationRequested(boolean z) {
        this.isABConfigurationRequested = z;
    }

    public void setAddressBookContentPage(ContentPage contentPage) {
        this.addressBookContentPage = contentPage;
    }

    public void setAddressBookContentPageListener(AddressBookViewListenerImpl addressBookViewListenerImpl) {
        this.addressBookContentPageListener = addressBookViewListenerImpl;
    }

    public void setBillingAddress(BillingAddressRequest billingAddressRequest) {
        SdkComponent.getInstance().getRepository().setBillingAddress(billingAddressRequest);
    }

    public void setBillingAgreementsTermsContentPage(ContentPage contentPage) {
        this.billingAgreementsTermsContentPage = contentPage;
    }

    public void setButtonSessionId(String str) {
        if (!TextUtils.isEmpty(str)) {
            SdkComponent.getInstance().getRepository().setSmartPaymentButtonSessionId(str);
        }
    }

    public void setButtonStickinessId(String str) {
        SdkComponent.getInstance().getRepository().setSmartPaymentButtonStickinessId(str);
    }

    public void setButtonVersion(String str) {
        SdkComponent.getInstance().getRepository().setButtonVersion(str);
    }

    public void setBuyerIPCountry(String str) {
        if (!TextUtils.isEmpty(str)) {
            SdkComponent.getInstance().getRepository().setBuyerIPCountry(str);
        }
    }

    public void setBuyerLanguage(String str) {
        this.buyerLanguage = str;
    }

    public void setCCTReturn(boolean z) {
        this.isCCTReturn = z;
    }

    public void setCheckoutBaseActivity(BaseActivity baseActivity) {
        this.checkoutBaseActivity = baseActivity;
    }

    public void setCheckoutEnvironment(CheckoutEnvironment checkoutEnvironment2) {
        this.checkoutEnvironment = checkoutEnvironment2;
    }

    public void setCheckoutJSSession(boolean z) {
        this.isCheckoutJSSession = z;
    }

    public void setCheckoutToken(String str) {
        SdkComponent.getInstance().getRepository().setCheckoutToken(str);
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setConfig(ExtendedCheckoutConfig extendedCheckoutConfig) {
        if (verifyExtendedConfig(extendedCheckoutConfig.getClientId())) {
            setExtendedValues(extendedCheckoutConfig);
            return;
        }
        PLog.m28729e(TAG, "clientID not found in verified list to set extended config");
        setValues(extendedCheckoutConfig);
    }

    public void setContentRouter(ContentRouter contentRouter2) {
        this.contentRouter = contentRouter2;
    }

    public void setCorrelationIds(InternalCorrelationIds internalCorrelationIds) {
        SdkComponent.getInstance().getRepository().setCorrelationIds(internalCorrelationIds);
    }

    public void setCryptoConsentViewContentPage(ContentPage contentPage) {
        this.cryptoConsentViewContentPage = contentPage;
    }

    public void setCryptoConsentViewListener(CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl) {
        this.cryptoConsentViewListener = cryptoConsentViewListenerImpl;
    }

    public void setCurrencyCode(CurrencyCode currencyCode2) {
        this.currencyCode = currencyCode2;
    }

    public void setCurrencyConversionContentPage(ContentPage contentPage) {
        this.currencyConversionContentPage = contentPage;
    }

    public void setCurrencyConversionContentPageListener(ConversionRateViewListenerImpl conversionRateViewListenerImpl) {
        this.currencyConversionContentPageListener = conversionRateViewListenerImpl;
    }

    public void setDBInstanceId(String str) {
        SdkComponent.getInstance().getRepository().setDBInstance(str);
    }

    public void setDcvv(String str) {
        SdkComponent.getInstance().getRepository().setDcvv(str);
    }

    public void setDidCustomTabOpen(boolean z) {
        this.didCustomTabOpen = z;
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            Cache.cacheDidCustomTabOpen(applicationContext, z);
        }
    }

    public void setDidPYPLActivityPause(boolean z) {
        this.didPYPLActivityPause = z;
    }

    public void setDidReturnFromWeb(boolean z) {
        this.didReturnFromWeb = z;
    }

    public void setDomain(String str) {
        this.domain = str;
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            Cache.cacheDomain(applicationContext, str);
        }
    }

    public void setEnableFundingOptions(List<String> list) {
        this.enableFundingOptions = list;
    }

    public void setEnabledElmoAbExperiment(List<ElmoAbExperiment> list) {
        ArrayList arrayList = new ArrayList();
        for (ElmoAbExperiment experimentName : list) {
            arrayList.add(experimentName.experimentName());
        }
        this.enabledElmoAbExperiment = arrayList;
    }

    public void setFacilitatorClientId(String str) {
        this.facilitatorClientId = str;
    }

    public void setFirebaseSessionId(String str) {
        SdkComponent.getInstance().getRepository().setFbSessionUid(str);
    }

    public void setFundingEligibilityResponse(FundingEligibilityResponse fundingEligibilityResponse2) {
        this.fundingEligibilityResponse = fundingEligibilityResponse2;
    }

    public void setFundingSource(String str) {
        SdkComponent.getInstance().getRepository().setFundingSource(str);
    }

    public void setHomeContentPage(ContentPage contentPage) {
        this.homeContentPage = contentPage;
    }

    public void setHomeContentPageListener(HomeViewListenerImpl homeViewListenerImpl) {
        this.homeContentPageListener = homeViewListenerImpl;
    }

    public void setHostHandlesBlockingContingencies(boolean z) {
        SdkComponent.getInstance().getRepository().setHostHandlesBlockingContingencies(z);
    }

    public void setInitParams(Map<String, String> map) {
        this.initParams = map;
    }

    public void setIsFallback(boolean z) {
        this.isFallBack = z;
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            Cache.cacheIsFallback(applicationContext, z);
        }
    }

    public void setLoadingText(String str) {
        this.loadingText = str;
    }

    public void setLsatToken(String str) {
        SdkComponent.getInstance().getRepository().setLsatToken(str);
    }

    public void setMerchantCartUrl(String str) {
        this.merchantCartUrl = str;
    }

    public void setMerchantOrderInfo(Order order) {
        SdkComponent.getInstance().getRepository().setMerchantOrderInfo(order);
    }

    public void setMerchantURLQueryParams(String[] strArr) {
        if (strArr != null) {
            this.merchantURLQueryParams = new HashMap<>();
            for (String split : strArr) {
                String[] split2 = split.split("=");
                if (split2.length > 1) {
                    this.merchantURLQueryParams.put(split2[0], split2[1]);
                }
            }
            String str = TAG;
            StringBuilder h = C0072d.m201h("merchantURLQueryParams: ");
            h.append(strArr.toString());
            PLog.m28726d(str, h.toString());
        }
    }

    public void setMerchantWebView(WebView webView) {
        this.merchantWebView = webView;
    }

    public void setNativeAddCardEnabled(boolean z) {
        this.isNativeAddCardEnabled = z;
    }

    public void setOnApprove(OnApprove onApprove2) {
        this.onApprove = onApprove2;
    }

    public void setOnCancel(OnCancel onCancel2) {
        this.onCancel = onCancel2;
    }

    public void setOnError(OnError onError2) {
        this.onError = onError2;
    }

    public void setOnShippingChange(OnShippingChange onShippingChange2) {
        this.onShippingChange = onShippingChange2;
    }

    public void setOnboardingComplete(boolean z) {
        this.isOnboardingComplete = z;
    }

    public void setOrderAuthorizeUrl(String str) {
        this.orderAuthorizeUrl = str;
    }

    public void setOrderCaptureUrl(String str) {
        this.orderCaptureUrl = str;
    }

    public void setPayMode(Repository.PayModeEnum payModeEnum) {
        this.payMode = payModeEnum;
    }

    public void setPayPalChannelInfo(PEnums.PayPalChannelInfo payPalChannelInfo2) {
        this.payPalChannelInfo = payPalChannelInfo2;
    }

    public void setPayPalTransactionDetailsHeaderViewListener(PayPalTransactionHeaderViewListenerImpl payPalTransactionHeaderViewListenerImpl) {
        this.payPalTransactionDetailsHeaderViewListener = payPalTransactionHeaderViewListenerImpl;
    }

    public void setPaymentButtonFundingType(PaymentButtonFundingType paymentButtonFundingType2) {
        this.paymentButtonFundingType = paymentButtonFundingType2;
    }

    public void setPostReviewSDKIntercept(SDKInterceptor sDKInterceptor) {
        this.postReviewSDKIntercept = sDKInterceptor;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setPropsSet(boolean z) {
        SdkComponent.getInstance().getRepository().setPropsSet(z);
    }

    public void setProviderContext(Context context) {
        this.providerContext = context;
    }

    public void setRateProtectionContentPage(ContentPage contentPage) {
        this.rateProtectionContentPage = contentPage;
    }

    public void setRateProtectionContentPageListener(RateProtectionViewListenerImpl rateProtectionViewListenerImpl) {
        this.rateProtectionContentPageListener = rateProtectionViewListenerImpl;
    }

    public void setReturnUrl(String str) {
        SdkComponent.getInstance().getRepository().setReturnUrl(str);
    }

    public void setSDKLaunchTime(long j) {
        SdkComponent.getInstance().getRepository().setSDKLaunchTime(j);
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        SdkComponent.getInstance().getRepository().setSelectedAddress(shippingAddress);
    }

    public void setShippingCallbackEnabled(boolean z) {
        this.isShippingCallbackEnabled = z;
    }

    public void setShippingMethodContentPage(ContentPage contentPage) {
        this.shippingMethodContentPage = contentPage;
    }

    public void setShippingMethodContentPageListener(ShippingMethodsViewListenerImpl shippingMethodsViewListenerImpl) {
        this.shippingMethodContentPageListener = shippingMethodsViewListenerImpl;
    }

    public void setShouldDisableScrimBackground(boolean z) {
        this.shouldDisableScrimBackground = z;
    }

    public void setShouldEnableBillingAgreements(boolean z) {
        this.shouldEnableBillingAgreements = z;
    }

    public void setShouldFailEligibilityCall(boolean z) {
        this.shouldFailEligibilityCall = z;
    }

    public void setShouldFallBackToWeb(boolean z) {
        this.shouldFallBackToWeb = z;
    }

    public void setShouldShowCloseButton(boolean z) {
        this.shouldShowCloseButton = z;
    }

    public void setShouldShowExitDialogWithRadioButtons(boolean z) {
        this.shouldShowExitDialogWithRadioButtons = z;
    }

    public void setShouldTurnOnFallbackExperiment(boolean z) {
        this.shouldTurnOnFallbackExperiment = z;
    }

    public void setShouldUseBodyContainerPadding(boolean z) {
        this.shouldUseBodyContainerPadding = z;
    }

    public void setSkipEligibility(boolean z) {
        SdkComponent.getInstance().getRepository().setSkipEligibility(z);
    }

    public void setSmartPaymentCheckout(boolean z) {
        this.isSmartPaymentCheckout = z;
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            Cache.cacheIsSmartPaymentButton(applicationContext, z);
        }
    }

    public void setSmartPaymentPopupCheckout(boolean z) {
        this.isSmartPaymentPopupCheckout = z;
    }

    public void setStickinessId(String str) {
        SdkComponent.getInstance().getRepository().setSmartPaymentButtonStickinessId(str);
    }

    public void setStrongCustomerAuthStepUp(StrongCustomerAuthStepUp strongCustomerAuthStepUp2) {
        this.strongCustomerAuthStepUp = strongCustomerAuthStepUp2;
    }

    public void setThreeDSContentPage(ContentPage contentPage) {
        this.threeDSContentPage = contentPage;
    }

    public void setThreeDSContentPageListener(PayPalThreeDSV1ViewListenerImpl payPalThreeDSV1ViewListenerImpl) {
        this.threeDSContentPageListener = payPalThreeDSV1ViewListenerImpl;
    }

    public void setTransactionDetailsContentPage(ContentPage contentPage) {
        this.transactionDetailsContentPage = contentPage;
    }

    @Deprecated
    public void setUpgradeAccessToken(UpgradeAccessToken upgradeAccessToken) {
        SdkComponent.getInstance().getMerchantConfigRepository().setUpgradeAccessToken(upgradeAccessToken);
    }

    public void setUserAction(UserAction userAction2) {
        this.userAction = userAction2;
    }

    public void setUserProfileContentPage(ContentPage contentPage) {
        this.userProfileContentPage = contentPage;
    }

    public void setUserProfileContentPageListener(UserProfileViewListenerImpl userProfileViewListenerImpl) {
        this.userProfileContentPageListener = userProfileViewListenerImpl;
    }

    public boolean shouldDisableScrimBackground() {
        return this.shouldDisableScrimBackground;
    }

    public boolean shouldEnableBillingAgreements() {
        return this.shouldEnableBillingAgreements;
    }

    public boolean shouldFailEligibilityCall() {
        return this.shouldFailEligibilityCall;
    }

    public boolean shouldFallBackToWeb() {
        return this.shouldFallBackToWeb;
    }

    public boolean shouldShowCloseButton() {
        return this.shouldShowCloseButton;
    }

    public boolean shouldShowExitDialogWithRadioButtons() {
        return this.shouldShowExitDialogWithRadioButtons;
    }

    public boolean shouldTurnOnFallbackExperiment() {
        return this.shouldTurnOnFallbackExperiment;
    }

    public void invokeOnErrorCallback(Exception exc, ErrorReason errorReason) {
        invokeOnErrorCallback(exc, errorReason, new Handler(Looper.getMainLooper()));
    }

    public void setConfig(CheckoutConfig checkoutConfig) {
        setProviderContext(checkoutConfig.getApplication());
        checkClientIdChanged(checkoutConfig.getClientId());
        setClientId(checkoutConfig.getClientId());
        CheckoutEnvironment checkoutEnvironment2 = new CheckoutEnvironment();
        checkoutEnvironment2.setCurrentMerchantPayPalEnvironment(checkoutConfig.getEnvironment().toRunTimeEnvironment());
        setCheckoutEnvironment(checkoutEnvironment2);
        setIsDebug(Boolean.valueOf(checkoutConfig.getSettingsConfig().getLoggingEnabled()));
        setShouldFailEligibilityCall(checkoutConfig.getSettingsConfig().getShouldFailEligibility());
        if (checkoutConfig.getUserAction() != null) {
            StringBuilder h = C0072d.m201h("userAction=");
            h.append(UserActionKt.getAsMerchantUrlQueryParam(checkoutConfig.getUserAction()));
            setMerchantURLQueryParams(new String[]{h.toString()});
        }
        setCurrencyCode(checkoutConfig.getCurrencyCode());
        setUserAction(checkoutConfig.getUserAction());
    }
}
