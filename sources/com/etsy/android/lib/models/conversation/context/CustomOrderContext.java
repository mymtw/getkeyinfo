package com.etsy.android.lib.models.conversation.context;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.support.p013v4.media.session.C0087d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.conversation.CustomOrder;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class CustomOrderContext extends ConversationContextAdapterFactory {
    public static final int $stable = 8;
    private String actionString;
    private long buyerUserID;
    private final int contextTypeId;
    private long conversationID;
    private Long createdFromListingID;
    private CustomOrder customOrder;
    private String formattedButtonTitle;
    private String formattedStatus;
    private boolean isDraft;
    private Long receiptID;
    private Long reservedListingID;
    private long shopID;
    private boolean showStatusBar;
    private String suggestedTitle;

    public enum Action {
        UNKNOWN,
        START,
        MANAGE,
        OPEN_ORDER,
        ADD_TO_CART,
        VIEW_CART
    }

    public CustomOrderContext() {
        this((String) null, (String) null, (Long) null, (Long) null, (String) null, (Long) null, 0, 0, 0, false, false, (CustomOrder) null, (String) null, 0, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CustomOrderContext(java.lang.String r17, java.lang.String r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21, java.lang.Long r22, long r23, long r25, long r27, boolean r29, boolean r30, com.etsy.android.lib.models.conversation.CustomOrder r31, java.lang.String r32, int r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r16 = this;
            r0 = r34
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r17
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = r18
        L_0x0013:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            r3 = 0
            goto L_0x001b
        L_0x0019:
            r3 = r19
        L_0x001b:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            r4 = 0
            goto L_0x0023
        L_0x0021:
            r4 = r20
        L_0x0023:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0038
            com.etsy.android.lib.models.conversation.context.CustomOrderContext$Action r5 = com.etsy.android.lib.models.conversation.context.CustomOrderContext.Action.UNKNOWN
            java.lang.String r5 = r5.toString()
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = "US"
            java.lang.String r8 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r5 = android.support.p013v4.media.session.C0087d.m237g(r6, r7, r5, r6, r8)
            goto L_0x003a
        L_0x0038:
            r5 = r21
        L_0x003a:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0040
            r6 = 0
            goto L_0x0042
        L_0x0040:
            r6 = r22
        L_0x0042:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x004a
            r10 = r8
            goto L_0x004c
        L_0x004a:
            r10 = r23
        L_0x004c:
            r7 = r0 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0052
            r12 = r8
            goto L_0x0054
        L_0x0052:
            r12 = r25
        L_0x0054:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r8 = r27
        L_0x005b:
            r7 = r0 & 512(0x200, float:7.175E-43)
            r14 = 0
            if (r7 == 0) goto L_0x0062
            r7 = r14
            goto L_0x0064
        L_0x0062:
            r7 = r29
        L_0x0064:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r14 = r30
        L_0x006b:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0071
            r15 = 0
            goto L_0x0073
        L_0x0071:
            r15 = r31
        L_0x0073:
            r35 = r15
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x007b
            r15 = 0
            goto L_0x007d
        L_0x007b:
            r15 = r32
        L_0x007d:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0083
            r0 = -1
            goto L_0x0085
        L_0x0083:
            r0 = r33
        L_0x0085:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r10
            r26 = r12
            r28 = r8
            r30 = r7
            r31 = r14
            r32 = r35
            r33 = r15
            r34 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.conversation.context.CustomOrderContext.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, long, long, long, boolean, boolean, com.etsy.android.lib.models.conversation.CustomOrder, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ CustomOrderContext copy$default(CustomOrderContext customOrderContext, String str, String str2, Long l, Long l2, String str3, Long l3, long j, long j2, long j3, boolean z, boolean z2, CustomOrder customOrder2, String str4, int i, int i2, Object obj) {
        CustomOrderContext customOrderContext2 = customOrderContext;
        int i3 = i2;
        return customOrderContext.copy((i3 & 1) != 0 ? customOrderContext2.formattedStatus : str, (i3 & 2) != 0 ? customOrderContext2.formattedButtonTitle : str2, (i3 & 4) != 0 ? customOrderContext2.reservedListingID : l, (i3 & 8) != 0 ? customOrderContext2.receiptID : l2, (i3 & 16) != 0 ? customOrderContext2.actionString : str3, (i3 & 32) != 0 ? customOrderContext2.createdFromListingID : l3, (i3 & 64) != 0 ? customOrderContext2.shopID : j, (i3 & 128) != 0 ? customOrderContext2.buyerUserID : j2, (i3 & 256) != 0 ? customOrderContext2.conversationID : j3, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? customOrderContext2.isDraft : z, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? customOrderContext2.showStatusBar : z2, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? customOrderContext2.customOrder : customOrder2, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? customOrderContext2.suggestedTitle : str4, (i3 & 8192) != 0 ? customOrderContext2.contextTypeId : i);
    }

    public final String component1() {
        return this.formattedStatus;
    }

    public final boolean component10() {
        return this.isDraft;
    }

    public final boolean component11() {
        return this.showStatusBar;
    }

    public final CustomOrder component12() {
        return this.customOrder;
    }

    public final String component13() {
        return this.suggestedTitle;
    }

    public final int component14() {
        return this.contextTypeId;
    }

    public final String component2() {
        return this.formattedButtonTitle;
    }

    public final Long component3() {
        return this.reservedListingID;
    }

    public final Long component4() {
        return this.receiptID;
    }

    public final String component5() {
        return this.actionString;
    }

    public final Long component6() {
        return this.createdFromListingID;
    }

    public final long component7() {
        return this.shopID;
    }

    public final long component8() {
        return this.buyerUserID;
    }

    public final long component9() {
        return this.conversationID;
    }

    public final CustomOrderContext copy(@C17402n(name = "formatted_status") String str, @C17402n(name = "formatted_button_title") String str2, @C17402n(name = "reserved_listing_id") Long l, @C17402n(name = "receipt_id") Long l2, @C17402n(name = "action_type") String str3, @C17402n(name = "created_from_listing_id") Long l3, @C17402n(name = "shop_id") long j, @C17402n(name = "buyer_user_id") long j2, @C17402n(name = "conversation_id") long j3, @C17402n(name = "is_draft") boolean z, @C17402n(name = "show_status_bar") boolean z2, @C17402n(name = "order_card") CustomOrder customOrder2, @C17402n(name = "suggested_title") String str4, @C17402n(name = "context_type_id") int i) {
        String str5 = str;
        C19383o.m32797g(str3, "actionString");
        return new CustomOrderContext(str, str2, l, l2, str3, l3, j, j2, j3, z, z2, customOrder2, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomOrderContext)) {
            return false;
        }
        CustomOrderContext customOrderContext = (CustomOrderContext) obj;
        return C19383o.m32792b(this.formattedStatus, customOrderContext.formattedStatus) && C19383o.m32792b(this.formattedButtonTitle, customOrderContext.formattedButtonTitle) && C19383o.m32792b(this.reservedListingID, customOrderContext.reservedListingID) && C19383o.m32792b(this.receiptID, customOrderContext.receiptID) && C19383o.m32792b(this.actionString, customOrderContext.actionString) && C19383o.m32792b(this.createdFromListingID, customOrderContext.createdFromListingID) && this.shopID == customOrderContext.shopID && this.buyerUserID == customOrderContext.buyerUserID && this.conversationID == customOrderContext.conversationID && this.isDraft == customOrderContext.isDraft && this.showStatusBar == customOrderContext.showStatusBar && C19383o.m32792b(this.customOrder, customOrderContext.customOrder) && C19383o.m32792b(this.suggestedTitle, customOrderContext.suggestedTitle) && this.contextTypeId == customOrderContext.contextTypeId;
    }

    public final String getActionString() {
        return this.actionString;
    }

    public final Action getActionType() {
        String str = this.actionString;
        Locale locale = Locale.US;
        C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
        String upperCase = str.toUpperCase(locale);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return Action.valueOf(upperCase);
    }

    public final EtsyId getBuyerEtsyId() {
        return new EtsyId(this.buyerUserID);
    }

    public final long getBuyerUserID() {
        return this.buyerUserID;
    }

    public final int getContextTypeId() {
        return this.contextTypeId;
    }

    public final long getConversationID() {
        return this.conversationID;
    }

    public final EtsyId getConvoEtsyId() {
        return new EtsyId(this.conversationID);
    }

    public final EtsyId getCreatedFromListingEtsyId() {
        Long l = this.createdFromListingID;
        return new EtsyId(l != null ? l.longValue() : 0);
    }

    public final Long getCreatedFromListingID() {
        return this.createdFromListingID;
    }

    public final CustomOrder getCustomOrder() {
        return this.customOrder;
    }

    public final String getFormattedButtonTitle() {
        return this.formattedButtonTitle;
    }

    public final String getFormattedStatus() {
        return this.formattedStatus;
    }

    public final EtsyId getReceiptEtsyId() {
        Long l = this.receiptID;
        return new EtsyId(l != null ? l.longValue() : 0);
    }

    public final Long getReceiptID() {
        return this.receiptID;
    }

    public final EtsyId getReservedListingEtsyId() {
        Long l = this.reservedListingID;
        return new EtsyId(l != null ? l.longValue() : 0);
    }

    public final Long getReservedListingID() {
        return this.reservedListingID;
    }

    public final EtsyId getShopEtsyId() {
        return new EtsyId(this.shopID);
    }

    public final long getShopID() {
        return this.shopID;
    }

    public final boolean getShowStatusBar() {
        return this.showStatusBar;
    }

    public final String getSuggestedTitle() {
        return this.suggestedTitle;
    }

    public int hashCode() {
        String str = this.formattedStatus;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.formattedButtonTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.reservedListingID;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.receiptID;
        int e = C0023f.m105e(this.actionString, (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
        Long l3 = this.createdFromListingID;
        int b = C0071c.m190b(this.conversationID, C0071c.m190b(this.buyerUserID, C0071c.m190b(this.shopID, (e + (l3 == null ? 0 : l3.hashCode())) * 31, 31), 31), 31);
        boolean z = this.isDraft;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (b + (z ? 1 : 0)) * 31;
        boolean z3 = this.showStatusBar;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        CustomOrder customOrder2 = this.customOrder;
        int hashCode4 = (i3 + (customOrder2 == null ? 0 : customOrder2.hashCode())) * 31;
        String str3 = this.suggestedTitle;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Integer.hashCode(this.contextTypeId) + ((hashCode4 + i) * 31);
    }

    public final boolean isDraft() {
        return this.isDraft;
    }

    public final void setActionString(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.actionString = str;
    }

    public final void setActionType(Action action) {
        C19383o.m32797g(action, "theAction");
        String obj = action.toString();
        Locale locale = Locale.US;
        this.actionString = C0087d.m237g(locale, UserStateKt.US_COUNTRY, obj, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public final void setBuyerEtsyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "value");
        this.buyerUserID = etsyId.getIdAsLongDeprecated();
    }

    public final void setBuyerUserID(long j) {
        this.buyerUserID = j;
    }

    public final void setConversationID(long j) {
        this.conversationID = j;
    }

    public final void setConvoEtsyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "value");
        this.conversationID = etsyId.getIdAsLongDeprecated();
    }

    public final void setCreatedFromListingEtsyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "value");
        this.createdFromListingID = Long.valueOf(etsyId.getIdAsLongDeprecated());
    }

    public final void setCreatedFromListingID(Long l) {
        this.createdFromListingID = l;
    }

    public final void setCustomOrder(CustomOrder customOrder2) {
        this.customOrder = customOrder2;
    }

    public final void setDraft(boolean z) {
        this.isDraft = z;
    }

    public final void setFormattedButtonTitle(String str) {
        this.formattedButtonTitle = str;
    }

    public final void setFormattedStatus(String str) {
        this.formattedStatus = str;
    }

    public final void setReceiptEtsyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "value");
        this.receiptID = Long.valueOf(etsyId.getIdAsLongDeprecated());
    }

    public final void setReceiptID(Long l) {
        this.receiptID = l;
    }

    public final void setReservedListingEtsyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "value");
        this.reservedListingID = Long.valueOf(etsyId.getIdAsLongDeprecated());
    }

    public final void setReservedListingID(Long l) {
        this.reservedListingID = l;
    }

    public final void setShopEtsyId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "value");
        this.shopID = etsyId.getIdAsLongDeprecated();
    }

    public final void setShopID(long j) {
        this.shopID = j;
    }

    public final void setShowStatusBar(boolean z) {
        this.showStatusBar = z;
    }

    public final void setSuggestedTitle(String str) {
        this.suggestedTitle = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CustomOrderContext(formattedStatus=");
        h.append(this.formattedStatus);
        h.append(", formattedButtonTitle=");
        h.append(this.formattedButtonTitle);
        h.append(", reservedListingID=");
        h.append(this.reservedListingID);
        h.append(", receiptID=");
        h.append(this.receiptID);
        h.append(", actionString=");
        h.append(this.actionString);
        h.append(", createdFromListingID=");
        h.append(this.createdFromListingID);
        h.append(", shopID=");
        h.append(this.shopID);
        h.append(", buyerUserID=");
        h.append(this.buyerUserID);
        h.append(", conversationID=");
        h.append(this.conversationID);
        h.append(", isDraft=");
        h.append(this.isDraft);
        h.append(", showStatusBar=");
        h.append(this.showStatusBar);
        h.append(", customOrder=");
        h.append(this.customOrder);
        h.append(", suggestedTitle=");
        h.append(this.suggestedTitle);
        h.append(", contextTypeId=");
        return C0073e.m208h(h, this.contextTypeId, ')');
    }

    public CustomOrderContext(@C17402n(name = "formatted_status") String str, @C17402n(name = "formatted_button_title") String str2, @C17402n(name = "reserved_listing_id") Long l, @C17402n(name = "receipt_id") Long l2, @C17402n(name = "action_type") String str3, @C17402n(name = "created_from_listing_id") Long l3, @C17402n(name = "shop_id") long j, @C17402n(name = "buyer_user_id") long j2, @C17402n(name = "conversation_id") long j3, @C17402n(name = "is_draft") boolean z, @C17402n(name = "show_status_bar") boolean z2, @C17402n(name = "order_card") CustomOrder customOrder2, @C17402n(name = "suggested_title") String str4, @C17402n(name = "context_type_id") int i) {
        C19383o.m32797g(str3, "actionString");
        this.formattedStatus = str;
        this.formattedButtonTitle = str2;
        this.reservedListingID = l;
        this.receiptID = l2;
        this.actionString = str3;
        this.createdFromListingID = l3;
        this.shopID = j;
        this.buyerUserID = j2;
        this.conversationID = j3;
        this.isDraft = z;
        this.showStatusBar = z2;
        this.customOrder = customOrder2;
        this.suggestedTitle = str4;
        this.contextTypeId = i;
    }
}
