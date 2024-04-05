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

public final class RangeSelectJsonAdapter extends JsonAdapter<RangeSelect> {
    public static final int $stable = 8;
    private volatile Constructor<RangeSelect> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ENABLED, ResponseConstants.LABEL, ResponseConstants.MAX, ResponseConstants.MIN, ResponseConstants.SELECTED, ResponseConstants.STEP);

    public RangeSelectJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, ResponseConstants.ENABLED);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.LABEL);
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, ResponseConstants.MAX);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.SELECTED);
    }

    public String toString() {
        return "GeneratedJsonAdapter(RangeSelect)";
    }

    public RangeSelect fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        Integer num2 = num;
        int i = -1;
        Boolean bool = null;
        String str = null;
        Integer num3 = null;
        Integer num4 = num2;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.MAX, ResponseConstants.MAX, jsonReader2);
                    }
                case 3:
                    num4 = this.intAdapter.fromJson(jsonReader2);
                    if (num4 != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.MIN, ResponseConstants.MIN, jsonReader2);
                    }
                case 4:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    num2 = this.intAdapter.fromJson(jsonReader2);
                    if (num2 != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.STEP, ResponseConstants.STEP, jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -45) {
            return new RangeSelect(bool, str, num.intValue(), num4.intValue(), num3, num2.intValue());
        }
        Constructor<RangeSelect> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = RangeSelect.class.getDeclaredConstructor(new Class[]{Boolean.class, String.class, cls, cls, Integer.class, cls, cls, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "RangeSelect::class.java.…his.constructorRef = it }");
        }
        RangeSelect newInstance = constructor.newInstance(new Object[]{bool, str, num, num4, num3, num2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, RangeSelect rangeSelect) {
        C19383o.m32797g(wVar, "writer");
        if (rangeSelect != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.nullableBooleanAdapter.toJson(wVar, rangeSelect.getEnabled());
            wVar.mo68529h(ResponseConstants.LABEL);
            this.nullableStringAdapter.toJson(wVar, rangeSelect.getLabel());
            wVar.mo68529h(ResponseConstants.MAX);
            this.intAdapter.toJson(wVar, Integer.valueOf(rangeSelect.getMax()));
            wVar.mo68529h(ResponseConstants.MIN);
            this.intAdapter.toJson(wVar, Integer.valueOf(rangeSelect.getMin()));
            wVar.mo68529h(ResponseConstants.SELECTED);
            this.nullableIntAdapter.toJson(wVar, rangeSelect.getSelected());
            wVar.mo68529h(ResponseConstants.STEP);
            this.intAdapter.toJson(wVar, Integer.valueOf(rangeSelect.getStep()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
