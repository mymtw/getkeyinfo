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

public final class VerticalScrollLayoutModifier implements C1702p {

    /* renamed from: b */
    public final TextFieldScrollerPosition f1970b;

    /* renamed from: c */
    public final int f1971c;

    /* renamed from: d */
    public final C2005w f1972d;

    /* renamed from: e */
    public final C19846a<C0965r> f1973e;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, C2005w wVar, C19846a<C0965r> aVar) {
        this.f1970b = textFieldScrollerPosition;
        this.f1971c = i;
        this.f1972d = wVar;
        this.f1973e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return C19383o.m32792b(this.f1970b, verticalScrollLayoutModifier.f1970b) && this.f1971c == verticalScrollLayoutModifier.f1971c && C19383o.m32792b(this.f1972d, verticalScrollLayoutModifier.f1972d) && C19383o.m32792b(this.f1973e, verticalScrollLayoutModifier.f1973e);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f1971c, this.f1970b.hashCode() * 31, 31);
        return this.f1973e.hashCode() + ((this.f1972d.hashCode() + a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VerticalScrollLayoutModifier(scrollerPosition=");
        h.append(this.f1970b);
        h.append(", cursorOffset=");
        h.append(this.f1971c);
        h.append(", transformedText=");
        h.append(this.f1972d);
        h.append(", textLayoutResultProvider=");
        h.append(this.f1973e);
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(C7280a.m13956a(j, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 7));
        int min = Math.min(J.f3723c, C7280a.m13962g(j));
        return xVar.mo4387Z(J.f3722b, min, C19294b0.m32559p0(), new VerticalScrollLayoutModifier$measure$1(xVar, this, J, min));
    }
}
