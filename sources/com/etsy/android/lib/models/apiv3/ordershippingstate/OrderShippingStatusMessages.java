package com.etsy.android.lib.models.apiv3.ordershippingstate;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.MessageModel;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class OrderShippingStatusMessages {
    public static final int $stable = 8;
    private final MessageModel estimatedDeliveryText;
    private final MessageModel estimatedDeliveryTitle;
    private final MessageModel statusMessage;
    private final MessageModel statusText;
    private final MessageModel statusTitle;

    public OrderShippingStatusMessages(@C17402n(name = "status_title") MessageModel messageModel, @C17402n(name = "status_text") MessageModel messageModel2, @C17402n(name = "status_message") MessageModel messageModel3, @C17402n(name = "estimated_delivery_title") MessageModel messageModel4, @C17402n(name = "estimated_delivery_text") MessageModel messageModel5) {
        C19383o.m32797g(messageModel, "statusTitle");
        C19383o.m32797g(messageModel2, "statusText");
        this.statusTitle = messageModel;
        this.statusText = messageModel2;
        this.statusMessage = messageModel3;
        this.estimatedDeliveryTitle = messageModel4;
        this.estimatedDeliveryText = messageModel5;
    }

    public static /* synthetic */ OrderShippingStatusMessages copy$default(OrderShippingStatusMessages orderShippingStatusMessages, MessageModel messageModel, MessageModel messageModel2, MessageModel messageModel3, MessageModel messageModel4, MessageModel messageModel5, int i, Object obj) {
        if ((i & 1) != 0) {
            messageModel = orderShippingStatusMessages.statusTitle;
        }
        if ((i & 2) != 0) {
            messageModel2 = orderShippingStatusMessages.statusText;
        }
        MessageModel messageModel6 = messageModel2;
        if ((i & 4) != 0) {
            messageModel3 = orderShippingStatusMessages.statusMessage;
        }
        MessageModel messageModel7 = messageModel3;
        if ((i & 8) != 0) {
            messageModel4 = orderShippingStatusMessages.estimatedDeliveryTitle;
        }
        MessageModel messageModel8 = messageModel4;
        if ((i & 16) != 0) {
            messageModel5 = orderShippingStatusMessages.estimatedDeliveryText;
        }
        return orderShippingStatusMessages.copy(messageModel, messageModel6, messageModel7, messageModel8, messageModel5);
    }

    public final MessageModel component1() {
        return this.statusTitle;
    }

    public final MessageModel component2() {
        return this.statusText;
    }

    public final MessageModel component3() {
        return this.statusMessage;
    }

    public final MessageModel component4() {
        return this.estimatedDeliveryTitle;
    }

    public final MessageModel component5() {
        return this.estimatedDeliveryText;
    }

    public final OrderShippingStatusMessages copy(@C17402n(name = "status_title") MessageModel messageModel, @C17402n(name = "status_text") MessageModel messageModel2, @C17402n(name = "status_message") MessageModel messageModel3, @C17402n(name = "estimated_delivery_title") MessageModel messageModel4, @C17402n(name = "estimated_delivery_text") MessageModel messageModel5) {
        C19383o.m32797g(messageModel, "statusTitle");
        C19383o.m32797g(messageModel2, "statusText");
        return new OrderShippingStatusMessages(messageModel, messageModel2, messageModel3, messageModel4, messageModel5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShippingStatusMessages)) {
            return false;
        }
        OrderShippingStatusMessages orderShippingStatusMessages = (OrderShippingStatusMessages) obj;
        return C19383o.m32792b(this.statusTitle, orderShippingStatusMessages.statusTitle) && C19383o.m32792b(this.statusText, orderShippingStatusMessages.statusText) && C19383o.m32792b(this.statusMessage, orderShippingStatusMessages.statusMessage) && C19383o.m32792b(this.estimatedDeliveryTitle, orderShippingStatusMessages.estimatedDeliveryTitle) && C19383o.m32792b(this.estimatedDeliveryText, orderShippingStatusMessages.estimatedDeliveryText);
    }

    public final MessageModel getEstimatedDeliveryText() {
        return this.estimatedDeliveryText;
    }

    public final MessageModel getEstimatedDeliveryTitle() {
        return this.estimatedDeliveryTitle;
    }

    public final MessageModel getStatusMessage() {
        return this.statusMessage;
    }

    public final MessageModel getStatusText() {
        return this.statusText;
    }

    public final MessageModel getStatusTitle() {
        return this.statusTitle;
    }

    public int hashCode() {
        int hashCode = (this.statusText.hashCode() + (this.statusTitle.hashCode() * 31)) * 31;
        MessageModel messageModel = this.statusMessage;
        int i = 0;
        int hashCode2 = (hashCode + (messageModel == null ? 0 : messageModel.hashCode())) * 31;
        MessageModel messageModel2 = this.estimatedDeliveryTitle;
        int hashCode3 = (hashCode2 + (messageModel2 == null ? 0 : messageModel2.hashCode())) * 31;
        MessageModel messageModel3 = this.estimatedDeliveryText;
        if (messageModel3 != null) {
            i = messageModel3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("OrderShippingStatusMessages(statusTitle=");
        h.append(this.statusTitle);
        h.append(", statusText=");
        h.append(this.statusText);
        h.append(", statusMessage=");
        h.append(this.statusMessage);
        h.append(", estimatedDeliveryTitle=");
        h.append(this.estimatedDeliveryTitle);
        h.append(", estimatedDeliveryText=");
        h.append(this.estimatedDeliveryText);
        h.append(')');
        return h.toString();
    }
}
