package p769rr;

import com.squareup.moshi.C17404p;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C19928a0;
import retrofit2.C20099f;
import retrofit2.C20146w;

/* renamed from: rr.a */
public final class C20164a extends C20099f.C20100a {

    /* renamed from: a */
    public final C17414y f44655a;

    /* renamed from: b */
    public final boolean f44656b = false;

    /* renamed from: c */
    public final boolean f44657c = false;

    /* renamed from: d */
    public final boolean f44658d = false;

    public C20164a(C17414y yVar) {
        this.f44655a = yVar;
    }

    /* renamed from: c */
    public static Set<? extends Annotation> m34470c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C17404p.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    /* renamed from: a */
    public final C20099f mo74337a(Type type, Annotation[] annotationArr) {
        JsonAdapter<T> c = this.f44655a.mo68558c(type, m34470c(annotationArr), (String) null);
        if (this.f44656b) {
            c = c.lenient();
        }
        if (this.f44657c) {
            c = c.failOnUnknown();
        }
        if (this.f44658d) {
            c = c.serializeNulls();
        }
        return new C20165b(c);
    }

    /* renamed from: b */
    public final C20099f<C19928a0, ?> mo74338b(Type type, Annotation[] annotationArr, C20146w wVar) {
        JsonAdapter<T> c = this.f44655a.mo68558c(type, m34470c(annotationArr), (String) null);
        if (this.f44656b) {
            c = c.lenient();
        }
        if (this.f44657c) {
            c = c.failOnUnknown();
        }
        if (this.f44658d) {
            c = c.serializeNulls();
        }
        return new C20166c(c);
    }
}
