package p476wf;

import android.hardware.SensorManager;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p401mg.C13080a;

/* renamed from: wf.c */
public final class C13838c {

    /* renamed from: a */
    public static final ViewIndexingTrigger f30456a = new ViewIndexingTrigger();

    /* renamed from: b */
    public static SensorManager f30457b;

    /* renamed from: c */
    public static C13841f f30458c;

    /* renamed from: d */
    public static String f30459d;

    /* renamed from: e */
    public static final AtomicBoolean f30460e = new AtomicBoolean(true);

    /* renamed from: f */
    public static final AtomicBoolean f30461f = new AtomicBoolean(false);

    /* renamed from: g */
    public static volatile boolean f30462g;

    static {
        new C13838c();
    }

    /* renamed from: a */
    public static final String m21378a() {
        Class<C13838c> cls = C13838c.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            if (f30459d == null) {
                f30459d = UUID.randomUUID().toString();
            }
            String str = f30459d;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }
}
