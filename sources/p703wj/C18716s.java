package p703wj;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.internal.location.zzbf;
import com.google.android.gms.location.LocationRequest;

/* renamed from: wj.s */
public final class C18716s extends C18698a {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f41468a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f41469b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18716s(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f41468a = locationRequest;
        this.f41469b = pendingIntent;
    }

    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C18699b bVar = new C18699b(this);
        LocationRequest locationRequest = this.f41468a;
        PendingIntent pendingIntent = this.f41469b;
        C18704g gVar = ((C18708k) anyClient).f41461d;
        gVar.f41456a.f41467a.checkConnected();
        ((zzao) gVar.f41456a.f41467a.getService()).zza(new zzbf(1, zzbd.zza(locationRequest), (IBinder) null, pendingIntent, (IBinder) null, bVar.asBinder()));
    }
}
