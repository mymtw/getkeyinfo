package p279x;

import android.view.ViewStructure;
import kotlin.jvm.internal.C19383o;

/* renamed from: x.c */
public final class C8279c {

    /* renamed from: a */
    public static final C8279c f18146a = new C8279c();

    /* renamed from: a */
    public final int mo20874a(ViewStructure viewStructure, int i) {
        C19383o.m32797g(viewStructure, "structure");
        return viewStructure.addChildCount(i);
    }

    /* renamed from: b */
    public final ViewStructure mo20875b(ViewStructure viewStructure, int i) {
        C19383o.m32797g(viewStructure, "structure");
        return viewStructure.newChild(i);
    }

    /* renamed from: c */
    public final void mo20876c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        C19383o.m32797g(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public final void mo20877d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        C19383o.m32797g(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
