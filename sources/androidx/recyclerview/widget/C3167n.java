package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.n */
public final class C3167n {

    /* renamed from: a */
    public static final C3168a f7303a = new C3168a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    public class C3168a implements Comparator<C3170c> {
        public final int compare(Object obj, Object obj2) {
            return ((C3170c) obj).f7304a - ((C3170c) obj2).f7304a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    public static abstract class C3169b {
        /* renamed from: a */
        public abstract boolean mo11830a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo11831b(int i, int i2);

        /* renamed from: c */
        public void mo11832c(int i, int i2) {
        }

        /* renamed from: d */
        public abstract int mo11833d();

        /* renamed from: e */
        public abstract int mo11834e();
    }

    /* renamed from: androidx.recyclerview.widget.n$c */
    public static class C3170c {

        /* renamed from: a */
        public final int f7304a;

        /* renamed from: b */
        public final int f7305b;

        /* renamed from: c */
        public final int f7306c;

        public C3170c(int i, int i2, int i3) {
            this.f7304a = i;
            this.f7305b = i2;
            this.f7306c = i3;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$d */
    public static class C3171d {

        /* renamed from: a */
        public final List<C3170c> f7307a;

        /* renamed from: b */
        public final int[] f7308b;

        /* renamed from: c */
        public final int[] f7309c;

        /* renamed from: d */
        public final C3169b f7310d;

        /* renamed from: e */
        public final int f7311e;

        /* renamed from: f */
        public final int f7312f;

        /* renamed from: g */
        public final boolean f7313g = true;

        public C3171d(C3169b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int i;
            C3170c cVar;
            int i2;
            this.f7307a = arrayList;
            this.f7308b = iArr;
            this.f7309c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f7310d = bVar;
            int e = bVar.mo11834e();
            this.f7311e = e;
            int d = bVar.mo11833d();
            this.f7312f = d;
            C3170c cVar2 = arrayList.isEmpty() ? null : (C3170c) arrayList.get(0);
            if (!(cVar2 != null && cVar2.f7304a == 0 && cVar2.f7305b == 0)) {
                arrayList.add(0, new C3170c(0, 0, 0));
            }
            arrayList.add(new C3170c(e, d, 0));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3170c cVar3 = (C3170c) it.next();
                for (int i3 = 0; i3 < cVar3.f7306c; i3++) {
                    int i4 = cVar3.f7304a + i3;
                    int i5 = cVar3.f7305b + i3;
                    int i6 = this.f7310d.mo11830a(i4, i5) ? 1 : 2;
                    this.f7308b[i4] = (i5 << 4) | i6;
                    this.f7309c[i5] = (i4 << 4) | i6;
                }
            }
            if (this.f7313g) {
                int i7 = 0;
                for (C3170c next : this.f7307a) {
                    while (true) {
                        i = next.f7304a;
                        if (i7 >= i) {
                            break;
                        }
                        if (this.f7308b[i7] == 0) {
                            int size = this.f7307a.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 >= size) {
                                    break;
                                }
                                cVar = this.f7307a.get(i8);
                                while (true) {
                                    i2 = cVar.f7305b;
                                    if (i9 >= i2) {
                                        break;
                                    } else if (this.f7309c[i9] != 0 || !this.f7310d.mo11831b(i7, i9)) {
                                        i9++;
                                    } else {
                                        int i10 = this.f7310d.mo11830a(i7, i9) ? 8 : 4;
                                        this.f7308b[i7] = (i9 << 4) | i10;
                                        this.f7309c[i9] = i10 | (i7 << 4);
                                    }
                                }
                                i9 = cVar.f7306c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                    i7 = next.f7306c + i;
                }
            }
        }

        /* renamed from: b */
        public static C3173f m7766b(ArrayDeque arrayDeque, int i, boolean z) {
            C3173f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (C3173f) it.next();
                if (fVar.f7314a == i && fVar.f7316c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C3173f fVar2 = (C3173f) it.next();
                if (z) {
                    fVar2.f7315b--;
                } else {
                    fVar2.f7315b++;
                }
            }
            return fVar;
        }

        /* renamed from: a */
        public final void mo11899a(C3202x xVar) {
            int i;
            C3143f fVar = xVar instanceof C3143f ? (C3143f) xVar : new C3143f(xVar);
            int i2 = this.f7311e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f7311e;
            int i4 = this.f7312f;
            for (int size = this.f7307a.size() - 1; size >= 0; size--) {
                C3170c cVar = this.f7307a.get(size);
                int i5 = cVar.f7304a;
                int i6 = cVar.f7306c;
                int i7 = i5 + i6;
                int i8 = cVar.f7305b + i6;
                while (true) {
                    if (i3 <= i7) {
                        break;
                    }
                    i3--;
                    int i9 = this.f7308b[i3];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        C3173f b = m7766b(arrayDeque, i10, false);
                        if (b != null) {
                            int i11 = (i2 - b.f7315b) - 1;
                            fVar.mo11819d(i3, i11);
                            if ((i9 & 4) != 0) {
                                this.f7310d.mo11832c(i3, i10);
                                fVar.mo11818c(i11, 1, (Object) null);
                            }
                        } else {
                            arrayDeque.add(new C3173f(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        fVar.mo11817b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > i8) {
                    i4--;
                    int i12 = this.f7309c[i4];
                    if ((i12 & 12) != 0) {
                        int i13 = i12 >> 4;
                        C3173f b2 = m7766b(arrayDeque, i13, true);
                        if (b2 == null) {
                            arrayDeque.add(new C3173f(i4, i2 - i3, false));
                        } else {
                            fVar.mo11819d((i2 - b2.f7315b) - 1, i3);
                            if ((i12 & 4) != 0) {
                                this.f7310d.mo11832c(i13, i4);
                                fVar.mo11818c(i3, 1, (Object) null);
                            }
                        }
                    } else {
                        fVar.mo11816a(i3, 1);
                        i2++;
                    }
                }
                int i14 = cVar.f7304a;
                int i15 = cVar.f7305b;
                for (i = 0; i < cVar.f7306c; i++) {
                    if ((this.f7308b[i14] & 15) == 2) {
                        this.f7310d.mo11832c(i14, i15);
                        fVar.mo11818c(i14, 1, (Object) null);
                    }
                    i14++;
                    i15++;
                }
                i3 = cVar.f7304a;
                i4 = cVar.f7305b;
            }
            fVar.mo11840e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$e */
    public static abstract class C3172e<T> {
        /* renamed from: a */
        public abstract boolean mo11900a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo11901b(T t, T t2);
    }

    /* renamed from: androidx.recyclerview.widget.n$f */
    public static class C3173f {

        /* renamed from: a */
        public int f7314a;

        /* renamed from: b */
        public int f7315b;

        /* renamed from: c */
        public boolean f7316c;

        public C3173f(int i, int i2, boolean z) {
            this.f7314a = i;
            this.f7315b = i2;
            this.f7316c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$g */
    public static class C3174g {

        /* renamed from: a */
        public int f7317a;

        /* renamed from: b */
        public int f7318b;

        /* renamed from: c */
        public int f7319c;

        /* renamed from: d */
        public int f7320d;

        public C3174g() {
        }

        public C3174g(int i, int i2) {
            this.f7317a = 0;
            this.f7318b = i;
            this.f7319c = 0;
            this.f7320d = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$h */
    public static class C3175h {

        /* renamed from: a */
        public int f7321a;

        /* renamed from: b */
        public int f7322b;

        /* renamed from: c */
        public int f7323c;

        /* renamed from: d */
        public int f7324d;

        /* renamed from: e */
        public boolean f7325e;

        /* renamed from: a */
        public final int mo11902a() {
            return Math.min(this.f7323c - this.f7321a, this.f7324d - this.f7322b);
        }
    }

    /* renamed from: a */
    public static C3171d m7760a(C3169b bVar) {
        C3174g gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3175h hVar;
        ArrayList arrayList3;
        int i;
        C3174g gVar2;
        C3174g gVar3;
        C3170c cVar;
        int i2;
        int i3;
        boolean z;
        C3175h hVar2;
        C3175h hVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C3169b bVar2 = bVar;
        int e = bVar.mo11834e();
        int d = bVar.mo11833d();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C3174g(e, d));
        int i10 = e + d;
        int i11 = 1;
        int i12 = (((i10 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i12];
        int i13 = i12 / 2;
        int[] iArr2 = new int[i12];
        ArrayList arrayList6 = new ArrayList();
        while (!arrayList5.isEmpty()) {
            C3174g gVar4 = (C3174g) arrayList5.remove(arrayList5.size() - i11);
            int i14 = gVar4.f7318b;
            int i15 = gVar4.f7317a;
            int i16 = i14 - i15;
            if (i16 >= i11 && (i2 = gVar4.f7320d - gVar4.f7319c) >= i11) {
                int i17 = ((i2 + i16) + i11) / 2;
                int i18 = i11 + i13;
                iArr[i18] = i15;
                iArr2[i18] = i14;
                int i19 = 0;
                while (true) {
                    if (i19 >= i17) {
                        break;
                    }
                    int i20 = Math.abs((gVar4.f7318b - gVar4.f7317a) - (gVar4.f7320d - gVar4.f7319c)) % 2 == i11 ? i11 : 0;
                    int i21 = (gVar4.f7318b - gVar4.f7317a) - (gVar4.f7320d - gVar4.f7319c);
                    int i22 = -i19;
                    int i23 = i22;
                    while (true) {
                        if (i23 > i19) {
                            arrayList2 = arrayList5;
                            arrayList = arrayList6;
                            i3 = i17;
                            z = false;
                            hVar2 = null;
                            break;
                        }
                        if (i23 == i22 || (i23 != i19 && iArr[i23 + 1 + i13] > iArr[(i23 - 1) + i13])) {
                            i8 = iArr[i23 + 1 + i13];
                            i7 = i8;
                        } else {
                            i8 = iArr[(i23 - 1) + i13];
                            i7 = i8 + 1;
                        }
                        i3 = i17;
                        arrayList2 = arrayList5;
                        int i24 = ((i7 - gVar4.f7317a) + gVar4.f7319c) - i23;
                        int i25 = (i19 == 0 || i7 != i8) ? i24 : i24 - 1;
                        arrayList = arrayList6;
                        while (i7 < gVar4.f7318b && i24 < gVar4.f7320d && bVar2.mo11831b(i7, i24)) {
                            i7++;
                            i24++;
                        }
                        iArr[i23 + i13] = i7;
                        if (i20 != 0) {
                            int i26 = i21 - i23;
                            i9 = i20;
                            if (i26 >= i22 + 1 && i26 <= i19 - 1 && iArr2[i26 + i13] <= i7) {
                                hVar2 = new C3175h();
                                hVar2.f7321a = i8;
                                hVar2.f7322b = i25;
                                hVar2.f7323c = i7;
                                hVar2.f7324d = i24;
                                z = false;
                                hVar2.f7325e = false;
                                break;
                            }
                        } else {
                            i9 = i20;
                        }
                        i23 += 2;
                        i17 = i3;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList;
                        i20 = i9;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar4;
                        break;
                    }
                    int i27 = (gVar4.f7318b - gVar4.f7317a) - (gVar4.f7320d - gVar4.f7319c);
                    boolean z2 = i27 % 2 == 0 ? true : z;
                    int i28 = i22;
                    while (true) {
                        if (i28 > i19) {
                            gVar = gVar4;
                            hVar3 = null;
                            break;
                        }
                        if (i28 == i22 || (i28 != i19 && iArr2[i28 + 1 + i13] < iArr2[(i28 - 1) + i13])) {
                            i5 = iArr2[i28 + 1 + i13];
                            i4 = i5;
                        } else {
                            i5 = iArr2[(i28 - 1) + i13];
                            i4 = i5 - 1;
                        }
                        int i29 = gVar4.f7320d - ((gVar4.f7318b - i4) - i28);
                        int i30 = (i19 == 0 || i4 != i5) ? i29 : i29 + 1;
                        while (true) {
                            if (i4 > gVar4.f7317a && i29 > gVar4.f7319c) {
                                int i31 = i4 - 1;
                                gVar = gVar4;
                                int i32 = i29 - 1;
                                if (!bVar2.mo11831b(i31, i32)) {
                                    break;
                                }
                                i4 = i31;
                                i29 = i32;
                                gVar4 = gVar;
                            } else {
                                gVar = gVar4;
                            }
                        }
                        gVar = gVar4;
                        iArr2[i28 + i13] = i4;
                        if (z2 && (i6 = i27 - i28) >= i22 && i6 <= i19 && iArr[i6 + i13] >= i4) {
                            hVar3 = new C3175h();
                            hVar3.f7321a = i4;
                            hVar3.f7322b = i29;
                            hVar3.f7323c = i5;
                            hVar3.f7324d = i30;
                            hVar3.f7325e = true;
                            break;
                        }
                        i28 += 2;
                        gVar4 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i19++;
                    i17 = i3;
                    arrayList5 = arrayList2;
                    arrayList6 = arrayList;
                    gVar4 = gVar;
                    i11 = 1;
                }
            }
            arrayList2 = arrayList5;
            arrayList = arrayList6;
            gVar = gVar4;
            hVar = null;
            if (hVar != null) {
                if (hVar.mo11902a() > 0) {
                    int i33 = hVar.f7324d;
                    int i34 = hVar.f7322b;
                    int i35 = i33 - i34;
                    int i36 = hVar.f7323c;
                    int i37 = hVar.f7321a;
                    int i38 = i36 - i37;
                    if (!(i35 != i38)) {
                        cVar = new C3170c(i37, i34, i38);
                    } else if (hVar.f7325e) {
                        cVar = new C3170c(i37, i34, hVar.mo11902a());
                    } else {
                        cVar = i35 > i38 ? new C3170c(i37, i34 + 1, hVar.mo11902a()) : new C3170c(i37 + 1, i34, hVar.mo11902a());
                    }
                    arrayList4.add(cVar);
                }
                if (arrayList.isEmpty()) {
                    gVar3 = new C3174g();
                    arrayList6 = arrayList;
                    gVar2 = gVar;
                    i = 1;
                } else {
                    i = 1;
                    arrayList6 = arrayList;
                    gVar3 = (C3174g) arrayList6.remove(arrayList.size() - 1);
                    gVar2 = gVar;
                }
                gVar3.f7317a = gVar2.f7317a;
                gVar3.f7319c = gVar2.f7319c;
                gVar3.f7318b = hVar.f7321a;
                gVar3.f7320d = hVar.f7322b;
                arrayList3 = arrayList2;
                arrayList3.add(gVar3);
                gVar2.f7318b = gVar2.f7318b;
                gVar2.f7320d = gVar2.f7320d;
                gVar2.f7317a = hVar.f7323c;
                gVar2.f7319c = hVar.f7324d;
                arrayList3.add(gVar2);
            } else {
                arrayList3 = arrayList2;
                arrayList6 = arrayList;
                i = 1;
                arrayList6.add(gVar);
            }
            i11 = i;
            arrayList5 = arrayList3;
        }
        Collections.sort(arrayList4, f7303a);
        return new C3171d(bVar2, arrayList4, iArr, iArr2);
    }
}
