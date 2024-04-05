package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.lifecycle.k0 */
public final class C2870k0 {

    /* renamed from: a */
    public final C2878l0 f6510a;

    /* renamed from: b */
    public final C2872b f6511b;

    /* renamed from: androidx.lifecycle.k0$a */
    public static class C2871a extends C2874d {

        /* renamed from: b */
        public static C2871a f6512b;

        /* renamed from: a */
        public final Application f6513a;

        public C2871a(Application application) {
            C19383o.m32797g(application, "application");
            this.f6513a = application;
        }

        public final <T extends C2866i0> T create(Class<T> cls) {
            C19383o.m32797g(cls, "modelClass");
            if (!C2842a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                T t = (C2866i0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f6513a});
                C19383o.m32796f(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(C19383o.m32802l(cls, "Cannot create an instance of "), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(C19383o.m32802l(cls, "Cannot create an instance of "), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(C19383o.m32802l(cls, "Cannot create an instance of "), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(C19383o.m32802l(cls, "Cannot create an instance of "), e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.k0$b */
    public interface C2872b {
        <T extends C2866i0> T create(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.k0$c */
    public static abstract class C2873c extends C2876e implements C2872b {
        /* renamed from: b */
        public abstract C2866i0 mo10817b(Class cls, String str);

        public <T extends C2866i0> T create(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }
    }

    /* renamed from: androidx.lifecycle.k0$d */
    public static class C2874d implements C2872b {
        public static final C2875a Companion = new C2875a();
        /* access modifiers changed from: private */
        public static C2874d sInstance;

        /* renamed from: androidx.lifecycle.k0$d$a */
        public static final class C2875a {
        }

        public static final C2874d getInstance() {
            Companion.getClass();
            if (sInstance == null) {
                sInstance = new C2874d();
            }
            C2874d access$getSInstance$cp = sInstance;
            C19383o.m32794d(access$getSInstance$cp);
            return access$getSInstance$cp;
        }

        public <T extends C2866i0> T create(Class<T> cls) {
            C19383o.m32797g(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                C19383o.m32796f(newInstance, "{\n                modelC…wInstance()\n            }");
                return (C2866i0) newInstance;
            } catch (InstantiationException e) {
                throw new RuntimeException(C19383o.m32802l(cls, "Cannot create an instance of "), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(C19383o.m32802l(cls, "Cannot create an instance of "), e2);
            }
        }
    }

    /* renamed from: androidx.lifecycle.k0$e */
    public static class C2876e {
        /* renamed from: a */
        public void mo10816a(C2866i0 i0Var) {
        }
    }

    public C2870k0(C2878l0 l0Var, C2872b bVar) {
        C19383o.m32797g(l0Var, "store");
        C19383o.m32797g(bVar, "factory");
        this.f6510a = l0Var;
        this.f6511b = bVar;
    }

    /* renamed from: a */
    public final <T extends C2866i0> T mo10829a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo10830b(cls, C19383o.m32802l(canonicalName, "androidx.lifecycle.ViewModelProvider.DefaultKey:"));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public final C2866i0 mo10830b(Class cls, String str) {
        C19383o.m32797g(str, "key");
        C2866i0 i0Var = this.f6510a.f6514a.get(str);
        if (cls.isInstance(i0Var)) {
            C2872b bVar = this.f6511b;
            C2876e eVar = bVar instanceof C2876e ? (C2876e) bVar : null;
            if (eVar != null) {
                C19383o.m32796f(i0Var, "viewModel");
                eVar.mo10816a(i0Var);
            }
            if (i0Var != null) {
                return i0Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        C2872b bVar2 = this.f6511b;
        C2866i0 b = bVar2 instanceof C2873c ? ((C2873c) bVar2).mo10817b(cls, str) : bVar2.create(cls);
        C2866i0 put = this.f6510a.f6514a.put(str, b);
        if (put != null) {
            put.onCleared();
        }
        C19383o.m32796f(b, "viewModel");
        return b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2870k0(androidx.lifecycle.C2880m0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            androidx.lifecycle.l0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            boolean r1 = r3 instanceof androidx.lifecycle.C2881n
            if (r1 == 0) goto L_0x001e
            androidx.lifecycle.n r3 = (androidx.lifecycle.C2881n) r3
            androidx.lifecycle.k0$b r3 = r3.getDefaultViewModelProviderFactory()
            java.lang.String r1 = "owner.defaultViewModelProviderFactory"
            kotlin.jvm.internal.C19383o.m32796f(r3, r1)
            goto L_0x0038
        L_0x001e:
            androidx.lifecycle.k0$d$a r3 = androidx.lifecycle.C2870k0.C2874d.Companion
            r3.getClass()
            androidx.lifecycle.k0$d r3 = androidx.lifecycle.C2870k0.C2874d.sInstance
            if (r3 != 0) goto L_0x0031
            androidx.lifecycle.k0$d r3 = new androidx.lifecycle.k0$d
            r3.<init>()
            androidx.lifecycle.C2870k0.C2874d.sInstance = r3
        L_0x0031:
            androidx.lifecycle.k0$d r3 = androidx.lifecycle.C2870k0.C2874d.sInstance
            kotlin.jvm.internal.C19383o.m32794d(r3)
        L_0x0038:
            r2.<init>((androidx.lifecycle.C2878l0) r0, (androidx.lifecycle.C2870k0.C2872b) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2870k0.<init>(androidx.lifecycle.m0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2870k0(androidx.lifecycle.C2880m0 r2, androidx.lifecycle.C2870k0.C2872b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            androidx.lifecycle.l0 r2 = r2.getViewModelStore()
            java.lang.String r0 = "owner.viewModelStore"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            r1.<init>((androidx.lifecycle.C2878l0) r2, (androidx.lifecycle.C2870k0.C2872b) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2870k0.<init>(androidx.lifecycle.m0, androidx.lifecycle.k0$b):void");
    }
}
