package p768rq;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C19737u;

/* renamed from: rq.j */
public final class C20161j {

    /* renamed from: a */
    public static final long f44642a = C0761x.m1680M0(100000, 1, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");

    /* renamed from: b */
    public static final int f44643b;

    /* renamed from: c */
    public static final int f44644c = C0761x.m1682N0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: d */
    public static final long f44645d = TimeUnit.SECONDS.toNanos(C0761x.m1680M0(60, 1, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));

    /* renamed from: e */
    public static C20155d f44646e = C20155d.f44636e;

    /* renamed from: f */
    public static final C20159h f44647f = new C20159h(0);

    /* renamed from: g */
    public static final C20159h f44648g = new C20159h(1);

    static {
        int i = C19737u.f43688a;
        if (i < 2) {
            i = 2;
        }
        f44643b = C0761x.m1682N0("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
    }
}
