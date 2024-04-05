package com.etsy.android.lib.models.conversation.context;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.conversation.CustomOrder;
import com.etsy.android.lib.models.conversation.context.CustomOrderContext;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CustomOrderContextJsonAdapter extends JsonAdapter<CustomOrderContext> {
    public static final int $stable = 8;
    private final JsonAdapter<CustomOrderContext.Action> actionAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CustomOrderContext> constructorRef;
    private final JsonAdapter<EtsyId> etsyIdAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<CustomOrder> nullableCustomOrderAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("formatted_status", "formatted_button_title", "reserved_listing_id", ResponseConstants.RECEIPT_ID, "action_type", "created_from_listing_id", "shop_id", ResponseConstants.BUYER_USER_ID, ResponseConstants.CONVERSATION_ID, "is_draft", "show_status_bar", "order_card", "suggested_title", ResponseConstants.CONTEXT_TYPE_ID, "actionType", "buyerEtsyId", "convoEtsyId", "createdFromListingEtsyId", "receiptEtsyId", "reservedListingEtsyId", "shopEtsyId");
    private final JsonAdapter<String> stringAdapter;

    public CustomOrderContextJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "formattedStatus");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "reservedListingID");
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, "actionString");
        this.longAdapter = yVar2.mo68558c(Long.TYPE, emptySet, "shopID");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "isDraft");
        this.nullableCustomOrderAdapter = yVar2.mo68558c(CustomOrder.class, emptySet, "customOrder");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, "contextTypeId");
        this.actionAdapter = yVar2.mo68558c(CustomOrderContext.Action.class, emptySet, "actionType");
        this.etsyIdAdapter = yVar2.mo68558c(EtsyId.class, emptySet, "buyerEtsyId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CustomOrderContext)";
    }

    public CustomOrderContext fromJson(JsonReader jsonReader) {
        CustomOrderContext customOrderContext;
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Long l = 0L;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        Boolean bool2 = bool;
        Integer num = 0;
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        CustomOrder customOrder = null;
        String str4 = null;
        CustomOrderContext.Action action = null;
        EtsyId etsyId = null;
        EtsyId etsyId2 = null;
        EtsyId etsyId3 = null;
        EtsyId etsyId4 = null;
        EtsyId etsyId5 = null;
        EtsyId etsyId6 = null;
        Long l5 = l;
        Long l6 = l5;
        Boolean bool3 = bool2;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    break;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    break;
                case 2:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    break;
                case 3:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    break;
                case 4:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i2 &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("actionString", "action_type", jsonReader2);
                    }
                case 5:
                    l4 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    break;
                case 6:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        i2 &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("shopID", "shop_id", jsonReader2);
                    }
                case 7:
                    l5 = this.longAdapter.fromJson(jsonReader2);
                    if (l5 != null) {
                        i2 &= -129;
                        break;
                    } else {
                        throw C18215a.m30734m("buyerUserID", ResponseConstants.BUYER_USER_ID, jsonReader2);
                    }
                case 8:
                    l6 = this.longAdapter.fromJson(jsonReader2);
                    if (l6 != null) {
                        i2 &= -257;
                        break;
                    } else {
                        throw C18215a.m30734m("conversationID", ResponseConstants.CONVERSATION_ID, jsonReader2);
                    }
                case 9:
                    bool3 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool3 != null) {
                        i2 &= -513;
                        break;
                    } else {
                        throw C18215a.m30734m("isDraft", "is_draft", jsonReader2);
                    }
                case 10:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i2 &= -1025;
                        break;
                    } else {
                        throw C18215a.m30734m("showStatusBar", "show_status_bar", jsonReader2);
                    }
                case 11:
                    customOrder = this.nullableCustomOrderAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    break;
                case 12:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    break;
                case 13:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i2 &= -8193;
                        break;
                    } else {
                        throw C18215a.m30734m("contextTypeId", ResponseConstants.CONTEXT_TYPE_ID, jsonReader2);
                    }
                case 14:
                    action = this.actionAdapter.fromJson(jsonReader2);
                    if (action != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("actionType", "actionType", jsonReader2);
                    }
                case 15:
                    etsyId = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("buyerEtsyId", "buyerEtsyId", jsonReader2);
                    }
                case 16:
                    etsyId2 = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId2 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("convoEtsyId", "convoEtsyId", jsonReader2);
                    }
                case 17:
                    etsyId3 = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId3 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("createdFromListingEtsyId", "createdFromListingEtsyId", jsonReader2);
                    }
                case 18:
                    etsyId4 = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId4 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("receiptEtsyId", "receiptEtsyId", jsonReader2);
                    }
                case 19:
                    etsyId5 = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId5 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("reservedListingEtsyId", "reservedListingEtsyId", jsonReader2);
                    }
                case 20:
                    etsyId6 = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId6 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("shopEtsyId", "shopEtsyId", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i2 == -16384) {
            String str5 = str;
            C19383o.m32795e(str5, "null cannot be cast to non-null type kotlin.String");
            customOrderContext = new CustomOrderContext(str2, str3, l2, l3, str5, l4, l.longValue(), l5.longValue(), l6.longValue(), bool3.booleanValue(), bool2.booleanValue(), customOrder, str4, num.intValue());
        } else {
            String str6 = str;
            Constructor<CustomOrderContext> constructor = this.constructorRef;
            if (constructor == null) {
                i = i2;
                Class cls3 = Long.TYPE;
                Class cls4 = Boolean.TYPE;
                Class cls5 = Integer.TYPE;
                constructor = CustomOrderContext.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls, cls, cls2, cls, cls3, cls3, cls3, cls4, cls4, CustomOrder.class, cls2, cls5, cls5, C18215a.f39928c});
                this.constructorRef = constructor;
                C19394m mVar = C19394m.f43287a;
                C19383o.m32796f(constructor, "CustomOrderContext::clas…his.constructorRef = it }");
            } else {
                i = i2;
            }
            CustomOrderContext newInstance = constructor.newInstance(new Object[]{str2, str3, l2, l3, str6, l4, l, l5, l6, bool3, bool2, customOrder, str4, num, Integer.valueOf(i), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            customOrderContext = newInstance;
        }
        if (action == null) {
            action = customOrderContext.getActionType();
        }
        customOrderContext.setActionType(action);
        if (etsyId == null) {
            etsyId = customOrderContext.getBuyerEtsyId();
        }
        customOrderContext.setBuyerEtsyId(etsyId);
        if (etsyId2 == null) {
            etsyId2 = customOrderContext.getConvoEtsyId();
        }
        customOrderContext.setConvoEtsyId(etsyId2);
        if (etsyId3 == null) {
            etsyId3 = customOrderContext.getCreatedFromListingEtsyId();
        }
        customOrderContext.setCreatedFromListingEtsyId(etsyId3);
        if (etsyId4 == null) {
            etsyId4 = customOrderContext.getReceiptEtsyId();
        }
        customOrderContext.setReceiptEtsyId(etsyId4);
        if (etsyId5 == null) {
            etsyId5 = customOrderContext.getReservedListingEtsyId();
        }
        customOrderContext.setReservedListingEtsyId(etsyId5);
        if (etsyId6 == null) {
            etsyId6 = customOrderContext.getShopEtsyId();
        }
        customOrderContext.setShopEtsyId(etsyId6);
        return customOrderContext;
    }

    public void toJson(C17412w wVar, CustomOrderContext customOrderContext) {
        C19383o.m32797g(wVar, "writer");
        if (customOrderContext != null) {
            wVar.mo68522b();
            wVar.mo68529h("formatted_status");
            this.nullableStringAdapter.toJson(wVar, customOrderContext.getFormattedStatus());
            wVar.mo68529h("formatted_button_title");
            this.nullableStringAdapter.toJson(wVar, customOrderContext.getFormattedButtonTitle());
            wVar.mo68529h("reserved_listing_id");
            this.nullableLongAdapter.toJson(wVar, customOrderContext.getReservedListingID());
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.nullableLongAdapter.toJson(wVar, customOrderContext.getReceiptID());
            wVar.mo68529h("action_type");
            this.stringAdapter.toJson(wVar, customOrderContext.getActionString());
            wVar.mo68529h("created_from_listing_id");
            this.nullableLongAdapter.toJson(wVar, customOrderContext.getCreatedFromListingID());
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(customOrderContext.getShopID()));
            wVar.mo68529h(ResponseConstants.BUYER_USER_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(customOrderContext.getBuyerUserID()));
            wVar.mo68529h(ResponseConstants.CONVERSATION_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(customOrderContext.getConversationID()));
            wVar.mo68529h("is_draft");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(customOrderContext.isDraft()));
            wVar.mo68529h("show_status_bar");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(customOrderContext.getShowStatusBar()));
            wVar.mo68529h("order_card");
            this.nullableCustomOrderAdapter.toJson(wVar, customOrderContext.getCustomOrder());
            wVar.mo68529h("suggested_title");
            this.nullableStringAdapter.toJson(wVar, customOrderContext.getSuggestedTitle());
            wVar.mo68529h(ResponseConstants.CONTEXT_TYPE_ID);
            this.intAdapter.toJson(wVar, Integer.valueOf(customOrderContext.getContextTypeId()));
            wVar.mo68529h("actionType");
            this.actionAdapter.toJson(wVar, customOrderContext.getActionType());
            wVar.mo68529h("buyerEtsyId");
            this.etsyIdAdapter.toJson(wVar, customOrderContext.getBuyerEtsyId());
            wVar.mo68529h("convoEtsyId");
            this.etsyIdAdapter.toJson(wVar, customOrderContext.getConvoEtsyId());
            wVar.mo68529h("createdFromListingEtsyId");
            this.etsyIdAdapter.toJson(wVar, customOrderContext.getCreatedFromListingEtsyId());
            wVar.mo68529h("receiptEtsyId");
            this.etsyIdAdapter.toJson(wVar, customOrderContext.getReceiptEtsyId());
            wVar.mo68529h("reservedListingEtsyId");
            this.etsyIdAdapter.toJson(wVar, customOrderContext.getReservedListingEtsyId());
            wVar.mo68529h("shopEtsyId");
            this.etsyIdAdapter.toJson(wVar, customOrderContext.getShopEtsyId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
