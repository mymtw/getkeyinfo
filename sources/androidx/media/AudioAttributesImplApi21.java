package androidx.media;

import android.media.AudioAttributes;
import android.support.p013v4.media.C0072d;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f6550a;

    /* renamed from: b */
    public int f6551b = -1;

    public AudioAttributesImplApi21() {
    }

    /* renamed from: a */
    public final int mo10858a() {
        int i = this.f6551b;
        return i != -1 ? i : AudioAttributesCompat.m6828b(this.f6550a.getFlags(), this.f6550a.getUsage());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f6550a.equals(((AudioAttributesImplApi21) obj).f6550a);
    }

    public final int hashCode() {
        return this.f6550a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AudioAttributesCompat: audioattributes=");
        h.append(this.f6550a);
        return h.toString();
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f6550a = audioAttributes;
    }
}
