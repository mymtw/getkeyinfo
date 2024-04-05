package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p013v4.media.session.PlaybackStateCompat;

/* renamed from: com.squareup.picasso.n */
public final class C17452n implements C17438d {

    /* renamed from: a */
    public final C17451m f38126a;

    /* renamed from: com.squareup.picasso.n$a */
    public static final class C17453a {

        /* renamed from: a */
        public final Bitmap f38127a;

        /* renamed from: b */
        public final int f38128b;

        public C17453a(Bitmap bitmap, int i) {
            this.f38127a = bitmap;
            this.f38128b = i;
        }
    }

    public C17452n(Context context) {
        StringBuilder sb = C17427a0.f38069a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f38126a = new C17451m((int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7));
    }
}
