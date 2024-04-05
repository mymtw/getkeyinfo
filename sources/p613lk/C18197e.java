package p613lk;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.wallet.zzs;
import com.google.android.gms.internal.wallet.zzw;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import p605kk.C18124h;
import p727zj.C18932a;
import p727zj.C18934c;

/* renamed from: lk.e */
public final class C18197e extends TaskApiCall<C18932a, PaymentData> {

    /* renamed from: a */
    public final /* synthetic */ PaymentDataRequest f39843a;

    public C18197e(PaymentDataRequest paymentDataRequest) {
        this.f39843a = paymentDataRequest;
    }

    public final void doExecute(Api.AnyClient anyClient, C18124h hVar) throws RemoteException {
        C18932a aVar = (C18932a) anyClient;
        PaymentDataRequest paymentDataRequest = this.f39843a;
        Bundle c = aVar.mo70375c();
        c.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        C18934c cVar = new C18934c(hVar);
        try {
            ((zzs) aVar.getService()).zza(paymentDataRequest, c, (zzw) cVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            cVar.zza(Status.RESULT_INTERNAL_ERROR, (PaymentData) null, Bundle.EMPTY);
        }
    }
}
