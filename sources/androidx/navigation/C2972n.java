package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.C0326j;
import java.io.Serializable;
import p003a2.C0023f;

/* renamed from: androidx.navigation.n */
public abstract class C2972n<T> {

    /* renamed from: b */
    public static final C2975c f6756b = new C2975c();

    /* renamed from: c */
    public static final C2976d f6757c = new C2976d();

    /* renamed from: d */
    public static final C2977e f6758d = new C2977e();

    /* renamed from: e */
    public static final C2978f f6759e = new C2978f();

    /* renamed from: f */
    public static final C2979g f6760f = new C2979g();

    /* renamed from: g */
    public static final C2980h f6761g = new C2980h();

    /* renamed from: h */
    public static final C2981i f6762h = new C2981i();

    /* renamed from: i */
    public static final C2982j f6763i = new C2982j();

    /* renamed from: j */
    public static final C2983k f6764j = new C2983k();

    /* renamed from: k */
    public static final C2973a f6765k = new C2973a();

    /* renamed from: l */
    public static final C2974b f6766l = new C2974b();

    /* renamed from: a */
    public final boolean f6767a;

    /* renamed from: androidx.navigation.n$a */
    public class C2973a extends C2972n<String> {
        public C2973a() {
            super(true);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "string";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            return str;
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: androidx.navigation.n$b */
    public class C2974b extends C2972n<String[]> {
        public C2974b() {
            super(true);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "string[]";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    /* renamed from: androidx.navigation.n$c */
    public class C2975c extends C2972n<Integer> {
        public C2975c() {
            super(false);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "integer";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: androidx.navigation.n$d */
    public class C2976d extends C2972n<Integer> {
        public C2976d() {
            super(false);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "reference";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: androidx.navigation.n$e */
    public class C2977e extends C2972n<int[]> {
        public C2977e() {
            super(true);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "integer[]";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    /* renamed from: androidx.navigation.n$f */
    public class C2978f extends C2972n<Long> {
        public C2978f() {
            super(false);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "long";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return str.startsWith("0x") ? Long.valueOf(Long.parseLong(str.substring(2), 16)) : Long.valueOf(Long.parseLong(str));
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: androidx.navigation.n$g */
    public class C2979g extends C2972n<long[]> {
        public C2979g() {
            super(true);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "long[]";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    /* renamed from: androidx.navigation.n$h */
    public class C2980h extends C2972n<Float> {
        public C2980h() {
            super(false);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "float";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        }
    }

    /* renamed from: androidx.navigation.n$i */
    public class C2981i extends C2972n<float[]> {
        public C2981i() {
            super(true);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "float[]";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    /* renamed from: androidx.navigation.n$j */
    public class C2982j extends C2972n<Boolean> {
        public C2982j() {
            super(false);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "boolean";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: androidx.navigation.n$k */
    public class C2983k extends C2972n<boolean[]> {
        public C2983k() {
            super(true);
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return "boolean[]";
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    /* renamed from: androidx.navigation.n$l */
    public static final class C2984l<D extends Enum> extends C2988p<D> {

        /* renamed from: n */
        public final Class<D> f6768n;

        public C2984l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f6768n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        /* renamed from: b */
        public final String mo10982b() {
            return this.f6768n.getName();
        }

        /* renamed from: f */
        public final D mo10986e(String str) {
            for (D d : (Enum[]) this.f6768n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException(C0326j.m863h(this.f6768n, C0023f.m111l("Enum value ", str, " not found for type "), "."));
        }
    }

    /* renamed from: androidx.navigation.n$m */
    public static final class C2985m<D extends Parcelable> extends C2972n<D[]> {

        /* renamed from: m */
        public final Class<D[]> f6769m;

        public C2985m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f6769m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return this.f6769m.getName();
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f6769m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2985m.class != obj.getClass()) {
                return false;
            }
            return this.f6769m.equals(((C2985m) obj).f6769m);
        }

        public final int hashCode() {
            return this.f6769m.hashCode();
        }
    }

    /* renamed from: androidx.navigation.n$n */
    public static final class C2986n<D> extends C2972n<D> {

        /* renamed from: m */
        public final Class<D> f6770m;

        public C2986n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f6770m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        /* renamed from: a */
        public final D mo10981a(Bundle bundle, String str) {
            return bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return this.f6770m.getName();
        }

        /* renamed from: c */
        public final D mo10983c(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            this.f6770m.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2986n.class != obj.getClass()) {
                return false;
            }
            return this.f6770m.equals(((C2986n) obj).f6770m);
        }

        public final int hashCode() {
            return this.f6770m.hashCode();
        }
    }

    /* renamed from: androidx.navigation.n$o */
    public static final class C2987o<D extends Serializable> extends C2972n<D[]> {

        /* renamed from: m */
        public final Class<D[]> f6771m;

        public C2987o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f6771m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: b */
        public final String mo10982b() {
            return this.f6771m.getName();
        }

        /* renamed from: c */
        public final Object mo10983c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            ? r3 = (Serializable[]) obj;
            this.f6771m.cast(r3);
            bundle.putSerializable(str, r3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2987o.class != obj.getClass()) {
                return false;
            }
            return this.f6771m.equals(((C2987o) obj).f6771m);
        }

        public final int hashCode() {
            return this.f6771m.hashCode();
        }
    }

    public C2972n(boolean z) {
        this.f6767a = z;
    }

    /* renamed from: a */
    public abstract T mo10981a(Bundle bundle, String str);

    /* renamed from: b */
    public abstract String mo10982b();

    /* renamed from: c */
    public abstract T mo10983c(String str);

    /* renamed from: d */
    public abstract void mo10984d(Bundle bundle, Object obj, String str);

    public final String toString() {
        return mo10982b();
    }

    /* renamed from: androidx.navigation.n$p */
    public static class C2988p<D extends Serializable> extends C2972n<D> {

        /* renamed from: m */
        public final Class<D> f6772m;

        public C2988p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f6772m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        /* renamed from: a */
        public final Object mo10981a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        /* renamed from: b */
        public String mo10982b() {
            return this.f6772m.getName();
        }

        /* renamed from: d */
        public final void mo10984d(Bundle bundle, Object obj, String str) {
            Serializable serializable = (Serializable) obj;
            this.f6772m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* renamed from: e */
        public D mo10983c(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2988p)) {
                return false;
            }
            return this.f6772m.equals(((C2988p) obj).f6772m);
        }

        public final int hashCode() {
            return this.f6772m.hashCode();
        }

        public C2988p(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f6772m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
