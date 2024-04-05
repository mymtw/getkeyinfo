package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

/* renamed from: com.facebook.share.internal.a */
public final class C12347a implements PlatformServiceClient.C12262a {

    /* renamed from: a */
    public final /* synthetic */ C12348b f27503a;

    public C12347a(C12348b bVar) {
        this.f27503a = bVar;
    }

    /* renamed from: a */
    public final void mo39408a(Bundle bundle) {
        if (bundle != null && bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
            this.f27503a.mo39758n(bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED"), bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE") ? bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE") : this.f27503a.f27515d, bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE") ? bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE") : this.f27503a.f27516e, bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE") ? bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE") : this.f27503a.f27517f, bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE") ? bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE") : this.f27503a.f27518g, bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN") ? bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN") : this.f27503a.f27519h);
        }
    }
}
