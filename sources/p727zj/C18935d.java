package p727zj;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.wallet.zzn;
import com.google.android.gms.internal.wallet.zzr;
import com.google.android.gms.internal.wallet.zzu;
import com.google.android.gms.internal.wallet.zzv;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

/* renamed from: zj.d */
public final class C18935d extends RemoteCreator<zzu> {

    /* renamed from: a */
    public static C18935d f42222a;

    public C18935d() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    /* renamed from: a */
    public static zzn m32027a(Activity activity, IFragmentWrapper.Stub stub, WalletFragmentOptions walletFragmentOptions, zzr zzr) throws GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable == 0) {
            try {
                if (f42222a == null) {
                    f42222a = new C18935d();
                }
                return ((zzu) f42222a.getRemoteCreatorInstance(activity)).zza(ObjectWrapper.wrap(activity), stub, walletFragmentOptions, zzr);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (RemoteCreator.RemoteCreatorException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new zzv(iBinder);
    }
}
