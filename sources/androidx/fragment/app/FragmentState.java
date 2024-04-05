package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C2729a();

    /* renamed from: b */
    public final String f6177b;

    /* renamed from: c */
    public final String f6178c;

    /* renamed from: d */
    public final boolean f6179d;

    /* renamed from: e */
    public final int f6180e;

    /* renamed from: f */
    public final int f6181f;

    /* renamed from: g */
    public final String f6182g;

    /* renamed from: h */
    public final boolean f6183h;

    /* renamed from: i */
    public final boolean f6184i;

    /* renamed from: j */
    public final boolean f6185j;

    /* renamed from: k */
    public final Bundle f6186k;

    /* renamed from: l */
    public final boolean f6187l;

    /* renamed from: m */
    public final int f6188m;

    /* renamed from: n */
    public Bundle f6189n;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    public class C2729a implements Parcelable.Creator<FragmentState> {
        public final Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public final Object[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f6177b = fragment.getClass().getName();
        this.f6178c = fragment.mWho;
        this.f6179d = fragment.mFromLayout;
        this.f6180e = fragment.mFragmentId;
        this.f6181f = fragment.mContainerId;
        this.f6182g = fragment.mTag;
        this.f6183h = fragment.mRetainInstance;
        this.f6184i = fragment.mRemoving;
        this.f6185j = fragment.mDetached;
        this.f6186k = fragment.mArguments;
        this.f6187l = fragment.mHidden;
        this.f6188m = fragment.mMaxState.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder g = C0069a.m176g(128, "FragmentState{");
        g.append(this.f6177b);
        g.append(" (");
        g.append(this.f6178c);
        g.append(")}:");
        if (this.f6179d) {
            g.append(" fromLayout");
        }
        if (this.f6181f != 0) {
            g.append(" id=0x");
            g.append(Integer.toHexString(this.f6181f));
        }
        String str = this.f6182g;
        if (str != null && !str.isEmpty()) {
            g.append(" tag=");
            g.append(this.f6182g);
        }
        if (this.f6183h) {
            g.append(" retainInstance");
        }
        if (this.f6184i) {
            g.append(" removing");
        }
        if (this.f6185j) {
            g.append(" detached");
        }
        if (this.f6187l) {
            g.append(" hidden");
        }
        return g.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6177b);
        parcel.writeString(this.f6178c);
        parcel.writeInt(this.f6179d ? 1 : 0);
        parcel.writeInt(this.f6180e);
        parcel.writeInt(this.f6181f);
        parcel.writeString(this.f6182g);
        parcel.writeInt(this.f6183h ? 1 : 0);
        parcel.writeInt(this.f6184i ? 1 : 0);
        parcel.writeInt(this.f6185j ? 1 : 0);
        parcel.writeBundle(this.f6186k);
        parcel.writeInt(this.f6187l ? 1 : 0);
        parcel.writeBundle(this.f6189n);
        parcel.writeInt(this.f6188m);
    }

    public FragmentState(Parcel parcel) {
        this.f6177b = parcel.readString();
        this.f6178c = parcel.readString();
        boolean z = true;
        this.f6179d = parcel.readInt() != 0;
        this.f6180e = parcel.readInt();
        this.f6181f = parcel.readInt();
        this.f6182g = parcel.readString();
        this.f6183h = parcel.readInt() != 0;
        this.f6184i = parcel.readInt() != 0;
        this.f6185j = parcel.readInt() != 0;
        this.f6186k = parcel.readBundle();
        this.f6187l = parcel.readInt() == 0 ? false : z;
        this.f6189n = parcel.readBundle();
        this.f6188m = parcel.readInt();
    }
}
