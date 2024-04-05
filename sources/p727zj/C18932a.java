package p727zj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.wallet.zzs;
import com.google.android.gms.internal.wallet.zzt;

/* renamed from: zj.a */
public final class C18932a extends GmsClient<zzs> {

    /* renamed from: b */
    public final Context f42215b;

    /* renamed from: c */
    public final int f42216c;

    /* renamed from: d */
    public final String f42217d;

    /* renamed from: e */
    public final int f42218e = 0;

    /* renamed from: f */
    public final boolean f42219f;

    public C18932a(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i, boolean z) {
        super(context, looper, 4, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f42215b = context;
        this.f42216c = i;
        this.f42217d = clientSettings.getAccountName();
        this.f42219f = z;
    }

    /* renamed from: c */
    public final Bundle mo70375c() {
        int i = this.f42216c;
        String packageName = this.f42215b.getPackageName();
        String str = this.f42217d;
        int i2 = this.f42218e;
        boolean z = this.f42219f;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, AccountType.GOOGLE));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof zzs ? (zzs) queryLocalInterface : new zzt(iBinder);
    }

    public final int getMinApkVersion() {
        return 12600000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public final boolean requiresAccount() {
        return true;
    }
}
