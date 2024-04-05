package com.etsy.android.lib.models.apiv3.listing;

import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class InventoryProductOfferingJsonAdapter extends JsonAdapter<InventoryProductOffering> {
    public static final int $stable = 8;
    private volatile Constructor<InventoryProductOffering> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<InventoryProductOfferingWholesaleDecorator> nullableInventoryProductOfferingWholesaleDecoratorAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(AppsFlyerProperties.CHANNEL, ResponseConstants.OFFERING_ID, ResponseConstants.PERCENTAGE_DISCOUNT, ResponseConstants.PRICE, ResponseConstants.PRODUCT_ID, ResponseConstants.QUANTITY, "state", "unit_price", ResponseConstants.UNIT_PRICE_STRING, "unit_price_string_plus", "base_price", ResponseConstants.DISCOUNT_AMOUNT, "wholesale_decorator");

    public InventoryProductOfferingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, AppsFlyerProperties.CHANNEL);
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "offeringId");
        this.moneyAdapter = yVar.mo68558c(Money.class, emptySet, ResponseConstants.PRICE);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "state");
        this.nullableFloatAdapter = yVar.mo68558c(Float.class, emptySet, "unitPrice");
        this.nullableMoneyAdapter = yVar.mo68558c(Money.class, emptySet, "basePrice");
        this.nullableInventoryProductOfferingWholesaleDecoratorAdapter = yVar.mo68558c(InventoryProductOfferingWholesaleDecorator.class, emptySet, "wholesaleDecorator");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InventoryProductOffering)";
    }

    public InventoryProductOffering fromJson(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        Class<Integer> cls2 = Integer.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        Integer num2 = null;
        Money money = null;
        Integer num3 = null;
        String str2 = null;
        Float f = null;
        String str3 = null;
        String str4 = null;
        Money money2 = null;
        Money money3 = null;
        InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator = null;
        while (true) {
            Class<String> cls3 = cls;
            Class<Integer> cls4 = cls2;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        num = this.nullableIntAdapter.fromJson(jsonReader2);
                        i &= -2;
                        break;
                    case 1:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("offeringId", ResponseConstants.OFFERING_ID, jsonReader2);
                        }
                    case 2:
                        num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                        i &= -5;
                        break;
                    case 3:
                        money = this.moneyAdapter.fromJson(jsonReader2);
                        if (money != null) {
                            break;
                        } else {
                            throw C18215a.m30734m(ResponseConstants.PRICE, ResponseConstants.PRICE, jsonReader2);
                        }
                    case 4:
                        l2 = this.longAdapter.fromJson(jsonReader2);
                        if (l2 != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("productId", ResponseConstants.PRODUCT_ID, jsonReader2);
                        }
                    case 5:
                        num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                        i &= -33;
                        break;
                    case 6:
                        str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -65;
                        break;
                    case 7:
                        f = this.nullableFloatAdapter.fromJson(jsonReader2);
                        i &= -129;
                        break;
                    case 8:
                        str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -257;
                        break;
                    case 9:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -513;
                        break;
                    case 10:
                        money2 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                        i &= -1025;
                        break;
                    case 11:
                        money3 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                        i &= -2049;
                        break;
                    case 12:
                        inventoryProductOfferingWholesaleDecorator = this.nullableInventoryProductOfferingWholesaleDecoratorAdapter.fromJson(jsonReader2);
                        i &= -4097;
                        break;
                }
                cls = cls3;
                cls2 = cls4;
            } else {
                jsonReader.mo68413e();
                if (i != -8166) {
                    Constructor<InventoryProductOffering> constructor = this.constructorRef;
                    String str5 = "offeringId";
                    if (constructor == null) {
                        str = ResponseConstants.OFFERING_ID;
                        Class cls5 = Long.TYPE;
                        constructor = InventoryProductOffering.class.getDeclaredConstructor(new Class[]{cls4, cls5, cls4, Money.class, cls5, cls4, cls3, Float.class, cls3, cls3, Money.class, Money.class, InventoryProductOfferingWholesaleDecorator.class, Integer.TYPE, C18215a.f39928c});
                        this.constructorRef = constructor;
                        C19383o.m32796f(constructor, "InventoryProductOffering…his.constructorRef = it }");
                    } else {
                        str = ResponseConstants.OFFERING_ID;
                    }
                    Object[] objArr = new Object[15];
                    objArr[0] = num;
                    if (l != null) {
                        objArr[1] = Long.valueOf(l.longValue());
                        objArr[2] = num2;
                        if (money != null) {
                            objArr[3] = money;
                            if (l2 != null) {
                                objArr[4] = Long.valueOf(l2.longValue());
                                objArr[5] = num3;
                                objArr[6] = str2;
                                objArr[7] = f;
                                objArr[8] = str3;
                                objArr[9] = str4;
                                objArr[10] = money2;
                                objArr[11] = money3;
                                objArr[12] = inventoryProductOfferingWholesaleDecorator;
                                objArr[13] = Integer.valueOf(i);
                                objArr[14] = null;
                                InventoryProductOffering newInstance = constructor.newInstance(objArr);
                                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                return newInstance;
                            }
                            throw C18215a.m30728g("productId", ResponseConstants.PRODUCT_ID, jsonReader2);
                        }
                        throw C18215a.m30728g(ResponseConstants.PRICE, ResponseConstants.PRICE, jsonReader2);
                    }
                    throw C18215a.m30728g(str5, str, jsonReader2);
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (money == null) {
                        throw C18215a.m30728g(ResponseConstants.PRICE, ResponseConstants.PRICE, jsonReader2);
                    } else if (l2 != null) {
                        return new InventoryProductOffering(num, longValue, num2, money, l2.longValue(), num3, str2, f, str3, str4, money2, money3, inventoryProductOfferingWholesaleDecorator);
                    } else {
                        throw C18215a.m30728g("productId", ResponseConstants.PRODUCT_ID, jsonReader2);
                    }
                } else {
                    throw C18215a.m30728g("offeringId", ResponseConstants.OFFERING_ID, jsonReader2);
                }
            }
        }
    }

    public void toJson(C17412w wVar, InventoryProductOffering inventoryProductOffering) {
        C19383o.m32797g(wVar, "writer");
        if (inventoryProductOffering != null) {
            wVar.mo68522b();
            wVar.mo68529h(AppsFlyerProperties.CHANNEL);
            this.nullableIntAdapter.toJson(wVar, inventoryProductOffering.getChannel());
            wVar.mo68529h(ResponseConstants.OFFERING_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(inventoryProductOffering.getOfferingId()));
            wVar.mo68529h(ResponseConstants.PERCENTAGE_DISCOUNT);
            this.nullableIntAdapter.toJson(wVar, inventoryProductOffering.getPercentageDiscount());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.moneyAdapter.toJson(wVar, inventoryProductOffering.getPrice());
            wVar.mo68529h(ResponseConstants.PRODUCT_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(inventoryProductOffering.getProductId()));
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.nullableIntAdapter.toJson(wVar, inventoryProductOffering.getQuantity());
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, inventoryProductOffering.getState());
            wVar.mo68529h("unit_price");
            this.nullableFloatAdapter.toJson(wVar, inventoryProductOffering.getUnitPrice());
            wVar.mo68529h(ResponseConstants.UNIT_PRICE_STRING);
            this.nullableStringAdapter.toJson(wVar, inventoryProductOffering.getUnitPriceString());
            wVar.mo68529h("unit_price_string_plus");
            this.nullableStringAdapter.toJson(wVar, inventoryProductOffering.getUnitPriceStringPlus());
            wVar.mo68529h("base_price");
            this.nullableMoneyAdapter.toJson(wVar, inventoryProductOffering.getBasePrice());
            wVar.mo68529h(ResponseConstants.DISCOUNT_AMOUNT);
            this.nullableMoneyAdapter.toJson(wVar, inventoryProductOffering.getDiscountAmount());
            wVar.mo68529h("wholesale_decorator");
            this.nullableInventoryProductOfferingWholesaleDecoratorAdapter.toJson(wVar, inventoryProductOffering.getWholesaleDecorator());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
