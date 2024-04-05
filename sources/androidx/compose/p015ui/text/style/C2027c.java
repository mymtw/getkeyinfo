package androidx.compose.p015ui.text.style;

import android.support.p013v4.media.C0072d;

/* renamed from: androidx.compose.ui.text.style.c */
public final class C2027c {

    /* renamed from: c */
    public static final C2027c f4605c = new C2027c(C2028a.f4609b);

    /* renamed from: a */
    public final int f4606a;

    /* renamed from: b */
    public final int f4607b = 17;

    /* renamed from: androidx.compose.ui.text.style.c$a */
    public static final class C2028a {

        /* renamed from: a */
        public static final int f4608a = 50;

        /* renamed from: b */
        public static final int f4609b = -1;

        /* renamed from: c */
        public static final int f4610c = 100;

        static {
            m4480a(0);
            m4480a(50);
            m4480a(-1);
            m4480a(100);
        }

        /* renamed from: a */
        public static void m4480a(int i) {
            boolean z = true;
            if (!(i >= 0 && i < 101) && i != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
            }
        }
    }

    public C2027c(int i) {
        this.f4606a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2027c)) {
            return false;
        }
        int i = this.f4606a;
        C2027c cVar = (C2027c) obj;
        int i2 = cVar.f4606a;
        int i3 = C2028a.f4608a;
        if (!(i == i2)) {
            return false;
        }
        return this.f4607b == cVar.f4607b;
    }

    public final int hashCode() {
        int i = this.f4606a;
        int i2 = C2028a.f4608a;
        return Integer.hashCode(this.f4607b) + (Integer.hashCode(i) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder h = C0072d.m201h("LineHeightStyle(alignment=");
        int i = this.f4606a;
        if (i == 0) {
            int i2 = C2028a.f4608a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (i == C2028a.f4608a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (i == C2028a.f4609b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (i == C2028a.f4610c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + i + ')';
        }
        h.append(str);
        h.append(", trim=");
        int i3 = this.f4607b;
        h.append(i3 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i3 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i3 == 17 ? "LineHeightStyle.Trim.Both" : i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid");
        h.append(')');
        return h.toString();
    }
}
