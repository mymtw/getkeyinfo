package com.etsy.android.lib.models.datatypes;

import android.content.res.Resources;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;

public class ShopHomeSortOption extends BaseModel {
    public static final String SORT_CUSTOM = "custom";
    public static final String SORT_DATE_DESC = "date_desc";
    public static final String SORT_PRICE_ASC = "price_asc";
    public static final String SORT_PRICE_DESC = "price_desc";
    public static final String SORT_RELEVANCE = "relevance";
    public String mOptionId;
    public String mTitle;

    public ShopHomeSortOption(String str, String str2) {
        this.mOptionId = str;
        this.mTitle = str2;
    }

    public static ShopHomeSortOption create(String str, Resources resources) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2125427077:
                if (str.equals(SORT_PRICE_ASC)) {
                    c = 0;
                    break;
                }
                break;
            case -1463653433:
                if (str.equals(SORT_PRICE_DESC)) {
                    c = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals(SORT_CUSTOM)) {
                    c = 2;
                    break;
                }
                break;
            case -249338750:
                if (str.equals(SORT_DATE_DESC)) {
                    c = 3;
                    break;
                }
                break;
            case 108474201:
                if (str.equals(SORT_RELEVANCE)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new ShopHomeSortOption(str, resources.getString(R.string.order_lowest_price));
            case 1:
                return new ShopHomeSortOption(str, resources.getString(R.string.order_highest_price));
            case 2:
                return new ShopHomeSortOption(str, resources.getString(R.string.order_custom));
            case 3:
                return new ShopHomeSortOption(str, resources.getString(R.string.order_most_recent));
            case 4:
                return new ShopHomeSortOption(str, resources.getString(R.string.order_relevance));
            default:
                throw new IllegalStateException(C0326j.m864i("Unsupported sortType ", str));
        }
    }

    public static List<ShopHomeSortOption> defaultSortOptions(Resources resources, ShopV3 shopV3) {
        return defaultSortOptions(resources, shopV3.isListingRearrangeEnabled());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ShopHomeSortOption)) {
            return this.mOptionId.equals(((ShopHomeSortOption) obj).getOptionId());
        }
        return false;
    }

    public String getOptionId() {
        return this.mOptionId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return this.mOptionId.hashCode();
    }

    public void parseData(JsonParser jsonParser) {
    }

    public String toString() {
        return this.mTitle;
    }

    public static List<ShopHomeSortOption> defaultSortOptions(Resources resources, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(create(SORT_CUSTOM, resources));
        }
        arrayList.add(create(SORT_RELEVANCE, resources));
        arrayList.add(create(SORT_DATE_DESC, resources));
        arrayList.add(create(SORT_PRICE_DESC, resources));
        arrayList.add(create(SORT_PRICE_ASC, resources));
        return arrayList;
    }
}
