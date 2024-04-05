package p100f2;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;

/* renamed from: f2.a */
public final class C6775a {

    /* renamed from: a */
    public PendingIntent f14908a;

    /* renamed from: b */
    public IconCompat f14909b;

    /* renamed from: c */
    public int f14910c = 0;

    /* renamed from: d */
    public CharSequence f14911d;

    public C6775a(PendingIntent pendingIntent, IconCompat iconCompat, String str) {
        this.f14908a = pendingIntent;
        this.f14909b = iconCompat;
        this.f14911d = str;
    }

    /* renamed from: a */
    public final Slice.C3273a mo18915a(Slice.C3273a aVar) {
        Slice.C3273a aVar2 = new Slice.C3273a(aVar);
        IconCompat iconCompat = this.f14909b;
        if (iconCompat != null) {
            aVar2.mo12103c(iconCompat, this.f14910c == 0 ? new String[0] : new String[]{"no_tint"});
        }
        CharSequence charSequence = this.f14911d;
        if (charSequence != null) {
            aVar2.mo12107g(charSequence, (String) null, "title");
        }
        return aVar2;
    }
}
