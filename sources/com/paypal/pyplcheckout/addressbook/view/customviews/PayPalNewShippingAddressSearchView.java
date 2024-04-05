package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.conversation.details.ccm.C9499h;
import com.etsy.android.stylekit.views.C9057h;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.adapters.ShippingAdapter;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLNewShippingAddressReviewFragment;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalNewShippingAddressViewListener;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.addshipping.ShippingUtils;
import com.paypal.pyplcheckout.addshipping.model.Address;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoComplete;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceId;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompletePlaceIdResponse;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteRequest;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteResponse;
import com.paypal.pyplcheckout.addshipping.model.AddressAutoCompleteResponseData;
import com.paypal.pyplcheckout.addshipping.model.Country;
import com.paypal.pyplcheckout.addshipping.model.GooglePlacesType;
import com.paypal.pyplcheckout.addshipping.model.Suggestions;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C19285c;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p075d.C6614a;

@SuppressLint({"ViewConstructor"})
public final class PayPalNewShippingAddressSearchView extends RelativeLayout implements ContentView, ShippingAdapter.ShippingAdapterClickListener, ShippingAdapter.CountryAdapterClickListener, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalNewShippingAddressSearchView";
    public Map<Integer, View> _$_findViewCache;
    /* access modifiers changed from: private */
    public ShippingAdapter adapter;
    private final ComponentActivity componentActivity;
    private final Fragment fragment;
    private LinearLayoutManager layoutManager;
    private final Locale locale;
    private PayPalNewShippingAddressViewListener mPayPalNewShippingAddressViewListener;
    private final C19285c mainPaysheetViewModel$delegate;
    private final List<Address> shippingAddresses;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalNewShippingAddressSearchView.TAG;
        }
    }

    static {
        Class<PayPalNewShippingAddressSearchView> cls = PayPalNewShippingAddressSearchView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressSearchView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalNewShippingAddressViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalNewShippingAddressViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressSearchView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalNewShippingAddressViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressSearchView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalNewShippingAddressViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalNewShippingAddressSearchView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalNewShippingAddressViewListener payPalNewShippingAddressViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalNewShippingAddressViewListener);
    }

    /* access modifiers changed from: private */
    public final void clearAdapter() {
        ShippingUtils.INSTANCE.runOnUiThread(new PayPalNewShippingAddressSearchView$clearAdapter$1(this));
    }

    private final void fetchShippingResponse(CharSequence charSequence) {
        this.shippingAddresses.clear();
        AddressAutoCompleteViewModel viewModel = getViewModel();
        ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        int maxItemsFromDensityValue = shippingUtils.getMaxItemsFromDensityValue(context);
        Cache cache = Cache.INSTANCE;
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        String countryId = cache.getCountryId(context2);
        String uppercase = countryId == null ? null : StringExtensionsKt.uppercase(countryId);
        String obj = charSequence.toString();
        String language = this.locale.getLanguage();
        C19383o.m32796f(language, "locale.language");
        viewModel.fetchAddShippingResponse(new AddressAutoCompleteRequest(maxItemsFromDensityValue, uppercase, obj, language, false, (GooglePlacesType) null, 48, (DefaultConstructorMarker) null));
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final AddressAutoCompleteViewModel getViewModel() {
        return (AddressAutoCompleteViewModel) this.viewModel$delegate.getValue();
    }

    private final void goToReviewScreen() {
        Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
        if (text != null) {
            text.clear();
        }
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String string = getContext().getString(C17165R.string.paypal_checkout_add_shipping_address);
        C19383o.m32796f(string, "context.getString(R.stri…out_add_shipping_address)");
        cache.cacheSearchScreenTitle(context, string);
        getViewModel().resetValues();
        Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLNewShippingAddressReviewFragment.TAG, new PYPLNewShippingAddressReviewFragment())));
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-11  reason: not valid java name */
    public static final void m35179initViewModelObservers$lambda11(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView, List list) {
        C19383o.m32797g(payPalNewShippingAddressSearchView, "this$0");
        if (list != null) {
            if (!list.isEmpty()) {
                payPalNewShippingAddressSearchView.notifyCountryRecyclerView(new ArrayList(list));
            } else {
                payPalNewShippingAddressSearchView.notifyCountryRecyclerView(new ArrayList());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-12  reason: not valid java name */
    public static final void m35180initViewModelObservers$lambda12(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView, Boolean bool) {
        C19383o.m32797g(payPalNewShippingAddressSearchView, "this$0");
        C19383o.m32796f(bool, "countryListComplete");
        if (bool.booleanValue()) {
            Cache cache = Cache.INSTANCE;
            Context context = payPalNewShippingAddressSearchView.getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            if (C19457k.m33019W0(cache.getSearchScreenTitle(context), payPalNewShippingAddressSearchView.getContext().getString(C17165R.string.paypal_checkout_country), true)) {
                payPalNewShippingAddressSearchView.initializeCountryAdapter();
                Context context2 = payPalNewShippingAddressSearchView.getContext();
                C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                AddressAutoCompleteViewModel viewModel = payPalNewShippingAddressSearchView.getViewModel();
                ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
                Context context3 = payPalNewShippingAddressSearchView.getContext();
                C19383o.m32796f(context3, ResponseConstants.CONTEXT);
                cache.cacheCountryPosition(context2, viewModel.getCountryPositionOnList(ShippingUtils.getFlagCountry$default(shippingUtils, context3, (String) null, 2, (Object) null), cache.getCountries()));
                payPalNewShippingAddressSearchView.scrollToCountry();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-7  reason: not valid java name */
    public static final void m35181initViewModelObservers$lambda7(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView, Pair pair) {
        AddressAutoCompleteResponseData data;
        AddressAutoComplete addressAutoComplete;
        List<Suggestions> suggestions;
        C19383o.m32797g(payPalNewShippingAddressSearchView, "this$0");
        AddressAutoCompleteResponse addressAutoCompleteResponse = (AddressAutoCompleteResponse) pair.getSecond();
        if (addressAutoCompleteResponse != null && (data = addressAutoCompleteResponse.getData()) != null && (addressAutoComplete = data.getAddressAutoComplete()) != null && (suggestions = addressAutoComplete.getSuggestions()) != null) {
            payPalNewShippingAddressSearchView.notifyRecyclerView((String) pair.getFirst(), C19327t.m32661q1(suggestions));
            Editable text = ((TextInputEditText) payPalNewShippingAddressSearchView._$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
            if (text == null || text.length() == 0) {
                ((TextView) payPalNewShippingAddressSearchView._$_findCachedViewById(C17165R.C17167id.poweredByGoogleLabel)).setVisibility(8);
            } else {
                ((TextView) payPalNewShippingAddressSearchView._$_findCachedViewById(C17165R.C17167id.poweredByGoogleLabel)).setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-9  reason: not valid java name */
    public static final void m35182initViewModelObservers$lambda9(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView, AddressAutoCompletePlaceIdResponse addressAutoCompletePlaceIdResponse) {
        C19383o.m32797g(payPalNewShippingAddressSearchView, "this$0");
        AddressAutoCompletePlaceId addressFromAutoCompletePlaceId = addressAutoCompletePlaceIdResponse.getData().getAddressFromAutoCompletePlaceId();
        Address address = addressFromAutoCompletePlaceId == null ? null : addressFromAutoCompletePlaceId.getAddress();
        Cache cache = Cache.INSTANCE;
        Context context = payPalNewShippingAddressSearchView.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        cache.clearSavedAddress(context);
        if (address != null) {
            Context context2 = payPalNewShippingAddressSearchView.getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            cache.cacheAddressSelected(context2, address);
        }
        Editable text = ((TextInputEditText) payPalNewShippingAddressSearchView._$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
        if (text != null) {
            text.clear();
        }
        payPalNewShippingAddressSearchView.goToReviewScreen();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initViews() {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        this.adapter = new ShippingAdapter(context, new ArrayList(), new ArrayList(), this, this, (String) null, 32, (DefaultConstructorMarker) null);
        AddressListView addressListView = (AddressListView) _$_findCachedViewById(C17165R.C17167id.newAddressRecyclerView);
        ShippingAdapter shippingAdapter = this.adapter;
        if (shippingAdapter != null) {
            addressListView.setAdapter(shippingAdapter);
            ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
            Resources resources = getResources();
            C19383o.m32796f(resources, "resources");
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            String flagCountry$default = ShippingUtils.getFlagCountry$default(shippingUtils, context2, (String) null, 2, (Object) null);
            String packageName = getContext().getPackageName();
            C19383o.m32796f(packageName, "context.packageName");
            int flagDrawableId = shippingUtils.getFlagDrawableId(resources, flagCountry$default, packageName);
            int i = C17165R.C17167id.typeAddress;
            Context context3 = getContext();
            C19383o.m32796f(context3, ResponseConstants.CONTEXT);
            ((TextInputEditText) _$_findCachedViewById(i)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, shippingUtils.getRoundedDrawable(context3, flagDrawableId), (Drawable) null);
            Cache cache = Cache.INSTANCE;
            Context context4 = getContext();
            C19383o.m32796f(context4, ResponseConstants.CONTEXT);
            String searchScreenTitle = cache.getSearchScreenTitle(context4);
            Context context5 = getContext();
            int i2 = C17165R.string.paypal_checkout_add_shipping_address;
            if (C19383o.m32792b(searchScreenTitle, context5.getString(i2))) {
                Context context6 = getContext();
                C19383o.m32796f(context6, ResponseConstants.CONTEXT);
                Context context7 = getContext();
                int i3 = C17165R.string.paypal_checkout_start_typing;
                String string = context7.getString(i3);
                C19383o.m32796f(string, "context.getString(R.stri…al_checkout_start_typing)");
                shippingUtils.announceAccessibilityEvent(context6, string, (TextInputEditText) _$_findCachedViewById(i));
                Context context8 = getContext();
                C19383o.m32796f(context8, ResponseConstants.CONTEXT);
                Context context9 = getContext();
                C19383o.m32796f(context9, ResponseConstants.CONTEXT);
                cache.cacheCountryId(context8, ShippingUtils.getFlagCountry$default(shippingUtils, context9, (String) null, 2, (Object) null));
                Context context10 = getContext();
                C19383o.m32796f(context10, ResponseConstants.CONTEXT);
                if (!cache.getBlockNonDomesticShipping(context10)) {
                    ((TextInputEditText) _$_findCachedViewById(i)).setOnTouchListener(new C9057h(this, 1));
                }
                Context context11 = getContext();
                C19383o.m32796f(context11, ResponseConstants.CONTEXT);
                String string2 = getContext().getString(i2);
                C19383o.m32796f(string2, "context.getString(R.stri…out_add_shipping_address)");
                cache.cacheSearchScreenTitle(context11, string2);
                Context context12 = getContext();
                C19383o.m32796f(context12, ResponseConstants.CONTEXT);
                String string3 = getContext().getString(i3);
                C19383o.m32796f(string3, "context.getString(R.stri…al_checkout_start_typing)");
                cache.cacheHintTitle(context12, string3);
            } else if (C19383o.m32792b(searchScreenTitle, getContext().getString(C17165R.string.paypal_checkout_country))) {
                clearAdapter();
                Context context13 = getContext();
                C19383o.m32796f(context13, ResponseConstants.CONTEXT);
                ((TextInputLayout) _$_findCachedViewById(C17165R.C17167id.addressLayout)).setHint((CharSequence) cache.getHintTitle(context13));
                Context context14 = getContext();
                C19383o.m32796f(context14, ResponseConstants.CONTEXT);
                AddressAutoCompleteViewModel viewModel = getViewModel();
                Context context15 = getContext();
                C19383o.m32796f(context15, ResponseConstants.CONTEXT);
                cache.cacheCountryPosition(context14, viewModel.getCountryPositionOnList(ShippingUtils.getFlagCountry$default(shippingUtils, context15, (String) null, 2, (Object) null), cache.getCountries()));
                Context context16 = getContext();
                C19383o.m32796f(context16, ResponseConstants.CONTEXT);
                String string4 = getContext().getString(C17165R.string.paypal_checkout_select_country);
                C19383o.m32796f(string4, "context.getString(R.stri…_checkout_select_country)");
                ShippingUtils.announceAccessibilityEvent$default(shippingUtils, context16, string4, (View) null, 4, (Object) null);
                initializeCountryAdapter();
                scrollToCountry();
                ((TextInputEditText) _$_findCachedViewById(i)).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                PLog.impression$default(PEnums.TransitionName.SELECT_COUNTRY_SCREEN_RENDER, PEnums.Outcome.SHOWN, PEnums.EventCode.E625, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            }
            AddressAutoCompleteViewModel viewModel2 = getViewModel();
            Context context17 = getContext();
            C19383o.m32796f(context17, ResponseConstants.CONTEXT);
            viewModel2.createCountryList(context17);
            MainPaysheetViewModel mainPaysheetViewModel = getMainPaysheetViewModel();
            Context context18 = getContext();
            C19383o.m32796f(context18, ResponseConstants.CONTEXT);
            mainPaysheetViewModel.changeTitle(cache.getSearchScreenTitle(context18));
            ((TextInputEditText) _$_findCachedViewById(i)).requestFocus();
            TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(i);
            C19383o.m32796f(textInputEditText, "typeAddress");
            textInputEditText.addTextChangedListener(new C17176x4d211d91(this));
            return;
        }
        C19383o.m32805o("adapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-2  reason: not valid java name */
    public static final boolean m35183initViews$lambda2(PayPalNewShippingAddressSearchView payPalNewShippingAddressSearchView, View view, MotionEvent motionEvent) {
        C19383o.m32797g(payPalNewShippingAddressSearchView, "this$0");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int i = C17165R.C17167id.typeAddress;
        if (((TextInputEditText) payPalNewShippingAddressSearchView._$_findCachedViewById(i)).getCompoundDrawables()[2] == null || motionEvent.getRawX() < ((float) (((TextInputEditText) payPalNewShippingAddressSearchView._$_findCachedViewById(i)).getRight() - ((TextInputEditText) payPalNewShippingAddressSearchView._$_findCachedViewById(i)).getCompoundDrawables()[2].getBounds().width()))) {
            return false;
        }
        Cache cache = Cache.INSTANCE;
        Context context = payPalNewShippingAddressSearchView.getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String string = payPalNewShippingAddressSearchView.getContext().getString(C17165R.string.paypal_checkout_country);
        C19383o.m32796f(string, "context.getString(R.stri….paypal_checkout_country)");
        cache.cacheSearchScreenTitle(context, string);
        Context context2 = payPalNewShippingAddressSearchView.getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        String string2 = payPalNewShippingAddressSearchView.getContext().getString(C17165R.string.paypal_checkout_select_country);
        C19383o.m32796f(string2, "context.getString(R.stri…_checkout_select_country)");
        cache.cacheHintTitle(context2, string2);
        payPalNewShippingAddressSearchView.initViews();
        ShippingUtils.analyticsClick$default(ShippingUtils.INSTANCE, PEnums.TransitionName.SELECTED_COUNTRY_CLICKED, (String) null, "country", 2, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public final void initializeCountryAdapter() {
        Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
        if (text != null) {
            text.clear();
        }
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        this.adapter = new ShippingAdapter(context, new ArrayList(), Cache.INSTANCE.getCountries(), this, this, (String) null, 32, (DefaultConstructorMarker) null);
        AddressListView addressListView = (AddressListView) _$_findCachedViewById(C17165R.C17167id.newAddressRecyclerView);
        ShippingAdapter shippingAdapter = this.adapter;
        if (shippingAdapter != null) {
            addressListView.setAdapter(shippingAdapter);
        } else {
            C19383o.m32805o("adapter");
            throw null;
        }
    }

    private final void notifyCountryRecyclerView(ArrayList<Country> arrayList) {
        ShippingAdapter shippingAdapter = this.adapter;
        if (shippingAdapter != null) {
            shippingAdapter.setCountryList(arrayList);
            ShippingAdapter shippingAdapter2 = this.adapter;
            if (shippingAdapter2 != null) {
                shippingAdapter2.notifyDataSetChanged();
            } else {
                C19383o.m32805o("adapter");
                throw null;
            }
        } else {
            C19383o.m32805o("adapter");
            throw null;
        }
    }

    private final void notifyRecyclerView(String str, List<Suggestions> list) {
        list.add(new Suggestions((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null));
        ShippingAdapter shippingAdapter = this.adapter;
        if (shippingAdapter != null) {
            shippingAdapter.setAddressList(list);
            shippingAdapter.setQuery(str);
            shippingAdapter.notifyDataSetChanged();
            return;
        }
        C19383o.m32805o("adapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void scrollToCountry() {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        linearLayoutManager.mo11307k1(cache.getCountryPosition(context), getContext().getResources().getDimensionPixelSize(C17165R.dimen.scroll_offset));
    }

    /* access modifiers changed from: private */
    public final void selectData(CharSequence charSequence) {
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        if (C19383o.m32792b(cache.getSearchScreenTitle(context), getContext().getString(C17165R.string.paypal_checkout_country))) {
            getViewModel().fetchAddShippingCountriesResponse(charSequence.toString());
        } else {
            fetchShippingResponse(charSequence);
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
        getViewModel().getAutoCompleteAddShippingResponse().observe(this.componentActivity, new C6457b(this, 6));
        getViewModel().getAutoCompleteAddShippingPlaceIdResponse().observe(this.componentActivity, new C10077j(this, 5));
        getViewModel().getAutoCompleteAddShippingCountriesResponse().observe(this.componentActivity, new C9498g(this, 7));
        getViewModel().getCountryCacheCompletionFlag().observe(this.componentActivity, new C9499h(this, 2));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAddressSelected(String str, int i) {
        String str2 = str;
        C19383o.m32797g(str2, "id");
        ShippingAdapter shippingAdapter = this.adapter;
        String str3 = null;
        if (shippingAdapter == null) {
            C19383o.m32805o("adapter");
            throw null;
        } else if (i == shippingAdapter.getAddressList().size() - 1) {
            PEnums.TransitionName transitionName = PEnums.TransitionName.ADD_ADDRESS_MANUALLY_CLICKED;
            PEnums.Outcome outcome = PEnums.Outcome.CLICKED;
            PEnums.EventCode eventCode = PEnums.EventCode.E624;
            PEnums.StateName stateName = PEnums.StateName.ADD_SHIPPING;
            PLog.click$default(transitionName, outcome, eventCode, stateName, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            PLog.impression$default(PEnums.TransitionName.ADD_ADDRESS_MANUALLY_ENTERED, PEnums.Outcome.INTERACTED, PEnums.EventCode.E625, stateName, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            Cache cache = Cache.INSTANCE;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
            if (text != null) {
                str3 = text.toString();
            }
            if (str3 == null) {
                str3 = "";
            }
            cache.cacheSavedAddress(context, str3);
            goToReviewScreen();
        } else {
            AddressAutoCompleteViewModel viewModel = getViewModel();
            String language = this.locale.getLanguage();
            C19383o.m32796f(language, "locale.language");
            String country = this.locale.getCountry();
            C19383o.m32796f(country, "locale.country");
            viewModel.fetchAddShippingPlaceIdResponse(new AddressAutoCompletePlaceIdRequest(language, str2, country));
        }
    }

    public void onCountrySelected(String str, int i) {
        C19383o.m32797g(str, "id");
        ShippingUtils.INSTANCE.analyticsClick(PEnums.TransitionName.PROCESS_SELECTED_COUNTRY, str, "country");
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        cache.cacheCountryId(context, str);
        Context context2 = getContext();
        C19383o.m32796f(context2, ResponseConstants.CONTEXT);
        cache.cacheCountryPosition(context2, i);
        Context context3 = getContext();
        C19383o.m32796f(context3, ResponseConstants.CONTEXT);
        if (cache.isCacheComingFromReviewPage(context3)) {
            goToReviewScreen();
            Context context4 = getContext();
            C19383o.m32796f(context4, ResponseConstants.CONTEXT);
            cache.cacheComingFromReviewPage(context4, false);
            return;
        }
        Context context5 = getContext();
        C19383o.m32796f(context5, ResponseConstants.CONTEXT);
        String string = getContext().getString(C17165R.string.paypal_checkout_add_shipping_address);
        C19383o.m32796f(string, "context.getString(R.stri…out_add_shipping_address)");
        cache.cacheSearchScreenTitle(context5, string);
        Context context6 = getContext();
        C19383o.m32796f(context6, ResponseConstants.CONTEXT);
        String string2 = getContext().getString(C17165R.string.paypal_checkout_start_typing);
        C19383o.m32796f(string2, "context.getString(R.stri…al_checkout_start_typing)");
        cache.cacheHintTitle(context6, string2);
        Context context7 = getContext();
        C19383o.m32796f(context7, ResponseConstants.CONTEXT);
        ((TextInputLayout) _$_findCachedViewById(C17165R.C17167id.addressLayout)).setHint((CharSequence) cache.getHintTitle(context7));
        Editable text = ((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.typeAddress)).getText();
        if (text != null) {
            text.clear();
        }
        initViews();
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressSearchView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalNewShippingAddressViewListener payPalNewShippingAddressViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity2 = (ComponentActivity) context2;
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(AddressAutoCompleteViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity2), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity2), sdkComponentKt$activityViewModels$12);
                this.shippingAddresses = new ArrayList();
                this.locale = Locale.getDefault();
                this.componentActivity = getComponentActivity(context);
                View.inflate(context2, C17165R.C17169layout.paypal_new_shipping_address_search_layout, this);
                this.mPayPalNewShippingAddressViewListener = payPalNewShippingAddressViewListener;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
                int i2 = C17165R.C17167id.newAddressRecyclerView;
                ((AddressListView) _$_findCachedViewById(i2)).setLayoutManager(linearLayoutManager);
                this.layoutManager = linearLayoutManager;
                Drawable a = C6614a.m12981a(context2, C17165R.C17166drawable.divider);
                DividerItemDecorator dividerItemDecorator = a == null ? null : new DividerItemDecorator(a);
                if (dividerItemDecorator != null) {
                    ((AddressListView) _$_findCachedViewById(i2)).addItemDecoration(dividerItemDecorator);
                }
                initViews();
                initViewModelObservers();
                clearAdapter();
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
