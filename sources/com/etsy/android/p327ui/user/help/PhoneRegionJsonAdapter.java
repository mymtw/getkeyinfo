package com.etsy.android.p327ui.user.help;

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

/* renamed from: com.etsy.android.ui.user.help.PhoneRegionJsonAdapter */
public final class PhoneRegionJsonAdapter extends JsonAdapter<PhoneRegion> {
    public static final int $stable = 8;
    private volatile Constructor<PhoneRegion> constructorRef;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", "phoneNumber", "regionCodes");

    public PhoneRegionJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "name");
        this.nullableListOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "regionCodes");
    }

    public final Object fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new PhoneRegion(str, str2, list);
        }
        Constructor<PhoneRegion> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PhoneRegion.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PhoneRegion::class.java.…his.constructorRef = it }");
        }
        PhoneRegion newInstance = constructor.newInstance(new Object[]{str, str2, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        PhoneRegion phoneRegion = (PhoneRegion) obj;
        C19383o.m32797g(wVar, "writer");
        if (phoneRegion != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, phoneRegion.f25424a);
            wVar.mo68529h("phoneNumber");
            this.nullableStringAdapter.toJson(wVar, phoneRegion.f25425b);
            wVar.mo68529h("regionCodes");
            this.nullableListOfStringAdapter.toJson(wVar, phoneRegion.f25426c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PhoneRegion)";
    }
}
