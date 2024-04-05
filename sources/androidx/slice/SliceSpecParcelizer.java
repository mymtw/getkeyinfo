package androidx.slice;

import androidx.versionedparcelable.VersionedParcel;

public final class SliceSpecParcelizer {
    public static SliceSpec read(VersionedParcel versionedParcel) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.f7618a = versionedParcel.mo12585p(1, sliceSpec.f7618a);
        sliceSpec.f7619b = versionedParcel.mo12580k(sliceSpec.f7619b, 2);
        return sliceSpec;
    }

    public static void write(SliceSpec sliceSpec, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.mo12567E(1, sliceSpec.f7618a);
        versionedParcel.mo12595z(sliceSpec.f7619b, 2);
    }
}
