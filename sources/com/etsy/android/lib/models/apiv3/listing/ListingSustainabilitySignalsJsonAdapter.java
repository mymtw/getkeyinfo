package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.SustainabilitySignals;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingSustainabilitySignalsJsonAdapter extends JsonAdapter<ListingSustainabilitySignals> {
    public static final int $stable = 8;
    private volatile Constructor<ListingSustainabilitySignals> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("is_digital", SustainabilitySignals.IS_HANDMADE, SustainabilitySignals.IS_ORGANIC, SustainabilitySignals.IS_RECYCLED, "is_vintage", "location");

    public ListingSustainabilitySignalsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isDigital");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "location");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingSustainabilitySignals)";
    }

    public ListingSustainabilitySignals fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -64) {
            return new ListingSustainabilitySignals(bool, bool2, bool3, bool4, bool5, str);
        }
        Constructor<ListingSustainabilitySignals> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingSustainabilitySignals.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, String.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingSustainabilitySig…his.constructorRef = it }");
        }
        ListingSustainabilitySignals newInstance = constructor.newInstance(new Object[]{bool, bool2, bool3, bool4, bool5, str, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingSustainabilitySignals listingSustainabilitySignals) {
        C19383o.m32797g(wVar, "writer");
        if (listingSustainabilitySignals != null) {
            wVar.mo68522b();
            wVar.mo68529h("is_digital");
            this.nullableBooleanAdapter.toJson(wVar, listingSustainabilitySignals.isDigital());
            wVar.mo68529h(SustainabilitySignals.IS_HANDMADE);
            this.nullableBooleanAdapter.toJson(wVar, listingSustainabilitySignals.isHandmade());
            wVar.mo68529h(SustainabilitySignals.IS_ORGANIC);
            this.nullableBooleanAdapter.toJson(wVar, listingSustainabilitySignals.isOrganic());
            wVar.mo68529h(SustainabilitySignals.IS_RECYCLED);
            this.nullableBooleanAdapter.toJson(wVar, listingSustainabilitySignals.isRecycled());
            wVar.mo68529h("is_vintage");
            this.nullableBooleanAdapter.toJson(wVar, listingSustainabilitySignals.isVintage());
            wVar.mo68529h("location");
            this.nullableStringAdapter.toJson(wVar, listingSustainabilitySignals.getLocation());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
