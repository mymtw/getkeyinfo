package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19432h;
import p628nj.C18263b;
import p755lq.C19875a;

public final class SnapshotIdSet implements Iterable<Integer>, C19875a {

    /* renamed from: f */
    public static final SnapshotIdSet f2982f = new SnapshotIdSet(0, 0, 0, (int[]) null);

    /* renamed from: b */
    public final long f2983b;

    /* renamed from: c */
    public final long f2984c;

    /* renamed from: d */
    public final int f2985d;

    /* renamed from: e */
    public final int[] f2986e;

    public SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.f2983b = j;
        this.f2984c = j2;
        this.f2985d = i;
        this.f2986e = iArr;
    }

    /* renamed from: a */
    public final SnapshotIdSet mo5944a(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        C19383o.m32797g(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f2982f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.f2985d;
        int i2 = this.f2985d;
        if (i == i2 && snapshotIdSet.f2986e == (iArr = this.f2986e)) {
            return new SnapshotIdSet(this.f2983b & (~snapshotIdSet.f2983b), this.f2984c & (~snapshotIdSet.f2984c), i2, iArr);
        }
        Iterator it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.mo5945c(((Number) it.next()).intValue());
        }
        return snapshotIdSet3;
    }

    /* renamed from: c */
    public final SnapshotIdSet mo5945c(int i) {
        int[] iArr;
        int t;
        int i2 = i;
        int i3 = this.f2985d;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j = 1 << i4;
            long j2 = this.f2984c;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.f2983b, j2 & (~j), i3, this.f2986e);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j3 = 1 << (i4 - 64);
            long j4 = this.f2983b;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.f2984c, i3, this.f2986e);
            }
        } else if (i4 < 0 && (iArr = this.f2986e) != null && (t = C18263b.m30868t(i2, iArr)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f2983b, this.f2984c, this.f2985d, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (t > 0) {
                C19318k.m32600R0(0, 0, t, iArr, iArr2);
            }
            if (t < length) {
                C19318k.m32600R0(t, t + 1, length + 1, iArr, iArr2);
            }
            return new SnapshotIdSet(this.f2983b, this.f2984c, this.f2985d, iArr2);
        }
        return this;
    }

    /* renamed from: e */
    public final boolean mo5946e(int i) {
        int[] iArr;
        int i2 = i - this.f2985d;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.f2984c) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.f2983b) != 0;
        }
        if (i2 > 0 || (iArr = this.f2986e) == null) {
            return false;
        }
        if (C18263b.m30868t(i, iArr) < 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: g */
    public final SnapshotIdSet mo5947g(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        C19383o.m32797g(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f2982f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.f2985d;
        int i2 = this.f2985d;
        if (i == i2 && snapshotIdSet.f2986e == (iArr = this.f2986e)) {
            return new SnapshotIdSet(this.f2983b | snapshotIdSet.f2983b, this.f2984c | snapshotIdSet.f2984c, i2, iArr);
        }
        if (this.f2986e == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.mo5949l(((Number) it.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.mo5949l(((Number) it2.next()).intValue());
        }
        return snapshotIdSet3;
    }

    public final Iterator<Integer> iterator() {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this, (C19340c<? super SnapshotIdSet$iterator$1>) null);
        C19432h hVar = new C19432h();
        hVar.f43358e = C19388s.m32843R(snapshotIdSet$iterator$1, hVar, hVar);
        return hVar;
    }

    /* renamed from: l */
    public final SnapshotIdSet mo5949l(int i) {
        int i2;
        int i3 = i;
        int i4 = this.f2985d;
        int i5 = i3 - i4;
        long j = 0;
        if (i5 >= 0 && i5 < 64) {
            long j2 = 1 << i5;
            long j3 = this.f2984c;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.f2983b, j3 | j2, i4, this.f2986e);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j4 = 1 << (i5 - 64);
            long j5 = this.f2983b;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.f2984c, i4, this.f2986e);
            }
        } else if (i5 < 128) {
            int[] iArr = this.f2986e;
            if (iArr == null) {
                return new SnapshotIdSet(this.f2983b, this.f2984c, i4, new int[]{i3});
            }
            int t = C18263b.m30868t(i3, iArr);
            if (t < 0) {
                int i6 = -(t + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                C19318k.m32600R0(0, 0, i6, iArr, iArr2);
                C19318k.m32600R0(i6 + 1, i6, length - 1, iArr, iArr2);
                iArr2[i6] = i3;
                return new SnapshotIdSet(this.f2983b, this.f2984c, this.f2985d, iArr2);
            }
        } else if (!mo5946e(i)) {
            long j6 = this.f2983b;
            long j7 = this.f2984c;
            int i7 = this.f2985d;
            ArrayList arrayList = null;
            int i8 = ((i3 + 1) / 64) * 64;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i7 >= i8) {
                    i2 = i7;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f2986e;
                        if (iArr3 != null) {
                            for (int valueOf : iArr3) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i7));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    j8 = j;
                    i2 = i8;
                    break;
                }
                i7 += 64;
                j8 = j9;
                j9 = j;
            }
            return new SnapshotIdSet(j9, j8, i2, arrayList != null ? C19327t.m32659o1(arrayList) : this.f2986e).mo5949l(i3);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(this));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb2.append(", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append(String.valueOf(obj));
            }
        }
        sb2.append("");
        String sb3 = sb2.toString();
        C19383o.m32796f(sb3, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb3);
        sb.append(']');
        return sb.toString();
    }
}
