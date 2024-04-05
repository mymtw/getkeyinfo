package p152j6;

import p209p6.C7676c;
import p209p6.C7686e;
import p244t5.C7964b0;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p267v7.C8212a;

/* renamed from: j6.h */
public final class C7150h extends C8005o1 {

    /* renamed from: b */
    public final C7964b0 f15878b;

    /* renamed from: c */
    public C7676c f15879c;

    /* renamed from: d */
    public C7686e f15880d;

    public C7150h(C7676c cVar, C8008p1 p1Var) {
        this(cVar, p1Var.mo20541v());
    }

    public C7150h(C7676c cVar, byte[] bArr) {
        this.f15879c = cVar;
        this.f15878b = new C7964b0(C8212a.m16504k(bArr));
    }

    public C7150h(C7686e eVar, boolean z) {
        this.f15880d = eVar.mo20140s();
        this.f15878b = new C7964b0(eVar.mo20127g(z));
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        return this.f15878b;
    }
}
