package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import androidx.compose.animation.C0388a;
import com.appboy.Constants;
import java.io.FileNotFoundException;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p365hg.C12849d0;
import p365hg.C12869i0;

public final class FacebookContentProvider extends ContentProvider {
    private static final String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";
    public static final C12184a Companion = new C12184a();
    private static final String INVALID_FILE_NAME = "..";
    private static final String TAG = FacebookContentProvider.class.getName();

    /* renamed from: com.facebook.FacebookContentProvider$a */
    public static final class C12184a {
    }

    public static final String getAttachmentUrl(String str, UUID uuid, String str2) {
        Companion.getClass();
        C19383o.m32797g(uuid, "callId");
        return C0388a.m1049e(new Object[]{ATTACHMENT_URL_BASE, str, uuid.toString(), str2}, 4, "%s%s/%s/%s", "java.lang.String.format(format, *args)");
    }

    private final Pair<UUID, String> parseCallIdAndAttachmentName(Uri uri) {
        try {
            String path = uri.getPath();
            if (path != null) {
                String substring = path.substring(1);
                C19383o.m32796f(substring, "(this as java.lang.String).substring(startIndex)");
                Object[] array = C19459m.m33056y1(substring, new String[]{"/"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    String str = strArr[0];
                    String str2 = strArr[1];
                    if (!INVALID_FILE_NAME.contentEquals(str) && !INVALID_FILE_NAME.contentEquals(str2)) {
                        return new Pair<>(UUID.fromString(str), str2);
                    }
                    throw new Exception();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Exception unused) {
            return null;
        }
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

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(str, "mode");
        Pair<UUID, String> parseCallIdAndAttachmentName = parseCallIdAndAttachmentName(uri);
        if (parseCallIdAndAttachmentName != null) {
            try {
                UUID uuid = (UUID) parseCallIdAndAttachmentName.first;
                int i = C12849d0.f28340a;
                if (C12869i0.m20546B((String) parseCallIdAndAttachmentName.second) || uuid == null) {
                    throw new FileNotFoundException();
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                String str2 = TAG;
                Log.e(str2, "Got unexpected exception:" + e);
                throw e;
            }
        } else {
            throw new FileNotFoundException();
        }
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
