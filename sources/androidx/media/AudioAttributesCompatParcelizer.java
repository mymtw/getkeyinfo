package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f6549a = (AudioAttributesImpl) versionedParcel.mo12588s(audioAttributesCompat.f6549a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6549a;
        versionedParcel.mo12589t(1);
        versionedParcel.mo12569G(audioAttributesImpl);
    }
}
