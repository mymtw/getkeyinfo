package p645pi;

import java.util.Collections;
import java.util.List;
import p513bj.C14075p;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: pi.e */
public final class C18386e implements C18300d {

    /* renamed from: b */
    public final List<C18296a> f40446b;

    public C18386e(List<C18296a> list) {
        this.f40446b = list;
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: c */
    public final List<C18296a> mo69842c(long j) {
        return j >= 0 ? this.f40446b : Collections.emptyList();
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
}
