package com.paypal.pyplcheckout.services;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.order.Options;
import com.paypal.checkout.order.Order;
import com.paypal.pyplcheckout.addcard.UpgradeAccessToken;
import com.paypal.pyplcheckout.addcard.UpgradeAccessTokenListenerImpl;
import com.paypal.pyplcheckout.addshipping.model.Address;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdResponse;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteResponse;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.cache.CacheConfigManager;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.fundingOptions.dao.FundingOptionsDao;
import com.paypal.pyplcheckout.home.view.customviews.productviews.ProductDescription;
import com.paypal.pyplcheckout.interfaces.VmListensToRepoForUserAndCheckoutPayload;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.model.MapItem;
import com.paypal.pyplcheckout.model.PrincipalFundingOptionMapMaker;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.AddCardQueryParams;
import com.paypal.pyplcheckout.pojo.AddCardResponse;
import com.paypal.pyplcheckout.pojo.AddCardUpdateFundingOptionsResponse;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.pojo.AmountInput;
import com.paypal.pyplcheckout.pojo.ApprovePayment;
import com.paypal.pyplcheckout.pojo.ApprovePaymentData;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.BillingAddress;
import com.paypal.pyplcheckout.pojo.BillingAddressRequest;
import com.paypal.pyplcheckout.pojo.Cart;
import com.paypal.pyplcheckout.pojo.CartAmounts;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.CheckoutSessionType;
import com.paypal.pyplcheckout.pojo.CreditPPCOffer;
import com.paypal.pyplcheckout.pojo.CurrencyConversion;
import com.paypal.pyplcheckout.pojo.Data;
import com.paypal.pyplcheckout.pojo.Error;
import com.paypal.pyplcheckout.pojo.Flags;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.Item;
import com.paypal.pyplcheckout.pojo.LowScopedAccessToken;
import com.paypal.pyplcheckout.pojo.PaymentContingencies;
import com.paypal.pyplcheckout.pojo.Plan;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.pojo.StrongCustomerAuthenticationRequiredContingency;
import com.paypal.pyplcheckout.pojo.SupportedFundingSources;
import com.paypal.pyplcheckout.pojo.ThreeDSAuthenticateResponse;
import com.paypal.pyplcheckout.pojo.ThreeDSLookupPayload;
import com.paypal.pyplcheckout.pojo.Url;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.pojo.ValidateAddressQueryParams;
import com.paypal.pyplcheckout.pojo.ValidateAddressResponse;
import com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback;
import com.paypal.pyplcheckout.services.api.AddCardThreeDsApi;
import com.paypal.pyplcheckout.services.api.CancelUrlApi;
import com.paypal.pyplcheckout.services.api.ClientConfigUpdateApi;
import com.paypal.pyplcheckout.services.api.FirebaseTokenApi;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.services.callbacks.ApprovePaymentCallback;
import com.paypal.pyplcheckout.services.callbacks.CancelUrlCallback;
import com.paypal.pyplcheckout.services.callbacks.ClientConfigUpdateCallback;
import com.paypal.pyplcheckout.services.callbacks.EligibilityCallback;
import com.paypal.pyplcheckout.services.callbacks.FirebaseTokenCallback;
import com.paypal.pyplcheckout.services.callbacks.LsatUpgradeCallback;
import com.paypal.pyplcheckout.services.callbacks.UpdateCurrencyConversionCallback;
import com.paypal.pyplcheckout.services.callbacks.UserAndCheckoutCallback;
import com.paypal.pyplcheckout.userprofile.dao.UserDao;
import com.paypal.pyplcheckout.utils.CheckoutIdlingResource;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import com.paypal.pyplcheckout.utils.SplitBalanceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.C19332y;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19343e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;
import p634np.C18289a;
import p753kq.C19846a;
import p753kq.C19857l;
import p755lq.C19875a;
import p755lq.C19877c;

public final class Repository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "Repository";
    private final List<ShippingMethods> _pickUpMethodsList;
    private final List<ShippingMethods> _shippingMethodsList;
    private User _user;
    private boolean addManuallyFlag;
    private boolean addNewShippingAddressFlag;
    private final C18289a<ApprovePaymentCallback> approvePaymentCallback;
    private ApprovePaymentResponse approvePaymentResponse;
    private BillingAddressRequest billingAddress;
    private String buttonVersion;
    private String buyerIPCountry;
    private CTAState callToActionState;
    private String cancelUrl;
    private List<Item> cartItemsList;
    private CheckoutSession checkoutSession;
    private final Set<String> clearedContingenciesCardIds;
    private ContingencyEventsModel contingencyEventsModel;
    private InternalCorrelationIds correlationIds;
    private String dbInstanceID;
    private String dcvv;
    private DebugConfigManager debugConfigManager;
    private String fbSessionUid;
    private final FundingOptionsDao fundingOptionsDao;
    private List<FundingOption> fundingOptionsList;
    private String fundingSource;
    private boolean hostHandlesBlockingContingencies;
    private String insuranceCurrency;
    private final HashSet<String> invalidShippingAddressesSet;
    private boolean isCctOpenedForAddingResources;
    private boolean isCurrencyConverted;
    private boolean isPayPalConversionOptionShown;
    private boolean isSignUpEligible;
    private boolean isSkipEligibility;
    private boolean isVaultFlow;
    private JSONObject jsonMerchantOrderInfo;
    private ShippingMethodType lastSelectedShippingMethodType;
    private LowScopedAccessToken lsatToken;
    private Order merchantOrderInfo;
    private Address newShippingAddress;
    private List<CreditPPCOffer> offers;
    private String oldPreferredFundingOptionId;
    private String orderId;
    private PayModeEnum payMode;
    private String payToken;
    private String paymentAuthenticationRequest;
    private String preferredFundingOptionId;
    private Map<String, MapItem> principalMap;
    private boolean propsSet;
    private Uri referrerPackage;
    private String returnUrl;
    private long sDKLaunchTime;
    private ShippingAddress selectedAddress;
    private int selectedAddressIndex;
    private CurrencyConversionType selectedCurrencyConversionType;
    private FundingOption selectedFundingOption;
    private int selectedPickUpMethodIndex;
    private ShippingMethods selectedShippingMethod;
    private int selectedShippingMethodIndex;
    private List<ShippingAddress> shippingAddressList;
    private String shippingAndHandling;
    private String shippingDiscount;
    private String smartPaymentButtonSessionId;
    private String smartPaymentButtonStickinessId;
    private PEnums.Stage stage;
    private String startupMechanism;
    private String subtotal;
    private PaymentContingencies supportedContingencies;
    private ShippingMethodType supportedShippingMethodType;
    private String tax;
    private String threeDSProcessorTraceNumber;
    private String token;
    private String total;
    private String transactionId;
    private final C18289a<UpdateCurrencyConversionCallback> updateCurrencyConversionCallback;
    private UserCheckoutResponse userCheckoutResponse;
    private final UserDao userDao;
    private Plan userSelectedPlan;

    public enum CTAState {
        PAY,
        APPLY_FOR_CREDIT,
        ADD_CARD
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum PayModeEnum {
        CONTINUE("CONTINUE"),
        PAY_NOW("PAY_NOW");
        
        private final String userAction;

        private PayModeEnum(String str) {
            this.userAction = str;
        }

        public String toString() {
            return this.userAction;
        }
    }

    public Repository(UserCheckoutResponse userCheckoutResponse2, DebugConfigManager debugConfigManager2, FundingOptionsDao fundingOptionsDao2, UserDao userDao2, C18289a<ApprovePaymentCallback> aVar, C18289a<UpdateCurrencyConversionCallback> aVar2) {
        UserDao userDao3 = userDao2;
        C18289a<ApprovePaymentCallback> aVar3 = aVar;
        C18289a<UpdateCurrencyConversionCallback> aVar4 = aVar2;
        C19383o.m32797g(userCheckoutResponse2, "userCheckoutResponse");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(fundingOptionsDao2, "fundingOptionsDao");
        C19383o.m32797g(userDao3, "userDao");
        C19383o.m32797g(aVar3, "approvePaymentCallback");
        C19383o.m32797g(aVar4, "updateCurrencyConversionCallback");
        this.userCheckoutResponse = userCheckoutResponse2;
        this.debugConfigManager = debugConfigManager2;
        this.fundingOptionsDao = fundingOptionsDao2;
        this.userDao = userDao3;
        this.approvePaymentCallback = aVar3;
        this.updateCurrencyConversionCallback = aVar4;
        Data data = userCheckoutResponse2.getData();
        this.checkoutSession = data == null ? null : data.getCheckoutSession();
        this.payToken = "";
        this.sDKLaunchTime = System.currentTimeMillis();
        this.callToActionState = CTAState.PAY;
        this.preferredFundingOptionId = "";
        this.startupMechanism = PEnums.StartupMechanism.MERCHANT.toString();
        this.selectedCurrencyConversionType = CurrencyConversionType.PAYPAL;
        this._shippingMethodsList = new ArrayList();
        this._pickUpMethodsList = new ArrayList();
        this.invalidShippingAddressesSet = new HashSet<>();
        this.clearedContingenciesCardIds = new LinkedHashSet();
        this.correlationIds = new InternalCorrelationIds((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void fetchLsatUpgradeStatus$default(Repository repository, C19857l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        repository.fetchLsatUpgradeStatus(lVar);
    }

    private final CheckoutSessionType getCheckoutSessionType() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null) {
            return null;
        }
        return checkoutSession2.getCheckoutSessionType();
    }

    private final MerchantConfigRepository getMerchantConfigRepository() {
        return SdkComponent.Companion.getInstance().getMerchantConfigRepository();
    }

    private final Plan getSelectedPlan() {
        List<Plan> allPlans;
        FundingOption fundingOption = this.selectedFundingOption;
        if (fundingOption == null || (allPlans = fundingOption.getAllPlans()) == null) {
            return null;
        }
        return (Plan) C19327t.m32645a1(allPlans);
    }

    private final User get_user() {
        User user = this._user;
        return user == null ? this.userDao.getLoggedUser() : user;
    }

    private final void initShippingAddress() {
        List<ShippingAddress> list;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        List<ShippingAddress> shippingAddresses = checkoutSession2 == null ? null : checkoutSession2.getShippingAddresses();
        this.shippingAddressList = shippingAddresses;
        if (!(shippingAddresses == null || shippingAddresses.isEmpty())) {
            List<ShippingAddress> list2 = this.shippingAddressList;
            this.selectedAddress = list2 == null ? null : list2.get(0);
            if (shouldShowShipping() && (list = this.shippingAddressList) != null) {
                Iterator it = C17782b.m29857W(list).iterator();
                while (it.hasNext()) {
                    int nextInt = ((C19332y) it).nextInt();
                    List<ShippingAddress> list3 = this.shippingAddressList;
                    ShippingAddress shippingAddress = list3 == null ? null : list3.get(nextInt);
                    if (shippingAddress != null && shippingAddress.isSelected()) {
                        this.selectedAddressIndex = nextInt;
                        this.selectedAddress = shippingAddress;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.paypal.pyplcheckout.pojo.Plan} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setInitialOptions(java.util.List<com.paypal.pyplcheckout.pojo.FundingOption> r2) {
        /*
            r1 = this;
            java.lang.Object r2 = kotlin.collections.C19327t.m32640V0(r2)
            com.paypal.pyplcheckout.pojo.FundingOption r2 = (com.paypal.pyplcheckout.pojo.FundingOption) r2
            r1.selectedFundingOption = r2
            r0 = 0
            if (r2 != 0) goto L_0x000c
            goto L_0x001a
        L_0x000c:
            java.util.List r2 = r2.getAllPlans()
            if (r2 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r2 = kotlin.collections.C19327t.m32646b1(r2)
            r0 = r2
            com.paypal.pyplcheckout.pojo.Plan r0 = (com.paypal.pyplcheckout.pojo.Plan) r0
        L_0x001a:
            r1.userSelectedPlan = r0
            r1.setUserSelectedPlan(r0)
            com.paypal.pyplcheckout.fundingOptions.dao.FundingOptionsDao r2 = r1.fundingOptionsDao
            com.paypal.pyplcheckout.pojo.FundingOption r0 = r1.selectedFundingOption
            r2.cacheSelectedFundingOption(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.setInitialOptions(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r4.getFundingInstrument();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setOldPreferredFundingOptionId(com.paypal.pyplcheckout.pojo.FundingOption r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
        L_0x0003:
            r1 = r0
            goto L_0x0010
        L_0x0005:
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r4.getFundingInstrument()
            if (r1 != 0) goto L_0x000c
            goto L_0x0003
        L_0x000c:
            java.lang.Boolean r1 = r1.isPreferred()
        L_0x0010:
            if (r1 == 0) goto L_0x0032
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r4.getFundingInstrument()
            if (r1 != 0) goto L_0x001a
            r1 = 0
            goto L_0x0024
        L_0x001a:
            java.lang.Boolean r1 = r1.isPreferred()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
        L_0x0024:
            if (r1 == 0) goto L_0x0032
            com.paypal.pyplcheckout.pojo.FundingInstrument r4 = r4.getFundingInstrument()
            if (r4 != 0) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            java.lang.String r0 = r4.getId()
            goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            r3.oldPreferredFundingOptionId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.setOldPreferredFundingOptionId(com.paypal.pyplcheckout.pojo.FundingOption):void");
    }

    private final void setUserAction(String str) {
        if (this.debugConfigManager.getPayMode() == null && str != null) {
            try {
                PayModeEnum valueOf = PayModeEnum.valueOf(str);
                getDebugConfigManager().setPayMode(valueOf);
                setPayMode(valueOf);
            } catch (Exception e) {
                String str2 = TAG;
                C19383o.m32796f(str2, "TAG");
                PLog.e$default(str2, "error in reading user action, so default to continue", e, 0, 8, (Object) null);
            }
        }
    }

    private final void set_user(User user) {
        this._user = user;
        this.userDao.cacheLoggedUser(user);
    }

    public static /* synthetic */ void setupFundingOptions$default(Repository repository, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            CheckoutSession checkoutSession2 = repository.checkoutSession;
            str = checkoutSession2 == null ? null : checkoutSession2.getUserAction();
        }
        repository.setupFundingOptions(list, str);
    }

    public static /* synthetic */ Object updateCheckoutSessionFundingOptions$default(Repository repository, String str, boolean z, C19340c cVar, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            z = false;
        }
        return repository.updateCheckoutSessionFundingOptions(str, z, cVar);
    }

    public final Object addCard(AddCardQueryParams addCardQueryParams, C19340c<? super AddCardResponse> cVar) throws Exception {
        return AuthenticatedApiFactory.Companion.getAddCardApiFactory().create().addCard(addCardQueryParams, cVar);
    }

    public final void addContingencyClearedCardId(String str) {
        C19383o.m32797g(str, "cardId");
        this.clearedContingenciesCardIds.add(str);
    }

    public final void addInvalidShippingAddress() {
        ShippingAddress shippingAddress = this.selectedAddress;
        if (shippingAddress != null) {
            this.invalidShippingAddressesSet.add(shippingAddress.getAddressId());
        }
    }

    public final boolean allowShippingAddressChange() {
        Flags flags;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (flags = checkoutSession2.getFlags()) == null) {
            return false;
        }
        return C19383o.m32792b(flags.isChangeShippingAddressAllowed(), Boolean.TRUE);
    }

    public final void approvePayment() {
        PLog.decision$default(PEnums.TransitionName.APPROVE_PAYMENT_PATH_CHOICE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E215, PEnums.StateName.REVIEW, "call_to_action_button_view", PEnums.TransitionName.PAYMENT_OUTCOME.toString(), (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
        if (this.selectedCurrencyConversionType == CurrencyConversionType.PAYPAL) {
            ApprovePaymentCallback approvePaymentCallback2 = this.approvePaymentCallback.get();
            C19383o.m32796f(approvePaymentCallback2, "approvePaymentCallback.get()");
            AuthenticatedApiFactory.Companion.getApproveMemberPaymentApiFactory().create().enqueueRequest(approvePaymentCallback2);
            return;
        }
        UpdateCurrencyConversionCallback updateCurrencyConversionCallback2 = this.updateCurrencyConversionCallback.get();
        C19383o.m32796f(updateCurrencyConversionCallback2, "updateCurrencyConversionCallback.get()");
        AuthenticatedApiFactory.Companion.getUpdateCurrencyConversionApiFactory().create().enqueueRequest(updateCurrencyConversionCallback2);
    }

    public final boolean canConvertFI() {
        Plan selectedPlan = getSelectedPlan();
        Amount amount = null;
        if ((selectedPlan == null ? null : selectedPlan.getCurrencyConversion()) != null) {
            CurrencyConversion currencyConversion = selectedPlan.getCurrencyConversion();
            if (currencyConversion != null) {
                amount = currencyConversion.getTo();
            }
            if (amount != null) {
                return true;
            }
        }
        return false;
    }

    public final void clearShippingData() {
        this.supportedShippingMethodType = null;
        this._pickUpMethodsList.clear();
        this._shippingMethodsList.clear();
    }

    public final void completeSca(CompleteStrongCustomerAuthenticationCallback completeStrongCustomerAuthenticationCallback) {
        C19383o.m32797g(completeStrongCustomerAuthenticationCallback, "callback");
        AuthenticatedApiFactory.Companion.getCompleteStrongCustomerAuthenticationApiFactory().create().enqueueRequest(completeStrongCustomerAuthenticationCallback);
    }

    public final synchronized void createPrincipalMap(List<FundingOption> list) {
        String str;
        C19383o.m32797g(list, "fundingOptions");
        this.principalMap = new PrincipalFundingOptionMapMaker(list, (Map) null, 2, (DefaultConstructorMarker) null).getPrincipalMap();
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.d$default(str2, "the principal funding options map created", 0, 4, (Object) null);
        Map<String, MapItem> map = this.principalMap;
        if (map != null) {
            Set<String> keySet = map.keySet();
            if (keySet != null) {
                str = (String) C19327t.m32639U0(keySet);
                C19383o.m32796f(str2, "TAG");
                PLog.d$default(str2, "first entry of principal map " + str, 0, 4, (Object) null);
                setInitialOptions(list);
                initShippingAddress();
                initShippingMethods$pyplcheckout_externalThreedsRelease();
            }
        }
        str = null;
        C19383o.m32796f(str2, "TAG");
        PLog.d$default(str2, "first entry of principal map " + str, 0, 4, (Object) null);
        setInitialOptions(list);
        initShippingAddress();
        initShippingMethods$pyplcheckout_externalThreedsRelease();
    }

    public final void deleteSelectedFundingOptionFromCheckoutSession() {
        String id;
        CheckoutSession checkoutSession2;
        List<FundingOption> fundingOptions;
        FundingOption fundingOption = this.selectedFundingOption;
        if (fundingOption != null && (id = fundingOption.getId()) != null) {
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.d$default(str, "deleteSelectedFundingOption() called for id " + id, 0, 4, (Object) null);
            Data data = this.userCheckoutResponse.getData();
            if (data != null && (checkoutSession2 = data.getCheckoutSession()) != null && (fundingOptions = checkoutSession2.getFundingOptions()) != null) {
                fundingOptions.remove(fundingOption);
            }
        }
    }

    public final void fetchCancelURL() {
        CancelUrlApi.Companion.get().enqueueRequest(CancelUrlCallback.Companion.get());
    }

    public final void fetchLsatUpgradeStatus(C19857l<? super Boolean, C19394m> lVar) {
        AuthenticatedApiFactory.Companion.getLsatUpgradeApiFactory().create().enqueueRequest(LsatUpgradeCallback.Companion.get(lVar));
    }

    public final void fetchUserCheckoutResponse() {
        AuthenticatedApiFactory.Companion.getUserAndCheckoutApiFactory().create().enqueueRequest(UserAndCheckoutCallback.Companion.get());
    }

    public final Object getAddressAutoComplete(AddressAutoCompleteRequest addressAutoCompleteRequest, C19340c<? super AddressAutoCompleteResponse> cVar) throws Exception {
        return AuthenticatedApiFactory.Companion.getAddressAutoCompleteApiFactory().create().getAddressAutoComplete(addressAutoCompleteRequest, cVar);
    }

    public final Object getAddressAutoCompletePlaceId(AddressAutoCompletePlaceIdRequest addressAutoCompletePlaceIdRequest, C19340c<? super AddressAutoCompletePlaceIdResponse> cVar) throws Exception {
        return AuthenticatedApiFactory.Companion.getAddressAutoCompletePlaceIdApiFactory().create().getAddressAutoCompletePlaceId(addressAutoCompletePlaceIdRequest, cVar);
    }

    public final ApprovePaymentResponse getApprovePaymentResponse() {
        return this.approvePaymentResponse;
    }

    public final FundingInstrument getBackupFunding() {
        Plan selectedPlan = getSelectedPlan();
        if (selectedPlan == null) {
            return null;
        }
        return selectedPlan.getBackupFundingInstrument();
    }

    public final BillingAddressRequest getBillingAddress() {
        return this.billingAddress;
    }

    public final List<BillingAddress> getBillingAddresses() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null) {
            return null;
        }
        return checkoutSession2.getBillingAddresses();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.getBufCardText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getBufCardText() {
        /*
            r2 = this;
            com.paypal.pyplcheckout.pojo.FundingInstrument r0 = r2.getBackupFunding()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.String r0 = r0.getBufCardText()
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getBufCardText():java.lang.String");
    }

    public final String getButtonVersion() {
        return this.buttonVersion;
    }

    public final String getBuyerIPCountry() {
        return this.buyerIPCountry;
    }

    public final CTAState getCallToActionState() {
        return this.callToActionState;
    }

    public final String getCancelUrl() {
        Cart cart;
        Url cancelUrl2;
        if (this.cancelUrl == null) {
            CheckoutSession checkoutSession2 = this.checkoutSession;
            String str = null;
            if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (cancelUrl2 = cart.getCancelUrl()) == null)) {
                str = cancelUrl2.getHref();
            }
            this.cancelUrl = str;
        }
        return this.cancelUrl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getFundingInstrument()).getLabel();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCardLabel() {
        /*
            r2 = this;
            com.paypal.pyplcheckout.pojo.FundingOption r0 = r2.selectedFundingOption
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x0016
        L_0x0007:
            com.paypal.pyplcheckout.pojo.FundingInstrument r0 = r0.getFundingInstrument()
            if (r0 != 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.String r0 = r0.getLabel()
            if (r0 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getCardLabel():java.lang.String");
    }

    public final Cart getCart() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null) {
            return null;
        }
        return checkoutSession2.getCart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = (r0 = (r0 = r0.getAmounts()).getTotal()).getCurrencyCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCartCurrencyCode() {
        /*
            r2 = this;
            com.paypal.pyplcheckout.pojo.Cart r0 = r2.getCart()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.paypal.pyplcheckout.pojo.CartAmounts r0 = r0.getAmounts()
            if (r0 != 0) goto L_0x0010
            goto L_0x001f
        L_0x0010:
            com.paypal.pyplcheckout.pojo.Amount r0 = r0.getTotal()
            if (r0 != 0) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            java.lang.String r0 = r0.getCurrencyCode()
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getCartCurrencyCode():java.lang.String");
    }

    public final List<Item> getCartItemsList() {
        Cart cart;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        List<Item> list = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null)) {
            list = cart.getItems();
        }
        this.cartItemsList = list;
        return list;
    }

    public final CheckoutSession getCheckoutSession() {
        return this.checkoutSession;
    }

    public final ContingencyEventsModel getContingencyEventsModel() {
        return this.contingencyEventsModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r1 = (r1 = r0.getCurrencyConversion()).getFrom();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getConversionRateStr() {
        /*
            r3 = this;
            com.paypal.pyplcheckout.pojo.Plan r0 = r3.getSelectedPlan()
            boolean r1 = r3.canConvertFI()
            r2 = 0
            if (r1 == 0) goto L_0x0050
            if (r0 != 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            com.paypal.pyplcheckout.pojo.CurrencyConversion r1 = r0.getCurrencyConversion()
            if (r1 != 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            com.paypal.pyplcheckout.pojo.Amount r1 = r1.getFrom()
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r1 = r2
            goto L_0x0021
        L_0x001d:
            java.lang.String r1 = r1.getCurrencyFormatSymbolISOCurrency()
        L_0x0021:
            if (r1 != 0) goto L_0x0024
            goto L_0x0050
        L_0x0024:
            com.paypal.pyplcheckout.pojo.CurrencyConversion r1 = r0.getCurrencyConversion()
            if (r1 != 0) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            com.paypal.pyplcheckout.pojo.Amount r1 = r1.getFrom()
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            r1 = r2
            goto L_0x0037
        L_0x0033:
            java.lang.String r1 = r1.getCurrencyFormatSymbolISOCurrency()
        L_0x0037:
            com.paypal.pyplcheckout.pojo.CurrencyConversion r0 = r0.getCurrencyConversion()
            if (r0 != 0) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            com.paypal.pyplcheckout.pojo.Amount r0 = r0.getTo()
            if (r0 != 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            java.lang.String r2 = r0.getCurrencyFormatSymbolISOCurrency()
        L_0x0049:
            java.lang.String r0 = " = "
            java.lang.String r0 = p010a9.C0048b.m163a(r1, r0, r2)
            return r0
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getConversionRateStr():java.lang.String");
    }

    public final InternalCorrelationIds getCorrelationIds() {
        return this.correlationIds;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r3 = r3.getContent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCreditOfferText() {
        /*
            r5 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r5.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x004b
        L_0x0006:
            java.util.List r0 = r0.getCreditPPCOffers()
            if (r0 != 0) goto L_0x000d
            goto L_0x004b
        L_0x000d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r3 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r3
            if (r3 != 0) goto L_0x0022
        L_0x0020:
            r3 = r1
            goto L_0x002d
        L_0x0022:
            com.paypal.pyplcheckout.pojo.Content r3 = r3.getContent()
            if (r3 != 0) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            java.lang.String r3 = r3.getProduct()
        L_0x002d:
            com.paypal.pyplcheckout.utils.PaymentTypes r4 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT_OFFER
            java.lang.String r4 = r4.toString()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x0011
            goto L_0x003b
        L_0x003a:
            r2 = r1
        L_0x003b:
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r2 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r2
            if (r2 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            com.paypal.pyplcheckout.pojo.Content r0 = r2.getContent()
            if (r0 != 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            java.lang.String r1 = r0.getOfferText2()
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getCreditOfferText():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r5 == null ? null : r5.getProduct(), com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT_OFFER.toString()) != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.paypal.pyplcheckout.pojo.CreditPPCOffer> getCreditPpcOffers() {
        /*
            r7 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r7.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x006e
        L_0x0007:
            java.util.List r0 = r0.getCreditPPCOffers()
            if (r0 != 0) goto L_0x000e
            goto L_0x006e
        L_0x000e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r4 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r4
            com.paypal.pyplcheckout.pojo.Content r5 = r4.getContent()
            if (r5 != 0) goto L_0x002c
            r5 = r1
            goto L_0x0030
        L_0x002c:
            java.lang.String r5 = r5.getProduct()
        L_0x0030:
            com.paypal.pyplcheckout.utils.PaymentTypes r6 = com.paypal.pyplcheckout.utils.PaymentTypes.GLOBAL_PAY_LATER
            java.lang.String r6 = r6.toString()
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            if (r5 != 0) goto L_0x0054
            com.paypal.pyplcheckout.pojo.Content r5 = r4.getContent()
            if (r5 != 0) goto L_0x0044
            r5 = r1
            goto L_0x0048
        L_0x0044:
            java.lang.String r5 = r5.getProduct()
        L_0x0048:
            com.paypal.pyplcheckout.utils.PaymentTypes r6 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT_OFFER
            java.lang.String r6 = r6.toString()
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r6)
            if (r5 == 0) goto L_0x0066
        L_0x0054:
            com.paypal.pyplcheckout.pojo.Content r4 = r4.getContent()
            java.lang.String r4 = r4.getOfferCategory()
            java.lang.String r5 = "REUSE"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
            if (r4 != 0) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x0017
            r2.add(r3)
            goto L_0x0017
        L_0x006d:
            r1 = r2
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getCreditPpcOffers():java.util.List");
    }

    public final String getCurrencyValue() {
        Cart cart;
        CartAmounts amounts;
        Amount total2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (total2 = amounts.getTotal()) == null) {
            return null;
        }
        return total2.getCurrencyValue();
    }

    public final String getDBInstance() {
        return this.dbInstanceID;
    }

    public final String getDcvv() {
        return this.dcvv;
    }

    public final DebugConfigManager getDebugConfigManager() {
        return this.debugConfigManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.debugConfigManager.getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFbSessionUid() {
        /*
            r1 = this;
            java.lang.String r0 = r1.fbSessionUid
            if (r0 != 0) goto L_0x0012
            com.paypal.pyplcheckout.model.DebugConfigManager r0 = r1.debugConfigManager
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 != 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            java.lang.String r0 = com.paypal.pyplcheckout.common.cache.Cache.getFbSessionUid(r0)
            return r0
        L_0x0012:
            java.lang.String r0 = r1.fbSessionUid
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getFbSessionUid():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r2 = r2.getAllPlans();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFormattedConvertedAmount() {
        /*
            r6 = this;
            com.paypal.pyplcheckout.pojo.FundingOption r0 = r6.selectedFundingOption
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x0032
        L_0x0007:
            java.util.List r0 = r0.getAllPlans()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            com.paypal.pyplcheckout.pojo.FundingOption r2 = r6.selectedFundingOption
            if (r2 != 0) goto L_0x0014
        L_0x0012:
            r2 = r1
            goto L_0x0023
        L_0x0014:
            java.util.List r2 = r2.getAllPlans()
            if (r2 != 0) goto L_0x001b
            goto L_0x0012
        L_0x001b:
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0023:
            kotlin.jvm.internal.C19383o.m32794d(r2)
            int r2 = r2.intValue()
            int r2 = r2 + -1
            java.lang.Object r0 = r0.get(r2)
            com.paypal.pyplcheckout.pojo.Plan r0 = (com.paypal.pyplcheckout.pojo.Plan) r0
        L_0x0032:
            if (r0 != 0) goto L_0x0036
            r2 = r1
            goto L_0x003a
        L_0x0036:
            com.paypal.pyplcheckout.pojo.CurrencyConversion r2 = r0.getCurrencyConversion()
        L_0x003a:
            if (r2 == 0) goto L_0x007c
            com.paypal.pyplcheckout.pojo.CurrencyConversion r2 = r0.getCurrencyConversion()
            if (r2 != 0) goto L_0x0044
            r2 = r1
            goto L_0x0048
        L_0x0044:
            com.paypal.pyplcheckout.pojo.Amount r2 = r2.getConvertedAmount()
        L_0x0048:
            if (r2 != 0) goto L_0x004b
            goto L_0x007c
        L_0x004b:
            com.paypal.pyplcheckout.pojo.CurrencyConversion r0 = r0.getCurrencyConversion()
            if (r0 != 0) goto L_0x0053
        L_0x0051:
            r0 = r1
            goto L_0x005e
        L_0x0053:
            com.paypal.pyplcheckout.pojo.Amount r0 = r0.getConvertedAmount()
            if (r0 != 0) goto L_0x005a
            goto L_0x0051
        L_0x005a:
            java.lang.String r0 = r0.getCurrencyFormat()
        L_0x005e:
            java.lang.String r2 = TAG
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "converted amount "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5 = 4
            com.paypal.pyplcheckout.common.instrumentation.PLog.d$default(r2, r3, r4, r5, r1)
            return r0
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getFormattedConvertedAmount():java.lang.String");
    }

    public final String getFromConversionCode() {
        CurrencyConversion currencyConversion;
        Amount from;
        Plan selectedPlan = getSelectedPlan();
        if (selectedPlan == null || (currencyConversion = selectedPlan.getCurrencyConversion()) == null || (from = currencyConversion.getFrom()) == null) {
            return null;
        }
        return from.getCurrencyCode();
    }

    public final List<FundingOption> getFundingOptions() {
        FundingOption fundingOption;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        this.fundingOptionsList = checkoutSession2 == null ? null : checkoutSession2.getFundingOptions();
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        List<FundingOption> list = this.fundingOptionsList;
        if (!((list instanceof List) && (!(list instanceof C19875a) || (list instanceof C19877c)))) {
            list = null;
        }
        PLog.d$default(str, C0326j.m864i("getFundingOptions() called", (list == null || (fundingOption = (FundingOption) C19327t.m32640V0(list)) == null) ? null : fundingOption.toString()), 0, 4, (Object) null);
        return this.fundingOptionsList;
    }

    public final int getFundingOptionsCarouselPosition() {
        return this.fundingOptionsDao.getCarouselPosition();
    }

    public final String getFundingSource() {
        return this.fundingSource;
    }

    public final boolean getHasCryptoFundingInstruments() {
        List<FundingOption> fundingOptions;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (fundingOptions = checkoutSession2.getFundingOptions()) == null) {
            return false;
        }
        for (FundingOption fundingInstrument : fundingOptions) {
            if (fundingInstrument.getFundingInstrument().getType() == PaymentTypes.CRYPTOCURRENCY.toString()) {
                return true;
            }
        }
        return false;
    }

    public final boolean getHostHandlesBlockingContingencies() {
        return this.hostHandlesBlockingContingencies;
    }

    public final String getInsurance() {
        Cart cart;
        CartAmounts amounts;
        Amount insurance;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (insurance = amounts.getInsurance()) == null)) {
            str = insurance.getCurrencyFormatSymbolISOCurrency();
        }
        this.insuranceCurrency = str;
        return str;
    }

    public final JSONObject getJsonMerchantOrderInfo() {
        return this.jsonMerchantOrderInfo;
    }

    public final ShippingMethodType getLastSelectedShippingMethodType() {
        return this.lastSelectedShippingMethodType;
    }

    public final synchronized List<String> getListOfItemCosts() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Item> list = this.cartItemsList;
        if (list != null) {
            for (Item item : list) {
                Integer quantity = item.getQuantity();
                Amount unitPrice = item.getUnitPrice();
                String str = quantity + " x " + (unitPrice == null ? null : unitPrice.getCurrencyFormatSymbolISOCurrency());
                arrayList.add(str);
                String str2 = TAG;
                C19383o.m32796f(str2, "TAG");
                PLog.d$default(str2, str + "added to itemCosts list", 0, 4, (Object) null);
            }
        }
        return arrayList;
    }

    public final synchronized List<List<ProductDescription>> getListOfItemDescriptions() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Item> list = this.cartItemsList;
        if (list != null) {
            for (Item item : list) {
                ArrayList arrayList2 = new ArrayList();
                String description = item.getDescription();
                if (description == null) {
                    description = "";
                }
                ProductDescription productDescription = new ProductDescription(description);
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                String description2 = item.getDescription();
                if (description2 == null) {
                    description2 = "N/A";
                }
                PLog.d$default(str, description2 + "added to itemDescriptions list", 0, 4, (Object) null);
                arrayList2.add(productDescription);
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    public final synchronized List<String> getListOfItemNames() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Item> list = this.cartItemsList;
        if (list != null) {
            for (Item item : list) {
                String name = item.getName();
                if (name == null) {
                    name = "";
                }
                arrayList.add(name);
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                String name2 = item.getName();
                if (name2 == null) {
                    name2 = "N/A";
                }
                PLog.d$default(str, name2 + " added to itemNames list", 0, 4, (Object) null);
            }
        }
        return arrayList;
    }

    public final synchronized List<String> getListOfItemQuantities() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Item> list = this.cartItemsList;
        if (list != null) {
            for (Item item : list) {
                String valueOf = String.valueOf(item.getQuantity());
                arrayList.add(valueOf);
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                PLog.d$default(str, valueOf + "of " + item + "added to itemCosts list", 0, 4, (Object) null);
            }
        }
        return arrayList;
    }

    public final String getLsatToken() {
        LowScopedAccessToken lowScopedAccessToken = this.lsatToken;
        if (lowScopedAccessToken == null) {
            return null;
        }
        return lowScopedAccessToken.getToken();
    }

    public final Order getMerchantOrderInfo() {
        return this.merchantOrderInfo;
    }

    public final List<CreditPPCOffer> getOffers() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        List<CreditPPCOffer> creditPPCOffers = checkoutSession2 == null ? null : checkoutSession2.getCreditPPCOffers();
        this.offers = creditPPCOffers;
        return creditPPCOffers;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.getFlags();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getOffersUrl() {
        /*
            r4 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r4.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x0012
        L_0x0007:
            com.paypal.pyplcheckout.pojo.Flags r0 = r0.getFlags()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            java.lang.Boolean r0 = r0.getShowPPCreditOffer()
        L_0x0012:
            if (r0 == 0) goto L_0x0052
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r4.checkoutSession
            r2 = 0
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            r0 = r2
            goto L_0x002c
        L_0x001b:
            com.paypal.pyplcheckout.pojo.Flags r0 = r0.getFlags()
            if (r0 != 0) goto L_0x0022
            goto L_0x0019
        L_0x0022:
            java.lang.Boolean r0 = r0.getShowPPCreditOffer()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
        L_0x002c:
            if (r0 == 0) goto L_0x0052
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r4.checkoutSession
            if (r0 != 0) goto L_0x0034
            r0 = r1
            goto L_0x0038
        L_0x0034:
            java.util.List r0 = r0.getCreditPPCOffers()
        L_0x0038:
            r3 = 1
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r2 = r3
        L_0x0042:
            if (r2 != 0) goto L_0x0052
            com.paypal.pyplcheckout.utils.PYPLCheckoutUtils$Companion r0 = com.paypal.pyplcheckout.utils.PYPLCheckoutUtils.Companion
            com.paypal.pyplcheckout.utils.PYPLCheckoutUtils r0 = r0.getInstance()
            android.net.Uri r0 = com.paypal.pyplcheckout.utils.PYPLCheckoutUtils.getCheckoutLiteUrl$default(r0, r1, r3, r1)
            java.lang.String r1 = r0.toString()
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getOffersUrl():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = (r0 = r1.debugConfigManager).getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getOrderId() {
        /*
            r1 = this;
            java.lang.String r0 = r1.orderId
            if (r0 != 0) goto L_0x0015
            com.paypal.pyplcheckout.model.DebugConfigManager r0 = r1.debugConfigManager
            if (r0 != 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.lang.String r0 = com.paypal.pyplcheckout.common.cache.Cache.getOrderId(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = r1.orderId
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getOrderId():java.lang.String");
    }

    public final PayModeEnum getPayMode() {
        PayModeEnum payMode2 = this.debugConfigManager.getPayMode();
        return payMode2 == null ? PayModeEnum.CONTINUE : payMode2;
    }

    public final String getPaymentAuthenticationRequest() {
        return this.paymentAuthenticationRequest;
    }

    public final String getPaymentToken() {
        return this.payToken;
    }

    public final List<ShippingMethods> getPickUpMethodsList() {
        return this._pickUpMethodsList;
    }

    public final String getPreferredFundingOptionId() {
        return this.preferredFundingOptionId;
    }

    public final String getPrimaryFundingOptionId() {
        FundingOption primaryFundingOption;
        Plan plan = this.userSelectedPlan;
        if (plan == null || (primaryFundingOption = plan.getPrimaryFundingOption()) == null) {
            return null;
        }
        return primaryFundingOption.getId();
    }

    public final boolean getPropsSet() {
        return this.propsSet;
    }

    public final Uri getReferrerPackage() {
        return this.referrerPackage;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = (r0 = (r0 = r0.getCart()).getReturnUrl()).getHref();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getReturnUrl() {
        /*
            r2 = this;
            java.lang.String r0 = r2.returnUrl
            if (r0 != 0) goto L_0x0021
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r2.checkoutSession
            java.lang.String r1 = "https://www.paypal.com/checkoutnow/error"
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r0 = r1
            goto L_0x0021
        L_0x000c:
            com.paypal.pyplcheckout.pojo.Cart r0 = r0.getCart()
            if (r0 != 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            com.paypal.pyplcheckout.pojo.ReturnUrl r0 = r0.getReturnUrl()
            if (r0 != 0) goto L_0x001a
            goto L_0x000a
        L_0x001a:
            java.lang.String r0 = r0.getHref()
            if (r0 != 0) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getReturnUrl():java.lang.String");
    }

    public final long getSDKLaunchTime() {
        return this.sDKLaunchTime;
    }

    public final String getScaContextId() {
        PaymentContingencies paymentContingencies;
        StrongCustomerAuthenticationRequiredContingency strongCustomerAuthenticationRequired;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (paymentContingencies = checkoutSession2.getPaymentContingencies()) == null || (strongCustomerAuthenticationRequired = paymentContingencies.getStrongCustomerAuthenticationRequired()) == null) {
            return null;
        }
        return strongCustomerAuthenticationRequired.getContextId();
    }

    public final List<String> getSecondaryFundingOptionIds() {
        List<FundingOption> secondaryFundingOptions;
        ArrayList arrayList = new ArrayList();
        Plan plan = this.userSelectedPlan;
        if (!(plan == null || (secondaryFundingOptions = plan.getSecondaryFundingOptions()) == null)) {
            for (FundingOption id : secondaryFundingOptions) {
                String id2 = id.getId();
                if (id2 != null) {
                    arrayList.add(id2);
                    String str = TAG;
                    C19383o.m32796f(str, "TAG");
                    PLog.d$default(str, id2 + " id is added to secondaryFundingOptions list", 0, 4, (Object) null);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final ShippingAddress getSelectedAddress() {
        return this.selectedAddress;
    }

    public final String getSelectedAddressId() {
        ShippingAddress shippingAddress = this.selectedAddress;
        if (shippingAddress == null) {
            return null;
        }
        return shippingAddress.getAddressId();
    }

    public final int getSelectedAddressIndex() {
        return this.selectedAddressIndex;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r0 = (r0 = r0.getThreeDSContingencyData()).getResolution();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.paypal.pyplcheckout.pojo.PaymentContingencies getSelectedCardContingencies() {
        /*
            r3 = this;
            com.paypal.pyplcheckout.pojo.PaymentContingencies r0 = r3.supportedContingencies
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x0019
        L_0x0007:
            com.paypal.pyplcheckout.pojo.ThreeDSContingencyData r0 = r0.getThreeDSContingencyData()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            com.paypal.pyplcheckout.pojo.ThreeDsResolution r0 = r0.getResolution()
            if (r0 != 0) goto L_0x0015
            goto L_0x0005
        L_0x0015:
            com.paypal.pyplcheckout.pojo.ThreeDSPaymentCardData r0 = r0.getPaymentCard()
        L_0x0019:
            com.paypal.pyplcheckout.pojo.FundingOption r2 = r3.selectedFundingOption
            if (r2 != 0) goto L_0x001f
            r2 = r1
            goto L_0x0023
        L_0x001f:
            com.paypal.pyplcheckout.pojo.FundingInstrument r2 = r2.getFundingInstrument()
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            return r1
        L_0x0026:
            if (r0 != 0) goto L_0x002a
            r0 = r1
            goto L_0x002e
        L_0x002a:
            java.lang.String r0 = r0.getId()
        L_0x002e:
            java.lang.String r2 = r2.getId()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
            if (r0 == 0) goto L_0x003a
            com.paypal.pyplcheckout.pojo.PaymentContingencies r1 = r3.supportedContingencies
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getSelectedCardContingencies():com.paypal.pyplcheckout.pojo.PaymentContingencies");
    }

    public final CurrencyConversionType getSelectedCurrencyConversionType() {
        return this.selectedCurrencyConversionType;
    }

    public final FundingOption getSelectedFundingOption() {
        FundingOption fundingOption = this.selectedFundingOption;
        if (fundingOption != null) {
            return fundingOption;
        }
        FundingOption selectedFundingOption2 = this.fundingOptionsDao.getSelectedFundingOption();
        if (selectedFundingOption2 == null) {
            return null;
        }
        this.selectedFundingOption = selectedFundingOption2;
        return selectedFundingOption2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r0 = r0.getFundingInstrument()).getType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getSelectedFundingOptionType() {
        /*
            r2 = this;
            com.paypal.pyplcheckout.pojo.FundingOption r0 = r2.selectedFundingOption
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            goto L_0x0016
        L_0x0007:
            com.paypal.pyplcheckout.pojo.FundingInstrument r0 = r0.getFundingInstrument()
            if (r0 != 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.String r0 = r0.getType()
            if (r0 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getSelectedFundingOptionType():java.lang.String");
    }

    public final ShippingMethods getSelectedMethodOption(ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        if (shippingMethodType.isShipping()) {
            return (ShippingMethods) C19327t.m32641W0(this.selectedShippingMethodIndex, getShippingMethodsList());
        }
        return (ShippingMethods) C19327t.m32641W0(this.selectedPickUpMethodIndex, getPickUpMethodsList());
    }

    public final int getSelectedMethodOptionIndex(ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        return shippingMethodType.isShipping() ? this.selectedShippingMethodIndex : this.selectedPickUpMethodIndex;
    }

    public final ShippingMethods getSelectedShippingMethod() {
        return this.selectedShippingMethod;
    }

    public final List<ShippingAddress> getShippingAddressList() {
        List<ShippingAddress> list = this.shippingAddressList;
        if (list != null) {
            for (ShippingAddress shippingAddress : list) {
                if (this.invalidShippingAddressesSet.contains(shippingAddress.getAddressId())) {
                    shippingAddress.setInvalid(true);
                }
            }
        }
        return this.shippingAddressList;
    }

    public final String getShippingAndHandling() {
        Cart cart;
        CartAmounts amounts;
        Amount shippingAndHandling2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (shippingAndHandling2 = amounts.getShippingAndHandling()) == null)) {
            str = shippingAndHandling2.getCurrencyFormatSymbolISOCurrency();
        }
        this.shippingAndHandling = str;
        return str;
    }

    public final List<Options> getShippingAndPickUpOptions(ShippingMethodType shippingMethodType) {
        CurrencyCode currencyCode;
        String str;
        String currencyFormatSymbolISOCurrency;
        String str2;
        String currencyFormatSymbolISOCurrency2;
        C19383o.m32797g(shippingMethodType, "selectedShippingMethod");
        if (this.debugConfigManager.getCurrencyCode() != null) {
            currencyCode = this.debugConfigManager.getCurrencyCode();
            C19383o.m32794d(currencyCode);
        } else {
            String str3 = "";
            if (!getShippingMethodsList().isEmpty()) {
                Amount amount = ((ShippingMethods) C19327t.m32638T0(getShippingMethodsList())).getAmount();
                if (amount == null || (currencyFormatSymbolISOCurrency2 = amount.getCurrencyFormatSymbolISOCurrency()) == null) {
                    str2 = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    int length = currencyFormatSymbolISOCurrency2.length();
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        char charAt = currencyFormatSymbolISOCurrency2.charAt(i);
                        if (Character.isLetter(charAt)) {
                            sb.append(charAt);
                        }
                        i = i2;
                    }
                    str2 = sb.toString();
                    C19383o.m32796f(str2, "filterTo(StringBuilder(), predicate).toString()");
                }
                if (str2 != null) {
                    str3 = str2;
                }
                currencyCode = CurrencyCode.valueOf(str3);
            } else if (!getPickUpMethodsList().isEmpty()) {
                Amount amount2 = ((ShippingMethods) C19327t.m32638T0(getPickUpMethodsList())).getAmount();
                if (amount2 == null || (currencyFormatSymbolISOCurrency = amount2.getCurrencyFormatSymbolISOCurrency()) == null) {
                    str = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int length2 = currencyFormatSymbolISOCurrency.length();
                    int i3 = 0;
                    while (i3 < length2) {
                        int i4 = i3 + 1;
                        char charAt2 = currencyFormatSymbolISOCurrency.charAt(i3);
                        if (Character.isLetter(charAt2)) {
                            sb2.append(charAt2);
                        }
                        i3 = i4;
                    }
                    str = sb2.toString();
                    C19383o.m32796f(str, "filterTo(StringBuilder(), predicate).toString()");
                }
                if (str != null) {
                    str3 = str;
                }
                currencyCode = CurrencyCode.valueOf(str3);
            } else {
                currencyCode = CurrencyCode.USD;
            }
        }
        boolean isShipping = shippingMethodType.isShipping();
        if (isShipping && this.selectedShippingMethodIndex == -1) {
            this.selectedShippingMethodIndex = 0;
        }
        List<ShippingMethods> shippingMethodsList = getShippingMethodsList();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(shippingMethodsList));
        int i5 = 0;
        for (T next : shippingMethodsList) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                arrayList.add(ShippingMethods.copy$default((ShippingMethods) next, (String) null, (String) null, isShipping && i5 == this.selectedShippingMethodIndex, (Amount) null, (ShippingMethodType.Type) null, 27, (Object) null));
                i5 = i6;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        List<ShippingMethods> pickUpMethodsList = getPickUpMethodsList();
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(pickUpMethodsList));
        int i7 = 0;
        for (T next2 : pickUpMethodsList) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                arrayList2.add(ShippingMethods.copy$default((ShippingMethods) next2, (String) null, (String) null, !isShipping && i7 == this.selectedPickUpMethodIndex, (Amount) null, (ShippingMethodType.Type) null, 27, (Object) null));
                i7 = i8;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        ArrayList f1 = C19327t.m32650f1(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(f1));
        Iterator it = f1.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ShippingMethods) it.next()).toOptions(currencyCode));
        }
        return arrayList3;
    }

    public final String getShippingDiscount() {
        Cart cart;
        CartAmounts amounts;
        Amount shippingDiscount2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (shippingDiscount2 = amounts.getShippingDiscount()) == null)) {
            str = shippingDiscount2.getCurrencyFormatSymbolISOCurrency();
        }
        this.shippingDiscount = str;
        return str;
    }

    public final List<ShippingMethods> getShippingMethodsList() {
        return this._shippingMethodsList;
    }

    public final boolean getShowCloseButton() {
        return this.debugConfigManager.shouldShowCloseButton();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = (r0 = r1.debugConfigManager).getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getSmartPaymentButtonSessionId() {
        /*
            r1 = this;
            java.lang.String r0 = r1.smartPaymentButtonSessionId
            if (r0 != 0) goto L_0x0015
            com.paypal.pyplcheckout.model.DebugConfigManager r0 = r1.debugConfigManager
            if (r0 != 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.lang.String r0 = com.paypal.pyplcheckout.common.cache.Cache.getButtonSessionId(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = r1.smartPaymentButtonSessionId
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getSmartPaymentButtonSessionId():java.lang.String");
    }

    public final String getSmartPaymentButtonStickinessId() {
        String str = this.smartPaymentButtonStickinessId;
        if (str != null) {
            return str;
        }
        Context applicationContext = this.debugConfigManager.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return CacheConfigManager.Companion.getInstance().getStickinessId(applicationContext);
    }

    public final PEnums.Stage getStage() {
        return this.stage;
    }

    public final String getStartupMechanism() {
        return this.startupMechanism;
    }

    public final String getSubtotal() {
        Cart cart;
        CartAmounts amounts;
        Amount subtotal2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (subtotal2 = amounts.getSubtotal()) == null)) {
            str = subtotal2.getCurrencyFormatSymbolISOCurrency();
        }
        this.subtotal = str;
        return str;
    }

    public final PaymentContingencies getSupportedContingencies() {
        return this.supportedContingencies;
    }

    public final List<SupportedFundingSources> getSupportedFundingSources() {
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null) {
            return null;
        }
        return checkoutSession2.getSupportedFundingSources();
    }

    public final ShippingMethodType getSupportedShippingMethodType() {
        return this.supportedShippingMethodType;
    }

    public final String getTax() {
        Cart cart;
        CartAmounts amounts;
        Amount tax2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (tax2 = amounts.getTax()) == null)) {
            str = tax2.getCurrencyFormatSymbolISOCurrency();
        }
        this.tax = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r3 = r3.getContent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTermLink() {
        /*
            r5 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r5.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x004b
        L_0x0006:
            java.util.List r0 = r0.getCreditPPCOffers()
            if (r0 != 0) goto L_0x000d
            goto L_0x004b
        L_0x000d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r3 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r3
            if (r3 != 0) goto L_0x0022
        L_0x0020:
            r3 = r1
            goto L_0x002d
        L_0x0022:
            com.paypal.pyplcheckout.pojo.Content r3 = r3.getContent()
            if (r3 != 0) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            java.lang.String r3 = r3.getProduct()
        L_0x002d:
            com.paypal.pyplcheckout.utils.PaymentTypes r4 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT_OFFER
            java.lang.String r4 = r4.toString()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x0011
            goto L_0x003b
        L_0x003a:
            r2 = r1
        L_0x003b:
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r2 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r2
            if (r2 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            com.paypal.pyplcheckout.pojo.Content r0 = r2.getContent()
            if (r0 != 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            java.lang.String r1 = r0.getTermsLink()
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getTermLink():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        if ((r4.length() > 0) == true) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r3 = r3.getContent();
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTermsText() {
        /*
            r5 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r5.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x003f
        L_0x0006:
            java.util.List r0 = r0.getCreditPPCOffers()
            if (r0 != 0) goto L_0x000d
            goto L_0x003f
        L_0x000d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r3 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r3
            if (r3 != 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            com.paypal.pyplcheckout.pojo.Content r3 = r3.getContent()
            if (r3 != 0) goto L_0x0029
        L_0x0027:
            r3 = r1
            goto L_0x002d
        L_0x0029:
            java.lang.String r3 = r3.getProduct()
        L_0x002d:
            com.paypal.pyplcheckout.utils.PaymentTypes r4 = com.paypal.pyplcheckout.utils.PaymentTypes.PAYPAL_CREDIT_OFFER
            java.lang.String r4 = r4.toString()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x0011
            goto L_0x003b
        L_0x003a:
            r2 = r1
        L_0x003b:
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r2 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r2
            if (r2 != 0) goto L_0x0041
        L_0x003f:
            r0 = r1
            goto L_0x0045
        L_0x0041:
            com.paypal.pyplcheckout.pojo.Content r0 = r2.getContent()
        L_0x0045:
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x004a
            goto L_0x005e
        L_0x004a:
            java.lang.String r4 = r0.getTermsText()
            if (r4 != 0) goto L_0x0051
            goto L_0x005e
        L_0x0051:
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r3
        L_0x005a:
            if (r4 != r2) goto L_0x005e
            r4 = r2
            goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 == 0) goto L_0x0085
            java.lang.String r4 = r0.getTermsLinkText()
            if (r4 != 0) goto L_0x0068
            goto L_0x0074
        L_0x0068:
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0070
            r4 = r2
            goto L_0x0071
        L_0x0070:
            r4 = r3
        L_0x0071:
            if (r4 != r2) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r2 = r3
        L_0x0075:
            if (r2 == 0) goto L_0x0085
            java.lang.String r1 = r0.getTermsText()
            java.lang.String r0 = r0.getTermsLinkText()
            java.lang.String r2 = " "
            java.lang.String r1 = p010a9.C0048b.m163a(r1, r2, r0)
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getTermsText():java.lang.String");
    }

    public final String getThreeDSProcessorTraceNumber() {
        return this.threeDSProcessorTraceNumber;
    }

    public final String getToConversionCode() {
        CurrencyConversion currencyConversion;
        Amount to;
        Plan selectedPlan = getSelectedPlan();
        if (selectedPlan == null || (currencyConversion = selectedPlan.getCurrencyConversion()) == null || (to = currencyConversion.getTo()) == null) {
            return null;
        }
        return to.getCurrencyCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = (r0 = r1.debugConfigManager).getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getToken() {
        /*
            r1 = this;
            java.lang.String r0 = r1.token
            if (r0 != 0) goto L_0x0015
            com.paypal.pyplcheckout.model.DebugConfigManager r0 = r1.debugConfigManager
            if (r0 != 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.lang.String r0 = com.paypal.pyplcheckout.common.cache.Cache.getSPBToken(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = r1.token
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getToken():java.lang.String");
    }

    public final String getTotalCurrencyCode() {
        Cart cart;
        CartAmounts amounts;
        Amount total2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (total2 = amounts.getTotal()) == null) {
            return null;
        }
        return total2.getCurrencyCode();
    }

    public final String getTotalCurrencyValue() {
        Cart cart;
        CartAmounts amounts;
        Amount total2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (total2 = amounts.getTotal()) == null) {
            return null;
        }
        return total2.getCurrencyValue();
    }

    public final String getTotalFormat() {
        Cart cart;
        CartAmounts amounts;
        Amount total2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (total2 = amounts.getTotal()) == null)) {
            str = total2.getCurrencyFormat();
        }
        this.total = str;
        return str;
    }

    public final String getTotalISO() {
        Cart cart;
        CartAmounts amounts;
        Amount total2;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (amounts = cart.getAmounts()) == null || (total2 = amounts.getTotal()) == null)) {
            str = total2.getCurrencyFormatSymbolISOCurrency();
        }
        this.total = str;
        return str;
    }

    public final String getTotalOverCaptureAmount() {
        Cart cart;
        Amount totalAllowedOverCaptureAmount;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (totalAllowedOverCaptureAmount = cart.getTotalAllowedOverCaptureAmount()) == null) {
            return null;
        }
        return totalAllowedOverCaptureAmount.getCurrencyFormat();
    }

    public final String getTotalOverCaptureAmountValue() {
        Cart cart;
        Amount totalAllowedOverCaptureAmount;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null || (totalAllowedOverCaptureAmount = cart.getTotalAllowedOverCaptureAmount()) == null) {
            return null;
        }
        return totalAllowedOverCaptureAmount.getCurrencyValue();
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final User getUser() {
        return get_user();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.getUserId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getUserId() {
        /*
            r2 = this;
            com.paypal.pyplcheckout.pojo.User r0 = r2.get_user()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.String r0 = r0.getUserId()
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.getUserId():java.lang.String");
    }

    public final String getUserSelectedPlanId() {
        Plan plan = this.userSelectedPlan;
        if (plan == null) {
            return null;
        }
        return plan.getId();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.paypal.pyplcheckout.pojo.ShippingMethods} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.paypal.pyplcheckout.pojo.ShippingMethods} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.paypal.pyplcheckout.pojo.ShippingMethods} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.paypal.pyplcheckout.pojo.ShippingMethods} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getCart();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initShippingMethods$pyplcheckout_externalThreedsRelease() {
        /*
            r11 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r11.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x000c
        L_0x0006:
            com.paypal.pyplcheckout.pojo.Cart r0 = r0.getCart()
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r0 = r1
            goto L_0x0012
        L_0x000e:
            java.util.List r0 = r0.getShippingMethods()
        L_0x0012:
            if (r0 != 0) goto L_0x0016
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x0016:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x001d
            return
        L_0x001d:
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingMethods> r2 = r11._shippingMethodsList
            boolean r2 = r2.isEmpty()
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x007d
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingMethods> r2 = r11._shippingMethodsList
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x0033:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0051
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.paypal.pyplcheckout.pojo.ShippingMethods r9 = (com.paypal.pyplcheckout.pojo.ShippingMethods) r9
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r9 = r9.getType()
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r10 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.SHIPPING
            if (r9 != r10) goto L_0x004a
            r9 = r5
            goto L_0x004b
        L_0x004a:
            r9 = r4
        L_0x004b:
            if (r9 == 0) goto L_0x0033
            r6.add(r8)
            goto L_0x0033
        L_0x0051:
            com.paypal.pyplcheckout.services.Repository$initShippingMethods$$inlined$sortedBy$1 r7 = new com.paypal.pyplcheckout.services.Repository$initShippingMethods$$inlined$sortedBy$1
            r7.<init>()
            java.util.List r6 = kotlin.collections.C19327t.m32656l1(r6, r7)
            r2.addAll(r6)
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingMethods> r2 = r11._shippingMethodsList
            java.util.Iterator r2 = r2.iterator()
            r6 = r4
        L_0x0064:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r2.next()
            com.paypal.pyplcheckout.pojo.ShippingMethods r7 = (com.paypal.pyplcheckout.pojo.ShippingMethods) r7
            boolean r7 = r7.getSelected()
            if (r7 == 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x007a:
            r6 = r3
        L_0x007b:
            r11.selectedShippingMethodIndex = r6
        L_0x007d:
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingMethods> r2 = r11._pickUpMethodsList
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00d9
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingMethods> r2 = r11._pickUpMethodsList
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x0090:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ae
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.paypal.pyplcheckout.pojo.ShippingMethods r9 = (com.paypal.pyplcheckout.pojo.ShippingMethods) r9
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r9 = r9.getType()
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r10 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.PICKUP
            if (r9 != r10) goto L_0x00a7
            r9 = r5
            goto L_0x00a8
        L_0x00a7:
            r9 = r4
        L_0x00a8:
            if (r9 == 0) goto L_0x0090
            r6.add(r8)
            goto L_0x0090
        L_0x00ae:
            com.paypal.pyplcheckout.services.Repository$initShippingMethods$$inlined$sortedBy$2 r7 = new com.paypal.pyplcheckout.services.Repository$initShippingMethods$$inlined$sortedBy$2
            r7.<init>()
            java.util.List r6 = kotlin.collections.C19327t.m32656l1(r6, r7)
            r2.addAll(r6)
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingMethods> r2 = r11._pickUpMethodsList
            java.util.Iterator r2 = r2.iterator()
        L_0x00c0:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00d7
            java.lang.Object r6 = r2.next()
            com.paypal.pyplcheckout.pojo.ShippingMethods r6 = (com.paypal.pyplcheckout.pojo.ShippingMethods) r6
            boolean r6 = r6.getSelected()
            if (r6 == 0) goto L_0x00d4
            r3 = r4
            goto L_0x00d7
        L_0x00d4:
            int r4 = r4 + 1
            goto L_0x00c0
        L_0x00d7:
            r11.selectedPickUpMethodIndex = r3
        L_0x00d9:
            java.util.Iterator r0 = r0.iterator()
        L_0x00dd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f1
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.paypal.pyplcheckout.pojo.ShippingMethods r3 = (com.paypal.pyplcheckout.pojo.ShippingMethods) r3
            boolean r3 = r3.getSelected()
            if (r3 == 0) goto L_0x00dd
            r1 = r2
        L_0x00f1:
            com.paypal.pyplcheckout.pojo.ShippingMethods r1 = (com.paypal.pyplcheckout.pojo.ShippingMethods) r1
            r11.selectedShippingMethod = r1
            com.paypal.pyplcheckout.pojo.ShippingMethodType r0 = r11.supportedShippingMethodType
            if (r0 != 0) goto L_0x0174
            java.util.List r0 = r11.getShippingMethodsList()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0119
            java.util.List r0 = r11.getPickUpMethodsList()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0119
            com.paypal.pyplcheckout.pojo.ShippingMethodType r0 = new com.paypal.pyplcheckout.pojo.ShippingMethodType
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r1 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.SHIPPING_AND_PICKUP
            r0.<init>(r1)
            r11.supportedShippingMethodType = r0
            goto L_0x0174
        L_0x0119:
            java.util.List r0 = r11.getShippingMethodsList()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0138
            java.util.List r0 = r11.getPickUpMethodsList()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0138
            com.paypal.pyplcheckout.pojo.ShippingMethodType r0 = new com.paypal.pyplcheckout.pojo.ShippingMethodType
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r1 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.PICKUP
            r0.<init>(r1)
            r11.supportedShippingMethodType = r0
            goto L_0x0174
        L_0x0138:
            java.util.List r0 = r11.getShippingMethodsList()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0157
            java.util.List r0 = r11.getPickUpMethodsList()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0157
            com.paypal.pyplcheckout.pojo.ShippingMethodType r0 = new com.paypal.pyplcheckout.pojo.ShippingMethodType
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r1 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.SHIPPING
            r0.<init>(r1)
            r11.supportedShippingMethodType = r0
            goto L_0x0174
        L_0x0157:
            java.util.List r0 = r11.getShippingMethodsList()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0174
            java.util.List r0 = r11.getPickUpMethodsList()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0174
            com.paypal.pyplcheckout.pojo.ShippingMethodType r0 = new com.paypal.pyplcheckout.pojo.ShippingMethodType
            com.paypal.pyplcheckout.pojo.ShippingMethodType$Type r1 = com.paypal.pyplcheckout.pojo.ShippingMethodType.Type.NONE
            r0.<init>(r1)
            r11.supportedShippingMethodType = r0
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.initShippingMethods$pyplcheckout_externalThreedsRelease():void");
    }

    public final boolean isAddNewShippingAddress() {
        return this.addNewShippingAddressFlag;
    }

    public final boolean isCctOpenedForAddingResources() {
        return this.isCctOpenedForAddingResources;
    }

    public final Boolean isChangingShippingAddressAllowed() {
        Flags flags;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (flags = checkoutSession2.getFlags()) == null) {
            return null;
        }
        return flags.isChangeShippingAddressAllowed();
    }

    public final boolean isContingencyCardIdCleared(String str) {
        C19383o.m32797g(str, "cardId");
        return this.clearedContingenciesCardIds.contains(str);
    }

    public final boolean isCurrencyConverted() {
        return this.isCurrencyConverted;
    }

    public final boolean isPayPalConversionOptionShown() {
        return this.isPayPalConversionOptionShown;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = getCheckoutSessionType();
        r1 = com.paypal.pyplcheckout.pojo.CheckoutSessionType.BILLING_WITH_PURCHASE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isPrimaryFundingOptionIdExist() {
        /*
            r2 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSessionType r0 = r2.getCheckoutSessionType()
            com.paypal.pyplcheckout.pojo.CheckoutSessionType r1 = com.paypal.pyplcheckout.pojo.CheckoutSessionType.PURCHASE
            if (r0 == r1) goto L_0x0025
            com.paypal.pyplcheckout.pojo.CheckoutSessionType r0 = r2.getCheckoutSessionType()
            com.paypal.pyplcheckout.pojo.CheckoutSessionType r1 = com.paypal.pyplcheckout.pojo.CheckoutSessionType.BILLING_WITH_PURCHASE
            if (r0 == r1) goto L_0x0025
            com.paypal.pyplcheckout.pojo.CheckoutSessionType r0 = r2.getCheckoutSessionType()
            if (r0 != r1) goto L_0x0023
            java.lang.Boolean r0 = r2.isStickyBillingAllowed()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.isPrimaryFundingOptionIdExist():boolean");
    }

    public final boolean isSecondaryFundingOptionIdsExist() {
        List<String> secondaryFundingOptionIds = getSecondaryFundingOptionIds();
        return !(secondaryFundingOptionIds == null || secondaryFundingOptionIds.isEmpty());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.getFlags();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isSignUpEligible() {
        /*
            r3 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r3.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x0012
        L_0x0007:
            com.paypal.pyplcheckout.pojo.Flags r0 = r0.getFlags()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            java.lang.Boolean r0 = r0.isSignupEligible()
        L_0x0012:
            if (r0 == 0) goto L_0x0046
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r3.checkoutSession
            r2 = 0
            if (r0 != 0) goto L_0x001a
            goto L_0x002b
        L_0x001a:
            com.paypal.pyplcheckout.pojo.Flags r0 = r0.getFlags()
            if (r0 != 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            java.lang.Boolean r0 = r0.isSignupEligible()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
        L_0x002b:
            if (r2 == 0) goto L_0x0046
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r3.checkoutSession
            if (r0 != 0) goto L_0x0032
            goto L_0x003d
        L_0x0032:
            com.paypal.pyplcheckout.pojo.Flags r0 = r0.getFlags()
            if (r0 != 0) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            java.lang.Boolean r1 = r0.isSignupEligible()
        L_0x003d:
            kotlin.jvm.internal.C19383o.m32794d(r1)
            boolean r0 = r1.booleanValue()
            r3.isSignUpEligible = r0
        L_0x0046:
            boolean r0 = r3.isSignUpEligible
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.isSignUpEligible():boolean");
    }

    public final boolean isSkipEligibility() {
        return this.isSkipEligibility;
    }

    public final Boolean isStickyBillingAllowed() {
        Flags flags;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        if (checkoutSession2 == null || (flags = checkoutSession2.getFlags()) == null) {
            return null;
        }
        return flags.getStickyBillingAllowed();
    }

    public final boolean isVaultFlow() {
        return this.isVaultFlow;
    }

    public final boolean isVenmo() {
        return C19383o.m32792b(PEnums.FundingSource.VENMO.name(), this.fundingSource) && this.debugConfigManager.isSmartPaymentCheckout();
    }

    public final void parseUserAndCheckoutResponse(UserCheckoutResponse userCheckoutResponse2, VmListensToRepoForUserAndCheckoutPayload vmListensToRepoForUserAndCheckoutPayload) {
        String str;
        String str2;
        UserCheckoutResponse userCheckoutResponse3 = userCheckoutResponse2;
        C19383o.m32797g(userCheckoutResponse3, "checkoutResponse");
        C19383o.m32797g(vmListensToRepoForUserAndCheckoutPayload, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.userCheckoutResponse = userCheckoutResponse3;
        Data data = userCheckoutResponse2.getData();
        String str3 = null;
        set_user(data == null ? null : data.getUser());
        Data data2 = userCheckoutResponse2.getData();
        this.checkoutSession = data2 == null ? null : data2.getCheckoutSession();
        try {
            boolean checkForUnSupportedFlows = this.userCheckoutResponse.checkForUnSupportedFlows();
            boolean hasUnsupportedContingencies = this.userCheckoutResponse.hasUnsupportedContingencies();
            if (this.userCheckoutResponse.getErrors() == null && !checkForUnSupportedFlows && !hasUnsupportedContingencies) {
                CheckoutSession checkoutSession2 = this.checkoutSession;
                this.supportedContingencies = checkoutSession2 == null ? null : checkoutSession2.getPaymentContingencies();
                CheckoutSession checkoutSession3 = this.checkoutSession;
                if (checkoutSession3 != null) {
                    List<FundingOption> fundingOptions = checkoutSession3.getFundingOptions();
                    if (fundingOptions != null) {
                        CheckoutSession checkoutSession4 = this.checkoutSession;
                        setupFundingOptions(fundingOptions, checkoutSession4 == null ? null : checkoutSession4.getUserAction());
                    }
                }
                vmListensToRepoForUserAndCheckoutPayload.onTaskCompleted();
                CheckoutIdlingResource.Companion.getInstance().decrement();
            } else if (checkForUnSupportedFlows) {
                CheckoutIdlingResource.Companion.getInstance().decrement();
                CheckoutSession checkoutSession5 = this.checkoutSession;
                if (checkoutSession5 != null) {
                    Flags flags = checkoutSession5.getFlags();
                    if (flags != null) {
                        str2 = flags.toString();
                        String str4 = TAG;
                        C19383o.m32796f(str4, "TAG");
                        String format = String.format("userCheckoutResponse un supported flow:  %s", Arrays.copyOf(new Object[]{str2}, 1));
                        C19383o.m32796f(format, "format(format, *args)");
                        PLog.d$default(str4, format, 0, 4, (Object) null);
                        PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "user checkout", PEnums.FallbackReason.UNSUPPORTED_FLOW, PEnums.FallbackCategory.FEATURE_NOT_SUPPORTED, str2, (PEnums.TransitionName) null, ErrorReason.FEATURE_NOT_SUPPORTED_ERROR, new UnsupportedOperationException("User and checkout response has an supported flow"), 16, (Object) null);
                    }
                }
                str2 = null;
                String str42 = TAG;
                C19383o.m32796f(str42, "TAG");
                String format2 = String.format("userCheckoutResponse un supported flow:  %s", Arrays.copyOf(new Object[]{str2}, 1));
                C19383o.m32796f(format2, "format(format, *args)");
                PLog.d$default(str42, format2, 0, 4, (Object) null);
                PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "user checkout", PEnums.FallbackReason.UNSUPPORTED_FLOW, PEnums.FallbackCategory.FEATURE_NOT_SUPPORTED, str2, (PEnums.TransitionName) null, ErrorReason.FEATURE_NOT_SUPPORTED_ERROR, new UnsupportedOperationException("User and checkout response has an supported flow"), 16, (Object) null);
            } else if (hasUnsupportedContingencies) {
                CheckoutIdlingResource.Companion.getInstance().decrement();
                CheckoutSession checkoutSession6 = this.checkoutSession;
                if (checkoutSession6 != null) {
                    PaymentContingencies paymentContingencies = checkoutSession6.getPaymentContingencies();
                    if (paymentContingencies != null) {
                        str = paymentContingencies.toString();
                        String str5 = TAG;
                        C19383o.m32796f(str5, "TAG");
                        String format3 = String.format("userCheckoutResponse payments contingencies:  %s", Arrays.copyOf(new Object[]{str}, 1));
                        C19383o.m32796f(format3, "format(format, *args)");
                        PLog.d$default(str5, format3, 0, 4, (Object) null);
                        PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "user checkout", PEnums.FallbackReason.PAYMENT_CONTINGENCIES, PEnums.FallbackCategory.CHECKOUT_SESSION_CONTINGENCIES, str, (PEnums.TransitionName) null, ErrorReason.CONTINGENCIES_ERROR, new UnsupportedOperationException("User has contingencies"), 16, (Object) null);
                    }
                }
                str = null;
                String str52 = TAG;
                C19383o.m32796f(str52, "TAG");
                String format32 = String.format("userCheckoutResponse payments contingencies:  %s", Arrays.copyOf(new Object[]{str}, 1));
                C19383o.m32796f(format32, "format(format, *args)");
                PLog.d$default(str52, format32, 0, 4, (Object) null);
                PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "user checkout", PEnums.FallbackReason.PAYMENT_CONTINGENCIES, PEnums.FallbackCategory.CHECKOUT_SESSION_CONTINGENCIES, str, (PEnums.TransitionName) null, ErrorReason.CONTINGENCIES_ERROR, new UnsupportedOperationException("User has contingencies"), 16, (Object) null);
            } else if (this.userCheckoutResponse.getErrors() != null) {
                CheckoutIdlingResource.Companion.getInstance().decrement();
                List<Error> errors = this.userCheckoutResponse.getErrors();
                String obj = errors == null ? null : errors.toString();
                String firstError = this.userCheckoutResponse.getFirstError();
                if (firstError == null) {
                    firstError = "";
                }
                PEnums.FallbackReason fallbackReason = PEnums.FallbackReason.UNKNOWN_CHECKOUT_ISSUE.setFallbackReason(firstError);
                String str6 = TAG;
                C19383o.m32796f(str6, "TAG");
                String format4 = String.format("userCheckoutResponse errors:  %s", Arrays.copyOf(new Object[]{obj}, 1));
                C19383o.m32796f(format4, "format(format, *args)");
                PLog.d$default(str6, format4, 0, 4, (Object) null);
                PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "user checkout", fallbackReason, PEnums.FallbackCategory.CHECKOUT_ERRORS, obj, (PEnums.TransitionName) null, ErrorReason.USER_AND_CHECKOUT_ERROR, new ApiErrorException("Error in user and checkout response: " + obj), 16, (Object) null);
            }
        } catch (Exception e) {
            Exception exc = e;
            try {
                PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E511, "error in reading UserCheckoutResponse", exc.getMessage(), exc, PEnums.TransitionName.NATIVE_XO_ENTRY, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", "userCheckoutResponse_error");
                if (this.userCheckoutResponse.getErrors() != null) {
                    List<Error> errors2 = this.userCheckoutResponse.getErrors();
                    if (errors2 != null) {
                        str3 = errors2.toString();
                    }
                    jSONObject.put("errors", str3);
                }
            } catch (JSONException e2) {
                String str7 = TAG;
                C19383o.m32796f(str7, "TAG");
                PLog.e$default(str7, "logging failed - graphQl response", e2, 0, 8, (Object) null);
            } catch (NullPointerException e3) {
                String str8 = TAG;
                C19383o.m32796f(str8, "TAG");
                PLog.e$default(str8, "logging failed - graphQl response", e3, 0, 8, (Object) null);
            }
            CheckoutIdlingResource.Companion.getInstance().decrement();
            PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "user checkout", PEnums.FallbackReason.POJO_ERROR, PEnums.FallbackCategory.DATA_PARSING_ERROR, PLog.INSTANCE.getStackValues(exc), (PEnums.TransitionName) null, ErrorReason.USER_AND_CHECKOUT_ERROR, exc, 16, (Object) null);
        }
    }

    public final void performEligibility() {
        AuthenticatedApiFactory.Companion.getEligibilityApiFactory().create().enqueueRequest(EligibilityCallback.Companion.get());
    }

    public final void reset() {
        this.callToActionState = CTAState.PAY;
        this.payMode = null;
        this.isCctOpenedForAddingResources = false;
        resetUser();
    }

    public final void resetLsatToken() {
        this.lsatToken = null;
    }

    public final void resetPayMode() {
        this.payMode = null;
    }

    public final void resetUser() {
        set_user((User) null);
        this.userCheckoutResponse = new UserCheckoutResponse();
        this.fundingOptionsList = null;
        this.shippingAddressList = null;
        this.insuranceCurrency = null;
        this.shippingAndHandling = null;
        this.shippingDiscount = null;
        this.tax = null;
        this.total = null;
        this.subtotal = null;
        this.cancelUrl = null;
        this.returnUrl = null;
        this.cartItemsList = null;
        this.isSignUpEligible = false;
        this.offers = null;
        this.selectedAddress = null;
        this.oldPreferredFundingOptionId = null;
        this.preferredFundingOptionId = "";
        this.principalMap = null;
        this.selectedFundingOption = null;
        this.selectedCurrencyConversionType = CurrencyConversionType.PAYPAL;
        this.payMode = null;
        this.approvePaymentResponse = null;
        this.fundingOptionsDao.clear();
        this.contingencyEventsModel = null;
        this.clearedContingenciesCardIds.clear();
    }

    public final void setAddNewShippingAddressFlag(boolean z) {
        this.addNewShippingAddressFlag = z;
    }

    public final void setApprovePaymentResponse(ApprovePaymentResponse approvePaymentResponse2) {
        ApprovePayment approvePayment;
        C19383o.m32797g(approvePaymentResponse2, "approvePaymentResponse");
        this.approvePaymentResponse = approvePaymentResponse2;
        ApprovePaymentData data = approvePaymentResponse2.getData();
        PaymentContingencies paymentContingencies = null;
        if (!(data == null || (approvePayment = data.getApprovePayment()) == null)) {
            paymentContingencies = approvePayment.getPaymentContingencies();
        }
        this.supportedContingencies = paymentContingencies;
    }

    public final void setBillingAddress(BillingAddressRequest billingAddressRequest) {
        C19383o.m32797g(billingAddressRequest, "billingAddressRequest");
        this.billingAddress = billingAddressRequest;
    }

    public final void setButtonVersion(String str) {
        this.buttonVersion = str;
    }

    public final void setBuyerIPCountry(String str) {
        this.buyerIPCountry = str;
    }

    public final void setCallToActionState(CTAState cTAState) {
        C19383o.m32797g(cTAState, "callToActionState");
        this.callToActionState = cTAState;
    }

    public final void setCancelUrl(String str) {
        C19383o.m32797g(str, "cancelUrl");
        this.cancelUrl = str;
    }

    public final void setCctOpenedForAddingResources(boolean z) {
        this.isCctOpenedForAddingResources = z;
    }

    public final void setCheckoutSession(CheckoutSession checkoutSession2) {
        this.checkoutSession = checkoutSession2;
    }

    public final void setCheckoutToken(String str) {
        C19383o.m32797g(str, "payToken");
        this.payToken = str;
        Context applicationContext = this.debugConfigManager.getApplicationContext();
        if (applicationContext != null) {
            Cache.INSTANCE.cacheSPBToken(applicationContext, str);
        }
    }

    public final void setContingencyEventsModel(ContingencyEventsModel contingencyEventsModel2) {
        this.contingencyEventsModel = contingencyEventsModel2;
    }

    public final void setCorrelationIds(InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(internalCorrelationIds, "<set-?>");
        this.correlationIds = internalCorrelationIds;
    }

    public final void setCurrencyConverted(boolean z) {
        this.isCurrencyConverted = z;
    }

    public final void setDBInstance(String str) {
        this.dbInstanceID = str;
        Context applicationContext = this.debugConfigManager.getApplicationContext();
        if (applicationContext != null) {
            Cache.cacheFirebaseInstanceID(applicationContext, str);
        }
    }

    public final void setDcvv(String str) {
        C19383o.m32797g(str, "dcvv");
        this.dcvv = str;
    }

    public final void setDebugConfigManager(DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(debugConfigManager2, "<set-?>");
        this.debugConfigManager = debugConfigManager2;
    }

    public final void setFbSessionUid(String str) {
        Context applicationContext;
        this.fbSessionUid = str;
        DebugConfigManager debugConfigManager2 = this.debugConfigManager;
        if (debugConfigManager2 != null && (applicationContext = debugConfigManager2.getApplicationContext()) != null && str != null) {
            Cache.INSTANCE.cacheFbSessionUid(applicationContext, str);
        }
    }

    public final void setFundingOptions(List<FundingOption> list) {
        List<FundingOption> fundingOptions;
        List<FundingOption> list2 = list == null ? EmptyList.INSTANCE : list;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        setupFundingOptions(list2, checkoutSession2 == null ? null : checkoutSession2.getUserAction());
        CheckoutSession checkoutSession3 = this.checkoutSession;
        if (checkoutSession3 != null && (fundingOptions = checkoutSession3.getFundingOptions()) != null) {
            fundingOptions.clear();
            if (list != null) {
                fundingOptions.addAll(list);
            }
        }
    }

    public final void setFundingOptionsCarouselPosition(int i) {
        this.fundingOptionsDao.cacheCarouselPosition(i);
    }

    public final void setFundingSource(String str) {
        C19383o.m32797g(str, "source");
        this.fundingSource = str;
        Context applicationContext = this.debugConfigManager.getApplicationContext();
        if (applicationContext != null) {
            Cache.cacheFundingSource(applicationContext, this.fundingSource);
        }
    }

    public final void setHostHandlesBlockingContingencies(boolean z) {
        this.hostHandlesBlockingContingencies = z;
    }

    public final void setIsPayPalConversionOptionShown(boolean z) {
        this.isPayPalConversionOptionShown = z;
    }

    public final void setJsonMerchantOrderInfo(JSONObject jSONObject) {
        this.jsonMerchantOrderInfo = jSONObject;
    }

    public final void setLastSelectedShippingMethodType(ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        this.lastSelectedShippingMethodType = shippingMethodType;
    }

    public final void setLsatToken(String str) {
        C19383o.m32797g(str, "lsatToken");
        this.lsatToken = new LowScopedAccessToken(str, false, 2, (DefaultConstructorMarker) null);
    }

    public final void setLsatTokenUpgraded(boolean z) {
        LowScopedAccessToken lowScopedAccessToken = this.lsatToken;
        LowScopedAccessToken lowScopedAccessToken2 = null;
        if (lowScopedAccessToken != null) {
            lowScopedAccessToken2 = LowScopedAccessToken.copy$default(lowScopedAccessToken, (String) null, z, 1, (Object) null);
        }
        this.lsatToken = lowScopedAccessToken2;
    }

    public final void setMerchantOrderInfo(Order order) {
        this.merchantOrderInfo = order;
    }

    public final void setOrderId(String str) {
        Context applicationContext;
        this.orderId = str;
        DebugConfigManager debugConfigManager2 = this.debugConfigManager;
        if (debugConfigManager2 != null && (applicationContext = debugConfigManager2.getApplicationContext()) != null && str != null) {
            Cache.INSTANCE.cacheOrderId(applicationContext, str);
        }
    }

    public final void setPayMode(PayModeEnum payModeEnum) {
        this.payMode = payModeEnum;
    }

    public final void setPaymentAuthenticationRequest(String str) {
        this.paymentAuthenticationRequest = str;
    }

    public final void setPreferredFundingOptionId(String str) {
        C19383o.m32797g(str, "preferredFundingOptionId");
        if (C19383o.m32792b(str, this.oldPreferredFundingOptionId)) {
            str = "";
        }
        this.preferredFundingOptionId = str;
    }

    public final void setPropsSet(boolean z) {
        this.propsSet = z;
    }

    public final void setReferrerPackage(Uri uri) {
        this.referrerPackage = uri;
    }

    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setSDKLaunchTime(long j) {
        this.sDKLaunchTime = j;
    }

    public final void setSelectedAddress(int i) {
        this.selectedAddressIndex = i;
        List<ShippingAddress> list = this.shippingAddressList;
        if (!(list == null || list.isEmpty()) && i >= 0) {
            List<ShippingAddress> list2 = this.shippingAddressList;
            ShippingAddress shippingAddress = null;
            Integer valueOf = list2 == null ? null : Integer.valueOf(list2.size());
            C19383o.m32794d(valueOf);
            if (i <= valueOf.intValue()) {
                List<ShippingAddress> list3 = this.shippingAddressList;
                if (list3 != null) {
                    shippingAddress = list3.get(i);
                }
                this.selectedAddress = shippingAddress;
            }
        }
    }

    public final void setSelectedAddressIndex(int i) {
        this.selectedAddressIndex = i;
    }

    public final void setSelectedCurrencyConversionType(CurrencyConversionType currencyConversionType) {
        C19383o.m32797g(currencyConversionType, "selectedCurrencyConversionType");
        this.selectedCurrencyConversionType = currencyConversionType;
    }

    public final void setSelectedFundingOption(FundingOption fundingOption) {
        this.selectedFundingOption = fundingOption;
        this.fundingOptionsDao.cacheSelectedFundingOption(fundingOption);
    }

    @SuppressLint({"DefaultLocale"})
    public final void setSelectedShippingMethod(int i, ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        if (ShippingMethodType.Type.SHIPPING == shippingMethodType.getShippingMethodType()) {
            this.selectedShippingMethodIndex = i;
            if (getShippingMethodsList().isEmpty() || i < 0 || i > getShippingMethodsList().size()) {
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                String format = String.format("Index out of boundary due to setting SHIPPING method type in index %d.", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C19383o.m32796f(format, "format(format, *args)");
                PLog.e$default(str, format, (Throwable) null, 0, 12, (Object) null);
                return;
            }
            this.selectedShippingMethod = getShippingMethodsList().get(i);
            return;
        }
        this.selectedPickUpMethodIndex = i;
        if (getPickUpMethodsList().isEmpty() || i < 0 || i > getPickUpMethodsList().size()) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            String format2 = String.format("Index out of boundary due to setting PICKUP method type in index %d.", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C19383o.m32796f(format2, "format(format, *args)");
            PLog.e$default(str2, format2, (Throwable) null, 0, 12, (Object) null);
            return;
        }
        this.selectedShippingMethod = getPickUpMethodsList().get(i);
    }

    public final void setSkipEligibility(boolean z) {
        this.isSkipEligibility = z;
    }

    public final void setSmartPaymentButtonSessionId(String str) {
        Context applicationContext;
        C19383o.m32797g(str, "smartPaymentButtonSessionId");
        this.smartPaymentButtonSessionId = str;
        DebugConfigManager debugConfigManager2 = this.debugConfigManager;
        if (debugConfigManager2 != null && (applicationContext = debugConfigManager2.getApplicationContext()) != null) {
            Cache.INSTANCE.cacheButtonSessionId(applicationContext, str);
        }
    }

    public final void setSmartPaymentButtonStickinessId(String str) {
        if (str != null) {
            this.smartPaymentButtonStickinessId = str;
            Context applicationContext = this.debugConfigManager.getApplicationContext();
            if (applicationContext != null) {
                CacheConfigManager.Companion.getInstance().cacheStickinessId(applicationContext, str);
            }
        }
    }

    public final void setStage(PEnums.Stage stage2) {
        this.stage = stage2;
    }

    public final void setStartupMechanism(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.startupMechanism = str;
    }

    public final void setSupportedContingencies(PaymentContingencies paymentContingencies) {
        this.supportedContingencies = paymentContingencies;
    }

    public final void setThreeDSProcessorTraceNumber(String str) {
        this.threeDSProcessorTraceNumber = str;
    }

    public final void setToken(String str) {
        Context applicationContext;
        this.token = str;
        DebugConfigManager debugConfigManager2 = this.debugConfigManager;
        if (debugConfigManager2 != null && (applicationContext = debugConfigManager2.getApplicationContext()) != null && str != null) {
            Cache.INSTANCE.cacheSPBToken(applicationContext, str);
        }
    }

    public final void setTransactionId(String str) {
        this.transactionId = str;
    }

    public final void setUpFirebase() {
        PLog.decision$default(PEnums.TransitionName.NATIVE_XO_FB_PROCESS_STARTED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E151, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        FirebaseTokenApi.Companion.get().enqueueRequest(FirebaseTokenCallback.Companion.get());
    }

    public final void setUserSelectedPlan(Plan plan) {
        this.userSelectedPlan = plan;
    }

    public final void setVaultFlow(boolean z) {
        this.isVaultFlow = z;
    }

    public final void setupFundingOptions(List<FundingOption> list) {
        C19383o.m32797g(list, "fundingOptions");
        setupFundingOptions$default(this, list, (String) null, 2, (Object) null);
    }

    public final void setupFundingOptions(List<FundingOption> list, String str) {
        C19383o.m32797g(list, "fundingOptions");
        this.fundingOptionsList = list;
        SplitBalanceUtils.clearSplitBalanceAmountAndId();
        SplitBalanceUtils.createFundingOptionsPlanMap(list);
        SplitBalanceUtils.generateSplitBalanceAmountAndId();
        createPrincipalMap(list);
        setOldPreferredFundingOptionId((FundingOption) C19327t.m32640V0(list));
        setUserAction(str);
    }

    public final boolean shouldShow72HourText() {
        Cart cart;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        String str = null;
        if (!(checkoutSession2 == null || (cart = checkoutSession2.getCart()) == null)) {
            str = cart.getIntent();
        }
        return !C19383o.m32792b(str, "SALE");
    }

    public final boolean shouldShowCurrencyConversion() {
        Boolean canChangeConversionType;
        if (canConvertFI()) {
            Plan selectedPlan = getSelectedPlan();
            CurrencyConversion currencyConversion = selectedPlan == null ? null : selectedPlan.getCurrencyConversion();
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.d$default(str, "There IS a currency conversion for the selected payment option", 0, 4, (Object) null);
            if (!(currencyConversion == null || (canChangeConversionType = currencyConversion.getCanChangeConversionType()) == null)) {
                this.isPayPalConversionOptionShown = canChangeConversionType.booleanValue();
            }
            return true;
        }
        this.isPayPalConversionOptionShown = false;
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.d$default(str2, "There IS NOT a currency conversion for the selected payment option", 0, 4, (Object) null);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r0.getFlags();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldShowShipping() {
        /*
            r4 = this;
            com.paypal.pyplcheckout.pojo.CheckoutSession r0 = r4.checkoutSession
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = r1
            goto L_0x0018
        L_0x0007:
            com.paypal.pyplcheckout.pojo.Flags r0 = r0.getFlags()
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            java.lang.Boolean r0 = r0.getHideShipping()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
        L_0x0018:
            java.util.List<com.paypal.pyplcheckout.pojo.ShippingAddress> r2 = r4.shippingAddressList
            r3 = 1
            if (r2 == 0) goto L_0x0026
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = r1
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            r2 = r2 ^ r3
            if (r0 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x002d
            r1 = r3
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.Repository.shouldShowShipping():boolean");
    }

    public final boolean showShippingAddress() {
        Flags flags;
        CheckoutSession checkoutSession2 = this.checkoutSession;
        boolean z = false;
        if (!(checkoutSession2 == null || (flags = checkoutSession2.getFlags()) == null)) {
            z = C19383o.m32792b(flags.getHideShipping(), Boolean.FALSE);
        }
        return !z;
    }

    public final void storeNewShippingAddress(Address address) {
        C19383o.m32797g(address, "address");
        this.newShippingAddress = address;
    }

    public final Object threeDSAuthenticate(String str, ThreeDSLookupPayload threeDSLookupPayload, String str2, AmountInput amountInput, C19340c<? super ThreeDSAuthenticateResponse> cVar) {
        return AuthenticatedApiFactory.Companion.getThreeDSAuthenticateApiFactory().create().authenticate(str, threeDSLookupPayload, str2, amountInput, cVar);
    }

    public final Object updateCheckoutSessionFundingOptions(String str, boolean z, C19340c<? super AddCardUpdateFundingOptionsResponse> cVar) throws Exception {
        return AddCardThreeDsApi.updateCheckoutSessionFundingOptions$default(AuthenticatedApiFactory.Companion.getAddCardThreeDsApiFactory().create(), (String) null, str, z, cVar, 1, (Object) null);
    }

    public final void updateClientConfig() {
        new ClientConfigUpdateApi((C20011u.C20012a) null, 1, (DefaultConstructorMarker) null).createService();
        new ClientConfigUpdateApi((C20011u.C20012a) null, 1, (DefaultConstructorMarker) null).enqueueRequest(ClientConfigUpdateCallback.Companion.get());
    }

    public final void updatePrincipalFundingOptionMap(Map<String, MapItem> map) {
        this.principalMap = map;
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.d$default(str, "PrincipalFundingOptionMapUpdated", 0, 4, (Object) null);
    }

    public final void updateShippingAddressList(List<ShippingAddress> list) {
        C19383o.m32797g(list, ResponseConstants.LIST);
        this.shippingAddressList = list;
    }

    public final void upgradeAccessToken(C19846a<C19394m> aVar, C19857l<? super Exception, C19394m> lVar) {
        C19383o.m32797g(aVar, "onSuccess");
        C19383o.m32797g(lVar, "onFailure");
        Object r0 = getMerchantConfigRepository().m35249getUpgradeAccessTokend1pmJ48();
        if (Result.m35485isFailureimpl(r0)) {
            r0 = null;
        }
        UpgradeAccessToken upgradeAccessToken = (UpgradeAccessToken) r0;
        if (upgradeAccessToken != null) {
            upgradeAccessToken.getUserAccessToken(new UpgradeAccessTokenListenerImpl(aVar, lVar, (PYPLCheckoutUtils) null, 4, (DefaultConstructorMarker) null));
            return;
        }
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.i$default(str, "upgradedAccessToken interface was not set in ExtendedCheckoutConfig", 0, 4, (Object) null);
        aVar.invoke();
    }

    public final Object validateAddress(ValidateAddressQueryParams validateAddressQueryParams, C19340c<? super ValidateAddressResponse> cVar) throws Exception {
        return AuthenticatedApiFactory.Companion.getValidateAddressApiFactory().create().validateAddress(validateAddressQueryParams, cVar);
    }

    public final boolean wasLsatTokenUpgraded() {
        LowScopedAccessToken lowScopedAccessToken = this.lsatToken;
        if (lowScopedAccessToken == null) {
            return false;
        }
        return lowScopedAccessToken.isUpgraded();
    }

    public final void setSelectedFundingOption(int i) {
        List<FundingOption> list = this.fundingOptionsList;
        FundingOption fundingOption = list == null ? null : (FundingOption) C19327t.m32641W0(i, list);
        this.selectedFundingOption = fundingOption;
        this.fundingOptionsDao.cacheSelectedFundingOption(fundingOption);
        this.callToActionState = CTAState.PAY;
    }

    public final void setSelectedAddress(ShippingAddress shippingAddress) {
        C19383o.m32797g(shippingAddress, "selectedAddress");
        this.selectedAddress = shippingAddress;
    }

    public final Object upgradeAccessToken(C19340c<? super C19394m> cVar) {
        C19343e eVar = new C19343e(C19388s.m32873m0(cVar));
        upgradeAccessToken(new Repository$upgradeAccessToken$2$1(eVar), new Repository$upgradeAccessToken$2$2(eVar));
        Object a = eVar.mo71808a();
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return C19394m.f43287a;
    }
}
