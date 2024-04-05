package p743fr;

import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p737cr.C18982a;
import p743fr.C19027d;

/* renamed from: fr.h */
public final class C19038h extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19027d.C19032d f42478e;

    /* renamed from: f */
    public final /* synthetic */ boolean f42479f = false;

    /* renamed from: g */
    public final /* synthetic */ C19057t f42480g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19038h(String str, C19027d.C19032d dVar, C19057t tVar) {
        super(str, true);
        this.f42478e = dVar;
        this.f42480g = tVar;
    }

    /* renamed from: a */
    public final long mo70418a() {
        int i;
        Object obj;
        C19027d.C19032d dVar = this.f42478e;
        boolean z = this.f42479f;
        T t = this.f42480g;
        dVar.getClass();
        C19383o.m32797g(t, "settings");
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        synchronized (C19027d.this.f42449z) {
            synchronized (C19027d.this) {
                try {
                    C19057t tVar = C19027d.this.f42443t;
                    if (!z) {
                        T tVar2 = new C19057t();
                        C19383o.m32797g(tVar, "other");
                        int i2 = 0;
                        while (true) {
                            boolean z2 = true;
                            if (i2 >= 10) {
                                break;
                            }
                            if (((1 << i2) & tVar.f42553a) == 0) {
                                z2 = false;
                            }
                            if (z2) {
                                tVar2.mo70536b(i2, tVar.f42554b[i2]);
                            }
                            i2++;
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & t.f42553a) != 0) {
                                tVar2.mo70536b(i3, t.f42554b[i3]);
                            }
                        }
                        C19394m mVar = C19394m.f43287a;
                        t = tVar2;
                    }
                    ref$ObjectRef2.element = t;
                    long a = ((long) t.mo70535a()) - ((long) tVar.mo70535a());
                    ref$LongRef.element = a;
                    if (a != 0) {
                        if (!C19027d.this.f42427d.isEmpty()) {
                            Object[] array = C19027d.this.f42427d.values().toArray(new C19049p[0]);
                            if (array != null) {
                                obj = (C19049p[]) array;
                                ref$ObjectRef.element = obj;
                                C19027d dVar2 = C19027d.this;
                                C19057t tVar3 = (C19057t) ref$ObjectRef2.element;
                                dVar2.getClass();
                                C19383o.m32797g(tVar3, "<set-?>");
                                dVar2.f42443t = tVar3;
                                C19027d.this.f42435l.mo70422c(new C19035e(C19027d.this.f42428e + " onSettings", dVar, ref$ObjectRef2), 0);
                                C19394m mVar2 = C19394m.f43287a;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    obj = null;
                    ref$ObjectRef.element = obj;
                    C19027d dVar22 = C19027d.this;
                    C19057t tVar32 = (C19057t) ref$ObjectRef2.element;
                    dVar22.getClass();
                    C19383o.m32797g(tVar32, "<set-?>");
                    dVar22.f42443t = tVar32;
                    C19027d.this.f42435l.mo70422c(new C19035e(C19027d.this.f42428e + " onSettings", dVar, ref$ObjectRef2), 0);
                    C19394m mVar22 = C19394m.f43287a;
                } finally {
                }
            }
            try {
                C19027d.this.f42449z.mo70526a((C19057t) ref$ObjectRef2.element);
            } catch (IOException e) {
                C19027d.this.mo70484b(e);
            }
            C19394m mVar3 = C19394m.f43287a;
        }
        C19049p[] pVarArr = (C19049p[]) ref$ObjectRef.element;
        if (pVarArr == null) {
            return -1;
        }
        for (C19049p pVar : pVarArr) {
            synchronized (pVar) {
                long j = ref$LongRef.element;
                pVar.f42517d += j;
                if (j > 0) {
                    pVar.notifyAll();
                }
                C19394m mVar4 = C19394m.f43287a;
            }
        }
        return -1;
    }
}
