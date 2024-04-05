package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cart.C9334s;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9260e;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.ApplyCouponBottomSheetNavigationKey;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.stylekit.views.ProgressButton;
import com.etsy.android.uikit.p331ui.core.TrackingBottomSheetDialogFragment;
import com.etsy.android.util.C12061r;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.SingleDoFinally;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p440s9.C13366a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment */
public final class ApplyCouponBottomSheetFragment extends TrackingBottomSheetDialogFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ServerDrivenAction action;
    private C9334s actionSpecs;
    private ProgressButton applyButton;
    /* access modifiers changed from: private */
    public C19857l<? super CartPage, C19394m> couponAppliedListener;
    private CollageTextInput couponTextInput;
    private C19857l<? super String, C19394m> requestSignInForCouponApplyListener;
    private TextView titleTextView;
    public C9260e viewModel;

    private final void applyCoupon(ServerDrivenAction serverDrivenAction, C9334s sVar) {
        if (serverDrivenAction != null && sVar != null) {
            C9260e viewModel2 = getViewModel();
            viewModel2.getClass();
            if (viewModel2.f20454g.getValue() == null) {
                Boolean value = viewModel2.f20452e.getValue();
                Boolean bool = Boolean.TRUE;
                if (!C19383o.m32792b(value, bool)) {
                    viewModel2.f20452e.setValue(bool);
                    serverDrivenAction.addParam("coupon_code", viewModel2.f20460m);
                    ConsumerSingleObserver e = SubscribersKt.m32500e(new SingleDoFinally(C0391c.m1056b(viewModel2.f20449b, C0326j.m860e(viewModel2.f20449b, viewModel2.f20450c.mo31850b(sVar))), new C9259d(viewModel2, 0)), new ApplyCouponBottomSheetViewModel$applyCoupon$2(viewModel2), new ApplyCouponBottomSheetViewModel$applyCoupon$3(viewModel2));
                    C7091a aVar = viewModel2.f20461n;
                    C19383o.m32798h(aVar, "compositeDisposable");
                    aVar.mo19403b(e);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateDialog$lambda-1  reason: not valid java name */
    public static final void m34922onCreateDialog$lambda1(BottomSheetDialog bottomSheetDialog, DialogInterface dialogInterface) {
        C19383o.m32797g(bottomSheetDialog, "$dialog");
        bottomSheetDialog.getBehavior().setState(3);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m34923onViewCreated$lambda2(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment, View view) {
        C19383o.m32797g(applyCouponBottomSheetFragment, "this$0");
        C8703p analyticsContext = applyCouponBottomSheetFragment.getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.mo21333d("etsy_coupon_apply_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        }
        applyCouponBottomSheetFragment.applyCoupon(applyCouponBottomSheetFragment.action, applyCouponBottomSheetFragment.actionSpecs);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m34924onViewCreated$lambda3(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment, Boolean bool) {
        C19383o.m32797g(applyCouponBottomSheetFragment, "this$0");
        C19383o.m32796f(bool, "it");
        applyCouponBottomSheetFragment.setLoadingState(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m34925onViewCreated$lambda4(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment, C9260e.C9261a aVar) {
        C19383o.m32797g(applyCouponBottomSheetFragment, "this$0");
        if (aVar instanceof C9260e.C9261a.C9262a) {
            CollageTextInput collageTextInput = applyCouponBottomSheetFragment.couponTextInput;
            if (collageTextInput != null) {
                collageTextInput.setErrorText(((C9260e.C9261a.C9262a) aVar).f20462a);
            } else {
                C19383o.m32805o("couponTextInput");
                throw null;
            }
        } else if (aVar instanceof C9260e.C9261a.C9263b) {
            C19857l<? super String, C19394m> lVar = applyCouponBottomSheetFragment.requestSignInForCouponApplyListener;
            if (lVar != null) {
                C19394m invoke = lVar.invoke(((C9260e.C9261a.C9263b) aVar).f20463a);
            }
            applyCouponBottomSheetFragment.dismiss();
        }
    }

    private final void setLoadingState(boolean z) {
        if (z) {
            ProgressButton progressButton = this.applyButton;
            if (progressButton != null) {
                progressButton.showLoading();
                ProgressButton progressButton2 = this.applyButton;
                if (progressButton2 != null) {
                    progressButton2.setContentDescription(getString(R.string.coupon_code_validating));
                } else {
                    C19383o.m32805o("applyButton");
                    throw null;
                }
            } else {
                C19383o.m32805o("applyButton");
                throw null;
            }
        } else {
            ProgressButton progressButton3 = this.applyButton;
            if (progressButton3 != null) {
                progressButton3.hideLoading();
                ProgressButton progressButton4 = this.applyButton;
                if (progressButton4 != null) {
                    progressButton4.setText(requireArguments().getString(ApplyCouponBottomSheetNavigationKey.PARAM_APPLY_BUTTON_TEXT));
                    ProgressButton progressButton5 = this.applyButton;
                    if (progressButton5 != null) {
                        progressButton5.setContentDescription("");
                    } else {
                        C19383o.m32805o("applyButton");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("applyButton");
                    throw null;
                }
            } else {
                C19383o.m32805o("applyButton");
                throw null;
            }
        }
    }

    private final void setUpTextInput() {
        CollageTextInput collageTextInput = this.couponTextInput;
        if (collageTextInput != null) {
            collageTextInput.setLabelText(requireArguments().getString(ApplyCouponBottomSheetNavigationKey.PARAM_INPUT_LABEL_TEXT));
            collageTextInput.setHelperText(requireArguments().getString(ApplyCouponBottomSheetNavigationKey.PARAM_INPUT_HELPER_TEXT));
            collageTextInput.setOnEditorActionListener(new C9256a(this));
            TextinputKt.m18959a(collageTextInput, new ApplyCouponBottomSheetFragment$setUpTextInput$1$2(this));
            collageTextInput.requestFocus();
            return;
        }
        C19383o.m32805o("couponTextInput");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpTextInput$lambda-6$lambda-5  reason: not valid java name */
    public static final boolean m34926setUpTextInput$lambda6$lambda5(ApplyCouponBottomSheetFragment applyCouponBottomSheetFragment, TextView textView, int i, KeyEvent keyEvent) {
        C19383o.m32797g(applyCouponBottomSheetFragment, "this$0");
        applyCouponBottomSheetFragment.applyCoupon(applyCouponBottomSheetFragment.action, applyCouponBottomSheetFragment.actionSpecs);
        return true;
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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C9260e getViewModel() {
        C9260e eVar = this.viewModel;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetNoFloating);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C19383o.m32795e(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) onCreateDialog;
        bottomSheetDialog.setOnShowListener(new C9257b(bottomSheetDialog, 0));
        return bottomSheetDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_apply_coupon_bottom_sheet, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.apply_coupon_title);
        C19383o.m32796f(findViewById, "it.findViewById(R.id.apply_coupon_title)");
        this.titleTextView = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.apply_coupon_text_input);
        C19383o.m32796f(findViewById2, "it.findViewById(R.id.apply_coupon_text_input)");
        this.couponTextInput = (CollageTextInput) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.apply_coupon_button);
        C19383o.m32796f(findViewById3, "it.findViewById(R.id.apply_coupon_button)");
        this.applyButton = (ProgressButton) findViewById3;
        return inflate;
    }

    public void onDestroy() {
        this.couponAppliedListener = null;
        super.onDestroy();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setText(requireArguments().getString(ApplyCouponBottomSheetNavigationKey.PARAM_TITLE_TEXT));
            setUpTextInput();
            ProgressButton progressButton = this.applyButton;
            if (progressButton != null) {
                progressButton.setText(requireArguments().getString(ApplyCouponBottomSheetNavigationKey.PARAM_APPLY_BUTTON_TEXT));
                ProgressButton progressButton2 = this.applyButton;
                if (progressButton2 != null) {
                    progressButton2.setOnClickListener(new C9258c(this, 0));
                    TextView textView2 = this.titleTextView;
                    if (textView2 != null) {
                        ViewExtensions.m12869m(textView2);
                        CollageTextInput collageTextInput = this.couponTextInput;
                        if (collageTextInput != null) {
                            ViewExtensions.m12869m(collageTextInput);
                            ProgressButton progressButton3 = this.applyButton;
                            if (progressButton3 != null) {
                                ViewExtensions.m12869m(progressButton3);
                                getViewModel().f20453f.observe(getViewLifecycleOwner(), new C6468m(this, 1));
                                getViewModel().f20455h.observe(getViewLifecycleOwner(), new C6469n(this, 1));
                                getViewModel().f20457j.observe(getViewLifecycleOwner(), new C12061r(new ApplyCouponBottomSheetFragment$onViewCreated$4(this)));
                                getViewModel().f20459l.observe(getViewLifecycleOwner(), new C12061r(new ApplyCouponBottomSheetFragment$onViewCreated$5(this)));
                                return;
                            }
                            C19383o.m32805o("applyButton");
                            throw null;
                        }
                        C19383o.m32805o("couponTextInput");
                        throw null;
                    }
                    C19383o.m32805o("titleTextView");
                    throw null;
                }
                C19383o.m32805o("applyButton");
                throw null;
            }
            C19383o.m32805o("applyButton");
            throw null;
        }
        C19383o.m32805o("titleTextView");
        throw null;
    }

    public final void setActionParams(ServerDrivenAction serverDrivenAction, C9334s sVar) {
        C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
        C19383o.m32797g(sVar, "specs");
        this.action = serverDrivenAction;
        this.actionSpecs = sVar;
    }

    public final void setOnCouponAppliedListener(C19857l<? super CartPage, C19394m> lVar) {
        C19383o.m32797g(lVar, "onCouponApplied");
        this.couponAppliedListener = lVar;
    }

    public final void setOnRequestSignInForCouponApplyListener(C19857l<? super String, C19394m> lVar) {
        C19383o.m32797g(lVar, "onRequestSignIn");
        this.requestSignInForCouponApplyListener = lVar;
    }

    public final void setViewModel(C9260e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.viewModel = eVar;
    }
}
