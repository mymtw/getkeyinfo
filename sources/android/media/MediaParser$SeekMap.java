package android.media;

import android.annotation.NonNull;
import android.util.Pair;

public final /* synthetic */ class MediaParser$SeekMap {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ long getDurationMicros();

    @NonNull
    public native /* synthetic */ Pair<MediaParser$SeekPoint, MediaParser$SeekPoint> getSeekPoints(long j);

    public native /* synthetic */ boolean isSeekable();
}
