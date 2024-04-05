package p491ye;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.user.inappnotifications.tooltips.IANTooltipDismissType;
import kotlin.jvm.internal.C19383o;

/* renamed from: ye.b */
public abstract class C13916b {

    /* renamed from: ye.b$a */
    public static final class C13917a extends C13916b {

        /* renamed from: a */
        public final String f30579a;

        /* renamed from: b */
        public final IANTooltipDismissType f30580b;

        public C13917a(String str, IANTooltipDismissType iANTooltipDismissType) {
            C19383o.m32797g(iANTooltipDismissType, "dismissType");
            this.f30579a = str;
            this.f30580b = iANTooltipDismissType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13917a)) {
                return false;
            }
            C13917a aVar = (C13917a) obj;
            return C19383o.m32792b(this.f30579a, aVar.f30579a) && this.f30580b == aVar.f30580b;
        }

        public final int hashCode() {
            String str = this.f30579a;
            return this.f30580b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Dismiss(tooltipType=");
            h.append(this.f30579a);
            h.append(", dismissType=");
            h.append(this.f30580b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: ye.b$b */
    public static final class C13918b extends C13916b {

        /* renamed from: a */
        public final String f30581a;

        public C13918b(String str) {
            this.f30581a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13918b) && C19383o.m32792b(this.f30581a, ((C13918b) obj).f30581a);
        }

        public final int hashCode() {
            String str = this.f30581a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Tooltip(tooltipType="), this.f30581a, ')');
        }
    }
}
