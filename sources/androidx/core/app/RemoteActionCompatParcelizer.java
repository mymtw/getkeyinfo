package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f5503a = (IconCompat) versionedParcel.mo12588s(remoteActionCompat.f5503a, 1);
        CharSequence charSequence = remoteActionCompat.f5504b;
        if (versionedParcel.mo12578i(2)) {
            charSequence = versionedParcel.mo12577h();
        }
        remoteActionCompat.f5504b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f5505c;
        if (versionedParcel.mo12578i(3)) {
            charSequence2 = versionedParcel.mo12577h();
        }
        remoteActionCompat.f5505c = charSequence2;
        remoteActionCompat.f5506d = (PendingIntent) versionedParcel.mo12583n(remoteActionCompat.f5506d, 4);
        boolean z = remoteActionCompat.f5507e;
        if (versionedParcel.mo12578i(5)) {
            z = versionedParcel.mo12575f();
        }
        remoteActionCompat.f5507e = z;
        boolean z2 = remoteActionCompat.f5508f;
        if (versionedParcel.mo12578i(6)) {
            z2 = versionedParcel.mo12575f();
        }
        remoteActionCompat.f5508f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f5503a;
        versionedParcel.mo12589t(1);
        versionedParcel.mo12569G(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5504b;
        versionedParcel.mo12589t(2);
        versionedParcel.mo12593x(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f5505c;
        versionedParcel.mo12589t(3);
        versionedParcel.mo12593x(charSequence2);
        versionedParcel.mo12565C(remoteActionCompat.f5506d, 4);
        boolean z = remoteActionCompat.f5507e;
        versionedParcel.mo12589t(5);
        versionedParcel.mo12591v(z);
        boolean z2 = remoteActionCompat.f5508f;
        versionedParcel.mo12589t(6);
        versionedParcel.mo12591v(z2);
    }
}
