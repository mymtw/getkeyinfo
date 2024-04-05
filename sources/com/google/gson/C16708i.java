package com.google.gson;

import com.google.gson.internal.C16727b;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p628nj.C18263b;
import p675sn.C18541a;

/* renamed from: com.google.gson.i */
public final class C16708i {

    /* renamed from: n */
    public static final C18541a<?> f36924n = C18541a.get(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C18541a<?>, C16709a<?>>> f36925a;

    /* renamed from: b */
    public final ConcurrentHashMap f36926b;

    /* renamed from: c */
    public final C16727b f36927c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f36928d;

    /* renamed from: e */
    public final List<C16808u> f36929e;

    /* renamed from: f */
    public final Map<Type, C16797k<?>> f36930f;

    /* renamed from: g */
    public final boolean f36931g;

    /* renamed from: h */
    public final boolean f36932h;

    /* renamed from: i */
    public final boolean f36933i;

    /* renamed from: j */
    public final boolean f36934j;

    /* renamed from: k */
    public final boolean f36935k;

    /* renamed from: l */
    public final List<C16808u> f36936l;

    /* renamed from: m */
    public final List<C16808u> f36937m;

    /* renamed from: com.google.gson.i$a */
    public static class C16709a<T> extends C16807t<T> {

        /* renamed from: a */
        public C16807t<T> f36938a;

        /* renamed from: a */
        public final T mo59449a(JsonReader jsonReader) throws IOException {
            C16807t<T> tVar = this.f36938a;
            if (tVar != null) {
                return tVar.mo59449a(jsonReader);
            }
            throw new IllegalStateException();
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, T t) throws IOException {
            C16807t<T> tVar = this.f36938a;
            if (tVar != null) {
                tVar.mo59450b(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C16708i() {
        this(Excluder.f36940g, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), true, LongSerializationPolicy.DEFAULT, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    public static void m27682a(JsonReader jsonReader, Object obj) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    public static void m27683b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: c */
    public final <T> T mo59456c(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            T a = mo59460g(C18541a.get(type)).mo59449a(jsonReader);
            jsonReader.setLenient(isLenient);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: d */
    public final Object mo59457d(StringReader stringReader, Class cls) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReader = new JsonReader(stringReader);
        jsonReader.setLenient(this.f36935k);
        Object c = mo59456c(jsonReader, cls);
        m27682a(jsonReader, c);
        return C18263b.m30873v0(cls).cast(c);
    }

    /* renamed from: e */
    public final Object mo59458e(Class cls, String str) throws JsonSyntaxException {
        return C18263b.m30873v0(cls).cast(mo59459f(str, cls));
    }

    /* renamed from: f */
    public final <T> T mo59459f(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(this.f36935k);
        T c = mo59456c(jsonReader, type);
        m27682a(jsonReader, c);
        return c;
    }

    /* renamed from: g */
    public final <T> C16807t<T> mo59460g(C18541a<T> aVar) {
        C16807t<T> tVar = (C16807t) this.f36926b.get(aVar == null ? f36924n : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map map = this.f36925a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f36925a.set(map);
            z = true;
        }
        C16709a aVar2 = (C16709a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            C16709a aVar3 = new C16709a();
            map.put(aVar, aVar3);
            for (C16808u a : this.f36929e) {
                C16807t<T> a2 = a.mo59482a(this, aVar);
                if (a2 != null) {
                    if (aVar3.f36938a == null) {
                        aVar3.f36938a = a2;
                        this.f36926b.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f36925a.remove();
            }
        }
    }

    /* renamed from: h */
    public final <T> C16807t<T> mo59461h(C16808u uVar, C18541a<T> aVar) {
        if (!this.f36929e.contains(uVar)) {
            uVar = this.f36928d;
        }
        boolean z = false;
        for (C16808u next : this.f36929e) {
            if (z) {
                C16807t<T> a = next.mo59482a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: i */
    public final JsonWriter mo59462i(Writer writer) throws IOException {
        if (this.f36932h) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f36934j) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f36931g);
        return jsonWriter;
    }

    /* renamed from: j */
    public final String mo59463j(Object obj) {
        if (obj == null) {
            C16801o oVar = C16801o.f37122b;
            StringWriter stringWriter = new StringWriter();
            try {
                mo59464k(oVar, mo59462i(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException((Throwable) e);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                mo59465l(obj, cls, mo59462i(stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: k */
    public final void mo59464k(C16801o oVar, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f36933i);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f36931g);
        try {
            TypeAdapters.f37037A.mo59450b(jsonWriter, oVar);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    /* renamed from: l */
    public final void mo59465l(Object obj, Class cls, JsonWriter jsonWriter) throws JsonIOException {
        C16807t<?> g = mo59460g(C18541a.get((Type) cls));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f36933i);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f36931g);
        try {
            g.mo59450b(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f36931g + ",factories:" + this.f36929e + ",instanceCreators:" + this.f36927c + "}";
    }

    public C16708i(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, boolean z, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3) {
        C16807t tVar;
        this.f36925a = new ThreadLocal<>();
        this.f36926b = new ConcurrentHashMap();
        this.f36930f = map;
        C16727b bVar = new C16727b(map);
        this.f36927c = bVar;
        this.f36931g = false;
        this.f36932h = false;
        this.f36933i = z;
        this.f36934j = false;
        this.f36935k = false;
        this.f36936l = list;
        this.f36937m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f37038B);
        arrayList.add(ObjectTypeAdapter.f37009b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f37055p);
        arrayList.add(TypeAdapters.f37046g);
        arrayList.add(TypeAdapters.f37043d);
        arrayList.add(TypeAdapters.f37044e);
        arrayList.add(TypeAdapters.f37045f);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            tVar = TypeAdapters.f37050k;
        } else {
            tVar = new C16705f();
        }
        arrayList.add(TypeAdapters.m27762b(Long.TYPE, Long.class, tVar));
        arrayList.add(TypeAdapters.m27762b(Double.TYPE, Double.class, new C16703d()));
        arrayList.add(TypeAdapters.m27762b(Float.TYPE, Float.class, new C16704e()));
        arrayList.add(TypeAdapters.f37051l);
        arrayList.add(TypeAdapters.f37047h);
        arrayList.add(TypeAdapters.f37048i);
        arrayList.add(TypeAdapters.m27761a(AtomicLong.class, new C16805s(new C16706g(tVar))));
        arrayList.add(TypeAdapters.m27761a(AtomicLongArray.class, new C16805s(new C16707h(tVar))));
        arrayList.add(TypeAdapters.f37049j);
        arrayList.add(TypeAdapters.f37052m);
        arrayList.add(TypeAdapters.f37056q);
        arrayList.add(TypeAdapters.f37057r);
        arrayList.add(TypeAdapters.m27761a(BigDecimal.class, TypeAdapters.f37053n));
        arrayList.add(TypeAdapters.m27761a(BigInteger.class, TypeAdapters.f37054o));
        arrayList.add(TypeAdapters.f37058s);
        arrayList.add(TypeAdapters.f37059t);
        arrayList.add(TypeAdapters.f37061v);
        arrayList.add(TypeAdapters.f37062w);
        arrayList.add(TypeAdapters.f37065z);
        arrayList.add(TypeAdapters.f37060u);
        arrayList.add(TypeAdapters.f37041b);
        arrayList.add(DateTypeAdapter.f37000b);
        arrayList.add(TypeAdapters.f37064y);
        arrayList.add(TimeTypeAdapter.f37024b);
        arrayList.add(SqlDateTypeAdapter.f37022b);
        arrayList.add(TypeAdapters.f37063x);
        arrayList.add(ArrayTypeAdapter.f36994c);
        arrayList.add(TypeAdapters.f37040a);
        arrayList.add(new CollectionTypeAdapterFactory(bVar));
        arrayList.add(new MapTypeAdapterFactory(bVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar);
        this.f36928d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f37039C);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f36929e = Collections.unmodifiableList(arrayList);
    }
}
