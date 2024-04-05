package p281x1;

import android.graphics.Color;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import p281x1.C8304b;
import p289y0.C8351c;

/* renamed from: x1.a */
public final class C8301a {

    /* renamed from: f */
    public static final C8302a f18197f = new C8302a();

    /* renamed from: a */
    public final int[] f18198a;

    /* renamed from: b */
    public final int[] f18199b;

    /* renamed from: c */
    public final ArrayList f18200c;

    /* renamed from: d */
    public final C8304b.C8307c[] f18201d;

    /* renamed from: e */
    public final float[] f18202e = new float[3];

    /* renamed from: x1.a$a */
    public static class C8302a implements Comparator<C8303b> {
        public final int compare(Object obj, Object obj2) {
            C8303b bVar = (C8303b) obj;
            C8303b bVar2 = (C8303b) obj2;
            return (((bVar2.f18211i - bVar2.f18210h) + 1) * (((bVar2.f18209g - bVar2.f18208f) + 1) * ((bVar2.f18207e - bVar2.f18206d) + 1))) - (((bVar.f18211i - bVar.f18210h) + 1) * (((bVar.f18209g - bVar.f18208f) + 1) * ((bVar.f18207e - bVar.f18206d) + 1)));
        }
    }

    /* renamed from: x1.a$b */
    public class C8303b {

        /* renamed from: a */
        public int f18203a;

        /* renamed from: b */
        public int f18204b;

        /* renamed from: c */
        public int f18205c;

        /* renamed from: d */
        public int f18206d;

        /* renamed from: e */
        public int f18207e;

        /* renamed from: f */
        public int f18208f;

        /* renamed from: g */
        public int f18209g;

        /* renamed from: h */
        public int f18210h;

        /* renamed from: i */
        public int f18211i;

        public C8303b(int i, int i2) {
            this.f18203a = i;
            this.f18204b = i2;
            mo20898a();
        }

        /* renamed from: a */
        public final void mo20898a() {
            C8301a aVar = C8301a.this;
            int[] iArr = aVar.f18198a;
            int[] iArr2 = aVar.f18199b;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f18203a; i8 <= this.f18204b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int i10 = (i9 >> 10) & 31;
                int i11 = (i9 >> 5) & 31;
                int i12 = i9 & 31;
                if (i10 > i2) {
                    i2 = i10;
                }
                if (i10 < i) {
                    i = i10;
                }
                if (i11 > i3) {
                    i3 = i11;
                }
                if (i11 < i6) {
                    i6 = i11;
                }
                if (i12 > i4) {
                    i4 = i12;
                }
                if (i12 < i7) {
                    i7 = i12;
                }
            }
            this.f18206d = i;
            this.f18207e = i2;
            this.f18208f = i6;
            this.f18209g = i3;
            this.f18210h = i7;
            this.f18211i = i4;
            this.f18205c = i5;
        }
    }

    public C8301a(int[] iArr, int i, C8304b.C8307c[] cVarArr) {
        boolean z;
        C8303b bVar;
        int i2;
        boolean z2;
        int[] iArr2 = iArr;
        int i3 = i;
        this.f18201d = cVarArr;
        int[] iArr3 = new int[32768];
        this.f18199b = iArr3;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            int i5 = iArr2[i4];
            int b = m16598b(Color.blue(i5), 8, 5) | (m16598b(Color.red(i5), 8, 5) << 10) | (m16598b(Color.green(i5), 8, 5) << 5);
            iArr2[i4] = b;
            iArr3[b] = iArr3[b] + 1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr3[i7] > 0) {
                int rgb = Color.rgb(m16598b((i7 >> 10) & 31, 5, 8), m16598b((i7 >> 5) & 31, 5, 8), m16598b(i7 & 31, 5, 8));
                float[] fArr = this.f18202e;
                ThreadLocal<double[]> threadLocal = C8351c.f18318a;
                C8351c.m16659a(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                float[] fArr2 = this.f18202e;
                C8304b.C8307c[] cVarArr2 = this.f18201d;
                if (cVarArr2 != null && cVarArr2.length > 0) {
                    int length = cVarArr2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        } else if (!this.f18201d[i8].mo20899a(fArr2)) {
                            z2 = true;
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    iArr3[i7] = 0;
                }
            }
            if (iArr3[i7] > 0) {
                i6++;
            }
        }
        int[] iArr4 = new int[i6];
        this.f18198a = iArr4;
        int i9 = 0;
        for (int i10 = 0; i10 < 32768; i10++) {
            if (iArr3[i10] > 0) {
                iArr4[i9] = i10;
                i9++;
            }
        }
        if (i6 <= i3) {
            this.f18200c = new ArrayList();
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = iArr4[i11];
                this.f18200c.add(new C8304b.C8309e(Color.rgb(m16598b((i12 >> 10) & 31, 5, 8), m16598b((i12 >> 5) & 31, 5, 8), m16598b(i12 & 31, 5, 8)), iArr3[i12]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i3, f18197f);
        priorityQueue.offer(new C8303b(0, this.f18198a.length - 1));
        while (priorityQueue.size() < i3 && (bVar = (C8303b) priorityQueue.poll()) != null) {
            int i13 = bVar.f18204b;
            int i14 = bVar.f18203a;
            if (!((i13 + 1) - i14 > 1)) {
                break;
            }
            if ((i13 + 1) - i14 > 1) {
                int i15 = bVar.f18207e - bVar.f18206d;
                int i16 = bVar.f18209g - bVar.f18208f;
                int i17 = bVar.f18211i - bVar.f18210h;
                int i18 = (i15 < i16 || i15 < i17) ? (i16 < i15 || i16 < i17) ? -1 : -2 : -3;
                C8301a aVar = C8301a.this;
                int[] iArr5 = aVar.f18198a;
                int[] iArr6 = aVar.f18199b;
                m16597a(i18, i14, iArr5, i13);
                Arrays.sort(iArr5, bVar.f18203a, bVar.f18204b + 1);
                m16597a(i18, bVar.f18203a, iArr5, bVar.f18204b);
                int i19 = bVar.f18205c / 2;
                int i20 = bVar.f18203a;
                int i21 = 0;
                while (true) {
                    int i22 = bVar.f18204b;
                    if (i20 > i22) {
                        i2 = bVar.f18203a;
                        break;
                    }
                    i21 += iArr6[iArr5[i20]];
                    if (i21 >= i19) {
                        i2 = Math.min(i22 - 1, i20);
                        break;
                    }
                    i20++;
                }
                C8303b bVar2 = new C8303b(i2 + 1, bVar.f18204b);
                bVar.f18204b = i2;
                bVar.mo20898a();
                priorityQueue.offer(bVar2);
                priorityQueue.offer(bVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C8303b bVar3 = (C8303b) it.next();
            C8301a aVar2 = C8301a.this;
            int[] iArr7 = aVar2.f18198a;
            int[] iArr8 = aVar2.f18199b;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            for (int i27 = bVar3.f18203a; i27 <= bVar3.f18204b; i27++) {
                int i28 = iArr7[i27];
                int i29 = iArr8[i28];
                i24 += i29;
                i23 = (((i28 >> 10) & 31) * i29) + i23;
                i25 = (((i28 >> 5) & 31) * i29) + i25;
                i26 = (i29 * (i28 & 31)) + i26;
            }
            float f = (float) i24;
            C8304b.C8309e eVar = new C8304b.C8309e(Color.rgb(m16598b(Math.round(((float) i23) / f), 5, 8), m16598b(Math.round(((float) i25) / f), 5, 8), m16598b(Math.round(((float) i26) / f), 5, 8)), i24);
            float[] b2 = eVar.mo20902b();
            C8304b.C8307c[] cVarArr3 = this.f18201d;
            if (cVarArr3 != null && cVarArr3.length > 0) {
                int length2 = cVarArr3.length;
                int i30 = 0;
                while (true) {
                    if (i30 >= length2) {
                        break;
                    } else if (!this.f18201d[i30].mo20899a(b2)) {
                        z = true;
                        break;
                    } else {
                        i30++;
                    }
                }
            }
            z = false;
            if (!z) {
                arrayList.add(eVar);
            }
        }
        this.f18200c = arrayList;
    }

    /* renamed from: a */
    public static void m16597a(int i, int i2, int[] iArr, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static int m16598b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }
}
