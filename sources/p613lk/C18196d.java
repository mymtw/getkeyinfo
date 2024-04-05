package p613lk;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.wallet.zzs;
import com.google.android.gms.internal.wallet.zzw;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import p605kk.C18124h;
import p727zj.C18932a;
import p727zj.C18933b;

/* renamed from: lk.d */
public final class C18196d extends TaskApiCall<C18932a, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ IsReadyToPayRequest f39842a;

    public C18196d(IsReadyToPayRequest isReadyToPayRequest) {
        this.f39842a = isReadyToPayRequest;
    }

    public final void doExecute(Api.AnyClient anyClient, C18124h hVar) throws RemoteException {
        C18932a aVar = (C18932a) anyClient;
        IsReadyToPayRequest isReadyToPayRequest = this.f39842a;
        aVar.getClass();
        C18933b bVar = new C18933b(hVar);
        try {
            ((zzs) aVar.getService()).zza(isReadyToPayRequest, aVar.mo70375c(), (zzw) bVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            bVar.zza(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }
}
