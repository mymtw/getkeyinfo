package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class InventoryProductOfferingWholesaleDecoratorJsonAdapter extends JsonAdapter<InventoryProductOfferingWholesaleDecorator> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_id", "product_offering_id", "minimum_quantity", "retail_price");

    public InventoryProductOfferingWholesaleDecoratorJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "shopId");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "minimumQuantity");
        this.nullableMoneyAdapter = yVar.mo68558c(Money.class, emptySet, "retailPrice");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InventoryProductOfferingWholesaleDecorator)";
    }

    public InventoryProductOfferingWholesaleDecorator fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        Long l2 = null;
        Integer num = null;
        Money money = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                l2 = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                money = this.nullableMoneyAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new InventoryProductOfferingWholesaleDecorator(l, l2, num, money);
    }

    public void toJson(C17412w wVar, InventoryProductOfferingWholesaleDecorator inventoryProductOfferingWholesaleDecorator) {
        C19383o.m32797g(wVar, "writer");
        if (inventoryProductOfferingWholesaleDecorator != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, inventoryProductOfferingWholesaleDecorator.getShopId());
            wVar.mo68529h("product_offering_id");
            this.nullableLongAdapter.toJson(wVar, inventoryProductOfferingWholesaleDecorator.getProductOfferingId());
            wVar.mo68529h("minimum_quantity");
            this.nullableIntAdapter.toJson(wVar, inventoryProductOfferingWholesaleDecorator.getMinimumQuantity());
            wVar.mo68529h("retail_price");
            this.nullableMoneyAdapter.toJson(wVar, inventoryProductOfferingWholesaleDecorator.getRetailPrice());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
