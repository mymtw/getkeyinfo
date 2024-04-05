package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;

public final class FacebookInitProvider extends ContentProvider {
    public static final C12252a Companion = new C12252a();
    private static final String TAG = "FacebookInitProvider";

    /* renamed from: com.facebook.internal.FacebookInitProvider$a */
    public static final class C12252a {
    }

    static {
        Class<FacebookInitProvider> cls = FacebookInitProvider.class;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return 0;
    }

    public String getType(Uri uri) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        android.util.Log.i(TAG, "Failed to auto initialize the Facebook SDK", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreate() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = p453tf.C13418j.f29381a     // Catch:{ Exception -> 0x001f }
            java.lang.Class<tf.j> r1 = p453tf.C13418j.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x001f }
            p453tf.C13418j.m21117m(r0)     // Catch:{ all -> 0x0010 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x001f }
            goto L_0x0027
        L_0x0010:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x001f }
            throw r0     // Catch:{ Exception -> 0x001f }
        L_0x0013:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x001f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x001f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x001f }
            throw r1     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = TAG
            java.lang.String r2 = "Failed to auto initialize the Facebook SDK"
            android.util.Log.i(r1, r2, r0)
        L_0x0027:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FacebookInitProvider.onCreate():boolean");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        return 0;
    }
}
