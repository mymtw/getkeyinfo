package com.squareup.picasso;

import android.support.p013v4.media.C0072d;
import java.io.PrintWriter;
import p003a2.C0015b;

/* renamed from: com.squareup.picasso.x */
public final class C17468x {

    /* renamed from: a */
    public final int f38197a;

    /* renamed from: b */
    public final int f38198b;

    /* renamed from: c */
    public final long f38199c;

    /* renamed from: d */
    public final long f38200d;

    /* renamed from: e */
    public final long f38201e;

    /* renamed from: f */
    public final long f38202f;

    /* renamed from: g */
    public final long f38203g;

    /* renamed from: h */
    public final long f38204h;

    /* renamed from: i */
    public final long f38205i;

    /* renamed from: j */
    public final long f38206j;

    /* renamed from: k */
    public final int f38207k;

    /* renamed from: l */
    public final int f38208l;

    /* renamed from: m */
    public final int f38209m;

    /* renamed from: n */
    public final long f38210n;

    public C17468x(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f38197a = i;
        this.f38198b = i2;
        this.f38199c = j;
        this.f38200d = j2;
        this.f38201e = j3;
        this.f38202f = j4;
        this.f38203g = j5;
        this.f38204h = j6;
        this.f38205i = j7;
        this.f38206j = j8;
        this.f38207k = i3;
        this.f38208l = i4;
        this.f38209m = i5;
        this.f38210n = j9;
    }

    /* renamed from: a */
    public final void mo68639a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f38197a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f38198b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f38198b) / ((float) this.f38197a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f38199c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f38200d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f38207k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f38201e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f38204h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f38208l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f38202f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f38209m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f38203g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f38205i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f38206j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("StatsSnapshot{maxSize=");
        h.append(this.f38197a);
        h.append(", size=");
        h.append(this.f38198b);
        h.append(", cacheHits=");
        h.append(this.f38199c);
        h.append(", cacheMisses=");
        h.append(this.f38200d);
        h.append(", downloadCount=");
        h.append(this.f38207k);
        h.append(", totalDownloadSize=");
        h.append(this.f38201e);
        h.append(", averageDownloadSize=");
        h.append(this.f38204h);
        h.append(", totalOriginalBitmapSize=");
        h.append(this.f38202f);
        h.append(", totalTransformedBitmapSize=");
        h.append(this.f38203g);
        h.append(", averageOriginalBitmapSize=");
        h.append(this.f38205i);
        h.append(", averageTransformedBitmapSize=");
        h.append(this.f38206j);
        h.append(", originalBitmapCount=");
        h.append(this.f38208l);
        h.append(", transformedBitmapCount=");
        h.append(this.f38209m);
        h.append(", timeStamp=");
        return C0015b.m91j(h, this.f38210n, '}');
    }
}
