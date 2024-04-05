package com.etsy.android.lib.core.posts;

import android.content.Context;
import com.etsy.android.lib.dagger.OkHttpClientHolder;
import java.io.Serializable;

public interface PersistentRequest<Request, Result> extends Serializable {
    PostInfo getPostInfo();

    Request getRequest();

    int getVersionCode();

    boolean isPersisted();

    boolean isValidRequest();

    void onPersisted(Context context);

    boolean onPersistentResult(Context context, Result result);

    Result onPersistentRun(OkHttpClientHolder okHttpClientHolder);

    void onUpgraded(int i, int i2);

    void setPersisted(boolean z);
}
