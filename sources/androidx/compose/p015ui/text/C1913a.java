package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: androidx.compose.ui.text.a */
public final class C1913a implements CharSequence {

    /* renamed from: b */
    public final String f4296b;

    /* renamed from: c */
    public final List<C1916b<C2012n>> f4297c;

    /* renamed from: d */
    public final List<C1916b<C1978h>> f4298d;

    /* renamed from: e */
    public final List<C1916b<? extends Object>> f4299e;

    /* renamed from: androidx.compose.ui.text.a$a */
    public static final class C1914a {

        /* renamed from: a */
        public final StringBuilder f4300a = new StringBuilder(16);

        /* renamed from: b */
        public final ArrayList f4301b = new ArrayList();

        /* renamed from: c */
        public final ArrayList f4302c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f4303d = new ArrayList();

        /* renamed from: androidx.compose.ui.text.a$a$a */
        public static final class C1915a<T> {

            /* renamed from: a */
            public final T f4304a;

            /* renamed from: b */
            public final int f4305b;

            /* renamed from: c */
            public int f4306c;

            /* renamed from: d */
            public final String f4307d;

            public /* synthetic */ C1915a(Object obj, int i, int i2) {
                this(obj, i, i2, "");
            }

            /* renamed from: a */
            public final C1916b<T> mo7399a(int i) {
                int i2 = this.f4306c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new C1916b<>(this.f4304a, this.f4305b, i, this.f4307d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1915a)) {
                    return false;
                }
                C1915a aVar = (C1915a) obj;
                return C19383o.m32792b(this.f4304a, aVar.f4304a) && this.f4305b == aVar.f4305b && this.f4306c == aVar.f4306c && C19383o.m32792b(this.f4307d, aVar.f4307d);
            }

            public final int hashCode() {
                T t = this.f4304a;
                return this.f4307d.hashCode() + C0069a.m170a(this.f4306c, C0069a.m170a(this.f4305b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("MutableRange(item=");
                h.append(this.f4304a);
                h.append(", start=");
                h.append(this.f4305b);
                h.append(", end=");
                h.append(this.f4306c);
                h.append(", tag=");
                return C0391c.m1057c(h, this.f4307d, ')');
            }

            public C1915a(T t, int i, int i2, String str) {
                C19383o.m32797g(str, "tag");
                this.f4304a = t;
                this.f4305b = i;
                this.f4306c = i2;
                this.f4307d = str;
            }
        }

        public C1914a(C1913a aVar) {
            C19383o.m32797g(aVar, "text");
            new ArrayList();
            mo7397a(aVar);
        }

        /* renamed from: a */
        public final void mo7397a(C1913a aVar) {
            C19383o.m32797g(aVar, "text");
            int length = this.f4300a.length();
            this.f4300a.append(aVar.f4296b);
            List<C1916b<C2012n>> list = aVar.f4297c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1916b bVar = list.get(i);
                C2012n nVar = (C2012n) bVar.f4308a;
                C19383o.m32797g(nVar, "style");
                this.f4301b.add(new C1915a(nVar, bVar.f4309b + length, bVar.f4310c + length));
            }
            List<C1916b<C1978h>> list2 = aVar.f4298d;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C1916b bVar2 = list2.get(i2);
                C1978h hVar = (C1978h) bVar2.f4308a;
                C19383o.m32797g(hVar, "style");
                this.f4302c.add(new C1915a(hVar, bVar2.f4309b + length, bVar2.f4310c + length));
            }
            List<C1916b<? extends Object>> list3 = aVar.f4299e;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C1916b bVar3 = list3.get(i3);
                this.f4303d.add(new C1915a(bVar3.f4308a, bVar3.f4309b + length, bVar3.f4310c + length, bVar3.f4311d));
            }
        }

        /* renamed from: b */
        public final C1913a mo7398b() {
            String sb = this.f4300a.toString();
            C19383o.m32796f(sb, "text.toString()");
            ArrayList arrayList = this.f4301b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((C1915a) arrayList.get(i)).mo7399a(this.f4300a.length()));
            }
            ArrayList arrayList3 = this.f4302c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList4.add(((C1915a) arrayList3.get(i2)).mo7399a(this.f4300a.length()));
            }
            ArrayList arrayList5 = this.f4303d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList6.add(((C1915a) arrayList5.get(i3)).mo7399a(this.f4300a.length()));
            }
            return new C1913a(sb, arrayList2, arrayList4, arrayList6);
        }
    }

    public C1913a() {
        throw null;
    }

    public C1913a(String str, List<C1916b<C2012n>> list, List<C1916b<C1978h>> list2, List<? extends C1916b<? extends Object>> list3) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(list3, ResponseConstants.ANNOTATIONS);
        this.f4296b = str;
        this.f4297c = list;
        this.f4298d = list2;
        this.f4299e = list3;
        int size = list2.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            C1916b bVar = list2.get(i2);
            boolean z = true;
            if (bVar.f4309b >= i) {
                if (bVar.f4310c > this.f4296b.length() ? false : z) {
                    i = bVar.f4310c;
                    i2++;
                } else {
                    StringBuilder h = C0072d.m201h("ParagraphStyle range [");
                    h.append(bVar.f4309b);
                    h.append(", ");
                    throw new IllegalArgumentException(C0071c.m191c(h, bVar.f4310c, ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    /* renamed from: a */
    public final C1913a mo7389a(C1913a aVar) {
        C19383o.m32797g(aVar, "other");
        C1914a aVar2 = new C1914a(this);
        aVar2.mo7397a(aVar);
        return aVar2.mo7398b();
    }

    /* renamed from: b */
    public final C1913a subSequence(int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.f4296b.length()) {
            return this;
        } else {
            String substring = this.f4296b.substring(i, i2);
            C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C1913a(substring, C1933b.m4231a(this.f4297c, i, i2), C1933b.m4231a(this.f4298d, i, i2), C1933b.m4231a(this.f4299e, i, i2));
        }
    }

    public final char charAt(int i) {
        return this.f4296b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1913a)) {
            return false;
        }
        C1913a aVar = (C1913a) obj;
        return C19383o.m32792b(this.f4296b, aVar.f4296b) && C19383o.m32792b(this.f4297c, aVar.f4297c) && C19383o.m32792b(this.f4298d, aVar.f4298d) && C19383o.m32792b(this.f4299e, aVar.f4299e);
    }

    public final int hashCode() {
        return this.f4299e.hashCode() + C13983i.m21488g(this.f4298d, C13983i.m21488g(this.f4297c, this.f4296b.hashCode() * 31, 31), 31);
    }

    public final int length() {
        return this.f4296b.length();
    }

    public final String toString() {
        return this.f4296b;
    }

    /* renamed from: androidx.compose.ui.text.a$b */
    public static final class C1916b<T> {

        /* renamed from: a */
        public final T f4308a;

        /* renamed from: b */
        public final int f4309b;

        /* renamed from: c */
        public final int f4310c;

        /* renamed from: d */
        public final String f4311d;

        public C1916b(T t, int i, int i2, String str) {
            C19383o.m32797g(str, "tag");
            this.f4308a = t;
            this.f4309b = i;
            this.f4310c = i2;
            this.f4311d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1916b)) {
                return false;
            }
            C1916b bVar = (C1916b) obj;
            return C19383o.m32792b(this.f4308a, bVar.f4308a) && this.f4309b == bVar.f4309b && this.f4310c == bVar.f4310c && C19383o.m32792b(this.f4311d, bVar.f4311d);
        }

        public final int hashCode() {
            T t = this.f4308a;
            return this.f4311d.hashCode() + C0069a.m170a(this.f4310c, C0069a.m170a(this.f4309b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Range(item=");
            h.append(this.f4308a);
            h.append(", start=");
            h.append(this.f4309b);
            h.append(", end=");
            h.append(this.f4310c);
            h.append(", tag=");
            return C0391c.m1057c(h, this.f4311d, ')');
        }

        public C1916b(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1913a(java.lang.String r2, java.util.List r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0006
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x0006:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C1913a.<init>(java.lang.String, java.util.List, int):void");
    }
}
