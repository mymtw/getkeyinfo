package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.internal.C19736t;
import p568fn.C17782b;
import p753kq.C19857l;
import p764pq.C20057i;

/* renamed from: kotlin.collections.k */
public class C19318k extends C19382n {
    /* renamed from: Q0 */
    public static final List m32599Q0(Object[] objArr) {
        C19383o.m32797g(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        C19383o.m32796f(asList, "asList(this)");
        return asList;
    }

    /* renamed from: R0 */
    public static final void m32600R0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        C19383o.m32797g(iArr, "<this>");
        C19383o.m32797g(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* renamed from: S0 */
    public static final void m32601S0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        C19383o.m32797g(bArr, "<this>");
        C19383o.m32797g(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* renamed from: T0 */
    public static final void m32602T0(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        C19383o.m32797g(cArr, "<this>");
        C19383o.m32797g(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    /* renamed from: U0 */
    public static final void m32603U0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        C19383o.m32797g(objArr, "<this>");
        C19383o.m32797g(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m32604V0(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        m32600R0(0, 0, i, iArr, iArr2);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m32605W0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m32603U0(objArr, i, objArr2, i2, i3);
    }

    /* renamed from: X0 */
    public static final byte[] m32606X0(int i, int i2, byte[] bArr) {
        C19383o.m32797g(bArr, "<this>");
        C19382n.m32732T(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C19383o.m32796f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: Y0 */
    public static final float[] m32607Y0(float[] fArr, int i, int i2) {
        C19382n.m32732T(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C19383o.m32796f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: Z0 */
    public static final Object[] m32608Z0(int i, int i2, Object[] objArr) {
        C19383o.m32797g(objArr, "<this>");
        C19382n.m32732T(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C19383o.m32796f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: a1 */
    public static final void m32609a1(int i, Object[] objArr, int i2) {
        C19383o.m32797g(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    /* renamed from: b1 */
    public static void m32610b1(Object[] objArr, C19736t tVar) {
        int length = objArr.length;
        C19383o.m32797g(objArr, "<this>");
        Arrays.fill(objArr, 0, length, tVar);
    }

    /* renamed from: c1 */
    public static final ArrayList m32611c1(Object[] objArr) {
        C19383o.m32797g(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: d1 */
    public static final <T> T m32612d1(T[] tArr) {
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: e1 */
    public static final <T> T m32613e1(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: f1 */
    public static final <T> int m32614f1(T[] tArr) {
        C19383o.m32797g(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: g1 */
    public static final <T> int m32615g1(T[] tArr, T t) {
        C19383o.m32797g(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C19383o.m32792b(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: h1 */
    public static String m32616h1(Object[] objArr, String str, C19857l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = "";
        String str3 = (i & 2) != 0 ? str2 : null;
        if ((i & 4) == 0) {
            str2 = null;
        }
        int i2 = (i & 8) != 0 ? -1 : 0;
        String str4 = (i & 16) != 0 ? "..." : null;
        if ((i & 32) != 0) {
            lVar = null;
        }
        C19383o.m32797g(objArr, "<this>");
        C19383o.m32797g(str, "separator");
        C19383o.m32797g(str3, "prefix");
        C19383o.m32797g(str2, "postfix");
        C19383o.m32797g(str4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            C19382n.m32709G(sb, obj, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(str4);
        }
        sb.append(str2);
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: i1 */
    public static final char m32617i1(char[] cArr) {
        C19383o.m32797g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: j1 */
    public static final <T> List<T> m32618j1(T[] tArr, C20057i iVar) {
        C19383o.m32797g(tArr, "<this>");
        C19383o.m32797g(iVar, "indices");
        return iVar.isEmpty() ? EmptyList.INSTANCE : m32599Q0(m32608Z0(iVar.mo74309c().intValue(), iVar.mo74311g().intValue() + 1, tArr));
    }

    /* renamed from: k1 */
    public static final void m32619k1(HashSet hashSet, Object[] objArr) {
        for (Object add : objArr) {
            hashSet.add(add);
        }
    }

    /* renamed from: l1 */
    public static final <T> List<T> m32620l1(T[] tArr) {
        C19383o.m32797g(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C19315h(tArr, false)) : C17782b.m29864d0(tArr[0]) : EmptyList.INSTANCE;
    }

    /* renamed from: m1 */
    public static final <T> Set<T> m32621m1(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.INSTANCE;
        }
        if (length == 1) {
            return C19382n.m32702C0(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C19421p.m32930T(tArr.length));
        m32619k1(linkedHashSet, tArr);
        return linkedHashSet;
    }
}
