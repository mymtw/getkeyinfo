package retrofit2;

import androidx.room.C3250p;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.C20011u;
import p611lh.C18172i;
import retrofit2.C20090c;

/* renamed from: retrofit2.h */
public final class C20102h extends C20090c.C20091a {

    /* renamed from: a */
    public final Executor f44483a;

    /* renamed from: retrofit2.h$a */
    public static final class C20103a<T> implements C20089b<T> {

        /* renamed from: b */
        public final Executor f44484b;

        /* renamed from: c */
        public final C20089b<T> f44485c;

        /* renamed from: retrofit2.h$a$a */
        public class C20104a implements C20092d<T> {

            /* renamed from: b */
            public final /* synthetic */ C20092d f44486b;

            public C20104a(C20092d dVar) {
                this.f44486b = dVar;
            }

            /* renamed from: j */
            public final void mo1135j(C20089b<T> bVar, Throwable th) {
                C20103a.this.f44484b.execute(new C3250p(this, 2, this.f44486b, th));
            }

            /* renamed from: m */
            public final void mo1137m(C20089b<T> bVar, C20145v<T> vVar) {
                C20103a.this.f44484b.execute(new C18172i(this, 2, this.f44486b, vVar));
            }
        }

        public C20103a(Executor executor, C20089b<T> bVar) {
            this.f44484b = executor;
            this.f44485c = bVar;
        }

        /* renamed from: G */
        public final void mo74362G(C20092d<T> dVar) {
            this.f44485c.mo74362G(new C20104a(dVar));
        }

        public final void cancel() {
            this.f44485c.cancel();
        }

        /* renamed from: e */
        public final C20145v<T> mo74365e() throws IOException {
            return this.f44485c.mo74365e();
        }

        /* renamed from: g */
        public final C20011u mo74366g() {
            return this.f44485c.mo74366g();
        }

        /* renamed from: n */
        public final boolean mo74367n() {
            return this.f44485c.mo74367n();
        }

        public final C20089b<T> clone() {
            return new C20103a(this.f44484b, this.f44485c.clone());
        }
    }

    public C20102h(Executor executor) {
        this.f44483a = executor;
    }

    /* renamed from: a */
    public final C20090c mo74332a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (C20085a0.m34343f(type) != C20089b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = C20085a0.m34342e(0, (ParameterizedType) type);
            if (!C20085a0.m34346i(annotationArr, C20150y.class)) {
                executor = this.f44483a;
            }
            return new C20101g(e, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
