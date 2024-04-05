package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p174m0.C7282b;
import p504ai.C13983i;

/* renamed from: androidx.compose.ui.text.p */
public final class C2014p {

    /* renamed from: a */
    public final C1913a f4556a;

    /* renamed from: b */
    public final C2023s f4557b;

    /* renamed from: c */
    public final List<C1913a.C1916b<C2008j>> f4558c;

    /* renamed from: d */
    public final int f4559d;

    /* renamed from: e */
    public final boolean f4560e;

    /* renamed from: f */
    public final int f4561f;

    /* renamed from: g */
    public final C7282b f4562g;

    /* renamed from: h */
    public final LayoutDirection f4563h;

    /* renamed from: i */
    public final C1952g.C1953a f4564i;

    /* renamed from: j */
    public final long f4565j;

    public C2014p() {
        throw null;
    }

    public C2014p(C1913a aVar, C2023s sVar, List list, int i, boolean z, int i2, C7282b bVar, LayoutDirection layoutDirection, C1952g.C1953a aVar2, long j) {
        this.f4556a = aVar;
        this.f4557b = sVar;
        this.f4558c = list;
        this.f4559d = i;
        this.f4560e = z;
        this.f4561f = i2;
        this.f4562g = bVar;
        this.f4563h = layoutDirection;
        this.f4564i = aVar2;
        this.f4565j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2014p)) {
            return false;
        }
        C2014p pVar = (C2014p) obj;
        if (!C19383o.m32792b(this.f4556a, pVar.f4556a) || !C19383o.m32792b(this.f4557b, pVar.f4557b) || !C19383o.m32792b(this.f4558c, pVar.f4558c) || this.f4559d != pVar.f4559d || this.f4560e != pVar.f4560e) {
            return false;
        }
        return (this.f4561f == pVar.f4561f) && C19383o.m32792b(this.f4562g, pVar.f4562g) && this.f4563h == pVar.f4563h && C19383o.m32792b(this.f4564i, pVar.f4564i) && C7280a.m13957b(this.f4565j, pVar.f4565j);
    }

    public final int hashCode() {
        int hashCode = this.f4557b.hashCode();
        List<C1913a.C1916b<C2008j>> list = this.f4558c;
        int hashCode2 = Boolean.hashCode(this.f4560e);
        int a = C0069a.m170a(this.f4561f, (hashCode2 + ((C13983i.m21488g(list, (hashCode + (this.f4556a.hashCode() * 31)) * 31, 31) + this.f4559d) * 31)) * 31, 31);
        int hashCode3 = this.f4563h.hashCode();
        int hashCode4 = this.f4564i.hashCode();
        return Long.hashCode(this.f4565j) + ((hashCode4 + ((hashCode3 + ((this.f4562g.hashCode() + a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder h = C0072d.m201h("TextLayoutInput(text=");
        h.append(this.f4556a);
        h.append(", style=");
        h.append(this.f4557b);
        h.append(", placeholders=");
        h.append(this.f4558c);
        h.append(", maxLines=");
        h.append(this.f4559d);
        h.append(", softWrap=");
        h.append(this.f4560e);
        h.append(", overflow=");
        int i = this.f4561f;
        boolean z = false;
        if (i == 1) {
            str = "Clip";
        } else {
            if (i == 2) {
                str = "Ellipsis";
            } else {
                if (i == 3) {
                    z = true;
                }
                str = z ? "Visible" : "Invalid";
            }
        }
        h.append(str);
        h.append(", density=");
        h.append(this.f4562g);
        h.append(", layoutDirection=");
        h.append(this.f4563h);
        h.append(", fontFamilyResolver=");
        h.append(this.f4564i);
        h.append(", constraints=");
        h.append(C7280a.m13966k(this.f4565j));
        h.append(')');
        return h.toString();
    }
}
