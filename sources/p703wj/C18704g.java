package p703wj;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzaj;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.internal.location.zzm;
import com.google.android.gms.internal.location.zzo;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzx;
import java.util.HashMap;

/* renamed from: wj.g */
public final class C18704g {

    /* renamed from: a */
    public final C18714q f41456a;

    /* renamed from: b */
    public boolean f41457b = false;

    /* renamed from: c */
    public final HashMap f41458c = new HashMap();

    /* renamed from: d */
    public final HashMap f41459d = new HashMap();

    /* renamed from: e */
    public final HashMap f41460e = new HashMap();

    public C18704g(C18714q qVar) {
        this.f41456a = qVar;
    }

    /* renamed from: a */
    public final void mo70196a() throws RemoteException {
        synchronized (this.f41458c) {
            try {
                for (C18707j jVar : this.f41458c.values()) {
                    if (jVar != null) {
                        ((zzao) this.f41456a.f41467a.getService()).zza(zzbf.zza((zzx) jVar, (zzaj) null));
                    }
                }
                this.f41458c.clear();
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.f41460e) {
            try {
                for (C18705h hVar : this.f41460e.values()) {
                    if (hVar != null) {
                        ((zzao) this.f41456a.f41467a.getService()).zza(zzbf.zza((zzu) hVar, (zzaj) null));
                    }
                }
                this.f41460e.clear();
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.f41459d) {
            for (C18706i iVar : this.f41459d.values()) {
                if (iVar != null) {
                    ((zzao) this.f41456a.f41467a.getService()).zza(new zzo(2, (zzm) null, iVar.asBinder(), (IBinder) null));
                }
            }
            this.f41459d.clear();
        }
    }

    /* renamed from: b */
    public final void mo70197b() throws RemoteException {
        if (this.f41457b) {
            this.f41456a.f41467a.checkConnected();
            ((zzao) this.f41456a.f41467a.getService()).zza(false);
            this.f41457b = false;
        }
    }
}
