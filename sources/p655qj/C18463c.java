package p655qj;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.p528authapi.zzw;
import com.google.android.gms.internal.p528authapi.zzx;
import p564fj.C17737a;

/* renamed from: qj.c */
public final class C18463c extends GmsClient<zzw> {

    /* renamed from: b */
    public final C17737a.C17738a f40649b;

    public C18463c(Context context, Looper looper, ClientSettings clientSettings, C17737a.C17738a aVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f40649b = aVar;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zzw ? (zzw) queryLocalInterface : new zzx(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        C17737a.C17738a aVar = this.f40649b;
        if (aVar == null) {
            return new Bundle();
        }
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", aVar.f38570b);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
