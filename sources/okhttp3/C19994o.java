package okhttp3;

import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.C19324q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import p735br.C18980c;
import p755lq.C19875a;
import p764pq.C20055g;

/* renamed from: okhttp3.o */
public final class C19994o implements Iterable<Pair<? extends String, ? extends String>>, C19875a {

    /* renamed from: c */
    public static final C19996b f44234c = new C19996b();

    /* renamed from: b */
    public final String[] f44235b;

    /* renamed from: okhttp3.o$a */
    public static final class C19995a {

        /* renamed from: a */
        public final ArrayList f44236a = new ArrayList(20);

        /* renamed from: a */
        public final void mo72958a(String str, String str2) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str2, "value");
            C19994o.f44234c.getClass();
            C19996b.m34214a(str);
            C19996b.m34215b(str2, str);
            mo72960c(str, str2);
        }

        /* renamed from: b */
        public final void mo72959b(String str) {
            C19383o.m32797g(str, "line");
            int k1 = C19459m.m33042k1(str, ':', 1, false, 4);
            if (k1 != -1) {
                String substring = str.substring(0, k1);
                C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(k1 + 1);
                C19383o.m32796f(substring2, "(this as java.lang.String).substring(startIndex)");
                mo72960c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C19383o.m32796f(substring3, "(this as java.lang.String).substring(startIndex)");
                mo72960c("", substring3);
            } else {
                mo72960c("", str);
            }
        }

        /* renamed from: c */
        public final void mo72960c(String str, String str2) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str2, "value");
            this.f44236a.add(str);
            this.f44236a.add(C19459m.m33035H1(str2).toString());
        }

        /* renamed from: d */
        public final C19994o mo72961d() {
            Object[] array = this.f44236a.toArray(new String[0]);
            if (array != null) {
                return new C19994o((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: e */
        public final String mo72962e(String str) {
            C19383o.m32797g(str, "name");
            C20055g B0 = C19388s.m32812B0(new C20055g(this.f44236a.size() - 2, 0, -1), 2);
            int i = B0.f44414b;
            int i2 = B0.f44415c;
            int i3 = B0.f44416d;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!C19457k.m33019W0(str, (String) this.f44236a.get(i), true)) {
                if (i == i2) {
                    return null;
                }
                i += i3;
            }
            return (String) this.f44236a.get(i + 1);
        }

        /* renamed from: f */
        public final void mo72963f(String str) {
            C19383o.m32797g(str, "name");
            int i = 0;
            while (i < this.f44236a.size()) {
                if (C19457k.m33019W0(str, (String) this.f44236a.get(i), true)) {
                    this.f44236a.remove(i);
                    this.f44236a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    /* renamed from: okhttp3.o$b */
    public static final class C19996b {
        /* renamed from: a */
        public static void m34214a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C18980c.m32104h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* renamed from: b */
        public static void m34215b(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C18980c.m32104h("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* renamed from: c */
        public static C19994o m34216c(String... strArr) {
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        String str = strArr2[i];
                        if (!(str != null)) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        } else if (str != null) {
                            strArr2[i] = C19459m.m33035H1(str).toString();
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    C20055g B0 = C19388s.m32812B0(C19388s.m32816D0(0, strArr2.length), 2);
                    int i2 = B0.f44414b;
                    int i3 = B0.f44415c;
                    int i4 = B0.f44416d;
                    if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                        while (true) {
                            String str2 = strArr2[i2];
                            String str3 = strArr2[i2 + 1];
                            m34214a(str2);
                            m34215b(str3, str2);
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        }
                    }
                    return new C19994o(strArr2);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public C19994o(String[] strArr) {
        this.f44235b = strArr;
    }

    /* renamed from: l */
    public static final C19994o m34201l(Map<String, String> map) {
        f44234c.getClass();
        C19383o.m32797g(map, "$this$toHeaders");
        String[] strArr = new String[(map.size() * 2)];
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (str != null) {
                String obj = C19459m.m33035H1(str).toString();
                if (str2 != null) {
                    String obj2 = C19459m.m33035H1(str2).toString();
                    C19996b.m34214a(obj);
                    C19996b.m34215b(obj2, obj);
                    strArr[i] = obj;
                    strArr[i + 1] = obj2;
                    i += 2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return new C19994o(strArr);
    }

    /* renamed from: a */
    public final String mo72948a(String str) {
        C19383o.m32797g(str, "name");
        C19996b bVar = f44234c;
        String[] strArr = this.f44235b;
        bVar.getClass();
        C20055g B0 = C19388s.m32812B0(new C20055g(strArr.length - 2, 0, -1), 2);
        int i = B0.f44414b;
        int i2 = B0.f44415c;
        int i3 = B0.f44416d;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!C19457k.m33019W0(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    /* renamed from: c */
    public final String mo72949c(int i) {
        return this.f44235b[i * 2];
    }

    /* renamed from: e */
    public final Set<String> mo72950e() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C19383o.m32796f(comparator, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        int length = this.f44235b.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(mo72949c(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C19383o.m32796f(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19994o) && Arrays.equals(this.f44235b, ((C19994o) obj).f44235b);
    }

    /* renamed from: g */
    public final C19995a mo72952g() {
        C19995a aVar = new C19995a();
        C19324q.m32629K0(aVar.f44236a, this.f44235b);
        return aVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44235b);
    }

    public final Iterator<Pair<String, String>> iterator() {
        int length = this.f44235b.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i = 0; i < length; i++) {
            pairArr[i] = new Pair(mo72949c(i), mo72955m(i));
        }
        return C15588c1.m25350u0(pairArr);
    }

    /* renamed from: m */
    public final String mo72955m(int i) {
        return this.f44235b[(i * 2) + 1];
    }

    /* renamed from: n */
    public final List<String> mo72956n(String str) {
        C19383o.m32797g(str, "name");
        int length = this.f44235b.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (C19457k.m33019W0(str, mo72949c(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo72955m(i));
            }
        }
        if (arrayList == null) {
            return EmptyList.INSTANCE;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C19383o.m32796f(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f44235b.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(mo72949c(i));
            sb.append(": ");
            sb.append(mo72955m(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
