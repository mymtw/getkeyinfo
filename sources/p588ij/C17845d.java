package p588ij;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.zzu;
import com.google.android.gms.auth.api.signin.internal.zzv;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p580hj.C17819e;

/* renamed from: ij.d */
public final class C17845d extends GmsClient<zzu> {

    /* renamed from: b */
    public final GoogleSignInOptions f38759b;

    public C17845d(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions googleSignInOptions2;
        if (googleSignInOptions != null) {
            googleSignInOptions2 = googleSignInOptions;
        } else {
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            if (hashSet.contains(GoogleSignInOptions.zae)) {
                Scope scope = GoogleSignInOptions.zad;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null, (C17819e) null);
        }
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            new HashSet();
            new HashMap();
            Preconditions.checkNotNull(googleSignInOptions2);
            HashSet hashSet2 = new HashSet(googleSignInOptions2.zag);
            boolean zab = googleSignInOptions2.zaj;
            boolean zac = googleSignInOptions2.zak;
            boolean zad = googleSignInOptions2.zai;
            String zae = googleSignInOptions2.zal;
            Account zaf = googleSignInOptions2.zah;
            String zag = googleSignInOptions2.zam;
            Map zaa = GoogleSignInOptions.zab((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions2.zan);
            String zai = googleSignInOptions2.zao;
            for (Scope add : clientSettings.getAllRequestedScopes()) {
                hashSet2.add(add);
                hashSet2.addAll(Arrays.asList(new Scope[0]));
            }
            if (hashSet2.contains(GoogleSignInOptions.zae)) {
                Scope scope2 = GoogleSignInOptions.zad;
                if (hashSet2.contains(scope2)) {
                    hashSet2.remove(scope2);
                }
            }
            if (zad && (zaf == null || !hashSet2.isEmpty())) {
                hashSet2.add(GoogleSignInOptions.zac);
            }
            googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet2), zaf, zad, zab, zac, zae, zag, zaa, zai, (C17819e) null);
        }
        this.f38759b = googleSignInOptions2;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new zzv(iBinder);
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        return C17846e.m29973a(getContext(), this.f38759b);
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }
}
