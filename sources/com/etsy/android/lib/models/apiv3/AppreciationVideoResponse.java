package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AppreciationVideoResponse {
    public static final int $stable = 8;
    private final AppreciationVideo video;
    private final long videoId;

    public AppreciationVideoResponse(@C17402n(name = "video_id") long j, AppreciationVideo appreciationVideo) {
        C19383o.m32797g(appreciationVideo, "video");
        this.videoId = j;
        this.video = appreciationVideo;
    }

    public static /* synthetic */ AppreciationVideoResponse copy$default(AppreciationVideoResponse appreciationVideoResponse, long j, AppreciationVideo appreciationVideo, int i, Object obj) {
        if ((i & 1) != 0) {
            j = appreciationVideoResponse.videoId;
        }
        if ((i & 2) != 0) {
            appreciationVideo = appreciationVideoResponse.video;
        }
        return appreciationVideoResponse.copy(j, appreciationVideo);
    }

    public final long component1() {
        return this.videoId;
    }

    public final AppreciationVideo component2() {
        return this.video;
    }

    public final AppreciationVideoResponse copy(@C17402n(name = "video_id") long j, AppreciationVideo appreciationVideo) {
        C19383o.m32797g(appreciationVideo, "video");
        return new AppreciationVideoResponse(j, appreciationVideo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppreciationVideoResponse)) {
            return false;
        }
        AppreciationVideoResponse appreciationVideoResponse = (AppreciationVideoResponse) obj;
        return this.videoId == appreciationVideoResponse.videoId && C19383o.m32792b(this.video, appreciationVideoResponse.video);
    }

    public final AppreciationVideo getVideo() {
        return this.video;
    }

    public final long getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        return this.video.hashCode() + (Long.hashCode(this.videoId) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AppreciationVideoResponse(videoId=");
        h.append(this.videoId);
        h.append(", video=");
        h.append(this.video);
        h.append(')');
        return h.toString();
    }
}
