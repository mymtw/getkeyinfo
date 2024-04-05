package com.paypal.pyplcheckout.pojo;

import android.content.Context;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19453g;
import kotlin.text.C19457k;
import p650pn.C18417a;

public final class FundingInstrument {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("amount")
    private Amount amount;
    @C18417a("cryptocurrencyHoldingDetails")
    private final CryptoCurrencyHoldingDetails cryptocurrencyHoldingDetails;
    @C18417a("formattedType")
    private final String formattedType;
    @C18417a("id")

    /* renamed from: id */
    private final String f37790id;
    @C18417a("image")
    private final Image image;
    @C18417a("instrumentSubType")
    private final String instrumentSubType;
    @C18417a("isPreferred")
    private final Boolean isPreferred;
    @C18417a("label")
    private final String label;
    @C18417a("lastDigits")
    private final String lastDigits;
    @C18417a("name")
    private final String name;
    @C18417a("type")
    private final String type;

    public FundingInstrument() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Image) null, (Boolean) null, (CryptoCurrencyHoldingDetails) null, (Map) null, (Amount) null, 4095, (DefaultConstructorMarker) null);
    }

    public FundingInstrument(String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image2, Boolean bool, CryptoCurrencyHoldingDetails cryptoCurrencyHoldingDetails, Map<String, Object> map, Amount amount2) {
        C19383o.m32797g(map, "additionalProperties");
        this.f37790id = str;
        this.name = str2;
        this.label = str3;
        this.type = str4;
        this.formattedType = str5;
        this.instrumentSubType = str6;
        this.lastDigits = str7;
        this.image = image2;
        this.isPreferred = bool;
        this.cryptocurrencyHoldingDetails = cryptoCurrencyHoldingDetails;
        this.additionalProperties = map;
        this.amount = amount2;
    }

    public static /* synthetic */ FundingInstrument copy$default(FundingInstrument fundingInstrument, String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image2, Boolean bool, CryptoCurrencyHoldingDetails cryptoCurrencyHoldingDetails, Map map, Amount amount2, int i, Object obj) {
        FundingInstrument fundingInstrument2 = fundingInstrument;
        int i2 = i;
        return fundingInstrument.copy((i2 & 1) != 0 ? fundingInstrument2.f37790id : str, (i2 & 2) != 0 ? fundingInstrument2.name : str2, (i2 & 4) != 0 ? fundingInstrument2.label : str3, (i2 & 8) != 0 ? fundingInstrument2.type : str4, (i2 & 16) != 0 ? fundingInstrument2.formattedType : str5, (i2 & 32) != 0 ? fundingInstrument2.instrumentSubType : str6, (i2 & 64) != 0 ? fundingInstrument2.lastDigits : str7, (i2 & 128) != 0 ? fundingInstrument2.image : image2, (i2 & 256) != 0 ? fundingInstrument2.isPreferred : bool, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? fundingInstrument2.cryptocurrencyHoldingDetails : cryptoCurrencyHoldingDetails, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? fundingInstrument2.additionalProperties : map, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? fundingInstrument2.amount : amount2);
    }

    private final String localizeAccountType(Context context, String str) {
        String lowercase = str == null ? null : StringExtensionsKt.lowercase(str);
        if (lowercase != null) {
            switch (lowercase.hashCode()) {
                case -1352291591:
                    if (lowercase.equals("credit")) {
                        String string = context.getResources().getString(C17165R.string.paypal_checkout_credit_text);
                        C19383o.m32796f(string, "context.resources.getStr…pal_checkout_credit_text)");
                        return string;
                    }
                    break;
                case -995205389:
                    return !lowercase.equals("paypal") ? "" : str;
                case 1536898522:
                    if (lowercase.equals("checking")) {
                        String string2 = context.getResources().getString(C17165R.string.paypal_checkout_checking);
                        C19383o.m32796f(string2, "context.resources.getStr…paypal_checkout_checking)");
                        return string2;
                    }
                    break;
                case 1872948409:
                    if (lowercase.equals("savings")) {
                        String string3 = context.getResources().getString(C17165R.string.paypal_checkout_savings);
                        C19383o.m32796f(string3, "context.resources.getStr….paypal_checkout_savings)");
                        return string3;
                    }
                    break;
            }
        }
    }

    public final String component1() {
        return this.f37790id;
    }

    public final CryptoCurrencyHoldingDetails component10() {
        return this.cryptocurrencyHoldingDetails;
    }

    public final Map<String, Object> component11() {
        return this.additionalProperties;
    }

    public final Amount component12() {
        return this.amount;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.formattedType;
    }

    public final String component6() {
        return this.instrumentSubType;
    }

    public final String component7() {
        return this.lastDigits;
    }

    public final Image component8() {
        return this.image;
    }

    public final Boolean component9() {
        return this.isPreferred;
    }

    public final FundingInstrument copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image2, Boolean bool, CryptoCurrencyHoldingDetails cryptoCurrencyHoldingDetails, Map<String, Object> map, Amount amount2) {
        Map<String, Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new FundingInstrument(str, str2, str3, str4, str5, str6, str7, image2, bool, cryptoCurrencyHoldingDetails, map2, amount2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingInstrument)) {
            return false;
        }
        return C19383o.m32792b(this.f37790id, ((FundingInstrument) obj).f37790id);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getBufCardText() {
        if (this.name == null || this.lastDigits == null) {
            return "";
        }
        if (C19457k.m33019W0(PaymentTypes.AMERICAN_EXPRESS.toString(), this.name, true)) {
            return C0388a.m1049e(new Object[]{this.lastDigits}, 1, "Amex **** %s", "format(format, *args)");
        }
        return C0388a.m1049e(new Object[]{this.name, this.lastDigits}, 2, "%s **** %s", "format(format, *args)");
    }

    public final CryptoCurrencyHoldingDetails getCryptocurrencyHoldingDetails() {
        return this.cryptocurrencyHoldingDetails;
    }

    public final String getFormattedType() {
        return this.formattedType;
    }

    public final String getId() {
        return this.f37790id;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getInstrumentSubType() {
        return this.instrumentSubType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLastDigits() {
        return this.lastDigits;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f37790id});
    }

    public final Boolean isPreferred() {
        return this.isPreferred;
    }

    public final void setAmount(Amount amount2) {
        this.amount = amount2;
    }

    public String toString() {
        String str = this.f37790id;
        String str2 = this.name;
        String str3 = this.label;
        String str4 = this.type;
        String str5 = this.formattedType;
        String str6 = this.instrumentSubType;
        StringBuilder f = C0388a.m1050f("\n            FundingInstrument{ \n                id=", str, ",\n                name=", str2, ",\n                label=");
        C0391c.m1061h(f, str3, ",\n                type=", str4, ",\n                formattedType=");
        f.append(str5);
        f.append(", \n                instrumentSubType=");
        f.append(str6);
        f.append("\n               }\n        ");
        return C19453g.m33013Q0(f.toString());
    }

    public final String getInstrumentSubType(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return localizeAccountType(context, this.instrumentSubType);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FundingInstrument(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.paypal.pyplcheckout.pojo.Image r21, java.lang.Boolean r22, com.paypal.pyplcheckout.pojo.CryptoCurrencyHoldingDetails r23, java.util.Map r24, com.paypal.pyplcheckout.pojo.Amount r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005b
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            goto L_0x005d
        L_0x005b:
            r12 = r24
        L_0x005d:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r2 = r25
        L_0x0064:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.FundingInstrument.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.Image, java.lang.Boolean, com.paypal.pyplcheckout.pojo.CryptoCurrencyHoldingDetails, java.util.Map, com.paypal.pyplcheckout.pojo.Amount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
