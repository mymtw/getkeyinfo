package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShopsManufacturerJsonAdapter extends JsonAdapter<ShopsManufacturer> {
    public static final int $stable = 8;
    private volatile Constructor<ShopsManufacturer> constructorRef;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.MANUFACTURER_ID, "name", "description", "location", "geoname_id", ResponseConstants.CREATE_DATE, ResponseConstants.UPDATE_DATE);

    public ShopsManufacturerJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "manufacturerId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "name");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsManufacturer)";
    }

    public ShopsManufacturer fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -128) {
            return new ShopsManufacturer(l, str, str2, str3, str4, str5, str6);
        }
        Constructor<ShopsManufacturer> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShopsManufacturer.class.getDeclaredConstructor(new Class[]{Long.class, cls, cls, cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShopsManufacturer::class…his.constructorRef = it }");
        }
        ShopsManufacturer newInstance = constructor.newInstance(new Object[]{l, str, str2, str3, str4, str5, str6, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShopsManufacturer shopsManufacturer) {
        C19383o.m32797g(wVar, "writer");
        if (shopsManufacturer != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.MANUFACTURER_ID);
            this.nullableLongAdapter.toJson(wVar, shopsManufacturer.getManufacturerId());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, shopsManufacturer.getName());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, shopsManufacturer.getDescription());
            wVar.mo68529h("location");
            this.nullableStringAdapter.toJson(wVar, shopsManufacturer.getLocation());
            wVar.mo68529h("geoname_id");
            this.nullableStringAdapter.toJson(wVar, shopsManufacturer.getGeonameId());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableStringAdapter.toJson(wVar, shopsManufacturer.getCreateDate());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableStringAdapter.toJson(wVar, shopsManufacturer.getUdpateDate());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
