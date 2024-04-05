package p506ak;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import p703wj.C18708k;

/* renamed from: ak.e */
public final class C14019e extends Api.AbstractClientBuilder<C18708k, Api.ApiOptions.NoOptions> {
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new C18708k(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}
