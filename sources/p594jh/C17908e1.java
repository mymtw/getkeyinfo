package p594jh;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;

/* renamed from: jh.e1 */
public interface C17908e1 {
    String getName();

    int getTrackType();

    int supportsFormat(Format format) throws ExoPlaybackException;

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;
}
