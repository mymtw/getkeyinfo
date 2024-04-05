package androidx.slice;

import androidx.versionedparcelable.VersionedParcel;
import p205p2.C7654d;

public final class SliceItemHolderParcelizer {
    public static SliceItemHolder read(VersionedParcel versionedParcel) {
        SliceItemHolder sliceItemHolder = new SliceItemHolder();
        sliceItemHolder.f7613a = versionedParcel.mo12588s(sliceItemHolder.f7613a, 1);
        sliceItemHolder.f7614b = versionedParcel.mo12583n(sliceItemHolder.f7614b, 2);
        sliceItemHolder.f7615c = versionedParcel.mo12585p(3, sliceItemHolder.f7615c);
        sliceItemHolder.f7616d = versionedParcel.mo12580k(sliceItemHolder.f7616d, 4);
        long j = sliceItemHolder.f7617e;
        if (versionedParcel.mo12578i(5)) {
            j = versionedParcel.mo12581l();
        }
        sliceItemHolder.f7617e = j;
        return sliceItemHolder;
    }

    public static void write(SliceItemHolder sliceItemHolder, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        C7654d dVar = sliceItemHolder.f7613a;
        versionedParcel.mo12589t(1);
        versionedParcel.mo12569G(dVar);
        versionedParcel.mo12565C(sliceItemHolder.f7614b, 2);
        versionedParcel.mo12567E(3, sliceItemHolder.f7615c);
        versionedParcel.mo12595z(sliceItemHolder.f7616d, 4);
        long j = sliceItemHolder.f7617e;
        versionedParcel.mo12589t(5);
        versionedParcel.mo12563A(j);
    }
}
