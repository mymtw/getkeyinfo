package kotlin.jvm.internal;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19283a;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.C19400c;
import kotlin.reflect.C19402e;
import kotlin.reflect.C19421p;
import kotlin.text.C19459m;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19847b;
import p753kq.C19848c;
import p753kq.C19849d;
import p753kq.C19850e;
import p753kq.C19851f;
import p753kq.C19852g;
import p753kq.C19853h;
import p753kq.C19854i;
import p753kq.C19855j;
import p753kq.C19856k;
import p753kq.C19857l;
import p753kq.C19858m;
import p753kq.C19859n;
import p753kq.C19860o;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;
import p753kq.C19864s;
import p753kq.C19865t;
import p753kq.C19866u;
import p753kq.C19867v;
import p753kq.C19868w;

/* renamed from: kotlin.jvm.internal.k */
public final class C19379k implements C19400c<Object>, C19378j {

    /* renamed from: c */
    public static final Map<Class<? extends C19283a<?>>, Integer> f43248c;

    /* renamed from: d */
    public static final HashMap<String, String> f43249d;

    /* renamed from: e */
    public static final LinkedHashMap f43250e;

    /* renamed from: b */
    public final Class<?> f43251b;

    static {
        int i = 0;
        List e0 = C17782b.m29865e0(C19846a.class, C19857l.class, C19861p.class, C19862q.class, C19863r.class, C19864s.class, C19865t.class, C19866u.class, C19867v.class, C19868w.class, C19847b.class, C19848c.class, C19849d.class, C19850e.class, C19851f.class, C19852g.class, C19853h.class, C19854i.class, C19855j.class, C19856k.class, C19858m.class, C19859n.class, C19860o.class);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(e0));
        for (Object next : e0) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        f43248c = C19294b0.m32567x0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C19383o.m32796f(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C19383o.m32796f(str, "kotlinName");
            sb.append(C19459m.m33031D1(str, str));
            sb.append("CompanionObject");
            Pair pair = new Pair(sb.toString(), C0326j.m864i(str, ".Companion"));
            hashMap3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry next2 : f43248c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f43249d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C19421p.m32930T(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(key, C19459m.m33031D1(str2, str2));
        }
        f43250e = linkedHashMap;
    }

    public C19379k(Class<?> cls) {
        C19383o.m32797g(cls, "jClass");
        this.f43251b = cls;
    }

    /* renamed from: a */
    public final Class<?> mo71917a() {
        return this.f43251b;
    }

    /* renamed from: b */
    public final String mo71918b() {
        String str;
        Class<?> cls = this.f43251b;
        C19383o.m32797g(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = f43249d.get(componentType.getName())) != null) {
                str2 = C0326j.m864i(str, "Array");
            }
            return str2 == null ? "kotlin.Array" : str2;
        }
        String str3 = f43249d.get(cls.getName());
        return str3 == null ? cls.getCanonicalName() : str3;
    }

    /* renamed from: c */
    public final String mo71919c() {
        String str;
        Class<?> cls = this.f43251b;
        C19383o.m32797g(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return C19459m.m33030C1(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return C19459m.m33029B1('$', simpleName, simpleName);
                }
                return C19459m.m33030C1(simpleName, enclosingConstructor.getName() + '$', simpleName);
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) f43250e.get(componentType.getName())) != null) {
                    str2 = C0326j.m864i(str, "Array");
                }
                if (str2 == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) f43250e.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
        }
        return str2;
    }

    /* renamed from: d */
    public final Collection<C19402e<Object>> mo71920d() {
        throw new KotlinReflectionNotSupportedError();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19379k) && C19383o.m32792b(C0761x.m1715d0(this), C0761x.m1715d0((C19400c) obj));
    }

    public final int hashCode() {
        return C0761x.m1715d0(this).hashCode();
    }

    public final String toString() {
        return this.f43251b.toString() + " (Kotlin reflection is not available)";
    }
}
