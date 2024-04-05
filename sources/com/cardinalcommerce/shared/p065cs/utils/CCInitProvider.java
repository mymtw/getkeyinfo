package com.cardinalcommerce.shared.p065cs.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.cardinalcommerce.shared.cs.utils.CCInitProvider */
public class CCInitProvider extends ContentProvider {

    /* renamed from: a */
    private static Context f14062a;

    /* renamed from: a */
    public static Context m12770a() {
        return f14062a;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo == null) {
            throw new NullPointerException("YourLibraryInitProvider ProviderInfo cannot be null.");
        } else if (!"${applicationId}.CCInitProvider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
        } else {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        f14062a = getContext();
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
