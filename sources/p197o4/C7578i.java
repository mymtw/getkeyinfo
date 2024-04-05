package p197o4;

import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o4.i */
public final class C7578i implements C7576g {

    /* renamed from: b */
    public final Map<String, List<C7577h>> f16838b;

    /* renamed from: c */
    public volatile Map<String, String> f16839c;

    /* renamed from: o4.i$a */
    public static final class C7579a {

        /* renamed from: b */
        public static final Map<String, List<C7577h>> f16840b;

        /* renamed from: a */
        public Map<String, List<C7577h>> f16841a = f16840b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append(RFC1522Codec.SEP);
                    }
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new C7580b(property)));
            }
            f16840b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: o4.i$b */
    public static final class C7580b implements C7577h {

        /* renamed from: a */
        public final String f16842a;

        public C7580b(String str) {
            this.f16842a = str;
        }

        /* renamed from: a */
        public final String mo20014a() {
            return this.f16842a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C7580b) {
                return this.f16842a.equals(((C7580b) obj).f16842a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16842a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StringHeaderFactory{value='");
            h.append(this.f16842a);
            h.append('\'');
            h.append('}');
            return h.toString();
        }
    }

    public C7578i(Map<String, List<C7577h>> map) {
        this.f16838b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final Map<String, String> mo20013a() {
        if (this.f16839c == null) {
            synchronized (this) {
                if (this.f16839c == null) {
                    this.f16839c = Collections.unmodifiableMap(mo20015b());
                }
            }
        }
        return this.f16839c;
    }

    /* renamed from: b */
    public final HashMap mo20015b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f16838b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String a = ((C7577h) list.get(i)).mo20014a();
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7578i) {
            return this.f16838b.equals(((C7578i) obj).f16838b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16838b.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LazyHeaders{headers=");
        h.append(this.f16838b);
        h.append('}');
        return h.toString();
    }
}
