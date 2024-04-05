package p136i2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.etsy.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p176m2.C7312a;

/* renamed from: i2.a */
public final class C6983a {

    /* renamed from: d */
    public static volatile C6983a f15470d;

    /* renamed from: e */
    public static final Object f15471e = new Object();

    /* renamed from: a */
    public final HashMap f15472a = new HashMap();

    /* renamed from: b */
    public final HashSet f15473b = new HashSet();

    /* renamed from: c */
    public final Context f15474c;

    public C6983a(Context context) {
        this.f15474c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C6983a m13524c(Context context) {
        if (f15470d == null) {
            synchronized (f15471e) {
                if (f15470d == null) {
                    f15470d = new C6983a(context);
                }
            }
        }
        return f15470d;
    }

    /* renamed from: a */
    public final void mo19152a(Bundle bundle) {
        String string = this.f15474c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C6984b.class.isAssignableFrom(cls)) {
                            this.f15473b.add(cls);
                        }
                    }
                }
                Iterator it = this.f15473b.iterator();
                while (it.hasNext()) {
                    mo19153b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public final Object mo19153b(Class cls, HashSet hashSet) {
        Object obj;
        if (C7312a.m14027a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!this.f15472a.containsKey(cls)) {
                hashSet.add(cls);
                C6984b bVar = (C6984b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C6984b<?>>> a = bVar.mo10023a();
                if (!a.isEmpty()) {
                    for (Class next : a) {
                        if (!this.f15472a.containsKey(next)) {
                            mo19153b(next, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f15474c);
                hashSet.remove(cls);
                this.f15472a.put(cls, obj);
            } else {
                obj = this.f15472a.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
