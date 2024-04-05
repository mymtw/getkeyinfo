package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.s */
public final class C17459s {

    /* renamed from: s */
    public static final long f38146s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    public int f38147a;

    /* renamed from: b */
    public long f38148b;

    /* renamed from: c */
    public final Uri f38149c;

    /* renamed from: d */
    public final int f38150d;

    /* renamed from: e */
    public final List<C17469y> f38151e;

    /* renamed from: f */
    public final int f38152f;

    /* renamed from: g */
    public final int f38153g;

    /* renamed from: h */
    public final boolean f38154h;

    /* renamed from: i */
    public final int f38155i;

    /* renamed from: j */
    public final boolean f38156j;

    /* renamed from: k */
    public final boolean f38157k;

    /* renamed from: l */
    public final float f38158l;

    /* renamed from: m */
    public final float f38159m;

    /* renamed from: n */
    public final float f38160n;

    /* renamed from: o */
    public final boolean f38161o;

    /* renamed from: p */
    public final boolean f38162p;

    /* renamed from: q */
    public final Bitmap.Config f38163q;

    /* renamed from: r */
    public final Picasso.Priority f38164r;

    /* renamed from: com.squareup.picasso.s$a */
    public static final class C17460a {

        /* renamed from: a */
        public Uri f38165a;

        /* renamed from: b */
        public int f38166b;

        /* renamed from: c */
        public int f38167c;

        /* renamed from: d */
        public int f38168d;

        /* renamed from: e */
        public ArrayList f38169e;

        /* renamed from: f */
        public Bitmap.Config f38170f;

        /* renamed from: g */
        public Picasso.Priority f38171g;

        public C17460a(Uri uri, int i, Bitmap.Config config) {
            this.f38165a = uri;
            this.f38166b = i;
            this.f38170f = config;
        }

        /* renamed from: a */
        public final void mo68634a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f38167c = i;
                this.f38168d = i2;
            }
        }
    }

    public C17459s(Uri uri, int i, ArrayList arrayList, int i2, int i3, Bitmap.Config config, Picasso.Priority priority) {
        this.f38149c = uri;
        this.f38150d = i;
        if (arrayList == null) {
            this.f38151e = null;
        } else {
            this.f38151e = Collections.unmodifiableList(arrayList);
        }
        this.f38152f = i2;
        this.f38153g = i3;
        this.f38154h = false;
        this.f38156j = false;
        this.f38155i = 0;
        this.f38157k = false;
        this.f38158l = 0.0f;
        this.f38159m = 0.0f;
        this.f38160n = 0.0f;
        this.f38161o = false;
        this.f38162p = false;
        this.f38163q = config;
        this.f38164r = priority;
    }

    /* renamed from: a */
    public final boolean mo68629a() {
        return (this.f38152f == 0 && this.f38153g == 0) ? false : true;
    }

    /* renamed from: b */
    public final String mo68630b() {
        long nanoTime = System.nanoTime() - this.f38148b;
        if (nanoTime > f38146s) {
            return mo68632d() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return mo68632d() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* renamed from: c */
    public final boolean mo68631c() {
        return mo68629a() || this.f38158l != 0.0f;
    }

    /* renamed from: d */
    public final String mo68632d() {
        return C0073e.m208h(C0072d.m201h("[R"), this.f38147a, ']');
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f38150d;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f38149c);
        }
        List<C17469y> list = this.f38151e;
        if (list != null && !list.isEmpty()) {
            for (C17469y key : this.f38151e) {
                sb.append(' ');
                sb.append(key.key());
            }
        }
        if (this.f38152f > 0) {
            sb.append(" resize(");
            sb.append(this.f38152f);
            sb.append(',');
            sb.append(this.f38153g);
            sb.append(')');
        }
        if (this.f38154h) {
            sb.append(" centerCrop");
        }
        if (this.f38156j) {
            sb.append(" centerInside");
        }
        if (this.f38158l != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f38158l);
            if (this.f38161o) {
                sb.append(" @ ");
                sb.append(this.f38159m);
                sb.append(',');
                sb.append(this.f38160n);
            }
            sb.append(')');
        }
        if (this.f38162p) {
            sb.append(" purgeable");
        }
        if (this.f38163q != null) {
            sb.append(' ');
            sb.append(this.f38163q);
        }
        sb.append('}');
        return sb.toString();
    }
}
