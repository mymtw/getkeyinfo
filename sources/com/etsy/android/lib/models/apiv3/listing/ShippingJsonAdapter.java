package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
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

public final class ShippingJsonAdapter extends JsonAdapter<Shipping> {
    public static final int $stable = 8;
    private volatile Constructor<Shipping> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ShippingProfileEntryBasic>> nullableListOfShippingProfileEntryBasicAdapter;
    private final JsonAdapter<QuickDelivery> nullableQuickDeliveryAdapter;
    private final JsonAdapter<ShippingUpgradeResults> nullableShippingUpgradeResultsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("has_processing_time_range", "location_text", ResponseConstants.PROCESSING_MAX, ResponseConstants.PROCESSING_MIN, "processing_time_range", "profile_type", "seller_geonames_country_id", "shipping_cost", "ships_everywhere", "ships_from", "ships_from_city", "ships_from_country_id", "ships_from_postal_code", "ships_from_state", "ships_to", "upgrades", ResponseConstants.QUICK_DELIVERY);

    public ShippingJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "hasProcessingTimeRange");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "locationText");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "processingMax");
        this.nullableListOfShippingProfileEntryBasicAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShippingProfileEntryBasic.class), emptySet, "shipsTo");
        this.nullableShippingUpgradeResultsAdapter = yVar2.mo68558c(ShippingUpgradeResults.class, emptySet, "upgrades");
        this.nullableQuickDeliveryAdapter = yVar2.mo68558c(QuickDelivery.class, emptySet, "quickDelivery");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Shipping)";
    }

    public Shipping fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i2 = -1;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str3 = null;
        Boolean bool2 = null;
        String str4 = null;
        String str5 = null;
        Integer num5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        ShippingUpgradeResults shippingUpgradeResults = null;
        QuickDelivery quickDelivery = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    continue;
                case 6:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -65;
                    continue;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    list = this.nullableListOfShippingProfileEntryBasicAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    shippingUpgradeResults = this.nullableShippingUpgradeResultsAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    quickDelivery = this.nullableQuickDeliveryAdapter.fromJson(jsonReader2);
                    i = -65537;
                    break;
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 == -131072) {
            return new Shipping(bool, str, num, num2, str2, num3, num4, str3, bool2, str4, str5, num5, str6, str7, list, shippingUpgradeResults, quickDelivery);
        }
        Constructor<Shipping> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Shipping.class.getDeclaredConstructor(new Class[]{Boolean.class, cls2, cls, cls, cls2, cls, cls, cls2, Boolean.class, cls2, cls2, cls, cls2, cls2, List.class, ShippingUpgradeResults.class, QuickDelivery.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Shipping::class.java.get…his.constructorRef = it }");
        }
        Shipping newInstance = constructor.newInstance(new Object[]{bool, str, num, num2, str2, num3, num4, str3, bool2, str4, str5, num5, str6, str7, list, shippingUpgradeResults, quickDelivery, Integer.valueOf(i2), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Shipping shipping) {
        C19383o.m32797g(wVar, "writer");
        if (shipping != null) {
            wVar.mo68522b();
            wVar.mo68529h("has_processing_time_range");
            this.nullableBooleanAdapter.toJson(wVar, shipping.getHasProcessingTimeRange());
            wVar.mo68529h("location_text");
            this.nullableStringAdapter.toJson(wVar, shipping.getLocationText());
            wVar.mo68529h(ResponseConstants.PROCESSING_MAX);
            this.nullableIntAdapter.toJson(wVar, shipping.getProcessingMax());
            wVar.mo68529h(ResponseConstants.PROCESSING_MIN);
            this.nullableIntAdapter.toJson(wVar, shipping.getProcessingMin());
            wVar.mo68529h("processing_time_range");
            this.nullableStringAdapter.toJson(wVar, shipping.getProcessingTimeRange());
            wVar.mo68529h("profile_type");
            this.nullableIntAdapter.toJson(wVar, shipping.getProfileType());
            wVar.mo68529h("seller_geonames_country_id");
            this.nullableIntAdapter.toJson(wVar, shipping.getSellerGeonamesCountryId());
            wVar.mo68529h("shipping_cost");
            this.nullableStringAdapter.toJson(wVar, shipping.getShippingCost());
            wVar.mo68529h("ships_everywhere");
            this.nullableBooleanAdapter.toJson(wVar, shipping.getShipsEverywhere());
            wVar.mo68529h("ships_from");
            this.nullableStringAdapter.toJson(wVar, shipping.getShipsFrom());
            wVar.mo68529h("ships_from_city");
            this.nullableStringAdapter.toJson(wVar, shipping.getShipsFromCity());
            wVar.mo68529h("ships_from_country_id");
            this.nullableIntAdapter.toJson(wVar, shipping.getShipsFromCountryId());
            wVar.mo68529h("ships_from_postal_code");
            this.nullableStringAdapter.toJson(wVar, shipping.getShipsFromPostalCode());
            wVar.mo68529h("ships_from_state");
            this.nullableStringAdapter.toJson(wVar, shipping.getShipsFromState());
            wVar.mo68529h("ships_to");
            this.nullableListOfShippingProfileEntryBasicAdapter.toJson(wVar, shipping.getShipsTo());
            wVar.mo68529h("upgrades");
            this.nullableShippingUpgradeResultsAdapter.toJson(wVar, shipping.getUpgrades());
            wVar.mo68529h(ResponseConstants.QUICK_DELIVERY);
            this.nullableQuickDeliveryAdapter.toJson(wVar, shipping.getQuickDelivery());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
