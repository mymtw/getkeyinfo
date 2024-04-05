package p625mo;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.Surface;
import com.linkedin.android.litr.exception.TrackTranscoderException;
import java.util.concurrent.TimeUnit;
import p577go.C17803a;
import p577go.C17804b;
import p577go.C17805c;
import p577go.C17806d;
import p577go.C17807e;
import p600jo.C18042c;
import p600jo.C18043d;
import p617lo.C18212c;
import p617lo.C18213d;
import p617lo.C18214e;
import p633no.C18285c;
import p633no.C18287e;

/* renamed from: mo.e */
public final class C18258e extends C18256c {

    /* renamed from: m */
    public int f40028m = 2;

    /* renamed from: n */
    public int f40029n = 2;

    /* renamed from: o */
    public int f40030o = 2;

    /* renamed from: p */
    public C18212c f40031p;

    /* renamed from: q */
    public MediaFormat f40032q;

    /* renamed from: r */
    public MediaFormat f40033r;

    public C18258e(int i, int i2, MediaFormat mediaFormat, C17803a aVar, C17804b bVar, C18042c cVar, C18043d dVar, C18213d dVar2) throws TrackTranscoderException {
        super(i, i2, mediaFormat, aVar, bVar, cVar, dVar, dVar2);
        this.f40033r = mediaFormat;
        if (dVar2 instanceof C18212c) {
            this.f40031p = (C18212c) dVar2;
            MediaFormat h = cVar.mo69606h(i);
            this.f40032q = h;
            C18287e.f40136a.getClass();
            Number a = C18287e.C18288a.m30913a(h, "frame-rate");
            if (a != null) {
                this.f40033r.setInteger("frame-rate", a.intValue());
            }
            C17807e eVar = (C17807e) bVar;
            eVar.mo69046a(this.f40025j);
            this.f40031p.mo69740c(eVar.f38713a.createInputSurface(), this.f40032q, this.f40033r);
            MediaFormat mediaFormat2 = this.f40032q;
            C18214e eVar2 = this.f40031p.f39916b;
            Surface surface = eVar2 != null ? eVar2.f39922c : null;
            C17806d dVar3 = (C17806d) aVar;
            dVar3.getClass();
            dVar3.f38709a = C18285c.m30912c(mediaFormat2, surface, false, TrackTranscoderException.Error.DECODER_NOT_FOUND, TrackTranscoderException.Error.DECODER_FORMAT_NOT_FOUND, TrackTranscoderException.Error.DECODER_CONFIGURATION_ERROR);
            dVar3.f38711c = false;
            return;
        }
        StringBuilder h2 = C0072d.m201h("Cannot use non-OpenGL video renderer in ");
        h2.append(C18258e.class.getSimpleName());
        throw new IllegalArgumentException(h2.toString());
    }

    /* renamed from: d */
    public final int mo69798d() throws TrackTranscoderException {
        int i;
        int i2;
        C17805c cVar;
        int i3;
        C17805c cVar2;
        if (!((C17807e) this.f40020e).f38715c || !((C17806d) this.f40019d).f38710b) {
            return -3;
        }
        int i4 = 2;
        C17805c cVar3 = null;
        if (this.f40028m != 3) {
            int c = this.f40016a.mo69600c();
            if (c == this.f40022g || c == -1) {
                int dequeueInputBuffer = ((C17806d) this.f40019d).f38709a.dequeueInputBuffer(0);
                if (dequeueInputBuffer >= 0) {
                    C17806d dVar = (C17806d) this.f40019d;
                    if (dequeueInputBuffer >= 0) {
                        cVar2 = new C17805c(dequeueInputBuffer, dVar.f38709a.getInputBuffer(dequeueInputBuffer), (MediaCodec.BufferInfo) null);
                    } else {
                        dVar.getClass();
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        int g = this.f40016a.mo69604g(cVar2.f38707b);
                        long d = this.f40016a.mo69601d();
                        int j = this.f40016a.mo69608j();
                        if (g < 0 || (j & 4) != 0) {
                            cVar2.f38708c.set(0, 0, -1, 4);
                            ((C17806d) this.f40019d).mo69044a(cVar2);
                            Log.d("e", "EoS reached on the input stream");
                        } else {
                            this.f40021f.getClass();
                            if (d >= Long.MAX_VALUE) {
                                cVar2.f38708c.set(0, 0, -1, 4);
                                ((C17806d) this.f40019d).mo69044a(cVar2);
                                mo69803a();
                                Log.d("e", "EoS reached on the input stream");
                            } else {
                                cVar2.f38708c.set(0, g, d, j);
                                ((C17806d) this.f40019d).mo69044a(cVar2);
                                this.f40016a.mo69599b();
                            }
                        }
                        i3 = 3;
                        this.f40028m = i3;
                    } else {
                        throw new TrackTranscoderException(TrackTranscoderException.Error.NO_FRAME_AVAILABLE);
                    }
                } else if (dequeueInputBuffer != -1) {
                    Log.e("e", "Unhandled value " + dequeueInputBuffer + " when decoding an input frame");
                }
            }
            i3 = 2;
            this.f40028m = i3;
        }
        if (this.f40029n != 3) {
            C17806d dVar2 = (C17806d) this.f40019d;
            int dequeueOutputBuffer = dVar2.f38709a.dequeueOutputBuffer(dVar2.f38712d, 0);
            if (dequeueOutputBuffer >= 0) {
                C17806d dVar3 = (C17806d) this.f40019d;
                if (dequeueOutputBuffer >= 0) {
                    cVar = new C17805c(dequeueOutputBuffer, dVar3.f38709a.getOutputBuffer(dequeueOutputBuffer), dVar3.f38712d);
                } else {
                    dVar3.getClass();
                    cVar = null;
                }
                if (cVar != null) {
                    MediaCodec.BufferInfo bufferInfo = cVar.f38708c;
                    if ((bufferInfo.flags & 4) != 0) {
                        Log.d("e", "EoS on decoder output stream");
                        ((C17806d) this.f40019d).f38709a.releaseOutputBuffer(dequeueOutputBuffer, false);
                        ((C17807e) this.f40020e).f38713a.signalEndOfInputStream();
                        i2 = 3;
                        this.f40029n = i2;
                    } else {
                        long j2 = bufferInfo.presentationTimeUs;
                        this.f40021f.getClass();
                        boolean z = j2 >= 0;
                        ((C17806d) this.f40019d).f38709a.releaseOutputBuffer(dequeueOutputBuffer, z);
                        if (z) {
                            C18212c cVar4 = this.f40031p;
                            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                            long j3 = cVar.f38708c.presentationTimeUs;
                            this.f40021f.getClass();
                            cVar4.mo69738a((C17805c) null, timeUnit.toNanos(j3 - 0));
                        }
                    }
                } else {
                    throw new TrackTranscoderException(TrackTranscoderException.Error.NO_FRAME_AVAILABLE);
                }
            } else if (dequeueOutputBuffer == -2) {
                this.f40032q = ((C17806d) this.f40019d).f38709a.getOutputFormat();
                this.f40031p.getClass();
                Log.d("e", "Decoder output format changed: " + this.f40032q);
            } else if (dequeueOutputBuffer != -1) {
                Log.e("e", "Unhandled value " + dequeueOutputBuffer + " when receiving decoded input frame");
            }
            i2 = 2;
            this.f40029n = i2;
        }
        if (this.f40030o != 3) {
            C17807e eVar = (C17807e) this.f40020e;
            int dequeueOutputBuffer2 = eVar.f38713a.dequeueOutputBuffer(eVar.f38716d, 0);
            if (dequeueOutputBuffer2 >= 0) {
                C17807e eVar2 = (C17807e) this.f40020e;
                if (dequeueOutputBuffer2 >= 0) {
                    cVar3 = new C17805c(dequeueOutputBuffer2, eVar2.f38713a.getOutputBuffer(dequeueOutputBuffer2), eVar2.f38716d);
                } else {
                    eVar2.getClass();
                }
                if (cVar3 != null) {
                    MediaCodec.BufferInfo bufferInfo2 = cVar3.f38708c;
                    int i5 = bufferInfo2.flags;
                    if ((i5 & 4) != 0) {
                        Log.d("e", "Encoder produced EoS, we are done");
                        this.f40027l = 1.0f;
                        i = 3;
                    } else {
                        if (bufferInfo2.size > 0 && (i5 & 2) == 0) {
                            this.f40017b.mo69612c(this.f40023h, cVar3.f38707b, bufferInfo2);
                            long j4 = this.f40026k;
                            if (j4 > 0) {
                                this.f40027l = ((float) cVar3.f38708c.presentationTimeUs) / ((float) j4);
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
                    Log.e("e", "Unhandled value " + dequeueOutputBuffer2 + " when receiving encoded output frame");
                }
                i = 2;
            } else {
                MediaFormat outputFormat = ((C17807e) this.f40020e).f38713a.getOutputFormat();
                if (!this.f40024i) {
                    this.f40025j = outputFormat;
                    this.f40033r = outputFormat;
                    this.f40023h = this.f40017b.mo69611b(this.f40023h, outputFormat);
                    this.f40024i = true;
                    this.f40031p.getClass();
                }
                Log.d("e", "Encoder output format received " + outputFormat);
                i = 1;
            }
            this.f40030o = i;
        }
        int i6 = this.f40030o;
        if (i6 == 1) {
            i4 = 1;
        }
        if (this.f40028m == 3 && this.f40029n == 3 && i6 == 3) {
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
        this.f40031p.release();
    }
}
