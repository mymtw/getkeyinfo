package p241t2;

import android.util.SparseArray;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import okhttp3.internal.connection.C19978i;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p737cr.C18985d;

/* renamed from: t2.h */
public final class C7949h {

    /* renamed from: a */
    public Object f17418a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7949h(int i) {
        this(TimeUnit.MINUTES);
        if (i != 3) {
            this.f17418a = new SparseArray();
        }
    }

    public /* synthetic */ C7949h(TimeUnit timeUnit) {
        C19383o.m32797g(timeUnit, "timeUnit");
        this.f17418a = new C19978i(C18985d.f42320h, timeUnit);
    }

    public /* synthetic */ C7949h(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f17418a = webkitToCompatConverterBoundaryInterface;
    }
}
