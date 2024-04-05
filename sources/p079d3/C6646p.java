package p079d3;

import androidx.work.C3383g;
import androidx.work.C3422l;
import androidx.work.impl.WorkDatabase;
import p023b3.C3473a;
import p034c3.C4393p;
import p090e3.C6712a;

/* renamed from: d3.p */
public final class C6646p implements C3383g {

    /* renamed from: a */
    public final C6712a f14672a;

    /* renamed from: b */
    public final C3473a f14673b;

    /* renamed from: c */
    public final C4393p f14674c;

    static {
        C3422l.m8214e("WMFgUpdater");
    }

    public C6646p(WorkDatabase workDatabase, C3473a aVar, C6712a aVar2) {
        this.f14673b = aVar;
        this.f14672a = aVar2;
        this.f14674c = workDatabase.mo12857t();
    }
}
