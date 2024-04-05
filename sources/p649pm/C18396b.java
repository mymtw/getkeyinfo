package p649pm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pm.b */
public final class C18396b<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f40460a;

    /* renamed from: b */
    public final Set<C18409l> f40461b;

    /* renamed from: c */
    public final int f40462c;

    /* renamed from: d */
    public final int f40463d;

    /* renamed from: e */
    public final C18400e<T> f40464e;

    /* renamed from: f */
    public final Set<Class<?>> f40465f;

    /* renamed from: pm.b$a */
    public static class C18397a<T> {

        /* renamed from: a */
        public final HashSet f40466a;

        /* renamed from: b */
        public final HashSet f40467b = new HashSet();

        /* renamed from: c */
        public int f40468c;

        /* renamed from: d */
        public int f40469d;

        /* renamed from: e */
        public C18400e<T> f40470e;

        /* renamed from: f */
        public HashSet f40471f;

        public C18397a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f40466a = hashSet;
            int i = 0;
            this.f40468c = 0;
            this.f40469d = 0;
            this.f40471f = new HashSet();
            hashSet.add(cls);
            int length = clsArr.length;
            while (i < length) {
                if (clsArr[i] != null) {
                    i++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(this.f40466a, clsArr);
        }

        /* renamed from: a */
        public final void mo69934a(C18409l lVar) {
            if (!this.f40466a.contains(lVar.f40487a)) {
                this.f40467b.add(lVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public final C18396b<T> mo69935b() {
            if (this.f40470e != null) {
                return new C18396b(new HashSet(this.f40466a), new HashSet(this.f40467b), this.f40468c, this.f40469d, this.f40470e, this.f40471f);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: c */
        public final void mo69936c(int i) {
            if (this.f40468c == 0) {
                this.f40468c = i;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public C18396b() {
        throw null;
    }

    public C18396b(HashSet hashSet, HashSet hashSet2, int i, int i2, C18400e eVar, HashSet hashSet3) {
        this.f40460a = Collections.unmodifiableSet(hashSet);
        this.f40461b = Collections.unmodifiableSet(hashSet2);
        this.f40462c = i;
        this.f40463d = i2;
        this.f40464e = eVar;
        this.f40465f = Collections.unmodifiableSet(hashSet3);
    }

    /* renamed from: a */
    public static <T> C18397a<T> m31103a(Class<T> cls) {
        return new C18397a<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C18396b<T> m31104b(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            if (clsArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, clsArr);
        return new C18396b(new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C18395a(t), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f40460a.toArray()) + ">{" + this.f40462c + ", type=" + this.f40463d + ", deps=" + Arrays.toString(this.f40461b.toArray()) + "}";
    }
}
