package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopStructuredPolicies {
    public static final int $stable = 8;
    private final String additionalTermsAndConditions;
    private final Boolean canHaveAdditionalPolicies;
    private final StructuredPolicyCharLimits charLimits;
    private final Long createDate;
    private final String createDateFormatted;
    private final Boolean hasUnstructuredPolicies;
    private final Boolean includeDisputeFormLink;
    private final StructuredPolicyPayments payments;
    private final StructuredPolicyPrivacy privacy;
    private final StructuredPolicyRefunds refunds;
    private final StructuredPolicyShipping shipping;
    private final Boolean shopInGermany;
    private final Long structuredPoliciesId;
    private final Long updateDate;
    private final String updateDateFormatted;

    public ShopStructuredPolicies() {
        this((String) null, (Boolean) null, (Long) null, (String) null, (Boolean) null, (Boolean) null, (StructuredPolicyPayments) null, (StructuredPolicyPrivacy) null, (StructuredPolicyRefunds) null, (StructuredPolicyShipping) null, (Boolean) null, (Long) null, (Long) null, (String) null, (StructuredPolicyCharLimits) null, 32767, (DefaultConstructorMarker) null);
    }

    public ShopStructuredPolicies(@C17402n(name = "additional_terms_and_conditions") String str, @C17402n(name = "can_have_additional_policies") Boolean bool, @C17402n(name = "create_date") Long l, @C17402n(name = "create_date_formatted") String str2, @C17402n(name = "has_unstructured_policies") Boolean bool2, @C17402n(name = "include_dispute_form_link") Boolean bool3, @C17402n(name = "payments") StructuredPolicyPayments structuredPolicyPayments, @C17402n(name = "privacy") StructuredPolicyPrivacy structuredPolicyPrivacy, @C17402n(name = "refunds") StructuredPolicyRefunds structuredPolicyRefunds, @C17402n(name = "shipping") StructuredPolicyShipping structuredPolicyShipping, @C17402n(name = "shop_in_germany") Boolean bool4, @C17402n(name = "structured_policies_id") Long l2, @C17402n(name = "update_date") Long l3, @C17402n(name = "update_date_formatted") String str3, @C17402n(name = "char_limits") StructuredPolicyCharLimits structuredPolicyCharLimits) {
        this.additionalTermsAndConditions = str;
        this.canHaveAdditionalPolicies = bool;
        this.createDate = l;
        this.createDateFormatted = str2;
        this.hasUnstructuredPolicies = bool2;
        this.includeDisputeFormLink = bool3;
        this.payments = structuredPolicyPayments;
        this.privacy = structuredPolicyPrivacy;
        this.refunds = structuredPolicyRefunds;
        this.shipping = structuredPolicyShipping;
        this.shopInGermany = bool4;
        this.structuredPoliciesId = l2;
        this.updateDate = l3;
        this.updateDateFormatted = str3;
        this.charLimits = structuredPolicyCharLimits;
    }

    public static /* synthetic */ ShopStructuredPolicies copy$default(ShopStructuredPolicies shopStructuredPolicies, String str, Boolean bool, Long l, String str2, Boolean bool2, Boolean bool3, StructuredPolicyPayments structuredPolicyPayments, StructuredPolicyPrivacy structuredPolicyPrivacy, StructuredPolicyRefunds structuredPolicyRefunds, StructuredPolicyShipping structuredPolicyShipping, Boolean bool4, Long l2, Long l3, String str3, StructuredPolicyCharLimits structuredPolicyCharLimits, int i, Object obj) {
        ShopStructuredPolicies shopStructuredPolicies2 = shopStructuredPolicies;
        int i2 = i;
        return shopStructuredPolicies.copy((i2 & 1) != 0 ? shopStructuredPolicies2.additionalTermsAndConditions : str, (i2 & 2) != 0 ? shopStructuredPolicies2.canHaveAdditionalPolicies : bool, (i2 & 4) != 0 ? shopStructuredPolicies2.createDate : l, (i2 & 8) != 0 ? shopStructuredPolicies2.createDateFormatted : str2, (i2 & 16) != 0 ? shopStructuredPolicies2.hasUnstructuredPolicies : bool2, (i2 & 32) != 0 ? shopStructuredPolicies2.includeDisputeFormLink : bool3, (i2 & 64) != 0 ? shopStructuredPolicies2.payments : structuredPolicyPayments, (i2 & 128) != 0 ? shopStructuredPolicies2.privacy : structuredPolicyPrivacy, (i2 & 256) != 0 ? shopStructuredPolicies2.refunds : structuredPolicyRefunds, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shopStructuredPolicies2.shipping : structuredPolicyShipping, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shopStructuredPolicies2.shopInGermany : bool4, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shopStructuredPolicies2.structuredPoliciesId : l2, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shopStructuredPolicies2.updateDate : l3, (i2 & 8192) != 0 ? shopStructuredPolicies2.updateDateFormatted : str3, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shopStructuredPolicies2.charLimits : structuredPolicyCharLimits);
    }

    public final String component1() {
        return this.additionalTermsAndConditions;
    }

    public final StructuredPolicyShipping component10() {
        return this.shipping;
    }

    public final Boolean component11() {
        return this.shopInGermany;
    }

    public final Long component12() {
        return this.structuredPoliciesId;
    }

    public final Long component13() {
        return this.updateDate;
    }

    public final String component14() {
        return this.updateDateFormatted;
    }

    public final StructuredPolicyCharLimits component15() {
        return this.charLimits;
    }

    public final Boolean component2() {
        return this.canHaveAdditionalPolicies;
    }

    public final Long component3() {
        return this.createDate;
    }

    public final String component4() {
        return this.createDateFormatted;
    }

    public final Boolean component5() {
        return this.hasUnstructuredPolicies;
    }

    public final Boolean component6() {
        return this.includeDisputeFormLink;
    }

    public final StructuredPolicyPayments component7() {
        return this.payments;
    }

    public final StructuredPolicyPrivacy component8() {
        return this.privacy;
    }

    public final StructuredPolicyRefunds component9() {
        return this.refunds;
    }

    public final ShopStructuredPolicies copy(@C17402n(name = "additional_terms_and_conditions") String str, @C17402n(name = "can_have_additional_policies") Boolean bool, @C17402n(name = "create_date") Long l, @C17402n(name = "create_date_formatted") String str2, @C17402n(name = "has_unstructured_policies") Boolean bool2, @C17402n(name = "include_dispute_form_link") Boolean bool3, @C17402n(name = "payments") StructuredPolicyPayments structuredPolicyPayments, @C17402n(name = "privacy") StructuredPolicyPrivacy structuredPolicyPrivacy, @C17402n(name = "refunds") StructuredPolicyRefunds structuredPolicyRefunds, @C17402n(name = "shipping") StructuredPolicyShipping structuredPolicyShipping, @C17402n(name = "shop_in_germany") Boolean bool4, @C17402n(name = "structured_policies_id") Long l2, @C17402n(name = "update_date") Long l3, @C17402n(name = "update_date_formatted") String str3, @C17402n(name = "char_limits") StructuredPolicyCharLimits structuredPolicyCharLimits) {
        return new ShopStructuredPolicies(str, bool, l, str2, bool2, bool3, structuredPolicyPayments, structuredPolicyPrivacy, structuredPolicyRefunds, structuredPolicyShipping, bool4, l2, l3, str3, structuredPolicyCharLimits);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopStructuredPolicies)) {
            return false;
        }
        ShopStructuredPolicies shopStructuredPolicies = (ShopStructuredPolicies) obj;
        return C19383o.m32792b(this.additionalTermsAndConditions, shopStructuredPolicies.additionalTermsAndConditions) && C19383o.m32792b(this.canHaveAdditionalPolicies, shopStructuredPolicies.canHaveAdditionalPolicies) && C19383o.m32792b(this.createDate, shopStructuredPolicies.createDate) && C19383o.m32792b(this.createDateFormatted, shopStructuredPolicies.createDateFormatted) && C19383o.m32792b(this.hasUnstructuredPolicies, shopStructuredPolicies.hasUnstructuredPolicies) && C19383o.m32792b(this.includeDisputeFormLink, shopStructuredPolicies.includeDisputeFormLink) && C19383o.m32792b(this.payments, shopStructuredPolicies.payments) && C19383o.m32792b(this.privacy, shopStructuredPolicies.privacy) && C19383o.m32792b(this.refunds, shopStructuredPolicies.refunds) && C19383o.m32792b(this.shipping, shopStructuredPolicies.shipping) && C19383o.m32792b(this.shopInGermany, shopStructuredPolicies.shopInGermany) && C19383o.m32792b(this.structuredPoliciesId, shopStructuredPolicies.structuredPoliciesId) && C19383o.m32792b(this.updateDate, shopStructuredPolicies.updateDate) && C19383o.m32792b(this.updateDateFormatted, shopStructuredPolicies.updateDateFormatted) && C19383o.m32792b(this.charLimits, shopStructuredPolicies.charLimits);
    }

    public final String getAdditionalTermsAndConditions() {
        return this.additionalTermsAndConditions;
    }

    public final Boolean getCanHaveAdditionalPolicies() {
        return this.canHaveAdditionalPolicies;
    }

    public final StructuredPolicyCharLimits getCharLimits() {
        return this.charLimits;
    }

    public final Long getCreateDate() {
        return this.createDate;
    }

    public final String getCreateDateFormatted() {
        return this.createDateFormatted;
    }

    public final Boolean getHasUnstructuredPolicies() {
        return this.hasUnstructuredPolicies;
    }

    public final Boolean getIncludeDisputeFormLink() {
        return this.includeDisputeFormLink;
    }

    public final StructuredPolicyPayments getPayments() {
        return this.payments;
    }

    public final StructuredPolicyPrivacy getPrivacy() {
        return this.privacy;
    }

    public final StructuredPolicyRefunds getRefunds() {
        return this.refunds;
    }

    public final StructuredPolicyShipping getShipping() {
        return this.shipping;
    }

    public final Boolean getShopInGermany() {
        return this.shopInGermany;
    }

    public final Long getStructuredPoliciesId() {
        return this.structuredPoliciesId;
    }

    public final Long getUpdateDate() {
        return this.updateDate;
    }

    public final String getUpdateDateFormatted() {
        return this.updateDateFormatted;
    }

    public int hashCode() {
        String str = this.additionalTermsAndConditions;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.canHaveAdditionalPolicies;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.createDate;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.createDateFormatted;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.hasUnstructuredPolicies;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.includeDisputeFormLink;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        StructuredPolicyPayments structuredPolicyPayments = this.payments;
        int hashCode7 = (hashCode6 + (structuredPolicyPayments == null ? 0 : structuredPolicyPayments.hashCode())) * 31;
        StructuredPolicyPrivacy structuredPolicyPrivacy = this.privacy;
        int hashCode8 = (hashCode7 + (structuredPolicyPrivacy == null ? 0 : structuredPolicyPrivacy.hashCode())) * 31;
        StructuredPolicyRefunds structuredPolicyRefunds = this.refunds;
        int hashCode9 = (hashCode8 + (structuredPolicyRefunds == null ? 0 : structuredPolicyRefunds.hashCode())) * 31;
        StructuredPolicyShipping structuredPolicyShipping = this.shipping;
        int hashCode10 = (hashCode9 + (structuredPolicyShipping == null ? 0 : structuredPolicyShipping.hashCode())) * 31;
        Boolean bool4 = this.shopInGermany;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l2 = this.structuredPoliciesId;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.updateDate;
        int hashCode13 = (hashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.updateDateFormatted;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StructuredPolicyCharLimits structuredPolicyCharLimits = this.charLimits;
        if (structuredPolicyCharLimits != null) {
            i = structuredPolicyCharLimits.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopStructuredPolicies(additionalTermsAndConditions=");
        h.append(this.additionalTermsAndConditions);
        h.append(", canHaveAdditionalPolicies=");
        h.append(this.canHaveAdditionalPolicies);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", createDateFormatted=");
        h.append(this.createDateFormatted);
        h.append(", hasUnstructuredPolicies=");
        h.append(this.hasUnstructuredPolicies);
        h.append(", includeDisputeFormLink=");
        h.append(this.includeDisputeFormLink);
        h.append(", payments=");
        h.append(this.payments);
        h.append(", privacy=");
        h.append(this.privacy);
        h.append(", refunds=");
        h.append(this.refunds);
        h.append(", shipping=");
        h.append(this.shipping);
        h.append(", shopInGermany=");
        h.append(this.shopInGermany);
        h.append(", structuredPoliciesId=");
        h.append(this.structuredPoliciesId);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", updateDateFormatted=");
        h.append(this.updateDateFormatted);
        h.append(", charLimits=");
        h.append(this.charLimits);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShopStructuredPolicies(java.lang.String r17, java.lang.Boolean r18, java.lang.Long r19, java.lang.String r20, java.lang.Boolean r21, java.lang.Boolean r22, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments r23, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPrivacy r24, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyRefunds r25, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShipping r26, java.lang.Boolean r27, java.lang.Long r28, java.lang.Long r29, java.lang.String r30, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyCharLimits r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies.<init>(java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPayments, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyPrivacy, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyRefunds, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyShipping, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, com.etsy.android.lib.models.apiv3.listing.StructuredPolicyCharLimits, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
