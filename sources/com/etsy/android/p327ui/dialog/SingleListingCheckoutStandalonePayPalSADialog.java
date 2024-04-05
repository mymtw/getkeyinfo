package com.etsy.android.p327ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.platform.C1830f0;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.EtsyFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p356ge.C12788a;
import p392lf.C13020a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.dialog.SingleListingCheckoutStandalonePayPalSADialog */
public final class SingleListingCheckoutStandalonePayPalSADialog extends EtsyFragment implements C13020a, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private DialogHeaderPresenter dialogHeaderPresenter;
    private C9727c presenter;

    /* access modifiers changed from: private */
    public final void dismiss() {
        C9727c cVar = this.presenter;
        if (cVar != null) {
            new C1830f0(cVar.f21528a.getAnalyticsContext()).mo7215g(cVar.f21531d, cVar.f21532e);
        }
        C12788a.m20426e(getActivity());
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m34967onCreateView$lambda0(View view) {
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

    public boolean handleBackPressed() {
        dismiss();
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_single_listing_checkout_standalone_paypal_single_activity, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        DialogHeaderPresenter dialogHeaderPresenter2 = new DialogHeaderPresenter(inflate);
        this.dialogHeaderPresenter = dialogHeaderPresenter2;
        dialogHeaderPresenter2.f21512a.setText(getString(R.string.dialog_title_choose_payment));
        DialogHeaderPresenter dialogHeaderPresenter3 = this.dialogHeaderPresenter;
        C19383o.m32794d(dialogHeaderPresenter3);
        ViewExtensions.m12869m(dialogHeaderPresenter3.f21514c);
        ViewExtensions.m12860d(dialogHeaderPresenter3.f21513b);
        DialogHeaderPresenter dialogHeaderPresenter4 = this.dialogHeaderPresenter;
        C19383o.m32794d(dialogHeaderPresenter4);
        ViewExtensions.m12866j(dialogHeaderPresenter4.f21514c, new SingleListingCheckoutStandalonePayPalSADialog$onCreateView$1(this));
        Bundle requireArguments = requireArguments();
        C19383o.m32796f(requireArguments, "requireArguments()");
        C9727c cVar = new C9727c(this, requireArguments, new SingleListingCheckoutStandalonePayPalSADialog$onCreateView$2(this));
        this.presenter = cVar;
        View findViewById = inflate.findViewById(R.id.single_listing_checkout_paypal_checkout);
        C19383o.m32796f(findViewById, "view.findViewById<View>(…checkout_paypal_checkout)");
        ViewExtensions.m12866j(findViewById, new SingleListingCheckoutStandalonePayPalPresenter$buildView$1(cVar));
        inflate.findViewById(R.id.linear_layout).setOnClickListener(new C9728d());
        View findViewById2 = inflate.findViewById(R.id.constraint_layout);
        C19383o.m32796f(findViewById2, "view.findViewById<View>(R.id.constraint_layout)");
        ViewExtensions.m12866j(findViewById2, new SingleListingCheckoutStandalonePayPalSADialog$onCreateView$4(this));
        return inflate;
    }

    public void onDestroyView() {
        this.presenter = null;
        this.dialogHeaderPresenter = null;
        super.onDestroyView();
    }

    public void onStart() {
        super.onStart();
        C15588c1.m25340p0(getView());
    }
}
