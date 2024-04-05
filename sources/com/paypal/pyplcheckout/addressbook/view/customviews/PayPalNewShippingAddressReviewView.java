package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6466k;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.search.C9893g;
import com.etsy.android.p327ui.home.tabs.C10055e;
import com.etsy.android.p327ui.user.review.C11712k;
import com.etsy.android.stylekit.views.C9055f;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.AddressReviewState;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressFragment;
import com.paypal.pyplcheckout.addressbook.viewmodel.AddressReviewViewModel;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.addshipping.ShippingUtils;
import com.paypal.pyplcheckout.addshipping.model.Country;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.NewShippingAddressRequest;
import com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p260v0.C8184a;
import p499zd.C13955c;

@SuppressLint({"ViewConstructor"})
public final class PayPalNewShippingAddressReviewView extends RelativeLayout implements ICustomViewsViewModel, ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalNewShippingAddressReviewView";
    public Map<Integer, View> _$_findViewCache;
    private final SpannableStringBuilder addressError;
    private final C2843a0<AddressReviewState> addressReviewStateObserver;
    private final C19285c addressReviewViewModel$delegate;
    private final SpannableStringBuilder cityError;
    private final SpannableStringBuilder firstNameError;
    private final Fragment fragment;
    private final SpannableStringBuilder lastNameError;
    private final C19285c mainPaysheetViewModel$delegate;
    private final SpannableStringBuilder stateError;
    private final C19285c viewModel$delegate;
    private final List<EditText> views;
    private final SpannableStringBuilder zipCodeError;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalNewShippingAddressReviewView.TAG;
        }
    }

    static {
        Class<PayPalNewShippingAddressReviewView> cls = PayPalNewShippingAddressReviewView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressReviewView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressReviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressReviewView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalNewShippingAddressReviewView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2);
    }

    private final void addNewAddress() {
        if (notNullValues()) {
            Cache cache = Cache.INSTANCE;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            if (cache.getSavedAddress(context) != null) {
                PLog.decision$default(PEnums.TransitionName.ADD_ADDRESS_ADDED_MANUALLY, PEnums.Outcome.INTERACTED, (PEnums.EventCode) null, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
            }
            PLog.decision$default(PEnums.TransitionName.SAVE_ADDRESS_CLICKED, PEnums.Outcome.CLICKED, (PEnums.EventCode) null, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2036, (Object) null);
            String valueOf = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.splitNameET)).getText());
            String valueOf2 = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.splitLastNameET)).getText());
            String valueOf3 = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.streetNameET)).getText());
            String valueOf4 = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.addressLine2ET)).getText());
            String valueOf5 = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.cityET)).getText());
            String valueOf6 = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.stateET)).getText());
            String valueOf7 = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.zipET)).getText());
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            String countryId = cache.getCountryId(context2);
            addNewShippingAddress(new NewShippingAddressRequest(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, countryId == null ? null : StringExtensionsKt.uppercase(countryId)));
            return;
        }
        Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.splitLastNameET)).getText();
        if (!(text == null || text.length() == 0)) {
            ((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.lastnameInputLayout)).setError(this.lastNameError);
        } else {
            ((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.nameInputLayout)).setError(this.firstNameError);
        }
    }

    private final synchronized void addNewShippingAddress(NewShippingAddressRequest newShippingAddressRequest) {
        getAddressReviewViewModel().validateAndAddAddress(newShippingAddressRequest);
    }

    private final void addTextWatcher(TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(new PayPalNewShippingAddressReviewView$addTextWatcher$1(textInputLayout));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: addressReviewStateObserver$lambda-0  reason: not valid java name */
    public static final void m35168addressReviewStateObserver$lambda0(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, AddressReviewState addressReviewState) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        payPalNewShippingAddressReviewView.updateButtonState(addressReviewState instanceof AddressReviewState.Loading);
    }

    private final void checkText(TextInputEditText textInputEditText, TextInputLayout textInputLayout, SpannableStringBuilder spannableStringBuilder, String str) {
        boolean z = false;
        textInputLayout.setErrorEnabled(false);
        Editable text = textInputEditText.getText();
        if (text == null || text.length() == 0) {
            z = true;
        }
        if (z) {
            textInputLayout.setError(spannableStringBuilder);
            PLog pLog = PLog.INSTANCE;
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E623, str, (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, (PEnums.StateName) null, str, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1880, (Object) null);
        }
    }

    private final AddressReviewViewModel getAddressReviewViewModel() {
        return (AddressReviewViewModel) this.addressReviewViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final AddressAutoCompleteViewModel getViewModel() {
        return (AddressAutoCompleteViewModel) this.viewModel$delegate.getValue();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initViews() {
        AddressAutoCompleteViewModel viewModel = getViewModel();
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        viewModel.setCountryFields(context);
        List<EditText> list = this.views;
        int i = C17165R.C17167id.streetNameET;
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(i);
        C19383o.m32796f(textInputEditText, "streetNameET");
        list.add(textInputEditText);
        List<EditText> list2 = this.views;
        int i2 = C17165R.C17167id.cityET;
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(i2);
        C19383o.m32796f(textInputEditText2, "cityET");
        list2.add(textInputEditText2);
        List<EditText> list3 = this.views;
        int i3 = C17165R.C17167id.stateET;
        TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(i3);
        C19383o.m32796f(textInputEditText3, "stateET");
        list3.add(textInputEditText3);
        List<EditText> list4 = this.views;
        int i4 = C17165R.C17167id.zipET;
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(i4);
        C19383o.m32796f(textInputEditText4, "zipET");
        list4.add(textInputEditText4);
        List<EditText> list5 = this.views;
        int i5 = C17165R.C17167id.splitNameET;
        TextInputEditText textInputEditText5 = (TextInputEditText) _$_findCachedViewById(i5);
        C19383o.m32796f(textInputEditText5, "splitNameET");
        list5.add(textInputEditText5);
        List<EditText> list6 = this.views;
        int i6 = C17165R.C17167id.splitLastNameET;
        TextInputEditText textInputEditText6 = (TextInputEditText) _$_findCachedViewById(i6);
        C19383o.m32796f(textInputEditText6, "splitLastNameET");
        list6.add(textInputEditText6);
        List<EditText> list7 = this.views;
        int i7 = C17165R.C17167id.addressLine2ET;
        TextInputEditText textInputEditText7 = (TextInputEditText) _$_findCachedViewById(i7);
        C19383o.m32796f(textInputEditText7, "addressLine2ET");
        list7.add(textInputEditText7);
        ((TextInputEditText) _$_findCachedViewById(i)).requestFocus();
        setViewsActionListener(this.views);
        Cache cache = Cache.INSTANCE;
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        if (!cache.getBlockNonDomesticShipping(context2)) {
            ((TextInputEditText) _$_findCachedViewById(i)).setOnTouchListener(new C11712k(this, 1));
        }
        addTextWatcher((TextInputEditText) _$_findCachedViewById(i5), (ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.nameInputLayout));
        addTextWatcher((TextInputEditText) _$_findCachedViewById(i6), (ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.lastnameInputLayout));
        addTextWatcher((TextInputEditText) _$_findCachedViewById(i4), (ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.zipInputLayout));
        addTextWatcher((TextInputEditText) _$_findCachedViewById(i3), (ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.stateInputLayout));
        addTextWatcher((TextInputEditText) _$_findCachedViewById(i2), (ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.cityInputLayout));
        addTextWatcher((TextInputEditText) _$_findCachedViewById(i), (ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.addressReviewInputLayout));
        ((TextInputEditText) _$_findCachedViewById(i5)).setOnFocusChangeListener(new C17177a(this));
        ((TextInputEditText) _$_findCachedViewById(i6)).setOnFocusChangeListener(new C9893g(this, 1));
        ((TextInputEditText) _$_findCachedViewById(i4)).setOnFocusChangeListener(new C17178b(this));
        ((TextInputEditText) _$_findCachedViewById(i3)).setOnFocusChangeListener(new C17179c(this));
        ((TextInputEditText) _$_findCachedViewById(i2)).setOnFocusChangeListener(new C10055e(this, 1));
        ((TextInputEditText) _$_findCachedViewById(i)).setOnFocusChangeListener(new C17180d(this));
        ((TextInputEditText) _$_findCachedViewById(i7)).setOnFocusChangeListener(new C17181e());
        ((PayPalActionButton) _$_findCachedViewById(C17165R.C17167id.saveNewAddressButton)).setOnClickListener(new C9055f(this, 7));
        updateButtonState(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-10  reason: not valid java name */
    public static final void m35169initViews$lambda10(View view, boolean z) {
        if (!z) {
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, PayPalNewShippingAddressReviewViewKt.ADDRESS_2, PayPalNewShippingAddressReviewViewKt.SHIPPING_LINE_2_FIELD);
        } else {
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, PayPalNewShippingAddressReviewViewKt.ADDRESS_2, PayPalNewShippingAddressReviewViewKt.SHIPPING_LINE_2_FIELD);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-11  reason: not valid java name */
    public static final void m35170initViews$lambda11(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        payPalNewShippingAddressReviewView.addNewAddress();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-3  reason: not valid java name */
    public static final boolean m35171initViews$lambda3(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, MotionEvent motionEvent) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        int i = C17165R.C17167id.streetNameET;
        if (rawX < ((float) (((TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(i)).getRight() - ((TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(i)).getCompoundDrawables()[2].getBounds().width()))) {
            return false;
        }
        Cache cache = Cache.INSTANCE;
        Context context = payPalNewShippingAddressReviewView.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String string = payPalNewShippingAddressReviewView.getContext().getString(C17165R.string.paypal_checkout_country);
        C19383o.m32796f(string, "context.getString(R.stri….paypal_checkout_country)");
        cache.cacheSearchScreenTitle(context, string);
        Context context2 = payPalNewShippingAddressReviewView.getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        String string2 = payPalNewShippingAddressReviewView.getContext().getString(C17165R.string.paypal_checkout_select_country);
        C19383o.m32796f(string2, "context.getString(R.stri…_checkout_select_country)");
        cache.cacheHintTitle(context2, string2);
        Context context3 = payPalNewShippingAddressReviewView.getContext();
        C19383o.m32796f(context3, ResponseConstants.CONTEXT);
        cache.cacheComingFromReviewPage(context3, true);
        Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLNewShippingAddressFragment.TAG, new PYPLNewShippingAddressFragment())));
        ShippingUtils.analyticsClick$default(ShippingUtils.INSTANCE, PEnums.TransitionName.SELECTED_COUNTRY_CLICKED, (String) null, "country", 2, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-4  reason: not valid java name */
    public static final void m35172initViews$lambda4(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, boolean z) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.splitNameET);
            C19383o.m32796f(textInputEditText, "splitNameET");
            ErrorPaddingInputLayout errorPaddingInputLayout = (ErrorPaddingInputLayout) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.nameInputLayout);
            C19383o.m32796f(errorPaddingInputLayout, "nameInputLayout");
            payPalNewShippingAddressReviewView.checkText(textInputEditText, errorPaddingInputLayout, payPalNewShippingAddressReviewView.firstNameError, "name");
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, "name", PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
            return;
        }
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, "name", PayPalNewShippingAddressReviewViewKt.FIRST_NAME_FIELD);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-5  reason: not valid java name */
    public static final void m35173initViews$lambda5(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, boolean z) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.splitLastNameET);
            C19383o.m32796f(textInputEditText, "splitLastNameET");
            ErrorPaddingInputLayout errorPaddingInputLayout = (ErrorPaddingInputLayout) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.lastnameInputLayout);
            C19383o.m32796f(errorPaddingInputLayout, "lastnameInputLayout");
            payPalNewShippingAddressReviewView.checkText(textInputEditText, errorPaddingInputLayout, payPalNewShippingAddressReviewView.lastNameError, "last_name");
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, "last_name", PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
            return;
        }
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, "last_name", PayPalNewShippingAddressReviewViewKt.LAST_NAME_FIELD);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-6  reason: not valid java name */
    public static final void m35174initViews$lambda6(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, boolean z) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.zipET);
            C19383o.m32796f(textInputEditText, "zipET");
            ErrorPaddingInputLayout errorPaddingInputLayout = (ErrorPaddingInputLayout) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.zipInputLayout);
            C19383o.m32796f(errorPaddingInputLayout, "zipInputLayout");
            payPalNewShippingAddressReviewView.checkText(textInputEditText, errorPaddingInputLayout, payPalNewShippingAddressReviewView.zipCodeError, PayPalNewShippingAddressReviewViewKt.ZIP_CODE);
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, PayPalNewShippingAddressReviewViewKt.ZIP_CODE, PayPalNewShippingAddressReviewViewKt.SHIPPING_POSTAL_CODE_FIELD);
            return;
        }
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, PayPalNewShippingAddressReviewViewKt.ZIP_CODE, PayPalNewShippingAddressReviewViewKt.SHIPPING_POSTAL_CODE_FIELD);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-7  reason: not valid java name */
    public static final void m35175initViews$lambda7(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, boolean z) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.stateET);
            C19383o.m32796f(textInputEditText, "stateET");
            ErrorPaddingInputLayout errorPaddingInputLayout = (ErrorPaddingInputLayout) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.stateInputLayout);
            C19383o.m32796f(errorPaddingInputLayout, "stateInputLayout");
            payPalNewShippingAddressReviewView.checkText(textInputEditText, errorPaddingInputLayout, payPalNewShippingAddressReviewView.stateError, "state");
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, "state", PayPalNewShippingAddressReviewViewKt.SHIPPING_STATE_FIELD);
            return;
        }
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, "state", PayPalNewShippingAddressReviewViewKt.SHIPPING_STATE_FIELD);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-8  reason: not valid java name */
    public static final void m35176initViews$lambda8(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, boolean z) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.cityET);
            C19383o.m32796f(textInputEditText, "cityET");
            ErrorPaddingInputLayout errorPaddingInputLayout = (ErrorPaddingInputLayout) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.cityInputLayout);
            C19383o.m32796f(errorPaddingInputLayout, "cityInputLayout");
            payPalNewShippingAddressReviewView.checkText(textInputEditText, errorPaddingInputLayout, payPalNewShippingAddressReviewView.cityError, "city");
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, "city", PayPalNewShippingAddressReviewViewKt.SHIPPING_CITY_FIELD);
            return;
        }
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, "city", PayPalNewShippingAddressReviewViewKt.SHIPPING_CITY_FIELD);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-9  reason: not valid java name */
    public static final void m35177initViews$lambda9(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, View view, boolean z) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if (!z) {
            TextInputEditText textInputEditText = (TextInputEditText) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.streetNameET);
            C19383o.m32796f(textInputEditText, "streetNameET");
            ErrorPaddingInputLayout errorPaddingInputLayout = (ErrorPaddingInputLayout) payPalNewShippingAddressReviewView._$_findCachedViewById(C17165R.C17167id.addressReviewInputLayout);
            C19383o.m32796f(errorPaddingInputLayout, "addressReviewInputLayout");
            payPalNewShippingAddressReviewView.checkText(textInputEditText, errorPaddingInputLayout, payPalNewShippingAddressReviewView.addressError, PayPalNewShippingAddressReviewViewKt.ADDRESS_1);
            ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION_BLUR, PayPalNewShippingAddressReviewViewKt.ADDRESS_1, PayPalNewShippingAddressReviewViewKt.SHIPPING_LINE_1_FIELD);
            return;
        }
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.NATIVE_ADD_SHIPPING_FIELD_INTERACTION, PayPalNewShippingAddressReviewViewKt.ADDRESS_1, PayPalNewShippingAddressReviewViewKt.SHIPPING_LINE_1_FIELD);
    }

    private final void initializeError(SpannableStringBuilder spannableStringBuilder, String str) {
        spannableStringBuilder.append("  " + str);
        Context context = getContext();
        int i = C17165R.C17166drawable.ic_error;
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context, i);
        if (b != null) {
            b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(b == null ? null : new ImageSpan(b, 2), 0, 1, 33);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(C17165R.dimen.error_font_scalar, typedValue, true);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(typedValue.getFloat()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(C17165R.color.add_card_red_hint, (Resources.Theme) null)), 0, spannableStringBuilder.length(), 33);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean notNullValues() {
        /*
            r4 = this;
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.streetNameET
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            android.text.Editable r0 = r0.getText()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 != 0) goto L_0x00eb
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.splitLastNameET
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0033
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r0 != 0) goto L_0x00eb
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.splitNameET
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x004d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = r2
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 == 0) goto L_0x0052
            goto L_0x00eb
        L_0x0052:
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.stateInputLayout
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout r0 = (com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout) r0
            java.lang.String r3 = "stateInputLayout"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0067
            r0 = r1
            goto L_0x0068
        L_0x0067:
            r0 = r2
        L_0x0068:
            if (r0 == 0) goto L_0x0086
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.stateET
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0081
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r0 = r2
            goto L_0x0082
        L_0x0081:
            r0 = r1
        L_0x0082:
            if (r0 == 0) goto L_0x0086
            goto L_0x00eb
        L_0x0086:
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.cityInputLayout
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout r0 = (com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout) r0
            java.lang.String r3 = "cityInputLayout"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x009b
            r0 = r1
            goto L_0x009c
        L_0x009b:
            r0 = r2
        L_0x009c:
            if (r0 == 0) goto L_0x00b9
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.cityET
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00b5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r0 = r2
            goto L_0x00b6
        L_0x00b5:
            r0 = r1
        L_0x00b6:
            if (r0 == 0) goto L_0x00b9
            goto L_0x00eb
        L_0x00b9:
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.zipInputLayout
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout r0 = (com.paypal.pyplcheckout.utils.ErrorPaddingInputLayout) r0
            java.lang.String r3 = "zipInputLayout"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00ce
            r0 = r1
            goto L_0x00cf
        L_0x00ce:
            r0 = r2
        L_0x00cf:
            if (r0 == 0) goto L_0x00ec
            int r0 = com.paypal.pyplcheckout.C17165R.C17167id.zipET
            android.view.View r0 = r4._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00e8
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r0 = r2
            goto L_0x00e9
        L_0x00e8:
            r0 = r1
        L_0x00e9:
            if (r0 == 0) goto L_0x00ec
        L_0x00eb:
            r1 = r2
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView.notNullValues():boolean");
    }

    private final void setHints() {
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        Country countryById = cache.getCountryById(context);
        int i = C17165R.C17167id.zipInputLayout;
        ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        ((ErrorPaddingInputLayout) _$_findCachedViewById(i)).setHint((CharSequence) shippingUtils.getStringResource(context2, getViewModel().getStringResource(countryById.getZipcode())));
        int i2 = C17165R.C17167id.stateInputLayout;
        Context context3 = getContext();
        C19383o.m32796f(context3, ResponseConstants.CONTEXT);
        ((ErrorPaddingInputLayout) _$_findCachedViewById(i2)).setHint((CharSequence) shippingUtils.getStringResource(context3, getViewModel().getStringResource(countryById.getState())));
        int i3 = C17165R.C17167id.cityInputLayout;
        Context context4 = getContext();
        C19383o.m32796f(context4, ResponseConstants.CONTEXT);
        ((ErrorPaddingInputLayout) _$_findCachedViewById(i3)).setHint((CharSequence) shippingUtils.getStringResource(context4, getViewModel().getStringResource(countryById.getCity())));
        int i4 = C17165R.C17167id.addressReviewInputLayout;
        Context context5 = getContext();
        C19383o.m32796f(context5, ResponseConstants.CONTEXT);
        ((ErrorPaddingInputLayout) _$_findCachedViewById(i4)).setHint((CharSequence) shippingUtils.getStringResource(context5, getViewModel().getStringResource(countryById.getAddress1())));
        Context context6 = getContext();
        C19383o.m32796f(context6, ResponseConstants.CONTEXT);
        ((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.addressLine2InputLayout)).setHint((CharSequence) shippingUtils.getStringResource(context6, getViewModel().getStringResource(countryById.getAddress2())));
        SpannableStringBuilder spannableStringBuilder = this.firstNameError;
        Context context7 = getContext();
        int i5 = C17165R.string.paypal_checkout_error_required;
        String string = context7.getString(i5, new Object[]{((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.nameInputLayout)).getHint()});
        C19383o.m32796f(string, "context.getString(R.stri…ed, nameInputLayout.hint)");
        initializeError(spannableStringBuilder, string);
        SpannableStringBuilder spannableStringBuilder2 = this.lastNameError;
        String string2 = getContext().getString(i5, new Object[]{((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.lastnameInputLayout)).getHint()});
        C19383o.m32796f(string2, "context.getString(R.stri…lastnameInputLayout.hint)");
        initializeError(spannableStringBuilder2, string2);
        SpannableStringBuilder spannableStringBuilder3 = this.addressError;
        String string3 = getContext().getString(i5, new Object[]{((ErrorPaddingInputLayout) _$_findCachedViewById(i4)).getHint()});
        C19383o.m32796f(string3, "context.getString(R.stri…ssReviewInputLayout.hint)");
        initializeError(spannableStringBuilder3, string3);
        SpannableStringBuilder spannableStringBuilder4 = this.cityError;
        String string4 = getContext().getString(i5, new Object[]{((ErrorPaddingInputLayout) _$_findCachedViewById(i3)).getHint()});
        C19383o.m32796f(string4, "context.getString(R.stri…ed, cityInputLayout.hint)");
        initializeError(spannableStringBuilder4, string4);
        SpannableStringBuilder spannableStringBuilder5 = this.stateError;
        String string5 = getContext().getString(i5, new Object[]{((ErrorPaddingInputLayout) _$_findCachedViewById(i2)).getHint()});
        C19383o.m32796f(string5, "context.getString(R.stri…d, stateInputLayout.hint)");
        initializeError(spannableStringBuilder5, string5);
        SpannableStringBuilder spannableStringBuilder6 = this.zipCodeError;
        String string6 = getContext().getString(i5, new Object[]{((ErrorPaddingInputLayout) _$_findCachedViewById(i)).getHint()});
        C19383o.m32796f(string6, "context.getString(R.stri…red, zipInputLayout.hint)");
        initializeError(spannableStringBuilder6, string6);
        updateUI(countryById);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setViewsActionListener(List<EditText> list) {
        for (EditText onEditorActionListener : list) {
            onEditorActionListener.setOnEditorActionListener(new C13955c(this, 1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setViewsActionListener$lambda-14$lambda-13  reason: not valid java name */
    public static final boolean m35178setViewsActionListener$lambda14$lambda13(PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView, TextView textView, int i, KeyEvent keyEvent) {
        C19383o.m32797g(payPalNewShippingAddressReviewView, "this$0");
        if ((keyEvent == null ? -1 : keyEvent.getAction()) != 0 && i != 6) {
            return false;
        }
        payPalNewShippingAddressReviewView.addNewAddress();
        return true;
    }

    private final void updateButtonState(boolean z) {
        if (z) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C17165R.C17167id.progressBar);
            C19383o.m32796f(progressBar, "progressBar");
            progressBar.setVisibility(0);
            int i = C17165R.C17167id.saveNewAddressButton;
            ((PayPalActionButton) _$_findCachedViewById(i)).updateButtonText("");
            ((PayPalActionButton) _$_findCachedViewById(i)).setEnabled(false);
            return;
        }
        int i2 = C17165R.C17167id.saveNewAddressButton;
        ((PayPalActionButton) _$_findCachedViewById(i2)).setEnabled(true);
        ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C17165R.C17167id.progressBar);
        C19383o.m32796f(progressBar2, "progressBar");
        progressBar2.setVisibility(8);
        ((PayPalActionButton) _$_findCachedViewById(i2)).updateButtonText(getResources().getString(C17165R.string.paypal_checkout_new_address_save));
    }

    private final void updateUI(Country country) {
        if (C19457k.m33020X0(country.getZipcode())) {
            ((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.zipInputLayout)).setVisibility(8);
            Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.zipET)).getText();
            if (text != null) {
                text.clear();
            }
        }
        if (C19457k.m33020X0(country.getState())) {
            ((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.stateInputLayout)).setVisibility(8);
            Editable text2 = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.stateET)).getText();
            if (text2 != null) {
                text2.clear();
            }
        }
        if (C19457k.m33020X0(country.getCity())) {
            ((ErrorPaddingInputLayout) _$_findCachedViewById(C17165R.C17167id.cityInputLayout)).setVisibility(8);
            Editable text3 = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.cityET)).getText();
            if (text3 != null) {
                text3.clear();
            }
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
        getAddressReviewViewModel().getAddressReviewState().observe(getLifecycleOwner(this), this.addressReviewStateObserver);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initViewModelObservers();
    }

    public final void populateView() {
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        if (cache.getSavedAddress(context) != null) {
            int i = C17165R.C17167id.streetNameET;
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            ((TextInputEditText) _$_findCachedViewById(i)).setText(cache.getSavedAddress(context2));
            ((TextInputEditText) _$_findCachedViewById(i)).requestFocus();
            ((TextInputEditText) _$_findCachedViewById(i)).setSelection(((TextInputEditText) _$_findCachedViewById(i)).length());
            Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.cityET)).getText();
            if (text != null) {
                text.clear();
            }
            Editable text2 = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.stateET)).getText();
            if (text2 != null) {
                text2.clear();
            }
            Editable text3 = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.zipET)).getText();
            if (text3 != null) {
                text3.clear();
            }
        } else {
            Context context3 = getContext();
            C19383o.m32796f(context3, ResponseConstants.CONTEXT);
            ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.streetNameET)).setText(cache.getFullAddress(context3));
            Context context4 = getContext();
            C19383o.m32796f(context4, ResponseConstants.CONTEXT);
            String state = cache.getState(context4);
            if (state != null) {
                ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.stateET)).setText(state);
            }
            Context context5 = getContext();
            C19383o.m32796f(context5, ResponseConstants.CONTEXT);
            String city = cache.getCity(context5);
            if (city != null) {
                ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.cityET)).setText(city);
            }
            Context context6 = getContext();
            C19383o.m32796f(context6, ResponseConstants.CONTEXT);
            ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.zipET)).setText(cache.getPostalCode(context6));
        }
        ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.splitLastNameET)).setText(getViewModel().getLastName());
        ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.splitNameET)).setText(getViewModel().getFirstName());
        ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
        Context context7 = getContext();
        C19383o.m32796f(context7, ResponseConstants.CONTEXT);
        String flagCountry$default = ShippingUtils.getFlagCountry$default(shippingUtils, context7, (String) null, 2, (Object) null);
        Resources resources = getResources();
        C19383o.m32796f(resources, "resources");
        String packageName = getContext().getPackageName();
        C19383o.m32796f(packageName, "context.packageName");
        int flagDrawableId = shippingUtils.getFlagDrawableId(resources, flagCountry$default, packageName);
        Context context8 = getContext();
        C19383o.m32796f(context8, ResponseConstants.CONTEXT);
        ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.streetNameET)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, shippingUtils.getRoundedDrawable(context8, flagDrawableId), (Drawable) null);
        Context context9 = getContext();
        C19383o.m32796f(context9, ResponseConstants.CONTEXT);
        cache.cacheCountryId(context9, flagCountry$default);
        setHints();
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressReviewView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
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
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(AddressAutoCompleteViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$13 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                if (z) {
                    this.addressReviewViewModel$delegate = new C2868j0(C19386q.m32807a(AddressReviewViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    this.views = new ArrayList();
                    this.firstNameError = new SpannableStringBuilder();
                    this.lastNameError = new SpannableStringBuilder();
                    this.addressError = new SpannableStringBuilder();
                    this.zipCodeError = new SpannableStringBuilder();
                    this.cityError = new SpannableStringBuilder();
                    this.stateError = new SpannableStringBuilder();
                    this.addressReviewStateObserver = new C6466k(this, 2);
                    View.inflate(context2, C17165R.C17169layout.paypal_new_shipping_address_review_layout, this);
                    getMainPaysheetViewModel().changeTitle(getResources().getString(C17165R.string.paypal_checkout_add_shipping_address));
                    initViews();
                    return;
                }
                PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
                throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
