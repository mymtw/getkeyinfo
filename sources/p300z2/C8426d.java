package p300z2;

import android.content.Context;
import androidx.work.NetworkType;
import p004a3.C0033g;
import p034c3.C4391o;
import p090e3.C6712a;
import p290y2.C8367b;

/* renamed from: z2.d */
public final class C8426d extends C8424c<C8367b> {
    public C8426d(Context context, C6712a aVar) {
        super(C0033g.m139a(context, aVar).f75c);
    }

    /* renamed from: b */
    public final boolean mo21007b(C4391o oVar) {
        return oVar.f9653j.f7882a == NetworkType.CONNECTED;
    }

    /* renamed from: c */
    public final boolean mo21008c(Object obj) {
        C8367b bVar = (C8367b) obj;
        return !bVar.f18342a || !bVar.f18343b;
    }
}
