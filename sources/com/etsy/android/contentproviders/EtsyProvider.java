package com.etsy.android.contentproviders;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.content.SearchRecentSuggestionsProvider;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;

public class EtsyProvider extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY = "com.etsy.android.contentproviders.EtsyProvider";
    /* access modifiers changed from: private */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://com.etsy.android.contentproviders.EtsyProvider");
    public static final int MODE = 1;
    private static final String MULTIPLE_RECORDS_MIME_TYPE = "vnd.android.cursor.dir/vnd.etsy.android.contentproviders.EtsyProvider.item";
    private static final String SINGLE_RECORD_MIME_TYPE = "vnd.android.cursor.item/vnd.etsy.android.contentproviders.EtsyProvider.item";
    private static final UriMatcher sUriMatcher = buildUriMatcher();
    private EtsyDatabase mDb;

    /* renamed from: com.etsy.android.contentproviders.EtsyProvider$a */
    public static class C6428a {

        /* renamed from: a */
        public static final Uri f14246a = EtsyProvider.BASE_CONTENT_URI.buildUpon().appendPath(ResponseConstants.LISTING).build();
    }

    /* renamed from: com.etsy.android.contentproviders.EtsyProvider$b */
    public static class C6429b {

        /* renamed from: a */
        public static final Uri f14247a = EtsyProvider.BASE_CONTENT_URI.buildUpon().appendPath("history").appendPath("local_market").build();
    }

    /* renamed from: com.etsy.android.contentproviders.EtsyProvider$c */
    public static class C6430c {

        /* renamed from: a */
        public static final Uri f14248a = EtsyProvider.BASE_CONTENT_URI.buildUpon().appendPath(ResponseConstants.SHOP).build();
    }

    /* renamed from: com.etsy.android.contentproviders.EtsyProvider$d */
    public static class C6431d {

        /* renamed from: a */
        public static final Uri f14249a = EtsyProvider.BASE_CONTENT_URI.buildUpon().appendPath("shop_suggestions").build();
    }

    /* renamed from: com.etsy.android.contentproviders.EtsyProvider$e */
    public static class C6432e {

        /* renamed from: a */
        public static final Uri f14250a = EtsyProvider.BASE_CONTENT_URI.buildUpon().appendPath("user").build();
    }

    private static UriMatcher buildUriMatcher() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(AUTHORITY, "history/local_market", 10);
        uriMatcher.addURI(AUTHORITY, "shop_suggestions", 11);
        uriMatcher.addURI(AUTHORITY, ResponseConstants.LISTING, 3);
        uriMatcher.addURI(AUTHORITY, "listing/*", 3);
        uriMatcher.addURI(AUTHORITY, ResponseConstants.SHOP, 5);
        uriMatcher.addURI(AUTHORITY, "shop/user/*", 5);
        uriMatcher.addURI(AUTHORITY, "user", 6);
        return uriMatcher;
    }

    private static int getMatch(Uri uri) {
        return sUriMatcher.match(uri);
    }

    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        C8694h.f19097a.mo21310e("applyBatch");
        SQLiteDatabase writableDatabase = this.mDb.getWritableDatabase();
        if (writableDatabase != null) {
            writableDatabase.beginTransaction();
            try {
                int size = arrayList.size();
                ContentProviderResult[] contentProviderResultArr = new ContentProviderResult[size];
                for (int i = 0; i < size; i++) {
                    contentProviderResultArr[i] = arrayList.get(i).apply(this, contentProviderResultArr, i);
                }
                writableDatabase.setTransactionSuccessful();
                return contentProviderResultArr;
            } catch (Exception e) {
                C8694h.f19097a.mo21309d("applyBatch error", e);
            } finally {
                writableDatabase.endTransaction();
            }
        }
        return new ContentProviderResult[0];
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int i;
        C8694h hVar = C8694h.f19097a;
        hVar.mo21310e("delete - uri:" + uri);
        int match = getMatch(uri);
        SQLiteDatabase writableDatabase = this.mDb.getWritableDatabase();
        int i2 = -1;
        if (writableDatabase == null) {
            return -1;
        }
        if (match == 10) {
            i = writableDatabase.delete("local_market_history", str, strArr);
            getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
        } else if (match != 11) {
            try {
                hVar.mo21313g("delete() - UNKNOWN MATCH FOR URI" + uri);
                return -1;
            } catch (Exception e) {
                e = e;
                C8694h.f19097a.mo21309d("delete error", e);
                return i2;
            }
        } else {
            i = writableDatabase.delete("shop_search", str, strArr);
            try {
                getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
            } catch (Exception e2) {
                e = e2;
                i2 = i;
            }
        }
        return i;
    }

    public String getType(Uri uri) {
        int match = getMatch(uri);
        return (match == 3 || match == 5 || match == 6) ? SINGLE_RECORD_MIME_TYPE : MULTIPLE_RECORDS_MIME_TYPE;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C8694h hVar = C8694h.f19097a;
        hVar.mo21310e("insert - uri:" + uri);
        int match = getMatch(uri);
        SQLiteDatabase writableDatabase = this.mDb.getWritableDatabase();
        if (writableDatabase != null) {
            if (match == 3) {
                uri = Uri.withAppendedPath(C6428a.f14246a, String.valueOf(writableDatabase.insertWithOnConflict(ResponseConstants.LISTING, (String) null, contentValues, 5)));
            } else if (match == 5) {
                uri = Uri.withAppendedPath(C6430c.f14248a, String.valueOf(writableDatabase.insertWithOnConflict(ResponseConstants.SHOP, (String) null, contentValues, 5)));
            } else if (match == 6) {
                uri = Uri.withAppendedPath(C6432e.f14250a, String.valueOf(writableDatabase.insertWithOnConflict("user", (String) null, contentValues, 5)));
            } else if (match == 10) {
                uri = Uri.withAppendedPath(C6429b.f14247a, String.valueOf(writableDatabase.insertWithOnConflict("local_market_history", (String) null, contentValues, 5)));
            } else if (match != 11) {
                try {
                    hVar.mo21313g("insert() - UNKNOWN MATCH FOR URI" + uri);
                } catch (Exception e) {
                    C8694h.f19097a.mo21309d("insert error", e);
                }
            } else {
                uri = Uri.withAppendedPath(C6431d.f14249a, String.valueOf(writableDatabase.insertWithOnConflict("shop_search", (String) null, contentValues, 5)));
            }
            getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
        }
        return uri;
    }

    public boolean onCreate() {
        setupSuggestions(AUTHORITY, 1);
        super.onCreate();
        this.mDb = new EtsyDatabase(getContext());
        return true;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        C8694h hVar = C8694h.f19097a;
        hVar.mo21310e("update - uri:" + uri);
        int match = getMatch(uri);
        SQLiteDatabase writableDatabase = this.mDb.getWritableDatabase();
        int i2 = -1;
        if (writableDatabase == null) {
            return -1;
        }
        if (match == 3) {
            i = writableDatabase.update(ResponseConstants.LISTING, contentValues, str, strArr);
            getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
        } else if (match == 5) {
            i = writableDatabase.update(ResponseConstants.SHOP, contentValues, str, strArr);
            getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
        } else if (match != 6) {
            try {
                hVar.mo21313g("update() - UNKNOWN MATCH FOR URI" + uri);
                return -1;
            } catch (Exception e) {
                e = e;
                C8694h.f19097a.mo21309d("update error", e);
                return i2;
            }
        } else {
            i = writableDatabase.update("user", contentValues, str, strArr);
            try {
                getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
            } catch (Exception e2) {
                e = e2;
                i2 = i;
            }
        }
        return i;
    }
}
