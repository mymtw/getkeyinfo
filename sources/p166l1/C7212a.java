package p166l1;

import android.view.Choreographer;
import java.util.ArrayList;
import p193o.C7506i;

/* renamed from: l1.a */
public final class C7212a {

    /* renamed from: g */
    public static final ThreadLocal<C7212a> f16005g = new ThreadLocal<>();

    /* renamed from: a */
    public final C7506i<C7214b, Long> f16006a = new C7506i<>();

    /* renamed from: b */
    public final ArrayList<C7214b> f16007b = new ArrayList<>();

    /* renamed from: c */
    public final C7213a f16008c = new C7213a();

    /* renamed from: d */
    public C7216d f16009d;

    /* renamed from: e */
    public long f16010e = 0;

    /* renamed from: f */
    public boolean f16011f = false;

    /* renamed from: l1.a$a */
    public class C7213a {
        public C7213a() {
        }
    }

    /* renamed from: l1.a$b */
    public interface C7214b {
        /* renamed from: a */
        boolean mo19499a(long j);
    }

    /* renamed from: l1.a$c */
    public static abstract class C7215c {

        /* renamed from: a */
        public final C7213a f16013a;

        public C7215c(C7213a aVar) {
            this.f16013a = aVar;
        }
    }

    /* renamed from: l1.a$d */
    public static class C7216d extends C7215c {

        /* renamed from: b */
        public final Choreographer f16014b = Choreographer.getInstance();

        /* renamed from: c */
        public final C7217a f16015c = new C7217a();

        /* renamed from: l1.a$d$a */
        public class C7217a implements Choreographer.FrameCallback {
            public C7217a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void doFrame(long r10) {
                /*
                    r9 = this;
                    l1.a$d r10 = p166l1.C7212a.C7216d.this
                    l1.a$a r10 = r10.f16013a
                    l1.a r11 = p166l1.C7212a.this
                    long r0 = android.os.SystemClock.uptimeMillis()
                    r11.f16010e = r0
                    l1.a r11 = p166l1.C7212a.this
                    long r0 = r11.f16010e
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r4 = 0
                    r5 = r4
                L_0x0016:
                    java.util.ArrayList<l1.a$b> r6 = r11.f16007b
                    int r6 = r6.size()
                    if (r5 >= r6) goto L_0x004d
                    java.util.ArrayList<l1.a$b> r6 = r11.f16007b
                    java.lang.Object r6 = r6.get(r5)
                    l1.a$b r6 = (p166l1.C7212a.C7214b) r6
                    if (r6 != 0) goto L_0x0029
                    goto L_0x004a
                L_0x0029:
                    o.i<l1.a$b, java.lang.Long> r7 = r11.f16006a
                    r8 = 0
                    java.lang.Object r7 = r7.getOrDefault(r6, r8)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L_0x0035
                    goto L_0x0042
                L_0x0035:
                    long r7 = r7.longValue()
                    int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r7 >= 0) goto L_0x0044
                    o.i<l1.a$b, java.lang.Long> r7 = r11.f16006a
                    r7.remove(r6)
                L_0x0042:
                    r7 = 1
                    goto L_0x0045
                L_0x0044:
                    r7 = r4
                L_0x0045:
                    if (r7 == 0) goto L_0x004a
                    r6.mo19499a(r0)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0016
                L_0x004d:
                    boolean r0 = r11.f16011f
                    if (r0 == 0) goto L_0x006b
                    java.util.ArrayList<l1.a$b> r0 = r11.f16007b
                    int r0 = r0.size()
                L_0x0057:
                    int r0 = r0 + -1
                    if (r0 < 0) goto L_0x0069
                    java.util.ArrayList<l1.a$b> r1 = r11.f16007b
                    java.lang.Object r1 = r1.get(r0)
                    if (r1 != 0) goto L_0x0057
                    java.util.ArrayList<l1.a$b> r1 = r11.f16007b
                    r1.remove(r0)
                    goto L_0x0057
                L_0x0069:
                    r11.f16011f = r4
                L_0x006b:
                    l1.a r11 = p166l1.C7212a.this
                    java.util.ArrayList<l1.a$b> r11 = r11.f16007b
                    int r11 = r11.size()
                    if (r11 <= 0) goto L_0x008d
                    l1.a r10 = p166l1.C7212a.this
                    l1.a$d r11 = r10.f16009d
                    if (r11 != 0) goto L_0x0084
                    l1.a$d r11 = new l1.a$d
                    l1.a$a r0 = r10.f16008c
                    r11.<init>(r0)
                    r10.f16009d = r11
                L_0x0084:
                    l1.a$d r10 = r10.f16009d
                    android.view.Choreographer r11 = r10.f16014b
                    l1.a$d$a r10 = r10.f16015c
                    r11.postFrameCallback(r10)
                L_0x008d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p166l1.C7212a.C7216d.C7217a.doFrame(long):void");
            }
        }

        public C7216d(C7213a aVar) {
            super(aVar);
        }
    }
}
