package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge;
import com.etsy.android.lib.models.apiv3.listing.QuickDelivery;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingShippingDetailsJsonAdapter extends JsonAdapter<ListingShippingDetails> {
    public static final int $stable = 8;
    private volatile Constructor<ListingShippingDetails> constructorRef;
    private final JsonAdapter<EstimatedDeliveryDateNudge> nullableEstimatedDeliveryDateNudgeAdapter;
    private final JsonAdapter<List<Country>> nullableListOfCountryAdapter;
    private final JsonAdapter<QuickDelivery> nullableQuickDeliveryAdapter;
    private final JsonAdapter<ShippingAddressPreference> nullableShippingAddressPreferenceAdapter;
    private final JsonAdapter<ShippingDisplay> nullableShippingDisplayAdapter;
    private final JsonAdapter<ShippingOption> nullableShippingOptionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.COUNTRIES, ResponseConstants.DEFAULT_ADDRESS, ResponseConstants.STANDARD_OPTION, ResponseConstants.SHIPPING_DISPLAY, ResponseConstants.QUICK_DELIVERY, ResponseConstants.EDD_PREVIEW, ResponseConstants.EDD_NUDGE, ResponseConstants.EDD_DATE_RANGE);

    public ListingShippingDetailsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, Country.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfCountryAdapter = yVar.mo68558c(d, emptySet, ResponseConstants.COUNTRIES);
        this.nullableShippingAddressPreferenceAdapter = yVar.mo68558c(ShippingAddressPreference.class, emptySet, "shippingAddress");
        this.nullableShippingOptionAdapter = yVar.mo68558c(ShippingOption.class, emptySet, "shippingOption");
        this.nullableShippingDisplayAdapter = yVar.mo68558c(ShippingDisplay.class, emptySet, "shippingDisplay");
        this.nullableQuickDeliveryAdapter = yVar.mo68558c(QuickDelivery.class, emptySet, "quickDelivery");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "eddPreview");
        this.nullableEstimatedDeliveryDateNudgeAdapter = yVar.mo68558c(EstimatedDeliveryDateNudge.class, emptySet, "estimatedDeliveryDateNudge");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingShippingDetails)";
    }

    public ListingShippingDetails fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        ShippingAddressPreference shippingAddressPreference = null;
        ShippingOption shippingOption = null;
        ShippingDisplay shippingDisplay = null;
        QuickDelivery quickDelivery = null;
        String str = null;
        EstimatedDeliveryDateNudge estimatedDeliveryDateNudge = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    list = this.nullableListOfCountryAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    shippingAddressPreference = this.nullableShippingAddressPreferenceAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    shippingOption = this.nullableShippingOptionAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    shippingDisplay = this.nullableShippingDisplayAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    quickDelivery = this.nullableQuickDeliveryAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    estimatedDeliveryDateNudge = this.nullableEstimatedDeliveryDateNudgeAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            return new ListingShippingDetails(list, shippingAddressPreference, shippingOption, shippingDisplay, quickDelivery, str, estimatedDeliveryDateNudge, str2);
        }
        Constructor<ListingShippingDetails> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingShippingDetails.class.getDeclaredConstructor(new Class[]{List.class, ShippingAddressPreference.class, ShippingOption.class, ShippingDisplay.class, QuickDelivery.class, cls, EstimatedDeliveryDateNudge.class, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingShippingDetails::…his.constructorRef = it }");
        }
        ListingShippingDetails newInstance = constructor.newInstance(new Object[]{list, shippingAddressPreference, shippingOption, shippingDisplay, quickDelivery, str, estimatedDeliveryDateNudge, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingShippingDetails listingShippingDetails) {
        C19383o.m32797g(wVar, "writer");
        if (listingShippingDetails != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.COUNTRIES);
            this.nullableListOfCountryAdapter.toJson(wVar, listingShippingDetails.getCountries());
            wVar.mo68529h(ResponseConstants.DEFAULT_ADDRESS);
            this.nullableShippingAddressPreferenceAdapter.toJson(wVar, listingShippingDetails.getShippingAddress());
            wVar.mo68529h(ResponseConstants.STANDARD_OPTION);
            this.nullableShippingOptionAdapter.toJson(wVar, listingShippingDetails.getShippingOption());
            wVar.mo68529h(ResponseConstants.SHIPPING_DISPLAY);
            this.nullableShippingDisplayAdapter.toJson(wVar, listingShippingDetails.getShippingDisplay());
            wVar.mo68529h(ResponseConstants.QUICK_DELIVERY);
            this.nullableQuickDeliveryAdapter.toJson(wVar, listingShippingDetails.getQuickDelivery());
            wVar.mo68529h(ResponseConstants.EDD_PREVIEW);
            this.nullableStringAdapter.toJson(wVar, listingShippingDetails.getEddPreview());
            wVar.mo68529h(ResponseConstants.EDD_NUDGE);
            this.nullableEstimatedDeliveryDateNudgeAdapter.toJson(wVar, listingShippingDetails.getEstimatedDeliveryDateNudge());
            wVar.mo68529h(ResponseConstants.EDD_DATE_RANGE);
            this.nullableStringAdapter.toJson(wVar, listingShippingDetails.getEstimatedDeliveryDateRange());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
