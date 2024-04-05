package com.squareup.moshi;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import p618lp.C18215a;

final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, V>> {
    public static final JsonAdapter.C17360e FACTORY = new C17371a();
    private final JsonAdapter<K> keyAdapter;
    private final JsonAdapter<V> valueAdapter;

    /* renamed from: com.squareup.moshi.MapJsonAdapter$a */
    public class C17371a implements JsonAdapter.C17360e {
        public final JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
            Class<?> c;
            Type[] typeArr;
            if (!set.isEmpty() || (c = C17387a0.m29125c(type)) != Map.class) {
                return null;
            }
            Class<Object> cls = Object.class;
            Class<String> cls2 = String.class;
            if (type == Properties.class) {
                typeArr = new Type[]{cls2, cls2};
            } else {
                Class<Map> cls3 = Map.class;
                if (cls3.isAssignableFrom(c)) {
                    Type i = C18215a.m30730i(type, c, C18215a.m30724c(type, c, cls3), new LinkedHashSet());
                    typeArr = i instanceof ParameterizedType ? ((ParameterizedType) i).getActualTypeArguments() : new Type[]{cls, cls};
                } else {
                    throw new IllegalArgumentException();
                }
            }
            return new MapJsonAdapter(yVar, typeArr[0], typeArr[1]).nullSafe();
        }
    }

    public MapJsonAdapter(C17414y yVar, Type type, Type type2) {
        this.keyAdapter = yVar.mo68557b(type);
        this.valueAdapter = yVar.mo68557b(type2);
    }

    public final Object fromJson(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo68410b();
        while (jsonReader.mo68414f()) {
            jsonReader.mo68403B();
            K fromJson = this.keyAdapter.fromJson(jsonReader);
            V fromJson2 = this.valueAdapter.fromJson(jsonReader);
            Object put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + jsonReader.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        jsonReader.mo68413e();
        return linkedHashTreeMap;
    }

    public final void toJson(C17412w wVar, Object obj) throws IOException {
        wVar.mo68522b();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int j = wVar.mo68554j();
                if (j == 5 || j == 3) {
                    wVar.f38017i = true;
                    this.keyAdapter.toJson(wVar, entry.getKey());
                    this.valueAdapter.toJson(wVar, entry.getValue());
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            } else {
                StringBuilder h = C0072d.m201h("Map key is null at ");
                h.append(wVar.getPath());
                throw new JsonDataException(h.toString());
            }
        }
        wVar.mo68526f();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("JsonAdapter(");
        h.append(this.keyAdapter);
        h.append("=");
        h.append(this.valueAdapter);
        h.append(")");
        return h.toString();
    }
}
