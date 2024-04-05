package com.fasterxml.jackson.databind.deser.impl;

import android.support.p013v4.media.C0069a;
import com.appboy.Constants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class JavaUtilCollectionsDeserializers {
    private static final Class<?> CLASS_AS_ARRAYS_LIST = Arrays.asList(new Object[]{null, null}).getClass();
    private static final Class<?> CLASS_SINGLETON_LIST;
    private static final Class<?> CLASS_SINGLETON_MAP;
    private static final Class<?> CLASS_SINGLETON_SET;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST_ALIAS = Collections.unmodifiableList(new LinkedList()).getClass();
    private static final Class<?> CLASS_UNMODIFIABLE_MAP;
    private static final Class<?> CLASS_UNMODIFIABLE_SET;
    public static final int TYPE_AS_LIST = 7;
    private static final int TYPE_SINGLETON_LIST = 2;
    private static final int TYPE_SINGLETON_MAP = 3;
    private static final int TYPE_SINGLETON_SET = 1;
    private static final int TYPE_UNMODIFIABLE_LIST = 5;
    private static final int TYPE_UNMODIFIABLE_MAP = 6;
    private static final int TYPE_UNMODIFIABLE_SET = 4;

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$a */
    public static class C12524a implements Converter<Object, Object> {

        /* renamed from: a */
        public final JavaType f27668a;

        /* renamed from: b */
        public final int f27669b;

        public C12524a(int i, JavaType javaType) {
            this.f27668a = javaType;
            this.f27669b = i;
        }

        /* renamed from: a */
        public static void m20267a(int i) {
            if (i != 1) {
                throw new IllegalArgumentException(C0069a.m175f("Can not deserialize Singleton container from ", i, " entries"));
            }
        }

        public final Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f27669b) {
                case 1:
                    Set set = (Set) obj;
                    m20267a(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    m20267a(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    m20267a(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        public final JavaType getInputType(TypeFactory typeFactory) {
            return this.f27668a;
        }

        public final JavaType getOutputType(TypeFactory typeFactory) {
            return this.f27668a;
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set singleton = Collections.singleton(bool);
        CLASS_SINGLETON_SET = singleton.getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(bool);
        CLASS_SINGLETON_LIST = singletonList.getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(singletonList).getClass();
        Map singletonMap = Collections.singletonMap(Constants.APPBOY_PUSH_CONTENT_KEY, "b");
        CLASS_SINGLETON_MAP = singletonMap.getClass();
        CLASS_UNMODIFIABLE_MAP = Collections.unmodifiableMap(singletonMap).getClass();
    }

    public static C12524a converter(int i, JavaType javaType, Class<?> cls) {
        return new C12524a(i, javaType.findSuperType(cls));
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        C12524a aVar;
        if (javaType.hasRawClass(CLASS_AS_ARRAYS_LIST)) {
            aVar = converter(7, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_LIST)) {
            aVar = converter(2, javaType, List.class);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_SET)) {
            aVar = converter(1, javaType, Set.class);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST) || javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST_ALIAS)) {
            aVar = converter(5, javaType, List.class);
        } else if (!javaType.hasRawClass(CLASS_UNMODIFIABLE_SET)) {
            return null;
        } else {
            aVar = converter(4, javaType, Set.class);
        }
        return new StdDelegatingDeserializer(aVar);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        C12524a aVar;
        if (javaType.hasRawClass(CLASS_SINGLETON_MAP)) {
            aVar = converter(3, javaType, Map.class);
        } else if (!javaType.hasRawClass(CLASS_UNMODIFIABLE_MAP)) {
            return null;
        } else {
            aVar = converter(6, javaType, Map.class);
        }
        return new StdDelegatingDeserializer(aVar);
    }
}
