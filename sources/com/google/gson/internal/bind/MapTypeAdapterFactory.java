package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16798l;
import com.google.gson.C16800n;
import com.google.gson.C16801o;
import com.google.gson.C16802p;
import com.google.gson.C16803q;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C16727b;
import com.google.gson.internal.C16789f;
import com.google.gson.internal.C16790g;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import p675sn.C18541a;

public final class MapTypeAdapterFactory implements C16808u {

    /* renamed from: b */
    public final C16727b f37003b;

    /* renamed from: c */
    public final boolean f37004c = false;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    public final class C16733a<K, V> extends C16807t<Map<K, V>> {

        /* renamed from: a */
        public final C16785d f37005a;

        /* renamed from: b */
        public final C16785d f37006b;

        /* renamed from: c */
        public final C16790g<? extends Map<K, V>> f37007c;

        public C16733a(C16708i iVar, Type type, C16807t<K> tVar, Type type2, C16807t<V> tVar2, C16790g<? extends Map<K, V>> gVar) {
            this.f37005a = new C16785d(iVar, tVar, type);
            this.f37006b = new C16785d(iVar, tVar2, type2);
            this.f37007c = gVar;
        }

        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.f37007c.mo1134i();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object a = this.f37005a.mo59449a(jsonReader);
                    if (map.put(a, this.f37006b.mo59449a(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C16789f.INSTANCE.promoteNameToValue(jsonReader);
                    Object a2 = this.f37005a.mo59449a(jsonReader);
                    if (map.put(a2, this.f37006b.mo59449a(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + a2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!MapTypeAdapterFactory.this.f37004c) {
                jsonWriter.beginObject();
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f37006b.mo59450b(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    C16785d dVar = this.f37005a;
                    Object key = entry2.getKey();
                    dVar.getClass();
                    try {
                        C16782b bVar = new C16782b();
                        dVar.mo59450b(bVar, key);
                        if (bVar.f37092b.isEmpty()) {
                            C16800n nVar = bVar.f37094d;
                            arrayList.add(nVar);
                            arrayList2.add(entry2.getValue());
                            nVar.getClass();
                            z |= (nVar instanceof C16798l) || (nVar instanceof C16802p);
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + bVar.f37092b);
                        }
                    } catch (IOException e) {
                        throw new JsonIOException((Throwable) e);
                    }
                }
                if (z) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        TypeAdapters.f37037A.mo59450b(jsonWriter, (C16800n) arrayList.get(i));
                        this.f37006b.mo59450b(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    C16800n nVar2 = (C16800n) arrayList.get(i);
                    nVar2.getClass();
                    if (nVar2 instanceof C16803q) {
                        C16803q c = nVar2.mo59636c();
                        Serializable serializable = c.f37124b;
                        if (serializable instanceof Number) {
                            str = String.valueOf(c.mo59645l());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(c.mo59643g());
                        } else if (serializable instanceof String) {
                            str = c.mo59630e();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (nVar2 instanceof C16801o) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    jsonWriter.name(str);
                    this.f37006b.mo59450b(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
            }
        }
    }

    public MapTypeAdapterFactory(C16727b bVar) {
        this.f37003b = bVar;
    }

    /* renamed from: a */
    public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Class<?> f = C$Gson$Types.m27701f(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type g = C$Gson$Types.m27702g(type, f, Map.class);
            typeArr = g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        return new C16733a(iVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f37042c : iVar.mo59460g(C18541a.get(type2)), typeArr[1], iVar.mo59460g(C18541a.get(typeArr[1])), this.f37003b.mo59573a(aVar));
    }
}
