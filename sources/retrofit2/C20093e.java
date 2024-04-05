package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C20090c;

@IgnoreJRERequirement
/* renamed from: retrofit2.e */
public final class C20093e extends C20090c.C20091a {

    /* renamed from: a */
    public static final C20093e f44475a = new C20093e();

    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$a */
    public static final class C20094a<R> implements C20090c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f44476a;

        @IgnoreJRERequirement
        /* renamed from: retrofit2.e$a$a */
        public class C20095a implements C20092d<R> {

            /* renamed from: b */
            public final CompletableFuture<R> f44477b;

            public C20095a(C20096b bVar) {
                this.f44477b = bVar;
            }

            /* renamed from: j */
            public final void mo1135j(C20089b<R> bVar, Throwable th) {
                this.f44477b.completeExceptionally(th);
            }

            /* renamed from: m */
            public final void mo1137m(C20089b<R> bVar, C20145v<R> vVar) {
                if (vVar.mo74384a()) {
                    this.f44477b.complete(vVar.f44615b);
                } else {
                    this.f44477b.completeExceptionally(new HttpException(vVar));
                }
            }
        }

        public C20094a(Type type) {
            this.f44476a = type;
        }

        /* renamed from: a */
        public final Type mo74330a() {
            return this.f44476a;
        }

        /* renamed from: b */
        public final Object mo74331b(C20113n nVar) {
            C20096b bVar = new C20096b(nVar);
            nVar.mo74362G(new C20095a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$b */
    public static final class C20096b<T> extends CompletableFuture<T> {

        /* renamed from: b */
        public final C20089b<?> f44478b;

        public C20096b(C20113n nVar) {
            this.f44478b = nVar;
        }

        public final boolean cancel(boolean z) {
            if (z) {
                this.f44478b.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.e$c */
    public static final class C20097c<R> implements C20090c<R, CompletableFuture<C20145v<R>>> {

        /* renamed from: a */
        public final Type f44479a;

        @IgnoreJRERequirement
        /* renamed from: retrofit2.e$c$a */
        public class C20098a implements C20092d<R> {

            /* renamed from: b */
            public final CompletableFuture<C20145v<R>> f44480b;

            public C20098a(C20096b bVar) {
                this.f44480b = bVar;
            }

            /* renamed from: j */
            public final void mo1135j(C20089b<R> bVar, Throwable th) {
                this.f44480b.completeExceptionally(th);
            }

            /* renamed from: m */
            public final void mo1137m(C20089b<R> bVar, C20145v<R> vVar) {
                this.f44480b.complete(vVar);
            }
        }

        public C20097c(Type type) {
            this.f44479a = type;
        }

        /* renamed from: a */
        public final Type mo74330a() {
            return this.f44479a;
        }

        /* renamed from: b */
        public final Object mo74331b(C20113n nVar) {
            C20096b bVar = new C20096b(nVar);
            nVar.mo74362G(new C20098a(bVar));
            return bVar;
        }
    }

    /* renamed from: a */
    public final C20090c mo74332a(Type type, Annotation[] annotationArr) {
        if (C20085a0.m34343f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e = C20085a0.m34342e(0, (ParameterizedType) type);
            if (C20085a0.m34343f(e) != C20145v.class) {
                return new C20094a(e);
            }
            if (e instanceof ParameterizedType) {
                return new C20097c(C20085a0.m34342e(0, (ParameterizedType) e));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
