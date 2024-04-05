package p577go;

import android.media.MediaCodec;
import com.linkedin.android.litr.exception.TrackTranscoderException;

/* renamed from: go.d */
public final class C17806d implements C17803a {

    /* renamed from: a */
    public MediaCodec f38709a;

    /* renamed from: b */
    public boolean f38710b;

    /* renamed from: c */
    public boolean f38711c;

    /* renamed from: d */
    public final MediaCodec.BufferInfo f38712d = new MediaCodec.BufferInfo();

    /* renamed from: a */
    public final void mo69044a(C17805c cVar) {
        MediaCodec mediaCodec = this.f38709a;
        int i = cVar.f38706a;
        MediaCodec.BufferInfo bufferInfo = cVar.f38708c;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    /* renamed from: b */
    public final void mo69045b() throws TrackTranscoderException {
        MediaCodec mediaCodec = this.f38709a;
        if (mediaCodec == null) {
            throw new IllegalStateException("Codec is not initialized");
        } else if (!this.f38710b) {
            try {
                mediaCodec.start();
                this.f38710b = true;
            } catch (Exception e) {
                throw new TrackTranscoderException(TrackTranscoderException.Error.INTERNAL_CODEC_ERROR, e);
            }
        }
    }
}
