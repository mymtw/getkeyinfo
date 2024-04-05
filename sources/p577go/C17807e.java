package p577go;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.linkedin.android.litr.exception.TrackTranscoderException;
import p633no.C18285c;

/* renamed from: go.e */
public final class C17807e implements C17804b {

    /* renamed from: a */
    public MediaCodec f38713a;

    /* renamed from: b */
    public boolean f38714b = true;

    /* renamed from: c */
    public boolean f38715c;

    /* renamed from: d */
    public final MediaCodec.BufferInfo f38716d = new MediaCodec.BufferInfo();

    /* renamed from: a */
    public final void mo69046a(MediaFormat mediaFormat) throws TrackTranscoderException {
        if (!mediaFormat.containsKey("color-format")) {
            mediaFormat.setInteger("color-format", 2130708361);
        }
        this.f38713a = C18285c.m30912c(mediaFormat, (Surface) null, true, TrackTranscoderException.Error.ENCODER_NOT_FOUND, TrackTranscoderException.Error.ENCODER_FORMAT_NOT_FOUND, TrackTranscoderException.Error.ENCODER_CONFIGURATION_ERROR);
        this.f38714b = false;
    }
}
