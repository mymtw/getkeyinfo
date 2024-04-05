package p030bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.C19383o;

/* renamed from: bo.app.r3 */
public final class C4138r3 {
    /* renamed from: a */
    public static final BigDecimal m9508a(BigDecimal bigDecimal) {
        C19383o.m32797g(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        C19383o.m32796f(scale, "this.setScale(2, RoundingMode.HALF_UP)");
        return scale;
    }
}
