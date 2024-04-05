package p414oe;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;

/* renamed from: oe.a */
public final class C13162a {

    /* renamed from: a */
    public final BigDecimal f28949a;

    /* renamed from: b */
    public final BigDecimal f28950b;

    /* renamed from: c */
    public final String f28951c;

    /* renamed from: d */
    public final String f28952d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13162a(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, int i) {
        this(bigDecimal, (i & 2) != 0 ? null : bigDecimal2, str, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13162a)) {
            return false;
        }
        C13162a aVar = (C13162a) obj;
        return C19383o.m32792b(this.f28949a, aVar.f28949a) && C19383o.m32792b(this.f28950b, aVar.f28950b) && C19383o.m32792b(this.f28951c, aVar.f28951c) && C19383o.m32792b(this.f28952d, aVar.f28952d);
    }

    public final int hashCode() {
        int hashCode = this.f28949a.hashCode() * 31;
        BigDecimal bigDecimal = this.f28950b;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f28951c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28952d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceBucket(min=");
        h.append(this.f28949a);
        h.append(", max=");
        h.append(this.f28950b);
        h.append(", minWithCurrency=");
        h.append(this.f28951c);
        h.append(", maxWithCurrency=");
        return C0391c.m1057c(h, this.f28952d, ')');
    }

    public C13162a(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2) {
        this.f28949a = bigDecimal;
        this.f28950b = bigDecimal2;
        this.f28951c = str;
        this.f28952d = str2;
    }
}
