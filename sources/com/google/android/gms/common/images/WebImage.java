package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new zae();
    @SafeParcelable.VersionField(mo49219id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getUrl", mo49213id = 2)
    private final Uri zab;
    @SafeParcelable.Field(getter = "getWidth", mo49213id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getHeight", mo49213id = 4)
    private final int zad;

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(mo49216id = 1) int i, @SafeParcelable.Param(mo49216id = 2) Uri uri, @SafeParcelable.Param(mo49216id = 3) int i2, @SafeParcelable.Param(mo49216id = 4) int i3) {
        this.zaa = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }

    private static Uri zaa(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (!jSONObject.has("url")) {
            return uri;
        }
        try {
            return Uri.parse(jSONObject.getString("url"));
        } catch (JSONException unused) {
            return uri;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return Objects.equal(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad;
        }
    }

    public final int getHeight() {
        return this.zad;
    }

    @RecentlyNonNull
    public final Uri getUrl() {
        return this.zab;
    }

    public final int getWidth() {
        return this.zac;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad));
    }

    @RecentlyNonNull
    @KeepForSdk
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put(ResponseConstants.WIDTH, this.zac);
            jSONObject.put(ResponseConstants.HEIGHT, this.zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString()});
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WebImage(@RecentlyNonNull Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(@RecentlyNonNull Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    @KeepForSdk
    public WebImage(@RecentlyNonNull JSONObject jSONObject) throws IllegalArgumentException {
        this(zaa(jSONObject), jSONObject.optInt(ResponseConstants.WIDTH, 0), jSONObject.optInt(ResponseConstants.HEIGHT, 0));
    }
}
