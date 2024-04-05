package p710xi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14075p;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: xi.c */
public final class C18773c implements C18300d {

    /* renamed from: b */
    public final List<C18296a> f41604b;

    public C18773c(ArrayList arrayList) {
        this.f41604b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: c */
    public final List<C18296a> mo69842c(long j) {
        return j >= 0 ? this.f41604b : Collections.emptyList();
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
