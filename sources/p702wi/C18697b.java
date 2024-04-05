package p702wi;

import java.util.Collections;
import java.util.List;
import p513bj.C14075p;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: wi.b */
public final class C18697b implements C18300d {

    /* renamed from: c */
    public static final C18697b f41450c = new C18697b();

    /* renamed from: b */
    public final List<C18296a> f41451b;

    public C18697b(C18296a aVar) {
        this.f41451b = Collections.singletonList(aVar);
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: c */
    public final List<C18296a> mo69842c(long j) {
        return j >= 0 ? this.f41451b : Collections.emptyList();
    }

    /* renamed from: e */
    public final long mo69843e(int i) {
        C14075p.m21691c(i == 0);
        return 0;
    }

    /* renamed from: f */
    public final int mo69844f() {
        return 1;
    }

    public C18697b() {
        this.f41451b = Collections.emptyList();
    }
}
