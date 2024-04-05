package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17404p;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EmptyArrayToMapAdapter extends JsonAdapter<Object> {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final EmptyArrayToMapAdapterFactory INSTANCE = new EmptyArrayToMapAdapterFactory();
    private final JsonAdapter<Map<Object, Object>> delegateAdapter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmptyArrayToMapAdapterFactory getINSTANCE() {
            return EmptyArrayToMapAdapter.INSTANCE;
        }
    }

    public static final class EmptyArrayToMapAdapterFactory implements JsonAdapter.C17360e {
        public static final int $stable = 0;

        public JsonAdapter<Object> create(Type type, Set<? extends Annotation> set, C17414y yVar) {
            Set set2;
            C19383o.m32797g(type, "type");
            C19383o.m32797g(set, ResponseConstants.ANNOTATIONS);
            C19383o.m32797g(yVar, "moshi");
            Class<EmptyArrayToMap> cls = EmptyArrayToMap.class;
            if (cls.isAnnotationPresent(C17404p.class)) {
                if (!set.isEmpty()) {
                    Iterator<? extends Annotation> it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (cls.equals(annotation.annotationType())) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                            linkedHashSet.remove(annotation);
                            set2 = Collections.unmodifiableSet(linkedHashSet);
                            break;
                        }
                    }
                }
                set2 = null;
                if (set2 == null) {
                    return null;
                }
                if (C19383o.m32792b(C17387a0.m29125c(type), Map.class)) {
                    return new EmptyArrayToMapAdapter(yVar.mo68558c(type, set2, (String) null));
                }
                throw new IllegalArgumentException(C0073e.m207g("Only maps may be annotated with @EmptyArrayToMap. Found: ", type));
            }
            throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
        }
    }

    public EmptyArrayToMapAdapter(JsonAdapter<Map<Object, Object>> jsonAdapter) {
        C19383o.m32797g(jsonAdapter, "delegateAdapter");
        this.delegateAdapter = jsonAdapter;
    }

    public Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        if (jsonReader.mo68426u() == JsonReader.Token.BEGIN_OBJECT) {
            return this.delegateAdapter.fromJson(jsonReader);
        }
        jsonReader.mo68411c0();
        return C19294b0.m32559p0();
    }

    public void toJson(C17412w wVar, Object obj) {
        C19383o.m32797g(wVar, "writer");
        throw new UnsupportedOperationException("EmptyArrayToMapAdapter is only used to deserialize objects");
    }
}
