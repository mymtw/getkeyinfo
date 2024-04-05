package p205p2;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.session.MediaSessionCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.appboy.Constants;

/* renamed from: p2.a */
public final class C7651a {
    /* renamed from: a */
    public static C7654d m14673a(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C7651a.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable(Constants.APPBOY_PUSH_CONTENT_KEY);
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).getVersionedParcel();
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
