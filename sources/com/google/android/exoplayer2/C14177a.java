package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import p513bj.C14064l;
import p513bj.C14075p;
import p594jh.C17904d1;
import p594jh.C17908e1;
import p594jh.C17911f1;
import p594jh.C17948m0;
import p595ji.C18000l;

/* renamed from: com.google.android.exoplayer2.a */
public abstract class C14177a implements C17904d1, C17908e1 {
    private C17911f1 configuration;
    private final C17948m0 formatHolder = new C17948m0();
    private int index;
    private long lastResetPositionUs;
    private long readingPositionUs = Long.MIN_VALUE;
    private int state;
    private C18000l stream;
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;

    public C14177a(int i) {
        this.trackType = i;
    }

    public final ExoPlaybackException createRendererException(Throwable th, Format format) {
        return createRendererException(th, format, false);
    }

    public final void disable() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        C14075p.m21694f(z);
        C17948m0 m0Var = this.formatHolder;
        m0Var.f39133a = null;
        m0Var.f39134b = null;
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    public final void enable(C17911f1 f1Var, Format[] formatArr, C18000l lVar, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        long j4 = j;
        boolean z3 = z;
        C14075p.m21694f(this.state == 0);
        this.configuration = f1Var;
        this.state = 1;
        this.lastResetPositionUs = j4;
        onEnabled(z3, z2);
        replaceStream(formatArr, lVar, j2, j3);
        onPositionReset(j4, z3);
    }

    public final C17908e1 getCapabilities() {
        return this;
    }

    public final C17911f1 getConfiguration() {
        C17911f1 f1Var = this.configuration;
        f1Var.getClass();
        return f1Var;
    }

    public final C17948m0 getFormatHolder() {
        C17948m0 m0Var = this.formatHolder;
        m0Var.f39133a = null;
        m0Var.f39134b = null;
        return m0Var;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    public C14064l getMediaClock() {
        return null;
    }

    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    public final int getState() {
        return this.state;
    }

    public final C18000l getStream() {
        return this.stream;
    }

    public final Format[] getStreamFormats() {
        Format[] formatArr = this.streamFormats;
        formatArr.getClass();
        return formatArr;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
    }

    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        C18000l lVar = this.stream;
        lVar.getClass();
        return lVar.isReady();
    }

    public final void maybeThrowStreamError() throws IOException {
        C18000l lVar = this.stream;
        lVar.getClass();
        lVar.mo47680c();
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
    }

    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
    }

    public void onReset() {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() {
    }

    public void onStreamChanged(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
    }

    public final int readSource(C17948m0 m0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        C18000l lVar = this.stream;
        lVar.getClass();
        int j = lVar.mo47683j(m0Var, decoderInputBuffer, i);
        if (j == -4) {
            if (decoderInputBuffer.mo69761h(4)) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            long j2 = decoderInputBuffer.f31495f + this.streamOffsetUs;
            decoderInputBuffer.f31495f = j2;
            this.readingPositionUs = Math.max(this.readingPositionUs, j2);
        } else if (j == -5) {
            Format format = m0Var.f39134b;
            format.getClass();
            if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                Format.C14176b buildUpon = format.buildUpon();
                buildUpon.f31307o = format.subsampleOffsetUs + this.streamOffsetUs;
                m0Var.f39134b = buildUpon.mo47144a();
            }
        }
        return j;
    }

    public final void replaceStream(Format[] formatArr, C18000l lVar, long j, long j2) throws ExoPlaybackException {
        C14075p.m21694f(!this.streamIsFinal);
        this.stream = lVar;
        this.readingPositionUs = j2;
        this.streamFormats = formatArr;
        this.streamOffsetUs = j2;
        onStreamChanged(formatArr, j, j2);
    }

    public final void reset() {
        C14075p.m21694f(this.state == 0);
        C17948m0 m0Var = this.formatHolder;
        m0Var.f39133a = null;
        m0Var.f39134b = null;
        onReset();
    }

    public final void resetPosition(long j) throws ExoPlaybackException {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        onPositionReset(j, false);
    }

    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public int skipSource(long j) {
        C18000l lVar = this.stream;
        lVar.getClass();
        return lVar.mo47681f(j - this.streamOffsetUs);
    }

    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        C14075p.m21694f(z);
        this.state = 2;
        onStarted();
    }

    public final void stop() {
        C14075p.m21694f(this.state == 2);
        this.state = 1;
        onStopped();
    }

    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public final ExoPlaybackException createRendererException(Throwable th, Format format, boolean z) {
        int i;
        if (format != null && !this.throwRendererExceptionIsExecuting) {
            this.throwRendererExceptionIsExecuting = true;
            try {
                i = supportsFormat(format) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
            return ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, i, z);
        }
        i = 4;
        return ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, i, z);
    }
}
