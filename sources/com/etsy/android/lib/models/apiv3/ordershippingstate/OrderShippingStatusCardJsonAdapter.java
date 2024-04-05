package com.etsy.android.lib.models.apiv3.ordershippingstate;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.MainImage;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class OrderShippingStatusCardJsonAdapter extends JsonAdapter<OrderShippingStatusCard> {
    public static final int $stable = 8;
    private final JsonAdapter<List<MainImage>> listOfMainImageAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("state", ResponseConstants.MESSAGES, "images", ResponseConstants.RECEIPT_ID, ResponseConstants.RECEIPT_SHIPPING_ID);
    private final JsonAdapter<OrderShippingState> orderShippingStateAdapter;
    private final JsonAdapter<OrderShippingStatusMessages> orderShippingStatusMessagesAdapter;

    public OrderShippingStatusCardJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.orderShippingStateAdapter = yVar.mo68558c(OrderShippingState.class, emptySet, "state");
        this.orderShippingStatusMessagesAdapter = yVar.mo68558c(OrderShippingStatusMessages.class, emptySet, ResponseConstants.MESSAGES);
        this.listOfMainImageAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, MainImage.class), emptySet, "images");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "receiptId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "trackingId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(OrderShippingStatusCard)";
    }

    public OrderShippingStatusCard fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        OrderShippingState orderShippingState = null;
        OrderShippingStatusMessages orderShippingStatusMessages = null;
        List list = null;
        Long l2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                orderShippingState = this.orderShippingStateAdapter.fromJson(jsonReader);
                if (orderShippingState == null) {
                    throw C18215a.m30734m("state", "state", jsonReader);
                }
            } else if (Q == 1) {
                orderShippingStatusMessages = this.orderShippingStatusMessagesAdapter.fromJson(jsonReader);
                if (orderShippingStatusMessages == null) {
                    throw C18215a.m30734m(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
                }
            } else if (Q == 2) {
                list = this.listOfMainImageAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw C18215a.m30734m("images", "images", jsonReader);
                }
            } else if (Q == 3) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("receiptId", ResponseConstants.RECEIPT_ID, jsonReader);
                }
            } else if (Q == 4) {
                l2 = this.nullableLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (orderShippingState == null) {
            throw C18215a.m30728g("state", "state", jsonReader);
        } else if (orderShippingStatusMessages == null) {
            throw C18215a.m30728g(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
        } else if (list == null) {
            throw C18215a.m30728g("images", "images", jsonReader);
        } else if (l != null) {
            return new OrderShippingStatusCard(orderShippingState, orderShippingStatusMessages, list, l.longValue(), l2);
        } else {
            throw C18215a.m30728g("receiptId", ResponseConstants.RECEIPT_ID, jsonReader);
        }
    }

    public void toJson(C17412w wVar, OrderShippingStatusCard orderShippingStatusCard) {
        C19383o.m32797g(wVar, "writer");
        if (orderShippingStatusCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("state");
            this.orderShippingStateAdapter.toJson(wVar, orderShippingStatusCard.getState());
            wVar.mo68529h(ResponseConstants.MESSAGES);
            this.orderShippingStatusMessagesAdapter.toJson(wVar, orderShippingStatusCard.getMessages());
            wVar.mo68529h("images");
            this.listOfMainImageAdapter.toJson(wVar, orderShippingStatusCard.getImages());
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(orderShippingStatusCard.getReceiptId()));
            wVar.mo68529h(ResponseConstants.RECEIPT_SHIPPING_ID);
            this.nullableLongAdapter.toJson(wVar, orderShippingStatusCard.getTrackingId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
