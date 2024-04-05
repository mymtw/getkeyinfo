package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.C19394m;
import okhttp3.C19928a0;
import okhttp3.C20016y;
import p771sr.C20200w;
import retrofit2.C20099f;

/* renamed from: retrofit2.a */
public final class C20078a extends C20099f.C20100a {

    /* renamed from: a */
    public boolean f44461a = true;

    /* renamed from: retrofit2.a$a */
    public static final class C20079a implements C20099f<C19928a0, C19928a0> {

        /* renamed from: a */
        public static final C20079a f44462a = new C20079a();

        public final Object convert(Object obj) throws IOException {
            C19928a0 a0Var = (C19928a0) obj;
            try {
                return C20085a0.m34338a(a0Var);
            } finally {
                a0Var.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    public static final class C20080b implements C20099f<C20016y, C20016y> {

        /* renamed from: a */
        public static final C20080b f44463a = new C20080b();

        public final Object convert(Object obj) throws IOException {
            return (C20016y) obj;
        }
    }

    /* renamed from: retrofit2.a$c */
    public static final class C20081c implements C20099f<C19928a0, C19928a0> {

        /* renamed from: a */
        public static final C20081c f44464a = new C20081c();

        public final Object convert(Object obj) throws IOException {
            return (C19928a0) obj;
        }
    }

    /* renamed from: retrofit2.a$d */
    public static final class C20082d implements C20099f<Object, String> {

        /* renamed from: a */
        public static final C20082d f44465a = new C20082d();

        public final Object convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    public static final class C20083e implements C20099f<C19928a0, C19394m> {

        /* renamed from: a */
        public static final C20083e f44466a = new C20083e();

        public final Object convert(Object obj) throws IOException {
            ((C19928a0) obj).close();
            return C19394m.f43287a;
        }
    }

    /* renamed from: retrofit2.a$f */
    public static final class C20084f implements C20099f<C19928a0, Void> {

        /* renamed from: a */
        public static final C20084f f44467a = new C20084f();

        public final Object convert(Object obj) throws IOException {
            ((C19928a0) obj).close();
            return null;
        }
    }

    /* renamed from: a */
    public final C20099f mo74337a(Type type, Annotation[] annotationArr) {
        if (C20016y.class.isAssignableFrom(C20085a0.m34343f(type))) {
            return C20080b.f44463a;
        }
        return null;
    }

    /* renamed from: b */
    public final C20099f<C19928a0, ?> mo74338b(Type type, Annotation[] annotationArr, C20146w wVar) {
        if (type == C19928a0.class) {
            return C20085a0.m34346i(annotationArr, C20200w.class) ? C20081c.f44464a : C20079a.f44462a;
        }
        if (type == Void.class) {
            return C20084f.f44467a;
        }
        if (!this.f44461a || type != C19394m.class) {
            return null;
        }
        try {
            return C20083e.f44466a;
        } catch (NoClassDefFoundError unused) {
            this.f44461a = false;
            return null;
        }
    }
}
