package p703wj;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: wj.d */
public final class C18701d extends C18703f {

    /* renamed from: a */
    public final /* synthetic */ GeofencingRequest f41453a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f41454b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18701d(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f41453a = geofencingRequest;
        this.f41454b = pendingIntent;
    }

    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C18708k kVar = (C18708k) anyClient;
        GeofencingRequest geofencingRequest = this.f41453a;
        PendingIntent pendingIntent = this.f41454b;
        kVar.checkConnected();
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(this, "ResultHolder not provided.");
        ((zzao) kVar.getService()).zza(geofencingRequest, pendingIntent, (zzam) new C18709l(this));
    }
}
