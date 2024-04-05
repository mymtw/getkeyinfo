package p241t2;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p231s2.C7805c;
import p241t2.C7943d;
import p760nr.C19921a;

/* renamed from: t2.c */
public final class C7942c extends C7805c {

    /* renamed from: a */
    public WebResourceError f17412a;

    /* renamed from: b */
    public WebResourceErrorBoundaryInterface f17413b;

    public C7942c(InvocationHandler invocationHandler) {
        this.f17413b = (WebResourceErrorBoundaryInterface) C19921a.m34065a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: a */
    public final WebResourceErrorBoundaryInterface mo20480a() {
        if (this.f17413b == null) {
            C7949h hVar = C7943d.C7944a.f17414a;
            this.f17413b = (WebResourceErrorBoundaryInterface) C19921a.m34065a(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) hVar.f17418a).convertWebResourceError((Object) this.f17412a));
        }
        return this.f17413b;
    }

    public C7942c(WebResourceError webResourceError) {
        this.f17412a = webResourceError;
    }
}
