package androidx.databinding;

import java.util.ArrayList;

/* renamed from: androidx.databinding.c */
public class C2442c<C, T, A> implements Cloneable {

    /* renamed from: b */
    public ArrayList f5706b = new ArrayList();

    /* renamed from: c */
    public long f5707c = 0;

    /* renamed from: d */
    public long[] f5708d;

    /* renamed from: e */
    public int f5709e;

    /* renamed from: f */
    public final C2443a<C, T, A> f5710f;

    /* renamed from: androidx.databinding.c$a */
    public static abstract class C2443a<C, T, A> {
        /* renamed from: a */
        public abstract void mo9261a(Object obj, int i, Object obj2, Object obj3);
    }

    public C2442c(C2443a<C, T, A> aVar) {
        this.f5710f = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo9282a(C c) {
        if (c != null) {
            int lastIndexOf = this.f5706b.lastIndexOf(c);
            if (lastIndexOf < 0 || mo9283b(lastIndexOf)) {
                this.f5706b.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: b */
    public final boolean mo9283b(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f5707c) != 0;
        }
        long[] jArr = this.f5708d;
        if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i2]) != 0;
    }

    /* renamed from: c */
    public synchronized void mo9284c(int i, Object obj, Object obj2) {
        this.f5709e++;
        int size = this.f5706b.size();
        long[] jArr = this.f5708d;
        int length = jArr == null ? -1 : jArr.length - 1;
        mo9287f(i, obj, obj2, length);
        mo9286d(obj, i, obj2, (length + 2) * 64, size, 0);
        int i2 = this.f5709e - 1;
        this.f5709e = i2;
        if (i2 == 0) {
            long[] jArr2 = this.f5708d;
            long j = Long.MIN_VALUE;
            if (jArr2 != null) {
                for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                    long j2 = this.f5708d[length2];
                    if (j2 != 0) {
                        int i3 = (length2 + 1) * 64;
                        long j3 = Long.MIN_VALUE;
                        for (int i4 = (i3 + 64) - 1; i4 >= i3; i4--) {
                            if ((j2 & j3) != 0) {
                                this.f5706b.remove(i4);
                            }
                            j3 >>>= 1;
                        }
                        this.f5708d[length2] = 0;
                    }
                }
            }
            long j4 = this.f5707c;
            if (j4 != 0) {
                for (int i5 = 63; i5 >= 0; i5--) {
                    if ((j4 & j) != 0) {
                        this.f5706b.remove(i5);
                    }
                    j >>>= 1;
                }
                this.f5707c = 0;
            }
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        C2442c cVar;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                cVar = (C2442c) super.clone();
                try {
                    cVar.f5707c = 0;
                    cVar.f5708d = null;
                    cVar.f5709e = 0;
                    cVar.f5706b = new ArrayList();
                    int size = this.f5706b.size();
                    for (int i = 0; i < size; i++) {
                        if (!mo9283b(i)) {
                            cVar.f5706b.add(this.f5706b.get(i));
                        }
                    }
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (CloneNotSupportedException e3) {
                CloneNotSupportedException cloneNotSupportedException = e3;
                cVar = null;
                e = cloneNotSupportedException;
                e.printStackTrace();
                return cVar;
            }
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo9286d(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f5710f.mo9261a(this.f5706b.get(i2), i, t, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo9287f(int i, Object obj, Object obj2, int i2) {
        if (i2 < 0) {
            mo9286d(obj, i, obj2, 0, Math.min(64, this.f5706b.size()), this.f5707c);
            return;
        }
        long j = this.f5708d[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f5706b.size(), i3 + 64);
        mo9287f(i, obj, obj2, i2 - 1);
        mo9286d(obj, i, obj2, i3, min, j);
    }

    /* renamed from: h */
    public final synchronized void mo9288h(C c) {
        if (this.f5709e == 0) {
            this.f5706b.remove(c);
        } else {
            int lastIndexOf = this.f5706b.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                mo9289i(lastIndexOf);
            }
        }
    }

    /* renamed from: i */
    public final void mo9289i(int i) {
        if (i < 64) {
            this.f5707c = (1 << i) | this.f5707c;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f5708d;
        if (jArr == null) {
            this.f5708d = new long[(this.f5706b.size() / 64)];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[(this.f5706b.size() / 64)];
            long[] jArr3 = this.f5708d;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f5708d = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f5708d;
        jArr4[i2] = j | jArr4[i2];
    }
}
