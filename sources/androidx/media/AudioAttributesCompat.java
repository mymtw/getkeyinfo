package androidx.media;

import android.util.SparseIntArray;
import p205p2.C7654d;

public class AudioAttributesCompat implements C7654d {

    /* renamed from: b */
    public static final /* synthetic */ int f6548b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f6549a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: b */
    public static int m6828b(int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                return 3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f6549a;
        return audioAttributesImpl == null ? audioAttributesCompat.f6549a == null : audioAttributesImpl.equals(audioAttributesCompat.f6549a);
    }

    public final int hashCode() {
        return this.f6549a.hashCode();
    }

    public final String toString() {
        return this.f6549a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImplApi26 audioAttributesImplApi26) {
        this.f6549a = audioAttributesImplApi26;
    }
}
