package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C19383o;

public final class DefaultLazyKey$Companion$CREATOR$1 implements Parcelable.Creator<DefaultLazyKey> {
    public DefaultLazyKey createFromParcel(Parcel parcel) {
        C19383o.m32797g(parcel, "parcel");
        return new DefaultLazyKey(parcel.readInt());
    }

    public DefaultLazyKey[] newArray(int i) {
        return new DefaultLazyKey[i];
    }
}
