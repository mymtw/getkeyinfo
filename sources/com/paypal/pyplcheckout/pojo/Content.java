package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Content {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("BackgroundParams")
    private final String backgroundParams;
    @C18417a("BackgroundType")
    private final String backgroundType;
    @C18417a("CartAmount")
    private final String cartAmount;
    @C18417a("CartAmountCurrencyCode")
    private final String cartAmountCurrencyCode;
    @C18417a("CrossCurrencyTransaction")
    private final String crossCurrencyTransaction;
    @C18417a("CTAText")
    private final String ctaText;
    @C18417a("CurrencyConversionRate")
    private final String currencyConversionRate;
    @C18417a("HeadlineText")
    private final String headlineText;
    @C18417a("IncentiveOfferCurrencyCode")
    private final String incentiveOfferCurrencyCode;
    @C18417a("IncentiveOfferProgramCode")
    private final String incentiveOfferProgramCode;
    @C18417a("IncentiveOfferProgramId")
    private final String incentiveOfferProgramId;
    @C18417a("IncentiveOfferValue")
    private final String incentiveOfferValue;
    @C18417a("LearnMoreLink")
    private final String learnMoreLink;
    @C18417a("LearnMoreText")
    private final String learnMoreText;
    @C18417a("Logo")
    private final String logo;
    @C18417a("MessageDescription")
    private final String messageDescription;
    @C18417a("OfferCategory")
    private final String offerCategory;
    @C18417a("OfferCheckoutButtonText")
    private final String offerCheckoutButtonText;
    @C18417a("OfferText1")
    private final String offerText1;
    @C18417a("OfferText2")
    private final String offerText2;
    @C18417a("OfferTextTemplate")
    private final String offerTextTemplate;
    @C18417a("OfferType")
    private final String offerType;
    @C18417a("PresentmentStyle")
    private final String presentmentStyle;
    @C18417a("PresentmentType")
    private final String presentmentType;
    @C18417a("Product")
    private final String product;
    @C18417a("TermsLink")
    private final String termsLink;
    @C18417a("TermsLinkText")
    private final String termsLinkText;
    @C18417a("TermsText")
    private final String termsText;
    @C18417a("VisaActive")
    private final String visaActive;

    public Content(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        C19383o.m32797g(str5, "product");
        C19383o.m32797g(map2, "additionalProperties");
        this.crossCurrencyTransaction = str;
        this.backgroundParams = str2;
        this.incentiveOfferProgramId = str3;
        this.presentmentType = str4;
        this.product = str5;
        this.termsLink = str6;
        this.incentiveOfferProgramCode = str7;
        this.offerType = str8;
        this.cartAmountCurrencyCode = str9;
        this.presentmentStyle = str10;
        this.headlineText = str11;
        this.offerText2 = str12;
        this.offerText1 = str13;
        this.incentiveOfferCurrencyCode = str14;
        this.currencyConversionRate = str15;
        this.cartAmount = str16;
        this.messageDescription = str17;
        this.ctaText = str18;
        this.logo = str19;
        this.incentiveOfferValue = str20;
        this.visaActive = str21;
        this.backgroundType = str22;
        this.termsLinkText = str23;
        this.termsText = str24;
        this.offerTextTemplate = str25;
        this.offerCategory = str26;
        this.offerCheckoutButtonText = str27;
        this.learnMoreLink = str28;
        this.learnMoreText = str29;
        this.additionalProperties = map2;
    }

    public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, Map map, int i, Object obj) {
        Content content2 = content;
        int i2 = i;
        return content.copy((i2 & 1) != 0 ? content2.crossCurrencyTransaction : str, (i2 & 2) != 0 ? content2.backgroundParams : str2, (i2 & 4) != 0 ? content2.incentiveOfferProgramId : str3, (i2 & 8) != 0 ? content2.presentmentType : str4, (i2 & 16) != 0 ? content2.product : str5, (i2 & 32) != 0 ? content2.termsLink : str6, (i2 & 64) != 0 ? content2.incentiveOfferProgramCode : str7, (i2 & 128) != 0 ? content2.offerType : str8, (i2 & 256) != 0 ? content2.cartAmountCurrencyCode : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? content2.presentmentStyle : str10, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? content2.headlineText : str11, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? content2.offerText2 : str12, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? content2.offerText1 : str13, (i2 & 8192) != 0 ? content2.incentiveOfferCurrencyCode : str14, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? content2.currencyConversionRate : str15, (i2 & 32768) != 0 ? content2.cartAmount : str16, (i2 & 65536) != 0 ? content2.messageDescription : str17, (i2 & 131072) != 0 ? content2.ctaText : str18, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? content2.logo : str19, (i2 & 524288) != 0 ? content2.incentiveOfferValue : str20, (i2 & 1048576) != 0 ? content2.visaActive : str21, (i2 & 2097152) != 0 ? content2.backgroundType : str22, (i2 & 4194304) != 0 ? content2.termsLinkText : str23, (i2 & 8388608) != 0 ? content2.termsText : str24, (i2 & 16777216) != 0 ? content2.offerTextTemplate : str25, (i2 & 33554432) != 0 ? content2.offerCategory : str26, (i2 & 67108864) != 0 ? content2.offerCheckoutButtonText : str27, (i2 & 134217728) != 0 ? content2.learnMoreLink : str28, (i2 & 268435456) != 0 ? content2.learnMoreText : str29, (i2 & 536870912) != 0 ? content2.additionalProperties : map);
    }

    public final String component1() {
        return this.crossCurrencyTransaction;
    }

    public final String component10() {
        return this.presentmentStyle;
    }

    public final String component11() {
        return this.headlineText;
    }

    public final String component12() {
        return this.offerText2;
    }

    public final String component13() {
        return this.offerText1;
    }

    public final String component14() {
        return this.incentiveOfferCurrencyCode;
    }

    public final String component15() {
        return this.currencyConversionRate;
    }

    public final String component16() {
        return this.cartAmount;
    }

    public final String component17() {
        return this.messageDescription;
    }

    public final String component18() {
        return this.ctaText;
    }

    public final String component19() {
        return this.logo;
    }

    public final String component2() {
        return this.backgroundParams;
    }

    public final String component20() {
        return this.incentiveOfferValue;
    }

    public final String component21() {
        return this.visaActive;
    }

    public final String component22() {
        return this.backgroundType;
    }

    public final String component23() {
        return this.termsLinkText;
    }

    public final String component24() {
        return this.termsText;
    }

    public final String component25() {
        return this.offerTextTemplate;
    }

    public final String component26() {
        return this.offerCategory;
    }

    public final String component27() {
        return this.offerCheckoutButtonText;
    }

    public final String component28() {
        return this.learnMoreLink;
    }

    public final String component29() {
        return this.learnMoreText;
    }

    public final String component3() {
        return this.incentiveOfferProgramId;
    }

    public final Map<String, Object> component30() {
        return this.additionalProperties;
    }

    public final String component4() {
        return this.presentmentType;
    }

    public final String component5() {
        return this.product;
    }

    public final String component6() {
        return this.termsLink;
    }

    public final String component7() {
        return this.incentiveOfferProgramCode;
    }

    public final String component8() {
        return this.offerType;
    }

    public final String component9() {
        return this.cartAmountCurrencyCode;
    }

    public final Content copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, Map<String, ? extends Object> map) {
        String str30 = str;
        C19383o.m32797g(str5, "product");
        C19383o.m32797g(map, "additionalProperties");
        return new Content(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return C19383o.m32792b(this.crossCurrencyTransaction, content.crossCurrencyTransaction) && C19383o.m32792b(this.backgroundParams, content.backgroundParams) && C19383o.m32792b(this.incentiveOfferProgramId, content.incentiveOfferProgramId) && C19383o.m32792b(this.presentmentType, content.presentmentType) && C19383o.m32792b(this.product, content.product) && C19383o.m32792b(this.termsLink, content.termsLink) && C19383o.m32792b(this.incentiveOfferProgramCode, content.incentiveOfferProgramCode) && C19383o.m32792b(this.offerType, content.offerType) && C19383o.m32792b(this.cartAmountCurrencyCode, content.cartAmountCurrencyCode) && C19383o.m32792b(this.presentmentStyle, content.presentmentStyle) && C19383o.m32792b(this.headlineText, content.headlineText) && C19383o.m32792b(this.offerText2, content.offerText2) && C19383o.m32792b(this.offerText1, content.offerText1) && C19383o.m32792b(this.incentiveOfferCurrencyCode, content.incentiveOfferCurrencyCode) && C19383o.m32792b(this.currencyConversionRate, content.currencyConversionRate) && C19383o.m32792b(this.cartAmount, content.cartAmount) && C19383o.m32792b(this.messageDescription, content.messageDescription) && C19383o.m32792b(this.ctaText, content.ctaText) && C19383o.m32792b(this.logo, content.logo) && C19383o.m32792b(this.incentiveOfferValue, content.incentiveOfferValue) && C19383o.m32792b(this.visaActive, content.visaActive) && C19383o.m32792b(this.backgroundType, content.backgroundType) && C19383o.m32792b(this.termsLinkText, content.termsLinkText) && C19383o.m32792b(this.termsText, content.termsText) && C19383o.m32792b(this.offerTextTemplate, content.offerTextTemplate) && C19383o.m32792b(this.offerCategory, content.offerCategory) && C19383o.m32792b(this.offerCheckoutButtonText, content.offerCheckoutButtonText) && C19383o.m32792b(this.learnMoreLink, content.learnMoreLink) && C19383o.m32792b(this.learnMoreText, content.learnMoreText) && C19383o.m32792b(this.additionalProperties, content.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getBackgroundParams() {
        return this.backgroundParams;
    }

    public final String getBackgroundType() {
        return this.backgroundType;
    }

    public final String getCartAmount() {
        return this.cartAmount;
    }

    public final String getCartAmountCurrencyCode() {
        return this.cartAmountCurrencyCode;
    }

    public final String getCrossCurrencyTransaction() {
        return this.crossCurrencyTransaction;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getCurrencyConversionRate() {
        return this.currencyConversionRate;
    }

    public final String getHeadlineText() {
        return this.headlineText;
    }

    public final String getIncentiveOfferCurrencyCode() {
        return this.incentiveOfferCurrencyCode;
    }

    public final String getIncentiveOfferProgramCode() {
        return this.incentiveOfferProgramCode;
    }

    public final String getIncentiveOfferProgramId() {
        return this.incentiveOfferProgramId;
    }

    public final String getIncentiveOfferValue() {
        return this.incentiveOfferValue;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final String getOfferCategory() {
        return this.offerCategory;
    }

    public final String getOfferCheckoutButtonText() {
        return this.offerCheckoutButtonText;
    }

    public final String getOfferText1() {
        return this.offerText1;
    }

    public final String getOfferText2() {
        return this.offerText2;
    }

    public final String getOfferTextTemplate() {
        return this.offerTextTemplate;
    }

    public final String getOfferType() {
        return this.offerType;
    }

    public final String getPresentmentStyle() {
        return this.presentmentStyle;
    }

    public final String getPresentmentType() {
        return this.presentmentType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getTermsLink() {
        return this.termsLink;
    }

    public final String getTermsLinkText() {
        return this.termsLinkText;
    }

    public final String getTermsText() {
        return this.termsText;
    }

    public final String getVisaActive() {
        return this.visaActive;
    }

    public int hashCode() {
        String str = this.crossCurrencyTransaction;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundParams;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.incentiveOfferProgramId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.presentmentType;
        int e = C0023f.m105e(this.product, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.termsLink;
        int hashCode4 = (e + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.incentiveOfferProgramCode;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerType;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cartAmountCurrencyCode;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.presentmentStyle;
        int hashCode8 = (hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.headlineText;
        int hashCode9 = (hashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.offerText2;
        int hashCode10 = (hashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.offerText1;
        int hashCode11 = (hashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.incentiveOfferCurrencyCode;
        int hashCode12 = (hashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.currencyConversionRate;
        int hashCode13 = (hashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cartAmount;
        int hashCode14 = (hashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.messageDescription;
        int hashCode15 = (hashCode14 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.ctaText;
        int hashCode16 = (hashCode15 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.logo;
        int hashCode17 = (hashCode16 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.incentiveOfferValue;
        int hashCode18 = (hashCode17 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.visaActive;
        int hashCode19 = (hashCode18 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.backgroundType;
        int hashCode20 = (hashCode19 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.termsLinkText;
        int hashCode21 = (hashCode20 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.termsText;
        int hashCode22 = (hashCode21 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.offerTextTemplate;
        int hashCode23 = (hashCode22 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.offerCategory;
        int hashCode24 = (hashCode23 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.offerCheckoutButtonText;
        int hashCode25 = (hashCode24 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.learnMoreLink;
        int hashCode26 = (hashCode25 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.learnMoreText;
        if (str28 != null) {
            i = str28.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode26 + i) * 31);
    }

    public String toString() {
        String str = this.crossCurrencyTransaction;
        String str2 = this.backgroundParams;
        String str3 = this.incentiveOfferProgramId;
        String str4 = this.presentmentType;
        String str5 = this.product;
        String str6 = this.termsLink;
        String str7 = this.incentiveOfferProgramCode;
        String str8 = this.offerType;
        String str9 = this.cartAmountCurrencyCode;
        String str10 = this.presentmentStyle;
        String str11 = this.headlineText;
        String str12 = this.offerText2;
        String str13 = this.offerText1;
        String str14 = this.incentiveOfferCurrencyCode;
        String str15 = this.currencyConversionRate;
        String str16 = this.cartAmount;
        String str17 = this.messageDescription;
        String str18 = this.ctaText;
        String str19 = this.logo;
        String str20 = this.incentiveOfferValue;
        String str21 = this.visaActive;
        String str22 = this.backgroundType;
        String str23 = this.termsLinkText;
        String str24 = this.termsText;
        String str25 = this.offerTextTemplate;
        String str26 = this.offerCategory;
        String str27 = this.offerCheckoutButtonText;
        String str28 = this.learnMoreLink;
        String str29 = this.learnMoreText;
        StringBuilder f = C0388a.m1050f("Content(crossCurrencyTransaction=", str, ", backgroundParams=", str2, ", incentiveOfferProgramId=");
        C0391c.m1061h(f, str3, ", presentmentType=", str4, ", product=");
        C0391c.m1061h(f, str5, ", termsLink=", str6, ", incentiveOfferProgramCode=");
        C0391c.m1061h(f, str7, ", offerType=", str8, ", cartAmountCurrencyCode=");
        C0391c.m1061h(f, str9, ", presentmentStyle=", str10, ", headlineText=");
        C0391c.m1061h(f, str11, ", offerText2=", str12, ", offerText1=");
        C0391c.m1061h(f, str13, ", incentiveOfferCurrencyCode=", str14, ", currencyConversionRate=");
        C0391c.m1061h(f, str15, ", cartAmount=", str16, ", messageDescription=");
        C0391c.m1061h(f, str17, ", ctaText=", str18, ", logo=");
        C0391c.m1061h(f, str19, ", incentiveOfferValue=", str20, ", visaActive=");
        C0391c.m1061h(f, str21, ", backgroundType=", str22, ", termsLinkText=");
        C0391c.m1061h(f, str23, ", termsText=", str24, ", offerTextTemplate=");
        C0391c.m1061h(f, str25, ", offerCategory=", str26, ", offerCheckoutButtonText=");
        C0391c.m1061h(f, str27, ", learnMoreLink=", str28, ", learnMoreText=");
        f.append(str29);
        f.append(", additionalProperties=");
        f.append(this.additionalProperties);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Content(java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.util.Map r64, int r65, kotlin.jvm.internal.DefaultConstructorMarker r66) {
        /*
            r34 = this;
            r0 = r65
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r35
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r36
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r37
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r38
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r40
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r41
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r42
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r43
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r44
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r45
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0059
            r15 = r2
            goto L_0x005b
        L_0x0059:
            r15 = r46
        L_0x005b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0062
            r16 = r2
            goto L_0x0064
        L_0x0062:
            r16 = r47
        L_0x0064:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            r17 = r2
            goto L_0x006d
        L_0x006b:
            r17 = r48
        L_0x006d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0074
            r18 = r2
            goto L_0x0076
        L_0x0074:
            r18 = r49
        L_0x0076:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007f
            r19 = r2
            goto L_0x0081
        L_0x007f:
            r19 = r50
        L_0x0081:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0089
            r20 = r2
            goto L_0x008b
        L_0x0089:
            r20 = r51
        L_0x008b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0093
            r21 = r2
            goto L_0x0095
        L_0x0093:
            r21 = r52
        L_0x0095:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009d
            r22 = r2
            goto L_0x009f
        L_0x009d:
            r22 = r53
        L_0x009f:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a7
            r23 = r2
            goto L_0x00a9
        L_0x00a7:
            r23 = r54
        L_0x00a9:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b1
            r24 = r2
            goto L_0x00b3
        L_0x00b1:
            r24 = r55
        L_0x00b3:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bb
            r25 = r2
            goto L_0x00bd
        L_0x00bb:
            r25 = r56
        L_0x00bd:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c5
            r26 = r2
            goto L_0x00c7
        L_0x00c5:
            r26 = r57
        L_0x00c7:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00cf
            r27 = r2
            goto L_0x00d1
        L_0x00cf:
            r27 = r58
        L_0x00d1:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d9
            r28 = r2
            goto L_0x00db
        L_0x00d9:
            r28 = r59
        L_0x00db:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e3
            r29 = r2
            goto L_0x00e5
        L_0x00e3:
            r29 = r60
        L_0x00e5:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ed
            r30 = r2
            goto L_0x00ef
        L_0x00ed:
            r30 = r61
        L_0x00ef:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00f7
            r31 = r2
            goto L_0x00f9
        L_0x00f7:
            r31 = r62
        L_0x00f9:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0101
            r32 = r2
            goto L_0x0103
        L_0x0101:
            r32 = r63
        L_0x0103:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0110
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r33 = r0
            goto L_0x0112
        L_0x0110:
            r33 = r64
        L_0x0112:
            r3 = r34
            r8 = r39
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Content.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
