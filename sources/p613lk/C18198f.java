package p613lk;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import p613lk.C18193c;
import p727zj.C18932a;

/* renamed from: lk.f */
public final class C18198f extends Api.AbstractClientBuilder<C18932a, C18193c.C18194a> {
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        C18193c.C18194a aVar = (C18193c.C18194a) obj;
        if (aVar == null) {
            aVar = new C18193c.C18194a();
        }
        return new C18932a(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener, aVar.f39839b, aVar.f39840c);
    }
}
