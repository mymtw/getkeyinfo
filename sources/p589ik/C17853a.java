package p589ik;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zae;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.internal.zak;
import p581hk.C17826f;
import p588ij.C17842a;

@KeepForSdk
/* renamed from: ik.a */
public final class C17853a extends GmsClient<zag> implements C17826f {

    /* renamed from: b */
    public final boolean f38765b = true;

    /* renamed from: c */
    public final ClientSettings f38766c;

    /* renamed from: d */
    public final Bundle f38767d;

    /* renamed from: e */
    public final Integer f38768e;

    public C17853a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull ClientSettings clientSettings, @RecentlyNonNull Bundle bundle, @RecentlyNonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @RecentlyNonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f38766c = clientSettings;
        this.f38767d = bundle;
        this.f38768e = clientSettings.zad();
    }

    /* renamed from: a */
    public final void mo69059a(@RecentlyNonNull IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zag) getService()).zaa(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.f38768e)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: b */
    public final void mo69060b(zae zae) {
        Preconditions.checkNotNull(zae, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f38766c.getAccountOrDefault();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(accountOrDefault.name)) {
                googleSignInAccount = C17842a.m29965a(getContext()).mo69076b();
            }
            ((zag) getService()).zaa(new zaj(new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f38768e)).intValue(), googleSignInAccount)), zae);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zae.zaa(new zak(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @RecentlyNonNull
    public final /* synthetic */ IInterface createServiceInterface(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zag ? (zag) queryLocalInterface : new zaf(iBinder);
    }

    @RecentlyNonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f38766c.getRealClientPackageName())) {
            this.f38767d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f38766c.getRealClientPackageName());
        }
        return this.f38767d;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @RecentlyNonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @RecentlyNonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f38765b;
    }

    public final void zaa() {
        try {
            ((zag) getService()).zaa(((Integer) Preconditions.checkNotNull(this.f38768e)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
