package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p260v0.C8184a;

public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static HashMap<String, C2267a> sCache = new HashMap<>();
    private C2267a mStrategy;

    /* renamed from: androidx.core.content.FileProvider$a */
    public interface C2267a {
        /* renamed from: a */
        Uri mo8741a(File file);

        /* renamed from: b */
        File mo8742b(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    public static class C2268b implements C2267a {

        /* renamed from: a */
        public final String f5513a;

        /* renamed from: b */
        public final HashMap<String, File> f5514b = new HashMap<>();

        public C2268b(String str) {
            this.f5513a = str;
        }

        /* renamed from: a */
        public final Uri mo8741a(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f5514b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    return new Uri.Builder().scheme(ResponseConstants.CONTENT).authority(this.f5513a).encodedPath(Uri.encode((String) entry.getKey()) + JsonPointer.SEPARATOR + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException(C0326j.m864i("Failed to find configured root that contains ", canonicalPath));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: b */
        public final File mo8742b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f5514b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException(C0073e.m206f("Unable to find configured root for ", uri));
            }
        }
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static C2267a getPathStrategy(Context context, String str) {
        C2267a aVar;
        synchronized (sCache) {
            aVar = sCache.get(str);
            if (aVar == null) {
                try {
                    aVar = parsePathStrategy(context, str);
                    sCache.put(str, aVar);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return aVar;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).mo8741a(file);
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(C0326j.m864i("Invalid mode: ", str));
    }

    private static C2267a parsePathStrategy(Context context, String str) throws IOException, XmlPullParserException {
        C2268b bVar = new C2268b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                        if (TAG_ROOT_PATH.equals(name)) {
                            file = DEVICE_ROOT;
                        } else if (TAG_FILES_PATH.equals(name)) {
                            file = context.getFilesDir();
                        } else if (TAG_CACHE_PATH.equals(name)) {
                            file = context.getCacheDir();
                        } else if (TAG_EXTERNAL.equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if (TAG_EXTERNAL_FILES.equals(name)) {
                            Object obj = C8184a.f17966a;
                            File[] b = C8184a.C8186b.m16463b(context, (String) null);
                            if (b.length > 0) {
                                file = b[0];
                            }
                        } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                            Object obj2 = C8184a.f17966a;
                            File[] a = C8184a.C8186b.m16462a(context);
                            if (a.length > 0) {
                                file = a[0];
                            }
                        } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file != null) {
                            File buildPath = buildPath(file, attributeValue2);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    bVar.f5514b.put(attributeValue, buildPath.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + buildPath, e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException(C0326j.m864i("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.mStrategy = getPathStrategy(context, providerInfo.authority.split(";")[0]);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.mStrategy.mo8742b(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$a r0 = r2.mStrategy
            java.io.File r3 = r0.mo8742b(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.mStrategy.mo8742b(uri), modeToMode(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File b = this.mStrategy.mo8742b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? b.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b.length());
            }
            i2 = i;
        }
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }
}
