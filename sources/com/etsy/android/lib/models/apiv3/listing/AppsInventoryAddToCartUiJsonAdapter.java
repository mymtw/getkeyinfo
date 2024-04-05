package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class AppsInventoryAddToCartUiJsonAdapter extends JsonAdapter<AppsInventoryAddToCartUi> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<FormattedMoney> nullableFormattedMoneyAdapter;
    private final JsonAdapter<List<AppsInventoryUiSelect>> nullableListOfAppsInventoryUiSelectAdapter;
    private final JsonAdapter<List<ListingDescription>> nullableListOfListingDescriptionAdapter;
    private final JsonAdapter<RangeSelect> nullableRangeSelectAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("description_values", ResponseConstants.HAS_VARIABLE_QUANTITY, ResponseConstants.PRICE, ResponseConstants.QUANTITY, ResponseConstants.SELECTS, "unit_price", ResponseConstants.UNIT_PRICE_STRING, "unit_price_string_plus", ResponseConstants.DISCOUNTED_PRICE, ResponseConstants.DISCOUNT_DESCRIPTION);

    public AppsInventoryAddToCartUiJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, ListingDescription.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfListingDescriptionAdapter = yVar.mo68558c(d, emptySet, "descriptionValues");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasVariableQuantity");
        this.nullableFormattedMoneyAdapter = yVar.mo68558c(FormattedMoney.class, emptySet, ResponseConstants.PRICE);
        this.nullableRangeSelectAdapter = yVar.mo68558c(RangeSelect.class, emptySet, ResponseConstants.QUANTITY);
        this.nullableListOfAppsInventoryUiSelectAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, AppsInventoryUiSelect.class), emptySet, ResponseConstants.SELECTS);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "unitPrice");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppsInventoryAddToCartUi)";
    }

    public AppsInventoryAddToCartUi fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        Boolean bool = null;
        FormattedMoney formattedMoney = null;
        RangeSelect rangeSelect = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        FormattedMoney formattedMoney2 = null;
        FormattedMoney formattedMoney3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    list = this.nullableListOfListingDescriptionAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    formattedMoney = this.nullableFormattedMoneyAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    rangeSelect = this.nullableRangeSelectAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list2 = this.nullableListOfAppsInventoryUiSelectAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    formattedMoney2 = this.nullableFormattedMoneyAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    formattedMoney3 = this.nullableFormattedMoneyAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new AppsInventoryAddToCartUi(list, bool, formattedMoney, rangeSelect, list2, str, str2, str3, formattedMoney2, formattedMoney3);
    }

    public void toJson(C17412w wVar, AppsInventoryAddToCartUi appsInventoryAddToCartUi) {
        C19383o.m32797g(wVar, "writer");
        if (appsInventoryAddToCartUi != null) {
            wVar.mo68522b();
            wVar.mo68529h("description_values");
            this.nullableListOfListingDescriptionAdapter.toJson(wVar, appsInventoryAddToCartUi.getDescriptionValues());
            wVar.mo68529h(ResponseConstants.HAS_VARIABLE_QUANTITY);
            this.nullableBooleanAdapter.toJson(wVar, appsInventoryAddToCartUi.getHasVariableQuantity());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableFormattedMoneyAdapter.toJson(wVar, appsInventoryAddToCartUi.getPrice());
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.nullableRangeSelectAdapter.toJson(wVar, appsInventoryAddToCartUi.getQuantity());
            wVar.mo68529h(ResponseConstants.SELECTS);
            this.nullableListOfAppsInventoryUiSelectAdapter.toJson(wVar, appsInventoryAddToCartUi.getSelects());
            wVar.mo68529h("unit_price");
            this.nullableStringAdapter.toJson(wVar, appsInventoryAddToCartUi.getUnitPrice());
            wVar.mo68529h(ResponseConstants.UNIT_PRICE_STRING);
            this.nullableStringAdapter.toJson(wVar, appsInventoryAddToCartUi.getUnitPriceString());
            wVar.mo68529h("unit_price_string_plus");
            this.nullableStringAdapter.toJson(wVar, appsInventoryAddToCartUi.getUnitPriceStringPlus());
            wVar.mo68529h(ResponseConstants.DISCOUNTED_PRICE);
            this.nullableFormattedMoneyAdapter.toJson(wVar, appsInventoryAddToCartUi.getDiscountedPrice());
            wVar.mo68529h(ResponseConstants.DISCOUNT_DESCRIPTION);
            this.nullableFormattedMoneyAdapter.toJson(wVar, appsInventoryAddToCartUi.getDiscountedDescription());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
