package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p112g2.C6836c;
import p112g2.C6837d;

/* renamed from: androidx.room.d0 */
public final class C3226d0 implements C6837d, C6836c {

    /* renamed from: j */
    public static final TreeMap<Integer, C3226d0> f7499j = new TreeMap<>();

    /* renamed from: b */
    public volatile String f7500b;

    /* renamed from: c */
    public final long[] f7501c;

    /* renamed from: d */
    public final double[] f7502d;

    /* renamed from: e */
    public final String[] f7503e;

    /* renamed from: f */
    public final byte[][] f7504f;

    /* renamed from: g */
    public final int[] f7505g;

    /* renamed from: h */
    public final int f7506h;

    /* renamed from: i */
    public int f7507i;

    public C3226d0(int i) {
        this.f7506h = i;
        int i2 = i + 1;
        this.f7505g = new int[i2];
        this.f7501c = new long[i2];
        this.f7502d = new double[i2];
        this.f7503e = new String[i2];
        this.f7504f = new byte[i2][];
    }

    /* renamed from: d */
    public static C3226d0 m7877d(int i, String str) {
        TreeMap<Integer, C3226d0> treeMap = f7499j;
        synchronized (treeMap) {
            Map.Entry<Integer, C3226d0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C3226d0 value = ceilingEntry.getValue();
                value.f7500b = str;
                value.f7507i = i;
                return value;
            }
            C3226d0 d0Var = new C3226d0(i);
            d0Var.f7500b = str;
            d0Var.f7507i = i;
            return d0Var;
        }
    }

    /* renamed from: Y */
    public final void mo12011Y(int i, String str) {
        this.f7505g[i] = 4;
        this.f7503e[i] = str;
    }

    /* renamed from: a */
    public final String mo6592a() {
        return this.f7500b;
    }

    /* renamed from: b */
    public final void mo6593b(C6836c cVar) {
        for (int i = 1; i <= this.f7507i; i++) {
            int i2 = this.f7505g[i];
            if (i2 == 1) {
                cVar.mo12015p0(i);
            } else if (i2 == 2) {
                cVar.mo12013h0(i, this.f7501c[i]);
            } else if (i2 == 3) {
                cVar.mo12017v(i, this.f7502d[i]);
            } else if (i2 == 4) {
                cVar.mo12011Y(i, this.f7503e[i]);
            } else if (i2 == 5) {
                cVar.mo12014i0(i, this.f7504f[i]);
            }
        }
    }

    public final void close() {
    }

    /* renamed from: h0 */
    public final void mo12013h0(int i, long j) {
        this.f7505g[i] = 2;
        this.f7501c[i] = j;
    }

    /* renamed from: i0 */
    public final void mo12014i0(int i, byte[] bArr) {
        this.f7505g[i] = 5;
        this.f7504f[i] = bArr;
    }

    /* renamed from: p0 */
    public final void mo12015p0(int i) {
        this.f7505g[i] = 1;
    }

    public final void release() {
        TreeMap<Integer, C3226d0> treeMap = f7499j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f7506h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo12017v(int i, double d) {
        this.f7505g[i] = 3;
        this.f7502d[i] = d;
    }
}
