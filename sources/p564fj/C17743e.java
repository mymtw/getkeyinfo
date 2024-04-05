package p564fj;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import p564fj.C17737a;
import p655qj.C18463c;

/* renamed from: fj.e */
public final class C17743e extends Api.AbstractClientBuilder<C18463c, C17737a.C17738a> {
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new C18463c(context, looper, clientSettings, (C17737a.C17738a) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
