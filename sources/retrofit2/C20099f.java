package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C19928a0;

/* renamed from: retrofit2.f */
public interface C20099f<F, T> {

    /* renamed from: retrofit2.f$a */
    public static abstract class C20100a {
        /* renamed from: a */
        public C20099f mo74337a(Type type, Annotation[] annotationArr) {
            return null;
        }

        /* renamed from: b */
        public C20099f<C19928a0, ?> mo74338b(Type type, Annotation[] annotationArr, C20146w wVar) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
