package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.internal.C15686c0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import p517bn.C14109d0;
import p605kk.C18122f;
import p605kk.C18123g;

/* renamed from: com.google.android.play.core.assetpacks.x2 */
public final class C15673x2 implements C15686c0, C18122f {

    /* renamed from: b */
    public Object f35408b;

    public /* synthetic */ C15673x2(Object obj) {
        this.f35408b = obj;
    }

    public final C18123g then(Object obj) {
        return FirebaseMessaging.lambda$unsubscribeFromTopic$7((String) this.f35408b, (C14109d0) obj);
    }

    public final Object zza() {
        Context a = ((C15669w2) ((C15686c0) this.f35408b)).mo55501a();
        try {
            Bundle bundle = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public /* synthetic */ C15673x2() {
        this.f35408b = new ArrayList(2);
    }
}
