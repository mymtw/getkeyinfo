package androidx.compose.foundation.text;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.input.C2005w;
import com.google.android.gms.common.api.Api;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p753kq.C19846a;

public final class HorizontalScrollLayoutModifier implements C1702p {

    /* renamed from: b */
    public final TextFieldScrollerPosition f1916b;

    /* renamed from: c */
    public final int f1917c;

    /* renamed from: d */
    public final C2005w f1918d;

    /* renamed from: e */
    public final C19846a<C0965r> f1919e;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, C2005w wVar, C19846a<C0965r> aVar) {
        this.f1916b = textFieldScrollerPosition;
        this.f1917c = i;
        this.f1918d = wVar;
        this.f1919e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return C19383o.m32792b(this.f1916b, horizontalScrollLayoutModifier.f1916b) && this.f1917c == horizontalScrollLayoutModifier.f1917c && C19383o.m32792b(this.f1918d, horizontalScrollLayoutModifier.f1918d) && C19383o.m32792b(this.f1919e, horizontalScrollLayoutModifier.f1919e);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f1917c, this.f1916b.hashCode() * 31, 31);
        return this.f1919e.hashCode() + ((this.f1918d.hashCode() + a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HorizontalScrollLayoutModifier(scrollerPosition=");
        h.append(this.f1916b);
        h.append(", cursorOffset=");
        h.append(this.f1917c);
        h.append(", transformedText=");
        h.append(this.f1918d);
        h.append(", textLayoutResultProvider=");
        h.append(this.f1919e);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(uVar.mo6664D(C7280a.m13962g(j)) < C7280a.m13963h(j) ? j : C7280a.m13956a(j, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, 13));
        int min = Math.min(J.f3722b, C7280a.m13963h(j));
        return xVar.mo4387Z(min, J.f3723c, C19294b0.m32559p0(), new HorizontalScrollLayoutModifier$measure$1(xVar, this, J, min));
    }
}
