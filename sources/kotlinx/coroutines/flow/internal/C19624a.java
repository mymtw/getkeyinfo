package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.internal.C19625b;

/* renamed from: kotlinx.coroutines.flow.internal.a */
public abstract class C19624a<S extends C19625b<?>> {

    /* renamed from: b */
    public S[] f43587b;

    /* renamed from: c */
    public int f43588c;

    /* renamed from: d */
    public int f43589d;

    /* renamed from: e */
    public C19641q f43590e;

    /* renamed from: c */
    public final S mo72369c() {
        S s;
        C19641q qVar;
        synchronized (this) {
            S[] sArr = this.f43587b;
            if (sArr == null) {
                sArr = mo72335g();
                this.f43587b = sArr;
            } else if (this.f43588c >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C19383o.m32796f(copyOf, "copyOf(this, newSize)");
                this.f43587b = (C19625b[]) copyOf;
                sArr = (C19625b[]) copyOf;
            }
            int i = this.f43589d;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo72334f();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.mo72372a(this));
            this.f43589d = i;
            this.f43588c++;
            qVar = this.f43590e;
        }
        if (qVar != null) {
            synchronized (qVar) {
                Object[] objArr = qVar.f43615i;
                C19383o.m32794d(objArr);
                qVar.mo72331a(Integer.valueOf(((Number) objArr[((int) ((qVar.f43616j + ((long) ((int) ((qVar.mo72381o() + ((long) qVar.f43618l)) - qVar.f43616j)))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return s;
    }

    /* renamed from: d */
    public final C19641q mo72370d() {
        C19641q qVar;
        synchronized (this) {
            qVar = this.f43590e;
            if (qVar == null) {
                qVar = new C19641q(this.f43588c);
                this.f43590e = qVar;
            }
        }
        return qVar;
    }

    /* renamed from: f */
    public abstract S mo72334f();

    /* renamed from: g */
    public abstract C19625b[] mo72335g();

    /* renamed from: h */
    public final void mo72371h(S s) {
        C19641q qVar;
        int i;
        C19340c[] b;
        synchronized (this) {
            int i2 = this.f43588c - 1;
            this.f43588c = i2;
            qVar = this.f43590e;
            i = 0;
            if (i2 == 0) {
                this.f43589d = 0;
            }
            b = s.mo72373b(this);
        }
        int length = b.length;
        while (i < length) {
            C19340c cVar = b[i];
            i++;
            if (cVar != null) {
                cVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
        }
        if (qVar != null) {
            synchronized (qVar) {
                Object[] objArr = qVar.f43615i;
                C19383o.m32794d(objArr);
                qVar.mo72331a(Integer.valueOf(((Number) objArr[((int) ((qVar.f43616j + ((long) ((int) ((qVar.mo72381o() + ((long) qVar.f43618l)) - qVar.f43616j)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }
}
