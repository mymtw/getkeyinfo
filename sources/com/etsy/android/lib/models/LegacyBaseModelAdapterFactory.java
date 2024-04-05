package com.etsy.android.lib.models;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.ClassUtils;

public final class LegacyBaseModelAdapterFactory implements JsonAdapter.C17360e {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LegacyBaseModelAdapterFactory adapterFactory() {
            return new LegacyBaseModelAdapterFactory();
        }
    }

    public JsonAdapter<Object> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
        C19383o.m32797g(type, "type");
        C19383o.m32797g(set, ResponseConstants.ANNOTATIONS);
        C19383o.m32797g(yVar, "moshi");
        Class<?> c = C17387a0.m29125c(type);
        C19383o.m32796f(c, "clazz");
        Class<BaseModel> cls = BaseModel.class;
        List<Class<?>> allSuperclasses = ClassUtils.getAllSuperclasses(c);
        if (allSuperclasses == null) {
            allSuperclasses = EmptyList.INSTANCE;
        }
        if (allSuperclasses.contains(cls)) {
            return new LegacyBaseModelAdapter(type);
        }
        return null;
    }
}
