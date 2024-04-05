package p750jq;

import kotlin.random.C19396b;
import kotlin.random.Random;
import p748iq.C19260a;
import p761oq.C20021a;

/* renamed from: jq.a */
public class C19278a extends C19260a {

    /* renamed from: jq.a$a */
    public static final class C19279a {

        /* renamed from: a */
        public static final Integer f43146a;

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
                f43146a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p750jq.C19278a.C19279a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final Random mo70555b() {
        Integer num = C19279a.f43146a;
        return num == null || num.intValue() >= 24 ? new C20021a() : new C19396b();
    }
}
