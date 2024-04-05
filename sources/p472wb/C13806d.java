package p472wb;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8703p;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p415of.C13186o;
import p439rf.C13364c;
import p628nj.C18263b;

/* renamed from: wb.d */
public final class C13806d implements C13364c.C13365a<C8698l> {

    /* renamed from: a */
    public final /* synthetic */ C8703p f30417a;

    public C13806d(C8703p pVar) {
        this.f30417a = pVar;
    }

    /* renamed from: a */
    public final void mo33210a(C13186o oVar) {
        C8698l lVar = (C8698l) oVar;
        C19383o.m32797g(lVar, "item");
        if (C18263b.m30839d0(C19388s.m32863g0(lVar))) {
            C8703p pVar = this.f30417a;
            StringBuilder h = C0072d.m201h("scrolled_past_");
            h.append(C19388s.m32863g0(lVar));
            pVar.mo21333d(h.toString(), C19388s.m32882r0(lVar));
        }
        List<C8696j> f0 = C19388s.m32861f0(lVar);
        C8703p pVar2 = this.f30417a;
        for (C8696j jVar : f0) {
            pVar2.mo21333d(jVar.f19098a, jVar.f19099b);
        }
    }
}
