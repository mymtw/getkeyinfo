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

public final class ShippingOptionJsonAdapter extends JsonAdapter<ShippingOption> {
    public static final int $stable = 8;
    private volatile Constructor<ShippingOption> constructorRef;
    private final JsonAdapter<Float> floatAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.COST, "cost_in_usd", ResponseConstants.CURRENCY_CODE, "name", ResponseConstants.OPTION_ID, ResponseConstants.OPTION_TYPE, "origin_country_id", "origin_postal_code", "shipping_profile_type");

    public ShippingOptionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Float.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.floatAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.COST);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, AppsFlyerProperties.CURRENCY_CODE);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "optionType");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShippingOption)";
    }

    public ShippingOption fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Float f = null;
        Float f2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        Integer num3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    f = this.floatAdapter.fromJson(jsonReader2);
                    if (f != null) {
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.COST, ResponseConstants.COST, jsonReader2);
                    }
                case 1:
                    f2 = this.floatAdapter.fromJson(jsonReader2);
                    if (f2 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("costInUsd", "cost_in_usd", jsonReader2);
                    }
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -509) {
            Constructor<ShippingOption> constructor = this.constructorRef;
            String str5 = ResponseConstants.COST;
            if (constructor == null) {
                Class cls3 = Float.TYPE;
                constructor = ShippingOption.class.getDeclaredConstructor(new Class[]{cls3, cls3, cls2, cls2, cls2, cls, cls, cls2, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ShippingOption::class.ja…his.constructorRef = it }");
            }
            Object[] objArr = new Object[11];
            if (f != null) {
                objArr[0] = Float.valueOf(f.floatValue());
                if (f2 != null) {
                    objArr[1] = Float.valueOf(f2.floatValue());
                    objArr[2] = str;
                    objArr[3] = str2;
                    objArr[4] = str3;
                    objArr[5] = num;
                    objArr[6] = num2;
                    objArr[7] = str4;
                    objArr[8] = num3;
                    objArr[9] = Integer.valueOf(i);
                    objArr[10] = null;
                    ShippingOption newInstance = constructor.newInstance(objArr);
                    C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw C18215a.m30728g("costInUsd", "cost_in_usd", jsonReader);
            }
            String str6 = str5;
            throw C18215a.m30728g(str6, str6, jsonReader);
        } else if (f != null) {
            float floatValue = f.floatValue();
            if (f2 != null) {
                return new ShippingOption(floatValue, f2.floatValue(), str, str2, str3, num, num2, str4, num3);
            }
            throw C18215a.m30728g("costInUsd", "cost_in_usd", jsonReader2);
        } else {
            throw C18215a.m30728g(ResponseConstants.COST, ResponseConstants.COST, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, ShippingOption shippingOption) {
        C19383o.m32797g(wVar, "writer");
        if (shippingOption != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.COST);
            this.floatAdapter.toJson(wVar, Float.valueOf(shippingOption.getCost()));
            wVar.mo68529h("cost_in_usd");
            this.floatAdapter.toJson(wVar, Float.valueOf(shippingOption.getCostInUsd()));
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, shippingOption.getCurrencyCode());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, shippingOption.getName());
            wVar.mo68529h(ResponseConstants.OPTION_ID);
            this.nullableStringAdapter.toJson(wVar, shippingOption.getOptionId());
            wVar.mo68529h(ResponseConstants.OPTION_TYPE);
            this.nullableIntAdapter.toJson(wVar, shippingOption.getOptionType());
            wVar.mo68529h("origin_country_id");
            this.nullableIntAdapter.toJson(wVar, shippingOption.getOriginCountryId());
            wVar.mo68529h("origin_postal_code");
            this.nullableStringAdapter.toJson(wVar, shippingOption.getOriginPostalCode());
            wVar.mo68529h("shipping_profile_type");
            this.nullableIntAdapter.toJson(wVar, shippingOption.getShippingProfileType());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
