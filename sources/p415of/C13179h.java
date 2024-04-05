package p415of;

import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import kotlin.jvm.internal.C19383o;

/* renamed from: of.h */
public final class C13179h {

    /* renamed from: a */
    public final Fragment f29013a;

    /* renamed from: b */
    public final C8703p f29014b;

    /* renamed from: c */
    public final C13180i f29015c;

    /* renamed from: d */
    public final C13182k f29016d;

    public C13179h(Fragment fragment, C8703p pVar, C13180i iVar, C13182k kVar) {
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(pVar, "analyticsContext");
        this.f29013a = fragment;
        this.f29014b = pVar;
        this.f29015c = iVar;
        this.f29016d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13179h)) {
            return false;
        }
        C13179h hVar = (C13179h) obj;
        return C19383o.m32792b(this.f29013a, hVar.f29013a) && C19383o.m32792b(this.f29014b, hVar.f29014b) && C19383o.m32792b(this.f29015c, hVar.f29015c) && C19383o.m32792b(this.f29016d, hVar.f29016d);
    }

    public final int hashCode() {
        int hashCode = (this.f29014b.hashCode() + (this.f29013a.hashCode() * 31)) * 31;
        C13180i iVar = this.f29015c;
        int i = 0;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C13182k kVar = this.f29016d;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HolderDependencies(fragment=");
        h.append(this.f29013a);
        h.append(", analyticsContext=");
        h.append(this.f29014b);
        h.append(", adapter=");
        h.append(this.f29015c);
        h.append(", serverDrivenActionDelegate=");
        h.append(this.f29016d);
        h.append(')');
        return h.toString();
    }
}
