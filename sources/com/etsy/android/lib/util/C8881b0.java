package com.etsy.android.lib.util;

import android.app.Activity;
import android.provider.MediaStore;
import com.etsy.android.p327ui.BOEActivity;
import java.lang.ref.WeakReference;

/* renamed from: com.etsy.android.lib.util.b0 */
public final class C8881b0 {

    /* renamed from: b */
    public static final String f19629b = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: c */
    public static final String[] f19630c = {"_display_name", "_data", "date_added"};

    /* renamed from: a */
    public final WeakReference<Activity> f19631a;

    public C8881b0(BOEActivity bOEActivity) {
        this.f19631a = new WeakReference<>(bOEActivity);
    }
}
