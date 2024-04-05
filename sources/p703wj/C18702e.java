package p703wj;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzao;
import com.google.android.gms.location.zzal;

/* renamed from: wj.e */
public final class C18702e extends C18703f {

    /* renamed from: a */
    public final /* synthetic */ zzal f41455a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18702e(GoogleApiClient googleApiClient, zzal zzal) {
        super(googleApiClient);
        this.f41455a = zzal;
    }

    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C18708k kVar = (C18708k) anyClient;
        zzal zzal = this.f41455a;
        kVar.checkConnected();
        Preconditions.checkNotNull(zzal, "removeGeofencingRequest can't be null.");
        Preconditions.checkNotNull(this, "ResultHolder not provided.");
        ((zzao) kVar.getService()).zza(zzal, (zzam) new C18710m(this));
    }
}
