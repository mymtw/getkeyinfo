package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C16727b;
import com.google.gson.internal.C16790g;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p675sn.C18541a;

public final class CollectionTypeAdapterFactory implements C16808u {

    /* renamed from: b */
    public final C16727b f36997b;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    public static final class C16731a<E> extends C16807t<Collection<E>> {

        /* renamed from: a */
        public final C16785d f36998a;

        /* renamed from: b */
        public final C16790g<? extends Collection<E>> f36999b;

        public C16731a(C16708i iVar, Type type, C16807t<E> tVar, C16790g<? extends Collection<E>> gVar) {
            this.f36998a = new C16785d(iVar, tVar, type);
            this.f36999b = gVar;
        }

        /* renamed from: a */
        public final Object mo59449a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection collection = (Collection) this.f36999b.mo1134i();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f36998a.mo59449a(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        /* renamed from: b */
        public final void mo59450b(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (Object b : collection) {
                this.f36998a.mo59450b(jsonWriter, b);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(C16727b bVar) {
        this.f36997b = bVar;
    }

    /* renamed from: a */
    public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type g = C$Gson$Types.m27702g(type, rawType, Collection.class);
        if (g instanceof WildcardType) {
            g = ((WildcardType) g).getUpperBounds()[0];
        }
        Class cls = g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments()[0] : Object.class;
        return new C16731a(iVar, cls, iVar.mo59460g(C18541a.get(cls)), this.f36997b.mo59573a(aVar));
    }
}
