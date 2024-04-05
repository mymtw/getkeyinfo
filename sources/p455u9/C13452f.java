package p455u9;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0472h;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8883c0;
import com.etsy.android.lib.util.C8919r;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.google.android.gms.common.ConnectionResult;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.C19382n;
import p628nj.C18263b;

/* renamed from: u9.f */
public final class C13452f {
    /* renamed from: a */
    public static Bitmap m21224a(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            Random random = C8919r.f19677a;
            File file = new File(context.getFilesDir(), C8919r.m17359d("", ".jpg"));
            if (!C8919r.m17356a(file)) {
                file = null;
            }
            C8919r.m17361f(file, openInputStream);
            openInputStream.close();
            return m21226c(m21228e(file), file.getAbsolutePath(), true);
        } catch (FileNotFoundException e) {
            C8694h.f19097a.mo21309d("File not found in decodeFromStream", e);
            return null;
        } catch (NullPointerException e2) {
            C8694h.f19097a.mo21309d("Null pointer in decodeFromStream", e2);
            return null;
        } catch (IOException e3) {
            C8694h.f19097a.mo21309d("IOException in decodeFromStream", e3);
            return null;
        }
    }

    /* renamed from: b */
    public static int m21225b(File file) {
        long length = file.length();
        Cursor query = EtsyApplication.get().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"orientation", "_size"}, (String) null, (String[]) null, "date_added desc");
        int i = 0;
        if (query != null) {
            query.moveToFirst();
            while (true) {
                if (query.isAfterLast()) {
                    break;
                }
                int columnIndex = query.getColumnIndex("orientation");
                if (length == query.getLong(query.getColumnIndex("_size"))) {
                    int i2 = query.getInt(columnIndex);
                    query.close();
                    i = i2;
                    break;
                }
                query.moveToNext();
            }
            query.close();
        }
        return i;
    }

    /* renamed from: c */
    public static Bitmap m21226c(int i, String str, boolean z) {
        Bitmap g = z ? m21230g(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, str) : BitmapFactory.decodeFile(str, (BitmapFactory.Options) null);
        if (g == null || i <= 0) {
            return g;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(g, 0, 0, g.getWidth(), g.getHeight(), matrix, true);
    }

    /* renamed from: d */
    public static Bitmap m21227d(Context context, Uri uri, boolean z) {
        Bitmap bitmap;
        if (uri == null) {
            return null;
        }
        if (uri.getScheme().equals(ResponseConstants.FILE)) {
            File file = new File(uri.getPath());
            return m21226c(m21228e(file), file.getAbsolutePath(), z);
        } else if (!uri.getScheme().equals(ResponseConstants.CONTENT)) {
            return null;
        } else {
            Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query == null || !query.moveToFirst()) {
                return m21224a(context, uri);
            }
            if (BuildTarget.getAudience().isInternal()) {
                C8694h.f19097a.mo21310e(DatabaseUtils.dumpCursorToString(query));
            }
            int columnIndex = query.getColumnIndex("_data");
            int columnIndex2 = query.getColumnIndex("orientation");
            if (columnIndex < 0 || columnIndex2 < 0) {
                bitmap = m21224a(context, uri);
            } else {
                String string = query.getString(columnIndex);
                bitmap = (string == null || !new File(string).exists() || C19382n.m32778w0()) ? m21224a(context, uri) : m21226c(query.getInt(columnIndex2), string, true);
            }
            query.close();
            return bitmap;
        }
    }

    /* renamed from: e */
    public static int m21228e(File file) {
        int b;
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
            if (attributeInt == 0) {
                b = m21225b(file);
            } else if (attributeInt == 1) {
                return 0;
            } else {
                if (attributeInt == 3) {
                    b = 180;
                } else if (attributeInt == 6) {
                    b = 90;
                } else if (attributeInt != 8) {
                    return 0;
                } else {
                    b = 270;
                }
            }
            return b;
        } catch (IOException e) {
            C8694h.f19097a.mo21309d("Error decoding file for exif", e);
            return 0;
        }
    }

    /* renamed from: f */
    public static Bitmap m21229f(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float f = ((float) height) / (((float) width) * 1.0f);
        if (height > width) {
            i3 = Math.round(((float) i) * f);
            i4 = i;
        } else {
            i4 = Math.round(((float) (i2 * 1)) / f);
            i3 = i2;
        }
        C8694h hVar = C8694h.f19097a;
        StringBuilder g = C0472h.m1244g("getScaledBitmap: Original: ", width, EtsyDialogFragment.OPT_X_BUTTON, height, ", desired: ");
        g.append(i);
        g.append(EtsyDialogFragment.OPT_X_BUTTON);
        g.append(i2);
        g.append(", scaled: ");
        g.append(i4);
        g.append(EtsyDialogFragment.OPT_X_BUTTON);
        g.append(i3);
        hVar.mo21310e(g.toString());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i3, true);
        StringBuilder h = C0072d.m201h("getScaledBitmap: ");
        h.append(bitmap == createScaledBitmap ? "using original" : "created copy");
        hVar.mo21310e(h.toString());
        return createScaledBitmap;
    }

    /* renamed from: g */
    public static Bitmap m21230g(int i, int i2, String str) {
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = 0;
        options.inJustDecodeBounds = false;
        int i5 = options.outHeight;
        int i6 = options.outWidth;
        int round = (i5 > i2 || i6 > i) ? i6 > i5 ? Math.round(((float) i5) / ((float) i2)) : Math.round(((float) i6) / ((float) i)) : 1;
        if (round < 0) {
            i3 = 0;
        } else {
            int i7 = round - 1;
            int i8 = i7 | (i7 >> 1);
            int i9 = i8 | (i8 >> 2);
            int i10 = i9 | (i9 >> 4);
            int i11 = i10 | (i10 >> 8);
            i3 = (i11 | (i11 >> 16)) + 1;
        }
        int max = Math.max(1, i3);
        C8694h hVar = C8694h.f19097a;
        StringBuilder g = C0472h.m1244g("calculateInSampleSize: original: ", i6, EtsyDialogFragment.OPT_X_BUTTON, i5, ", requested: ");
        g.append(i);
        g.append(EtsyDialogFragment.OPT_X_BUTTON);
        g.append(i2);
        g.append(", sampleSize: ");
        g.append(max);
        hVar.mo21310e(g.toString());
        List<String> list = C8591a.f18700r;
        if (C18263b.f40056T.f18706f.mo21132b(C8592b.f18727D)) {
            int i12 = i5 / max;
            if (i6 / max > 1500 || i12 > 1500) {
                int round2 = i6 > i5 ? Math.round(((float) i6) / ((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)) : Math.round(((float) i5) / ((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
                if (round2 >= 0) {
                    int i13 = round2 - 1;
                    int i14 = i13 | (i13 >> 1);
                    int i15 = i14 | (i14 >> 2);
                    int i16 = i15 | (i15 >> 4);
                    int i17 = i16 | (i16 >> 8);
                    i4 = (i17 | (i17 >> 16)) + 1;
                }
                max = i4;
            }
        }
        options.inSampleSize = max;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: h */
    public static File m21231h(Application application, Bitmap bitmap) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        try {
            valueOf = C8883c0.m17316b(valueOf);
        } catch (UnsupportedEncodingException e) {
            C8694h.f19097a.mo21309d("Encoding error with MD5 of timestamp", e);
        } catch (NoSuchAlgorithmException e2) {
            C8694h.f19097a.mo21309d("Error with MD5 of timestamp", e2);
        }
        File file = new File(application.getCacheDir(), "blurry_img_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, valueOf);
        m21232i(bitmap, file2);
        return file2;
    }

    /* renamed from: i */
    public static String m21232i(Bitmap bitmap, File file) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, bufferedOutputStream);
                bufferedOutputStream.flush();
            } catch (IOException e) {
                C8694h.f19097a.mo21309d("saveBitmapToFile IO ERROR!", e);
            }
            bufferedOutputStream.close();
            String absolutePath = file.getAbsolutePath();
            C8694h.f19097a.mo21310e(String.format("saveBitmapToFile %s", new Object[]{absolutePath}));
            return absolutePath;
        } catch (IOException e2) {
            C8694h.f19097a.mo21309d("saveBitmapToFile IO ERROR!", e2);
            return "";
        } catch (Throwable th) {
            bufferedOutputStream.close();
            throw th;
        }
    }
}
