package p625mo;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.appboy.Constants;
import com.linkedin.android.litr.exception.TrackTranscoderException;
import java.util.concurrent.TimeUnit;
import p577go.C17803a;
import p577go.C17804b;
import p577go.C17805c;
import p577go.C17806d;
import p577go.C17807e;
import p600jo.C18042c;
import p600jo.C18043d;
import p617lo.C18213d;
import p633no.C18285c;

/* renamed from: mo.a */
public final class C18254a extends C18256c {

    /* renamed from: m */
    public int f40009m = 2;

    /* renamed from: n */
    public int f40010n = 2;

    /* renamed from: o */
    public int f40011o = 2;

    /* renamed from: p */
    public MediaFormat f40012p;

    public C18254a(int i, int i2, MediaFormat mediaFormat, C17803a aVar, C17804b bVar, C18042c cVar, C18043d dVar, C18213d dVar2) throws TrackTranscoderException {
        super(i, i2, mediaFormat, aVar, bVar, cVar, dVar, dVar2);
        this.f40012p = cVar.mo69606h(i);
        ((C17807e) bVar).mo69046a(this.f40025j);
        dVar2.mo69740c((Surface) null, this.f40012p, this.f40025j);
        MediaFormat mediaFormat2 = this.f40012p;
        C17806d dVar3 = (C17806d) aVar;
        dVar3.getClass();
        dVar3.f38709a = C18285c.m30912c(mediaFormat2, (Surface) null, false, TrackTranscoderException.Error.DECODER_NOT_FOUND, TrackTranscoderException.Error.DECODER_FORMAT_NOT_FOUND, TrackTranscoderException.Error.DECODER_CONFIGURATION_ERROR);
        dVar3.f38711c = false;
    }

    /* renamed from: d */
    public final int mo69798d() throws TrackTranscoderException {
        int i;
        C17805c cVar;
        int i2;
        C17805c cVar2;
        int i3;
        C17805c cVar3;
        if (!((C17807e) this.f40020e).f38715c || !((C17806d) this.f40019d).f38710b) {
            return -3;
        }
        int i4 = 2;
        if (this.f40009m != 3) {
            int c = this.f40016a.mo69600c();
            if (c == this.f40022g || c == -1) {
                int dequeueInputBuffer = ((C17806d) this.f40019d).f38709a.dequeueInputBuffer(0);
                if (dequeueInputBuffer >= 0) {
                    C17806d dVar = (C17806d) this.f40019d;
                    if (dequeueInputBuffer >= 0) {
                        cVar3 = new C17805c(dequeueInputBuffer, dVar.f38709a.getInputBuffer(dequeueInputBuffer), (MediaCodec.BufferInfo) null);
                    } else {
                        dVar.getClass();
                        cVar3 = null;
                    }
                    if (cVar3 != null) {
                        int g = this.f40016a.mo69604g(cVar3.f38707b);
                        long d = this.f40016a.mo69601d();
                        int j = this.f40016a.mo69608j();
                        if (g < 0 || (j & 4) != 0) {
                            cVar3.f38708c.set(0, 0, -1, 4);
                            ((C17806d) this.f40019d).mo69044a(cVar3);
                            Log.d(Constants.APPBOY_PUSH_CONTENT_KEY, "EoS reached on the input stream");
                        } else {
                            this.f40021f.getClass();
                            if (d >= Long.MAX_VALUE) {
                                cVar3.f38708c.set(0, 0, -1, 4);
                                ((C17806d) this.f40019d).mo69044a(cVar3);
                                mo69803a();
                                Log.d(Constants.APPBOY_PUSH_CONTENT_KEY, "Selection end reached on the input stream");
                            } else {
                                cVar3.f38708c.set(0, g, d, j);
                                ((C17806d) this.f40019d).mo69044a(cVar3);
                                this.f40016a.mo69599b();
                            }
                        }
                        i3 = 3;
                        this.f40009m = i3;
                    } else {
                        throw new TrackTranscoderException(TrackTranscoderException.Error.NO_FRAME_AVAILABLE);
                    }
                } else if (dequeueInputBuffer != -1) {
                    Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, "Unhandled value " + dequeueInputBuffer + " when decoding an input frame");
                }
            }
            i3 = 2;
            this.f40009m = i3;
        }
        if (this.f40010n != 3) {
            C17806d dVar2 = (C17806d) this.f40019d;
            int dequeueOutputBuffer = dVar2.f38709a.dequeueOutputBuffer(dVar2.f38712d, 0);
            if (dequeueOutputBuffer >= 0) {
                C17806d dVar3 = (C17806d) this.f40019d;
                if (dequeueOutputBuffer >= 0) {
                    cVar2 = new C17805c(dequeueOutputBuffer, dVar3.f38709a.getOutputBuffer(dequeueOutputBuffer), dVar3.f38712d);
                } else {
                    dVar3.getClass();
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    long j2 = cVar2.f38708c.presentationTimeUs;
                    this.f40021f.getClass();
                    if (j2 >= 0 || (cVar2.f38708c.flags & 4) != 0) {
                        C18213d dVar4 = this.f40018c;
                        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                        long j3 = cVar2.f38708c.presentationTimeUs;
                        this.f40021f.getClass();
                        dVar4.mo69738a(cVar2, timeUnit.toNanos(j3 - 0));
                    }
                    ((C17806d) this.f40019d).f38709a.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((cVar2.f38708c.flags & 4) != 0) {
                        Log.d(Constants.APPBOY_PUSH_CONTENT_KEY, "EoS on decoder output stream");
                        i2 = 3;
                        this.f40010n = i2;
                    }
                } else {
                    throw new TrackTranscoderException(TrackTranscoderException.Error.NO_FRAME_AVAILABLE);
                }
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = ((C17806d) this.f40019d).f38709a.getOutputFormat();
                this.f40012p = outputFormat;
                this.f40018c.mo69741d(outputFormat, this.f40025j);
                Log.d(Constants.APPBOY_PUSH_CONTENT_KEY, "Decoder output format changed: " + this.f40012p);
            } else if (dequeueOutputBuffer != -1) {
                Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, "Unhandled value " + dequeueOutputBuffer + " when receiving decoded input frame");
            }
            i2 = 2;
            this.f40010n = i2;
        }
        if (this.f40011o != 3) {
            C17807e eVar = (C17807e) this.f40020e;
            int dequeueOutputBuffer2 = eVar.f38713a.dequeueOutputBuffer(eVar.f38716d, 0);
            if (dequeueOutputBuffer2 >= 0) {
                C17807e eVar2 = (C17807e) this.f40020e;
                if (dequeueOutputBuffer2 >= 0) {
                    cVar = new C17805c(dequeueOutputBuffer2, eVar2.f38713a.getOutputBuffer(dequeueOutputBuffer2), eVar2.f38716d);
                } else {
                    eVar2.getClass();
                    cVar = null;
                }
                if (cVar != null) {
                    MediaCodec.BufferInfo bufferInfo = cVar.f38708c;
                    int i5 = bufferInfo.flags;
                    if ((i5 & 4) != 0) {
                        Log.d(Constants.APPBOY_PUSH_CONTENT_KEY, "Encoder produced EoS, we are done");
                        this.f40027l = 1.0f;
                        i = 3;
                    } else {
                        if (bufferInfo.size > 0 && (i5 & 2) == 0) {
                            this.f40017b.mo69612c(this.f40023h, cVar.f38707b, bufferInfo);
                            long j4 = this.f40026k;
                            if (j4 > 0) {
                                this.f40027l = ((float) cVar.f38708c.presentationTimeUs) / ((float) j4);
                            }
                        }
                        i = 2;
                    }
                    ((C17807e) this.f40020e).f38713a.releaseOutputBuffer(dequeueOutputBuffer2, false);
                } else {
                    throw new TrackTranscoderException(TrackTranscoderException.Error.NO_FRAME_AVAILABLE);
                }
            } else if (dequeueOutputBuffer2 != -2) {
                if (dequeueOutputBuffer2 != -1) {
                    Log.e(Constants.APPBOY_PUSH_CONTENT_KEY, "Unhandled value " + dequeueOutputBuffer2 + " when receiving encoded output frame");
                }
                i = 2;
            } else {
                MediaFormat outputFormat2 = ((C17807e) this.f40020e).f38713a.getOutputFormat();
                if (!this.f40024i) {
                    this.f40025j = outputFormat2;
                    this.f40023h = this.f40017b.mo69611b(this.f40023h, outputFormat2);
                    this.f40024i = true;
                    this.f40018c.mo69741d(this.f40012p, this.f40025j);
                }
                Log.d(Constants.APPBOY_PUSH_CONTENT_KEY, "Encoder output format received " + outputFormat2);
                i = 1;
            }
            this.f40011o = i;
        }
        int i6 = this.f40011o;
        if (i6 == 1) {
            i4 = 1;
        }
        if (this.f40009m == 3 && this.f40010n == 3 && i6 == 3) {
            return 3;
        }
        return i4;
    }

    /* renamed from: e */
    public final void mo69799e() throws TrackTranscoderException {
        this.f40016a.mo69607i(this.f40022g);
        C17807e eVar = (C17807e) this.f40020e;
        eVar.getClass();
        try {
            if (!eVar.f38715c) {
                eVar.f38713a.start();
                eVar.f38715c = true;
            }
            ((C17806d) this.f40019d).mo69045b();
        } catch (Exception e) {
            throw new TrackTranscoderException(TrackTranscoderException.Error.INTERNAL_CODEC_ERROR, e);
        }
    }

    /* renamed from: f */
    public final void mo69800f() {
        this.f40018c.release();
        C17807e eVar = (C17807e) this.f40020e;
        if (eVar.f38715c) {
            eVar.f38713a.stop();
            eVar.f38715c = false;
        }
        C17807e eVar2 = (C17807e) this.f40020e;
        if (!eVar2.f38714b) {
            eVar2.f38713a.release();
            eVar2.f38714b = true;
        }
        C17806d dVar = (C17806d) this.f40019d;
        if (dVar.f38710b) {
            dVar.f38709a.stop();
            dVar.f38710b = false;
        }
        C17806d dVar2 = (C17806d) this.f40019d;
        if (!dVar2.f38711c) {
            dVar2.f38709a.release();
            dVar2.f38711c = true;
        }
    }
}
