package com.etsy.android.lib.models.apiv3.ordershippingstate;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8697k;
import com.etsy.android.lib.logger.C8699m;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.MainImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p415of.C13186o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class OrderShippingStatusCard implements C13186o, C8697k {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ORDER_SHIPPING_STATUS_CARD = "orderShippingStatusCard";
    private final List<MainImage> images;
    private final OrderShippingStatusMessages messages;
    private final long receiptId;
    private final OrderShippingState state;
    private transient C8699m trackingData;
    private final Long trackingId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OrderShippingStatusCard(@C17402n(name = "state") OrderShippingState orderShippingState, @C17402n(name = "messages") OrderShippingStatusMessages orderShippingStatusMessages, @C17402n(name = "images") List<MainImage> list, @C17402n(name = "receipt_id") long j, @C17402n(name = "receipt_shipping_id") Long l) {
        C19383o.m32797g(orderShippingState, "state");
        C19383o.m32797g(orderShippingStatusMessages, ResponseConstants.MESSAGES);
        C19383o.m32797g(list, "images");
        this.state = orderShippingState;
        this.messages = orderShippingStatusMessages;
        this.images = list;
        this.receiptId = j;
        this.trackingId = l;
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.STATUS;
        String name = orderShippingState.name();
        Locale locale = Locale.ENGLISH;
        this.trackingData = new C8699m(C19421p.m32931U(new Pair(predefinedAnalyticsProperty, C0087d.m237g(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)"))), 14);
    }

    public static /* synthetic */ OrderShippingStatusCard copy$default(OrderShippingStatusCard orderShippingStatusCard, OrderShippingState orderShippingState, OrderShippingStatusMessages orderShippingStatusMessages, List<MainImage> list, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            orderShippingState = orderShippingStatusCard.state;
        }
        if ((i & 2) != 0) {
            orderShippingStatusMessages = orderShippingStatusCard.messages;
        }
        OrderShippingStatusMessages orderShippingStatusMessages2 = orderShippingStatusMessages;
        if ((i & 4) != 0) {
            list = orderShippingStatusCard.images;
        }
        List<MainImage> list2 = list;
        if ((i & 8) != 0) {
            j = orderShippingStatusCard.receiptId;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            l = orderShippingStatusCard.trackingId;
        }
        return orderShippingStatusCard.copy(orderShippingState, orderShippingStatusMessages2, list2, j2, l);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingData$annotations() {
    }

    public final OrderShippingState component1() {
        return this.state;
    }

    public final OrderShippingStatusMessages component2() {
        return this.messages;
    }

    public final List<MainImage> component3() {
        return this.images;
    }

    public final long component4() {
        return this.receiptId;
    }

    public final Long component5() {
        return this.trackingId;
    }

    public final OrderShippingStatusCard copy(@C17402n(name = "state") OrderShippingState orderShippingState, @C17402n(name = "messages") OrderShippingStatusMessages orderShippingStatusMessages, @C17402n(name = "images") List<MainImage> list, @C17402n(name = "receipt_id") long j, @C17402n(name = "receipt_shipping_id") Long l) {
        C19383o.m32797g(orderShippingState, "state");
        C19383o.m32797g(orderShippingStatusMessages, ResponseConstants.MESSAGES);
        C19383o.m32797g(list, "images");
        return new OrderShippingStatusCard(orderShippingState, orderShippingStatusMessages, list, j, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShippingStatusCard)) {
            return false;
        }
        OrderShippingStatusCard orderShippingStatusCard = (OrderShippingStatusCard) obj;
        return this.state == orderShippingStatusCard.state && C19383o.m32792b(this.messages, orderShippingStatusCard.messages) && C19383o.m32792b(this.images, orderShippingStatusCard.images) && this.receiptId == orderShippingStatusCard.receiptId && C19383o.m32792b(this.trackingId, orderShippingStatusCard.trackingId);
    }

    public final List<MainImage> getImages() {
        return this.images;
    }

    public final OrderShippingStatusMessages getMessages() {
        return this.messages;
    }

    public final long getReceiptId() {
        return this.receiptId;
    }

    public final OrderShippingState getState() {
        return this.state;
    }

    public C8699m getTrackingData() {
        return this.trackingData;
    }

    public final Long getTrackingId() {
        return this.trackingId;
    }

    public int getViewType() {
        return R.id.view_type_order_shipping_status;
    }

    public int hashCode() {
        int b = C0071c.m190b(this.receiptId, C13983i.m21488g(this.images, (this.messages.hashCode() + (this.state.hashCode() * 31)) * 31, 31), 31);
        Long l = this.trackingId;
        return b + (l == null ? 0 : l.hashCode());
    }

    public void setTrackingData(C8699m mVar) {
        C19383o.m32797g(mVar, "<set-?>");
        this.trackingData = mVar;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("OrderShippingStatusCard(state=");
        h.append(this.state);
        h.append(", messages=");
        h.append(this.messages);
        h.append(", images=");
        h.append(this.images);
        h.append(", receiptId=");
        h.append(this.receiptId);
        h.append(", trackingId=");
        h.append(this.trackingId);
        h.append(')');
        return h.toString();
    }
}
