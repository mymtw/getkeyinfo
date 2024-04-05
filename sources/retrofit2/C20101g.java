package retrofit2;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.C20102h;

/* renamed from: retrofit2.g */
public final class C20101g implements C20090c<Object, C20089b<?>> {

    /* renamed from: a */
    public final /* synthetic */ Type f44481a;

    /* renamed from: b */
    public final /* synthetic */ Executor f44482b;

    public C20101g(Type type, Executor executor) {
        this.f44481a = type;
        this.f44482b = executor;
    }

    /* renamed from: a */
    public final Type mo74330a() {
        return this.f44481a;
    }

    /* renamed from: b */
    public final Object mo74331b(C20113n nVar) {
        Executor executor = this.f44482b;
        return executor == null ? nVar : new C20102h.C20103a(executor, nVar);
    }
}
