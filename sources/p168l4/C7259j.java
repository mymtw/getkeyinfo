package p168l4;

import android.app.ActivityManager;
import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l4.j */
public final class C7259j {

    /* renamed from: a */
    public final int f16108a;

    /* renamed from: b */
    public final int f16109b;

    /* renamed from: c */
    public final int f16110c;

    /* renamed from: l4.j$a */
    public static final class C7260a {

        /* renamed from: a */
        public final Context f16111a;

        /* renamed from: b */
        public ActivityManager f16112b;

        /* renamed from: c */
        public C7261b f16113c;

        /* renamed from: d */
        public float f16114d = 2.0f;

        /* renamed from: e */
        public float f16115e = ((float) 1);

        /* renamed from: f */
        public int f16116f = 4194304;

        public C7260a(Context context) {
            this.f16111a = context;
            this.f16112b = (ActivityManager) context.getSystemService("activity");
            this.f16113c = new C7261b(context.getResources().getDisplayMetrics());
            if (this.f16112b.isLowRamDevice()) {
                this.f16115e = 0.0f;
            }
        }
    }

    /* renamed from: l4.j$b */
    public static final class C7261b {

        /* renamed from: a */
        public final DisplayMetrics f16117a;

        public C7261b(DisplayMetrics displayMetrics) {
            this.f16117a = displayMetrics;
        }
    }

    public C7259j(C7260a aVar) {
        Context context = aVar.f16111a;
        int i = aVar.f16112b.isLowRamDevice() ? aVar.f16116f / 2 : aVar.f16116f;
        this.f16110c = i;
        ActivityManager activityManager = aVar.f16112b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE * RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f16113c.f16117a;
        float f = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f16115e * f);
        int round3 = Math.round(f * aVar.f16114d);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.f16109b = round3;
            this.f16108a = round2;
        } else {
            float f2 = (float) i2;
            float f3 = aVar.f16115e;
            float f4 = aVar.f16114d;
            float f5 = f2 / (f3 + f4);
            this.f16109b = Math.round(f4 * f5);
            this.f16108a = Math.round(f5 * aVar.f16115e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder h = C0072d.m201h("Calculation complete, Calculated memory cache size: ");
            h.append(Formatter.formatFileSize(context, (long) this.f16109b));
            h.append(", pool size: ");
            h.append(Formatter.formatFileSize(context, (long) this.f16108a));
            h.append(", byte array size: ");
            h.append(Formatter.formatFileSize(context, (long) i));
            h.append(", memory class limited? ");
            h.append(i3 > round);
            h.append(", max size: ");
            h.append(Formatter.formatFileSize(context, (long) round));
            h.append(", memoryClass: ");
            h.append(aVar.f16112b.getMemoryClass());
            h.append(", isLowMemoryDevice: ");
            h.append(aVar.f16112b.isLowRamDevice());
            Log.d("MemorySizeCalculator", h.toString());
        }
    }
}
