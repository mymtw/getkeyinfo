package p078d2;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import p033c2.C4362a;
import p033c2.C4367d;
import p033c2.C4368e;
import p514bk.C14088a;

/* renamed from: d2.b */
public final class C6624b extends C6627d implements C6623a {

    /* renamed from: d */
    public CharSequence f14611d;

    /* renamed from: e */
    public CharSequence f14612e;

    /* renamed from: f */
    public C4368e f14613f;

    /* renamed from: g */
    public IconCompat f14614g;

    public C6624b(Slice.C3273a aVar) {
        super(aVar, C14088a.f31022c);
    }

    /* renamed from: a */
    public final void mo18808a() {
        this.f14624a.f7604b.add(new SliceItem(-1L, "long", "millis", new String[]{"ttl"}));
    }

    /* renamed from: b */
    public final void mo18809b(C4362a aVar) {
        CharSequence charSequence = aVar.f9603a;
        if (charSequence != null) {
            this.f14611d = charSequence;
        }
        CharSequence charSequence2 = aVar.f9605c;
        if (charSequence2 != null) {
            this.f14612e = charSequence2;
        }
        C4368e eVar = aVar.f9607e;
        if (eVar != null) {
            this.f14613f = eVar;
        }
    }

    /* renamed from: c */
    public final void mo18810c(PendingIntent pendingIntent) {
    }

    /* renamed from: d */
    public final void mo18811d(C4367d dVar) {
        IconCompat iconCompat;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.f14611d == null && (charSequence2 = dVar.f9612e) != null) {
            this.f14611d = charSequence2;
        }
        if (this.f14612e == null && (charSequence = dVar.f9614g) != null) {
            this.f14612e = charSequence;
        }
        if (this.f14614g == null && (iconCompat = dVar.f9611d) != null) {
            this.f14614g = iconCompat;
        }
    }

    /* renamed from: e */
    public final void mo18812e(Slice.C3273a aVar) {
        IconCompat iconCompat;
        CharSequence charSequence;
        Slice.C3273a aVar2 = new Slice.C3273a(this.f14624a);
        C4368e eVar = this.f14613f;
        if (eVar != null) {
            if (this.f14611d == null && (charSequence = eVar.f9620a.f14911d) != null) {
                this.f14611d = charSequence;
            }
            if (this.f14614g == null && (iconCompat = eVar.f9620a.f14909b) != null) {
                this.f14614g = iconCompat;
            }
            eVar.mo14302a(aVar2);
        }
        CharSequence charSequence2 = this.f14611d;
        if (charSequence2 != null) {
            aVar2.mo12105e(new SliceItem(charSequence2, "text", (String) null, new String[]{"title"}));
        }
        CharSequence charSequence3 = this.f14612e;
        if (charSequence3 != null) {
            aVar2.mo12105e(new SliceItem(charSequence3, "text", (String) null, new String[0]));
        }
        IconCompat iconCompat2 = this.f14614g;
        if (iconCompat2 != null) {
            aVar.mo12103c(iconCompat2, "title");
        }
        Slice h = aVar2.mo12108h();
        aVar.getClass();
        aVar.mo12106f(h);
    }
}
