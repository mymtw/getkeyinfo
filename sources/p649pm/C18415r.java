package p649pm;

import androidx.preference.C3039b;
import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p706wm.C18751c;
import p722ym.C18895a;

/* renamed from: pm.r */
public final class C18415r extends C3039b {

    /* renamed from: c */
    public final Set<Class<?>> f40502c;

    /* renamed from: d */
    public final Set<Class<?>> f40503d;

    /* renamed from: e */
    public final Set<Class<?>> f40504e;

    /* renamed from: f */
    public final Set<Class<?>> f40505f;

    /* renamed from: g */
    public final Set<Class<?>> f40506g;

    /* renamed from: h */
    public final Set<Class<?>> f40507h;

    /* renamed from: i */
    public final C18398c f40508i;

    /* renamed from: pm.r$a */
    public static class C18416a implements C18751c {

        /* renamed from: a */
        public final Set<Class<?>> f40509a;

        /* renamed from: b */
        public final C18751c f40510b;

        public C18416a(Set<Class<?>> set, C18751c cVar) {
            this.f40509a = set;
            this.f40510b = cVar;
        }
    }

    public C18415r(C18396b bVar, C18405j jVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C18409l next : bVar.f40461b) {
            int i = next.f40489c;
            boolean z = true;
            if (i == 0) {
                if (next.f40488b != 2 ? false : z) {
                    hashSet4.add(next.f40487a);
                } else {
                    hashSet.add(next.f40487a);
                }
            } else {
                if (i == 2) {
                    hashSet3.add(next.f40487a);
                } else {
                    if (next.f40488b != 2 ? false : z) {
                        hashSet5.add(next.f40487a);
                    } else {
                        hashSet2.add(next.f40487a);
                    }
                }
            }
        }
        if (!bVar.f40465f.isEmpty()) {
            hashSet.add(C18751c.class);
        }
        this.f40502c = Collections.unmodifiableSet(hashSet);
        this.f40503d = Collections.unmodifiableSet(hashSet2);
        this.f40504e = Collections.unmodifiableSet(hashSet3);
        this.f40505f = Collections.unmodifiableSet(hashSet4);
        this.f40506g = Collections.unmodifiableSet(hashSet5);
        this.f40507h = bVar.f40465f;
        this.f40508i = jVar;
    }

    /* renamed from: a */
    public final <T> C18895a<Set<T>> mo69937a(Class<T> cls) {
        if (this.f40506g.contains(cls)) {
            return this.f40508i.mo69937a(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public final <T> Set<T> mo11180c(Class<T> cls) {
        if (this.f40505f.contains(cls)) {
            return this.f40508i.mo11180c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public final <T> C18895a<T> mo69938d(Class<T> cls) {
        if (this.f40503d.contains(cls)) {
            return this.f40508i.mo69938d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public final <T> T get(Class<T> cls) {
        if (this.f40502c.contains(cls)) {
            T t = this.f40508i.get(cls);
            return !cls.equals(C18751c.class) ? t : new C18416a(this.f40507h, (C18751c) t);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }
}
