package p715xn;

import androidx.compose.foundation.layout.C0761x;
import kotlinx.coroutines.C19543e0;

/* renamed from: xn.h */
public final class C18827h extends C19543e0 {
    /* renamed from: L */
    public final int mo70277L(StringBuilder sb, char c) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C0761x.m1725h0(c);
            throw null;
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* renamed from: Q */
    public final int mo70278Q() {
        return 3;
    }

    /* renamed from: W */
    public final void mo70279W(C18823d dVar, StringBuilder sb) {
        dVar.mo70271d(dVar.mo70268a());
        int a = dVar.f41680h.f41688b - dVar.mo70268a();
        dVar.f41678f -= sb.length();
        if ((dVar.f41673a.length() - dVar.f41681i) - dVar.f41678f > 1 || a > 1 || (dVar.f41673a.length() - dVar.f41681i) - dVar.f41678f != a) {
            dVar.mo70272e(254);
        }
        if (dVar.f41679g < 0) {
            dVar.f41679g = 0;
        }
    }

    /* renamed from: a */
    public final void mo45793a(C18823d dVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!dVar.mo70270c()) {
                break;
            }
            char b = dVar.mo70269b();
            dVar.f41678f++;
            mo70277L(sb, b);
            if (sb.length() % 3 == 0) {
                C19543e0.m33335t0(dVar, sb);
                if (C0761x.m1745t0(dVar.f41678f, 3, dVar.f41673a) != 3) {
                    dVar.f41679g = 0;
                    break;
                }
            }
        }
        mo70279W(dVar, sb);
    }
}
