package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.C19928a0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C20099f;

@IgnoreJRERequirement
/* renamed from: retrofit2.o */
public final class C20118o extends C20099f.C20100a {

    /* renamed from: a */
    public static final C20118o f44516a = new C20118o();

    @IgnoreJRERequirement
    /* renamed from: retrofit2.o$a */
    public static final class C20119a<T> implements C20099f<C19928a0, Optional<T>> {

        /* renamed from: a */
        public final C20099f<C19928a0, T> f44517a;

        public C20119a(C20099f<C19928a0, T> fVar) {
            this.f44517a = fVar;
        }

        public final Object convert(Object obj) throws IOException {
            return Optional.ofNullable(this.f44517a.convert((C19928a0) obj));
        }
    }

    /* renamed from: b */
    public final C20099f<C19928a0, ?> mo74338b(Type type, Annotation[] annotationArr, C20146w wVar) {
        if (C20085a0.m34343f(type) != Optional.class) {
            return null;
        }
        return new C20119a(wVar.mo74390e(C20085a0.m34342e(0, (ParameterizedType) type), annotationArr));
    }
}
