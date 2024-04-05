package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class StructuredPolicyRefunds {
    public static final int $stable = 8;
    private final String acceptedSummaryString;
    private final Boolean acceptsCancellations;
    private final Boolean acceptsReturns;
    private final Integer cancelWithinHours;
    private final String cancellationWindowType;
    private final Integer contactSellerWithinDays;
    private final Boolean exchanges;
    private final List<NonRefundableItem> nonRefundableItems;
    private final String notAcceptedSummaryString;
    private final Integer returnItemsWithinDays;

    public StructuredPolicyRefunds() {
        this((String) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (List) null, (String) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    public StructuredPolicyRefunds(@C17402n(name = "accepted_summary_string") String str, @C17402n(name = "accepts_cancellations") Boolean bool, @C17402n(name = "accepts_returns") Boolean bool2, @C17402n(name = "cancel_within_hours") Integer num, @C17402n(name = "cancellation_window_type") String str2, @C17402n(name = "contact_seller_within_days") Integer num2, @C17402n(name = "exchanges") Boolean bool3, @C17402n(name = "non_refundable_items") List<NonRefundableItem> list, @C17402n(name = "not_accepted_summary_string") String str3, @C17402n(name = "return_items_within_days") Integer num3) {
        this.acceptedSummaryString = str;
        this.acceptsCancellations = bool;
        this.acceptsReturns = bool2;
        this.cancelWithinHours = num;
        this.cancellationWindowType = str2;
        this.contactSellerWithinDays = num2;
        this.exchanges = bool3;
        this.nonRefundableItems = list;
        this.notAcceptedSummaryString = str3;
        this.returnItemsWithinDays = num3;
    }

    public static /* synthetic */ StructuredPolicyRefunds copy$default(StructuredPolicyRefunds structuredPolicyRefunds, String str, Boolean bool, Boolean bool2, Integer num, String str2, Integer num2, Boolean bool3, List list, String str3, Integer num3, int i, Object obj) {
        StructuredPolicyRefunds structuredPolicyRefunds2 = structuredPolicyRefunds;
        int i2 = i;
        return structuredPolicyRefunds.copy((i2 & 1) != 0 ? structuredPolicyRefunds2.acceptedSummaryString : str, (i2 & 2) != 0 ? structuredPolicyRefunds2.acceptsCancellations : bool, (i2 & 4) != 0 ? structuredPolicyRefunds2.acceptsReturns : bool2, (i2 & 8) != 0 ? structuredPolicyRefunds2.cancelWithinHours : num, (i2 & 16) != 0 ? structuredPolicyRefunds2.cancellationWindowType : str2, (i2 & 32) != 0 ? structuredPolicyRefunds2.contactSellerWithinDays : num2, (i2 & 64) != 0 ? structuredPolicyRefunds2.exchanges : bool3, (i2 & 128) != 0 ? structuredPolicyRefunds2.nonRefundableItems : list, (i2 & 256) != 0 ? structuredPolicyRefunds2.notAcceptedSummaryString : str3, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? structuredPolicyRefunds2.returnItemsWithinDays : num3);
    }

    public final String component1() {
        return this.acceptedSummaryString;
    }

    public final Integer component10() {
        return this.returnItemsWithinDays;
    }

    public final Boolean component2() {
        return this.acceptsCancellations;
    }

    public final Boolean component3() {
        return this.acceptsReturns;
    }

    public final Integer component4() {
        return this.cancelWithinHours;
    }

    public final String component5() {
        return this.cancellationWindowType;
    }

    public final Integer component6() {
        return this.contactSellerWithinDays;
    }

    public final Boolean component7() {
        return this.exchanges;
    }

    public final List<NonRefundableItem> component8() {
        return this.nonRefundableItems;
    }

    public final String component9() {
        return this.notAcceptedSummaryString;
    }

    public final StructuredPolicyRefunds copy(@C17402n(name = "accepted_summary_string") String str, @C17402n(name = "accepts_cancellations") Boolean bool, @C17402n(name = "accepts_returns") Boolean bool2, @C17402n(name = "cancel_within_hours") Integer num, @C17402n(name = "cancellation_window_type") String str2, @C17402n(name = "contact_seller_within_days") Integer num2, @C17402n(name = "exchanges") Boolean bool3, @C17402n(name = "non_refundable_items") List<NonRefundableItem> list, @C17402n(name = "not_accepted_summary_string") String str3, @C17402n(name = "return_items_within_days") Integer num3) {
        return new StructuredPolicyRefunds(str, bool, bool2, num, str2, num2, bool3, list, str3, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredPolicyRefunds)) {
            return false;
        }
        StructuredPolicyRefunds structuredPolicyRefunds = (StructuredPolicyRefunds) obj;
        return C19383o.m32792b(this.acceptedSummaryString, structuredPolicyRefunds.acceptedSummaryString) && C19383o.m32792b(this.acceptsCancellations, structuredPolicyRefunds.acceptsCancellations) && C19383o.m32792b(this.acceptsReturns, structuredPolicyRefunds.acceptsReturns) && C19383o.m32792b(this.cancelWithinHours, structuredPolicyRefunds.cancelWithinHours) && C19383o.m32792b(this.cancellationWindowType, structuredPolicyRefunds.cancellationWindowType) && C19383o.m32792b(this.contactSellerWithinDays, structuredPolicyRefunds.contactSellerWithinDays) && C19383o.m32792b(this.exchanges, structuredPolicyRefunds.exchanges) && C19383o.m32792b(this.nonRefundableItems, structuredPolicyRefunds.nonRefundableItems) && C19383o.m32792b(this.notAcceptedSummaryString, structuredPolicyRefunds.notAcceptedSummaryString) && C19383o.m32792b(this.returnItemsWithinDays, structuredPolicyRefunds.returnItemsWithinDays);
    }

    public final String getAcceptedSummaryString() {
        return this.acceptedSummaryString;
    }

    public final Boolean getAcceptsCancellations() {
        return this.acceptsCancellations;
    }

    public final Boolean getAcceptsReturns() {
        return this.acceptsReturns;
    }

    public final Integer getCancelWithinHours() {
        return this.cancelWithinHours;
    }

    public final String getCancellationWindowType() {
        return this.cancellationWindowType;
    }

    public final Integer getContactSellerWithinDays() {
        return this.contactSellerWithinDays;
    }

    public final Boolean getExchanges() {
        return this.exchanges;
    }

    public final List<NonRefundableItem> getNonRefundableItems() {
        return this.nonRefundableItems;
    }

    public final String getNotAcceptedSummaryString() {
        return this.notAcceptedSummaryString;
    }

    public final Integer getReturnItemsWithinDays() {
        return this.returnItemsWithinDays;
    }

    public int hashCode() {
        String str = this.acceptedSummaryString;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.acceptsCancellations;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.acceptsReturns;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.cancelWithinHours;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cancellationWindowType;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.contactSellerWithinDays;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.exchanges;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<NonRefundableItem> list = this.nonRefundableItems;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.notAcceptedSummaryString;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.returnItemsWithinDays;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StructuredPolicyRefunds(acceptedSummaryString=");
        h.append(this.acceptedSummaryString);
        h.append(", acceptsCancellations=");
        h.append(this.acceptsCancellations);
        h.append(", acceptsReturns=");
        h.append(this.acceptsReturns);
        h.append(", cancelWithinHours=");
        h.append(this.cancelWithinHours);
        h.append(", cancellationWindowType=");
        h.append(this.cancellationWindowType);
        h.append(", contactSellerWithinDays=");
        h.append(this.contactSellerWithinDays);
        h.append(", exchanges=");
        h.append(this.exchanges);
        h.append(", nonRefundableItems=");
        h.append(this.nonRefundableItems);
        h.append(", notAcceptedSummaryString=");
        h.append(this.notAcceptedSummaryString);
        h.append(", returnItemsWithinDays=");
        return C0023f.m109j(h, this.returnItemsWithinDays, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StructuredPolicyRefunds(java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Integer r15, java.lang.String r16, java.lang.Integer r17, java.lang.Boolean r18, java.util.List r19, java.lang.String r20, java.lang.Integer r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.StructuredPolicyRefunds.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean, java.util.List, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
