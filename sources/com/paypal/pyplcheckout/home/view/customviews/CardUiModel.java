package com.paypal.pyplcheckout.home.view.customviews;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.pojo.Plan;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public abstract class CardUiModel {

    public static abstract class AddCardUiModel extends CardUiModel {

        public static final class Native extends AddCardUiModel {
            private final int backgroundImage;

            public Native(int i) {
                super((DefaultConstructorMarker) null);
                this.backgroundImage = i;
            }

            public static /* synthetic */ Native copy$default(Native nativeR, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = nativeR.getBackgroundImage();
                }
                return nativeR.copy(i);
            }

            public final int component1() {
                return getBackgroundImage();
            }

            public final Native copy(int i) {
                return new Native(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Native) && getBackgroundImage() == ((Native) obj).getBackgroundImage();
            }

            public int getBackgroundImage() {
                return this.backgroundImage;
            }

            public int hashCode() {
                return Integer.hashCode(getBackgroundImage());
            }

            public String toString() {
                return C0069a.m175f("Native(backgroundImage=", getBackgroundImage(), ")");
            }
        }

        public static final class Web extends AddCardUiModel {
            private final int backgroundImage;

            public Web(int i) {
                super((DefaultConstructorMarker) null);
                this.backgroundImage = i;
            }

            public static /* synthetic */ Web copy$default(Web web, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = web.getBackgroundImage();
                }
                return web.copy(i);
            }

            public final int component1() {
                return getBackgroundImage();
            }

            public final Web copy(int i) {
                return new Web(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Web) && getBackgroundImage() == ((Web) obj).getBackgroundImage();
            }

            public int getBackgroundImage() {
                return this.backgroundImage;
            }

            public int hashCode() {
                return Integer.hashCode(getBackgroundImage());
            }

            public String toString() {
                return C0069a.m175f("Web(backgroundImage=", getBackgroundImage(), ")");
            }
        }

        private AddCardUiModel() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ AddCardUiModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getBackgroundImage();
    }

    public static final class CardDesignModel {
        private final int backgroundImage;
        private final int textColor;

        public CardDesignModel(int i, int i2) {
            this.backgroundImage = i;
            this.textColor = i2;
        }

        public static /* synthetic */ CardDesignModel copy$default(CardDesignModel cardDesignModel, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = cardDesignModel.backgroundImage;
            }
            if ((i3 & 2) != 0) {
                i2 = cardDesignModel.textColor;
            }
            return cardDesignModel.copy(i, i2);
        }

        public final int component1() {
            return this.backgroundImage;
        }

        public final int component2() {
            return this.textColor;
        }

        public final CardDesignModel copy(int i, int i2) {
            return new CardDesignModel(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardDesignModel)) {
                return false;
            }
            CardDesignModel cardDesignModel = (CardDesignModel) obj;
            return this.backgroundImage == cardDesignModel.backgroundImage && this.textColor == cardDesignModel.textColor;
        }

        public final int getBackgroundImage() {
            return this.backgroundImage;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.textColor) + (Integer.hashCode(this.backgroundImage) * 31);
        }

        public String toString() {
            return C0070b.m183e("CardDesignModel(backgroundImage=", this.backgroundImage, ", textColor=", this.textColor, ")");
        }
    }

    public static final class OfferCardUiModel extends CardUiModel {
        private final int backgroundImage;
        private final String ctaText;

        /* renamed from: id */
        private final String f37745id;
        private final String offerDescription;
        private final String termsLink;
        private final String termsText;

        public OfferCardUiModel(String str, int i, String str2, String str3, String str4, String str5) {
            super((DefaultConstructorMarker) null);
            this.f37745id = str;
            this.backgroundImage = i;
            this.termsLink = str2;
            this.termsText = str3;
            this.offerDescription = str4;
            this.ctaText = str5;
        }

        public static /* synthetic */ OfferCardUiModel copy$default(OfferCardUiModel offerCardUiModel, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = offerCardUiModel.f37745id;
            }
            if ((i2 & 2) != 0) {
                i = offerCardUiModel.backgroundImage;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str2 = offerCardUiModel.termsLink;
            }
            String str6 = str2;
            if ((i2 & 8) != 0) {
                str3 = offerCardUiModel.termsText;
            }
            String str7 = str3;
            if ((i2 & 16) != 0) {
                str4 = offerCardUiModel.offerDescription;
            }
            String str8 = str4;
            if ((i2 & 32) != 0) {
                str5 = offerCardUiModel.ctaText;
            }
            return offerCardUiModel.copy(str, i3, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.f37745id;
        }

        public final int component2() {
            return this.backgroundImage;
        }

        public final String component3() {
            return this.termsLink;
        }

        public final String component4() {
            return this.termsText;
        }

        public final String component5() {
            return this.offerDescription;
        }

        public final String component6() {
            return this.ctaText;
        }

        public final OfferCardUiModel copy(String str, int i, String str2, String str3, String str4, String str5) {
            return new OfferCardUiModel(str, i, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferCardUiModel)) {
                return false;
            }
            OfferCardUiModel offerCardUiModel = (OfferCardUiModel) obj;
            return C19383o.m32792b(this.f37745id, offerCardUiModel.f37745id) && this.backgroundImage == offerCardUiModel.backgroundImage && C19383o.m32792b(this.termsLink, offerCardUiModel.termsLink) && C19383o.m32792b(this.termsText, offerCardUiModel.termsText) && C19383o.m32792b(this.offerDescription, offerCardUiModel.offerDescription) && C19383o.m32792b(this.ctaText, offerCardUiModel.ctaText);
        }

        public final int getBackgroundImage() {
            return this.backgroundImage;
        }

        public final String getCtaText() {
            return this.ctaText;
        }

        public final String getId() {
            return this.f37745id;
        }

        public final String getOfferDescription() {
            return this.offerDescription;
        }

        public final String getTermsLink() {
            return this.termsLink;
        }

        public final String getTermsText() {
            return this.termsText;
        }

        public int hashCode() {
            String str = this.f37745id;
            int i = 0;
            int a = C0069a.m170a(this.backgroundImage, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.termsLink;
            int hashCode = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.termsText;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.offerDescription;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.ctaText;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            String str = this.f37745id;
            int i = this.backgroundImage;
            String str2 = this.termsLink;
            String str3 = this.termsText;
            String str4 = this.offerDescription;
            String str5 = this.ctaText;
            StringBuilder sb = new StringBuilder();
            sb.append("OfferCardUiModel(id=");
            sb.append(str);
            sb.append(", backgroundImage=");
            sb.append(i);
            sb.append(", termsLink=");
            C0391c.m1061h(sb, str2, ", termsText=", str3, ", offerDescription=");
            return C0073e.m210j(sb, str4, ", ctaText=", str5, ")");
        }
    }

    private CardUiModel() {
    }

    public /* synthetic */ CardUiModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class PaymentSourceUiModel extends CardUiModel {
        public static final String BANK_ACCOUNT = "BANK_ACCOUNT";
        public static final String CRYPTOCURRENCY = "CRYPTOCURRENCY";
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String PAYPAL = "PAYPAL";
        private final Amount availableAmount;
        private final String cardArtUrl;
        private final CardDesignModel cardDesign;
        private final String cardFormattedType;
        private final String fundingOptionId;
        private final boolean isPreferredFundingOption;
        private final boolean isSelectedFundingOption;
        private final String lastFourDigits;
        private final String optionalText;
        private final String paymentCardLabel;
        private final Plan plan;
        private final String planId;
        private final boolean showFavoriteViewState;
        private final String type;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public PaymentSourceUiModel() {
            this((Plan) null, (String) null, (String) null, (String) null, (String) null, (String) null, (CardDesignModel) null, false, false, (String) null, false, (String) null, (String) null, (Amount) null, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ PaymentSourceUiModel(com.paypal.pyplcheckout.pojo.Plan r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.paypal.pyplcheckout.home.view.customviews.CardUiModel.CardDesignModel r23, boolean r24, boolean r25, java.lang.String r26, boolean r27, java.lang.String r28, java.lang.String r29, com.paypal.pyplcheckout.pojo.Amount r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
            /*
                r16 = this;
                r0 = r31
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000b
            L_0x0009:
                r1 = r17
            L_0x000b:
                r3 = r0 & 2
                java.lang.String r4 = ""
                if (r3 == 0) goto L_0x0013
                r3 = r4
                goto L_0x0015
            L_0x0013:
                r3 = r18
            L_0x0015:
                r5 = r0 & 4
                if (r5 == 0) goto L_0x001b
                r5 = r4
                goto L_0x001d
            L_0x001b:
                r5 = r19
            L_0x001d:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0023
                r6 = r4
                goto L_0x0025
            L_0x0023:
                r6 = r20
            L_0x0025:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x002b
                r7 = r4
                goto L_0x002d
            L_0x002b:
                r7 = r21
            L_0x002d:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x0033
                r8 = r4
                goto L_0x0035
            L_0x0033:
                r8 = r22
            L_0x0035:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x0043
                com.paypal.pyplcheckout.home.view.customviews.CardUiModel$CardDesignModel r9 = new com.paypal.pyplcheckout.home.view.customviews.CardUiModel$CardDesignModel
                int r10 = com.paypal.pyplcheckout.C17165R.C17166drawable.ic_payment_card_gray_bgd
                int r11 = com.paypal.pyplcheckout.C17165R.color.gray_color_700
                r9.<init>(r10, r11)
                goto L_0x0045
            L_0x0043:
                r9 = r23
            L_0x0045:
                r10 = r0 & 128(0x80, float:1.794E-43)
                r11 = 0
                if (r10 == 0) goto L_0x004c
                r10 = r11
                goto L_0x004e
            L_0x004c:
                r10 = r24
            L_0x004e:
                r12 = r0 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L_0x0054
                r12 = r11
                goto L_0x0056
            L_0x0054:
                r12 = r25
            L_0x0056:
                r13 = r0 & 512(0x200, float:7.175E-43)
                if (r13 == 0) goto L_0x005c
                r13 = r2
                goto L_0x005e
            L_0x005c:
                r13 = r26
            L_0x005e:
                r14 = r0 & 1024(0x400, float:1.435E-42)
                if (r14 == 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r11 = r27
            L_0x0065:
                r14 = r0 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L_0x006b
                r14 = r4
                goto L_0x006d
            L_0x006b:
                r14 = r28
            L_0x006d:
                r15 = r0 & 4096(0x1000, float:5.74E-42)
                if (r15 == 0) goto L_0x0072
                goto L_0x0074
            L_0x0072:
                r4 = r29
            L_0x0074:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x0079
                goto L_0x007b
            L_0x0079:
                r2 = r30
            L_0x007b:
                r17 = r16
                r18 = r1
                r19 = r3
                r20 = r5
                r21 = r6
                r22 = r7
                r23 = r8
                r24 = r9
                r25 = r10
                r26 = r12
                r27 = r13
                r28 = r11
                r29 = r14
                r30 = r4
                r31 = r2
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.CardUiModel.PaymentSourceUiModel.<init>(com.paypal.pyplcheckout.pojo.Plan, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.pyplcheckout.home.view.customviews.CardUiModel$CardDesignModel, boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.Amount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ PaymentSourceUiModel copy$default(PaymentSourceUiModel paymentSourceUiModel, Plan plan2, String str, String str2, String str3, String str4, String str5, CardDesignModel cardDesignModel, boolean z, boolean z2, String str6, boolean z3, String str7, String str8, Amount amount, int i, Object obj) {
            PaymentSourceUiModel paymentSourceUiModel2 = paymentSourceUiModel;
            int i2 = i;
            return paymentSourceUiModel.copy((i2 & 1) != 0 ? paymentSourceUiModel2.plan : plan2, (i2 & 2) != 0 ? paymentSourceUiModel2.planId : str, (i2 & 4) != 0 ? paymentSourceUiModel2.cardFormattedType : str2, (i2 & 8) != 0 ? paymentSourceUiModel2.type : str3, (i2 & 16) != 0 ? paymentSourceUiModel2.paymentCardLabel : str4, (i2 & 32) != 0 ? paymentSourceUiModel2.lastFourDigits : str5, (i2 & 64) != 0 ? paymentSourceUiModel2.cardDesign : cardDesignModel, (i2 & 128) != 0 ? paymentSourceUiModel2.isPreferredFundingOption : z, (i2 & 256) != 0 ? paymentSourceUiModel2.isSelectedFundingOption : z2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? paymentSourceUiModel2.optionalText : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? paymentSourceUiModel2.showFavoriteViewState : z3, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? paymentSourceUiModel2.fundingOptionId : str7, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? paymentSourceUiModel2.cardArtUrl : str8, (i2 & 8192) != 0 ? paymentSourceUiModel2.availableAmount : amount);
        }

        public final Plan component1() {
            return this.plan;
        }

        public final String component10() {
            return this.optionalText;
        }

        public final boolean component11() {
            return this.showFavoriteViewState;
        }

        public final String component12() {
            return this.fundingOptionId;
        }

        public final String component13() {
            return this.cardArtUrl;
        }

        public final Amount component14() {
            return this.availableAmount;
        }

        public final String component2() {
            return this.planId;
        }

        public final String component3() {
            return this.cardFormattedType;
        }

        public final String component4() {
            return this.type;
        }

        public final String component5() {
            return this.paymentCardLabel;
        }

        public final String component6() {
            return this.lastFourDigits;
        }

        public final CardDesignModel component7() {
            return this.cardDesign;
        }

        public final boolean component8() {
            return this.isPreferredFundingOption;
        }

        public final boolean component9() {
            return this.isSelectedFundingOption;
        }

        public final PaymentSourceUiModel copy(Plan plan2, String str, String str2, String str3, String str4, String str5, CardDesignModel cardDesignModel, boolean z, boolean z2, String str6, boolean z3, String str7, String str8, Amount amount) {
            String str9 = str;
            C19383o.m32797g(str9, "planId");
            String str10 = str2;
            C19383o.m32797g(str10, "cardFormattedType");
            String str11 = str3;
            C19383o.m32797g(str11, "type");
            String str12 = str4;
            C19383o.m32797g(str12, "paymentCardLabel");
            String str13 = str5;
            C19383o.m32797g(str13, "lastFourDigits");
            CardDesignModel cardDesignModel2 = cardDesignModel;
            C19383o.m32797g(cardDesignModel2, "cardDesign");
            String str14 = str7;
            C19383o.m32797g(str14, "fundingOptionId");
            String str15 = str8;
            C19383o.m32797g(str15, "cardArtUrl");
            return new PaymentSourceUiModel(plan2, str9, str10, str11, str12, str13, cardDesignModel2, z, z2, str6, z3, str14, str15, amount);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentSourceUiModel)) {
                return false;
            }
            PaymentSourceUiModel paymentSourceUiModel = (PaymentSourceUiModel) obj;
            return C19383o.m32792b(this.plan, paymentSourceUiModel.plan) && C19383o.m32792b(this.planId, paymentSourceUiModel.planId) && C19383o.m32792b(this.cardFormattedType, paymentSourceUiModel.cardFormattedType) && C19383o.m32792b(this.type, paymentSourceUiModel.type) && C19383o.m32792b(this.paymentCardLabel, paymentSourceUiModel.paymentCardLabel) && C19383o.m32792b(this.lastFourDigits, paymentSourceUiModel.lastFourDigits) && C19383o.m32792b(this.cardDesign, paymentSourceUiModel.cardDesign) && this.isPreferredFundingOption == paymentSourceUiModel.isPreferredFundingOption && this.isSelectedFundingOption == paymentSourceUiModel.isSelectedFundingOption && C19383o.m32792b(this.optionalText, paymentSourceUiModel.optionalText) && this.showFavoriteViewState == paymentSourceUiModel.showFavoriteViewState && C19383o.m32792b(this.fundingOptionId, paymentSourceUiModel.fundingOptionId) && C19383o.m32792b(this.cardArtUrl, paymentSourceUiModel.cardArtUrl) && C19383o.m32792b(this.availableAmount, paymentSourceUiModel.availableAmount);
        }

        public final Amount getAvailableAmount() {
            return this.availableAmount;
        }

        public final String getCardArtUrl() {
            return this.cardArtUrl;
        }

        public final CardDesignModel getCardDesign() {
            return this.cardDesign;
        }

        public final String getCardFormattedType() {
            return this.cardFormattedType;
        }

        public final String getFundingOptionId() {
            return this.fundingOptionId;
        }

        public final String getLastFourDigits() {
            return this.lastFourDigits;
        }

        public final String getOptionalText() {
            return this.optionalText;
        }

        public final String getPaymentCardLabel() {
            return this.paymentCardLabel;
        }

        public final Plan getPlan() {
            return this.plan;
        }

        public final String getPlanId() {
            return this.planId;
        }

        public final boolean getShowFavoriteViewState() {
            return this.showFavoriteViewState;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            Plan plan2 = this.plan;
            int i = 0;
            int hashCode = (this.cardDesign.hashCode() + C0023f.m105e(this.lastFourDigits, C0023f.m105e(this.paymentCardLabel, C0023f.m105e(this.type, C0023f.m105e(this.cardFormattedType, C0023f.m105e(this.planId, (plan2 == null ? 0 : plan2.hashCode()) * 31, 31), 31), 31), 31), 31)) * 31;
            boolean z = this.isPreferredFundingOption;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.isSelectedFundingOption;
            if (z3) {
                z3 = true;
            }
            int i3 = (i2 + (z3 ? 1 : 0)) * 31;
            String str = this.optionalText;
            int hashCode2 = (i3 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z4 = this.showFavoriteViewState;
            if (!z4) {
                z2 = z4;
            }
            int e = C0023f.m105e(this.cardArtUrl, C0023f.m105e(this.fundingOptionId, (hashCode2 + (z2 ? 1 : 0)) * 31, 31), 31);
            Amount amount = this.availableAmount;
            if (amount != null) {
                i = amount.hashCode();
            }
            return e + i;
        }

        public final boolean isPreferredFundingOption() {
            return this.isPreferredFundingOption;
        }

        public final boolean isSelectedFundingOption() {
            return this.isSelectedFundingOption;
        }

        public String toString() {
            Plan plan2 = this.plan;
            String str = this.planId;
            String str2 = this.cardFormattedType;
            String str3 = this.type;
            String str4 = this.paymentCardLabel;
            String str5 = this.lastFourDigits;
            CardDesignModel cardDesignModel = this.cardDesign;
            boolean z = this.isPreferredFundingOption;
            boolean z2 = this.isSelectedFundingOption;
            String str6 = this.optionalText;
            boolean z3 = this.showFavoriteViewState;
            String str7 = this.fundingOptionId;
            String str8 = this.cardArtUrl;
            Amount amount = this.availableAmount;
            StringBuilder sb = new StringBuilder();
            sb.append("PaymentSourceUiModel(plan=");
            sb.append(plan2);
            sb.append(", planId=");
            sb.append(str);
            sb.append(", cardFormattedType=");
            C0391c.m1061h(sb, str2, ", type=", str3, ", paymentCardLabel=");
            C0391c.m1061h(sb, str4, ", lastFourDigits=", str5, ", cardDesign=");
            sb.append(cardDesignModel);
            sb.append(", isPreferredFundingOption=");
            sb.append(z);
            sb.append(", isSelectedFundingOption=");
            sb.append(z2);
            sb.append(", optionalText=");
            sb.append(str6);
            sb.append(", showFavoriteViewState=");
            sb.append(z3);
            sb.append(", fundingOptionId=");
            sb.append(str7);
            sb.append(", cardArtUrl=");
            sb.append(str8);
            sb.append(", availableAmount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PaymentSourceUiModel(Plan plan2, String str, String str2, String str3, String str4, String str5, CardDesignModel cardDesignModel, boolean z, boolean z2, String str6, boolean z3, String str7, String str8, Amount amount) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "planId");
            C19383o.m32797g(str2, "cardFormattedType");
            C19383o.m32797g(str3, "type");
            C19383o.m32797g(str4, "paymentCardLabel");
            C19383o.m32797g(str5, "lastFourDigits");
            C19383o.m32797g(cardDesignModel, "cardDesign");
            C19383o.m32797g(str7, "fundingOptionId");
            C19383o.m32797g(str8, "cardArtUrl");
            this.plan = plan2;
            this.planId = str;
            this.cardFormattedType = str2;
            this.type = str3;
            this.paymentCardLabel = str4;
            this.lastFourDigits = str5;
            this.cardDesign = cardDesignModel;
            this.isPreferredFundingOption = z;
            this.isSelectedFundingOption = z2;
            this.optionalText = str6;
            this.showFavoriteViewState = z3;
            this.fundingOptionId = str7;
            this.cardArtUrl = str8;
            this.availableAmount = amount;
        }
    }
}
