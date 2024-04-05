package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: retrofit2.s */
public class C20138s {

    /* renamed from: c */
    public static final C20138s f44559c = ("Dalvik".equals(System.getProperty("java.vm.name")) ? new C20139a() : new C20138s());

    /* renamed from: a */
    public final boolean f44560a = true;

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f44561b;

    /* renamed from: retrofit2.s$a */
    public static final class C20139a extends C20138s {

        /* renamed from: retrofit2.s$a$a */
        public static final class C20140a implements Executor {

            /* renamed from: b */
            public final Handler f44562b = new Handler(Looper.getMainLooper());

            public final void execute(Runnable runnable) {
                this.f44562b.post(runnable);
            }
        }

        /* renamed from: a */
        public final Executor mo74376a() {
            return new C20140a();
        }

        /* renamed from: b */
        public final Object mo74377b(Class cls, Object obj, Method method, Object... objArr) throws Throwable {
            return C20138s.super.mo74377b(cls, obj, method, objArr);
        }
    }

    public C20138s() {
        Constructor<MethodHandles.Lookup> constructor;
        Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
        try {
            constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            try {
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused2) {
            constructor = null;
        }
        this.f44561b = constructor;
    }

    /* renamed from: a */
    public Executor mo74376a() {
        return null;
    }

    @IgnoreJRERequirement
    /* renamed from: b */
    public Object mo74377b(Class cls, Object obj, Method method, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f44561b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
