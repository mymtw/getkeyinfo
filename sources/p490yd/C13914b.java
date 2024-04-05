package p490yd;

import android.app.Application;
import android.widget.Toast;
import kotlin.jvm.internal.C19383o;

/* renamed from: yd.b */
public final class C13914b {

    /* renamed from: a */
    public final Application f30574a;

    public C13914b(Application application) {
        C19383o.m32797g(application, "application");
        this.f30574a = application;
    }

    /* renamed from: a */
    public static void m21425a(C13914b bVar, int i) {
        Toast.makeText(bVar.f30574a, i, 0).show();
    }
}
