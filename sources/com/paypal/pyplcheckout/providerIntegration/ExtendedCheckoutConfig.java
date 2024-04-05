package com.paypal.pyplcheckout.providerIntegration;

import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.addcard.UpgradeAccessToken;
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewListenerImpl;
import com.paypal.pyplcheckout.auth.NativeCheckoutWebSSO;
import com.paypal.pyplcheckout.auth.UserAuthentication;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewListenerImpl;
import com.paypal.pyplcheckout.conversionrateprotection.model.RateProtectionViewListenerImpl;
import com.paypal.pyplcheckout.crypto.model.CryptoConsentViewListenerImpl;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.model.HomeViewListenerImpl;
import com.paypal.pyplcheckout.interfaces.PayPalCheckoutCompleteListener;
import com.paypal.pyplcheckout.interfaces.SDKInterceptor;
import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import com.paypal.pyplcheckout.merchantIntegration.ShippingCallbacks;
import com.paypal.pyplcheckout.model.CheckoutEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.ContentPage;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.BillingAddressRequest;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.sca.StrongCustomerAuthStepUp;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.shippingmethods.model.ShippingMethodsViewListenerImpl;
import com.paypal.pyplcheckout.threeds.model.PayPalThreeDSV1ViewListenerImpl;
import com.paypal.pyplcheckout.userprofile.model.UserProfileViewListenerImpl;
import java.util.Collections;
import java.util.List;

public class ExtendedCheckoutConfig {
    private static final String TAG = "ExtendedCheckoutConfig";
    private ContentPage addressBookContentPage;
    private AddressBookViewListenerImpl addressBookContentPageListener;
    private BillingAddressRequest billingAddress;
    private ContentPage billingAgreementTermsContentPage;
    private String clientId;
    private ContentRouter contentRouter;
    private ContentPage cryptoConsentContentPage;
    private CryptoConsentViewListenerImpl cryptoConsentContentPageListener;
    private String currencyCode;
    private ContentPage currencyConversionContentPage;
    private ConversionRateViewListenerImpl currencyConversionContentPageListener;
    private String dcvv;
    private boolean enableNativeAddCard;
    private boolean enableShippingCallback;
    private List<ElmoAbExperiment> enabledElmoAbExperiment;
    private CheckoutEnvironment environment;
    private ContentPage homeContentPage;
    private HomeViewListenerImpl homeContentPageListener;
    private boolean isABConfigurationRequested;
    private Boolean isDebug;
    private String loadingText;
    private String[] merchantQueryParams;
    private String merchantRedirectUrl;
    private String merchantUrlScheme;
    private NativeCheckoutWebSSO nativeCheckoutWebSSO;
    private PayPalCheckoutCompleteListener payPalCheckoutCompleteListener;
    private SDKInterceptor postApproveSDKInterceptor;
    private SDKInterceptor postReviewSDKIntercept;
    private SDKInterceptor preReviewSDKInterceptor;
    private String productName;
    private UserAuthentication providerAuth;
    private ContentPage rateProtectionContentPage;
    private RateProtectionViewListenerImpl rateProtectionContentPageListener;
    private Uri referrerPackage;
    private ShippingCallbacks shippingCallbacks;
    private ContentPage shippingMethodContentPage;
    private ShippingMethodsViewListenerImpl shippingMethodContentPageListener;
    private boolean shouldDisableScrimBackground;
    private boolean shouldEnableBillingAgreements;
    private boolean shouldFailEligibilityCall;
    private boolean shouldFallBackToWeb;
    private boolean shouldShowCloseButton;
    private boolean shouldShowExitDialogWithRadioButtons;
    private boolean shouldTurnOnFallbackExperiment;
    private boolean shouldUseBodyContainerPadding;
    private StrongCustomerAuthStepUp strongCustomerAuthStepUp;
    private ContentPage threeDSContentPage;
    private PayPalThreeDSV1ViewListenerImpl threeDSContentPageListener;
    private UpgradeAccessToken upgradeAccessToken;
    private ContentPage userProfileContentPage;
    private UserProfileViewListenerImpl userProfileContentPageListener;

    public static class StaticInnerSingleton {
        private static ExtendedCheckoutConfig INSTANCE;

        private StaticInnerSingleton() {
        }

        /* access modifiers changed from: private */
        public static void clearInstance() {
            INSTANCE = null;
        }

        /* access modifiers changed from: private */
        public static ExtendedCheckoutConfig getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new ExtendedCheckoutConfig(0);
            }
            return INSTANCE;
        }
    }

    private ExtendedCheckoutConfig() {
        this.isDebug = null;
        this.shouldFallBackToWeb = true;
        this.shouldShowExitDialogWithRadioButtons = true;
        this.homeContentPage = null;
        this.homeContentPageListener = null;
        this.userProfileContentPage = null;
        this.userProfileContentPageListener = null;
        this.currencyConversionContentPage = null;
        this.currencyConversionContentPageListener = null;
        this.cryptoConsentContentPage = null;
        this.cryptoConsentContentPageListener = null;
        this.rateProtectionContentPage = null;
        this.rateProtectionContentPageListener = null;
        this.shippingMethodContentPage = null;
        this.shippingMethodContentPageListener = null;
        this.addressBookContentPage = null;
        this.addressBookContentPageListener = null;
        this.threeDSContentPage = null;
        this.threeDSContentPageListener = null;
        this.billingAgreementTermsContentPage = null;
        this.shouldDisableScrimBackground = false;
        this.enabledElmoAbExperiment = Collections.emptyList();
        this.isABConfigurationRequested = false;
        this.shouldTurnOnFallbackExperiment = false;
        this.shouldShowCloseButton = true;
        this.shouldUseBodyContainerPadding = false;
        this.loadingText = null;
        Events.getInstance().register((Class<? extends EventType>) ExtendedPayPalEventTypes.class);
    }

    public /* synthetic */ ExtendedCheckoutConfig(int i) {
        this();
    }

    public static ExtendedCheckoutConfig getInstance() {
        return StaticInnerSingleton.getInstance();
    }

    public void clearInstance() {
        StaticInnerSingleton.clearInstance();
    }

    public ContentPage getAddressBookContentPage() {
        return this.addressBookContentPage;
    }

    public AddressBookViewListenerImpl getAddressBookContentPageListener() {
        return this.addressBookContentPageListener;
    }

    public ApprovePaymentResponse getApprovePaymentResponse() {
        return DebugConfigManager.getInstance().getApprovePaymentResponse();
    }

    public ContentPage getBillingAgreementTermsContentPage() {
        return this.billingAgreementTermsContentPage;
    }

    public CheckoutSession getCheckoutSession() {
        return DebugConfigManager.getInstance().getCheckoutSession();
    }

    public String getCheckoutToken() {
        return DebugConfigManager.getInstance().getCheckoutToken();
    }

    public String getClientId() {
        return this.clientId;
    }

    public ContentRouter getContentRouter() {
        return this.contentRouter;
    }

    public ContentPage getCryptoConsentContentPage() {
        return this.cryptoConsentContentPage;
    }

    public CryptoConsentViewListenerImpl getCryptoConsentContentPageListener() {
        return this.cryptoConsentContentPageListener;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public ContentPage getCurrencyConversionContentPage() {
        return this.currencyConversionContentPage;
    }

    public ConversionRateViewListenerImpl getCurrencyConversionContentPageListener() {
        return this.currencyConversionContentPageListener;
    }

    public List<ElmoAbExperiment> getEnabledElmoAbExperiment() {
        return this.enabledElmoAbExperiment;
    }

    public CheckoutEnvironment getEnvironment() {
        return this.environment;
    }

    public boolean getHandleBlockingContingencies() {
        return DebugConfigManager.getInstance().getHostHandlesBlockingContingencies();
    }

    public ContentPage getHomeContentPage() {
        return this.homeContentPage;
    }

    public HomeViewListenerImpl getHomeContentPageListener() {
        return this.homeContentPageListener;
    }

    public String getLoadingText() {
        return this.loadingText;
    }

    public String[] getMerchantQueryParams() {
        return this.merchantQueryParams;
    }

    public String getMerchantRedirectUrl() {
        return this.merchantRedirectUrl;
    }

    public String getMerchantUrlScheme() {
        return this.merchantUrlScheme;
    }

    public NativeCheckoutWebSSO getNativeCheckoutWebSSO() {
        return this.nativeCheckoutWebSSO;
    }

    public Repository.PayModeEnum getPayMode() {
        return DebugConfigManager.getInstance().getPayMode();
    }

    public PEnums.PayPalChannelInfo getPayPalChannelInfo() {
        return DebugConfigManager.getInstance().getPayPalChannelInfo();
    }

    public PayPalCheckoutCompleteListener getPayPalCheckoutCompleteListener() {
        return this.payPalCheckoutCompleteListener;
    }

    public SDKInterceptor getPostApproveSDKInterceptor() {
        return this.postApproveSDKInterceptor;
    }

    public SDKInterceptor getPostReviewSDKIntercept() {
        return this.postReviewSDKIntercept;
    }

    public SDKInterceptor getPreReviewSDKInterceptor() {
        return this.preReviewSDKInterceptor;
    }

    public String getProductName() {
        return this.productName;
    }

    public UserAuthentication getProviderAuth() {
        return this.providerAuth;
    }

    public ContentPage getRateProtectionContentPage() {
        return this.rateProtectionContentPage;
    }

    public RateProtectionViewListenerImpl getRateProtectionContentPageListener() {
        return this.rateProtectionContentPageListener;
    }

    public Uri getReferrerPackage() {
        return this.referrerPackage;
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

    public String getStagingUrl() {
        return this.environment.getStagingUrl();
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

    public UpgradeAccessToken getUpgradeAccessToken() {
        return this.upgradeAccessToken;
    }

    public User getUser() {
        return DebugConfigManager.getInstance().getUser();
    }

    public ContentPage getUserProfileContentPage() {
        return this.userProfileContentPage;
    }

    public UserProfileViewListenerImpl getUserProfileContentPageListener() {
        return this.userProfileContentPageListener;
    }

    public boolean isABConfigurationRequested() {
        return this.isABConfigurationRequested;
    }

    public Boolean isDebug() {
        return this.isDebug;
    }

    public boolean isEnableNativeAddCard() {
        return this.enableNativeAddCard;
    }

    public boolean isShippingCallbackEnabled() {
        return this.enableShippingCallback;
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
        DebugConfigManager.getInstance().setBillingAddress(billingAddressRequest);
    }

    public void setBillingAgreementTermsContentPage(ContentPage contentPage) {
        this.billingAgreementTermsContentPage = contentPage;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setContentRouter(ContentRouter contentRouter2) {
        this.contentRouter = contentRouter2;
    }

    public void setCryptoConsentContentPage(ContentPage contentPage) {
        this.cryptoConsentContentPage = contentPage;
    }

    public void setCryptoConsentContentPageListener(CryptoConsentViewListenerImpl cryptoConsentViewListenerImpl) {
        this.cryptoConsentContentPageListener = cryptoConsentViewListenerImpl;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setCurrencyConversionContentPage(ContentPage contentPage) {
        this.currencyConversionContentPage = contentPage;
    }

    public void setCurrencyConversionContentPageListener(ConversionRateViewListenerImpl conversionRateViewListenerImpl) {
        this.currencyConversionContentPageListener = conversionRateViewListenerImpl;
    }

    public void setDcvv(String str) {
        DebugConfigManager.getInstance().setDcvv(str);
    }

    public void setEnableNativeAddCard(boolean z) {
        this.enableNativeAddCard = z;
    }

    public void setEnableShippingCallback(boolean z) {
        this.enableShippingCallback = z;
    }

    public void setEnabledElmoAbExperiment(List<ElmoAbExperiment> list) {
        this.enabledElmoAbExperiment = list;
    }

    public void setHandleBlockingContingencies(boolean z) {
        DebugConfigManager.getInstance().setHostHandlesBlockingContingencies(z);
    }

    public void setHomeContentPage(ContentPage contentPage) {
        this.homeContentPage = contentPage;
    }

    public void setHomeContentPageListener(HomeViewListenerImpl homeViewListenerImpl) {
        this.homeContentPageListener = homeViewListenerImpl;
    }

    public void setIsDebug(boolean z) {
        this.isDebug = Boolean.valueOf(z);
    }

    public void setLoadingText(String str) {
        this.loadingText = str;
    }

    public void setMerchantQueryParams(String[] strArr) {
        this.merchantQueryParams = strArr;
    }

    public void setMerchantRedirectUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.merchantUrlScheme = Uri.parse(str).getScheme();
            this.merchantRedirectUrl = str;
            return;
        }
        PLog.m28740w(TAG, "merchant tried to set a null or empty redirect URL");
    }

    public void setMerchantRedirectUrlScheme(String str) {
        this.merchantUrlScheme = str;
        this.merchantRedirectUrl = C0326j.m864i(str, "://paypalpay");
    }

    public void setMerchantUrlScheme(String str) {
        this.merchantUrlScheme = str;
    }

    public void setNativeCheckoutSSO(NativeCheckoutWebSSO nativeCheckoutWebSSO2) {
        this.nativeCheckoutWebSSO = nativeCheckoutWebSSO2;
    }

    @Deprecated
    public void setPayPalCheckoutCompleteListener(PayPalCheckoutCompleteListener payPalCheckoutCompleteListener2) {
        this.payPalCheckoutCompleteListener = payPalCheckoutCompleteListener2;
    }

    public void setPayPalEnvironment(RunTimeEnvironment runTimeEnvironment) {
        if (this.environment == null) {
            this.environment = new CheckoutEnvironment();
        }
        this.environment.setCurrentMerchantPayPalEnvironment(runTimeEnvironment);
    }

    public void setPort(String str) {
        if (this.environment.getCurrentMerchantPayPalEnvironment() == RunTimeEnvironment.LOCAL) {
            this.environment.setPort(str);
            return;
        }
        throw new IllegalArgumentException("You must set the environment to RunTimeEnvironment.LOCAL with setPayPalEnvironment(RunTimeEnvironment.LOCAL) before calling this method");
    }

    public void setPostApproveSDKInterceptor(SDKInterceptor sDKInterceptor) {
        this.postApproveSDKInterceptor = sDKInterceptor;
    }

    public void setPostReviewSDKIntercept(SDKInterceptor sDKInterceptor) {
        this.postReviewSDKIntercept = sDKInterceptor;
    }

    public void setPreReviewSDKInterceptor(SDKInterceptor sDKInterceptor) {
        this.preReviewSDKInterceptor = sDKInterceptor;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setProviderAuth(UserAuthentication userAuthentication) {
        this.providerAuth = userAuthentication;
    }

    public void setRateProtectionContentPage(ContentPage contentPage) {
        this.rateProtectionContentPage = contentPage;
    }

    public void setRateProtectionContentPageListener(RateProtectionViewListenerImpl rateProtectionViewListenerImpl) {
        this.rateProtectionContentPageListener = rateProtectionViewListenerImpl;
    }

    public void setReferrerPackage(Uri uri) {
        this.referrerPackage = uri;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        DebugConfigManager.getInstance().setShippingAddress(shippingAddress);
    }

    @Deprecated
    public void setShippingCallbacks(ShippingCallbacks shippingCallbacks2) {
        this.shippingCallbacks = shippingCallbacks2;
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

    public void setShouldUseBodyContainerPadding(boolean z) {
        this.shouldUseBodyContainerPadding = z;
    }

    public void setStagingUrl(String str) {
        if (this.environment.getCurrentMerchantPayPalEnvironment() == RunTimeEnvironment.STAGE) {
            this.environment.setStagingUrl(str);
            return;
        }
        throw new IllegalArgumentException("You must set the environment to RunTimeEnvironment.STAGE with setPayPalEnvironment(RunTimeEnvironment.STAGE) before calling this method");
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

    public void setUpgradeAccessToken(UpgradeAccessToken upgradeAccessToken2) {
        this.upgradeAccessToken = upgradeAccessToken2;
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

    public boolean shouldUseBodyContainerPadding() {
        return this.shouldUseBodyContainerPadding;
    }

    public void setMerchantRedirectUrl(Uri uri) {
        this.merchantUrlScheme = uri.getScheme();
        this.merchantRedirectUrl = uri.toString();
    }
}
