package p748iq;

import kotlin.jvm.internal.C19383o;
import p746hq.C19065a;

/* renamed from: iq.a */
public class C19260a extends C19065a {

    /* renamed from: iq.a$a */
    public static final class C19261a {

        /* renamed from: a */
        public static final Integer f43125a;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0018 }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x0018 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0018 }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0018
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0018 }
                goto L_0x0019
            L_0x0018:
                r1 = r0
            L_0x0019:
                if (r1 == 0) goto L_0x0027
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x0023
                r2 = 1
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                if (r2 == 0) goto L_0x0027
                r0 = r1
            L_0x0027:
                f43125a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p748iq.C19260a.C19261a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo70554a(Throwable th, Throwable th2) {
        C19383o.m32797g(th, "cause");
        C19383o.m32797g(th2, "exception");
        Integer num = C19261a.f43125a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.mo70554a(th, th2);
        }
    }
}
