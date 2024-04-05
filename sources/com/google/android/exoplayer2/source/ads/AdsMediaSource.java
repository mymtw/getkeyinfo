package com.google.android.exoplayer2.source.ads;

import android.support.p013v4.media.C0072d;
import com.google.android.exoplayer2.source.C14294c;
import com.google.android.exoplayer2.source.C14344i;
import java.io.IOException;
import p513bj.C14075p;

public final class AdsMediaSource extends C14294c<C14344i.C14345a> {

    /* renamed from: j */
    public static final /* synthetic */ int f31768j = 0;

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        public AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException(C0072d.m200g(35, "Failed to load ad group ", i), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            C14075p.m21694f(this.type == 3);
            Throwable cause = getCause();
            cause.getClass();
            return (RuntimeException) cause;
        }
    }

    static {
        new C14344i.C14345a(new Object());
    }
}
