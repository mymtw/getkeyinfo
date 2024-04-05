package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

@SuppressLint({"BanParcelableUsage"})
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new DefaultLazyKey$Companion$CREATOR$1();

    /* renamed from: b */
    public final int f1785b;

    public DefaultLazyKey(int i) {
        this.f1785b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f1785b == ((DefaultLazyKey) obj).f1785b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1785b);
    }

    public final String toString() {
        return C0073e.m208h(C0072d.m201h("DefaultLazyKey(index="), this.f1785b, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "parcel");
        parcel.writeInt(this.f1785b);
    }
}
