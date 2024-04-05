package com.squareup.moshi.adapters;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p003a2.C0023f;

public final class PolymorphicJsonAdapterFactory<T> implements JsonAdapter.C17360e {

    /* renamed from: a */
    public final Class<T> f37945a;

    /* renamed from: b */
    public final String f37946b;

    /* renamed from: c */
    public final List<String> f37947c;

    /* renamed from: d */
    public final List<Type> f37948d;

    /* renamed from: e */
    public final JsonAdapter<Object> f37949e;

    public static final class PolymorphicJsonAdapter extends JsonAdapter<Object> {
        public final JsonAdapter<Object> fallbackJsonAdapter;
        public final List<JsonAdapter<Object>> jsonAdapters;
        public final String labelKey;
        public final JsonReader.C17362b labelKeyOptions;
        public final JsonReader.C17362b labelOptions;
        public final List<String> labels;
        public final List<Type> subtypes;

        public PolymorphicJsonAdapter(String str, List<String> list, List<Type> list2, List<JsonAdapter<Object>> list3, JsonAdapter<Object> jsonAdapter) {
            this.labelKey = str;
            this.labels = list;
            this.subtypes = list2;
            this.jsonAdapters = list3;
            this.fallbackJsonAdapter = jsonAdapter;
            this.labelKeyOptions = JsonReader.C17362b.m29110a(str);
            this.labelOptions = JsonReader.C17362b.m29110a((String[]) list.toArray(new String[0]));
        }

        /* renamed from: a */
        public final int mo68487a(JsonReader jsonReader) throws IOException {
            jsonReader.mo68410b();
            while (jsonReader.mo68414f()) {
                if (jsonReader.mo68406Q(this.labelKeyOptions) == -1) {
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                } else {
                    int R = jsonReader.mo68407R(this.labelOptions);
                    if (R != -1 || this.fallbackJsonAdapter != null) {
                        return R;
                    }
                    StringBuilder h = C0072d.m201h("Expected one of ");
                    h.append(this.labels);
                    h.append(" for key '");
                    h.append(this.labelKey);
                    h.append("' but found '");
                    h.append(jsonReader.mo68425t());
                    h.append("'. Register a subtype for this label.");
                    throw new JsonDataException(h.toString());
                }
            }
            StringBuilder h2 = C0072d.m201h("Missing label for ");
            h2.append(this.labelKey);
            throw new JsonDataException(h2.toString());
        }

        /* JADX INFO: finally extract failed */
        public final Object fromJson(JsonReader jsonReader) throws IOException {
            JsonReader x = jsonReader.mo68427x();
            x.f37896g = false;
            try {
                int a = mo68487a(x);
                x.close();
                return a == -1 ? this.fallbackJsonAdapter.fromJson(jsonReader) : this.jsonAdapters.get(a).fromJson(jsonReader);
            } catch (Throwable th) {
                x.close();
                throw th;
            }
        }

        public final void toJson(C17412w wVar, Object obj) throws IOException {
            JsonAdapter<Object> jsonAdapter;
            int indexOf = this.subtypes.indexOf(obj.getClass());
            if (indexOf == -1) {
                jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter == null) {
                    StringBuilder h = C0072d.m201h("Expected one of ");
                    h.append(this.subtypes);
                    h.append(" but found ");
                    h.append(obj);
                    h.append(", a ");
                    h.append(obj.getClass());
                    h.append(". Register this subtype.");
                    throw new IllegalArgumentException(h.toString());
                }
            } else {
                jsonAdapter = this.jsonAdapters.get(indexOf);
            }
            wVar.mo68522b();
            if (jsonAdapter != this.fallbackJsonAdapter) {
                wVar.mo68529h(this.labelKey).mo68535x(this.labels.get(indexOf));
            }
            int j = wVar.mo68554j();
            if (j == 5 || j == 3 || j == 2 || j == 1) {
                int i = wVar.f38018j;
                wVar.f38018j = wVar.f38010b;
                jsonAdapter.toJson(wVar, obj);
                wVar.f38018j = i;
                wVar.mo68526f();
                return;
            }
            throw new IllegalStateException("Nesting problem.");
        }

        public final String toString() {
            return C0023f.m110k(C0072d.m201h("PolymorphicJsonAdapter("), this.labelKey, ")");
        }
    }

    public PolymorphicJsonAdapterFactory(Class<T> cls, String str, List<String> list, List<Type> list2, JsonAdapter<Object> jsonAdapter) {
        this.f37945a = cls;
        this.f37946b = str;
        this.f37947c = list;
        this.f37948d = list2;
        this.f37949e = jsonAdapter;
    }

    /* renamed from: a */
    public static <T> PolymorphicJsonAdapterFactory<T> m29127a(Class<T> cls, String str) {
        return new PolymorphicJsonAdapterFactory(cls, str, Collections.emptyList(), Collections.emptyList(), (JsonAdapter<Object>) null);
    }

    /* renamed from: b */
    public final PolymorphicJsonAdapterFactory<T> mo68486b(Class<? extends T> cls, String str) {
        if (str == null) {
            throw new NullPointerException("label == null");
        } else if (!this.f37947c.contains(str)) {
            ArrayList arrayList = new ArrayList(this.f37947c);
            arrayList.add(str);
            ArrayList arrayList2 = new ArrayList(this.f37948d);
            arrayList2.add(cls);
            return new PolymorphicJsonAdapterFactory(this.f37945a, this.f37946b, arrayList, arrayList2, this.f37949e);
        } else {
            throw new IllegalArgumentException("Labels must be unique.");
        }
    }

    public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
        if (C17387a0.m29125c(type) != this.f37945a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f37948d.size());
        int size = this.f37948d.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(yVar.mo68557b(this.f37948d.get(i)));
        }
        return new PolymorphicJsonAdapter(this.f37946b, this.f37947c, this.f37948d, arrayList, this.f37949e).nullSafe();
    }
}
