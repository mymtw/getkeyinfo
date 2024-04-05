package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.widget.LikeView;
import p365hg.C12869i0;
import p453tf.C13418j;

/* renamed from: com.facebook.share.internal.e */
public final class C12368e implements CallbackManagerImpl.C12247a {
    /* renamed from: a */
    public final boolean mo39375a(int i, Intent intent) {
        int requestCode = CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
        if (C12869i0.m20546B(C12348b.f27509t)) {
            C12348b.f27509t = C13418j.m21106b().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", (String) null);
        }
        if (C12869i0.m20546B(C12348b.f27509t)) {
            return false;
        }
        C12348b.m20170i(C12348b.f27509t, LikeView.ObjectType.UNKNOWN, new C12366c(requestCode, i, intent));
        return true;
    }
}
