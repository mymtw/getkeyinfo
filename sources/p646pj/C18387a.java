package p646pj;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.internal.auth.zzao;
import p564fj.C17740b;
import p564fj.C17741c;

/* renamed from: pj.a */
public final class C18387a extends GmsClient<zzan> {

    /* renamed from: b */
    public final Bundle f40447b;

    public C18387a(Context context, Looper looper, ClientSettings clientSettings, C17741c cVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (cVar == null) {
            this.f40447b = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzan ? (zzan) queryLocalInterface : new zzao(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f40447b;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        ClientSettings clientSettings = getClientSettings();
        return !TextUtils.isEmpty(clientSettings.getAccountName()) && !clientSettings.getApplicableScopes(C17740b.f38572a).isEmpty();
    }
}
