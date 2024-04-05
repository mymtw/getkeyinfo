package com.etsy.android.p327ui.user.review;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p019b.C3445b;

/* renamed from: com.etsy.android.ui.user.review.x */
public final class C11755x extends C3445b {

    /* renamed from: a */
    public Integer f26193a;

    /* renamed from: a */
    public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
        Uri uri = (Uri) obj;
        C19383o.m32797g(componentActivity, ResponseConstants.CONTEXT);
        C19383o.m32797g(uri, "input");
        new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
        Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri).putExtra("android.intent.extra.durationLimit", this.f26193a);
        C19383o.m32796f(putExtra, "Intent(MediaStore.ACTION…ION_LIMIT, videoDuration)");
        return putExtra;
    }
}
