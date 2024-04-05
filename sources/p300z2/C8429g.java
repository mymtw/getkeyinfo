package p300z2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import p004a3.C0033g;
import p034c3.C4391o;
import p090e3.C6712a;
import p290y2.C8367b;

/* renamed from: z2.g */
public final class C8429g extends C8424c<C8367b> {
    public C8429g(Context context, C6712a aVar) {
        super(C0033g.m139a(context, aVar).f75c);
    }

    /* renamed from: b */
    public final boolean mo21007b(C4391o oVar) {
        NetworkType networkType = oVar.f9653j.f7882a;
        return networkType == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED);
    }

    /* renamed from: c */
    public final boolean mo21008c(Object obj) {
        C8367b bVar = (C8367b) obj;
        return !bVar.f18342a || bVar.f18344c;
    }
}
