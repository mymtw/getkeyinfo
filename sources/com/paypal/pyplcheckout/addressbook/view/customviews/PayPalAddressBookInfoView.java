package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.C3249o;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.stylekit.views.C9060k;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.adapters.AddressBookAdapter;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressBookFragment;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookInfoViewListener;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonColor;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter;
import com.paypal.pyplcheckout.utils.DialogMaker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

@SuppressLint({"ViewConstructor"})
public final class PayPalAddressBookInfoView extends RelativeLayout implements ContentView, ICustomViewsViewModel, AddressBookAdapter.AddressBookAdapterClickListener, ShippingMethodsAdapter.ShippingMethodsAdapterClickListener, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalAddressBookInfoView";
    public Map<Integer, View> _$_findViewCache;
    private DialogMaker addNewShippingDialog;
    private final C19285c addressAutoCompleteViewModel$delegate;
    private AddressBookAdapter addressBookAdapter;
    private TextView addressBookCurrentLocationTv;
    private LinearLayout addressBookHeaderContainer;
    private TextView addressBookLeftTabTv;
    private View addressBookLeftTabV;
    private RecyclerView addressBookRecyclerView;
    private TextView addressBookRightTabTv;
    private View addressBookRightTabV;
    private LinearLayout addressBookUnderLineContainer;
    private String defaultAddressZipCode;
    private final Fragment fragment;
    private PayPalAddressBookInfoViewListener mPayPalAddressBookInfoViewListener;
    private List<ShippingMethods> pickUpMethodList;
    private ShippingMethods selectedPickUpMethod;
    private ShippingAddress selectedShippingAddress;
    private List<ShippingAddress> shippingAddressList;
    private ShippingMethodsAdapter shippingMethodsAdapter;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalAddressBookInfoView.TAG;
        }
    }

    static {
        Class<PayPalAddressBookInfoView> cls = PayPalAddressBookInfoView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookInfoView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalAddressBookInfoViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalAddressBookInfoViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalAddressBookInfoViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalAddressBookInfoViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalAddressBookInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalAddressBookInfoViewListener);
    }

    private final void changeTabViewsVisibilityAndColor(boolean z) {
        String str;
        if (z) {
            View view = this.addressBookLeftTabV;
            Context context = getContext();
            int i = C17165R.color.gray_color_300;
            Object obj = C8184a.f17966a;
            view.setBackgroundColor(C8184a.C8188d.m16468a(context, i));
            View view2 = this.addressBookRightTabV;
            Context context2 = getContext();
            int i2 = C17165R.color.blue_color_600;
            view2.setBackgroundColor(C8184a.C8188d.m16468a(context2, i2));
            this.addressBookLeftTabTv.setTextColor(C8184a.C8188d.m16468a(getContext(), C17165R.color.black_solid));
            this.addressBookRightTabTv.setTextColor(C8184a.C8188d.m16468a(getContext(), i2));
            TextView textView = this.addressBookCurrentLocationTv;
            if (TextUtils.isEmpty(this.defaultAddressZipCode)) {
                str = "";
            } else {
                String string = getContext().getString(C17165R.string.paypal_checkout_option_for_your_shipping_address_zip_code);
                C19383o.m32796f(string, "context.getString(R.stri…hipping_address_zip_code)");
                str = C0388a.m1049e(new Object[]{this.defaultAddressZipCode}, 1, string, "format(format, *args)");
            }
            textView.setText(str);
            this.addressBookCurrentLocationTv.setVisibility(0);
            this.addressBookRecyclerView.setAdapter(this.shippingMethodsAdapter);
            PLog.impression$default(PEnums.TransitionName.PICK_IT_UP_RENDERED, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.PICK_IT_UP, (String) null, "address_book_screen", "shipping_address_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            return;
        }
        View view3 = this.addressBookRightTabV;
        Context context3 = getContext();
        int i3 = C17165R.color.gray_color_300;
        Object obj2 = C8184a.f17966a;
        view3.setBackgroundColor(C8184a.C8188d.m16468a(context3, i3));
        View view4 = this.addressBookLeftTabV;
        Context context4 = getContext();
        int i4 = C17165R.color.blue_color_600;
        view4.setBackgroundColor(C8184a.C8188d.m16468a(context4, i4));
        this.addressBookRightTabTv.setTextColor(C8184a.C8188d.m16468a(getContext(), C17165R.color.black_solid));
        this.addressBookLeftTabTv.setTextColor(C8184a.C8188d.m16468a(getContext(), i4));
        this.addressBookCurrentLocationTv.setVisibility(8);
        this.addressBookRecyclerView.setAdapter(this.addressBookAdapter);
        PLog.impression$default(PEnums.TransitionName.SHIP_IT_RENDER, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIP_IT, (String) null, "address_book_screen", "shipping_address_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    private final void finishingAnimation() {
        new Handler().postDelayed(new C3249o(this, 2), 250);
    }

    /* access modifiers changed from: private */
    /* renamed from: finishingAnimation$lambda-7  reason: not valid java name */
    public static final void m35159finishingAnimation$lambda7(PayPalAddressBookInfoView payPalAddressBookInfoView) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        payPalAddressBookInfoView.getViewModel().finishFragment(PYPLAddressBookFragment.TAG, payPalAddressBookInfoView.fragment);
    }

    private final AddressAutoCompleteViewModel getAddressAutoCompleteViewModel() {
        return (AddressAutoCompleteViewModel) this.addressAutoCompleteViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleLeftTabOnClickAction() {
        changeTabViewsVisibilityAndColor(false);
    }

    private final void handleRightTabOnClickAction() {
        changeTabViewsVisibilityAndColor(true);
    }

    private final void initAddressBook(List<ShippingAddress> list, ShippingAddress shippingAddress, ShippingMethods shippingMethods) {
        if (list != null) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            AddressBookAdapter addressBookAdapter2 = new AddressBookAdapter(context, list, shippingAddress, new ShippingMethodType((shippingMethods == null || ShippingMethodType.Type.SHIPPING == shippingMethods.getType()) ? ShippingMethodType.Type.SHIPPING : ShippingMethodType.Type.PICKUP), this);
            this.addressBookAdapter = addressBookAdapter2;
            this.addressBookRecyclerView.setAdapter(addressBookAdapter2);
            setupButton();
        }
    }

    private final void initPickUpMethod(List<ShippingMethods> list, ShippingMethods shippingMethods) {
        if (list != null) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            ShippingMethodsAdapter shippingMethodsAdapter2 = new ShippingMethodsAdapter(context, list, this, shippingMethods);
            this.shippingMethodsAdapter = shippingMethodsAdapter2;
            this.addressBookRecyclerView.setAdapter(shippingMethodsAdapter2);
        }
    }

    private final void initRecyclerView(ShippingMethodType shippingMethodType, ShippingMethods shippingMethods) {
        String str;
        getContext();
        this.addressBookRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        ShippingMethodType.Type type = null;
        if (ShippingMethodType.Type.SHIPPING != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
            if (ShippingMethodType.Type.NONE != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
                ShippingMethodType.Type type2 = ShippingMethodType.Type.PICKUP;
                if (type2 == (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
                    TextView textView = this.addressBookCurrentLocationTv;
                    if (TextUtils.isEmpty(this.defaultAddressZipCode)) {
                        str = "";
                    } else {
                        String string = getContext().getString(C17165R.string.paypal_checkout_option_for_your_shipping_address_zip_code);
                        C19383o.m32796f(string, "context\n                …hipping_address_zip_code)");
                        str = C0388a.m1049e(new Object[]{this.defaultAddressZipCode}, 1, string, "format(format, *args)");
                    }
                    textView.setText(str);
                    this.addressBookHeaderContainer.setVisibility(8);
                    this.addressBookUnderLineContainer.setVisibility(8);
                    initPickUpMethod(this.pickUpMethodList, this.selectedPickUpMethod);
                    return;
                }
                this.addressBookCurrentLocationTv.setVisibility(8);
                this.addressBookHeaderContainer.setVisibility(0);
                this.addressBookUnderLineContainer.setVisibility(0);
                initPickUpMethod(this.pickUpMethodList, this.selectedPickUpMethod);
                initAddressBook(this.shippingAddressList, this.selectedShippingAddress, shippingMethods);
                if (shippingMethods != null) {
                    type = shippingMethods.getType();
                }
                if (type2 == type) {
                    handleRightTabOnClickAction();
                    return;
                } else {
                    handleLeftTabOnClickAction();
                    return;
                }
            }
        }
        this.addressBookCurrentLocationTv.setVisibility(8);
        this.addressBookHeaderContainer.setVisibility(8);
        this.addressBookUnderLineContainer.setVisibility(8);
        initAddressBook(this.shippingAddressList, this.selectedShippingAddress, shippingMethods);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35160initViewModelObservers$lambda0(PayPalAddressBookInfoView payPalAddressBookInfoView, List list) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        payPalAddressBookInfoView.updateAdapterWithShippingAddressList(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35161initViewModelObservers$lambda1(PayPalAddressBookInfoView payPalAddressBookInfoView, ShippingAddress shippingAddress) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        payPalAddressBookInfoView.updateAdapterWithSelectedShippingAddress(shippingAddress);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35162initViewModelObservers$lambda2(PayPalAddressBookInfoView payPalAddressBookInfoView, List list) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        payPalAddressBookInfoView.updateAdapterWithPickUpList(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35163initViewModelObservers$lambda3(PayPalAddressBookInfoView payPalAddressBookInfoView, ShippingMethods shippingMethods) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        if (shippingMethods != null && shippingMethods.getType() == ShippingMethodType.Type.PICKUP) {
            payPalAddressBookInfoView.updateAdapterWithSelectedPickUpMethod(shippingMethods);
        }
    }

    private final void setOnClickListener() {
        this.addressBookLeftTabTv.setOnClickListener(this);
        this.addressBookLeftTabV.setOnClickListener(this);
        this.addressBookRightTabTv.setOnClickListener(this);
        this.addressBookRightTabV.setOnClickListener(this);
    }

    private final void setupButton() {
        PayPalActionButton payPalActionButton = (PayPalActionButton) findViewById(C17165R.C17167id.add_new_address_button);
        payPalActionButton.setColor(ActionButtonColor.WHITE);
        payPalActionButton.setAlignment(3);
        payPalActionButton.updateButtonText(getContext().getResources().getString(C17165R.string.paypal_checkout_add_shipping_address));
        PLog.impression$default(PEnums.TransitionName.ADD_SHIPPING_BUTTON_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        payPalActionButton.setOnClickListener(new C9060k(this, 6));
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [android.content.Context] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: setupButton$lambda-6  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m35164setupButton$lambda6(com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView r12, android.view.View r13) {
        /*
            java.lang.String r13 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r12, r13)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.ADD_SHIPPING_ADDRESS_CLICKED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r13 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.CLICKED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E101
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.SHIPPING
            java.lang.String r4 = "address_book_screen"
            java.lang.String r5 = "shipping_address_add"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 448(0x1c0, float:6.28E-43)
            r10 = 0
            r1 = r13
            com.paypal.pyplcheckout.common.instrumentation.PLog.click$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.paypal.pyplcheckout.ab.featureflag.Feature r0 = com.paypal.pyplcheckout.p539ab.featureflag.Feature.ADD_SHIPPING
            r1 = 0
            r2 = 2
            r3 = 0
            com.paypal.pyplcheckout.ab.featureflag.FeatureResponse r0 = com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager.isEnabled$default(r0, r1, r2, r3)
            com.paypal.pyplcheckout.ab.featureflag.FeatureResponse$Enabled r1 = com.paypal.pyplcheckout.p539ab.featureflag.FeatureResponse.Enabled.INSTANCE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            if (r0 == 0) goto L_0x00d9
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r0 = r12.getAddressAutoCompleteViewModel()
            boolean r0 = r0.isAddShippingFeatureEnabled()
            if (r0 == 0) goto L_0x00d9
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_ADD_SHIPPING_ADDRESS_CLICKED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E624
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.ADD_SHIPPING
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 496(0x1f0, float:6.95E-43)
            r11 = 0
            r2 = r13
            com.paypal.pyplcheckout.common.instrumentation.PLog.click$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel r13 = r12.getViewModel()
            r13.toggleAddNewShippingAddressTitle()
            com.paypal.pyplcheckout.common.cache.Cache r13 = com.paypal.pyplcheckout.common.cache.Cache.INSTANCE
            android.content.Context r0 = r12.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            android.content.Context r2 = r12.getContext()
            int r3 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_add_shipping_address
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…out_add_shipping_address)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            r13.cacheSearchScreenTitle(r0, r2)
            com.paypal.pyplcheckout.addshipping.ShippingUtils r0 = com.paypal.pyplcheckout.addshipping.ShippingUtils.INSTANCE
            android.content.Context r6 = r12.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r6, r1)
            android.content.Context r2 = r12.getContext()
            java.lang.String r7 = r2.getString(r3)
            kotlin.jvm.internal.C19383o.m32796f(r7, r4)
            r9 = 4
            r10 = 0
            r5 = r0
            com.paypal.pyplcheckout.addshipping.ShippingUtils.announceAccessibilityEvent$default(r5, r6, r7, r8, r9, r10)
            android.content.Context r2 = r12.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)
            android.content.Context r3 = r12.getContext()
            int r4 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_start_typing
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r5 = "context.getString(R.stri…al_checkout_start_typing)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            r13.cacheHintTitle(r2, r3)
            android.content.Context r6 = r12.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r6, r1)
            android.content.Context r13 = r12.getContext()
            java.lang.String r7 = r13.getString(r4)
            kotlin.jvm.internal.C19383o.m32796f(r7, r5)
            r5 = r0
            com.paypal.pyplcheckout.addshipping.ShippingUtils.announceAccessibilityEvent$default(r5, r6, r7, r8, r9, r10)
            com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel r12 = r12.getAddressAutoCompleteViewModel()
            r12.resetValues()
            com.paypal.pyplcheckout.events.Events$Companion r12 = com.paypal.pyplcheckout.events.Events.Companion
            com.paypal.pyplcheckout.events.Events r12 = r12.getInstance()
            com.paypal.pyplcheckout.events.PayPalEventTypes r13 = com.paypal.pyplcheckout.events.PayPalEventTypes.START_FRAGMENT
            com.paypal.pyplcheckout.events.Success r0 = new com.paypal.pyplcheckout.events.Success
            com.paypal.pyplcheckout.events.model.FragmentInfo r1 = new com.paypal.pyplcheckout.events.model.FragmentInfo
            java.lang.String r2 = com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressFragment.TAG
            com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressFragment r3 = new com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressFragment
            r3.<init>()
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r12.fire(r13, r0)
            goto L_0x0124
        L_0x00d9:
            com.paypal.pyplcheckout.utils.DialogMaker$Builder r13 = new com.paypal.pyplcheckout.utils.DialogMaker$Builder
            r13.<init>()
            int r0 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_headline_continue
            com.paypal.pyplcheckout.utils.DialogMaker$Builder r13 = r13.setTitle(r0)
            int r0 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_shipping_redirect
            com.paypal.pyplcheckout.utils.DialogMaker$Builder r13 = r13.setDescription(r0)
            r0 = 1
            com.paypal.pyplcheckout.utils.DialogMaker$Builder r13 = r13.showSpinner(r0)
            int r0 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_ok
            com.braze.a r1 = new com.braze.a
            r1.<init>(r12)
            com.paypal.pyplcheckout.utils.DialogMaker$Builder r13 = r13.setPositiveButton(r0, r1)
            int r0 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_cancel
            androidx.room.z r1 = new androidx.room.z
            r1.<init>(r12)
            com.paypal.pyplcheckout.utils.DialogMaker$Builder r13 = r13.setNegativeButton(r0, r1)
            com.paypal.pyplcheckout.utils.DialogMaker r13 = r13.build()
            r12.addNewShippingDialog = r13
            if (r13 != 0) goto L_0x010e
            goto L_0x011c
        L_0x010e:
            android.content.Context r0 = r12.getContext()
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L_0x0119
            r3 = r0
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
        L_0x0119:
            r13.show(r3)
        L_0x011c:
            com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookInfoViewListener r12 = r12.mPayPalAddressBookInfoViewListener
            if (r12 != 0) goto L_0x0121
            goto L_0x0124
        L_0x0121:
            r12.onPayPalAddNewAddressClick()
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView.m35164setupButton$lambda6(com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: setupButton$lambda-6$lambda-4  reason: not valid java name */
    public static final void m35165setupButton$lambda6$lambda4(PayPalAddressBookInfoView payPalAddressBookInfoView, DialogMaker dialogMaker) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        PLog.decision$default(PEnums.TransitionName.ADD_SHIPPING_DIALOG, PEnums.Outcome.APPROVED, PEnums.EventCode.E142, PEnums.StateName.SHIPPING, "address_book_screen", "add_new_address_dialog", (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
        MainPaysheetViewModel viewModel = payPalAddressBookInfoView.getViewModel();
        Context context = payPalAddressBookInfoView.getContext();
        viewModel.addNewShippingAddressViaCustomTab(context instanceof Activity ? (Activity) context : null);
    }

    /* access modifiers changed from: private */
    /* renamed from: setupButton$lambda-6$lambda-5  reason: not valid java name */
    public static final void m35166setupButton$lambda6$lambda5(PayPalAddressBookInfoView payPalAddressBookInfoView, DialogMaker dialogMaker) {
        C19383o.m32797g(payPalAddressBookInfoView, "this$0");
        PLog.decision$default(PEnums.TransitionName.ADD_SHIPPING_DIALOG, PEnums.Outcome.CANCELLED, PEnums.EventCode.E143, PEnums.StateName.SHIPPING, "address_book_screen", "add_new_address_dialog", (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
        DialogMaker dialogMaker2 = payPalAddressBookInfoView.addNewShippingDialog;
        if (dialogMaker2 != null) {
            dialogMaker2.dismiss();
        }
    }

    private final void updateAdapterWithPickUpList(List<ShippingMethods> list) {
        this.pickUpMethodList = list;
        ShippingMethodsAdapter shippingMethodsAdapter2 = this.shippingMethodsAdapter;
        if (shippingMethodsAdapter2 != null) {
            shippingMethodsAdapter2.notifyDataSetChanged();
        }
    }

    private final void updateAdapterWithSelectedPickUpMethod(ShippingMethods shippingMethods) {
        ShippingMethodsAdapter shippingMethodsAdapter2 = this.shippingMethodsAdapter;
        if (shippingMethodsAdapter2 != null) {
            C19383o.m32794d(shippingMethods);
            shippingMethodsAdapter2.updateSelectedShippingMethod(shippingMethods);
        }
    }

    private final void updateAdapterWithSelectedShippingAddress(ShippingAddress shippingAddress) {
        AddressBookAdapter addressBookAdapter2 = this.addressBookAdapter;
        if (addressBookAdapter2 != null) {
            addressBookAdapter2.updateSelectedShippingAddress(shippingAddress);
        }
    }

    private final void updateAdapterWithShippingAddressList(List<ShippingAddress> list) {
        this.shippingAddressList = list;
        AddressBookAdapter addressBookAdapter2 = this.addressBookAdapter;
        if (addressBookAdapter2 != null) {
            addressBookAdapter2.notifyDataSetChanged();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ComponentActivity getComponentActivity(Context context) {
        return ICustomViewsViewModel.DefaultImpls.getComponentActivity(this, context);
    }

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public C2887s getLifecycleOwner(View view) {
        return ICustomViewsViewModel.DefaultImpls.getLifecycleOwner(this, view);
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public void initViewModelObservers() {
        C6456a aVar = new C6456a(this, 7);
        C6457b bVar = new C6457b(this, 5);
        C10077j jVar = new C10077j(this, 4);
        C9498g gVar = new C9498g(this, 6);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getListOfShippingAddresses().observe(componentActivity, aVar);
        getViewModel().getSelectedShippingAddress().observe(componentActivity, bVar);
        getViewModel().getListOfPickUpMethods().observe(componentActivity, jVar);
        getViewModel().getSelectedShippingMethod().observe(componentActivity, gVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAddNewShippingAddressClicked() {
        PLog.click$default(PEnums.TransitionName.ADD_SHIPPING_ADDRESS_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.SHIPPING, "address_book_screen", "shipping_address_add", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        if (id == C17165R.C17167id.address_book_left_tab_tv || id == C17165R.C17167id.address_book_left_tab_view) {
            handleLeftTabOnClickAction();
            PLog.click$default(PEnums.TransitionName.SHIP_IT_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.SHIPPING_OPTION, (String) null, "address_book_screen", "shipping_address_view", "shipping", (InstrumentationEvent.InstrumentationEventBuilder) null, 256, (Object) null);
        } else if (id == C17165R.C17167id.address_book_right_tab_tv || id == C17165R.C17167id.address_book_right_tab_view) {
            handleRightTabOnClickAction();
            PLog.click$default(PEnums.TransitionName.PICK_IT_UP_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.SHIPPING_OPTION, (String) null, "address_book_screen", "shipping_address_view", "pickup", (InstrumentationEvent.InstrumentationEventBuilder) null, 256, (Object) null);
        }
    }

    public void onShippingAddressSelected(int i) {
        int i2 = i;
        PEnums.TransitionName transitionName = PEnums.TransitionName.SHIPPING_ADDRESS_SELECTED;
        PEnums.Outcome outcome = PEnums.Outcome.SHOWN;
        PEnums.EventCode eventCode = PEnums.EventCode.E103;
        PEnums.StateName stateName = PEnums.StateName.SHIPPING;
        PLog.click$default(transitionName, outcome, eventCode, stateName, (String) null, "address_book_screen", "shipping_address_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        getViewModel().updateSelectedAddress(i2);
        finishingAnimation();
        PEnums.TransitionName transitionName2 = transitionName;
        PLog.click$default(transitionName2, PEnums.Outcome.SELECTED, PEnums.EventCode.E110, stateName, (String) null, "address_book_screen", "shipping_address_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.decision$default(transitionName2, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E138, stateName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener = this.mPayPalAddressBookInfoViewListener;
        if (payPalAddressBookInfoViewListener != null) {
            payPalAddressBookInfoViewListener.onPayPalAddressSelected(i2);
        }
    }

    public void onShippingMethodSelected(int i, ShippingMethodType shippingMethodType) {
        int i2 = i;
        ShippingMethodType shippingMethodType2 = shippingMethodType;
        C19383o.m32797g(shippingMethodType2, "selectedShippingMethodType");
        PEnums.TransitionName transitionName = shippingMethodType.isShipping() ? PEnums.TransitionName.SHIPPING_OPTION_SELECTED : PEnums.TransitionName.PICKUP_OPTION_SELECTED;
        PLog.click$default(transitionName, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIPPING, (String) null, "shipping_method_view", "shipping_method_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        getViewModel().updateSelectedShippingMethod(i2, shippingMethodType2);
        finishingAnimation();
        PEnums.TransitionName transitionName2 = transitionName;
        PLog.click$default(transitionName2, PEnums.Outcome.SELECTED, PEnums.EventCode.E110, PEnums.StateName.PICK_IT_UP, (String) null, "shipping_method_view", "shipping_method_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.decision$default(transitionName2, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E138, PEnums.StateName.SHIPPING_METHODS, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener = this.mPayPalAddressBookInfoViewListener;
        if (payPalAddressBookInfoViewListener != null) {
            payPalAddressBookInfoViewListener.onPayPalPickUpSelected(i2, shippingMethodType2);
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.addressAutoCompleteViewModel$delegate = new C2868j0(C19386q.m32807a(AddressAutoCompleteViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                View.inflate(context2, C17165R.C17169layout.paypal_address_book_info_layout, this);
                View findViewById = findViewById(C17165R.C17167id.addressBookRecyclerView);
                C19383o.m32796f(findViewById, "findViewById(R.id.addressBookRecyclerView)");
                this.addressBookRecyclerView = (RecyclerView) findViewById;
                View findViewById2 = findViewById(C17165R.C17167id.address_book_current_location_tv);
                C19383o.m32796f(findViewById2, "findViewById(R.id.addres…book_current_location_tv)");
                this.addressBookCurrentLocationTv = (TextView) findViewById2;
                View findViewById3 = findViewById(C17165R.C17167id.address_book_header_container);
                C19383o.m32796f(findViewById3, "findViewById(R.id.address_book_header_container)");
                this.addressBookHeaderContainer = (LinearLayout) findViewById3;
                View findViewById4 = findViewById(C17165R.C17167id.address_book_underline_container);
                C19383o.m32796f(findViewById4, "findViewById(R.id.addres…book_underline_container)");
                this.addressBookUnderLineContainer = (LinearLayout) findViewById4;
                View findViewById5 = findViewById(C17165R.C17167id.address_book_left_tab_tv);
                C19383o.m32796f(findViewById5, "findViewById(R.id.address_book_left_tab_tv)");
                this.addressBookLeftTabTv = (TextView) findViewById5;
                View findViewById6 = findViewById(C17165R.C17167id.address_book_left_tab_view);
                C19383o.m32796f(findViewById6, "findViewById(R.id.address_book_left_tab_view)");
                this.addressBookLeftTabV = findViewById6;
                View findViewById7 = findViewById(C17165R.C17167id.address_book_right_tab_tv);
                C19383o.m32796f(findViewById7, "findViewById(R.id.address_book_right_tab_tv)");
                this.addressBookRightTabTv = (TextView) findViewById7;
                View findViewById8 = findViewById(C17165R.C17167id.address_book_right_tab_view);
                C19383o.m32796f(findViewById8, "findViewById(R.id.address_book_right_tab_view)");
                this.addressBookRightTabV = findViewById8;
                this.shippingAddressList = getViewModel().getListOfShippingAddresses().getValue();
                this.selectedShippingAddress = getViewModel().getSelectedShippingAddress().getValue();
                this.pickUpMethodList = getViewModel().getListOfPickUpMethods().getValue();
                this.selectedPickUpMethod = getViewModel().getSelectedShippingMethod().getValue();
                ShippingAddress value = getViewModel().getSelectedShippingAddress().getValue();
                this.defaultAddressZipCode = value == null ? null : value.getPostalCode();
                this.mPayPalAddressBookInfoViewListener = payPalAddressBookInfoViewListener;
                initRecyclerView(getViewModel().getSupportedShippingMethodType().getValue(), getViewModel().getSelectedShippingMethod().getValue());
                setOnClickListener();
                initViewModelObservers();
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
