package com.etsy.android.p327ui.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.p015ui.platform.C1830f0;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.p327ui.EtsyFragment;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p356ge.C12788a;
import p392lf.C13020a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.dialog.SingleListingCheckoutSADialog */
public final class SingleListingCheckoutSADialog extends EtsyFragment implements C13366a, C13020a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private DialogHeaderPresenter dialogHeaderPresenter;
    private C9726b presenter;

    /* access modifiers changed from: private */
    public final void dismiss() {
        C9726b bVar = this.presenter;
        if (bVar != null) {
            new C1830f0(bVar.f21521a.getAnalyticsContext()).mo7215g(bVar.f21526f, bVar.f21527g);
        }
        C12788a.m20426e(getActivity());
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
        Drawable drawable;
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_single_listing_checkout_single_activity, viewGroup, false);
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
        ViewExtensions.m12866j(dialogHeaderPresenter4.f21514c, new SingleListingCheckoutSADialog$onCreateView$1(this));
        Bundle requireArguments = requireArguments();
        C19383o.m32796f(requireArguments, "requireArguments()");
        C9726b bVar = new C9726b(this, requireArguments, new SingleListingCheckoutSADialog$onCreateView$2(this));
        this.presenter = bVar;
        Context context = inflate.getContext();
        List<PaymentOption> paymentOptions = bVar.f21527g.getPaymentOptions();
        View findViewById = inflate.findViewById(R.id.single_listing_checkout_proceed);
        C19383o.m32795e(findViewById, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) findViewById;
        bVar.f21525e = button;
        button.setOnClickListener(new SingleListingCheckoutDialogPresenter$buildView$1(bVar));
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.single_listing_checkout_payment_methods);
        radioGroup.setOnCheckedChangeListener(new C9725a(bVar));
        if (bVar.f21527g.isInternational() && bVar.f21522b.get("single_listing_cart") != null) {
            inflate.findViewById(R.id.single_listing_checkout_international_container).setVisibility(0);
            Object obj = bVar.f21522b.get("single_listing_cart");
            C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.SingleListingCart");
            SingleListingCart singleListingCart = (SingleListingCart) obj;
            Context context2 = inflate.getContext();
            ((TextView) inflate.findViewById(R.id.single_listing_checkout_item_total)).setText(singleListingCart.getItemTotal().getCurrencyFormattedShort());
            View findViewById2 = inflate.findViewById(R.id.single_listing_checkout_shipping_container);
            if (singleListingCart.hasFreeShipping()) {
                findViewById2.setVisibility(8);
            } else {
                findViewById2.setVisibility(0);
                ((TextView) inflate.findViewById(R.id.single_listing_checkout_shipping)).setText(singleListingCart.getShippingTotal().getCurrencyFormattedShort());
            }
            TextView textView = (TextView) inflate.findViewById(R.id.single_listing_checkout_shipping_destination);
            if (TextUtils.isEmpty(singleListingCart.getShippingDestination())) {
                textView.setVisibility(8);
            } else {
                String string = context2.getString(R.string.single_listing_checkout_shipping_destination, new Object[]{singleListingCart.getShippingDestination()});
                C19383o.m32796f(string, "context.getString(\n     …Destination\n            )");
                textView.setText(string);
                textView.setVisibility(0);
            }
            ((TextView) inflate.findViewById(R.id.single_listing_checkout_total)).setText(singleListingCart.getTotal().getCurrencyFormattedShort());
            inflate.findViewById(R.id.single_listing_checkout_vat_description).setVisibility(singleListingCart.hasVAT() ? 0 : 8);
            TextView textView2 = (TextView) inflate.findViewById(R.id.single_listing_checkout_transparent_price_msg);
            if (!TextUtils.isEmpty(singleListingCart.getTransparentPriceMsg())) {
                Spanned fromHtml = Html.fromHtml(singleListingCart.getTransparentPriceMsg());
                C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                C19383o.m32796f(fromHtml, "message");
                Object obj2 = C8184a.f17966a;
                textView2.setText(EtsyLinkify.m19615i(C8184a.C8188d.m16468a(context2, R.color.sk_gray_50), fromHtml, true));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.single_listing_checkout_conversion_msg);
            if (singleListingCart.shouldShowCurrencyConversionNotice()) {
                String string2 = context2.getString(R.string.single_listing_checkout_conversion_msg, new Object[]{singleListingCart.getItemTotal().getCurrencyFormattedShort(), singleListingCart.getShopName()});
                C19383o.m32796f(string2, "context.getString(\n     …rt.shopName\n            )");
                textView3.setText(string2);
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.msco_radio_button_payment_option_height));
        int size = paymentOptions.size();
        for (int i = 0; i < size; i++) {
            PaymentOption paymentOption = paymentOptions.get(i);
            if (paymentOption.isSelected()) {
                bVar.f21524d = paymentOption;
            }
            RadioButton radioButton = new RadioButton(context);
            radioButton.setLayoutParams(marginLayoutParams);
            radioButton.setContentDescription(paymentOption.getLabel());
            radioButton.setTag(paymentOption);
            if (paymentOption.isPayPal()) {
                Object obj3 = C8184a.f17966a;
                drawable = C8184a.C8187c.m16466b(context, R.drawable.cc_paypal);
            } else if (paymentOption.isCreditCard()) {
                Object obj4 = C8184a.f17966a;
                drawable = C8184a.C8187c.m16466b(context, R.drawable.cc_all);
            } else if (paymentOption.isGooglePay()) {
                Object obj5 = C8184a.f17966a;
                drawable = C8184a.C8187c.m16466b(context, R.drawable.cc_google_pay);
            } else if (paymentOption.isIdeal()) {
                Object obj6 = C8184a.f17966a;
                drawable = C8184a.C8187c.m16466b(context, R.drawable.cc_ideal);
            } else if (paymentOption.isKlarnaInstallments()) {
                radioButton.setText(paymentOption.getLabel());
                Object obj7 = C8184a.f17966a;
                drawable = C8184a.C8187c.m16466b(context, R.drawable.ic_etsy_klarna_badge);
            } else {
                radioButton.setText(paymentOption.getLabel());
                drawable = null;
            }
            radioButton.setCompoundDrawablePadding((int) context.getResources().getDimension(R.dimen.clg_space_8));
            radioButton.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            radioGroup.addView(radioButton);
            radioButton.setChecked(paymentOption.isSelected());
        }
        bVar.mo32582a(bVar.f21524d);
        View findViewById3 = inflate.findViewById(R.id.constraint_layout);
        C19383o.m32796f(findViewById3, "view.findViewById<View>(R.id.constraint_layout)");
        ViewExtensions.m12866j(findViewById3, new SingleListingCheckoutSADialog$onCreateView$3(this));
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
