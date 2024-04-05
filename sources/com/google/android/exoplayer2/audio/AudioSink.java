package com.google.android.exoplayer2.audio;

import android.support.p013v4.media.C0072d;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import p594jh.C17986y0;
import p611lh.C18167d;
import p611lh.C18179o;

public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InitializationException(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.Format r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L_0x0005
                java.lang.String r0 = " (recoverable)"
                goto L_0x0007
            L_0x0005:
                java.lang.String r0 = ""
            L_0x0007:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = "Config("
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = ", "
                r2.append(r5)
                r2.append(r6)
                r2.append(r5)
                r2.append(r7)
                java.lang.String r5 = ")"
                r2.append(r5)
                r2.append(r0)
                java.lang.String r5 = r2.toString()
                r3.<init>(r5, r10)
                r3.audioTrackState = r4
                r3.isRecoverable = r9
                r3.format = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, com.google.android.exoplayer2.Format, boolean, java.lang.Exception):void");
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedDiscontinuityException(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = ", got "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.actualPresentationTimeUs = r3
                r2.expectedPresentationTimeUs = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i, Format format2, boolean z) {
            super(C0072d.m200g(36, "AudioTrack write failed: ", i));
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = format2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    public interface C14179a {
    }

    /* renamed from: a */
    C17986y0 mo47185a();

    /* renamed from: b */
    void mo47186b(C17986y0 y0Var);

    /* renamed from: c */
    void mo47187c(float f);

    /* renamed from: d */
    boolean mo47188d();

    /* renamed from: e */
    void mo47189e(int i);

    /* renamed from: f */
    void mo47190f(C18167d dVar);

    void flush();

    /* renamed from: g */
    void mo47192g(Format format, int[] iArr) throws ConfigurationException;

    /* renamed from: h */
    void mo47193h();

    /* renamed from: i */
    void mo47194i(C18179o oVar);

    boolean isEnded();

    /* renamed from: j */
    boolean mo47196j(ByteBuffer byteBuffer, long j, int i) throws InitializationException, WriteException;

    /* renamed from: k */
    int mo47197k(Format format);

    /* renamed from: l */
    void mo47198l() throws WriteException;

    /* renamed from: m */
    long mo47199m(boolean z);

    /* renamed from: n */
    void mo47200n();

    /* renamed from: o */
    void mo47201o();

    /* renamed from: p */
    void mo47202p(boolean z);

    void pause();

    void play();

    void reset();

    boolean supportsFormat(Format format);

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th, Format format2) {
            super(th);
            this.format = format2;
        }

        public ConfigurationException(String str, Format format2) {
            super(str);
            this.format = format2;
        }
    }
}
