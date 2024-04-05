package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import com.etsy.android.lib.conversation.MessageDraft;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5517a = versionedParcel.mo12580k(iconCompat.f5517a, 1);
        byte[] bArr = iconCompat.f5519c;
        if (versionedParcel.mo12578i(2)) {
            bArr = versionedParcel.mo12576g();
        }
        iconCompat.f5519c = bArr;
        iconCompat.f5520d = versionedParcel.mo12583n(iconCompat.f5520d, 3);
        iconCompat.f5521e = versionedParcel.mo12580k(iconCompat.f5521e, 4);
        iconCompat.f5522f = versionedParcel.mo12580k(iconCompat.f5522f, 5);
        iconCompat.f5523g = (ColorStateList) versionedParcel.mo12583n(iconCompat.f5523g, 6);
        iconCompat.f5525i = versionedParcel.mo12585p(7, iconCompat.f5525i);
        iconCompat.f5526j = versionedParcel.mo12585p(8, iconCompat.f5526j);
        iconCompat.f5524h = PorterDuff.Mode.valueOf(iconCompat.f5525i);
        switch (iconCompat.f5517a) {
            case -1:
                Parcelable parcelable = iconCompat.f5520d;
                if (parcelable != null) {
                    iconCompat.f5518b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5520d;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f5519c;
                    iconCompat.f5518b = bArr2;
                    iconCompat.f5517a = 3;
                    iconCompat.f5521e = 0;
                    iconCompat.f5522f = bArr2.length;
                    break;
                } else {
                    iconCompat.f5518b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f5519c, Charset.forName("UTF-16"));
                iconCompat.f5518b = str;
                if (iconCompat.f5517a == 2 && iconCompat.f5526j == null) {
                    iconCompat.f5526j = str.split(MessageDraft.IMAGE_DELIMITER, -1)[0];
                    break;
                }
            case 3:
                iconCompat.f5518b = iconCompat.f5519c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f5525i = iconCompat.f5524h.name();
        switch (iconCompat.f5517a) {
            case -1:
                iconCompat.f5520d = (Parcelable) iconCompat.f5518b;
                break;
            case 1:
            case 5:
                iconCompat.f5520d = (Parcelable) iconCompat.f5518b;
                break;
            case 2:
                iconCompat.f5519c = ((String) iconCompat.f5518b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5519c = (byte[]) iconCompat.f5518b;
                break;
            case 4:
            case 6:
                iconCompat.f5519c = iconCompat.f5518b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f5517a;
        if (-1 != i) {
            versionedParcel.mo12595z(i, 1);
        }
        byte[] bArr = iconCompat.f5519c;
        if (bArr != null) {
            versionedParcel.mo12589t(2);
            versionedParcel.mo12592w(bArr);
        }
        Parcelable parcelable = iconCompat.f5520d;
        if (parcelable != null) {
            versionedParcel.mo12565C(parcelable, 3);
        }
        int i2 = iconCompat.f5521e;
        if (i2 != 0) {
            versionedParcel.mo12595z(i2, 4);
        }
        int i3 = iconCompat.f5522f;
        if (i3 != 0) {
            versionedParcel.mo12595z(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f5523g;
        if (colorStateList != null) {
            versionedParcel.mo12565C(colorStateList, 6);
        }
        String str = iconCompat.f5525i;
        if (str != null) {
            versionedParcel.mo12567E(7, str);
        }
        String str2 = iconCompat.f5526j;
        if (str2 != null) {
            versionedParcel.mo12567E(8, str2);
        }
    }
}
