package com.etsy.android.p327ui.listing.p329ui.buyitnow.summary;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6105w;
import com.bumptech.glide.request.C6121a;
import com.bumptech.glide.request.C6128g;
import com.etsy.android.R;
import com.etsy.android.extensions.SpanExtensions$trackingClick$1;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.p327ui.conversation.details.ccm.C9500i;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10368a;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowCheckoutContainerFragment;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.SubtotalLineItem;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p435rb.C13350a;
import p440s9.C13366a;
import p455u9.C13448b;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.summary.SummaryFragment */
public final class SummaryFragment extends TrackingBaseFragment implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    private final void bind(UiState.Summary summary) {
        bindListingDetails(summary);
        bindShippingMethod(summary);
        bindShippingAddress(summary);
        bindPaymentMethod(summary);
        bindTotal(summary);
        bindCheckoutButton(summary);
        bindTermsAndConditions(summary);
    }

    private final void bindCheckoutButton(UiState.Summary summary) {
        Button button = (Button) requireView().findViewById(R.id.checkout_button);
        button.setText(summary.getCheckoutButtonLabel());
        button.setContentDescription(summary.getCheckoutButtonLabel());
        ViewExtensions.m12869m(button);
        ViewExtensions.m12866j(button, new SummaryFragment$bindCheckoutButton$1$1$1(this));
    }

    private final void bindListingDetails(UiState.Summary summary) {
        View requireView = requireView();
        ImageView imageView = (ImageView) requireView.findViewById(R.id.listing_image);
        C13448b load = C0114h.m272C0(imageView).load(summary.getListingImageUrl());
        C19383o.m32796f(load, "with(this).load(summary.listingImageUrl)");
        int dimensionPixelOffset = imageView.getResources().getDimensionPixelOffset(R.dimen.cart_listing_image_corner_radius);
        C6121a F = new C6128g().mo17143F(new C6085i(), new C6105w(dimensionPixelOffset));
        C19383o.m32796f(F, "requestOptions.transform…dCorners(roundingRadius))");
        load.mo16829a((C6128g) F);
        load.mo16816M(imageView);
        ((TextView) requireView.findViewById(R.id.listing_title)).setText(summary.getListingTitle());
        TextView textView = (TextView) requireView.findViewById(R.id.listing_quantity);
        if (summary.getListingQuantity() <= 1) {
            ViewExtensions.m12860d(textView);
        } else {
            textView.setText(String.valueOf(summary.getListingQuantity()));
            textView.setContentDescription(getString(R.string.listing_quantity_content_description, String.valueOf(summary.getListingQuantity())));
            ViewExtensions.m12869m(textView);
        }
        TextView textView2 = (TextView) requireView.findViewById(R.id.listing_variation1);
        textView2.setText(summary.getListingVariation1());
        ViewExtensions.m12870n(textView2, new SummaryFragment$bindListingDetails$1$3$1(summary));
        TextView textView3 = (TextView) requireView.findViewById(R.id.listing_variation2);
        textView3.setText(summary.getListingVariation2());
        ViewExtensions.m12870n(textView3, new SummaryFragment$bindListingDetails$1$4$1(summary));
        TextView textView4 = (TextView) requireView.findViewById(R.id.listing_personalization);
        textView4.setText(summary.getListingPersonalization());
        ViewExtensions.m12870n(textView4, new SummaryFragment$bindListingDetails$1$5$1(summary));
    }

    private final void bindPaymentMethod(UiState.Summary summary) {
        SummaryItemView summaryItemView = (SummaryItemView) requireView().findViewById(R.id.payment_method);
        summaryItemView.setIcon(summary.getPaymentMethod().getCardType().getIconResId());
        summaryItemView.setTitle(summary.getPaymentMethod().getName());
        summaryItemView.setSubtitle(summary.getPaymentMethod().getValue());
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        summaryItemView.setSubtitleTextColor(C13350a.m21013d(requireContext, R.attr.clg_color_text_secondary));
        summaryItemView.setOnItemViewClickedListener(new SummaryFragment$bindPaymentMethod$1$1$1(this));
    }

    private final void bindShippingAddress(UiState.Summary summary) {
        SummaryItemView summaryItemView = (SummaryItemView) requireView().findViewById(R.id.shipping_address);
        summaryItemView.setIcon(R.drawable.clg_icon_core_location_v1);
        summaryItemView.setTitle(summary.getSelectedShippingAddress().getName());
        summaryItemView.setSubtitle(summary.getSelectedShippingAddress().getFormattedAddress());
        summaryItemView.setOnItemViewClickedListener(new SummaryFragment$bindShippingAddress$1$1$1(this));
    }

    private final void bindShippingMethod(UiState.Summary summary) {
        SummaryItemView summaryItemView = (SummaryItemView) requireView().findViewById(R.id.shipping_method);
        summaryItemView.setIcon(R.drawable.clg_icon_core_truck_v1);
        summaryItemView.setTitle(summary.getShippingMethod().formattedTitle());
        summaryItemView.setSubtitle(summary.getShippingMethod().getEstimatedDeliveryDateLabel());
        summaryItemView.setOnItemViewClickedListener(new SummaryFragment$bindShippingMethod$1$1$1(this));
    }

    private final void bindTermsAndConditions(UiState.Summary summary) {
        TextView textView = (TextView) requireView().findViewById(R.id.terms_and_conditions);
        textView.setText(summary.getSpannedTermsAndConditions());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        URLSpan[] urls = textView.getUrls();
        C19383o.m32796f(urls, "urls");
        ArrayList arrayList = new ArrayList();
        for (URLSpan uRLSpan : urls) {
            if (uRLSpan instanceof EtsyLinkify.UnderlineURLSpan) {
                arrayList.add(uRLSpan);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EtsyLinkify.UnderlineURLSpan underlineURLSpan = (EtsyLinkify.UnderlineURLSpan) it.next();
            SummaryFragment$bindTermsAndConditions$1$1$1 summaryFragment$bindTermsAndConditions$1$1$1 = new SummaryFragment$bindTermsAndConditions$1$1$1(this, underlineURLSpan);
            C19383o.m32797g(underlineURLSpan, "<this>");
            underlineURLSpan.setOnClickListener(new SpanExtensions$trackingClick$1(summaryFragment$bindTermsAndConditions$1$1$1));
        }
    }

    private final void bindTotal(UiState.Summary summary) {
        BuyItNowTotalContentToggle buyItNowTotalContentToggle = (BuyItNowTotalContentToggle) requireView().findViewById(R.id.total_toggle);
        buyItNowTotalContentToggle.setExpanded(summary.getOrderSummaryExpanded());
        String string = getString(R.string.native_buy_it_now_order_summary_collapsed_label, summary.getTotal());
        C19383o.m32796f(string, "getString(\n             …tal\n                    )");
        String string2 = getString(R.string.native_buy_it_now_order_summary_expanded_label);
        C19383o.m32796f(string2, "getString(R.string.nativ…r_summary_expanded_label)");
        buyItNowTotalContentToggle.setTitle(string, string2);
        buyItNowTotalContentToggle.removeAllContentViews();
        for (SubtotalLineItem subtotalLineItem : summary.getSubtotalLineItems()) {
            View inflate = getLayoutInflater().inflate(R.layout.view_native_buy_it_now_subtotal_line_item, buyItNowTotalContentToggle, false);
            C19383o.m32795e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            ((TextView) viewGroup.findViewById(R.id.label)).setText(subtotalLineItem.getLabel());
            ((TextView) viewGroup.findViewById(R.id.value)).setText(subtotalLineItem.getValue());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
            Float valueOf = Float.valueOf(8.0f);
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            layoutParams.topMargin = C19543e0.m33295K(valueOf, requireContext);
            Float valueOf2 = Float.valueOf(16.0f);
            Context requireContext2 = requireContext();
            C19383o.m32796f(requireContext2, "requireContext()");
            layoutParams.leftMargin = C19543e0.m33295K(valueOf2, requireContext2);
            Float valueOf3 = Float.valueOf(16.0f);
            Context requireContext3 = requireContext();
            C19383o.m32796f(requireContext3, "requireContext()");
            layoutParams.rightMargin = C19543e0.m33295K(valueOf3, requireContext3);
            buyItNowTotalContentToggle.addView((View) viewGroup, (ViewGroup.LayoutParams) layoutParams);
        }
        View inflate2 = getLayoutInflater().inflate(R.layout.view_native_buy_it_now_total_line_item, buyItNowTotalContentToggle, false);
        C19383o.m32795e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate2;
        TextView textView = (TextView) viewGroup2.findViewById(R.id.label);
        textView.setText(textView.getResources().getQuantityString(R.plurals.native_buy_it_now_order_summary_expanded_total_label, summary.getListingQuantity(), new Object[]{Integer.valueOf(summary.getListingQuantity())}));
        ((TextView) viewGroup2.findViewById(R.id.value)).setText(summary.getTotal());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
        Float valueOf4 = Float.valueOf(8.0f);
        Context requireContext4 = requireContext();
        C19383o.m32796f(requireContext4, "requireContext()");
        layoutParams2.topMargin = C19543e0.m33295K(valueOf4, requireContext4);
        Float valueOf5 = Float.valueOf(16.0f);
        Context requireContext5 = requireContext();
        C19383o.m32796f(requireContext5, "requireContext()");
        layoutParams2.leftMargin = C19543e0.m33295K(valueOf5, requireContext5);
        Float valueOf6 = Float.valueOf(16.0f);
        Context requireContext6 = requireContext();
        C19383o.m32796f(requireContext6, "requireContext()");
        layoutParams2.rightMargin = C19543e0.m33295K(valueOf6, requireContext6);
        buyItNowTotalContentToggle.addView((View) viewGroup2, (ViewGroup.LayoutParams) layoutParams2);
    }

    /* access modifiers changed from: private */
    public final C10368a getDispatcher() {
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment");
        return ((NativeBuyItNowCheckoutContainerFragment) parentFragment).getDispatcher();
    }

    private final LiveData<UiState> getState() {
        Fragment parentFragment = getParentFragment();
        C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buyitnow.NativeBuyItNowCheckoutContainerFragment");
        return ((NativeBuyItNowCheckoutContainerFragment) parentFragment).getViewModel().f22739c;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m35014onViewCreated$lambda0(SummaryFragment summaryFragment, UiState uiState) {
        C19383o.m32797g(summaryFragment, "this$0");
        if (uiState instanceof UiState.Summary) {
            summaryFragment.bind((UiState.Summary) uiState);
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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_native_buy_it_now_summary, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getState().observe(getViewLifecycleOwner(), new C9500i(this, 1));
    }
}
