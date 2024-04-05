package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingExpressCheckoutPaymentOption {
    public static final int $stable = 8;
    private final List<String> iconClasses;
    private final String iconText;
    private final String inputId;
    private final String label;
    private final String paymentMethod;
    private final Boolean selected;
    private final String submitClasses;
    private final String submitText;
    private final SvgIconData svgIconData;
    private final String termsLink;
    private final String termsText;

    public ListingExpressCheckoutPaymentOption() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (SvgIconData) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public ListingExpressCheckoutPaymentOption(@C17402n(name = "icon_classes") List<String> list, @C17402n(name = "icon_text") String str, @C17402n(name = "input_id") String str2, @C17402n(name = "label") String str3, @C17402n(name = "payment_method") String str4, @C17402n(name = "selected") Boolean bool, @C17402n(name = "submit_classes") String str5, @C17402n(name = "submit_text") String str6, @C17402n(name = "svg_icon_data") SvgIconData svgIconData2, @C17402n(name = "terms_link") String str7, @C17402n(name = "terms_text") String str8) {
        this.iconClasses = list;
        this.iconText = str;
        this.inputId = str2;
        this.label = str3;
        this.paymentMethod = str4;
        this.selected = bool;
        this.submitClasses = str5;
        this.submitText = str6;
        this.svgIconData = svgIconData2;
        this.termsLink = str7;
        this.termsText = str8;
    }

    public static /* synthetic */ ListingExpressCheckoutPaymentOption copy$default(ListingExpressCheckoutPaymentOption listingExpressCheckoutPaymentOption, List list, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, SvgIconData svgIconData2, String str7, String str8, int i, Object obj) {
        ListingExpressCheckoutPaymentOption listingExpressCheckoutPaymentOption2 = listingExpressCheckoutPaymentOption;
        int i2 = i;
        return listingExpressCheckoutPaymentOption.copy((i2 & 1) != 0 ? listingExpressCheckoutPaymentOption2.iconClasses : list, (i2 & 2) != 0 ? listingExpressCheckoutPaymentOption2.iconText : str, (i2 & 4) != 0 ? listingExpressCheckoutPaymentOption2.inputId : str2, (i2 & 8) != 0 ? listingExpressCheckoutPaymentOption2.label : str3, (i2 & 16) != 0 ? listingExpressCheckoutPaymentOption2.paymentMethod : str4, (i2 & 32) != 0 ? listingExpressCheckoutPaymentOption2.selected : bool, (i2 & 64) != 0 ? listingExpressCheckoutPaymentOption2.submitClasses : str5, (i2 & 128) != 0 ? listingExpressCheckoutPaymentOption2.submitText : str6, (i2 & 256) != 0 ? listingExpressCheckoutPaymentOption2.svgIconData : svgIconData2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingExpressCheckoutPaymentOption2.termsLink : str7, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingExpressCheckoutPaymentOption2.termsText : str8);
    }

    public final List<String> component1() {
        return this.iconClasses;
    }

    public final String component10() {
        return this.termsLink;
    }

    public final String component11() {
        return this.termsText;
    }

    public final String component2() {
        return this.iconText;
    }

    public final String component3() {
        return this.inputId;
    }

    public final String component4() {
        return this.label;
    }

    public final String component5() {
        return this.paymentMethod;
    }

    public final Boolean component6() {
        return this.selected;
    }

    public final String component7() {
        return this.submitClasses;
    }

    public final String component8() {
        return this.submitText;
    }

    public final SvgIconData component9() {
        return this.svgIconData;
    }

    public final ListingExpressCheckoutPaymentOption copy(@C17402n(name = "icon_classes") List<String> list, @C17402n(name = "icon_text") String str, @C17402n(name = "input_id") String str2, @C17402n(name = "label") String str3, @C17402n(name = "payment_method") String str4, @C17402n(name = "selected") Boolean bool, @C17402n(name = "submit_classes") String str5, @C17402n(name = "submit_text") String str6, @C17402n(name = "svg_icon_data") SvgIconData svgIconData2, @C17402n(name = "terms_link") String str7, @C17402n(name = "terms_text") String str8) {
        return new ListingExpressCheckoutPaymentOption(list, str, str2, str3, str4, bool, str5, str6, svgIconData2, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingExpressCheckoutPaymentOption)) {
            return false;
        }
        ListingExpressCheckoutPaymentOption listingExpressCheckoutPaymentOption = (ListingExpressCheckoutPaymentOption) obj;
        return C19383o.m32792b(this.iconClasses, listingExpressCheckoutPaymentOption.iconClasses) && C19383o.m32792b(this.iconText, listingExpressCheckoutPaymentOption.iconText) && C19383o.m32792b(this.inputId, listingExpressCheckoutPaymentOption.inputId) && C19383o.m32792b(this.label, listingExpressCheckoutPaymentOption.label) && C19383o.m32792b(this.paymentMethod, listingExpressCheckoutPaymentOption.paymentMethod) && C19383o.m32792b(this.selected, listingExpressCheckoutPaymentOption.selected) && C19383o.m32792b(this.submitClasses, listingExpressCheckoutPaymentOption.submitClasses) && C19383o.m32792b(this.submitText, listingExpressCheckoutPaymentOption.submitText) && C19383o.m32792b(this.svgIconData, listingExpressCheckoutPaymentOption.svgIconData) && C19383o.m32792b(this.termsLink, listingExpressCheckoutPaymentOption.termsLink) && C19383o.m32792b(this.termsText, listingExpressCheckoutPaymentOption.termsText);
    }

    public final List<String> getIconClasses() {
        return this.iconClasses;
    }

    public final String getIconText() {
        return this.iconText;
    }

    public final String getInputId() {
        return this.inputId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final String getSubmitClasses() {
        return this.submitClasses;
    }

    public final String getSubmitText() {
        return this.submitText;
    }

    public final SvgIconData getSvgIconData() {
        return this.svgIconData;
    }

    public final String getTermsLink() {
        return this.termsLink;
    }

    public final String getTermsText() {
        return this.termsText;
    }

    public int hashCode() {
        List<String> list = this.iconClasses;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.iconText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inputId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymentMethod;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.selected;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.submitClasses;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.submitText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SvgIconData svgIconData2 = this.svgIconData;
        int hashCode9 = (hashCode8 + (svgIconData2 == null ? 0 : svgIconData2.hashCode())) * 31;
        String str7 = this.termsLink;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.termsText;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingExpressCheckoutPaymentOption(iconClasses=");
        h.append(this.iconClasses);
        h.append(", iconText=");
        h.append(this.iconText);
        h.append(", inputId=");
        h.append(this.inputId);
        h.append(", label=");
        h.append(this.label);
        h.append(", paymentMethod=");
        h.append(this.paymentMethod);
        h.append(", selected=");
        h.append(this.selected);
        h.append(", submitClasses=");
        h.append(this.submitClasses);
        h.append(", submitText=");
        h.append(this.submitText);
        h.append(", svgIconData=");
        h.append(this.svgIconData);
        h.append(", termsLink=");
        h.append(this.termsLink);
        h.append(", termsText=");
        return C0391c.m1057c(h, this.termsText, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingExpressCheckoutPaymentOption(java.util.List r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, java.lang.String r19, java.lang.String r20, com.etsy.android.lib.models.apiv3.listing.SvgIconData r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.SvgIconData, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
