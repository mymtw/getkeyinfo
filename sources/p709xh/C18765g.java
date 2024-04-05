package p709xh;

import com.etsy.android.lib.requests.EtsyRequest;
import com.google.android.exoplayer2.Format;
import com.google.android.play.core.appupdate.C15562d;
import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p513bj.C14077r;
import p709xh.C18766h;

/* renamed from: xh.g */
public final class C18765g extends C18766h {

    /* renamed from: o */
    public static final byte[] f41574o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f41575n;

    /* renamed from: b */
    public final long mo70249b(C14077r rVar) {
        byte[] bArr = rVar.f30986a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return (((long) this.f41584i) * (((long) b3) * ((long) (i >= 16 ? ShippingUtilsKt.mediumHeightScreen << i2 : i >= 12 ? EtsyRequest.DEFAULT_TIMEOUT << (i2 & 1) : i2 == 3 ? 60000 : EtsyRequest.DEFAULT_TIMEOUT << i2)))) / 1000000;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo70250c(C14077r rVar, long j, C18766h.C18767a aVar) {
        boolean z = true;
        if (!this.f41575n) {
            byte[] copyOf = Arrays.copyOf(rVar.f30986a, rVar.f30988c);
            ArrayList p = C15562d.m25200p(copyOf);
            Format.C14176b bVar = new Format.C14176b();
            bVar.f31303k = "audio/opus";
            bVar.f31316x = copyOf[9] & 255;
            bVar.f31317y = 48000;
            bVar.f31305m = p;
            aVar.f41589a = bVar.mo47144a();
            this.f41575n = true;
            return true;
        }
        aVar.f41589a.getClass();
        if (rVar.mo46912c() != 1332770163) {
            z = false;
        }
        rVar.mo46935z(0);
        return z;
    }

    /* renamed from: d */
    public final void mo70251d(boolean z) {
        super.mo70251d(z);
        if (z) {
            this.f41575n = false;
        }
    }
}
