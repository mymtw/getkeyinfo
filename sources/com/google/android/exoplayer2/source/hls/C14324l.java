package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.hls.C14325m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17948m0;
import p595ji.C18000l;

/* renamed from: com.google.android.exoplayer2.source.hls.l */
public final class C14324l implements C18000l {

    /* renamed from: b */
    public final int f31947b;

    /* renamed from: c */
    public final C14325m f31948c;

    /* renamed from: d */
    public int f31949d = -1;

    public C14324l(C14325m mVar, int i) {
        this.f31948c = mVar;
        this.f31947b = i;
    }

    /* renamed from: a */
    public final void mo47736a() {
        C14075p.m21691c(this.f31949d == -1);
        C14325m mVar = this.f31948c;
        int i = this.f31947b;
        mVar.mo47749v();
        mVar.f31961K.getClass();
        int i2 = mVar.f31961K[i];
        if (i2 != -1) {
            boolean[] zArr = mVar.f31964N;
            if (!zArr[i2]) {
                zArr[i2] = true;
                this.f31949d = i2;
            }
        } else if (mVar.f31960J.contains(mVar.f31959I.get(i))) {
            i2 = -3;
            this.f31949d = i2;
        }
        i2 = -2;
        this.f31949d = i2;
    }

    /* renamed from: c */
    public final void mo47680c() throws IOException {
        int i = this.f31949d;
        if (i == -2) {
            C14325m mVar = this.f31948c;
            mVar.mo47749v();
            throw new SampleQueueMappingException(mVar.f31959I.get(this.f31947b).getFormat(0).sampleMimeType);
        } else if (i == -1) {
            this.f31948c.mo47740E();
        } else if (i != -3) {
            C14325m mVar2 = this.f31948c;
            mVar2.mo47740E();
            C14325m.C14328c cVar = mVar2.f31995v[i];
            DrmSession drmSession = cVar.f32290i;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException f = cVar.f32290i.mo47278f();
                f.getClass();
                throw f;
            }
        }
    }

    /* renamed from: f */
    public final int mo47681f(long j) {
        int i = this.f31949d;
        boolean z = true;
        if (!((i == -1 || i == -3 || i == -2) ? false : true)) {
            return 0;
        }
        C14325m mVar = this.f31948c;
        if (mVar.mo47738C()) {
            return 0;
        }
        C14325m.C14328c cVar = mVar.f31995v[i];
        int o = cVar.mo47848o(j, mVar.f31970T);
        ArrayList arrayList = mVar.f31987n;
        Object obj = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            obj = arrayList.get(arrayList.size() - 1);
        }
        C14321i iVar = (C14321i) obj;
        if (iVar != null && !iVar.f31908K) {
            o = Math.min(o, iVar.mo47730e(i) - (cVar.f32299r + cVar.f32301t));
        }
        synchronized (cVar) {
            if (o >= 0) {
                try {
                    if (cVar.f32301t + o <= cVar.f32298q) {
                        C14075p.m21691c(z);
                        cVar.f32301t += o;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
            C14075p.m21691c(z);
            cVar.f32301t += o;
        }
        return o;
    }

    public final boolean isReady() {
        int i = this.f31949d;
        if (i == -3) {
            return true;
        }
        if ((i == -1 || i == -3 || i == -2) ? false : true) {
            C14325m mVar = this.f31948c;
            if (!mVar.mo47738C() && mVar.f31995v[i].mo47850q(mVar.f31970T)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final int mo47683j(C17948m0 m0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        Format format;
        Format format2;
        boolean z;
        int i2;
        C17948m0 m0Var2 = m0Var;
        DecoderInputBuffer decoderInputBuffer2 = decoderInputBuffer;
        int i3 = this.f31949d;
        if (i3 == -3) {
            decoderInputBuffer2.mo69760g(4);
            return -4;
        }
        int i4 = 0;
        if ((i3 == -1 || i3 == -3 || i3 == -2) ? false : true) {
            C14325m mVar = this.f31948c;
            if (!mVar.mo47738C()) {
                if (!mVar.f31987n.isEmpty()) {
                    int i5 = 0;
                    while (i5 < mVar.f31987n.size() - 1) {
                        int i6 = mVar.f31987n.get(i5).f31909k;
                        int length = mVar.f31995v.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                z = true;
                                break;
                            }
                            if (mVar.f31964N[i7]) {
                                C14325m.C14328c cVar = mVar.f31995v[i7];
                                synchronized (cVar) {
                                    i2 = cVar.f32301t != cVar.f32298q ? cVar.f32292k[cVar.mo47847n(cVar.f32301t)] : cVar.f32277D;
                                }
                                if (i2 == i6) {
                                    z = false;
                                    break;
                                }
                            }
                            i7++;
                        }
                        if (!z) {
                            break;
                        }
                        i5++;
                    }
                    ArrayList<C14321i> arrayList = mVar.f31987n;
                    int i8 = C14049b0.f30913a;
                    if (i5 > arrayList.size() || i5 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (i5 != 0) {
                        arrayList.subList(0, i5).clear();
                    }
                    C14321i iVar = mVar.f31987n.get(0);
                    Format format3 = iVar.f39828d;
                    if (!format3.equals(mVar.f31957G)) {
                        format2 = format3;
                        mVar.f31984k.mo47788b(mVar.f31975b, format3, iVar.f39829e, iVar.f39830f, iVar.f39831g);
                    } else {
                        format2 = format3;
                    }
                    mVar.f31957G = format2;
                }
                if (mVar.f31987n.isEmpty() || mVar.f31987n.get(0).f31908K) {
                    int t = mVar.f31995v[i3].mo47853t(m0Var2, decoderInputBuffer2, i, mVar.f31970T);
                    if (t != -5) {
                        return t;
                    }
                    Format format4 = m0Var2.f39134b;
                    format4.getClass();
                    if (i3 == mVar.f31952B) {
                        C14325m.C14328c cVar2 = mVar.f31995v[i3];
                        synchronized (cVar2) {
                            int i9 = cVar2.f32301t != cVar2.f32298q ? cVar2.f32292k[cVar2.mo47847n(cVar2.f32301t)] : cVar2.f32277D;
                        }
                        while (i4 < mVar.f31987n.size() && mVar.f31987n.get(i4).f31909k != i9) {
                            i4++;
                        }
                        if (i4 < mVar.f31987n.size()) {
                            format = mVar.f31987n.get(i4).f39828d;
                        } else {
                            format = mVar.f31956F;
                            format.getClass();
                        }
                        format4 = format4.withManifestFormatInfo(format);
                    }
                    m0Var2.f39134b = format4;
                    return t;
                }
            }
        }
        return -3;
    }
}
