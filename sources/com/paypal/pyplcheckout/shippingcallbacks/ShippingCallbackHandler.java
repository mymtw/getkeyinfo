package com.paypal.pyplcheckout.shippingcallbacks;

import android.support.p013v4.media.C0069a;
import androidx.lifecycle.C2895z;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.order.Address;
import com.paypal.checkout.order.Options;
import com.paypal.checkout.order.PurchaseUnit;
import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.checkout.shipping.OnShippingChange;
import com.paypal.checkout.shipping.ShippingChangeActions;
import com.paypal.checkout.shipping.ShippingChangeData;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17188f;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17189g;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17190h;
import com.paypal.pyplcheckout.common.firebase.firebasemodels.GetPropsRequest;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17224a;
import com.paypal.pyplcheckout.home.view.customviews.C17247k;
import com.paypal.pyplcheckout.home.view.customviews.productviews.ShippingCallbackBlockingBehaviour;
import com.paypal.pyplcheckout.interfaces.ShippingCallbackListener;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.ShippingCallbackRequestType;
import com.paypal.pyplcheckout.pojo.ShippingData;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.pojo.UpdatedShippingAddress;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.UpdateOrdersApi;
import com.paypal.pyplcheckout.services.callbacks.UpdateOrderCallback;
import com.paypal.pyplcheckout.utils.ErrorUtils;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShippingCallbackHandler {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "ShippingCallbackHandler";
    public String accessToken = "";
    private final DebugConfigManager debugConfigManager;
    private final Events events;
    private C2895z<ShippingCallbackBlockingBehaviour> homeScreenBlockingFlag = new C2895z<>();
    private ShippingCallbackRequestType internalShippingCallbackRequestType;
    private final PatchAction patchAction;
    private EventListener patchShippingChangesNewAddressListener;
    private EventListener patchShippingChangesRefreshListener;
    private final Repository repository;
    private ShippingCallbackListener shippingCallbackListener;
    private EventListener shippingCallbackRequestSentListener;
    private EventListener shippingCallbackResponseReceivedListener;
    public int shippingCallbackSelectedIndex = -1;
    private EventListener shippingChangesErrorListener;
    private ShippingCallbackRequestType thirdPartyShippingCallbackRequestType;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return ShippingCallbackHandler.TAG;
        }
    }

    public ShippingCallbackHandler(DebugConfigManager debugConfigManager2, Events events2, Repository repository2, PatchAction patchAction2) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(patchAction2, "patchAction");
        this.debugConfigManager = debugConfigManager2;
        this.events = events2;
        this.repository = repository2;
        this.patchAction = patchAction2;
    }

    /* access modifiers changed from: private */
    /* renamed from: createShippingChangeErrorListener$lambda-4  reason: not valid java name */
    public static final void m35433createShippingChangeErrorListener$lambda4(ShippingCallbackHandler shippingCallbackHandler, EventType eventType, ResultData resultData) {
        ShippingCallbackHandler shippingCallbackHandler2 = shippingCallbackHandler;
        C19383o.m32797g(shippingCallbackHandler2, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        PLog.transition$default(PEnums.TransitionName.PROCESS_SHIPPING_CALLBACK, PEnums.Outcome.FAILURE, PEnums.EventCode.E166, PEnums.StateName.SHIPPING_METHODS, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "Shipping change rejected", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
        if (shippingCallbackHandler.isThirdPartyShippingPatchingEnabled()) {
            if (shippingCallbackHandler.getThirdPartyShippingCallbackRequestType() == ShippingCallbackRequestType.Type.SHIPPING_ADDRESS) {
                shippingCallbackHandler2.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_ADDRESS));
            } else {
                shippingCallbackHandler2.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_METHOD));
            }
        } else if (!shippingCallbackHandler.isFirstPartyShippingPatchingEnabled()) {
        } else {
            if (shippingCallbackHandler.getFirstPartyShippingCallbackRequestType() == ShippingCallbackRequestType.Type.SHIPPING_ADDRESS) {
                shippingCallbackHandler2.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_ADDRESS));
            } else {
                shippingCallbackHandler2.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_METHOD));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleShippingCallbackBehaviour(ShippingCallbackRequestType shippingCallbackRequestType, boolean z, boolean z2) {
        if (z) {
            PEnums.TransitionName transitionName = PEnums.TransitionName.PROCESS_SHIPPING_CALLBACK;
            PEnums.Outcome outcome = PEnums.Outcome.SUCCESS;
            PLog.transition$default(transitionName, outcome, PEnums.EventCode.E166, PEnums.StateName.SHIPPING_CALLBACK, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "Patch request success", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
            if (z2) {
                PLog.decision$default(PEnums.TransitionName.SHIPPING_FETCH_CART_INFO, PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, PEnums.StateName.FETCH_CART_INFO, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
                this.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.REFRESH_IS_PENDING));
                this.repository.fetchUserCheckoutResponse();
                return;
            }
            PLog.decision$default(PEnums.TransitionName.SHIPPING_FETCH_CART_INFO, outcome, (PEnums.EventCode) null, PEnums.StateName.FETCH_CART_INFO, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
            this.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.REFRESH_IS_COMPLETED));
            return;
        }
        if ((shippingCallbackRequestType == null ? null : shippingCallbackRequestType.getShippingCallbackRequestType()) == ShippingCallbackRequestType.Type.SHIPPING_ADDRESS) {
            this.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_ADDRESS));
            this.repository.addInvalidShippingAddress();
            return;
        }
        this.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_METHOD));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-0  reason: not valid java name */
    public static final void m35434setupListeners$lambda0(ShippingCallbackHandler shippingCallbackHandler, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingCallbackHandler, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData != null && (resultData instanceof Success)) {
            shippingCallbackHandler.handleShippingCallbackBehaviour((ShippingCallbackRequestType) null, true, true);
        } else if (resultData != null && (resultData instanceof Error)) {
            Object data = ((Error) resultData).getData();
            if (data != null) {
                shippingCallbackHandler.showFirebaseErrorUi((String) data);
                shippingCallbackHandler.handleShippingCallbackBehaviour(shippingCallbackHandler.internalShippingCallbackRequestType, false, false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-1  reason: not valid java name */
    public static final void m35435setupListeners$lambda1(ShippingCallbackHandler shippingCallbackHandler, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingCallbackHandler, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        shippingCallbackHandler.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.NEW_SHIPPING_ADDRESS_SELECTED));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-2  reason: not valid java name */
    public static final void m35436setupListeners$lambda2(ShippingCallbackHandler shippingCallbackHandler, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingCallbackHandler, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        shippingCallbackHandler.handleShippingCallbackBehaviour((ShippingCallbackRequestType) null, true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-3  reason: not valid java name */
    public static final void m35437setupListeners$lambda3(ShippingCallbackHandler shippingCallbackHandler, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingCallbackHandler, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        shippingCallbackHandler.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.NEW_SHIPPING_ADDRESS_SELECTED));
    }

    private final void showFirebaseErrorUi(String str) {
        RealTimeDB instance = RealTimeDB.Companion.getInstance();
        String e = C0069a.m174e("randomUUID().toString()");
        String e2 = C0069a.m174e("randomUUID().toString()");
        PEnums.EventCode eventCode = PEnums.EventCode.E514;
        ErrorUtils.sendOnErrorMessageToFireBase(instance, e, e2, (FirebaseMessageData) null, "error parsing FB response SPB props", eventCode);
        PEnums.TransitionName transitionName = PEnums.TransitionName.NATIVE_XO_FB_PROPS_ACQUIRED;
        PLog.decision$default(transitionName, PEnums.Outcome.FAILURE, eventCode, PEnums.StateName.REVIEW, (String) null, transitionName.toString(), str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void updateOrder(boolean z, String str, List<PurchaseUnit> list) {
        UpdateOrdersApi.Companion companion = UpdateOrdersApi.Companion;
        String checkoutToken = this.debugConfigManager.getCheckoutToken();
        C19383o.m32796f(checkoutToken, "debugConfigManager.checkoutToken");
        companion.get(str, checkoutToken, list).enqueueRequest(UpdateOrderCallback.Companion.get(new ShippingCallbackHandler$updateOrder$1(this, z)));
    }

    public final void createShippingChangeErrorListener() {
        C17247k kVar = new C17247k(this, 3);
        this.shippingChangesErrorListener = kVar;
        this.events.listen(PayPalEventTypes.PATCH_SHIPPING_CHANGES_ERROR, kVar);
    }

    public final ShippingCallbackRequestType.Type getFirstPartyShippingCallbackRequestType() {
        ShippingCallbackRequestType shippingCallbackRequestType = this.internalShippingCallbackRequestType;
        if (shippingCallbackRequestType == null) {
            return null;
        }
        return shippingCallbackRequestType.getShippingCallbackRequestType();
    }

    public final C2895z<ShippingCallbackBlockingBehaviour> getHomeScreenBlockingFlag() {
        return this.homeScreenBlockingFlag;
    }

    public final ShippingCallbackRequestType.Type getThirdPartyShippingCallbackRequestType() {
        ShippingCallbackRequestType shippingCallbackRequestType = this.thirdPartyShippingCallbackRequestType;
        if (shippingCallbackRequestType == null) {
            return null;
        }
        return shippingCallbackRequestType.getShippingCallbackRequestType();
    }

    public final void handleShippingChangeData(ShippingCallbackRequestType shippingCallbackRequestType, List<Options> list, ShippingAddress shippingAddress) {
        String country;
        C19383o.m32797g(shippingCallbackRequestType, "shippingCallbackRequestType");
        C19383o.m32797g(list, "shippingMethods");
        String str = null;
        Address.Builder adminArea2 = new Address.Builder().addressLine1(shippingAddress == null ? null : shippingAddress.getLine1()).addressLine2(shippingAddress == null ? null : shippingAddress.getLine2()).adminArea1(shippingAddress == null ? null : shippingAddress.getState()).adminArea2(shippingAddress == null ? null : shippingAddress.getCity());
        String str2 = "";
        if (!(shippingAddress == null || (country = shippingAddress.getCountry()) == null)) {
            str2 = country;
        }
        Address.Builder countryCode = adminArea2.countryCode(str2);
        if (shippingAddress != null) {
            str = shippingAddress.getPostalCode();
        }
        ShippingChangeData shippingChangeData = new ShippingChangeData(this.repository.getPaymentToken(), this.repository.getTransactionId(), shippingCallbackRequestType.toShippingChangeEvent(), countryCode.postalCode(str).build(), list);
        if (this.debugConfigManager.getOnShippingChange() != null) {
            PLog.transition$default(PEnums.TransitionName.PROCESS_SHIPPING_CALLBACK, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E166, PEnums.StateName.SHIPPING_METHODS, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
            OnShippingChange onShippingChange = this.debugConfigManager.getOnShippingChange();
            if (onShippingChange != null) {
                onShippingChange.onShippingChanged(shippingChangeData, new ShippingChangeActions(this.patchAction, this.events));
            }
        }
    }

    public final boolean isFirstPartyShippingPatchingEnabled() {
        return this.internalShippingCallbackRequestType != null;
    }

    public final boolean isThirdPartyShippingPatchingEnabled() {
        return this.thirdPartyShippingCallbackRequestType != null;
    }

    public final void setHomeScreenBlockingFlag(C2895z<ShippingCallbackBlockingBehaviour> zVar) {
        C19383o.m32797g(zVar, "<set-?>");
        this.homeScreenBlockingFlag = zVar;
    }

    public final void setupListeners() {
        if (this.debugConfigManager.isSmartPaymentCheckout()) {
            C17188f fVar = new C17188f(this, 5);
            this.shippingCallbackResponseReceivedListener = fVar;
            this.events.listen(ExtendedPayPalEventTypes.SHIPPING_CALLBACK_RESPONSE_RECEIVED, fVar);
            C17189g gVar = new C17189g(this, 5);
            this.shippingCallbackRequestSentListener = gVar;
            this.events.listen(ExtendedPayPalEventTypes.SHIPPING_CALLBACK_REQUEST_SENT, gVar);
        }
        C17190h hVar = new C17190h(this, 6);
        this.patchShippingChangesRefreshListener = hVar;
        this.events.listen(PayPalEventTypes.PATCH_SHIPPING_CHANGES_REFRESH_IS_COMPLETE, hVar);
        this.shippingCallbackListener = new ShippingCallbackHandler$setupListeners$4(this);
        C17224a aVar = new C17224a(this, 6);
        this.patchShippingChangesNewAddressListener = aVar;
        this.events.listen(PayPalEventTypes.PATCH_SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED, aVar);
        createShippingChangeErrorListener();
    }

    public final void validateShippingCallback(ShippingCallbackRequestType shippingCallbackRequestType, ShippingMethodType shippingMethodType, int i, int i2) {
        ShippingMethods shippingMethods;
        GetPropsRequest shippingCallbackRequest;
        C19383o.m32797g(shippingCallbackRequestType, "shippingCallbackRequestType");
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        ShippingMethodType lastSelectedShippingMethodType = this.repository.getLastSelectedShippingMethodType();
        boolean z = i == i2 && lastSelectedShippingMethodType != null && shippingMethodType.getShippingMethodType() == lastSelectedShippingMethodType.getShippingMethodType();
        if (!this.debugConfigManager.checkCheckoutJSSession() && !z) {
            if ((this.debugConfigManager.getOnShippingChange() != null || this.debugConfigManager.isSmartPaymentCheckout()) && this.debugConfigManager.isShippingCallbackEnabled()) {
                ShippingAddress selectedAddress = this.repository.getSelectedAddress();
                if (shippingCallbackRequestType.getShippingCallbackRequestType() == ShippingCallbackRequestType.Type.SHIPPING_ADDRESS) {
                    this.repository.setSelectedAddress(i2);
                    selectedAddress = this.repository.getSelectedAddress();
                    if (selectedAddress != null) {
                        this.shippingCallbackSelectedIndex = i2;
                        this.repository.setLastSelectedShippingMethodType(shippingMethodType);
                        shippingMethods = this.repository.getSelectedMethodOption(shippingMethodType);
                        this.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.NEW_SHIPPING_ADDRESS_SELECTED));
                    } else {
                        return;
                    }
                } else {
                    this.repository.setSelectedShippingMethod(i2, shippingMethodType);
                    shippingMethods = this.repository.getSelectedShippingMethod();
                }
                ShippingMethods shippingMethods2 = shippingMethods;
                this.homeScreenBlockingFlag.postValue(new ShippingCallbackBlockingBehaviour(ShippingCallbackBlockingBehaviour.Type.NEW_SHIPPING_ADDRESS_SELECTED));
                if (this.debugConfigManager.isSmartPaymentCheckout()) {
                    this.internalShippingCallbackRequestType = shippingCallbackRequestType;
                    RealTimeDB instance = RealTimeDB.Companion.getInstance();
                    if (selectedAddress != null) {
                        String str = this.accessToken;
                        String checkoutToken = this.debugConfigManager.getCheckoutToken();
                        C19383o.m32796f(checkoutToken, "debugConfigManager.checkoutToken");
                        ShippingData shippingData = new ShippingData(str, checkoutToken, new UpdatedShippingAddress(selectedAddress.getLine1(), selectedAddress.getState(), selectedAddress.getPostalCode(), selectedAddress.getCountry()), "", "", shippingMethods2, this.repository.getShippingAndPickUpOptions(shippingMethodType));
                        if (instance != null && (shippingCallbackRequest = instance.getShippingCallbackRequest(shippingData)) != null) {
                            instance.sendRequest(shippingCallbackRequest);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.thirdPartyShippingCallbackRequestType = shippingCallbackRequestType;
                try {
                    handleShippingChangeData(shippingCallbackRequestType, this.repository.getShippingAndPickUpOptions(shippingMethodType), selectedAddress);
                } catch (Exception e) {
                    this.debugConfigManager.invokeOnErrorCallback(e, ErrorReason.SHIPPING_CHANGE_ERROR);
                }
            }
        }
    }
}
