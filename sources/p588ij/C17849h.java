package p588ij;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.internal.zzu;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: ij.h */
public final class C17849h extends C17851j<Status> {
    public C17849h(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C17845d dVar = (C17845d) anyClient;
        ((zzu) dVar.getService()).zze(new C17850i(this), dVar.f38759b);
    }
}
