package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p766qq.C20069a;

final class FlowKt__DelayKt$debounce$3 extends Lambda implements C19857l<Object, Long> {
    public final /* synthetic */ C19857l<Object, C20069a> $timeout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$3(C19857l<Object, C20069a> lVar) {
        super(1);
        this.$timeout = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((!(0 == p766qq.C20069a.f44448b || 0 == p766qq.C20069a.f44449c)) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long invoke(java.lang.Object r8) {
        /*
            r7 = this;
            kq.l<java.lang.Object, qq.a> r0 = r7.$timeout
            java.lang.Object r8 = r0.invoke(r8)
            qq.a r8 = (p766qq.C20069a) r8
            r8.getClass()
            int r8 = p766qq.C20069a.m34332a()
            r0 = 0
            if (r8 <= 0) goto L_0x0070
            int r8 = (int) r0
            r2 = 1
            r8 = r8 & r2
            r3 = 0
            if (r8 != r2) goto L_0x001b
            r4 = r2
            goto L_0x001c
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r4 == 0) goto L_0x0032
            long r4 = p766qq.C20069a.f44448b
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x002d
            long r4 = p766qq.C20069a.f44449c
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r4 = r3
            goto L_0x002e
        L_0x002d:
            r4 = r2
        L_0x002e:
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0032
            goto L_0x0069
        L_0x0032:
            kotlin.time.DurationUnit r4 = kotlin.time.DurationUnit.MILLISECONDS
            java.lang.String r5 = "unit"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            long r5 = p766qq.C20069a.f44448b
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0045
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0069
        L_0x0045:
            long r5 = p766qq.C20069a.f44449c
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x004e
            r0 = -9223372036854775808
            goto L_0x0069
        L_0x004e:
            if (r8 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = r3
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            kotlin.time.DurationUnit r8 = kotlin.time.DurationUnit.NANOSECONDS
            goto L_0x0058
        L_0x0057:
            r8 = r4
        L_0x0058:
            java.lang.String r2 = "sourceUnit"
            kotlin.jvm.internal.C19383o.m32797g(r8, r2)
            java.util.concurrent.TimeUnit r2 = r4.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r8 = r8.getTimeUnit$kotlin_stdlib()
            long r0 = r2.convert(r0, r8)
        L_0x0069:
            r2 = 1
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0070
            r0 = r2
        L_0x0070:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3.invoke(java.lang.Object):java.lang.Long");
    }
}
