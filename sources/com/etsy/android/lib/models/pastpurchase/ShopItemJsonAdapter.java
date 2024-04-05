package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopItemJsonAdapter extends JsonAdapter<ShopItem> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_id", ResponseConstants.SHOP_ICON_URL_FULL, ResponseConstants.SHOP_NAME);

    public ShopItemJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "shopId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "iconUrlFullxfull");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopItem)";
    }

    public ShopItem fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ShopItem(num, str, str2);
    }

    public void toJson(C17412w wVar, ShopItem shopItem) {
        C19383o.m32797g(wVar, "writer");
        if (shopItem != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_id");
            this.nullableIntAdapter.toJson(wVar, shopItem.getShopId());
            wVar.mo68529h(ResponseConstants.SHOP_ICON_URL_FULL);
            this.nullableStringAdapter.toJson(wVar, shopItem.getIconUrlFullxfull());
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, shopItem.getShopName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
