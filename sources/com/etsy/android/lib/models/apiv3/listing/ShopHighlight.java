package com.etsy.android.lib.models.apiv3.listing;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

@C17403o(generateAdapter = true)
public final class ShopHighlight implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShopHighlight> CREATOR = new Creator();
    private final String iconRaw;
    private final String text;

    public static final class Creator implements Parcelable.Creator<ShopHighlight> {
        public final ShopHighlight createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new ShopHighlight(parcel.readString(), parcel.readString());
        }

        public final ShopHighlight[] newArray(int i) {
            return new ShopHighlight[i];
        }
    }

    public enum Icon {
        Gift,
        RecentReview,
        None
    }

    public ShopHighlight(@C17402n(name = "text") String str, @C17402n(name = "icon") String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "iconRaw");
        this.text = str;
        this.iconRaw = str2;
    }

    public static /* synthetic */ ShopHighlight copy$default(ShopHighlight shopHighlight, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopHighlight.text;
        }
        if ((i & 2) != 0) {
            str2 = shopHighlight.iconRaw;
        }
        return shopHighlight.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.iconRaw;
    }

    public final ShopHighlight copy(@C17402n(name = "text") String str, @C17402n(name = "icon") String str2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(str2, "iconRaw");
        return new ShopHighlight(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopHighlight)) {
            return false;
        }
        ShopHighlight shopHighlight = (ShopHighlight) obj;
        return C19383o.m32792b(this.text, shopHighlight.text) && C19383o.m32792b(this.iconRaw, shopHighlight.iconRaw);
    }

    public final Icon getIcon() {
        Icon icon;
        Icon[] values = Icon.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                icon = null;
                break;
            }
            icon = values[i];
            if (C19457k.m33019W0(icon.name(), this.iconRaw, true)) {
                break;
            }
            i++;
        }
        return icon == null ? Icon.None : icon;
    }

    public final String getIconRaw() {
        return this.iconRaw;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.iconRaw.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopHighlight(text=");
        h.append(this.text);
        h.append(", iconRaw=");
        return C0391c.m1057c(h, this.iconRaw, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.iconRaw);
    }
}
