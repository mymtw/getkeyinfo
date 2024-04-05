package p594jh;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import p513bj.C14064l;
import p594jh.C17894b1;
import p595ji.C18000l;

/* renamed from: jh.d1 */
public interface C17904d1 extends C17894b1.C17896b {

    /* renamed from: jh.d1$a */
    public interface C17905a {
        /* renamed from: a */
        void mo69370a();

        /* renamed from: b */
        void mo69371b(long j);
    }

    void disable();

    void enable(C17911f1 f1Var, Format[] formatArr, C18000l lVar, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    C17908e1 getCapabilities();

    C14064l getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    C18000l getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void render(long j, long j2) throws ExoPlaybackException;

    void replaceStream(Format[] formatArr, C18000l lVar, long j, long j2) throws ExoPlaybackException;

    void reset();

    void resetPosition(long j) throws ExoPlaybackException;

    void setCurrentStreamFinal();

    void setIndex(int i);

    void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
    }

    void start() throws ExoPlaybackException;

    void stop();
}
