package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseReceiptJsonAdapter extends JsonAdapter<PastPurchaseReceipt> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PastPurchaseReceipt> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> longAtForceToLongAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<PastPurchaseShipment>> nullableListOfPastPurchaseShipmentAdapter;
    private final JsonAdapter<List<PastPurchaseTransaction>> nullableListOfPastPurchaseTransactionAdapter;
    private final JsonAdapter<PastPurchaseUser> nullablePastPurchaseUserAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RECEIPT_ID, "was_paid", "flagged_for_manual_fraud_review", "was_giftcard_balance_applied", "grandtotal", ResponseConstants.CURRENCY_CODE, "was_shipped", "is_in_person", ResponseConstants.CREATION_TSZ, "multi_shop_note", "shipments", "shipped_tsz", "estimated_shipped_tsz", ResponseConstants.TRANSPARENT_PRICE_MESSAGE, ResponseConstants.Includes.SELLER, ResponseConstants.Includes.TRANSACTIONS);

    public PastPurchaseReceiptJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar2.mo68558c(cls, emptySet, "receiptId");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "wasPaid");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "wasGiftcardBalanceApplied");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "grandTotal");
        this.nullableListOfPastPurchaseShipmentAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, PastPurchaseShipment.class), emptySet, "shipments");
        this.longAtForceToLongAdapter = yVar2.mo68558c(cls, C19382n.m32702C0(new C8720xaafc6d6d()), "shippedDate");
        this.nullablePastPurchaseUserAdapter = yVar2.mo68558c(PastPurchaseUser.class, emptySet, "seller");
        this.nullableListOfPastPurchaseTransactionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, PastPurchaseTransaction.class), emptySet, ResponseConstants.TRANSACTIONS);
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseReceipt)";
    }

    public PastPurchaseReceipt fromJson(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        Boolean bool2 = bool;
        Long l = 0L;
        int i = -1;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Boolean bool3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        PastPurchaseUser pastPurchaseUser = null;
        List list2 = null;
        Boolean bool4 = bool2;
        Boolean bool5 = bool4;
        while (true) {
            Class<String> cls2 = cls;
            Long l5 = l;
            Long l6 = l4;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        l2 = this.longAdapter.fromJson(jsonReader2);
                        if (l2 == null) {
                            throw C18215a.m30734m("receiptId", ResponseConstants.RECEIPT_ID, jsonReader2);
                        }
                        break;
                    case 1:
                        bool = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool != null) {
                            i &= -3;
                            break;
                        } else {
                            throw C18215a.m30734m("wasPaid", "was_paid", jsonReader2);
                        }
                    case 2:
                        bool4 = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool4 != null) {
                            i &= -5;
                            break;
                        } else {
                            throw C18215a.m30734m("isFlaggedForManualFraudReview", "flagged_for_manual_fraud_review", jsonReader2);
                        }
                    case 3:
                        bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                        i &= -9;
                        break;
                    case 4:
                        str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -17;
                        break;
                    case 5:
                        str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -33;
                        break;
                    case 6:
                        bool5 = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool5 != null) {
                            i &= -65;
                            break;
                        } else {
                            throw C18215a.m30734m("wasShipped", "was_shipped", jsonReader2);
                        }
                    case 7:
                        bool2 = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool2 != null) {
                            i &= -129;
                            break;
                        } else {
                            throw C18215a.m30734m("isInPerson", "is_in_person", jsonReader2);
                        }
                    case 8:
                        l3 = this.longAdapter.fromJson(jsonReader2);
                        if (l3 == null) {
                            throw C18215a.m30734m("creationDate", ResponseConstants.CREATION_TSZ, jsonReader2);
                        }
                        break;
                    case 9:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -513;
                        break;
                    case 10:
                        list = this.nullableListOfPastPurchaseShipmentAdapter.fromJson(jsonReader2);
                        i &= -1025;
                        break;
                    case 11:
                        l4 = this.longAtForceToLongAdapter.fromJson(jsonReader2);
                        if (l4 != null) {
                            cls = cls2;
                            l = l5;
                            continue;
                        } else {
                            throw C18215a.m30734m("shippedDate", "shipped_tsz", jsonReader2);
                        }
                    case 12:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l != null) {
                            i &= -4097;
                            cls = cls2;
                            break;
                        } else {
                            throw C18215a.m30734m("estimatedShippedDate", "estimated_shipped_tsz", jsonReader2);
                        }
                    case 13:
                        str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -8193;
                        break;
                    case 14:
                        pastPurchaseUser = this.nullablePastPurchaseUserAdapter.fromJson(jsonReader2);
                        i &= -16385;
                        break;
                    case 15:
                        list2 = this.nullableListOfPastPurchaseTransactionAdapter.fromJson(jsonReader2);
                        i &= -32769;
                        break;
                }
                cls = cls2;
                l = l5;
                l4 = l6;
            } else {
                jsonReader.mo68413e();
                if (i != -63231) {
                    Constructor<PastPurchaseReceipt> constructor = this.constructorRef;
                    String str6 = ResponseConstants.RECEIPT_ID;
                    if (constructor == null) {
                        str = "receiptId";
                        Class cls3 = Long.TYPE;
                        Class cls4 = Boolean.TYPE;
                        constructor = PastPurchaseReceipt.class.getDeclaredConstructor(new Class[]{cls3, cls4, cls4, Boolean.class, cls2, cls2, cls4, cls4, cls3, cls2, List.class, cls3, cls3, cls2, PastPurchaseUser.class, List.class, Integer.TYPE, C18215a.f39928c});
                        this.constructorRef = constructor;
                        C19383o.m32796f(constructor, "PastPurchaseReceipt::cla…his.constructorRef = it }");
                    } else {
                        str = "receiptId";
                    }
                    Object[] objArr = new Object[18];
                    if (l2 != null) {
                        objArr[0] = Long.valueOf(l2.longValue());
                        objArr[1] = bool;
                        objArr[2] = bool4;
                        objArr[3] = bool3;
                        objArr[4] = str2;
                        objArr[5] = str3;
                        objArr[6] = bool5;
                        objArr[7] = bool2;
                        if (l3 != null) {
                            objArr[8] = Long.valueOf(l3.longValue());
                            objArr[9] = str4;
                            objArr[10] = list;
                            if (l6 != null) {
                                objArr[11] = Long.valueOf(l6.longValue());
                                objArr[12] = l5;
                                objArr[13] = str5;
                                objArr[14] = pastPurchaseUser;
                                objArr[15] = list2;
                                objArr[16] = Integer.valueOf(i);
                                objArr[17] = null;
                                PastPurchaseReceipt newInstance = constructor.newInstance(objArr);
                                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                return newInstance;
                            }
                            throw C18215a.m30728g("shippedDate", "shipped_tsz", jsonReader2);
                        }
                        throw C18215a.m30728g("creationDate", ResponseConstants.CREATION_TSZ, jsonReader2);
                    }
                    throw C18215a.m30728g(str, str6, jsonReader2);
                } else if (l2 != null) {
                    long longValue = l2.longValue();
                    boolean booleanValue = bool.booleanValue();
                    boolean booleanValue2 = bool4.booleanValue();
                    boolean booleanValue3 = bool5.booleanValue();
                    boolean booleanValue4 = bool2.booleanValue();
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        if (l6 != null) {
                            return new PastPurchaseReceipt(longValue, booleanValue, booleanValue2, bool3, str2, str3, booleanValue3, booleanValue4, longValue2, str4, list, l6.longValue(), l5.longValue(), str5, pastPurchaseUser, list2);
                        }
                        throw C18215a.m30728g("shippedDate", "shipped_tsz", jsonReader2);
                    }
                    throw C18215a.m30728g("creationDate", ResponseConstants.CREATION_TSZ, jsonReader2);
                } else {
                    throw C18215a.m30728g("receiptId", ResponseConstants.RECEIPT_ID, jsonReader2);
                }
            }
        }
    }

    public void toJson(C17412w wVar, PastPurchaseReceipt pastPurchaseReceipt) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseReceipt != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(pastPurchaseReceipt.getReceiptId()));
            wVar.mo68529h("was_paid");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseReceipt.getWasPaid()));
            wVar.mo68529h("flagged_for_manual_fraud_review");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseReceipt.isFlaggedForManualFraudReview()));
            wVar.mo68529h("was_giftcard_balance_applied");
            this.nullableBooleanAdapter.toJson(wVar, pastPurchaseReceipt.getWasGiftcardBalanceApplied());
            wVar.mo68529h("grandtotal");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceipt.getGrandTotal());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceipt.getCurrencyCode());
            wVar.mo68529h("was_shipped");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseReceipt.getWasShipped()));
            wVar.mo68529h("is_in_person");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pastPurchaseReceipt.isInPerson()));
            wVar.mo68529h(ResponseConstants.CREATION_TSZ);
            this.longAdapter.toJson(wVar, Long.valueOf(pastPurchaseReceipt.getCreationDate()));
            wVar.mo68529h("multi_shop_note");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceipt.getMultiShopNote());
            wVar.mo68529h("shipments");
            this.nullableListOfPastPurchaseShipmentAdapter.toJson(wVar, pastPurchaseReceipt.getShipments());
            wVar.mo68529h("shipped_tsz");
            this.longAtForceToLongAdapter.toJson(wVar, Long.valueOf(pastPurchaseReceipt.getShippedDate()));
            wVar.mo68529h("estimated_shipped_tsz");
            this.longAdapter.toJson(wVar, Long.valueOf(pastPurchaseReceipt.getEstimatedShippedDate()));
            wVar.mo68529h(ResponseConstants.TRANSPARENT_PRICE_MESSAGE);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseReceipt.getTransparentPricingMessage());
            wVar.mo68529h(ResponseConstants.Includes.SELLER);
            this.nullablePastPurchaseUserAdapter.toJson(wVar, pastPurchaseReceipt.getSeller());
            wVar.mo68529h(ResponseConstants.Includes.TRANSACTIONS);
            this.nullableListOfPastPurchaseTransactionAdapter.toJson(wVar, pastPurchaseReceipt.getTransactions());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
