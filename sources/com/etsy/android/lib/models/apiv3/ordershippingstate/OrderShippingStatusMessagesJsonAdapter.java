package com.etsy.android.lib.models.apiv3.ordershippingstate;

import com.etsy.android.lib.models.MessageModel;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class OrderShippingStatusMessagesJsonAdapter extends JsonAdapter<OrderShippingStatusMessages> {
    public static final int $stable = 8;
    private final JsonAdapter<MessageModel> messageModelAdapter;
    private final JsonAdapter<MessageModel> nullableMessageModelAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("status_title", "status_text", "status_message", "estimated_delivery_title", "estimated_delivery_text");

    public OrderShippingStatusMessagesJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.messageModelAdapter = yVar.mo68558c(MessageModel.class, emptySet, "statusTitle");
        this.nullableMessageModelAdapter = yVar.mo68558c(MessageModel.class, emptySet, "statusMessage");
    }

    public String toString() {
        return "GeneratedJsonAdapter(OrderShippingStatusMessages)";
    }

    public OrderShippingStatusMessages fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        MessageModel messageModel = null;
        MessageModel messageModel2 = null;
        MessageModel messageModel3 = null;
        MessageModel messageModel4 = null;
        MessageModel messageModel5 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                messageModel = this.messageModelAdapter.fromJson(jsonReader);
                if (messageModel == null) {
                    throw C18215a.m30734m("statusTitle", "status_title", jsonReader);
                }
            } else if (Q == 1) {
                messageModel2 = this.messageModelAdapter.fromJson(jsonReader);
                if (messageModel2 == null) {
                    throw C18215a.m30734m("statusText", "status_text", jsonReader);
                }
            } else if (Q == 2) {
                messageModel3 = this.nullableMessageModelAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                messageModel4 = this.nullableMessageModelAdapter.fromJson(jsonReader);
            } else if (Q == 4) {
                messageModel5 = this.nullableMessageModelAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (messageModel == null) {
            throw C18215a.m30728g("statusTitle", "status_title", jsonReader);
        } else if (messageModel2 != null) {
            return new OrderShippingStatusMessages(messageModel, messageModel2, messageModel3, messageModel4, messageModel5);
        } else {
            throw C18215a.m30728g("statusText", "status_text", jsonReader);
        }
    }

    public void toJson(C17412w wVar, OrderShippingStatusMessages orderShippingStatusMessages) {
        C19383o.m32797g(wVar, "writer");
        if (orderShippingStatusMessages != null) {
            wVar.mo68522b();
            wVar.mo68529h("status_title");
            this.messageModelAdapter.toJson(wVar, orderShippingStatusMessages.getStatusTitle());
            wVar.mo68529h("status_text");
            this.messageModelAdapter.toJson(wVar, orderShippingStatusMessages.getStatusText());
            wVar.mo68529h("status_message");
            this.nullableMessageModelAdapter.toJson(wVar, orderShippingStatusMessages.getStatusMessage());
            wVar.mo68529h("estimated_delivery_title");
            this.nullableMessageModelAdapter.toJson(wVar, orderShippingStatusMessages.getEstimatedDeliveryTitle());
            wVar.mo68529h("estimated_delivery_text");
            this.nullableMessageModelAdapter.toJson(wVar, orderShippingStatusMessages.getEstimatedDeliveryText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
