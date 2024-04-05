package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6550a = (AudioAttributes) versionedParcel.mo12583n(audioAttributesImplApi26.f6550a, 1);
        audioAttributesImplApi26.f6551b = versionedParcel.mo12580k(audioAttributesImplApi26.f6551b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.mo12565C(audioAttributesImplApi26.f6550a, 1);
        versionedParcel.mo12595z(audioAttributesImplApi26.f6551b, 2);
    }
}
