package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class StructuredPolicyPayments {
    public static final int $stable = 8;
    private final List<String> acceptedPaymentMethods;
    private final Boolean acceptsDirectCheckout;
    private final Boolean acceptsPaypal;
    private final List<String> manualPaymentMethods;
    private final List<String> protectedPaymentMethods;

    public StructuredPolicyPayments() {
        this((List) null, (Boolean) null, (Boolean) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public StructuredPolicyPayments(@C17402n(name = "accepted_payment_methods") List<String> list, @C17402n(name = "accepts_direct_checkout") Boolean bool, @C17402n(name = "accepts_paypal") Boolean bool2, @C17402n(name = "manual_payment_methods") List<String> list2, @C17402n(name = "protected_payment_methods") List<String> list3) {
        this.acceptedPaymentMethods = list;
        this.acceptsDirectCheckout = bool;
        this.acceptsPaypal = bool2;
        this.manualPaymentMethods = list2;
        this.protectedPaymentMethods = list3;
    }

    public static /* synthetic */ StructuredPolicyPayments copy$default(StructuredPolicyPayments structuredPolicyPayments, List<String> list, Boolean bool, Boolean bool2, List<String> list2, List<String> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = structuredPolicyPayments.acceptedPaymentMethods;
        }
        if ((i & 2) != 0) {
            bool = structuredPolicyPayments.acceptsDirectCheckout;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            bool2 = structuredPolicyPayments.acceptsPaypal;
        }
        Boolean bool4 = bool2;
        if ((i & 8) != 0) {
            list2 = structuredPolicyPayments.manualPaymentMethods;
        }
        List<String> list4 = list2;
        if ((i & 16) != 0) {
            list3 = structuredPolicyPayments.protectedPaymentMethods;
        }
        return structuredPolicyPayments.copy(list, bool3, bool4, list4, list3);
    }

    public final List<String> component1() {
        return this.acceptedPaymentMethods;
    }

    public final Boolean component2() {
        return this.acceptsDirectCheckout;
    }

    public final Boolean component3() {
        return this.acceptsPaypal;
    }

    public final List<String> component4() {
        return this.manualPaymentMethods;
    }

    public final List<String> component5() {
        return this.protectedPaymentMethods;
    }

    public final StructuredPolicyPayments copy(@C17402n(name = "accepted_payment_methods") List<String> list, @C17402n(name = "accepts_direct_checkout") Boolean bool, @C17402n(name = "accepts_paypal") Boolean bool2, @C17402n(name = "manual_payment_methods") List<String> list2, @C17402n(name = "protected_payment_methods") List<String> list3) {
        return new StructuredPolicyPayments(list, bool, bool2, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredPolicyPayments)) {
            return false;
        }
        StructuredPolicyPayments structuredPolicyPayments = (StructuredPolicyPayments) obj;
        return C19383o.m32792b(this.acceptedPaymentMethods, structuredPolicyPayments.acceptedPaymentMethods) && C19383o.m32792b(this.acceptsDirectCheckout, structuredPolicyPayments.acceptsDirectCheckout) && C19383o.m32792b(this.acceptsPaypal, structuredPolicyPayments.acceptsPaypal) && C19383o.m32792b(this.manualPaymentMethods, structuredPolicyPayments.manualPaymentMethods) && C19383o.m32792b(this.protectedPaymentMethods, structuredPolicyPayments.protectedPaymentMethods);
    }

    public final List<String> getAcceptedPaymentMethods() {
        return this.acceptedPaymentMethods;
    }

    public final Boolean getAcceptsDirectCheckout() {
        return this.acceptsDirectCheckout;
    }

    public final Boolean getAcceptsPaypal() {
        return this.acceptsPaypal;
    }

    public final List<String> getManualPaymentMethods() {
        return this.manualPaymentMethods;
    }

    public final List<String> getProtectedPaymentMethods() {
        return this.protectedPaymentMethods;
    }

    public int hashCode() {
        List<String> list = this.acceptedPaymentMethods;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.acceptsDirectCheckout;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.acceptsPaypal;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list2 = this.manualPaymentMethods;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.protectedPaymentMethods;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StructuredPolicyPayments(acceptedPaymentMethods=");
        h.append(this.acceptedPaymentMethods);
        h.append(", acceptsDirectCheckout=");
        h.append(this.acceptsDirectCheckout);
        h.append(", acceptsPaypal=");
        h.append(this.acceptsPaypal);
        h.append(", manualPaymentMethods=");
        h.append(this.manualPaymentMethods);
        h.append(", protectedPaymentMethods=");
        return C0070b.m186i(h, this.protectedPaymentMethods, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StructuredPolicyPayments(java.util.List r5, java.lang.Boolean r6, java.lang.Boolean r7, java.util.List r8, java.util.List r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments.<init>(java.util.List, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
