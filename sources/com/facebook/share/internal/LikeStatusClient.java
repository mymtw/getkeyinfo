package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.internal.PlatformServiceClient;
import kotlin.jvm.internal.C19383o;

public final class LikeStatusClient extends PlatformServiceClient {
    private final String objectId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LikeStatusClient(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str, (String) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "applicationId");
        C19383o.m32797g(str2, "objectId");
        this.objectId = str2;
    }

    public void populateRequestBundle(Bundle bundle) {
        C19383o.m32797g(bundle, "data");
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.objectId);
    }
}
