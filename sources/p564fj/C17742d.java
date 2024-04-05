package p564fj;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import p646pj.C18387a;

/* renamed from: fj.d */
public final class C17742d extends Api.AbstractClientBuilder<C18387a, C17741c> {
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new C18387a(context, looper, clientSettings, (C17741c) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
