package com.paypal.pyplcheckout.home.view.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.p327ui.cardview.viewholders.C9182h1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.customviews.PreferredFIToggleView;
import com.paypal.pyplcheckout.interfaces.HeartListener;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import com.paypal.pyplcheckout.model.RoundedCornersTransformation;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.BitmapColorUtils;
import com.squareup.picasso.C17459s;
import com.squareup.picasso.C17461t;
import com.squareup.picasso.C17469y;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p753kq.C19846a;

public final class FundingOptionViewHolder extends CarouselAdapterViewHolder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "FundingOptionViewHolder";
    /* access modifiers changed from: private */
    public final ImageView backGroundImage;
    private final TextView balanceTv;
    /* access modifiers changed from: private */
    public final TextView bankNameBig;
    /* access modifiers changed from: private */
    public final TextView cardTypeTv;
    private final HeartListener heartListener;
    /* access modifiers changed from: private */
    public final TextView lastDigits;
    private final ImageView monogram;
    private boolean newClick;
    private final TextView optionalText;
    private final PreferredFIToggleView preferredFIToggleView;
    private final TextView sourceTitle;
    private final C17469y transformation = new RoundedCornersTransformation(12.0f, 0.0f, (RoundedCornersTransformation.CornerType) null, 4, (DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FundingOptionViewHolder(View view, SelectedListener selectedListener, HeartListener heartListener2) {
        super(view, selectedListener, (DefaultConstructorMarker) null);
        C19383o.m32797g(view, "itemView");
        C19383o.m32797g(selectedListener, "selectedListener");
        C19383o.m32797g(heartListener2, "heartListener");
        this.heartListener = heartListener2;
        View findViewById = view.findViewById(C17165R.C17167id.last_four_digits_tv);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.last_four_digits_tv)");
        this.lastDigits = (TextView) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.payment_source_optional_tv);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…yment_source_optional_tv)");
        this.optionalText = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.card_type_tv);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.card_type_tv)");
        this.cardTypeTv = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.payment_source_background);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…ayment_source_background)");
        this.backGroundImage = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(C17165R.C17167id.preferred_fi_toggle_view);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…preferred_fi_toggle_view)");
        this.preferredFIToggleView = (PreferredFIToggleView) findViewById5;
        View findViewById6 = view.findViewById(C17165R.C17167id.bank_name);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.bank_name)");
        this.bankNameBig = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C17165R.C17167id.payment_source_monogram);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.….payment_source_monogram)");
        this.monogram = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(C17165R.C17167id.payment_source_title);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.id.payment_source_title)");
        this.sourceTitle = (TextView) findViewById8;
        View findViewById9 = view.findViewById(C17165R.C17167id.pp_balance_tv);
        C19383o.m32796f(findViewById9, "itemView.findViewById(R.id.pp_balance_tv)");
        this.balanceTv = (TextView) findViewById9;
    }

    /* access modifiers changed from: private */
    /* renamed from: bind$lambda-0  reason: not valid java name */
    public static final void m35264bind$lambda0(FundingOptionViewHolder fundingOptionViewHolder, CardUiModel.PaymentSourceUiModel paymentSourceUiModel, View view) {
        C19383o.m32797g(fundingOptionViewHolder, "this$0");
        C19383o.m32797g(paymentSourceUiModel, "$paymentSourceUiModel");
        fundingOptionViewHolder.getSelectedListener().onTaskCompleted(paymentSourceUiModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: bind$lambda-1  reason: not valid java name */
    public static final void m35265bind$lambda1(FundingOptionViewHolder fundingOptionViewHolder, CardUiModel.PaymentSourceUiModel paymentSourceUiModel, C19846a aVar, View view) {
        FundingOptionViewHolder fundingOptionViewHolder2 = fundingOptionViewHolder;
        C19383o.m32797g(fundingOptionViewHolder2, "this$0");
        C19383o.m32797g(paymentSourceUiModel, "$paymentSourceUiModel");
        C19383o.m32797g(aVar, "$listener");
        if (!fundingOptionViewHolder2.preferredFIToggleView.isFavorite()) {
            PEnums.TransitionName transitionName = PEnums.TransitionName.CARD_PREFERENCE_DEACTIVATED;
            PEnums.Outcome outcome = PEnums.Outcome.CLICKED;
            PEnums.EventCode eventCode = PEnums.EventCode.E101;
            PEnums.StateName stateName = PEnums.StateName.REVIEW;
            PLog.click$default(transitionName, outcome, eventCode, stateName, C0326j.m864i("PREVIOUS_PREF: ", fundingOptionViewHolder.getRepository().getPreferredFundingOptionId()), "carousel_view", "preferred_icon", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            PLog.click$default(PEnums.TransitionName.CARD_PREFERENCE_ACTIVATED, outcome, eventCode, stateName, (String) null, "carousel_view", "preferred_icon", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            fundingOptionViewHolder.getRepository().setPreferredFundingOptionId(paymentSourceUiModel.getFundingOptionId());
            fundingOptionViewHolder2.newClick = true;
            fundingOptionViewHolder2.preferredFIToggleView.sendAccessibilityEvent(8);
            fundingOptionViewHolder2.preferredFIToggleView.requestFocus();
            fundingOptionViewHolder2.heartListener.onTaskCompleted();
            aVar.invoke();
        }
        fundingOptionViewHolder2.preferredFIToggleView.sendAccessibilityEvent(8);
        fundingOptionViewHolder2.preferredFIToggleView.requestFocus();
    }

    private final Repository getRepository() {
        return SdkComponent.Companion.getInstance().getRepository();
    }

    /* access modifiers changed from: private */
    public final void setTextColor(Bitmap bitmap, String str) {
        Context context = this.itemView.getContext();
        int i = C17165R.color.white_color;
        Object obj = C8184a.f17966a;
        Bitmap bitmap2 = bitmap;
        String str2 = str;
        BitmapColorUtils.getBestTextContrastingColor$default(BitmapColorUtils.INSTANCE, bitmap2, str2, C8184a.C8188d.m16468a(context, i), C8184a.C8188d.m16468a(this.itemView.getContext(), C17165R.color.gray_color_700), 0.0f, 0.0f, false, new FundingOptionViewHolder$setTextColor$1(this), 112, (Object) null);
    }

    public final void bind(CardUiModel.PaymentSourceUiModel paymentSourceUiModel, boolean z, C19846a<C19394m> aVar) {
        C17461t tVar;
        int i;
        C19383o.m32797g(paymentSourceUiModel, "paymentSourceUiModel");
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.itemView.setOnClickListener(new C9182h1(3, this, paymentSourceUiModel));
        if (C19383o.m32792b(CardUiModel.PaymentSourceUiModel.BANK_ACCOUNT, paymentSourceUiModel.getType())) {
            this.bankNameBig.setText(paymentSourceUiModel.getPaymentCardLabel());
            this.bankNameBig.setVisibility(0);
        } else {
            this.bankNameBig.setVisibility(4);
            this.bankNameBig.setText("");
        }
        this.backGroundImage.setVisibility(0);
        TextView textView = this.lastDigits;
        boolean z2 = true;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{paymentSourceUiModel.getPaymentCardLabel(), paymentSourceUiModel.getLastFourDigits()}, 2));
        C19383o.m32796f(format, "format(format, *args)");
        textView.setContentDescription(format);
        this.lastDigits.setText(paymentSourceUiModel.getLastFourDigits());
        Picasso d = Picasso.m29268d();
        String str = null;
        if (paymentSourceUiModel.getCardArtUrl().length() == 0) {
            int backgroundImage = paymentSourceUiModel.getCardDesign().getBackgroundImage();
            d.getClass();
            if (backgroundImage != 0) {
                tVar = new C17461t(d, (Uri) null, backgroundImage);
                Context context = this.itemView.getContext();
                int textColor = paymentSourceUiModel.getCardDesign().getTextColor();
                Object obj = C8184a.f17966a;
                i = C8184a.C8188d.m16468a(context, textColor);
                tVar.f38175c = true;
            } else {
                throw new IllegalArgumentException("Resource ID must not be zero.");
            }
        } else {
            Context context2 = this.itemView.getContext();
            int i2 = C17165R.color.gray_color_700;
            Object obj2 = C8184a.f17966a;
            int a = C8184a.C8188d.m16468a(context2, i2);
            tVar = d.mo68572e(paymentSourceUiModel.getCardArtUrl());
            i = a;
        }
        this.lastDigits.setTextColor(i);
        this.cardTypeTv.setTextColor(i);
        this.balanceTv.setTextColor(i);
        this.sourceTitle.setTextColor(i);
        int backgroundImage2 = paymentSourceUiModel.getCardDesign().getBackgroundImage();
        if (backgroundImage2 != 0) {
            tVar.f38176d = backgroundImage2;
            C17469y yVar = this.transformation;
            C17459s.C17460a aVar2 = tVar.f38174b;
            aVar2.getClass();
            if (yVar == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (yVar.key() != null) {
                if (aVar2.f38169e == null) {
                    aVar2.f38169e = new ArrayList(2);
                }
                aVar2.f38169e.add(yVar);
                tVar.mo68635a(this.backGroundImage, new FundingOptionViewHolder$bind$2(this, paymentSourceUiModel));
                if (isPayPalBalanceFundingOption(paymentSourceUiModel)) {
                    if (canDisplayPayPalBalance(paymentSourceUiModel)) {
                        Amount availableAmount = paymentSourceUiModel.getAvailableAmount();
                        String currencySymbol = availableAmount == null ? null : availableAmount.getCurrencySymbol();
                        Amount availableAmount2 = paymentSourceUiModel.getAvailableAmount();
                        if (availableAmount2 != null) {
                            str = availableAmount2.getCurrencyValue();
                        }
                        this.balanceTv.setVisibility(0);
                        this.balanceTv.setText(this.itemView.getContext().getString(C17165R.string.paypal_checkout_paypal_balance_amount_dont_translate, new Object[]{currencySymbol, str}));
                    } else {
                        this.balanceTv.setVisibility(8);
                    }
                    this.lastDigits.setText("");
                    this.cardTypeTv.setText("");
                    this.monogram.setVisibility(0);
                    this.sourceTitle.setVisibility(0);
                } else {
                    this.cardTypeTv.setText(paymentSourceUiModel.getCardFormattedType());
                    this.lastDigits.setText(paymentSourceUiModel.getLastFourDigits());
                    this.monogram.setVisibility(8);
                    this.sourceTitle.setVisibility(8);
                    this.balanceTv.setVisibility(8);
                }
                this.optionalText.setText(paymentSourceUiModel.getOptionalText());
                boolean isPreferredFundingOption = paymentSourceUiModel.isPreferredFundingOption();
                boolean b = C19383o.m32792b(getRepository().getPreferredFundingOptionId(), paymentSourceUiModel.getFundingOptionId());
                boolean b2 = C19383o.m32792b(getRepository().getPreferredFundingOptionId(), "");
                if (!C19383o.m32792b(paymentSourceUiModel.getFundingOptionId(), "PYPL_Credit") && !z) {
                    z2 = false;
                }
                if (!z2) {
                    this.preferredFIToggleView.setVisibility(0);
                    if (b || (b2 && isPreferredFundingOption)) {
                        this.preferredFIToggleView.updatePaymentViewStateToFavorite(this.newClick);
                        if (this.newClick) {
                            this.newClick = false;
                        }
                    } else {
                        this.preferredFIToggleView.deselectPaymentStateAsFavorite();
                    }
                } else {
                    this.preferredFIToggleView.setVisibility(8);
                }
                this.preferredFIToggleView.setOnClickListener(new C17228a(this, paymentSourceUiModel, aVar));
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        } else {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
    }

    public final boolean canDisplayPayPalBalance(CardUiModel.PaymentSourceUiModel paymentSourceUiModel) {
        C19383o.m32797g(paymentSourceUiModel, "paymentSourceUiModel");
        if (paymentSourceUiModel.getPlan() != null) {
            Amount availableAmount = paymentSourceUiModel.getAvailableAmount();
            return ((availableAmount == null ? null : availableAmount.getCurrencySymbol()) == null || paymentSourceUiModel.getAvailableAmount().getCurrencyValue() == null) ? false : true;
        }
    }

    public final boolean isPayPalBalanceFundingOption(CardUiModel.PaymentSourceUiModel paymentSourceUiModel) {
        C19383o.m32797g(paymentSourceUiModel, "paymentSourceUiModel");
        return C19383o.m32792b(paymentSourceUiModel.getCardFormattedType(), CardUiModel.PaymentSourceUiModel.PAYPAL);
    }
}
