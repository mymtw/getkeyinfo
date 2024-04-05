package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C19383o;
import p156k.C7167d;
import p156k.C7171g;

public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {
    public static final C12277a Companion = new C12277a();
    /* access modifiers changed from: private */
    public static C7167d client;
    /* access modifiers changed from: private */
    public static final ReentrantLock lock = new ReentrantLock();
    /* access modifiers changed from: private */
    public static C7171g session;

    /* renamed from: com.facebook.login.CustomTabPrefetchHelper$a */
    public static final class C12277a {
        /* renamed from: a */
        public static void m20124a() {
            C7167d access$getClient$cp;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (access$getClient$cp = CustomTabPrefetchHelper.client) != null) {
                CustomTabPrefetchHelper.session = access$getClient$cp.mo19457b();
            }
            CustomTabPrefetchHelper.lock.unlock();
        }
    }

    public static final C7171g getPreparedSessionOnce() {
        Companion.getClass();
        lock.lock();
        C7171g access$getSession$cp = session;
        session = null;
        lock.unlock();
        return access$getSession$cp;
    }

    public static final void mayLaunchUrl(Uri uri) {
        Companion.getClass();
        C19383o.m32797g(uri, "url");
        C12277a.m20124a();
        lock.lock();
        C7171g access$getSession$cp = session;
        if (access$getSession$cp != null) {
            access$getSession$cp.mo19460a(uri, (List) null);
        }
        lock.unlock();
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, C7167d dVar) {
        C19383o.m32797g(componentName, "name");
        C19383o.m32797g(dVar, "newClient");
        try {
            dVar.f15934a.warmup(0);
        } catch (RemoteException unused) {
        }
        client = dVar;
        Companion.getClass();
        C12277a.m20124a();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C19383o.m32797g(componentName, "componentName");
    }
}
