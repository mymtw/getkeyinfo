package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.C1913a;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.input.w */
public final class C2005w {

    /* renamed from: a */
    public final C1913a f4528a;

    /* renamed from: b */
    public final C1994n f4529b;

    public C2005w(C1913a aVar, C1994n nVar) {
        C19383o.m32797g(aVar, "text");
        C19383o.m32797g(nVar, "offsetMapping");
        this.f4528a = aVar;
        this.f4529b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2005w)) {
            return false;
        }
        C2005w wVar = (C2005w) obj;
        return C19383o.m32792b(this.f4528a, wVar.f4528a) && C19383o.m32792b(this.f4529b, wVar.f4529b);
    }

    public final int hashCode() {
        return this.f4529b.hashCode() + (this.f4528a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TransformedText(text=");
        h.append(this.f4528a);
        h.append(", offsetMapping=");
        h.append(this.f4529b);
        h.append(')');
        return h.toString();
    }
}
