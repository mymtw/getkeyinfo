package com.linkedin.android.litr.exception;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.Log;
import androidx.compose.animation.C0391c;
import java.util.Arrays;

public class TrackTranscoderException extends MediaTransformationException {

    /* renamed from: b */
    public static final String f37414b = TrackTranscoderException.class.getName();
    private final Error error;
    private final MediaCodec mediaCodec;
    private final MediaCodecList mediaCodecList;
    private final MediaFormat mediaFormat;

    public enum Error {
        DECODER_FORMAT_NOT_FOUND("Failed to create decoder codec."),
        DECODER_CONFIGURATION_ERROR("Failed to configure decoder codec."),
        ENCODER_FORMAT_NOT_FOUND("Failed to create encoder codec."),
        ENCODER_CONFIGURATION_ERROR("Failed to configure encoder codec."),
        DECODER_NOT_FOUND("No decoder found."),
        ENCODER_NOT_FOUND("No encoder found."),
        CODEC_IN_RELEASED_STATE("Codecs are in released state."),
        SOURCE_TRACK_MIME_TYPE_NOT_FOUND("Mime type not found for the source track."),
        NO_TRACKS_FOUND("No tracks found."),
        INTERNAL_CODEC_ERROR("Internal codec error occurred."),
        NO_FRAME_AVAILABLE("No frame available for specified tag"),
        DECODER_NOT_PROVIDED("Decoder is not provided"),
        ENCODER_NOT_PROVIDED("Encoder is not provided"),
        RENDERER_NOT_PROVIDED("Renderer is not provided");
        
        /* access modifiers changed from: private */
        public final String message;

        private Error(String str) {
            this.message = str;
        }
    }

    public TrackTranscoderException(Error error2) {
        this(error2, (MediaFormat) null, (MediaCodec) null, (MediaCodecList) null);
    }

    /* renamed from: a */
    public static String m28538a(MediaCodecInfo mediaCodecInfo) {
        StringBuilder h = C0072d.m201h("MediaCodecInfo: ");
        h.append(mediaCodecInfo.getName());
        h.append(',');
        h.append(mediaCodecInfo.isEncoder());
        h.append(',');
        h.append(Arrays.asList(mediaCodecInfo.getSupportedTypes()).toString());
        return h.toString();
    }

    public Error getError() {
        return this.error;
    }

    public String getMessage() {
        return this.error.message;
    }

    public String toString() {
        String str;
        String c = C0391c.m1057c(new StringBuilder(), super.toString(), 10);
        if (this.mediaFormat != null) {
            StringBuilder k = C0073e.m211k(c, "Media format: ");
            k.append(this.mediaFormat.toString());
            k.append(10);
            c = k.toString();
        }
        if (this.mediaCodec != null) {
            StringBuilder k2 = C0073e.m211k(c, "Selected media codec info: ");
            try {
                str = m28538a(this.mediaCodec.getCodecInfo());
            } catch (IllegalStateException unused) {
                Log.e(f37414b, "Failed to retrieve media codec info.");
                str = "";
            }
            c = C0391c.m1057c(k2, str, 10);
        }
        if (this.mediaCodecList != null) {
            StringBuilder k3 = C0073e.m211k(c, "Available media codec info list (Name, IsEncoder, Supported Types): ");
            MediaCodecList mediaCodecList2 = this.mediaCodecList;
            StringBuilder sb = new StringBuilder();
            try {
                for (MediaCodecInfo mediaCodecInfo : mediaCodecList2.getCodecInfos()) {
                    if (mediaCodecInfo != null) {
                        sb.append(10);
                        sb.append(m28538a(mediaCodecInfo));
                    }
                }
            } catch (IllegalStateException e) {
                Log.e(f37414b, "Failed to retrieve media codec info.", e);
            }
            k3.append(sb.toString());
            c = k3.toString();
        }
        if (getCause() == null) {
            return c;
        }
        StringBuilder k4 = C0073e.m211k(c, "Diagnostic info: ");
        Throwable cause = getCause();
        k4.append(!(cause instanceof MediaCodec.CodecException) ? null : ((MediaCodec.CodecException) cause).getDiagnosticInfo());
        return k4.toString();
    }

    public TrackTranscoderException(Error error2, Throwable th) {
        this(error2, (MediaFormat) null, (MediaCodec) null, (MediaCodecList) null, th);
    }

    public TrackTranscoderException(Error error2, MediaFormat mediaFormat2, MediaCodec mediaCodec2, MediaCodecList mediaCodecList2) {
        this(error2, mediaFormat2, mediaCodec2, mediaCodecList2, (Throwable) null);
    }

    public TrackTranscoderException(Error error2, MediaFormat mediaFormat2, MediaCodec mediaCodec2, MediaCodecList mediaCodecList2, Throwable th) {
        super(th);
        this.error = error2;
        this.mediaFormat = mediaFormat2;
        this.mediaCodec = mediaCodec2;
        this.mediaCodecList = mediaCodecList2;
    }
}
