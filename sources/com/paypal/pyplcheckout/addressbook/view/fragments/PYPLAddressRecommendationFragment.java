package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cardview.viewholders.C9203o0;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9258c;
import com.etsy.android.stylekit.views.C9050a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewModel;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewState;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.view.customviews.alertview.AlertToast;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.pojo.AddressValidation;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;
import p260v0.C8184a;

public final class PYPLAddressRecommendationFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLAddressRecommendationFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C2843a0<AddressRecommendationViewState> addressRecViewStateObserver = new C6469n(this, 5);
    private AddressRecommendationViewModel addressRecommendationViewModel;
    private View bottomScrollView;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> bottomSheetBehavior;
    public C2870k0.C2872b factory;
    private TextView inputAddressLineOne;
    private TextView inputAddressLineThree;
    private TextView inputAddressLineTwo;
    private MaterialCardView inputCardView;
    private TextView inputHeader;
    private MainPaysheetViewModel mainPaysheetViewModel;
    private ConstraintLayout parentLinearLayout;
    private TextView recAddressLineOne;
    private TextView recAddressLineThree;
    private TextView recAddressLineTwo;
    private MaterialCardView recCardView;
    private TextView recHeader;
    private PayPalActionButton saveAddressButton;
    private ProgressBar saveAddressProgressBar;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLAddressRecommendationFragment newInstance() {
            return new PYPLAddressRecommendationFragment();
        }
    }

    static {
        Class<PYPLAddressRecommendationFragment> cls = PYPLAddressRecommendationFragment.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: addressRecViewStateObserver$lambda-0  reason: not valid java name */
    public static final void m35186addressRecViewStateObserver$lambda0(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment, AddressRecommendationViewState addressRecommendationViewState) {
        C19383o.m32797g(pYPLAddressRecommendationFragment, "this$0");
        if (addressRecommendationViewState instanceof AddressRecommendationViewState.ShowInitialRecommendationState) {
            PayPalActionButton payPalActionButton = pYPLAddressRecommendationFragment.saveAddressButton;
            if (payPalActionButton != null) {
                payPalActionButton.setClickable(true);
            }
            AddressRecommendationViewState.ShowInitialRecommendationState showInitialRecommendationState = (AddressRecommendationViewState.ShowInitialRecommendationState) addressRecommendationViewState;
            pYPLAddressRecommendationFragment.setAddressInputFields(showInitialRecommendationState.getOriginalAddress());
            pYPLAddressRecommendationFragment.setAddressRecFields(showInitialRecommendationState.getReformattedAddress());
            pYPLAddressRecommendationFragment.setSaveAddressOnClick(showInitialRecommendationState.getOriginalAddress(), showInitialRecommendationState.getReformattedAddress());
        } else if (C19383o.m32792b(addressRecommendationViewState, AddressRecommendationViewState.ShowErrorState.INSTANCE)) {
            pYPLAddressRecommendationFragment.hideProgressBar();
            pYPLAddressRecommendationFragment.showAlertToast(new AlertToast.ErrorNoIcon((String) null, pYPLAddressRecommendationFragment.getResources().getString(C17165R.string.paypal_checkout_generic_network_error)));
        } else if (C19383o.m32792b(addressRecommendationViewState, AddressRecommendationViewState.ShowLoadingState.INSTANCE)) {
            pYPLAddressRecommendationFragment.showProgressBar();
        } else if (addressRecommendationViewState instanceof AddressRecommendationViewState.ShowSuccessfulAddAddressState) {
            PayPalActionButton payPalActionButton2 = pYPLAddressRecommendationFragment.saveAddressButton;
            if (payPalActionButton2 != null) {
                payPalActionButton2.setClickable(false);
            }
            MainPaysheetViewModel mainPaysheetViewModel2 = pYPLAddressRecommendationFragment.mainPaysheetViewModel;
            if (mainPaysheetViewModel2 != null) {
                mainPaysheetViewModel2.updateShippingAddressList(((AddressRecommendationViewState.ShowSuccessfulAddAddressState) addressRecommendationViewState).getUpdatedShippingAddressList());
                MainPaysheetViewModel mainPaysheetViewModel3 = pYPLAddressRecommendationFragment.mainPaysheetViewModel;
                if (mainPaysheetViewModel3 != null) {
                    mainPaysheetViewModel3.updateSelectedAddress(0);
                    pYPLAddressRecommendationFragment.showAlertToast(new AlertToast.SuccessNoIcon((String) null, pYPLAddressRecommendationFragment.getString(C17165R.string.paypal_checkout_add_shipping_address_success)));
                    ContentRouter contentRouter = ContentRouter.INSTANCE;
                    Context requireContext = pYPLAddressRecommendationFragment.requireContext();
                    C19383o.m32796f(requireContext, "requireContext()");
                    contentRouter.gotoFragment(requireContext, HomeFragment.TAG);
                    return;
                }
                C19383o.m32805o("mainPaysheetViewModel");
                throw null;
            }
            C19383o.m32805o("mainPaysheetViewModel");
            throw null;
        }
    }

    private final void bindViews(View view) {
        this.bottomScrollView = view.findViewById(C17165R.C17167id.scrollView_address_confirmation);
        this.parentLinearLayout = (ConstraintLayout) view.findViewById(C17165R.C17167id.linearLayout_recommendation_container);
        this.recCardView = (MaterialCardView) view.findViewById(C17165R.C17167id.cardView_rec_address_container);
        this.recHeader = (TextView) view.findViewById(C17165R.C17167id.textView_rec_address_header);
        this.recAddressLineOne = (TextView) view.findViewById(C17165R.C17167id.textView_rec_address_line_1);
        this.recAddressLineTwo = (TextView) view.findViewById(C17165R.C17167id.textView_rec_address_line_2);
        this.recAddressLineThree = (TextView) view.findViewById(C17165R.C17167id.textView_rec_address_line_3);
        this.inputCardView = (MaterialCardView) view.findViewById(C17165R.C17167id.cardView_input_address_container);
        this.inputHeader = (TextView) view.findViewById(C17165R.C17167id.textView_input_address_header);
        this.inputAddressLineOne = (TextView) view.findViewById(C17165R.C17167id.textView_input_address_line_1);
        this.inputAddressLineTwo = (TextView) view.findViewById(C17165R.C17167id.textView_input_address_line_2);
        this.inputAddressLineThree = (TextView) view.findViewById(C17165R.C17167id.textView_input_address_line_3);
        this.saveAddressButton = (PayPalActionButton) view.findViewById(C17165R.C17167id.button_save_address);
        this.saveAddressProgressBar = (ProgressBar) view.findViewById(C17165R.C17167id.progressBar_save_address);
    }

    private final void checkInputAddressFields() {
        MaterialCardView materialCardView = this.inputCardView;
        if (materialCardView != null) {
            materialCardView.setChecked(true);
        }
        Context requireContext = requireContext();
        int i = C17165R.color.add_card_blue;
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(requireContext, i);
        MaterialCardView materialCardView2 = this.inputCardView;
        if (materialCardView2 != null) {
            materialCardView2.setStrokeColor(C8184a.C8188d.m16468a(requireContext(), i));
        }
        TextView textView = this.inputHeader;
        if (textView != null) {
            textView.setTextColor(a);
        }
        TextView textView2 = this.inputAddressLineOne;
        if (textView2 != null) {
            textView2.setTextColor(a);
        }
        TextView textView3 = this.inputAddressLineTwo;
        if (textView3 != null) {
            textView3.setTextColor(a);
        }
        TextView textView4 = this.inputAddressLineThree;
        if (textView4 != null) {
            textView4.setTextColor(a);
        }
    }

    private final void checkRecAddressFields() {
        MaterialCardView materialCardView = this.recCardView;
        if (materialCardView != null) {
            materialCardView.setChecked(true);
        }
        Context requireContext = requireContext();
        int i = C17165R.color.add_card_blue;
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(requireContext, i);
        MaterialCardView materialCardView2 = this.recCardView;
        if (materialCardView2 != null) {
            materialCardView2.setStrokeColor(C8184a.C8188d.m16468a(requireContext(), i));
        }
        TextView textView = this.recHeader;
        if (textView != null) {
            textView.setTextColor(a);
        }
        TextView textView2 = this.recAddressLineOne;
        if (textView2 != null) {
            textView2.setTextColor(a);
        }
        TextView textView3 = this.recAddressLineTwo;
        if (textView3 != null) {
            textView3.setTextColor(a);
        }
        TextView textView4 = this.recAddressLineThree;
        if (textView4 != null) {
            textView4.setTextColor(a);
        }
    }

    private final String formatLineThree(PortableShippingAddressRequest portableShippingAddressRequest) {
        return C0048b.m164c(portableShippingAddressRequest.getAdminArea2(), ", ", portableShippingAddressRequest.getAdminArea1(), " ", portableShippingAddressRequest.getPostalCode());
    }

    private final void hideProgressBar() {
        PayPalActionButton payPalActionButton = this.saveAddressButton;
        if (payPalActionButton != null) {
            payPalActionButton.setClickable(true);
        }
        ProgressBar progressBar = this.saveAddressProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        PayPalActionButton payPalActionButton2 = this.saveAddressButton;
        if (payPalActionButton2 != null) {
            payPalActionButton2.updateButtonText(getResources().getString(C17165R.string.paypal_checkout_new_address_save));
        }
    }

    private final void initCardViews() {
        MaterialCardView materialCardView = this.recCardView;
        if (materialCardView != null) {
            materialCardView.setOnClickListener(new C9258c(this, 2));
        }
        MaterialCardView materialCardView2 = this.inputCardView;
        if (materialCardView2 != null) {
            materialCardView2.setOnClickListener(new C9050a(this, 3));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initCardViews$lambda-6  reason: not valid java name */
    public static final void m35187initCardViews$lambda6(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment, View view) {
        C19383o.m32797g(pYPLAddressRecommendationFragment, "this$0");
        MaterialCardView materialCardView = pYPLAddressRecommendationFragment.recCardView;
        if (materialCardView != null) {
            if (!materialCardView.isChecked()) {
                pYPLAddressRecommendationFragment.uncheckInputAddressFields();
                pYPLAddressRecommendationFragment.checkRecAddressFields();
                return;
            }
            pYPLAddressRecommendationFragment.uncheckRecAddressFields();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initCardViews$lambda-8  reason: not valid java name */
    public static final void m35188initCardViews$lambda8(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment, View view) {
        C19383o.m32797g(pYPLAddressRecommendationFragment, "this$0");
        MaterialCardView materialCardView = pYPLAddressRecommendationFragment.inputCardView;
        if (materialCardView != null) {
            if (!materialCardView.isChecked()) {
                pYPLAddressRecommendationFragment.uncheckRecAddressFields();
                pYPLAddressRecommendationFragment.checkInputAddressFields();
                return;
            }
            pYPLAddressRecommendationFragment.uncheckInputAddressFields();
        }
    }

    private final void initSaveAddressButton() {
        PayPalActionButton payPalActionButton = this.saveAddressButton;
        if (payPalActionButton != null) {
            payPalActionButton.updateButtonText(getResources().getString(C17165R.string.paypal_checkout_new_address_save));
        }
    }

    public static final PYPLAddressRecommendationFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setAddressInputFields(PortableShippingAddressRequest portableShippingAddressRequest) {
        TextView textView = this.inputAddressLineOne;
        if (textView != null) {
            textView.setText(portableShippingAddressRequest.getAddressLine1());
        }
        String addressLine2 = portableShippingAddressRequest.getAddressLine2();
        if (!(addressLine2 == null || addressLine2.length() == 0)) {
            TextView textView2 = this.inputAddressLineTwo;
            if (textView2 != null) {
                textView2.setText(portableShippingAddressRequest.getAddressLine2());
            }
        } else {
            TextView textView3 = this.inputAddressLineTwo;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        TextView textView4 = this.inputAddressLineThree;
        if (textView4 != null) {
            textView4.setText(formatLineThree(portableShippingAddressRequest));
        }
    }

    private final void setAddressRecFields(AddressValidation addressValidation) {
        TextView textView = this.recAddressLineOne;
        if (textView != null) {
            textView.setText(addressValidation.getAddressLine1());
        }
        String addressLine2 = addressValidation.getAddressLine2();
        if (!(addressLine2 == null || addressLine2.length() == 0)) {
            TextView textView2 = this.recAddressLineTwo;
            if (textView2 != null) {
                textView2.setText(addressValidation.getAddressLine2());
            }
        } else {
            TextView textView3 = this.recAddressLineTwo;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        TextView textView4 = this.recAddressLineThree;
        if (textView4 != null) {
            textView4.setText(formatLineThree(addressValidation));
        }
    }

    private final void setSaveAddressOnClick(PortableShippingAddressRequest portableShippingAddressRequest, AddressValidation addressValidation) {
        PayPalActionButton payPalActionButton = this.saveAddressButton;
        if (payPalActionButton != null) {
            payPalActionButton.setOnClickListener(new C9203o0(this, 1, portableShippingAddressRequest, addressValidation));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setSaveAddressOnClick$lambda-3  reason: not valid java name */
    public static final void m35189setSaveAddressOnClick$lambda3(PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment, PortableShippingAddressRequest portableShippingAddressRequest, AddressValidation addressValidation, View view) {
        MaterialCardView materialCardView;
        PYPLAddressRecommendationFragment pYPLAddressRecommendationFragment2 = pYPLAddressRecommendationFragment;
        PortableShippingAddressRequest portableShippingAddressRequest2 = portableShippingAddressRequest;
        C19383o.m32797g(pYPLAddressRecommendationFragment2, "this$0");
        C19383o.m32797g(portableShippingAddressRequest2, "$originalAddress");
        C19383o.m32797g(addressValidation, "$reformattedAddress");
        MaterialCardView materialCardView2 = pYPLAddressRecommendationFragment2.recCardView;
        if (materialCardView2 != null && (materialCardView = pYPLAddressRecommendationFragment2.inputCardView) != null) {
            if (materialCardView2.isChecked()) {
                String givenName = portableShippingAddressRequest.getGivenName();
                String familyName = portableShippingAddressRequest.getFamilyName();
                String countryCode = addressValidation.getCountryCode();
                C19383o.m32794d(countryCode);
                PortableShippingAddressRequest portableShippingAddressRequest3 = new PortableShippingAddressRequest(givenName, familyName, countryCode, (Boolean) null, addressValidation.getAddressLine1(), addressValidation.getAddressLine2(), (String) null, (String) null, (String) null, addressValidation.getAdminArea2(), addressValidation.getAdminArea1(), addressValidation.getPostalCode());
                pYPLAddressRecommendationFragment.showProgressBar();
                AddressRecommendationViewModel addressRecommendationViewModel2 = pYPLAddressRecommendationFragment2.addressRecommendationViewModel;
                if (addressRecommendationViewModel2 != null) {
                    addressRecommendationViewModel2.addShippingAddress(portableShippingAddressRequest3);
                } else {
                    C19383o.m32805o("addressRecommendationViewModel");
                    throw null;
                }
            } else if (materialCardView.isChecked()) {
                pYPLAddressRecommendationFragment.showProgressBar();
                AddressRecommendationViewModel addressRecommendationViewModel3 = pYPLAddressRecommendationFragment2.addressRecommendationViewModel;
                if (addressRecommendationViewModel3 != null) {
                    addressRecommendationViewModel3.addShippingAddress(portableShippingAddressRequest2);
                } else {
                    C19383o.m32805o("addressRecommendationViewModel");
                    throw null;
                }
            } else {
                Toast.makeText(pYPLAddressRecommendationFragment.requireContext(), pYPLAddressRecommendationFragment.getResources().getString(C17165R.string.paypal_checkout_shipping_address), 1).show();
            }
        }
    }

    private final void setUpBottomSheetBehaviour() {
        View view = this.bottomScrollView;
        if (view != null) {
            this.bottomSheetBehavior = AutoCloseBottomSheetBehavior.Companion.from$default(AutoCloseBottomSheetBehavior.Companion, view, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setHideable(false);
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.bottomSheetBehavior;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.addBottomSheetCallback(new PYPLAddressRecommendationFragment$setUpBottomSheetBehaviour$2(this));
                BottomSheetBehavior<?> bottomSheetBehavior4 = this.bottomSheetBehavior;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.setState(3);
                } else {
                    C19383o.m32805o("bottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("bottomSheetBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("bottomSheetBehavior");
            throw null;
        }
    }

    private final void showProgressBar() {
        PayPalActionButton payPalActionButton = this.saveAddressButton;
        if (payPalActionButton != null) {
            payPalActionButton.setClickable(false);
        }
        ProgressBar progressBar = this.saveAddressProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        PayPalActionButton payPalActionButton2 = this.saveAddressButton;
        if (payPalActionButton2 != null) {
            payPalActionButton2.updateButtonText("");
        }
    }

    private final void unbindViews() {
        this.bottomScrollView = null;
        this.parentLinearLayout = null;
        this.recCardView = null;
        this.recHeader = null;
        this.recAddressLineOne = null;
        this.recAddressLineTwo = null;
        this.recAddressLineThree = null;
        this.inputHeader = null;
        this.inputAddressLineOne = null;
        this.inputAddressLineTwo = null;
        this.inputAddressLineThree = null;
        this.saveAddressButton = null;
        this.saveAddressProgressBar = null;
    }

    private final void uncheckInputAddressFields() {
        MaterialCardView materialCardView = this.inputCardView;
        if (materialCardView != null) {
            materialCardView.setChecked(false);
        }
        Context requireContext = requireContext();
        int i = C17165R.color.black_90;
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(requireContext, i);
        MaterialCardView materialCardView2 = this.inputCardView;
        if (materialCardView2 != null) {
            materialCardView2.setStrokeColor(C8184a.C8188d.m16468a(requireContext(), 17170445));
        }
        TextView textView = this.inputHeader;
        if (textView != null) {
            textView.setTextColor(a);
        }
        TextView textView2 = this.inputAddressLineOne;
        if (textView2 != null) {
            textView2.setTextColor(a);
        }
        TextView textView3 = this.inputAddressLineTwo;
        if (textView3 != null) {
            textView3.setTextColor(a);
        }
        TextView textView4 = this.inputAddressLineThree;
        if (textView4 != null) {
            textView4.setTextColor(a);
        }
    }

    private final void uncheckRecAddressFields() {
        MaterialCardView materialCardView = this.recCardView;
        if (materialCardView != null) {
            materialCardView.setChecked(false);
        }
        Context requireContext = requireContext();
        int i = C17165R.color.black_90;
        Object obj = C8184a.f17966a;
        int a = C8184a.C8188d.m16468a(requireContext, i);
        MaterialCardView materialCardView2 = this.recCardView;
        if (materialCardView2 != null) {
            materialCardView2.setStrokeColor(C8184a.C8188d.m16468a(requireContext(), 17170445));
        }
        TextView textView = this.recHeader;
        if (textView != null) {
            textView.setTextColor(a);
        }
        TextView textView2 = this.recAddressLineOne;
        if (textView2 != null) {
            textView2.setTextColor(a);
        }
        TextView textView3 = this.recAddressLineTwo;
        if (textView3 != null) {
            textView3.setTextColor(a);
        }
        TextView textView4 = this.recAddressLineThree;
        if (textView4 != null) {
            textView4.setTextColor(a);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C2870k0.C2872b getFactory() {
        C2870k0.C2872b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("factory");
        throw null;
    }

    public void onAttach(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        super.onAttach(context);
        SdkComponentKt.inject(this);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_address_recommendation_fragment, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        initCardViews();
        initSaveAddressButton();
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        unbindViews();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        setUpBottomSheetBehaviour();
        this.addressRecommendationViewModel = (AddressRecommendationViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(AddressRecommendationViewModel.class);
        this.mainPaysheetViewModel = (MainPaysheetViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(MainPaysheetViewModel.class);
        AddressRecommendationViewModel addressRecommendationViewModel2 = this.addressRecommendationViewModel;
        if (addressRecommendationViewModel2 != null) {
            addressRecommendationViewModel2.getAddressRecommendationViewState().observe(getViewLifecycleOwner(), this.addressRecViewStateObserver);
        } else {
            C19383o.m32805o("addressRecommendationViewModel");
            throw null;
        }
    }

    public final void setFactory(C2870k0.C2872b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.factory = bVar;
    }

    private final String formatLineThree(AddressValidation addressValidation) {
        return C0048b.m164c(addressValidation.getAdminArea2(), ", ", addressValidation.getAdminArea1(), " ", addressValidation.getPostalCode());
    }
}
