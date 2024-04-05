package p033c2;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import p100f2.C6775a;

/* renamed from: c2.e */
public final class C4368e {

    /* renamed from: a */
    public C6775a f9620a;

    public C4368e(PendingIntent pendingIntent, IconCompat iconCompat, String str) {
        this.f9620a = new C6775a(pendingIntent, iconCompat, str);
    }

    /* renamed from: a */
    public final void mo14302a(Slice.C3273a aVar) {
        PendingIntent pendingIntent = this.f9620a.f14908a;
        pendingIntent.getClass();
        Slice.C3273a a = this.f9620a.mo18915a(aVar);
        a.mo12102b("shortcut", "title");
        Slice h = a.mo12108h();
        this.f9620a.getClass();
        aVar.mo12101a(pendingIntent, h);
    }
}
