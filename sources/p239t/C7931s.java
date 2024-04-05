package p239t;

import com.google.android.gms.measurement.internal.C14921a0;
import java.util.Arrays;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p001a0.C0005b;
import p259v.C8181a;
import p270w.C8227a;
import p764pq.C20055g;

/* renamed from: t.s */
public final class C7931s<K, V> {

    /* renamed from: e */
    public static final C7931s f17394e = new C7931s(0, 0, new Object[0], (C14921a0) null);

    /* renamed from: a */
    public int f17395a;

    /* renamed from: b */
    public int f17396b;

    /* renamed from: c */
    public final C14921a0 f17397c;

    /* renamed from: d */
    public Object[] f17398d;

    /* renamed from: t.s$a */
    public static final class C7932a<K, V> {

        /* renamed from: a */
        public C7931s<K, V> f17399a;

        /* renamed from: b */
        public final int f17400b;

        public C7932a(C7931s<K, V> sVar, int i) {
            C19383o.m32797g(sVar, "node");
            this.f17399a = sVar;
            this.f17400b = i;
        }
    }

    public C7931s(int i, int i2, Object[] objArr, C14921a0 a0Var) {
        this.f17395a = i;
        this.f17396b = i2;
        this.f17397c = a0Var;
        this.f17398d = objArr;
    }

    /* renamed from: j */
    public static C7931s m15878j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C14921a0 a0Var) {
        int i4 = i3;
        C14921a0 a0Var2 = a0Var;
        if (i4 > 30) {
            return new C7931s(0, 0, new Object[]{obj, obj2, obj3, obj4}, a0Var2);
        }
        int i5 = (i >> i4) & 31;
        int i6 = (i2 >> i4) & 31;
        if (i5 != i6) {
            Object[] objArr = new Object[4];
            if (i5 < i6) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new C7931s((1 << i5) | (1 << i6), 0, objArr, a0Var2);
        }
        return new C7931s(0, 1 << i5, new Object[]{m15878j(i, obj, obj2, i2, obj3, obj4, i4 + 5, a0Var)}, a0Var2);
    }

    /* renamed from: a */
    public final Object[] mo20448a(int i, int i2, int i3, K k, V v, int i4, C14921a0 a0Var) {
        int i5 = i;
        Object obj = this.f17398d[i5];
        C7931s j = m15878j(obj != null ? obj.hashCode() : 0, obj, mo20470x(i), i3, k, v, i4 + 5, a0Var);
        int i6 = i2;
        int t = mo20466t(i2) + 1;
        Object[] objArr = this.f17398d;
        int i7 = t - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        C19318k.m32605W0(objArr, objArr2, 0, 0, i, 6);
        C19318k.m32603U0(objArr, i, objArr2, i5 + 2, t);
        objArr2[i7] = j;
        C19318k.m32603U0(objArr, i7 + 1, objArr2, t, objArr.length);
        return objArr2;
    }

    /* renamed from: b */
    public final int mo20449b() {
        if (this.f17396b == 0) {
            return this.f17398d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f17395a);
        int length = this.f17398d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += mo20465s(i).mo20449b();
        }
        return bitCount;
    }

    /* renamed from: c */
    public final boolean mo20450c(K k) {
        C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, this.f17398d.length), 2);
        int i = B0.f44414b;
        int i2 = B0.f44415c;
        int i3 = B0.f44416d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!C19383o.m32792b(k, this.f17398d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo20451d(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (mo20455h(i3)) {
            return C19383o.m32792b(obj, this.f17398d[mo20453f(i3)]);
        } else if (!mo20456i(i3)) {
            return false;
        } else {
            C7931s s = mo20465s(mo20466t(i3));
            return i2 == 30 ? s.mo20450c(obj) : s.mo20451d(i, i2 + 5, obj);
        }
    }

    /* renamed from: e */
    public final boolean mo20452e(C7931s<K, V> sVar) {
        if (this == sVar) {
            return true;
        }
        if (this.f17396b != sVar.f17396b || this.f17395a != sVar.f17395a) {
            return false;
        }
        int length = this.f17398d.length;
        for (int i = 0; i < length; i++) {
            if (this.f17398d[i] != sVar.f17398d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo20453f(int i) {
        return Integer.bitCount((i - 1) & this.f17395a) * 2;
    }

    /* renamed from: g */
    public final Object mo20454g(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (mo20455h(i3)) {
            int f = mo20453f(i3);
            if (C19383o.m32792b(obj, this.f17398d[f])) {
                return mo20470x(f);
            }
            return null;
        } else if (!mo20456i(i3)) {
            return null;
        } else {
            C7931s s = mo20465s(mo20466t(i3));
            if (i2 != 30) {
                return s.mo20454g(i, i2 + 5, obj);
            }
            C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, s.f17398d.length), 2);
            int i4 = B0.f44414b;
            int i5 = B0.f44415c;
            int i6 = B0.f44416d;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                return null;
            }
            while (!C19383o.m32792b(obj, s.f17398d[i4])) {
                if (i4 == i5) {
                    return null;
                }
                i4 += i6;
            }
            return s.mo20470x(i4);
        }
    }

    /* renamed from: h */
    public final boolean mo20455h(int i) {
        return (i & this.f17395a) != 0;
    }

    /* renamed from: i */
    public final boolean mo20456i(int i) {
        return (i & this.f17396b) != 0;
    }

    /* renamed from: k */
    public final C7931s<K, V> mo20457k(int i, C7917e<K, V> eVar) {
        eVar.mo20418f(eVar.mo20413c() - 1);
        eVar.f17380e = mo20470x(i);
        Object[] objArr = this.f17398d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f17397c != eVar.f17378c) {
            return new C7931s<>(0, 0, C0005b.m10D(i, objArr), eVar.f17378c);
        }
        this.f17398d = C0005b.m10D(i, objArr);
        return this;
    }

    /* renamed from: l */
    public final C7931s<K, V> mo20458l(int i, K k, V v, int i2, C7917e<K, V> eVar) {
        C7931s<K, V> sVar;
        C19383o.m32797g(eVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (mo20455h(i3)) {
            int f = mo20453f(i3);
            if (C19383o.m32792b(k, this.f17398d[f])) {
                eVar.f17380e = mo20470x(f);
                if (mo20470x(f) == v) {
                    return this;
                }
                if (this.f17397c == eVar.f17378c) {
                    this.f17398d[f + 1] = v;
                    return this;
                }
                eVar.f17381f++;
                Object[] objArr = this.f17398d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                C19383o.m32796f(copyOf, "copyOf(this, size)");
                copyOf[f + 1] = v;
                return new C7931s<>(this.f17395a, this.f17396b, copyOf, eVar.f17378c);
            }
            eVar.mo20418f(eVar.mo20413c() + 1);
            C14921a0 a0Var = eVar.f17378c;
            if (this.f17397c == a0Var) {
                this.f17398d = mo20448a(f, i3, i, k, v, i2, a0Var);
                this.f17395a ^= i3;
                this.f17396b |= i3;
                return this;
            }
            return new C7931s<>(this.f17395a ^ i3, this.f17396b | i3, mo20448a(f, i3, i, k, v, i2, a0Var), a0Var);
        } else if (mo20456i(i3)) {
            int t = mo20466t(i3);
            C7931s<K, V> s = mo20465s(t);
            if (i2 == 30) {
                C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, s.f17398d.length), 2);
                int i4 = B0.f44414b;
                int i5 = B0.f44415c;
                int i6 = B0.f44416d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C19383o.m32792b(k, s.f17398d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            eVar.f17380e = s.mo20470x(i4);
                            if (s.f17397c == eVar.f17378c) {
                                s.f17398d[i4 + 1] = v;
                                sVar = s;
                            } else {
                                eVar.f17381f++;
                                Object[] objArr2 = s.f17398d;
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                C19383o.m32796f(copyOf2, "copyOf(this, size)");
                                copyOf2[i4 + 1] = v;
                                sVar = new C7931s<>(0, 0, copyOf2, eVar.f17378c);
                            }
                        }
                    }
                }
                eVar.mo20418f(eVar.mo20413c() + 1);
                sVar = new C7931s<>(0, 0, C0005b.m67x(s.f17398d, 0, k, v), eVar.f17378c);
            } else {
                sVar = s.mo20458l(i, k, v, i2 + 5, eVar);
            }
            return s == sVar ? this : mo20464r(t, sVar, eVar.f17378c);
        } else {
            eVar.mo20418f(eVar.mo20413c() + 1);
            C14921a0 a0Var2 = eVar.f17378c;
            int f2 = mo20453f(i3);
            if (this.f17397c == a0Var2) {
                this.f17398d = C0005b.m67x(this.f17398d, f2, k, v);
                this.f17395a |= i3;
                return this;
            }
            return new C7931s<>(this.f17395a | i3, this.f17396b, C0005b.m67x(this.f17398d, f2, k, v), a0Var2);
        }
    }

    /* renamed from: m */
    public final C7931s<K, V> mo20459m(C7931s<K, V> sVar, int i, C8227a aVar, C7917e<K, V> eVar) {
        Object[] objArr;
        int i2;
        C7931s<K, V> sVar2;
        int i3;
        C7931s<K, V> sVar3 = sVar;
        int i4 = i;
        C8227a aVar2 = aVar;
        C7917e<K, V> eVar2 = eVar;
        C19383o.m32797g(sVar3, "otherNode");
        C19383o.m32797g(eVar2, "mutator");
        if (this == sVar3) {
            aVar2.f18059a += mo20449b();
            return this;
        }
        int i5 = 0;
        if (i4 > 30) {
            C14921a0 a0Var = eVar2.f17378c;
            Object[] objArr2 = this.f17398d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + sVar3.f17398d.length);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            int length = this.f17398d.length;
            C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, sVar3.f17398d.length), 2);
            int i6 = B0.f44414b;
            int i7 = B0.f44415c;
            int i8 = B0.f44416d;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!mo20450c(sVar3.f17398d[i6])) {
                        Object[] objArr3 = sVar3.f17398d;
                        copyOf[length] = objArr3[i6];
                        copyOf[length + 1] = objArr3[i6 + 1];
                        length += 2;
                    } else {
                        aVar2.f18059a++;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6 += i8;
                }
            }
            if (length == this.f17398d.length) {
                return this;
            }
            if (length == sVar3.f17398d.length) {
                return sVar3;
            }
            if (length == copyOf.length) {
                return new C7931s<>(0, 0, copyOf, a0Var);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
            return new C7931s<>(0, 0, copyOf2, a0Var);
        }
        int i9 = this.f17396b | sVar3.f17396b;
        int i10 = this.f17395a;
        int i11 = sVar3.f17395a;
        int i12 = i10 & i11;
        int i13 = (i10 ^ i11) & (~i9);
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            if (C19383o.m32792b(this.f17398d[mo20453f(lowestOneBit)], sVar3.f17398d[sVar3.mo20453f(lowestOneBit)])) {
                i13 |= lowestOneBit;
            } else {
                i9 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        if ((i9 & i13) == 0) {
            C7931s sVar4 = (C19383o.m32792b(this.f17397c, eVar2.f17378c) && this.f17395a == i13 && this.f17396b == i9) ? this : new C7931s(i13, i9, new Object[(Integer.bitCount(i9) + (Integer.bitCount(i13) * 2))], (C14921a0) null);
            int i14 = i9;
            int i15 = 0;
            while (i14 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i14);
                Object[] objArr4 = sVar4.f17398d;
                int length2 = (objArr4.length - 1) - i15;
                if (mo20456i(lowestOneBit2)) {
                    sVar2 = mo20465s(mo20466t(lowestOneBit2));
                    if (sVar3.mo20456i(lowestOneBit2)) {
                        sVar2 = sVar2.mo20459m(sVar3.mo20465s(sVar3.mo20466t(lowestOneBit2)), i4 + 5, aVar2, eVar2);
                    } else if (sVar3.mo20455h(lowestOneBit2)) {
                        int f = sVar3.mo20453f(lowestOneBit2);
                        Object obj = sVar3.f17398d[f];
                        V x = sVar3.mo20470x(f);
                        int i16 = eVar2.f17382g;
                        int hashCode = obj != null ? obj.hashCode() : i5;
                        int i17 = i16;
                        int i18 = hashCode;
                        objArr = objArr4;
                        i3 = lowestOneBit2;
                        sVar2 = sVar2.mo20458l(i18, obj, x, i4 + 5, eVar);
                        if (eVar2.f17382g == i17) {
                            aVar2.f18059a++;
                        }
                        i2 = i3;
                    }
                    objArr = objArr4;
                    i3 = lowestOneBit2;
                    i2 = i3;
                } else {
                    objArr = objArr4;
                    i2 = lowestOneBit2;
                    if (sVar3.mo20456i(i2)) {
                        sVar2 = sVar3.mo20465s(sVar3.mo20466t(i2));
                        if (mo20455h(i2)) {
                            int f2 = mo20453f(i2);
                            Object obj2 = this.f17398d[f2];
                            int i19 = i4 + 5;
                            if (sVar2.mo20451d(obj2 != null ? obj2.hashCode() : 0, i19, obj2)) {
                                aVar2.f18059a++;
                            } else {
                                sVar2 = sVar2.mo20458l(obj2 != null ? obj2.hashCode() : 0, obj2, mo20470x(f2), i19, eVar);
                            }
                        }
                    } else {
                        int f3 = mo20453f(i2);
                        Object obj3 = this.f17398d[f3];
                        Object x2 = mo20470x(f3);
                        int f4 = sVar3.mo20453f(i2);
                        Object obj4 = sVar3.f17398d[f4];
                        sVar2 = m15878j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, sVar3.mo20470x(f4), i4 + 5, eVar2.f17378c);
                    }
                }
                objArr[length2] = sVar2;
                i15++;
                i14 ^= i2;
                i5 = 0;
            }
            int i20 = 0;
            while (i13 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i13);
                int i21 = i20 * 2;
                if (!sVar3.mo20455h(lowestOneBit3)) {
                    int f5 = mo20453f(lowestOneBit3);
                    Object[] objArr5 = sVar4.f17398d;
                    objArr5[i21] = this.f17398d[f5];
                    objArr5[i21 + 1] = mo20470x(f5);
                } else {
                    int f6 = sVar3.mo20453f(lowestOneBit3);
                    Object[] objArr6 = sVar4.f17398d;
                    objArr6[i21] = sVar3.f17398d[f6];
                    objArr6[i21 + 1] = sVar3.mo20470x(f6);
                    if (mo20455h(lowestOneBit3)) {
                        aVar2.f18059a++;
                    }
                }
                i20++;
                i13 ^= lowestOneBit3;
            }
            return mo20452e(sVar4) ? this : sVar3.mo20452e(sVar4) ? sVar3 : sVar4;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: n */
    public final C7931s<K, V> mo20460n(int i, K k, int i2, C7917e<K, V> eVar) {
        C7931s<K, V> sVar;
        C19383o.m32797g(eVar, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (mo20455h(i3)) {
            int f = mo20453f(i3);
            return C19383o.m32792b(k, this.f17398d[f]) ? mo20462p(f, i3, eVar) : this;
        } else if (!mo20456i(i3)) {
            return this;
        } else {
            int t = mo20466t(i3);
            C7931s<K, V> s = mo20465s(t);
            if (i2 == 30) {
                C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, s.f17398d.length), 2);
                int i4 = B0.f44414b;
                int i5 = B0.f44415c;
                int i6 = B0.f44416d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C19383o.m32792b(k, s.f17398d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            sVar = s.mo20457k(i4, eVar);
                            break;
                        }
                    }
                }
                sVar = s;
            } else {
                sVar = s.mo20460n(i, k, i2 + 5, eVar);
            }
            return mo20463q(s, sVar, t, i3, eVar.f17378c);
        }
    }

    /* renamed from: o */
    public final C7931s<K, V> mo20461o(int i, K k, V v, int i2, C7917e<K, V> eVar) {
        C7931s<K, V> sVar;
        K k2 = k;
        V v2 = v;
        int i3 = i2;
        C7917e<K, V> eVar2 = eVar;
        C19383o.m32797g(eVar2, "mutator");
        int i4 = 1 << ((i >> i3) & 31);
        if (mo20455h(i4)) {
            int f = mo20453f(i4);
            return (!C19383o.m32792b(k, this.f17398d[f]) || !C19383o.m32792b(v, mo20470x(f))) ? this : mo20462p(f, i4, eVar2);
        } else if (!mo20456i(i4)) {
            return this;
        } else {
            int t = mo20466t(i4);
            C7931s<K, V> s = mo20465s(t);
            if (i3 == 30) {
                C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, s.f17398d.length), 2);
                int i5 = B0.f44414b;
                int i6 = B0.f44415c;
                int i7 = B0.f44416d;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        if (!C19383o.m32792b(k, s.f17398d[i5]) || !C19383o.m32792b(v, s.mo20470x(i5))) {
                            if (i5 == i6) {
                                break;
                            }
                            i5 += i7;
                        } else {
                            sVar = s.mo20457k(i5, eVar2);
                            break;
                        }
                    }
                }
                sVar = s;
            } else {
                sVar = s.mo20461o(i, k, v, i3 + 5, eVar);
            }
            return mo20463q(s, sVar, t, i4, eVar2.f17378c);
        }
    }

    /* renamed from: p */
    public final C7931s<K, V> mo20462p(int i, int i2, C7917e<K, V> eVar) {
        eVar.mo20418f(eVar.mo20413c() - 1);
        eVar.f17380e = mo20470x(i);
        Object[] objArr = this.f17398d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f17397c == eVar.f17378c) {
            this.f17398d = C0005b.m10D(i, objArr);
            this.f17395a ^= i2;
            return this;
        }
        return new C7931s<>(i2 ^ this.f17395a, this.f17396b, C0005b.m10D(i, objArr), eVar.f17378c);
    }

    /* renamed from: q */
    public final C7931s<K, V> mo20463q(C7931s<K, V> sVar, C7931s<K, V> sVar2, int i, int i2, C14921a0 a0Var) {
        if (sVar2 == null) {
            Object[] objArr = this.f17398d;
            if (objArr.length == 1) {
                return null;
            }
            if (this.f17397c == a0Var) {
                this.f17398d = C0005b.m11E(i, objArr);
                this.f17396b ^= i2;
            } else {
                return new C7931s<>(this.f17395a, i2 ^ this.f17396b, C0005b.m11E(i, objArr), a0Var);
            }
        } else if (this.f17397c == a0Var || sVar != sVar2) {
            return mo20464r(i, sVar2, a0Var);
        }
        return this;
    }

    /* renamed from: r */
    public final C7931s<K, V> mo20464r(int i, C7931s<K, V> sVar, C14921a0 a0Var) {
        Object[] objArr = this.f17398d;
        if (objArr.length == 1 && sVar.f17398d.length == 2 && sVar.f17396b == 0) {
            sVar.f17395a = this.f17396b;
            return sVar;
        } else if (this.f17397c == a0Var) {
            objArr[i] = sVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C19383o.m32796f(copyOf, "copyOf(this, size)");
            copyOf[i] = sVar;
            return new C7931s<>(this.f17395a, this.f17396b, copyOf, a0Var);
        }
    }

    /* renamed from: s */
    public final C7931s<K, V> mo20465s(int i) {
        Object obj = this.f17398d[i];
        if (obj != null) {
            return (C7931s) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    /* renamed from: t */
    public final int mo20466t(int i) {
        return (this.f17398d.length - 1) - Integer.bitCount((i - 1) & this.f17396b);
    }

    /* renamed from: u */
    public final C7932a mo20467u(int i, Object obj, C8181a aVar, int i2) {
        C7932a aVar2;
        int i3 = 1 << ((i >> i2) & 31);
        if (mo20455h(i3)) {
            int f = mo20453f(i3);
            if (!C19383o.m32792b(obj, this.f17398d[f])) {
                return new C7932a(new C7931s(this.f17395a ^ i3, this.f17396b | i3, mo20448a(f, i3, i, obj, aVar, i2, (C14921a0) null), (C14921a0) null), 1);
            } else if (mo20470x(f) == aVar) {
                return null;
            } else {
                Object[] objArr = this.f17398d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                C19383o.m32796f(copyOf, "copyOf(this, size)");
                copyOf[f + 1] = aVar;
                return new C7932a(new C7931s(this.f17395a, this.f17396b, copyOf, (C14921a0) null), 0);
            }
        } else if (mo20456i(i3)) {
            int t = mo20466t(i3);
            C7931s s = mo20465s(t);
            if (i2 == 30) {
                C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, s.f17398d.length), 2);
                int i4 = B0.f44414b;
                int i5 = B0.f44415c;
                int i6 = B0.f44416d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C19383o.m32792b(obj, s.f17398d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else if (aVar == s.mo20470x(i4)) {
                            aVar2 = null;
                        } else {
                            Object[] objArr2 = s.f17398d;
                            Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            C19383o.m32796f(copyOf2, "copyOf(this, size)");
                            copyOf2[i4 + 1] = aVar;
                            aVar2 = new C7932a(new C7931s(0, 0, copyOf2, (C14921a0) null), 0);
                        }
                    }
                }
                aVar2 = new C7932a(new C7931s(0, 0, C0005b.m67x(s.f17398d, 0, obj, aVar), (C14921a0) null), 1);
                if (aVar2 == null) {
                    return null;
                }
            } else {
                aVar2 = s.mo20467u(i, obj, aVar, i2 + 5);
                if (aVar2 == null) {
                    return null;
                }
            }
            aVar2.f17399a = mo20469w(t, i3, aVar2.f17399a);
            return aVar2;
        } else {
            return new C7932a(new C7931s(this.f17395a | i3, this.f17396b, C0005b.m67x(this.f17398d, mo20453f(i3), obj, aVar), (C14921a0) null), 1);
        }
    }

    /* renamed from: v */
    public final C7931s mo20468v(int i, int i2, Object obj) {
        C7931s sVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (mo20455h(i3)) {
            int f = mo20453f(i3);
            if (!C19383o.m32792b(obj, this.f17398d[f])) {
                return this;
            }
            Object[] objArr = this.f17398d;
            if (objArr.length == 2) {
                return null;
            }
            return new C7931s(this.f17395a ^ i3, this.f17396b, C0005b.m10D(f, objArr));
        } else if (!mo20456i(i3)) {
            return this;
        } else {
            int t = mo20466t(i3);
            C7931s s = mo20465s(t);
            if (i2 == 30) {
                C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, s.f17398d.length), 2);
                int i4 = B0.f44414b;
                int i5 = B0.f44415c;
                int i6 = B0.f44416d;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!C19383o.m32792b(obj, s.f17398d[i4])) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            Object[] objArr2 = s.f17398d;
                            sVar = objArr2.length == 2 ? null : new C7931s(0, 0, C0005b.m10D(i4, objArr2));
                        }
                    }
                }
                sVar = s;
            } else {
                sVar = s.mo20468v(i, i2 + 5, obj);
            }
            if (sVar != null) {
                return s != sVar ? mo20469w(t, i3, sVar) : this;
            }
            Object[] objArr3 = this.f17398d;
            if (objArr3.length == 1) {
                return null;
            }
            return new C7931s(this.f17395a, this.f17396b ^ i3, C0005b.m11E(t, objArr3));
        }
    }

    /* renamed from: w */
    public final C7931s<K, V> mo20469w(int i, int i2, C7931s<K, V> sVar) {
        Object[] objArr = sVar.f17398d;
        if (objArr.length != 2 || sVar.f17396b != 0) {
            Object[] objArr2 = this.f17398d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            copyOf[i] = sVar;
            return new C7931s<>(this.f17395a, this.f17396b, copyOf, (C14921a0) null);
        } else if (this.f17398d.length == 1) {
            sVar.f17395a = this.f17396b;
            return sVar;
        } else {
            int f = mo20453f(i2);
            Object[] objArr3 = this.f17398d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
            C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
            C19318k.m32603U0(copyOf2, i + 2, copyOf2, i + 1, objArr3.length);
            C19318k.m32603U0(copyOf2, f + 2, copyOf2, f, i);
            copyOf2[f] = obj;
            copyOf2[f + 1] = obj2;
            return new C7931s<>(this.f17395a ^ i2, i2 ^ this.f17396b, copyOf2, (C14921a0) null);
        }
    }

    /* renamed from: x */
    public final V mo20470x(int i) {
        return this.f17398d[i + 1];
    }

    public C7931s(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, (C14921a0) null);
    }
}
