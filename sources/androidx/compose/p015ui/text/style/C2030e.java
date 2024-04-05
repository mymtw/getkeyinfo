package androidx.compose.p015ui.text.style;

import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.style.e */
public final class C2030e {

    /* renamed from: b */
    public static final C2030e f4612b = new C2030e(0);

    /* renamed from: c */
    public static final C2030e f4613c = new C2030e(1);

    /* renamed from: d */
    public static final C2030e f4614d = new C2030e(2);

    /* renamed from: a */
    public final int f4615a;

    public C2030e(int i) {
        this.f4615a = i;
    }

    /* renamed from: a */
    public final boolean mo7779a(C2030e eVar) {
        int i = this.f4615a;
        return (eVar.f4615a | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2030e) && this.f4615a == ((C2030e) obj).f4615a;
    }

    public final int hashCode() {
        return this.f4615a;
    }

    public final String toString() {
        if (this.f4615a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f4615a & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f4615a & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            StringBuilder h = C0072d.m201h("TextDecoration.");
            h.append((String) arrayList.get(0));
            return h.toString();
        }
        StringBuilder h2 = C0072d.m201h("TextDecoration[");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append(", ");
            }
            if (obj == null ? true : obj instanceof CharSequence) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append(String.valueOf(obj));
            }
        }
        sb.append("");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        h2.append(sb2);
        h2.append(']');
        return h2.toString();
    }
}
