package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Card {
    @C18417a("expiryMonth")
    private final String expiryMonth;
    @C18417a("expiryYear")
    private final String expiryYear;
    @C18417a("issueNumber")
    private final String issueNumber;
    @C18417a("number")
    private final String number;
    @C18417a("securityCode")
    private final String securityCode;
    @C18417a("startMonth")
    private final String startMonth;
    @C18417a("startYear")
    private final String startYear;
    @C18417a("type")
    private final CardIssuerType type;

    public Card(CardIssuerType cardIssuerType, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C19383o.m32797g(cardIssuerType, "type");
        C19383o.m32797g(str, "number");
        this.type = cardIssuerType;
        this.number = str;
        this.securityCode = str2;
        this.expiryMonth = str3;
        this.expiryYear = str4;
        this.startMonth = str5;
        this.startYear = str6;
        this.issueNumber = str7;
    }

    public static /* synthetic */ Card copy$default(Card card, CardIssuerType cardIssuerType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        Card card2 = card;
        int i2 = i;
        return card.copy((i2 & 1) != 0 ? card2.type : cardIssuerType, (i2 & 2) != 0 ? card2.number : str, (i2 & 4) != 0 ? card2.securityCode : str2, (i2 & 8) != 0 ? card2.expiryMonth : str3, (i2 & 16) != 0 ? card2.expiryYear : str4, (i2 & 32) != 0 ? card2.startMonth : str5, (i2 & 64) != 0 ? card2.startYear : str6, (i2 & 128) != 0 ? card2.issueNumber : str7);
    }

    public final CardIssuerType component1() {
        return this.type;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.securityCode;
    }

    public final String component4() {
        return this.expiryMonth;
    }

    public final String component5() {
        return this.expiryYear;
    }

    public final String component6() {
        return this.startMonth;
    }

    public final String component7() {
        return this.startYear;
    }

    public final String component8() {
        return this.issueNumber;
    }

    public final Card copy(CardIssuerType cardIssuerType, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C19383o.m32797g(cardIssuerType, "type");
        C19383o.m32797g(str, "number");
        return new Card(cardIssuerType, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return this.type == card.type && C19383o.m32792b(this.number, card.number) && C19383o.m32792b(this.securityCode, card.securityCode) && C19383o.m32792b(this.expiryMonth, card.expiryMonth) && C19383o.m32792b(this.expiryYear, card.expiryYear) && C19383o.m32792b(this.startMonth, card.startMonth) && C19383o.m32792b(this.startYear, card.startYear) && C19383o.m32792b(this.issueNumber, card.issueNumber);
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getIssueNumber() {
        return this.issueNumber;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getSecurityCode() {
        return this.securityCode;
    }

    public final String getStartMonth() {
        return this.startMonth;
    }

    public final String getStartYear() {
        return this.startYear;
    }

    public final CardIssuerType getType() {
        return this.type;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.number, this.type.hashCode() * 31, 31);
        String str = this.securityCode;
        int i = 0;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expiryMonth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiryYear;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startMonth;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.startYear;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issueNumber;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        CardIssuerType cardIssuerType = this.type;
        String str = this.number;
        String str2 = this.securityCode;
        String str3 = this.expiryMonth;
        String str4 = this.expiryYear;
        String str5 = this.startMonth;
        String str6 = this.startYear;
        String str7 = this.issueNumber;
        StringBuilder sb = new StringBuilder();
        sb.append("Card(type=");
        sb.append(cardIssuerType);
        sb.append(", number=");
        sb.append(str);
        sb.append(", securityCode=");
        C0391c.m1061h(sb, str2, ", expiryMonth=", str3, ", expiryYear=");
        C0391c.m1061h(sb, str4, ", startMonth=", str5, ", startYear=");
        return C0073e.m210j(sb, str6, ", issueNumber=", str7, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Card(com.paypal.pyplcheckout.pojo.CardIssuerType r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r19
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r20
        L_0x001b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Card.<init>(com.paypal.pyplcheckout.pojo.CardIssuerType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
