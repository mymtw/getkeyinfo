package com.paypal.pyplcheckout.home.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.C2783s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2845b0;
import androidx.lifecycle.C2886r;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.braze.C5380a;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.etsy.android.p327ui.C10079k;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17183a;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17185c;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17188f;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17190h;
import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.auth.AuthHandler;
import com.paypal.pyplcheckout.auth.AuthHandlerProvider;
import com.paypal.pyplcheckout.auth.AuthenticationSuccess;
import com.paypal.pyplcheckout.auth.NativeSSOListener;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17199b;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.NativePayWithCryptoCheck;
import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.eligibility.EligibilityManager;
import com.paypal.pyplcheckout.eligibility.Native3pEligibilityCheck;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17224a;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.home.view.customviews.C17240d;
import com.paypal.pyplcheckout.home.view.customviews.C17248l;
import com.paypal.pyplcheckout.home.view.customviews.PayPalEnterLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.productviews.ShippingCallbackBlockingBehaviour;
import com.paypal.pyplcheckout.home.view.interfaces.UpdateClientConfigListener;
import com.paypal.pyplcheckout.interfaces.Progression;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.Status;
import com.paypal.pyplcheckout.interfaces.VmLogoutListener;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.CreditPPCOffer;
import com.paypal.pyplcheckout.pojo.Data;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.Name;
import com.paypal.pyplcheckout.pojo.NewShippingAddressRequest;
import com.paypal.pyplcheckout.pojo.PaymentContingencies;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.ShippingCallbackRequestType;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.pojo.ThreeDSContingencyData;
import com.paypal.pyplcheckout.pojo.ThreeDsV1Data;
import com.paypal.pyplcheckout.pojo.TransactionSession;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback;
import com.paypal.pyplcheckout.sca.ScaUiListener;
import com.paypal.pyplcheckout.sca.StrongCustomerAuthListener;
import com.paypal.pyplcheckout.sca.StrongCustomerAuthStepUp;
import com.paypal.pyplcheckout.services.ApiErrorException;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;
import com.paypal.pyplcheckout.state.data.model.CheckoutState;
import com.paypal.pyplcheckout.state.usecase.SetCheckoutStateUseCase;
import com.paypal.pyplcheckout.threeds.ActionCode;
import com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.ValidateResponseAlias;
import com.paypal.pyplcheckout.threeds.model.ThreeDSTopBanner;
import com.paypal.pyplcheckout.threeds.usecase.DuplicatedContingencyException;
import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;
import com.paypal.pyplcheckout.threeds.view.fragments.PYPLThreeDSV1Fragment;
import com.paypal.pyplcheckout.utils.AppBuildConfig;
import com.paypal.pyplcheckout.utils.CheckoutIdlingResource;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import com.paypal.pyplcheckout.utils.IgnoreGeneratedTestReport;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import com.paypal.pyplcheckout.viewmodels.BaseViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.C19394m;
import p030bo.app.C4237u6;
import p306z8.C8477d;
import p316be.C8549a;
import p753kq.C19857l;

public class MainPaysheetViewModel extends BaseViewModel implements C2886r {
    private static final String TAG = "MainPaysheetViewModel";
    private static final int TOKEN_TIMEOUT = 300000;
    private AbManager abManager;
    /* access modifiers changed from: private */
    public String accessToken;
    private final AddressRepository addressRepository;
    private final AuthHandlerProvider authHandlerProvider;
    private final AuthRepository authRepository;
    private final C2895z<String> buttonSessionID;
    private final C2895z<Boolean> checkoutCompletedFlag;
    private final C2895z<ContingencyEventsModel> contingencyeventsModel;
    private final C2895z<String> conversionRate;
    private final C2895z<CurrencyConversionType> conversionType;
    private EligibilityManager eligibilityManager;
    private final Events events;
    private final C2895z<Boolean> fetchingUserDataCompletedFlag;
    private final C2895z<Boolean> firebaseConnected;
    private String firstAndLastName;
    private String firstName;
    private final C2895z<String> formattedConversionToAmount;
    private final C2895z<String> formattedConvertedAmount;
    private final C2895z<String> fromConversionFormat;
    private String fullName;
    private final C2895z<String> grandTotal;
    /* access modifiers changed from: private */
    public boolean isActionButtonClickEnabled;
    /* access modifiers changed from: private */
    public boolean isAddCardMode;
    private final C2895z<Boolean> isBackBtnBlocked;
    public boolean isFirstTimeLoggedIn;
    private String lastName;
    private String line1;
    private final C2895z<List<ShippingMethods>> listOfPickUpMethodsLD;
    private List<ShippingAddress> listOfShippingAddresses;
    private final C2895z<List<ShippingAddress>> listOfShippingAddressesLD;
    private final C2895z<List<ShippingMethods>> listOfShippingMethodsLD;
    private final C2895z<PayPalEnterLoadingSpinner.LoadingTextPhases> loadingTextPhases;
    private final C2895z<Boolean> logoutCompletedFlag;
    private Native3pEligibilityCheck native3pEligibilityCheck;
    private NativePayWithCryptoCheck nativePayWithCryptoCheck;
    private final C2895z<Boolean> payNowFlag;
    private final C2895z<String> payToken;
    private final C2895z<Boolean> paymentSourceCardViewClickedFlag;
    public SDKInterceptFinishListener postApproveSDKInterceptFinishListener;
    private final PostAuthSuccessHandler postAuthSuccessHandler;
    public SDKInterceptFinishListener postReviewSDKInterceptFinishListener;
    public SDKInterceptFinishListener preReviewSDKInterceptFinishListener;
    /* access modifiers changed from: private */
    public final PYPLCheckoutUtils pyplCheckoutUtils;
    /* access modifiers changed from: private */
    public final Repository repository;
    private final DebugConfigManager sDebugConfigManager;
    public ScaUiListener scaUiListener;
    private final C2895z<String> searchScreenTitle;
    private final C2895z<ShippingAddress> selectedShippingAddress;
    private final C2895z<ShippingMethods> selectedShippingMethods;
    private final SetCheckoutStateUseCase setCheckoutStateUseCase;
    /* access modifiers changed from: private */
    public ShippingCallbackHandler shippingCallbackHandler;
    private boolean shouldPaymentButtonBeVisible;
    private boolean shouldWaitForStartupAnimation;
    private final C2895z<Boolean> startupParamsSet;
    private final C2895z<ShippingMethodType> supportedShippingMethodType;
    private final ThreeDSDecisionFlow threeDSDecisionFlow;
    private final C2895z<ThreeDSTopBanner> threeDSErrorBanner;
    private String threeDSPaymentAuthenticationRequest;
    private String threeDSTransactionId;
    private final ThreeDSUseCase threeDSUseCase;
    private String threeDSV1JWT;
    private String threeDSV1Url;
    private final C2895z<String> toConversionFormat;
    private final C2895z<String> totalFormat;
    private VmLogoutListener vmLogoutListener;

    /* renamed from: com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel$5 */
    public static /* synthetic */ class C172615 {

        /* renamed from: $SwitchMap$com$paypal$pyplcheckout$events$model$ContingencyProcessingStatus */
        public static final /* synthetic */ int[] f37778x98d00819;
        public static final /* synthetic */ int[] $SwitchMap$com$paypal$pyplcheckout$events$model$ContingencyType;
        public static final /* synthetic */ int[] $SwitchMap$com$paypal$pyplcheckout$threeds$ActionCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|(3:27|28|30)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0080 */
        static {
            /*
                com.paypal.pyplcheckout.events.model.ContingencyType[] r0 = com.paypal.pyplcheckout.events.model.ContingencyType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$paypal$pyplcheckout$events$model$ContingencyType = r0
                r1 = 1
                com.paypal.pyplcheckout.events.model.ContingencyType r2 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V1_CONTINGENCY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$paypal$pyplcheckout$events$model$ContingencyType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.paypal.pyplcheckout.events.model.ContingencyType r3 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V2_CONTINGENCY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus[] r2 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f37778x98d00819 = r2
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_JWT_1_FAILED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f37778x98d00819     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_JWT_2_FAILED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = f37778x98d00819     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_LOOK_UP_FAILED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = f37778x98d00819     // Catch:{ NoSuchFieldError -> 0x004e }
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_AUTHENTICATE_FAILED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r2 = f37778x98d00819     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r2 = f37778x98d00819     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_CANCEL_CLICKED     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r2 = f37778x98d00819     // Catch:{ NoSuchFieldError -> 0x006f }
                com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r3 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_RESOLVE_FAILED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r4 = 7
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                com.paypal.pyplcheckout.threeds.ActionCode[] r2 = com.paypal.pyplcheckout.threeds.ActionCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$paypal$pyplcheckout$threeds$ActionCode = r2
                com.paypal.pyplcheckout.threeds.ActionCode r3 = com.paypal.pyplcheckout.threeds.ActionCode.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0080 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0080 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0080 }
            L_0x0080:
                int[] r1 = $SwitchMap$com$paypal$pyplcheckout$threeds$ActionCode     // Catch:{ NoSuchFieldError -> 0x008a }
                com.paypal.pyplcheckout.threeds.ActionCode r2 = com.paypal.pyplcheckout.threeds.ActionCode.CANCEL     // Catch:{ NoSuchFieldError -> 0x008a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x008a }
            L_0x008a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel.C172615.<clinit>():void");
        }
    }

    public MainPaysheetViewModel(Repository repository2, AbManager abManager2, DebugConfigManager debugConfigManager, ThreeDSDecisionFlow threeDSDecisionFlow2, final Events events2, PYPLCheckoutUtils pYPLCheckoutUtils, EligibilityManager eligibilityManager2, ShippingCallbackHandler shippingCallbackHandler2, PostAuthSuccessHandler postAuthSuccessHandler2, Native3pEligibilityCheck native3pEligibilityCheck2, NativePayWithCryptoCheck nativePayWithCryptoCheck2, ThreeDSUseCase threeDSUseCase2, SetCheckoutStateUseCase setCheckoutStateUseCase2, AuthRepository authRepository2, AddressRepository addressRepository2, AuthHandlerProvider authHandlerProvider2) {
        this.isFirstTimeLoggedIn = true;
        this.shouldWaitForStartupAnimation = false;
        this.shouldPaymentButtonBeVisible = true;
        this.isActionButtonClickEnabled = true;
        this.isAddCardMode = false;
        this.repository = repository2;
        this.abManager = abManager2;
        this.sDebugConfigManager = debugConfigManager;
        this.threeDSDecisionFlow = threeDSDecisionFlow2;
        this.events = events2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
        this.eligibilityManager = eligibilityManager2;
        this.shippingCallbackHandler = shippingCallbackHandler2;
        this.native3pEligibilityCheck = native3pEligibilityCheck2;
        this.nativePayWithCryptoCheck = nativePayWithCryptoCheck2;
        this.threeDSUseCase = threeDSUseCase2;
        this.setCheckoutStateUseCase = setCheckoutStateUseCase2;
        this.authRepository = authRepository2;
        this.addressRepository = addressRepository2;
        this.listOfShippingAddressesLD = new C2895z<>();
        this.selectedShippingAddress = new C2895z<>();
        this.listOfShippingMethodsLD = new C2895z<>();
        this.listOfPickUpMethodsLD = new C2895z<>();
        this.selectedShippingMethods = new C2895z<>();
        this.supportedShippingMethodType = new C2895z<>();
        this.toConversionFormat = new C2895z<>();
        this.fromConversionFormat = new C2895z<>();
        this.formattedConversionToAmount = new C2895z<>();
        this.grandTotal = new C2895z<>();
        this.conversionRate = new C2895z<>();
        this.conversionType = new C2895z<>();
        this.totalFormat = new C2895z<>();
        this.formattedConvertedAmount = new C2895z<>();
        this.payNowFlag = new C2895z<>();
        this.checkoutCompletedFlag = new C2895z<>();
        this.isBackBtnBlocked = new C2895z<>();
        this.logoutCompletedFlag = new C2895z<>();
        this.fetchingUserDataCompletedFlag = new C2895z<>();
        this.startupParamsSet = new C2895z<>();
        this.payToken = new C2895z<>();
        this.buttonSessionID = new C2895z<>();
        this.loadingTextPhases = new C2895z<>();
        this.paymentSourceCardViewClickedFlag = new C2895z<>();
        this.contingencyeventsModel = new C2895z<>();
        this.firebaseConnected = new C2895z<>();
        this.searchScreenTitle = new C2895z<>();
        this.threeDSErrorBanner = new C2895z<>();
        this.preReviewSDKInterceptFinishListener = new C8477d(events2);
        this.postReviewSDKInterceptFinishListener = new C5380a(events2);
        this.postApproveSDKInterceptFinishListener = new C4237u6(events2, 6);
        events2.listen(PayPalEventTypes.POST_AUTH_SUCCESS_HANDLER_RESPONSE, new C17264a(this, 0));
        this.scaUiListener = new ScaUiListener() {
            public void onCancelled() {
                events2.fire(PayPalEventTypes.CTA_BTN_BLOCK_REQUEST, new Success(Boolean.FALSE));
            }

            public void onContingencyCleared() {
                if (MainPaysheetViewModel.this.getPaymentContingencies() == null || MainPaysheetViewModel.this.getPaymentContingencies().getThreeDSContingencyData() == null) {
                    MainPaysheetViewModel.this.approvePayment();
                } else {
                    events2.fire(PayPalEventTypes.SCA_ON_CONTINGENCY_CLEARED, new Success(Boolean.TRUE));
                }
            }

            public void onProgress() {
                events2.fire(PayPalEventTypes.CTA_BTN_BLOCK_REQUEST, new Success(Boolean.TRUE));
            }

            public void onStrongAuthenticationComplete() {
                events2.fire(PayPalEventTypes.CTA_BTN_BLOCK_REQUEST, new Success(Boolean.FALSE));
                events2.fire(PayPalEventTypes.FINISH_CHECKOUT, new Success(Boolean.TRUE));
                events2.fire(PayPalEventTypes.CHECKOUT_BUTTON_CLICKED, new Success(new CheckoutFinishedEventModel(MainPaysheetViewModel.this.isActionButtonClickEnabled, MainPaysheetViewModel.this.isAddCardMode)));
            }
        };
        this.authHandlerProvider = authHandlerProvider2;
        this.postAuthSuccessHandler = postAuthSuccessHandler2;
    }

    private void closePaysheetAfterPostApproveInterceptComplete() {
        ApprovePaymentResponse approvePaymentResponse = this.sDebugConfigManager.getApprovePaymentResponse();
        if (approvePaymentResponse == null) {
            PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E564, "checkout finish response from repository is null", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_CHECKOUT_FINISH_RESPONSE);
            this.pyplCheckoutUtils.fallBack("postApproveIntercept", PEnums.FallbackReason.POST_APPROVE_INTERCEPT_FAILURE, PEnums.FallbackCategory.CHECKOUT_ERRORS, "checkout finish response from repository is null", (PEnums.TransitionName) null, ErrorReason.APPROVE_ORDER_ERROR, new ApiErrorException("Approve payment response is null"));
            return;
        }
        if (DebugConfigManager.getInstance().isSmartPaymentCheckout()) {
            this.pyplCheckoutUtils.returnToProviderWithResponse(approvePaymentResponse, ReturnToProviderOperationType.Payment.INSTANCE, "PYPLPaySheetActivity");
        } else {
            String href = approvePaymentResponse.getHref() != null ? approvePaymentResponse.getHref() : getReturnUrl();
            ShippingMethodType shippingMethodType = new ShippingMethodType(ShippingMethodType.Type.SHIPPING);
            ShippingMethods value = this.selectedShippingMethods.getValue();
            if (value != null) {
                shippingMethodType = new ShippingMethodType(value.getType());
            }
            this.pyplCheckoutUtils.setSelectedShippingMethodType(shippingMethodType);
            this.pyplCheckoutUtils.returnToProvider(href, ReturnToProviderOperationType.Payment.INSTANCE, "PYPLPaySheetActivity");
        }
        this.checkoutCompletedFlag.setValue(Boolean.TRUE);
    }

    private AuthHandler createAuthHandler() {
        AuthHandler create = this.authHandlerProvider.create();
        create.setDoAfterAuth(new C17266c(this));
        return create;
    }

    private void fetchUserCheckoutResponse() {
        this.events.fire(PayPalEventTypes.FETCH_USER_AND_CHECKOUT_ATTEMPTED, (ResultData) null);
        this.repository.fetchUserCheckoutResponse();
    }

    private void finishCheckoutAndMaybeMakePostApproveCall() {
        this.setCheckoutStateUseCase.invoke(CheckoutState.PostApprove.INSTANCE);
        PLog.transition(PEnums.TransitionName.STARTED_POST_APPROVE_CALLS, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E625, PEnums.StateName.REVIEW);
        this.sDebugConfigManager.getPostApproveSDKIntercept().intercept(Progression.POST_APPROVE, this.postApproveSDKInterceptFinishListener);
    }

    @IgnoreGeneratedTestReport
    private void fireThreeDsContingencyEvent(ContingencyProcessingStatus contingencyProcessingStatus, String str) {
        this.events.fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(ContingencyType.THREE_DS_V2_CONTINGENCY, contingencyProcessingStatus, (Exception) null, str, getLastKnownThreeDsSource())));
    }

    private ThreeDSSource getLastKnownThreeDsSource() {
        return this.threeDSUseCase.invoke().getValue().getSource();
    }

    private void handleOnShippingChangeCallback() {
        if (this.repository.getSelectedShippingMethod() != null) {
            ShippingMethodType.Type type = this.repository.getSelectedShippingMethod().getType();
            ShippingMethodType.Type type2 = ShippingMethodType.Type.SHIPPING;
            if (type.equals(type2)) {
                int selectedAddressIndex = this.repository.getSelectedAddressIndex();
                this.shippingCallbackHandler.validateShippingCallback(new ShippingCallbackRequestType(ShippingCallbackRequestType.Type.SHIPPING_ADDRESS), new ShippingMethodType(type2), selectedAddressIndex, selectedAddressIndex);
            }
        }
    }

    private Boolean hasMultipleFundingOptions() {
        boolean z = true;
        if (this.repository.getFundingOptions() == null || this.repository.getFundingOptions().size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private Boolean isDuplicatedContingencyError(ContingencyEventsModel contingencyEventsModel) {
        return Boolean.valueOf(contingencyEventsModel.getException() != null && (contingencyEventsModel.getException() instanceof DuplicatedContingencyException));
    }

    private boolean isNativeThreeDsSupported() {
        return AppBuildConfig.isThreeDsVariant() && (this.sDebugConfigManager.isSmartPaymentCheckout() || FeatureFlagManager.isEnabled(Feature.THIRD_PARTY_3DS).isEnabled());
    }

    private Boolean isPaymentThreeDsContingency() {
        return Boolean.valueOf(getLastKnownThreeDsSource() == ThreeDSSource.CTA);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C19394m lambda$createAuthHandler$4(AuthenticationSuccess authenticationSuccess) {
        this.postAuthSuccessHandler.doAfterAuth(authenticationSuccess);
        return C19394m.f43287a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createContingencyEventListener$17(EventType eventType, ResultData resultData) {
        ContingencyEventsModel contingencyEventsModel = (ContingencyEventsModel) ((Success) resultData).getData();
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        if (!(contingencyType == null || contingencyProcessingStatus == null)) {
            int i = C172615.$SwitchMap$com$paypal$pyplcheckout$events$model$ContingencyType[contingencyType.ordinal()];
            boolean z = true;
            if (i == 1 || i == 2) {
                switch (C172615.f37778x98d00819[contingencyProcessingStatus.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        if (!isPaymentThreeDsContingency().booleanValue()) {
                            PLog.m28734i(TAG, "non-CTA 3DS Flow");
                        } else if (isDuplicatedContingencyError(contingencyEventsModel).booleanValue()) {
                            fallbackWithErrors("Duplicated threeDS contingency");
                            return;
                        } else if (!hasMultipleFundingOptions().booleanValue()) {
                            fallbackWithErrors("three ds failed, empty carousel");
                            return;
                        } else {
                            deleteSelectedFundingOptionFromCheckoutSession();
                            if (!(this.repository.getSelectedFundingOption() == null || this.repository.getSelectedFundingOption().getFundingInstrument() == null || this.repository.getSelectedFundingOption().getFundingInstrument().getLabel() == null || this.repository.getSelectedFundingOption().getFundingInstrument().getLastDigits() == null)) {
                                if (this.repository.getFundingOptions() == null || this.repository.getFundingOptions().isEmpty()) {
                                    z = false;
                                }
                                setThreeDSErrorBanner(new ThreeDSTopBanner(z));
                            }
                        }
                        PaymentContingencies supportedContingencies = this.repository.getSupportedContingencies();
                        if (supportedContingencies != null) {
                            supportedContingencies.setThreeDSContingencyData((ThreeDSContingencyData) null);
                            break;
                        }
                        break;
                    default:
                        PLog.m28734i(TAG, "ContingencyProcessingStatus of type $contingencyProcessingStatus not handled");
                        break;
                }
            } else {
                PLog.m28734i(TAG, "ContingencyType of type $contingencyType not handled");
            }
        }
        setContingencyEventsModel(contingencyEventsModel);
        this.repository.setContingencyEventsModel(contingencyEventsModel);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createPlanningCallEventListener$19(EventType eventType, ResultData resultData) {
        if (resultData instanceof Success) {
            PLog.transition(PEnums.TransitionName.BLOCKING_CONTINGENCIES_RESOLVED, PEnums.Outcome.SUCCEEDED);
            fetchUserCheckoutResponse();
            return;
        }
        try {
            fallbackWithErrors((String) ((Error) resultData).getData());
        } catch (Exception unused) {
            fallbackWithoutErrors();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserCheckoutEventListener$18(EventType eventType, ResultData resultData) {
        UserCheckoutResponse userCheckoutResponse;
        if ((resultData instanceof Success) && (userCheckoutResponse = (UserCheckoutResponse) ((Success) resultData).getData()) != null) {
            if (!userCheckoutResponse.hasContingencyErrors() || !this.sDebugConfigManager.getHostHandlesBlockingContingencies()) {
                clearShippingData();
                CheckoutIdlingResource.getInstance().increment();
                parseUserAndCheckoutResponse(userCheckoutResponse);
                checkPayWithCryptoEligibility();
                return;
            }
            fireContingencyErrorEvent(userCheckoutResponse);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForThreeDSevents$22(EventType eventType, ResultData resultData) {
        ThreeDsV1Data threeDsV1Data = (ThreeDsV1Data) ((Success) resultData).getData();
        start3DSV1Flow(threeDsV1Data.getRedirectURL(), threeDsV1Data.getJwt());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Events events2, Status status) {
        PLog.transition(PEnums.TransitionName.FINISHED_PRE_REVIEW_CALLS, status == Status.SUCCESS ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILURE, PEnums.EventCode.E626, PEnums.StateName.READY, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, status.name());
        events2.fire(PayPalEventTypes.FINISHED_PRE_REVIEW_CALLS, new Success(status));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(Events events2, Status status) {
        PLog.transition(PEnums.TransitionName.FINISHED_POST_REVIEW_CALLS, status == Status.SUCCESS ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILURE, PEnums.EventCode.E627, PEnums.StateName.REVIEW, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, status.name());
        events2.fire(PayPalEventTypes.FINISHED_POST_REVIEW_CALLS, new Success(status));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$2(Events events2, Status status) {
        PLog.transition(PEnums.TransitionName.FINISHED_POST_APPROVE_CALLS, status == Status.SUCCESS ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILURE, PEnums.EventCode.E628, PEnums.StateName.REVIEW, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, status.name());
        events2.fire(PayPalEventTypes.FINISHED_POST_APPROVE_CALLS, new Success(status));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(EventType eventType, ResultData resultData) {
        if (this.sDebugConfigManager.getLoadingText() == null) {
            this.loadingTextPhases.postValue(PayPalEnterLoadingSpinner.LoadingTextPhases.GettingUserCheckoutResponse.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$10(EventType eventType, ResultData resultData) {
        if (resultData instanceof Success) {
            finalizeCheckout();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$11(EventType eventType, ResultData resultData) {
        if (!(resultData instanceof Success)) {
            return;
        }
        if (((Status) ((Success) resultData).getData()) == Status.SUCCESS) {
            scaStepUp(this.scaUiListener);
        } else {
            this.events.fire(PayPalEventTypes.CTA_BTN_BLOCK_REQUEST, new Success(Boolean.FALSE));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$12(EventType eventType, ResultData resultData) {
        if (isPaymentThreeDsContingency().booleanValue()) {
            approvePayment();
        } else {
            PLog.m28734i(TAG, "non-CTA 3DS Flow");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$13(EventType eventType, ResultData resultData) {
        closePaysheetAfterPostApproveInterceptComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$14(EventType eventType, ResultData resultData) {
        if (resultData != null) {
            this.isBackBtnBlocked.setValue(Boolean.valueOf(((Boolean) ((Success) resultData).getData()).booleanValue()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$15(EventType eventType, ResultData resultData) {
        if (resultData instanceof Success) {
            this.firebaseConnected.postValue(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$16(EventType eventType, ResultData resultData) {
        if (resultData instanceof Success) {
            this.addressRepository.addNewShippingAddress((NewShippingAddressRequest) ((Success) resultData).getData());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$5() {
        this.logoutCompletedFlag.setValue(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$6(EventType eventType, ResultData resultData) {
        this.setCheckoutStateUseCase.invoke(CheckoutState.PostReview.INSTANCE);
        this.isFirstTimeLoggedIn = false;
        if (!this.shouldWaitForStartupAnimation) {
            setFetchingUserDataCompletedFlag(true);
        } else {
            PLog.transition(PEnums.TransitionName.FINAL_LOADING_ANIMATION, PEnums.Outcome.STARTED);
            this.events.fire(PayPalEventTypes.START_FINAL_LOADING_ANIMATION, new Success(Boolean.TRUE));
        }
        this.events.fire(PayPalEventTypes.FETCH_USER_DATA_COMPLETE, new Success(Boolean.TRUE));
        this.shippingCallbackHandler.getHomeScreenBlockingFlag().postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.REFRESH_IS_COMPLETED));
        this.repository.setStage(PEnums.Stage.PAYSHEET_SHOWN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$7(EventType eventType, ResultData resultData) {
        ApprovePaymentResponse approvePaymentResponse = (ApprovePaymentResponse) ((Success) resultData).getData();
        setApproveResponseOnRepo(approvePaymentResponse);
        if (approvePaymentResponse == null || approvePaymentResponse.getData() == null || approvePaymentResponse.getData().getApprovePayment() == null || approvePaymentResponse.getData().getApprovePayment().getPaymentContingencies() == null || !ThreeDSDecisionFlow.Companion.isThreeDSFlow(approvePaymentResponse.getData().getApprovePayment().getPaymentContingencies())) {
            finishCheckoutAndMaybeMakePostApproveCall();
        } else if (isNativeThreeDsSupported()) {
            startThreeDsFlow(this.sDebugConfigManager.getCheckoutBaseActivity());
        } else {
            this.pyplCheckoutUtils.fallBack(TAG, PEnums.FallbackReason.THREE_DS_CHALLENGE_IN_3P, PEnums.FallbackCategory.INELIGIBLE_TRAFFIC, "3DS is not enabled for 3P", (PEnums.TransitionName) null, ErrorReason.NONE, (Exception) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$8(EventType eventType, ResultData resultData) {
        if (resultData instanceof Success) {
            this.startupParamsSet.postValue(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onLifeCycleCreate$9(EventType eventType, ResultData resultData) {
        if (resultData instanceof Success) {
            startThreeDsFlow((Activity) ((Context) ((Success) resultData).getData()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C19394m lambda$threeDSAuthenticateAndComplete$21(ContingencyEventsModel contingencyEventsModel) {
        this.events.fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(contingencyEventsModel));
        return C19394m.f43287a;
    }

    private void listenForThreeDSevents() {
        this.events.listen(PayPalEventTypes.START_THREE_DS_V1_FLOW, new C17265b(this, 1));
    }

    private void logDuplicateTransactionSession() {
        Context applicationContext = this.sDebugConfigManager.getApplicationContext();
        if (applicationContext != null) {
            String paymentToken = this.repository.getPaymentToken();
            String smartPaymentButtonSessionId = this.repository.getSmartPaymentButtonSessionId();
            if (smartPaymentButtonSessionId == null) {
                smartPaymentButtonSessionId = "";
            }
            List<TransactionSession> transactionSessions = Cache.INSTANCE.getTransactionSessions(applicationContext);
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis = System.currentTimeMillis();
            if (transactionSessions != null) {
                for (TransactionSession next : transactionSessions) {
                    if (paymentToken.equals(next.getEcToken())) {
                        PLog.impression(PEnums.TransitionName.DUPLICATE_EC_TOKEN, PEnums.Outcome.EC_TOKEN_CHECKED, PEnums.EventCode.E157, PEnums.StateName.STARTUP, "duplicate ec-token");
                    } else if (smartPaymentButtonSessionId.equals(next.getButtonSessionId())) {
                        PLog.impression(PEnums.TransitionName.DUPLICATE_BUTTON_SESSION_ID, PEnums.Outcome.BUTTON_SESSION_ID_CHECKED, PEnums.EventCode.E157, PEnums.StateName.STARTUP, "duplicate button session id");
                    }
                    if (currentTimeMillis - next.getTimestamp() < 300000) {
                        arrayList.add(next);
                    }
                }
            }
            arrayList.add(new TransactionSession(currentTimeMillis, paymentToken, smartPaymentButtonSessionId));
            Cache.INSTANCE.saveTransactionSessions(applicationContext, arrayList);
        }
    }

    /* access modifiers changed from: private */
    public void logInUser() {
        this.repository.setStage(PEnums.Stage.PREPARING_AUTH);
        PLog.decision(PEnums.TransitionName.NATIVE_XO_AUTH_ATTEMPTED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E214, PEnums.StateName.REVIEW, getClass().getSimpleName());
        if (this.sDebugConfigManager.getLoadingText() == null) {
            this.loadingTextPhases.postValue(PayPalEnterLoadingSpinner.LoadingTextPhases.LoggingInUser.INSTANCE);
        }
        this.authRepository.login(createAuthHandler());
    }

    private void logShippingAddressVisibility() {
        if (this.repository.allowShippingAddressChange()) {
            PLog.transition(PEnums.TransitionName.SHIPPING_ADDRESS_CHANGE_ENABLED, PEnums.Outcome.ENABLED);
        } else {
            PLog.transition(PEnums.TransitionName.SHIPPING_ADDRESS_CHANGE_ENABLED, PEnums.Outcome.DISABLED);
        }
        if (shouldShowShipping()) {
            PLog.transition(PEnums.TransitionName.SHIPPING_ADDRESS_VISIBLE, PEnums.Outcome.ENABLED);
        } else {
            PLog.transition(PEnums.TransitionName.SHIPPING_ADDRESS_VISIBLE, PEnums.Outcome.DISABLED);
        }
    }

    private void logViewModelLifecycle(String str) {
        PLog.transition(PEnums.TransitionName.MAIN_VIEW_MODEL_LIFECYCLE, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, PEnums.StateName.STARTUP, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, str);
    }

    @IgnoreGeneratedTestReport
    private void makeLsatUpgradeCall() {
        this.repository.fetchLsatUpgradeStatus((C19857l<? super Boolean, C19394m>) null);
    }

    @C2845b0(Lifecycle.Event.ON_CREATE)
    private void onLifeCycleCreate() {
        logViewModelLifecycle("created");
        this.setCheckoutStateUseCase.invoke(CheckoutState.PreReview.INSTANCE);
        if (this.sDebugConfigManager.getLoadingText() == null) {
            this.loadingTextPhases.setValue(PayPalEnterLoadingSpinner.LoadingTextPhases.WaitingForFirebase.INSTANCE);
        } else {
            this.loadingTextPhases.setValue(new PayPalEnterLoadingSpinner.LoadingTextPhases.CustomMessage(this.sDebugConfigManager.getLoadingText()));
        }
        this.vmLogoutListener = new C2783s(this, 3);
        this.eligibilityManager.createEligibilityListener();
        this.shippingCallbackHandler.setupListeners();
        createContingencyEventListener();
        createUserCheckoutEventListener();
        createPlanningCallEventListener();
        this.events.listen(PayPalEventTypes.FINISHED_PRE_REVIEW_CALLS, new C17224a(this, 5));
        this.events.listen(PayPalEventTypes.FINISHED_APPROVE_PAYMENT_CALL, new C17193a(this, 8));
        this.events.listen(PayPalEventTypes.CHECKOUT_PARAMS_SET, new C17225b(this, 7));
        this.events.listen(PayPalEventTypes.START_THREE_DS_FLOW_REQUEST, new C17203a(this, 8));
        this.events.listen(PayPalEventTypes.FINALIZE_CHECKOUT, new C17198a(this, 8));
        this.events.listen(PayPalEventTypes.FINISHED_POST_REVIEW_CALLS, new C17240d(this, 5));
        this.events.listen(PayPalEventTypes.CLEARED_THREE_DS_CONTINGENCIES, new C17183a(this, 3));
        this.events.listen(PayPalEventTypes.FINISHED_POST_APPROVE_CALLS, new C17248l(this, 2));
        this.events.listen(PayPalEventTypes.BACK_BTN_BLOCK_REQUEST, new C17264a(this, 1));
        if (isSmartPaymentCheckout()) {
            this.events.listen(ExtendedPayPalEventTypes.FINISHED_FIREBASE_AUTH, new C17188f(this, 4));
            logDuplicateTransactionSession();
            updateClientConfigBefore(new C8549a(this));
            this.events.listen(PayPalEventTypes.NEW_SHIPPING_ADDRESS_REQUESTED, new C17190h(this, 5));
            listenForThreeDSevents();
            return;
        }
        check3pElmoEligibility();
    }

    @IgnoreGeneratedTestReport
    public void addNewAddress(NewShippingAddressRequest newShippingAddressRequest) {
        this.addressRepository.addNewShippingAddress(newShippingAddressRequest);
    }

    public void addNewShippingAddressViaCustomTab(final Activity activity) {
        this.pyplCheckoutUtils.openChromeCustomTab(activity, new NativeSSOListener() {
            private String redirectUri;

            public void ssoRedirectFetchFailed() {
                PLog.error(PEnums.ErrorType.WARNING, PEnums.EventCode.E304, "WebSSO Auth failed in shipping", (String) null, (Throwable) null, PEnums.TransitionName.ADD_SHIPPING_ADDRESS_CLICKED, PEnums.StateName.SHIPPING);
                MainPaysheetViewModel.this.pyplCheckoutUtils.openChromeCustomTabs(Uri.parse(this.redirectUri), activity);
            }

            public void ssoRedirectFetchSuccess(String str) {
                this.redirectUri = str;
                MainPaysheetViewModel.this.pyplCheckoutUtils.openChromeCustomTabs(Uri.parse(str), activity);
            }
        }, PYPLCheckoutUtils.FallbackScenario.ADD_SHIPPING);
    }

    public boolean allowShippingAddressChange() {
        return this.repository.allowShippingAddressChange();
    }

    @IgnoreGeneratedTestReport
    public void approvePayment() {
        this.repository.setStage(PEnums.Stage.FINISHING);
        this.repository.approvePayment();
    }

    public void changeTitle(String str) {
        this.searchScreenTitle.setValue(str);
    }

    public void check3pElmoEligibility() {
        this.native3pEligibilityCheck.is3pNativeEligible(new Native3pEligibilityCheck.EligibilityCallback() {
            public void onFailed() {
                MainPaysheetViewModel.this.pyplCheckoutUtils.fallBack("initialSdkLaunch", PEnums.FallbackReason.NATIVE_KILL_SWITCH_FAILED, PEnums.FallbackCategory.INELIGIBLE_TRAFFIC, "ELMO kill switch treatment.", (PEnums.TransitionName) null, ErrorReason.NONE, (Exception) null);
            }

            public void onPassed() {
                MainPaysheetViewModel mainPaysheetViewModel = MainPaysheetViewModel.this;
                mainPaysheetViewModel.updateClientConfigBefore(new C17267d(mainPaysheetViewModel));
            }
        });
    }

    public void checkPayWithCryptoEligibility() {
        if (!this.repository.getHasCryptoFundingInstruments()) {
            return;
        }
        if (!this.nativePayWithCryptoCheck.isPayWithCryptoEligible() || !FeatureFlagManager.isEnabled(Feature.CRYPTO_PAYMENTS).isEnabled()) {
            this.pyplCheckoutUtils.fallBack("userAndCheckout", PEnums.FallbackReason.PAY_WITH_CRYPTO_RAMP_FAILED, PEnums.FallbackCategory.INELIGIBLE_TRAFFIC, "Pay with crypto treatment.", (PEnums.TransitionName) null, ErrorReason.NONE, (Exception) null);
        }
    }

    public void clearShippingData() {
        this.repository.clearShippingData();
    }

    public void createContingencyEventListener() {
        this.events.listen(PayPalEventTypes.CONTINGENCY_EVENT, new C17265b(this, 0));
    }

    public void createPlanningCallEventListener() {
        this.events.listen(PayPalEventTypes.MAKE_PLANNING_CALL, new C17199b(this, 4));
    }

    public void createUserCheckoutEventListener() {
        this.events.listen(PayPalEventTypes.FINISHED_USER_CHECKOUT_RESPONSE, new C17185c(this, 3));
    }

    public void deleteSelectedFundingOptionFromCheckoutSession() {
        PLog.decision(PEnums.TransitionName.THREE_DS_FUNDING_INSTRUMENT_DISABLED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E615, PEnums.StateName.THREE_DS, (String) null, (String) null, "3DS fi deleted");
        this.repository.deleteSelectedFundingOptionFromCheckoutSession();
    }

    public void fallbackWithErrors(String str) {
        PEnums.TransitionName transitionName = this.sDebugConfigManager.shouldFallBackToWeb() ? PEnums.TransitionName.FALLBACK_TO_WEB : PEnums.TransitionName.FALLBACK_TO_NATIVE;
        PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E584, str, transitionName);
        this.pyplCheckoutUtils.fallBack("user checkout", PEnums.FallbackReason.UNKNOWN_CHECKOUT_ISSUE.setFallbackReason(str), PEnums.FallbackCategory.CHECKOUT_ERRORS, str, transitionName, ErrorReason.USER_AND_CHECKOUT_ERROR, new ApiErrorException("Error in user and checkout response"));
    }

    public void fallbackWithoutErrors() {
        PEnums.TransitionName transitionName = this.sDebugConfigManager.shouldFallBackToWeb() ? PEnums.TransitionName.FALLBACK_TO_WEB : PEnums.TransitionName.FALLBACK_TO_NATIVE;
        PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E584, "Contingency error not returned from host app", transitionName);
        this.pyplCheckoutUtils.fallBack("user checkout", PEnums.FallbackReason.CHECKOUT_RESPONSE_ERRORS, PEnums.FallbackCategory.CHECKOUT_ERRORS, "Contingency error not returned from host app", transitionName, ErrorReason.USER_AND_CHECKOUT_ERROR, new ApiErrorException("Error in user and checkout response"));
    }

    public final String fetchCreditOfferTerms() {
        return this.repository.getTermsText();
    }

    public final String fetchCreditOfferTermsLink() {
        return this.repository.getTermLink();
    }

    public final String fetchCreditOfferText() {
        return this.repository.getCreditOfferText();
    }

    public final List<CreditPPCOffer> fetchCreditPPCOffers() {
        return this.repository.getCreditPpcOffers();
    }

    public final String fetchScaContextId() {
        return this.repository.getScaContextId();
    }

    public void fetchShippingAddresses() {
        this.listOfShippingAddresses = this.repository.getShippingAddressList();
        String str = TAG;
        PLog.m28728dR(str, "fetchShippingAddresses() called");
        List<ShippingAddress> list = this.listOfShippingAddresses;
        if (list != null && !list.isEmpty()) {
            int i = this.shippingCallbackHandler.shippingCallbackSelectedIndex;
            if (i != -1) {
                this.repository.setSelectedAddress(i);
            }
            ShippingAddress selectedAddress = this.repository.getSelectedAddress();
            if (selectedAddress != null) {
                Name name = selectedAddress.getName();
                this.line1 = selectedAddress.getFullAddress();
                String line2 = selectedAddress.getLine2();
                if (name != null) {
                    this.fullName = name.getFullName();
                }
                StringBuilder h = C0072d.m201h("getDefaultAddress() called line1");
                h.append(this.line1);
                h.append(" line 2 ");
                h.append(line2);
                PLog.m28726d(str, h.toString());
            }
        }
    }

    public void finalizeCheckout() {
        this.setCheckoutStateUseCase.invoke(CheckoutState.PreApprove.INSTANCE);
        this.events.fire(PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION, new Success(Boolean.TRUE));
        PLog.transition(PEnums.TransitionName.STARTED_POST_REVIEW_CALLS, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E624, PEnums.StateName.REVIEW);
        this.sDebugConfigManager.getPostReviewSDKIntercept().intercept(Progression.POST_REVIEW, this.postReviewSDKInterceptFinishListener);
    }

    public void finishFragment(String str, Fragment fragment) {
        ContentRouter.INSTANCE.finishFragment(str, fragment);
    }

    public void fireContingencyErrorEvent(UserCheckoutResponse userCheckoutResponse) {
        PLog.error(PEnums.ErrorType.WARNING, PEnums.EventCode.E572, userCheckoutResponse.getFirstError() == null ? "Unknown contingency error" : userCheckoutResponse.getFirstError(), PEnums.TransitionName.BLOCKING_CONTINGENCIES_RECEIVED);
        this.events.fire(ExtendedPayPalEventTypes.CONTINGENCY_ERROR, new Error(userCheckoutResponse.getErrors()));
    }

    @IgnoreGeneratedTestReport
    public AbManager getAb() {
        return this.abManager;
    }

    public synchronized FundingInstrument getBackupFundingOption() {
        return this.repository.getBackupFunding();
    }

    public String getBufNameText() {
        return this.repository.getBufCardText();
    }

    @IgnoreGeneratedTestReport
    public C2895z<String> getButtonSessionId() {
        this.buttonSessionID.setValue(this.repository.getSmartPaymentButtonSessionId());
        return this.buttonSessionID;
    }

    @IgnoreGeneratedTestReport
    public Repository.CTAState getCallToActionState() {
        return this.repository.getCallToActionState();
    }

    @IgnoreGeneratedTestReport
    public String getCancelUrl() {
        return this.repository.getCancelUrl();
    }

    @IgnoreGeneratedTestReport
    public C2895z<Boolean> getCheckoutCompletedFlag() {
        return this.checkoutCompletedFlag;
    }

    @IgnoreGeneratedTestReport
    public C2895z<ContingencyEventsModel> getContingencyEventsModel() {
        return this.contingencyeventsModel;
    }

    public synchronized C2895z<String> getConversionRate() {
        this.conversionRate.setValue(this.repository.getConversionRateStr());
        return this.conversionRate;
    }

    public synchronized String getConversionRateStrFromRepo() {
        String conversionRateStr;
        conversionRateStr = this.repository.getConversionRateStr();
        String str = TAG;
        PLog.m28726d(str, "conversionratestr: " + conversionRateStr);
        return conversionRateStr;
    }

    public C2895z<CurrencyConversionType> getConversionType() {
        this.conversionType.setValue(this.repository.getSelectedCurrencyConversionType());
        return this.conversionType;
    }

    @IgnoreGeneratedTestReport
    public Repository.PayModeEnum getCurrentPayMode() {
        return this.repository.getPayMode();
    }

    @IgnoreGeneratedTestReport
    public C2895z<Boolean> getFetchingUserDataCompletedFlag() {
        return this.fetchingUserDataCompletedFlag;
    }

    @IgnoreGeneratedTestReport
    public C2895z<Boolean> getFirebaseConnected() {
        return this.firebaseConnected;
    }

    public synchronized C2895z<String> getFormattedConversionToAmount() {
        this.formattedConversionToAmount.setValue(this.repository.getFormattedConvertedAmount());
        return this.formattedConversionToAmount;
    }

    public synchronized C2895z<String> getFormattedConvertedAmount() {
        this.formattedConvertedAmount.setValue(this.repository.getFormattedConvertedAmount());
        return this.formattedConvertedAmount;
    }

    public synchronized String getFormattedToConversionAmount() {
        return this.repository.getFormattedConvertedAmount();
    }

    public synchronized C2895z<String> getFromConversionFormat() {
        this.fromConversionFormat.setValue(this.repository.getFromConversionCode());
        return this.fromConversionFormat;
    }

    @IgnoreGeneratedTestReport
    public String getFullName() {
        return this.fullName;
    }

    public synchronized C2895z<String> getGrandTotal() {
        this.grandTotal.setValue(this.repository.getTotalFormat());
        return this.grandTotal;
    }

    public boolean getIsCurrencyConverted() {
        return this.repository.isCurrencyConverted();
    }

    @IgnoreGeneratedTestReport
    public String getLine1() {
        return this.line1;
    }

    public C2895z<List<ShippingMethods>> getListOfPickUpMethods() {
        this.listOfPickUpMethodsLD.setValue(this.repository.getPickUpMethodsList());
        return this.listOfPickUpMethodsLD;
    }

    public synchronized C2895z<List<ShippingAddress>> getListOfShippingAddresses() {
        this.listOfShippingAddressesLD.setValue(this.repository.getShippingAddressList());
        return this.listOfShippingAddressesLD;
    }

    public C2895z<List<ShippingMethods>> getListOfShippingMethods() {
        this.listOfShippingMethodsLD.setValue(this.repository.getShippingMethodsList());
        return this.listOfShippingMethodsLD;
    }

    @IgnoreGeneratedTestReport
    public LiveData<PayPalEnterLoadingSpinner.LoadingTextPhases> getLoadingTextPhases() {
        return this.loadingTextPhases;
    }

    @IgnoreGeneratedTestReport
    public C2895z<Boolean> getLogoutCompletedFlag() {
        return this.logoutCompletedFlag;
    }

    public synchronized C2895z<Boolean> getPayNowFlag() {
        this.payNowFlag.setValue(Boolean.valueOf(Repository.PayModeEnum.PAY_NOW.equals(this.repository.getPayMode())));
        return this.payNowFlag;
    }

    @IgnoreGeneratedTestReport
    public C2895z<String> getPayToken() {
        this.payToken.setValue(this.repository.getPaymentToken());
        return this.payToken;
    }

    public synchronized PaymentContingencies getPaymentContingencies() {
        return this.repository.getSelectedCardContingencies();
    }

    @IgnoreGeneratedTestReport
    public LiveData<Boolean> getPaymentSourceCardViewClickedFlag() {
        return this.paymentSourceCardViewClickedFlag;
    }

    @IgnoreGeneratedTestReport
    public String getReturnUrl() {
        return this.repository.getReturnUrl();
    }

    @IgnoreGeneratedTestReport
    public C2895z<String> getSearchScreenTitle() {
        return this.searchScreenTitle;
    }

    public C2895z<ShippingAddress> getSelectedShippingAddress() {
        this.selectedShippingAddress.setValue(this.repository.getSelectedAddress());
        return this.selectedShippingAddress;
    }

    public C2895z<ShippingMethods> getSelectedShippingMethod() {
        this.selectedShippingMethods.setValue(this.repository.getSelectedShippingMethod());
        return this.selectedShippingMethods;
    }

    public synchronized String getSelectingFILabel() {
        return this.repository.getCardLabel();
    }

    @IgnoreGeneratedTestReport
    public boolean getShouldWaitForStartupAnimation() {
        return this.shouldWaitForStartupAnimation;
    }

    @IgnoreGeneratedTestReport
    public C2895z<Boolean> getStartupParamsSet() {
        return this.startupParamsSet;
    }

    public C2895z<ShippingMethodType> getSupportedShippingMethodType() {
        this.supportedShippingMethodType.setValue(this.repository.getSupportedShippingMethodType());
        return this.supportedShippingMethodType;
    }

    @IgnoreGeneratedTestReport
    public LiveData<ThreeDSTopBanner> getThreeDSErrorBanner() {
        return this.threeDSErrorBanner;
    }

    @IgnoreGeneratedTestReport
    public String getThreeDSPaymentAuthenticationRequest() {
        return this.threeDSPaymentAuthenticationRequest;
    }

    @IgnoreGeneratedTestReport
    public String getThreeDSTransactionId() {
        return this.threeDSTransactionId;
    }

    @IgnoreGeneratedTestReport
    public String getThreeDSV1JWT() {
        return this.threeDSV1JWT;
    }

    @IgnoreGeneratedTestReport
    public String getThreeDSV1Url() {
        return this.threeDSV1Url;
    }

    public synchronized C2895z<String> getToConversionFormat() {
        if (this.repository.canConvertFI()) {
            this.toConversionFormat.setValue(this.repository.getToConversionCode());
        }
        return this.toConversionFormat;
    }

    public synchronized C2895z<String> getTotalFormat() {
        this.totalFormat.setValue(this.repository.getTotalFormat());
        return this.totalFormat;
    }

    public VmLogoutListener getVmLogoutListener() {
        return this.vmLogoutListener;
    }

    public void handleCardinalResponse(ValidateResponseAlias validateResponseAlias) {
        if (validateResponseAlias != null) {
            ActionCode valueOf = ActionCode.valueOf(validateResponseAlias.getActionCode());
            int[] iArr = C172615.$SwitchMap$com$paypal$pyplcheckout$threeds$ActionCode;
            Objects.requireNonNull(valueOf);
            int i = iArr[valueOf.ordinal()];
            if (i == 1) {
                PLog.decision(PEnums.TransitionName.THREE_DS_CARDINAL_STEP_UP_FINISHED, PEnums.Outcome.SUCCESS, PEnums.EventCode.E605, PEnums.StateName.THREE_DS, (String) null, (String) null, "3ds cardinal step up finished");
                fireThreeDsContingencyEvent(ContingencyProcessingStatus.THREE_DS_CARDINAL_V2_SUCCESS, "successful cardinal step up");
                threeDSAuthenticateAndComplete();
            } else if (i != 2) {
                PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
                PEnums.EventCode eventCode = PEnums.EventCode.E612;
                StringBuilder h = C0072d.m201h("Cardinal validate response error: ");
                h.append(validateResponseAlias.getActionCode());
                String sb = h.toString();
                StringBuilder h2 = C0072d.m201h("error number: ");
                h2.append(validateResponseAlias.getErrorNumber());
                PLog.error(errorType, eventCode, sb, h2.toString(), (Throwable) null, PEnums.TransitionName.THREE_DS_CARDINAL_STEP_UP_FINISHED, PEnums.StateName.THREE_DS, validateResponseAlias.getErrorDescription());
                fireThreeDsContingencyEvent(ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, "Cardinal validate response is null");
            } else {
                PLog.decision(PEnums.TransitionName.THREE_DS_USER_CANCELLED_STEP_UP, PEnums.Outcome.CANCELLED, PEnums.EventCode.E616, PEnums.StateName.THREE_DS, (String) null, (String) null, "3ds 2.0 step up cancelled");
                fireThreeDsContingencyEvent(ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, "Cardinal validate response is null");
            }
        } else {
            PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E612, "Cardinal validate response is null", (String) null, (Throwable) null, PEnums.TransitionName.THREE_DS_CARDINAL_STEP_UP_FINISHED, PEnums.StateName.THREE_DS, (String) null);
            fireThreeDsContingencyEvent(ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, "Cardinal validate response is null");
        }
    }

    public synchronized boolean isAddressChangeAllowed() {
        return this.repository.isChangingShippingAddressAllowed().booleanValue();
    }

    @IgnoreGeneratedTestReport
    public C2895z<Boolean> isBackBtnBlocked() {
        return this.isBackBtnBlocked;
    }

    public boolean isExitLoadingSpinnerWithoutLogoExperiment() {
        ExperimentResponse treatment = getAb().getTreatment(new ExperimentRequest(ElmoAbExperiment.RTM_LOADER_SPINNER));
        if ((treatment instanceof ExperimentResponse.Success) && ((ExperimentResponse.Success) treatment).getResponse().getTreatmentName().equals(ElmoTreatment.RTM_LOADER_SPINNER_TRMT.getTreatmentName())) {
            return true;
        }
        if (!(treatment instanceof ExperimentResponse.Disable) && (treatment instanceof ExperimentResponse.Failure)) {
            Exception error = ((ExperimentResponse.Failure) treatment).getError();
            PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E571, error.toString(), "fetchAndHandleExperiments()", error, PEnums.TransitionName.ELMO_PROCESS_CHECK);
        }
        return false;
    }

    public boolean isNotVenice() {
        return !"paypal".equals(this.repository.getFundingSource()) || !this.sDebugConfigManager.isSmartPaymentCheckout();
    }

    public boolean isPayNowMode() {
        return this.repository.getPayMode() == Repository.PayModeEnum.PAY_NOW;
    }

    public boolean isPayPalConversionOptionShown() {
        return this.repository.isPayPalConversionOptionShown();
    }

    public synchronized boolean isPayPalConversionShownFromRepo() {
        return this.repository.shouldShowCurrencyConversion();
    }

    public boolean isPickUpOnlyAvailableWithOptions() {
        return !this.repository.getPickUpMethodsList().isEmpty() && this.repository.getShippingMethodsList().isEmpty();
    }

    @IgnoreGeneratedTestReport
    public boolean isShippingAddressChangeEnabled() {
        return this.repository.allowShippingAddressChange();
    }

    @IgnoreGeneratedTestReport
    public boolean isSmartPaymentCheckout() {
        return this.sDebugConfigManager.isSmartPaymentCheckout();
    }

    @IgnoreGeneratedTestReport
    public boolean isVenice() {
        return !isNotVenice();
    }

    public void logoutUser(VmLogoutListener vmLogoutListener2) {
        if (vmLogoutListener2 != null) {
            this.events.fire(PayPalEventTypes.USER_LOGOUT, new Success(Boolean.TRUE));
            vmLogoutListener2.onTaskCompleted();
            resetLiveDataFlags();
            this.repository.resetUser();
            this.authRepository.logout(createAuthHandler());
        }
    }

    @C2845b0(Lifecycle.Event.ON_RESUME)
    public void onLifeCycleResume() {
        logViewModelLifecycle("resumed");
        if (this.sDebugConfigManager.getDidCustomTabOpen()) {
            if (this.sDebugConfigManager.checkIsFallback() || this.repository.isCctOpenedForAddingResources()) {
                if (this.sDebugConfigManager.isSmartPaymentCheckout()) {
                    this.pyplCheckoutUtils.returnToProvider("", ReturnToProviderOperationType.Cancel.INSTANCE, " cancelling from SmartPaymentCheckout");
                } else {
                    this.pyplCheckoutUtils.returnToProvider(this.repository.getCancelUrl(), ReturnToProviderOperationType.Cancel.INSTANCE, "PaySheetActivity onResume");
                }
            }
            this.sDebugConfigManager.setDidPYPLActivityPause(false);
            this.sDebugConfigManager.setDidCustomTabOpen(false);
        }
    }

    public void parseUserAndCheckoutResponse(UserCheckoutResponse userCheckoutResponse) {
        Data data;
        if (!(this.sDebugConfigManager.getApplicationContext() == null || (data = userCheckoutResponse.getData()) == null || data.getCheckoutSession() == null || data.getCheckoutSession().getFlags() == null)) {
            Context applicationContext = this.sDebugConfigManager.getApplicationContext();
            boolean booleanValue = data.getCheckoutSession().getFlags().getBlockNonDomesticShipping().booleanValue();
            Cache.cacheBlockNonDomesticShipping(applicationContext, booleanValue);
            if (booleanValue) {
                if (data.getCheckoutSession().getMerchant() == null || data.getCheckoutSession().getMerchant().getCountry() == null) {
                    Cache.cacheBlockNonDomesticShipping(applicationContext, false);
                } else {
                    Cache.cacheMerchantCountry(applicationContext, data.getCheckoutSession().getMerchant().getCountry());
                }
            }
        }
        this.repository.parseUserAndCheckoutResponse(userCheckoutResponse, new C8778g(this));
        handleOnShippingChangeCallback();
    }

    public void prepareFinalUi() {
        if (shouldShowShipping()) {
            fetchShippingAddresses();
        }
        PLog.transition(PEnums.TransitionName.STARTED_PRE_REVIEW_CALLS, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E623, PEnums.StateName.READY);
        logShippingAddressVisibility();
        this.sDebugConfigManager.getPreReviewSDKIntercept().intercept(Progression.PRE_REVIEW, this.preReviewSDKInterceptFinishListener);
    }

    public void resetLiveDataFlags() {
        C2895z<Boolean> zVar = this.fetchingUserDataCompletedFlag;
        Boolean bool = Boolean.FALSE;
        zVar.setValue(bool);
        this.checkoutCompletedFlag.setValue(bool);
        this.payNowFlag.setValue(bool);
    }

    public final void scaStepUp(ScaUiListener scaUiListener2) {
        StrongCustomerAuthStepUp strongCustomerAuthStepUp = this.sDebugConfigManager.getStrongCustomerAuthStepUp();
        String fetchScaContextId = fetchScaContextId();
        final ScaUiListener scaUiListener3 = scaUiListener2;
        C172583 r3 = new StrongCustomerAuthListener() {
            public void onFailure(Exception exc, String str, boolean z) {
                if (z) {
                    PLog.decision(PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.Outcome.CANCELLED, PEnums.EventCode.E586, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, getClass().getSimpleName(), (String) null, str);
                    scaUiListener3.onCancelled();
                    return;
                }
                PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E587, "Strong Customer Authentication failure", str, exc, PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION);
                MainPaysheetViewModel.this.pyplCheckoutUtils.fallBack("scaFailure", PEnums.FallbackReason.STRONG_CUSTOMER_AUTHENTICATION_FAILURE, PEnums.FallbackCategory.STRONG_CUSTOMER_AUTHENTICATION, str, (PEnums.TransitionName) null, ErrorReason.STRONG_CUSTOMER_AUTHENTICATION_ERROR, exc);
            }

            public void onSuccess(String str, Map<String, ?> map) {
                scaUiListener3.onStrongAuthenticationComplete();
                PLog.decision(PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E227, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, getClass().getSimpleName(), (String) null, map != null ? map.toString() : null);
                MainPaysheetViewModel.this.shippingCallbackHandler.accessToken = str;
                MainPaysheetViewModel.this.accessToken = str;
                MainPaysheetViewModel.this.pyplCheckoutUtils.setAccessToken(MainPaysheetViewModel.this.accessToken);
                RealTimeDB.setAccessToken(MainPaysheetViewModel.this.accessToken);
                AuthenticatedApiFactory.initializeFactories(MainPaysheetViewModel.this.accessToken);
                MainPaysheetViewModel.this.repository.completeSca(new CompleteStrongCustomerAuthenticationCallback() {
                    public void onSuccess() {
                        scaUiListener3.onContingencyCleared();
                    }
                });
            }
        };
        if (fetchScaContextId != null && strongCustomerAuthStepUp != null && this.sDebugConfigManager.isSmartPaymentCheckout()) {
            PLog.decision(PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_SHOWN, PEnums.Outcome.SUCCESS, PEnums.EventCode.E228, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, getClass().getSimpleName(), (String) null, "strong customer authentication launched for 1P");
            scaUiListener2.onProgress();
            strongCustomerAuthStepUp.authStepUp(fetchScaContextId, r3);
        } else if (!this.sDebugConfigManager.isSmartPaymentCheckout()) {
            PLog.decision(PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E230, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, getClass().getSimpleName(), (String) null, "3P skip strong customer authentication");
            scaUiListener2.onStrongAuthenticationComplete();
            scaUiListener2.onContingencyCleared();
        } else if (fetchScaContextId == null && strongCustomerAuthStepUp != null) {
            PLog.decision(PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E229, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, getClass().getSimpleName(), (String) null, "no contingency. skip strong customer authentication");
            scaUiListener2.onStrongAuthenticationComplete();
            scaUiListener2.onContingencyCleared();
        } else if (fetchScaContextId == null && strongCustomerAuthStepUp == null) {
            PLog.decision(PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E229, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, getClass().getSimpleName(), (String) null, "no contingency. skip strong customer authentication");
            scaUiListener2.onStrongAuthenticationComplete();
            scaUiListener2.onContingencyCleared();
        } else if (fetchScaContextId == null || strongCustomerAuthStepUp != null) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not resolve strong customer authentication nor skip contingency");
            PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E585, illegalStateException.getMessage(), illegalStateException.getMessage(), illegalStateException, PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION);
            this.pyplCheckoutUtils.fallBack("scaStepUp", PEnums.FallbackReason.COULD_NOT_RESOLVE_STRONG_CUSTOMER_AUTHENTICATION, PEnums.FallbackCategory.STRONG_CUSTOMER_AUTHENTICATION, illegalStateException.getMessage(), (PEnums.TransitionName) null, ErrorReason.STRONG_CUSTOMER_AUTHENTICATION_ERROR, illegalStateException);
        } else {
            NullPointerException nullPointerException = new NullPointerException("SCA contingency was thrown but StrongCustomerAuthStepUp was null");
            PLog.error(PEnums.ErrorType.FATAL, PEnums.EventCode.E584, nullPointerException.getMessage(), nullPointerException.getMessage(), nullPointerException, PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_COMPLETE, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION);
            this.pyplCheckoutUtils.fallBack("scaStepUp", PEnums.FallbackReason.STRONG_CUSTOMER_AUTHENTICATION_STEPUP_NOT_IMPLEMENTED, PEnums.FallbackCategory.STRONG_CUSTOMER_AUTHENTICATION, nullPointerException.getMessage(), (PEnums.TransitionName) null, ErrorReason.STRONG_CUSTOMER_AUTHENTICATION_ERROR, nullPointerException);
        }
    }

    @IgnoreGeneratedTestReport
    public void setActionButtonClickEnabled(boolean z) {
        this.isActionButtonClickEnabled = z;
    }

    @IgnoreGeneratedTestReport
    public void setAddCardMode(boolean z) {
        this.isAddCardMode = z;
    }

    public void setApproveResponseOnRepo(ApprovePaymentResponse approvePaymentResponse) {
        this.repository.setApprovePaymentResponse(approvePaymentResponse);
    }

    @IgnoreGeneratedTestReport
    public void setCallToActionState(Repository.CTAState cTAState) {
        this.repository.setCallToActionState(cTAState);
    }

    @IgnoreGeneratedTestReport
    public void setContingencyEventsModel(ContingencyEventsModel contingencyEventsModel) {
        this.contingencyeventsModel.setValue(contingencyEventsModel);
    }

    public void setConversionType(CurrencyConversionType currencyConversionType) {
        this.repository.setSelectedCurrencyConversionType(currencyConversionType);
        this.conversionType.setValue(currencyConversionType);
    }

    @IgnoreGeneratedTestReport
    public void setFetchingUserDataCompletedFlag(boolean z) {
        this.fetchingUserDataCompletedFlag.setValue(Boolean.valueOf(z));
    }

    public void setFirstTimeLoggedIn(boolean z) {
        this.isFirstTimeLoggedIn = z;
    }

    public void setIsCurrencyConverted(boolean z) {
        this.repository.setCurrencyConverted(z);
    }

    @IgnoreGeneratedTestReport
    public void setLoadingTextPhases(PayPalEnterLoadingSpinner.LoadingTextPhases loadingTextPhases2) {
        this.loadingTextPhases.setValue(loadingTextPhases2);
    }

    @IgnoreGeneratedTestReport
    public void setPaymentSourceCardViewClickedFlag(boolean z) {
        this.paymentSourceCardViewClickedFlag.setValue(Boolean.valueOf(z));
    }

    @IgnoreGeneratedTestReport
    public void setShouldPaymentButtonBeVisible(boolean z) {
        this.shouldPaymentButtonBeVisible = z;
    }

    @IgnoreGeneratedTestReport
    public void setShouldWaitForStartupAnimation(boolean z) {
        this.shouldWaitForStartupAnimation = z;
    }

    @IgnoreGeneratedTestReport
    public void setThreeDSErrorBanner(ThreeDSTopBanner threeDSTopBanner) {
        this.threeDSErrorBanner.setValue(threeDSTopBanner);
    }

    @IgnoreGeneratedTestReport
    public void setThreeDSPaymentAuthenticationRequest(String str) {
        this.threeDSPaymentAuthenticationRequest = str;
    }

    @IgnoreGeneratedTestReport
    public void setThreeDSTransactionId(String str) {
        this.threeDSTransactionId = str;
    }

    @IgnoreGeneratedTestReport
    public void setThreeDSV1JWT(String str) {
        this.threeDSV1JWT = str;
    }

    @IgnoreGeneratedTestReport
    public void setThreeDSV1Url(String str) {
        this.threeDSV1Url = str;
    }

    @IgnoreGeneratedTestReport
    public boolean shouldPaymentButtonBeVisible() {
        return this.shouldPaymentButtonBeVisible;
    }

    public boolean shouldShow72Hour() {
        return this.repository.shouldShow72HourText();
    }

    public boolean shouldShowCloseButton() {
        return this.repository.getShowCloseButton();
    }

    public synchronized boolean shouldShowShipping() {
        return this.repository.shouldShowShipping();
    }

    public void start3DSV1Flow(String str, String str2) {
        setThreeDSV1Url(str);
        setThreeDSV1JWT(str2);
        this.events.fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLThreeDSV1Fragment.TAG, PYPLThreeDSV1Fragment.newInstance())));
    }

    public void startFragment(Context context, String str) {
        PLog.transition(PEnums.TransitionName.MAIN_VIEW_MODEL_START_FRAGMENT, PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, PEnums.StateName.UTILS, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, context.getClass().getSimpleName(), (String) null, (String) null, str);
        ContentRouter.INSTANCE.gotoFragment(context, str);
    }

    public final void startThreeDsFlow(Activity activity) {
        if (isNativeThreeDsSupported()) {
            PLog.decision(PEnums.TransitionName.THREE_DS_CONTINGENCY_FLOW_STARTED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E613, PEnums.StateName.THREE_DS, (String) null, (String) null, "3DS flow started");
            this.threeDSUseCase.launch3DS(activity, ThreeDSSource.CTA);
            return;
        }
        this.pyplCheckoutUtils.fallBack(TAG, PEnums.FallbackReason.THREE_DS_CHALLENGE_IN_3P, PEnums.FallbackCategory.INELIGIBLE_TRAFFIC, "3DS is not enabled for 3P", (PEnums.TransitionName) null, ErrorReason.NONE, (Exception) null);
    }

    public void threeDSAuthenticateAndComplete() {
        this.threeDSDecisionFlow.threeDSAuthenticateAndComplete(new C10079k(this, 1));
    }

    public void toggleAddNewShippingAddressTitle() {
        Repository repository2 = this.repository;
        repository2.setAddNewShippingAddressFlag(!repository2.isAddNewShippingAddress());
    }

    public void updateClientConfigBefore(UpdateClientConfigListener updateClientConfigListener) {
        this.events.listen(PayPalEventTypes.FINISHED_CLIENT_CONFIG_UPDATE, new C17199b(updateClientConfigListener, 3));
        this.repository.updateClientConfig();
    }

    public void updateSelectedAddress(int i) {
        if (this.repository.getShippingAddressList() != null && i < this.repository.getShippingAddressList().size()) {
            ShippingCallbackHandler shippingCallbackHandler2 = this.shippingCallbackHandler;
            ShippingCallbackRequestType shippingCallbackRequestType = new ShippingCallbackRequestType(ShippingCallbackRequestType.Type.SHIPPING_ADDRESS);
            ShippingMethodType.Type type = ShippingMethodType.Type.SHIPPING;
            shippingCallbackHandler2.validateShippingCallback(shippingCallbackRequestType, new ShippingMethodType(type), this.repository.getSelectedAddressIndex(), i);
            this.repository.setSelectedAddress(i);
            this.selectedShippingAddress.setValue(this.repository.getSelectedAddress());
            if (!this.isFirstTimeLoggedIn) {
                Repository repository2 = this.repository;
                repository2.setSelectedShippingMethod(repository2.getSelectedMethodOptionIndex(new ShippingMethodType(type)), new ShippingMethodType(type));
                this.selectedShippingMethods.setValue(this.repository.getSelectedShippingMethod());
            }
        }
    }

    public void updateSelectedShippingMethod(int i, ShippingMethodType shippingMethodType) {
        this.repository.setLastSelectedShippingMethodType(shippingMethodType);
        this.shippingCallbackHandler.validateShippingCallback(new ShippingCallbackRequestType(ShippingCallbackRequestType.Type.SHIPPING_METHODS), shippingMethodType, this.repository.getSelectedMethodOptionIndex(shippingMethodType), i);
        this.repository.setSelectedShippingMethod(i, shippingMethodType);
        this.selectedShippingMethods.setValue(this.repository.getSelectedShippingMethod());
    }

    public void updateShippingAddressList(List<ShippingAddress> list) {
        this.repository.updateShippingAddressList(list);
        this.listOfShippingAddressesLD.postValue(list);
    }

    public void userProfileLogout(VmLogoutListener vmLogoutListener2) {
        PLog.info(PEnums.LogType.FPTI, "UserProfileLogout");
        logoutUser(vmLogoutListener2);
    }

    @IgnoreGeneratedTestReport
    public boolean wasLsatTokenUpgraded() {
        return this.repository.wasLsatTokenUpgraded();
    }

    public MainPaysheetViewModel(Repository repository2, AbManager abManager2, ThreeDSDecisionFlow threeDSDecisionFlow2, Events events2, PYPLCheckoutUtils pYPLCheckoutUtils, EligibilityManager eligibilityManager2, ShippingCallbackHandler shippingCallbackHandler2, PostAuthSuccessHandler postAuthSuccessHandler2, Native3pEligibilityCheck native3pEligibilityCheck2, NativePayWithCryptoCheck nativePayWithCryptoCheck2, ThreeDSUseCase threeDSUseCase2, SetCheckoutStateUseCase setCheckoutStateUseCase2, AuthRepository authRepository2, AddressRepository addressRepository2, AuthHandlerProvider authHandlerProvider2) {
        this(repository2, abManager2, DebugConfigManager.getInstance(), threeDSDecisionFlow2, events2, pYPLCheckoutUtils, eligibilityManager2, shippingCallbackHandler2, postAuthSuccessHandler2, native3pEligibilityCheck2, nativePayWithCryptoCheck2, threeDSUseCase2, setCheckoutStateUseCase2, authRepository2, addressRepository2, authHandlerProvider2);
    }
}
