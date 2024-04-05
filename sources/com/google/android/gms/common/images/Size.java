package com.google.android.gms.common.images;

import androidx.annotation.RecentlyNonNull;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import p504ai.C13983i;

public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
    }

    @RecentlyNonNull
    public static Size parseSize(@RecentlyNonNull String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zaa(str);
                }
            } else {
                throw zaa(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(C13983i.m21492k(C0391c.m1055a(str, 16), "Invalid Size: \"", str, "\""));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zaa == size.zaa && this.zab == size.zab;
        }
    }

    public final int getHeight() {
        return this.zab;
    }

    public final int getWidth() {
        return this.zaa;
    }

    public final int hashCode() {
        int i = this.zab;
        int i2 = this.zaa;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @RecentlyNonNull
    public final String toString() {
        int i = this.zaa;
        int i2 = this.zab;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(EtsyDialogFragment.OPT_X_BUTTON);
        sb.append(i2);
        return sb.toString();
    }
}
