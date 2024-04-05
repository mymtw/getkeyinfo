package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ObjectUtils;

public final class StructuredShopRefunds extends BaseModel {
    public static final int $stable = 8;
    private String acceptedSummaryString = "";
    private Boolean acceptsCancellations;
    private boolean acceptsExchanges;
    private boolean acceptsReturns;
    private int cancelWithinHours;
    private CancellationType cancellationType;
    private int contactWithinDays;
    private List<NonRefundableItem> nonRefundableItems = new ArrayList();
    private String notAcceptedSummaryString = "";
    private int returnWithinDays;

    public StructuredShopRefunds() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof StructuredShopRefunds) {
            StructuredShopRefunds structuredShopRefunds = (StructuredShopRefunds) obj;
            return this.acceptsReturns == structuredShopRefunds.acceptsReturns && this.acceptsExchanges == structuredShopRefunds.acceptsExchanges && this.acceptsCancellations == structuredShopRefunds.acceptsCancellations && ObjectUtils.equals(this.acceptedSummaryString, structuredShopRefunds.acceptedSummaryString) && ObjectUtils.equals(this.notAcceptedSummaryString, structuredShopRefunds.notAcceptedSummaryString) && this.contactWithinDays == structuredShopRefunds.contactWithinDays && this.returnWithinDays == structuredShopRefunds.returnWithinDays && this.cancelWithinHours == structuredShopRefunds.cancelWithinHours && ObjectUtils.equals(this.cancellationType, structuredShopRefunds.cancellationType) && ObjectUtils.equals(this.nonRefundableItems, structuredShopRefunds.nonRefundableItems);
        }
    }

    public final String getAcceptedSummaryString() {
        return this.acceptedSummaryString;
    }

    public final Boolean getAcceptsCancellations() {
        return this.acceptsCancellations;
    }

    public final boolean getAcceptsExchanges() {
        return this.acceptsExchanges;
    }

    public final boolean getAcceptsReturns() {
        return this.acceptsReturns;
    }

    public final int getCancelWithinHours() {
        return this.cancelWithinHours;
    }

    public final CancellationType getCancellationType() {
        return this.cancellationType;
    }

    public final int getContactWithinDays() {
        return this.contactWithinDays;
    }

    public final List<NonRefundableItem> getNonRefundableItems() {
        return this.nonRefundableItems;
    }

    public final String getNotAcceptedSummaryString() {
        return this.notAcceptedSummaryString;
    }

    public final int getReturnWithinDays() {
        return this.returnWithinDays;
    }

    public int hashCode() {
        int hashCode = ObjectUtils.hashCode(this.acceptsCancellations);
        int hashCode2 = ObjectUtils.hashCode(this.acceptedSummaryString);
        int hashCode3 = ObjectUtils.hashCode(this.notAcceptedSummaryString);
        int hashCode4 = ObjectUtils.hashCode(this.cancellationType);
        return ObjectUtils.hashCode(this.nonRefundableItems) + ((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((hashCode + ((((true + (this.acceptsReturns ^ true ? 1 : 0)) * 31) + (this.acceptsExchanges ^ true ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.contactWithinDays) * 31) + this.returnWithinDays) * 31) + this.cancelWithinHours) * 31)) * 31);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parseData(com.fasterxml.jackson.core.JsonParser r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "jp"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
        L_0x0005:
            com.fasterxml.jackson.core.JsonToken r0 = r8.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x0103
            java.lang.String r0 = r8.getCurrentName()
            r8.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = r8.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r1 != r2) goto L_0x001d
            goto L_0x0005
        L_0x001d:
            if (r0 == 0) goto L_0x00fe
            int r1 = r0.hashCode()
            switch(r1) {
                case -1404969747: goto L_0x00cf;
                case -1385634454: goto L_0x00be;
                case -1189436448: goto L_0x00ad;
                case -761085706: goto L_0x009a;
                case -718081955: goto L_0x0088;
                case -389652113: goto L_0x0076;
                case -98854302: goto L_0x0063;
                case 136691452: goto L_0x004e;
                case 612952389: goto L_0x0039;
                case 1553479344: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00fe
        L_0x0028:
            java.lang.String r1 = "exchanges"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            goto L_0x00fe
        L_0x0032:
            boolean r0 = r8.getValueAsBoolean()
            r7.acceptsExchanges = r0
            goto L_0x0005
        L_0x0039:
            java.lang.String r1 = "non_refundable_items"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
            goto L_0x00fe
        L_0x0043:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.Class<com.etsy.android.lib.models.apiv3.NonRefundableItem> r1 = com.etsy.android.lib.models.apiv3.NonRefundableItem.class
            java.util.List r0 = r0.parseArray(r8, r1)
            r7.nonRefundableItems = r0
            goto L_0x0005
        L_0x004e:
            java.lang.String r1 = "accepts_cancellations"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0058
            goto L_0x00fe
        L_0x0058:
            boolean r0 = r8.getValueAsBoolean()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.acceptsCancellations = r0
            goto L_0x0005
        L_0x0063:
            java.lang.String r1 = "accepted_summary_string"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006d
            goto L_0x00fe
        L_0x006d:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseString(r8)
            r7.acceptedSummaryString = r0
            goto L_0x0005
        L_0x0076:
            java.lang.String r1 = "accepts_returns"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0080
            goto L_0x00fe
        L_0x0080:
            boolean r0 = r8.getValueAsBoolean()
            r7.acceptsReturns = r0
            goto L_0x0005
        L_0x0088:
            java.lang.String r1 = "return_items_within_days"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0092
            goto L_0x00fe
        L_0x0092:
            int r0 = r8.getValueAsInt()
            r7.returnWithinDays = r0
            goto L_0x0005
        L_0x009a:
            java.lang.String r1 = "not_accepted_summary_string"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a3
            goto L_0x00fe
        L_0x00a3:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseString(r8)
            r7.notAcceptedSummaryString = r0
            goto L_0x0005
        L_0x00ad:
            java.lang.String r1 = "cancel_within_hours"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b6
            goto L_0x00fe
        L_0x00b6:
            int r0 = r8.getValueAsInt()
            r7.cancelWithinHours = r0
            goto L_0x0005
        L_0x00be:
            java.lang.String r1 = "contact_seller_within_days"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c7
            goto L_0x00fe
        L_0x00c7:
            int r0 = r8.getValueAsInt()
            r7.contactWithinDays = r0
            goto L_0x0005
        L_0x00cf:
            java.lang.String r1 = "cancellation_window_type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d8
            goto L_0x00fe
        L_0x00d8:
            com.etsy.android.lib.models.BaseModel$Companion r0 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r0 = r0.parseString(r8)
            r1 = 0
            if (r0 == 0) goto L_0x00fa
            com.etsy.android.lib.models.apiv3.CancellationType[] r2 = com.etsy.android.lib.models.apiv3.CancellationType.values()
            r3 = 0
            int r4 = r2.length
        L_0x00e7:
            if (r3 >= r4) goto L_0x00fa
            r5 = r2[r3]
            java.lang.String r6 = r5.getValue()
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r0)
            if (r6 == 0) goto L_0x00f7
            r1 = r5
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x00e7
        L_0x00fa:
            r7.cancellationType = r1
            goto L_0x0005
        L_0x00fe:
            r8.skipChildren()
            goto L_0x0005
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.StructuredShopRefunds.parseData(com.fasterxml.jackson.core.JsonParser):void");
    }

    public final void setAcceptedSummaryString(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.acceptedSummaryString = str;
    }

    public final void setAcceptsCancellations(Boolean bool) {
        this.acceptsCancellations = bool;
    }

    public final void setAcceptsExchanges(boolean z) {
        this.acceptsExchanges = z;
    }

    public final void setAcceptsReturns(boolean z) {
        this.acceptsReturns = z;
    }

    public final void setCancelWithinHours(int i) {
        this.cancelWithinHours = i;
    }

    public final void setCancellationType(CancellationType cancellationType2) {
        this.cancellationType = cancellationType2;
    }

    public final void setContactWithinDays(int i) {
        this.contactWithinDays = i;
    }

    public final void setNonRefundableItems(List<NonRefundableItem> list) {
        C19383o.m32797g(list, "<set-?>");
        this.nonRefundableItems = list;
    }

    public final void setNotAcceptedSummaryString(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.notAcceptedSummaryString = str;
    }

    public final void setReturnWithinDays(int i) {
        this.returnWithinDays = i;
    }

    public StructuredShopRefunds(StructuredShopRefunds structuredShopRefunds) {
        C19383o.m32797g(structuredShopRefunds, "other");
        this.acceptsReturns = structuredShopRefunds.acceptsReturns;
        this.acceptsExchanges = structuredShopRefunds.acceptsExchanges;
        this.acceptsCancellations = structuredShopRefunds.acceptsCancellations;
        this.acceptedSummaryString = structuredShopRefunds.acceptedSummaryString;
        this.notAcceptedSummaryString = structuredShopRefunds.notAcceptedSummaryString;
        this.contactWithinDays = structuredShopRefunds.contactWithinDays;
        this.returnWithinDays = structuredShopRefunds.returnWithinDays;
        this.cancelWithinHours = structuredShopRefunds.cancelWithinHours;
        this.cancellationType = structuredShopRefunds.cancellationType;
        for (NonRefundableItem nonRefundableItem : structuredShopRefunds.nonRefundableItems) {
            this.nonRefundableItems.add(new NonRefundableItem(nonRefundableItem));
        }
    }
}
