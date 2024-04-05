package androidx.compose.p015ui.graphics;

import kotlin.jvm.internal.C19383o;
import p288y.C8345d;
import p288y.C8346e;

/* renamed from: androidx.compose.ui.graphics.z */
public abstract class C1606z {

    /* renamed from: androidx.compose.ui.graphics.z$a */
    public static final class C1607a extends C1606z {

        /* renamed from: a */
        public final C1492b0 f3571a;

        public C1607a(C1521g gVar) {
            this.f3571a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1607a) && C19383o.m32792b(this.f3571a, ((C1607a) obj).f3571a);
        }

        public final int hashCode() {
            return this.f3571a.hashCode();
        }
    }

    /* renamed from: androidx.compose.ui.graphics.z$b */
    public static final class C1608b extends C1606z {

        /* renamed from: a */
        public final C8345d f3572a;

        public C1608b(C8345d dVar) {
            this.f3572a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1608b) && C19383o.m32792b(this.f3572a, ((C1608b) obj).f3572a);
        }

        public final int hashCode() {
            return this.f3572a.hashCode();
        }
    }

    /* renamed from: androidx.compose.ui.graphics.z$c */
    public static final class C1609c extends C1606z {

        /* renamed from: a */
        public final C8346e f3573a;

        /* renamed from: b */
        public final C1521g f3574b;

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1609c(p288y.C8346e r7) {
            /*
                r6 = this;
                r6.<init>()
                r6.f3573a = r7
                long r0 = r7.f18312h
                float r0 = p288y.C8341a.m16635b(r0)
                long r1 = r7.f18311g
                float r1 = p288y.C8341a.m16635b(r1)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0019
                r0 = r1
                goto L_0x001a
            L_0x0019:
                r0 = r2
            L_0x001a:
                if (r0 == 0) goto L_0x0048
                long r3 = r7.f18311g
                float r0 = p288y.C8341a.m16635b(r3)
                long r3 = r7.f18310f
                float r3 = p288y.C8341a.m16635b(r3)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x002e
                r0 = r1
                goto L_0x002f
            L_0x002e:
                r0 = r2
            L_0x002f:
                if (r0 == 0) goto L_0x0048
                long r3 = r7.f18310f
                float r0 = p288y.C8341a.m16635b(r3)
                long r3 = r7.f18309e
                float r3 = p288y.C8341a.m16635b(r3)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x0043
                r0 = r1
                goto L_0x0044
            L_0x0043:
                r0 = r2
            L_0x0044:
                if (r0 == 0) goto L_0x0048
                r0 = r1
                goto L_0x0049
            L_0x0048:
                r0 = r2
            L_0x0049:
                long r3 = r7.f18312h
                float r3 = p288y.C8341a.m16636c(r3)
                long r4 = r7.f18311g
                float r4 = p288y.C8341a.m16636c(r4)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x005b
                r3 = r1
                goto L_0x005c
            L_0x005b:
                r3 = r2
            L_0x005c:
                if (r3 == 0) goto L_0x008a
                long r3 = r7.f18311g
                float r3 = p288y.C8341a.m16636c(r3)
                long r4 = r7.f18310f
                float r4 = p288y.C8341a.m16636c(r4)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x0070
                r3 = r1
                goto L_0x0071
            L_0x0070:
                r3 = r2
            L_0x0071:
                if (r3 == 0) goto L_0x008a
                long r3 = r7.f18310f
                float r3 = p288y.C8341a.m16636c(r3)
                long r4 = r7.f18309e
                float r4 = p288y.C8341a.m16636c(r4)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x0085
                r3 = r1
                goto L_0x0086
            L_0x0085:
                r3 = r2
            L_0x0086:
                if (r3 == 0) goto L_0x008a
                r3 = r1
                goto L_0x008b
            L_0x008a:
                r3 = r2
            L_0x008b:
                if (r0 == 0) goto L_0x0090
                if (r3 == 0) goto L_0x0090
                goto L_0x0091
            L_0x0090:
                r1 = r2
            L_0x0091:
                if (r1 != 0) goto L_0x009b
                androidx.compose.ui.graphics.g r0 = p628nj.C18263b.m30838d()
                r0.mo6277d(r7)
                goto L_0x009c
            L_0x009b:
                r0 = 0
            L_0x009c:
                r6.f3574b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.C1606z.C1609c.<init>(y.e):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1609c) && C19383o.m32792b(this.f3573a, ((C1609c) obj).f3573a);
        }

        public final int hashCode() {
            return this.f3573a.hashCode();
        }
    }
}
