package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import p136i2.C6983a;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            C6983a c = C6983a.m13524c(context);
            c.getClass();
            try {
                Trace.beginSection("Startup");
                c.mo19152a(c.f15474c.getPackageManager().getProviderInfo(new ComponentName(c.f15474c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException((Throwable) e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
