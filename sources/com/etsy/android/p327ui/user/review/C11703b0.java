package com.etsy.android.p327ui.user.review;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.activity.ComponentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p019b.C3443a;

/* renamed from: com.etsy.android.ui.user.review.b0 */
public final class C11703b0 extends C3443a<String, Uri> {
    /* renamed from: a */
    public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
        C19383o.m32797g(componentActivity, ResponseConstants.CONTEXT);
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        intent.setType((String) obj);
        return intent;
    }

    /* renamed from: c */
    public final Object mo1147c(int i, Intent intent) {
        Uri data;
        if (!(intent == null || (data = intent.getData()) == null)) {
            if (i == -1) {
                return data;
            }
        }
        return null;
    }
}
