package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.appsflyer.internal.at */
public abstract class C5019at<T> {
    public final Context AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final FutureTask<T> valueOf = new FutureTask<>(new Callable<T>() {
        public final T call() {
            if (C5019at.this.AFInAppEventType()) {
                return C5019at.this.values();
            }
            return null;
        }
    });
    private final String[] values;

    public C5019at(Context context, String str, String... strArr) {
        this.AFInAppEventParameterName = context;
        this.AFInAppEventType = str;
        this.values = strArr;
    }

    public T AFInAppEventParameterName() {
        try {
            return this.valueOf.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return null;
        }
    }

    public final boolean AFInAppEventType() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFInAppEventType, 128);
            return resolveContentProvider != null && Arrays.asList(this.values).contains(C4964aa.valueOf(this.AFInAppEventParameterName.getPackageManager(), resolveContentProvider.packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.AFKeystoreWrapper(e.getMessage(), e);
            return false;
        }
    }

    public abstract T values();
}
