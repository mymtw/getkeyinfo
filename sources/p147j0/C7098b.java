package p147j0;

import androidx.compose.p015ui.text.font.AsyncTypefaceCache;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;

/* renamed from: j0.b */
public final class C7098b<K, V> {

    /* renamed from: a */
    public int[] f15790a;

    /* renamed from: b */
    public Object[] f15791b;

    /* renamed from: c */
    public int f15792c;

    public C7098b() {
        this(0);
    }

    public C7098b(int i) {
        this.f15790a = C15588c1.f35091q;
        this.f15791b = C15588c1.f35092r;
        this.f15792c = 0;
    }

    /* renamed from: a */
    public final V mo19423a(K k) {
        int c = k == null ? mo19425c() : mo19424b(k.hashCode(), k);
        if (c >= 0) {
            return this.f15791b[(c << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public final int mo19424b(int i, Object obj) {
        C19383o.m32797g(obj, "key");
        int i2 = this.f15792c;
        if (i2 == 0) {
            return -1;
        }
        int C = C15588c1.m25272C(i2, i, this.f15790a);
        if (C < 0 || C19383o.m32792b(obj, this.f15791b[C << 1])) {
            return C;
        }
        int i3 = C + 1;
        while (i3 < i2 && this.f15790a[i3] == i) {
            if (C19383o.m32792b(obj, this.f15791b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = C - 1;
        while (i4 >= 0 && this.f15790a[i4] == i) {
            if (C19383o.m32792b(obj, this.f15791b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: c */
    public final int mo19425c() {
        int i = this.f15792c;
        if (i == 0) {
            return -1;
        }
        int C = C15588c1.m25272C(i, 0, this.f15790a);
        if (C < 0 || this.f15791b[C << 1] == null) {
            return C;
        }
        int i2 = C + 1;
        while (i2 < i && this.f15790a[i2] == 0) {
            if (this.f15791b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = C - 1;
        while (i3 >= 0 && this.f15790a[i3] == 0) {
            if (this.f15791b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: d */
    public final Object mo19426d(AsyncTypefaceCache.C1939b bVar, AsyncTypefaceCache.C1938a aVar) {
        int i;
        int i2;
        int i3 = this.f15792c;
        if (bVar == null) {
            i2 = 0;
            i = mo19425c();
        } else {
            i2 = bVar.hashCode();
            i = mo19424b(i2, bVar);
        }
        if (i >= 0) {
            int i4 = (i << 1) + 1;
            Object[] objArr = this.f15791b;
            Object obj = objArr[i4];
            objArr[i4] = aVar;
            return obj;
        }
        int i5 = ~i;
        int[] iArr = this.f15790a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            this.f15790a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f15791b, i6 << 1);
            C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
            this.f15791b = copyOf2;
            if (i3 != this.f15792c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f15790a;
            int i7 = i5 + 1;
            C19318k.m32600R0(i7, i5, i3, iArr2, iArr2);
            Object[] objArr2 = this.f15791b;
            C19318k.m32603U0(objArr2, i7 << 1, objArr2, i5 << 1, this.f15792c << 1);
        }
        int i8 = this.f15792c;
        if (i3 == i8) {
            int[] iArr3 = this.f15790a;
            if (i5 < iArr3.length) {
                iArr3[i5] = i2;
                Object[] objArr3 = this.f15791b;
                int i9 = i5 << 1;
                objArr3[i9] = bVar;
                objArr3[i9 + 1] = aVar;
                this.f15792c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C7098b) {
                C7098b bVar = (C7098b) obj;
                int i = this.f15792c;
                if (i != bVar.f15792c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = this.f15791b;
                    int i3 = i2 << 1;
                    Object obj2 = objArr[i3];
                    Object obj3 = objArr[i3 + 1];
                    Object a = bVar.mo19423a(obj2);
                    if (obj3 == null) {
                        if (a == null) {
                            if (!((obj2 == null ? bVar.mo19425c() : bVar.mo19424b(obj2.hashCode(), obj2)) >= 0)) {
                            }
                        }
                        return false;
                    } else if (!C19383o.m32792b(obj3, a)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f15792c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.f15792c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object[] objArr2 = this.f15791b;
                    int i6 = i5 << 1;
                    Object obj4 = objArr2[i6];
                    Object obj5 = objArr2[i6 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                            return false;
                        }
                    } else if (!C19383o.m32792b(obj5, obj6)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f15790a;
        Object[] objArr = this.f15791b;
        int i = this.f15792c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final String toString() {
        int i = this.f15792c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f15792c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = i3 << 1;
            Object obj = this.f15791b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f15791b[i4 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "buffer.toString()");
        return sb2;
    }
}
