package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p513bj.C14049b0;

public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f31319a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.C14178a r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$a):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioProcessor$a */
    public static final class C14178a {

        /* renamed from: e */
        public static final C14178a f31320e = new C14178a(-1, -1, -1);

        /* renamed from: a */
        public final int f31321a;

        /* renamed from: b */
        public final int f31322b;

        /* renamed from: c */
        public final int f31323c;

        /* renamed from: d */
        public final int f31324d;

        public C14178a(int i, int i2, int i3) {
            this.f31321a = i;
            this.f31322b = i2;
            this.f31323c = i3;
            this.f31324d = C14049b0.m21621B(i3) ? C14049b0.m21647t(i3, i2) : -1;
        }

        public final String toString() {
            int i = this.f31321a;
            int i2 = this.f31322b;
            int i3 = this.f31323c;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i);
            sb.append(", channelCount=");
            sb.append(i2);
            sb.append(", encoding=");
            sb.append(i3);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: a */
    ByteBuffer mo47176a();

    /* renamed from: b */
    void mo47177b(ByteBuffer byteBuffer);

    /* renamed from: c */
    C14178a mo47178c(C14178a aVar) throws UnhandledAudioFormatException;

    /* renamed from: d */
    void mo47179d();

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
