package androidx.emoji2.text.flatbuffer;

import android.support.p013v4.media.session.C0087d;

public abstract class Utf8 {

    /* renamed from: a */
    public static Utf8Safe f6026a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super(C0087d.m235e("Unpaired surrogate at index ", i, " of ", i2));
        }
    }
}
