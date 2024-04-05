package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6550a = (AudioAttributes) versionedParcel.mo12583n(audioAttributesImplApi21.f6550a, 1);
        audioAttributesImplApi21.f6551b = versionedParcel.mo12580k(audioAttributesImplApi21.f6551b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.mo12565C(audioAttributesImplApi21.f6550a, 1);
        versionedParcel.mo12595z(audioAttributesImplApi21.f6551b, 2);
    }
}
