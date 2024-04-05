package p703wj;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: wj.k */
public final class C18708k extends C18713p {

    /* renamed from: d */
    public final C18704g f41461d = new C18704g(this.f41466c);

    public C18708k(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    public final void disconnect() {
        synchronized (this.f41461d) {
            if (isConnected()) {
                try {
                    this.f41461d.mo70196a();
                    this.f41461d.mo70197b();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }
}
