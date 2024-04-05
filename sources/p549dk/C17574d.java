package p549dk;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.maps.model.Tile;

/* renamed from: dk.d */
public final class C17574d extends zzag {

    /* renamed from: a */
    public final /* synthetic */ C17572b f38445a;

    public C17574d(C17572b bVar) {
        this.f38445a = bVar;
    }

    public final Tile getTile(int i, int i2, int i3) {
        C17573c cVar = (C17573c) this.f38445a;
        cVar.getClass();
        try {
            return ((zzaf) cVar.f38443a).getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
