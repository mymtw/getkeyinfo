package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6552a = versionedParcel.mo12580k(audioAttributesImplBase.f6552a, 1);
        audioAttributesImplBase.f6553b = versionedParcel.mo12580k(audioAttributesImplBase.f6553b, 2);
        audioAttributesImplBase.f6554c = versionedParcel.mo12580k(audioAttributesImplBase.f6554c, 3);
        audioAttributesImplBase.f6555d = versionedParcel.mo12580k(audioAttributesImplBase.f6555d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.mo12595z(audioAttributesImplBase.f6552a, 1);
        versionedParcel.mo12595z(audioAttributesImplBase.f6553b, 2);
        versionedParcel.mo12595z(audioAttributesImplBase.f6554c, 3);
        versionedParcel.mo12595z(audioAttributesImplBase.f6555d, 4);
    }
}
