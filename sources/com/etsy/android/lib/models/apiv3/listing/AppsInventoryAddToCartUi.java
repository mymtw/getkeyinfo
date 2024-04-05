package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AppsInventoryAddToCartUi {
    public static final int $stable = 8;
    private final List<ListingDescription> descriptionValues;
    private final FormattedMoney discountedDescription;
    private final FormattedMoney discountedPrice;
    private final Boolean hasVariableQuantity;
    private final FormattedMoney price;
    private final RangeSelect quantity;
    private final List<AppsInventoryUiSelect> selects;
    private final String unitPrice;
    private final String unitPriceString;
    private final String unitPriceStringPlus;

    public AppsInventoryAddToCartUi(@C17402n(name = "description_values") List<ListingDescription> list, @C17402n(name = "has_variable_quantity") Boolean bool, @C17402n(name = "price") FormattedMoney formattedMoney, @C17402n(name = "quantity") RangeSelect rangeSelect, @C17402n(name = "selects") List<AppsInventoryUiSelect> list2, @C17402n(name = "unit_price") String str, @C17402n(name = "unit_price_string") String str2, @C17402n(name = "unit_price_string_plus") String str3, @C17402n(name = "discounted_price") FormattedMoney formattedMoney2, @C17402n(name = "discount_description") FormattedMoney formattedMoney3) {
        this.descriptionValues = list;
        this.hasVariableQuantity = bool;
        this.price = formattedMoney;
        this.quantity = rangeSelect;
        this.selects = list2;
        this.unitPrice = str;
        this.unitPriceString = str2;
        this.unitPriceStringPlus = str3;
        this.discountedPrice = formattedMoney2;
        this.discountedDescription = formattedMoney3;
    }

    public static /* synthetic */ AppsInventoryAddToCartUi copy$default(AppsInventoryAddToCartUi appsInventoryAddToCartUi, List list, Boolean bool, FormattedMoney formattedMoney, RangeSelect rangeSelect, List list2, String str, String str2, String str3, FormattedMoney formattedMoney2, FormattedMoney formattedMoney3, int i, Object obj) {
        AppsInventoryAddToCartUi appsInventoryAddToCartUi2 = appsInventoryAddToCartUi;
        int i2 = i;
        return appsInventoryAddToCartUi.copy((i2 & 1) != 0 ? appsInventoryAddToCartUi2.descriptionValues : list, (i2 & 2) != 0 ? appsInventoryAddToCartUi2.hasVariableQuantity : bool, (i2 & 4) != 0 ? appsInventoryAddToCartUi2.price : formattedMoney, (i2 & 8) != 0 ? appsInventoryAddToCartUi2.quantity : rangeSelect, (i2 & 16) != 0 ? appsInventoryAddToCartUi2.selects : list2, (i2 & 32) != 0 ? appsInventoryAddToCartUi2.unitPrice : str, (i2 & 64) != 0 ? appsInventoryAddToCartUi2.unitPriceString : str2, (i2 & 128) != 0 ? appsInventoryAddToCartUi2.unitPriceStringPlus : str3, (i2 & 256) != 0 ? appsInventoryAddToCartUi2.discountedPrice : formattedMoney2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? appsInventoryAddToCartUi2.discountedDescription : formattedMoney3);
    }

    public final List<ListingDescription> component1() {
        return this.descriptionValues;
    }

    public final FormattedMoney component10() {
        return this.discountedDescription;
    }

    public final Boolean component2() {
        return this.hasVariableQuantity;
    }

    public final FormattedMoney component3() {
        return this.price;
    }

    public final RangeSelect component4() {
        return this.quantity;
    }

    public final List<AppsInventoryUiSelect> component5() {
        return this.selects;
    }

    public final String component6() {
        return this.unitPrice;
    }

    public final String component7() {
        return this.unitPriceString;
    }

    public final String component8() {
        return this.unitPriceStringPlus;
    }

    public final FormattedMoney component9() {
        return this.discountedPrice;
    }

    public final AppsInventoryAddToCartUi copy(@C17402n(name = "description_values") List<ListingDescription> list, @C17402n(name = "has_variable_quantity") Boolean bool, @C17402n(name = "price") FormattedMoney formattedMoney, @C17402n(name = "quantity") RangeSelect rangeSelect, @C17402n(name = "selects") List<AppsInventoryUiSelect> list2, @C17402n(name = "unit_price") String str, @C17402n(name = "unit_price_string") String str2, @C17402n(name = "unit_price_string_plus") String str3, @C17402n(name = "discounted_price") FormattedMoney formattedMoney2, @C17402n(name = "discount_description") FormattedMoney formattedMoney3) {
        return new AppsInventoryAddToCartUi(list, bool, formattedMoney, rangeSelect, list2, str, str2, str3, formattedMoney2, formattedMoney3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInventoryAddToCartUi)) {
            return false;
        }
        AppsInventoryAddToCartUi appsInventoryAddToCartUi = (AppsInventoryAddToCartUi) obj;
        return C19383o.m32792b(this.descriptionValues, appsInventoryAddToCartUi.descriptionValues) && C19383o.m32792b(this.hasVariableQuantity, appsInventoryAddToCartUi.hasVariableQuantity) && C19383o.m32792b(this.price, appsInventoryAddToCartUi.price) && C19383o.m32792b(this.quantity, appsInventoryAddToCartUi.quantity) && C19383o.m32792b(this.selects, appsInventoryAddToCartUi.selects) && C19383o.m32792b(this.unitPrice, appsInventoryAddToCartUi.unitPrice) && C19383o.m32792b(this.unitPriceString, appsInventoryAddToCartUi.unitPriceString) && C19383o.m32792b(this.unitPriceStringPlus, appsInventoryAddToCartUi.unitPriceStringPlus) && C19383o.m32792b(this.discountedPrice, appsInventoryAddToCartUi.discountedPrice) && C19383o.m32792b(this.discountedDescription, appsInventoryAddToCartUi.discountedDescription);
    }

    public final List<ListingDescription> getDescriptionValues() {
        return this.descriptionValues;
    }

    public final FormattedMoney getDiscountedDescription() {
        return this.discountedDescription;
    }

    public final FormattedMoney getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final Boolean getHasVariableQuantity() {
        return this.hasVariableQuantity;
    }

    public final FormattedMoney getPrice() {
        return this.price;
    }

    public final RangeSelect getQuantity() {
        return this.quantity;
    }

    public final List<AppsInventoryUiSelect> getSelects() {
        return this.selects;
    }

    public final String getUnitPrice() {
        return this.unitPrice;
    }

    public final String getUnitPriceString() {
        return this.unitPriceString;
    }

    public final String getUnitPriceStringPlus() {
        return this.unitPriceStringPlus;
    }

    public int hashCode() {
        List<ListingDescription> list = this.descriptionValues;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasVariableQuantity;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        FormattedMoney formattedMoney = this.price;
        int hashCode3 = (hashCode2 + (formattedMoney == null ? 0 : formattedMoney.hashCode())) * 31;
        RangeSelect rangeSelect = this.quantity;
        int hashCode4 = (hashCode3 + (rangeSelect == null ? 0 : rangeSelect.hashCode())) * 31;
        List<AppsInventoryUiSelect> list2 = this.selects;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.unitPrice;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unitPriceString;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unitPriceStringPlus;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FormattedMoney formattedMoney2 = this.discountedPrice;
        int hashCode9 = (hashCode8 + (formattedMoney2 == null ? 0 : formattedMoney2.hashCode())) * 31;
        FormattedMoney formattedMoney3 = this.discountedDescription;
        if (formattedMoney3 != null) {
            i = formattedMoney3.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AppsInventoryAddToCartUi(descriptionValues=");
        h.append(this.descriptionValues);
        h.append(", hasVariableQuantity=");
        h.append(this.hasVariableQuantity);
        h.append(", price=");
        h.append(this.price);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", selects=");
        h.append(this.selects);
        h.append(", unitPrice=");
        h.append(this.unitPrice);
        h.append(", unitPriceString=");
        h.append(this.unitPriceString);
        h.append(", unitPriceStringPlus=");
        h.append(this.unitPriceStringPlus);
        h.append(", discountedPrice=");
        h.append(this.discountedPrice);
        h.append(", discountedDescription=");
        h.append(this.discountedDescription);
        h.append(')');
        return h.toString();
    }
}
