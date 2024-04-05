package androidx.slice;

import androidx.versionedparcelable.VersionedParcel;

public final class SliceParcelizer {
    public static Slice read(VersionedParcel versionedParcel) {
        Slice slice = new Slice();
        slice.f7599a = (SliceSpec) versionedParcel.mo12588s(slice.f7599a, 1);
        slice.f7600b = (SliceItem[]) versionedParcel.mo12574e(2, slice.f7600b);
        slice.f7601c = (String[]) versionedParcel.mo12574e(3, slice.f7601c);
        slice.f7602d = versionedParcel.mo12585p(4, slice.f7602d);
        return slice;
    }

    public static void write(Slice slice, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        SliceSpec sliceSpec = slice.f7599a;
        versionedParcel.mo12589t(1);
        versionedParcel.mo12569G(sliceSpec);
        versionedParcel.mo12590u(2, slice.f7600b);
        versionedParcel.mo12590u(3, slice.f7601c);
        versionedParcel.mo12567E(4, slice.f7602d);
    }
}
