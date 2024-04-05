package com.braze;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C2801z;
import androidx.preference.Preference;
import com.etsy.android.config.ConfigPreferencesHelper;
import com.etsy.android.p327ui.cart.MultiShopCartFragment;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder;
import com.etsy.android.p327ui.user.profile.UserProfileFragment;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6573i;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.SnappingRecyclerView;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.SDKInterceptFinishListener;
import com.paypal.pyplcheckout.interfaces.Status;
import com.paypal.pyplcheckout.utils.DialogMaker;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p120gh.C6898a;
import p466vc.C13597g;
import p605kk.C18119c;
import p605kk.C18123g;

/* renamed from: com.braze.a */
public final /* synthetic */ class C5380a implements C18119c, SDKInterceptFinishListener, Preference.C3010d, StructuredShopPoliciesView.C11958c, C2801z, C6898a.C6899a, DialogMaker.PositiveClickListener, SnappingRecyclerView.OnViewDismissedListener {

    /* renamed from: b */
    public final /* synthetic */ Object f11527b;

    public /* synthetic */ C5380a(Object obj) {
        this.f11527b = obj;
    }

    /* renamed from: a */
    public Uri mo15805a(Uri uri) {
        String str = (String) this.f11527b;
        C19383o.m32797g(uri, "brazeEndpoint");
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String encodedAuthority = parse.getEncodedAuthority();
        Uri.Builder buildUpon = uri.buildUpon();
        boolean z = false;
        if (!(scheme == null || C19457k.m33020X0(scheme))) {
            if (encodedAuthority == null || C19457k.m33020X0(encodedAuthority)) {
                z = true;
            }
            if (!z) {
                buildUpon.encodedAuthority(encodedAuthority);
                buildUpon.scheme(scheme);
                return buildUpon.build();
            }
        }
        return buildUpon.encodedAuthority(str).build();
    }

    /* renamed from: b */
    public void mo15806b(Intent intent, Throwable th) {
        HomePagerFragment.m34999checkButtonDeepLink$lambda17((HomePagerFragment) this.f11527b, intent, th);
    }

    /* renamed from: c */
    public void mo10428c(Bundle bundle, String str) {
        ((UserProfileFragment) this.f11527b).lambda$onViewCreated$1(str, bundle);
    }

    /* renamed from: e */
    public Object mo12018e() {
        ((C6573i) this.f11527b).f14527i.mo18776a();
        return null;
    }

    /* renamed from: g */
    public boolean mo412g(Preference preference) {
        return ConfigPreferencesHelper.m34844setUpRefreshServerConfigPreference$lambda7((ConfigPreferencesHelper) this.f11527b, preference);
    }

    public void onComplete(C18123g gVar) {
        MultiShopCartFragment.m34913checkGooglePayReady$lambda7((MultiShopCartFragment) this.f11527b, gVar);
    }

    public void onDismissed(View view, int i) {
        PayPalSnappingRecyclerView.m35353_init_$lambda8((PayPalSnappingRecyclerView) this.f11527b, view, i);
    }

    public void onExpanded() {
        ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder = (ShippingAndPoliciesPanelViewHolder) this.f11527b;
        int i = ShippingAndPoliciesPanelViewHolder.f23196x;
        C19383o.m32797g(shippingAndPoliciesPanelViewHolder, "this$0");
        shippingAndPoliciesPanelViewHolder.f23197b.mo38043a(C13597g.C13701o4.f30210a);
    }

    public void onPositiveClick(DialogMaker dialogMaker) {
        PayPalAddressBookInfoView.m35165setupButton$lambda6$lambda4((PayPalAddressBookInfoView) this.f11527b, dialogMaker);
    }

    public void onSDKInterceptComplete(Status status) {
        MainPaysheetViewModel.lambda$new$1((Events) this.f11527b, status);
    }
}
