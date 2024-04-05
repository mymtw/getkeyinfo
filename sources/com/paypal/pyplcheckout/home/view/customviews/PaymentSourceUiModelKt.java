package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCaseKt;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.Image;
import com.paypal.pyplcheckout.pojo.Plan;
import com.paypal.pyplcheckout.pojo.Url;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p003a2.C0015b;
import p010a9.C0048b;

public final class PaymentSourceUiModelKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentProcessors.values().length];
            iArr[PaymentProcessors.VISA.ordinal()] = 1;
            iArr[PaymentProcessors.MASTERCARD.ordinal()] = 2;
            iArr[PaymentProcessors.AMEX.ordinal()] = 3;
            iArr[PaymentProcessors.DISCOVER.ordinal()] = 4;
            iArr[PaymentProcessors.DINERSCLUB.ordinal()] = 5;
            iArr[PaymentProcessors.CHINAUNIONPAY.ordinal()] = 6;
            iArr[PaymentProcessors.NOTFOUND.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CardUiModel.AddCardUiModel addCard(PaymentProcessors paymentProcessors, boolean z) {
        C19383o.m32797g(paymentProcessors, "paymentProcessors");
        return z ? new CardUiModel.AddCardUiModel.Native(setPaymentProcessorImage(paymentProcessors)) : new CardUiModel.AddCardUiModel.Web(getBackgroundImageFromLabel("Add Card").getBackgroundImage());
    }

    public static final List<FundingOption> filterCryptocurrency(List<FundingOption> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!C19457k.m33019W0(((FundingOption) next).getFundingInstrument().getType(), GetSelectedFundingOptionUseCaseKt.CRYPTO_TYPE, true)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.paypal.pyplcheckout.home.view.customviews.CardUiModel.CardDesignModel getBackgroundImageFromLabel(java.lang.String r2) {
        /*
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2026057073: goto L_0x0172;
                case -1802816241: goto L_0x0164;
                case -1605764378: goto L_0x0156;
                case -1272334293: goto L_0x0148;
                case -1230829713: goto L_0x013a;
                case -1128722400: goto L_0x012c;
                case -543866550: goto L_0x011e;
                case -298759312: goto L_0x010e;
                case -204786689: goto L_0x00fe;
                case -46205774: goto L_0x00ee;
                case 69768: goto L_0x00de;
                case 2031164: goto L_0x00ce;
                case 2666593: goto L_0x00be;
                case 65071054: goto L_0x00ae;
                case 69732444: goto L_0x009e;
                case 337828873: goto L_0x008e;
                case 638871948: goto L_0x007e;
                case 960095465: goto L_0x006e;
                case 1087145190: goto L_0x005e;
                case 1261491261: goto L_0x004e;
                case 1399864215: goto L_0x003e;
                case 1443168208: goto L_0x002e;
                case 1561949438: goto L_0x001e;
                case 1946946271: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0180
        L_0x000e:
            java.lang.String r0 = "Carte Aurore"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0018
            goto L_0x0180
        L_0x0018:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_aurore
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x001e:
            java.lang.String r0 = "Bitcoin"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0028
            goto L_0x0180
        L_0x0028:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_crypto_bg
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x002e:
            java.lang.String r0 = "Cofinoga ou Privilège"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0038
            goto L_0x0180
        L_0x0038:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_cofinoga
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x003e:
            java.lang.String r0 = "Union Pay"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0048
            goto L_0x0180
        L_0x0048:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_union_pay
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x004e:
            java.lang.String r0 = "eBay MasterCard"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0058
            goto L_0x0180
        L_0x0058:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_ebay_mastercard
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x005e:
            java.lang.String r0 = "PayPal Credit"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0068
            goto L_0x0180
        L_0x0068:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_pp_credit
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x006e:
            java.lang.String r0 = "Bank of America"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0078
            goto L_0x0180
        L_0x0078:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_boa
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x007e:
            java.lang.String r0 = "HiperCard"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0088
            goto L_0x0180
        L_0x0088:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_hipercard
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x008e:
            java.lang.String r0 = "Discover"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0098
            goto L_0x0180
        L_0x0098:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_discover
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x009e:
            java.lang.String r0 = "Hiper"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00a8
            goto L_0x0180
        L_0x00a8:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_hiper
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x00ae:
            java.lang.String r0 = "Chase"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00b8
            goto L_0x0180
        L_0x00b8:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_chase
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x00be:
            java.lang.String r0 = "Visa"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00c8
            goto L_0x0180
        L_0x00c8:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_updatedvisa
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x00ce:
            java.lang.String r0 = "BANK"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00d8
            goto L_0x0180
        L_0x00d8:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_bank_dark_bg
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x00de:
            java.lang.String r0 = "Elo"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00e8
            goto L_0x0180
        L_0x00e8:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_elo
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x00ee:
            java.lang.String r0 = "MasterCard"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00f8
            goto L_0x0180
        L_0x00f8:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_mc
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x00fe:
            java.lang.String r0 = "PayPal MasterCard"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0108
            goto L_0x0180
        L_0x0108:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_ppmc
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x010e:
            java.lang.String r0 = "American Express"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0118
            goto L_0x0180
        L_0x0118:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_amex
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x011e:
            java.lang.String r0 = "Carte Bancaire"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0127
            goto L_0x0180
        L_0x0127:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_cb
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x012c:
            java.lang.String r0 = "Capitol One"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0135
            goto L_0x0180
        L_0x0135:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_capitolone
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x013a:
            java.lang.String r0 = "Add Card"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0143
            goto L_0x0180
        L_0x0143:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_add
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x0148:
            java.lang.String r0 = "Apply Credit"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0151
            goto L_0x0180
        L_0x0151:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_applynoshadow
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x0156:
            java.lang.String r0 = "PayPal Smart Connect"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x015f
            goto L_0x0180
        L_0x015f:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_pp_smart_connect
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x0164:
            java.lang.String r0 = "Maestro"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x016d
            goto L_0x0180
        L_0x016d:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_maestro
            int r0 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
            goto L_0x0184
        L_0x0172:
            java.lang.String r0 = "PayPal Balance"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x017b
            goto L_0x0180
        L_0x017b:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_balance_blue
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
            goto L_0x0184
        L_0x0180:
            int r2 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_bank_dark_bg
            int r0 = com.paypal.pyplcheckout.C17165R.color.white_color
        L_0x0184:
            com.paypal.pyplcheckout.home.view.customviews.CardUiModel$CardDesignModel r1 = new com.paypal.pyplcheckout.home.view.customviews.CardUiModel$CardDesignModel
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PaymentSourceUiModelKt.getBackgroundImageFromLabel(java.lang.String):com.paypal.pyplcheckout.home.view.customviews.CardUiModel$CardDesignModel");
    }

    public static final int setPaymentProcessorImage(PaymentProcessors paymentProcessors) {
        int i;
        C19383o.m32797g(paymentProcessors, "paymentProcessor");
        switch (WhenMappings.$EnumSwitchMapping$0[paymentProcessors.ordinal()]) {
            case 1:
                i = getBackgroundImageFromLabel("Visa").getBackgroundImage();
                break;
            case 2:
                i = getBackgroundImageFromLabel("MasterCard").getBackgroundImage();
                break;
            case 3:
                i = getBackgroundImageFromLabel("American Express").getBackgroundImage();
                break;
            case 4:
                i = getBackgroundImageFromLabel("Discover").getBackgroundImage();
                break;
            case 5:
                i = getBackgroundImageFromLabel("Diners Club").getBackgroundImage();
                break;
            case 6:
                i = getBackgroundImageFromLabel("Union Pay").getBackgroundImage();
                break;
            case 7:
                i = 17170445;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return ((Number) AnyExtensionsKt.getExhaust(Integer.valueOf(i))).intValue();
    }

    public static final CardUiModel.PaymentSourceUiModel toPaymentSourceUiModel(FundingOption fundingOption, Context context) {
        String str;
        String str2;
        Url url;
        Context context2 = context;
        C19383o.m32797g(fundingOption, "<this>");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        FundingInstrument fundingInstrument = fundingOption.getFundingInstrument();
        List<Plan> allPlans = fundingOption.getAllPlans();
        String str3 = null;
        Plan plan = allPlans == null ? null : allPlans.get(fundingOption.getAllPlans().size() - 1);
        String valueOf = String.valueOf((char) 183);
        String i = C0015b.m90i(valueOf, valueOf, valueOf, valueOf);
        String valueOf2 = String.valueOf((char) 65381);
        String i2 = C0015b.m90i(valueOf2, valueOf2, valueOf2, valueOf2);
        if ((plan == null ? null : plan.getBackupFundingInstrument()) != null) {
            String string = context.getResources().getString(C17165R.string.paypal_checkout_backup);
            String label = plan.getBackupFundingInstrument().getLabel();
            String lastDigits = plan.getBackupFundingInstrument().getLastDigits();
            StringBuilder f = C0388a.m1050f(string, " ", label, " ", i);
            f.append(lastDigits);
            str = f.toString();
        } else {
            str = "";
        }
        if (plan == null || (str2 = plan.getId()) == null) {
            str2 = "";
        }
        String instrumentSubType = fundingInstrument.getInstrumentSubType(context2);
        String type = fundingInstrument.getType();
        if (type == null) {
            type = "";
        }
        String label2 = fundingInstrument.getLabel();
        if (label2 == null) {
            label2 = "";
        }
        String a = fundingInstrument.getLastDigits() != null ? C0048b.m163a(i2, " ", fundingInstrument.getLastDigits()) : "";
        String label3 = fundingInstrument.getLabel();
        if (label3 == null) {
            label3 = "";
        }
        CardUiModel.CardDesignModel backgroundImageFromLabel = getBackgroundImageFromLabel(label3);
        boolean b = C19383o.m32792b(fundingInstrument.isPreferred(), Boolean.TRUE);
        String id = fundingInstrument.getId();
        String str4 = id == null ? "" : id;
        Image image = fundingInstrument.getImage();
        if (!(image == null || (url = image.getUrl()) == null)) {
            str3 = url.getHref();
        }
        if (str3 == null) {
            str3 = "";
        }
        return new CardUiModel.PaymentSourceUiModel(plan, str2, instrumentSubType, type, label2, a, backgroundImageFromLabel, b, false, str, true, str4, str3, fundingOption.getAvailableAmount());
    }
}
