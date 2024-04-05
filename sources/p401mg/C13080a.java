package p401mg;

import com.appboy.Constants;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p453tf.C13418j;
import p453tf.C13442y;

/* renamed from: mg.a */
public final class C13080a {

    /* renamed from: a */
    public static final Set<Object> f28755a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static boolean f28756b;

    /* renamed from: a */
    public static final void m20761a(Object obj, Throwable th) {
        C19383o.m32797g(obj, "o");
        if (f28756b) {
            f28755a.add(obj);
            String str = C13418j.f29381a;
            if (C13442y.m21140c()) {
                C19421p.m32918F(th);
                InstrumentData.Type type = InstrumentData.Type.CrashShield;
                C19383o.m32797g(type, Constants.APPBOY_PUSH_TITLE_KEY);
                new InstrumentData(th, type).mo39442b();
            }
        }
    }

    /* renamed from: b */
    public static final boolean m20762b(Object obj) {
        C19383o.m32797g(obj, "o");
        return f28755a.contains(obj);
    }
}
