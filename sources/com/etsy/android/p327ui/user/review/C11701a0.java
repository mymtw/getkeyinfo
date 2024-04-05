package com.etsy.android.p327ui.user.review;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.p013v4.media.C0072d;
import android.webkit.MimeTypeMap;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8919r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p346fa.C12703a;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.user.review.a0 */
public final class C11701a0 {

    /* renamed from: a */
    public final AppCompatActivity f26045a;

    /* renamed from: b */
    public final C13895a f26046b;

    /* renamed from: c */
    public final C12703a f26047c;

    /* renamed from: d */
    public Uri f26048d;

    /* renamed from: e */
    public File f26049e;

    /* renamed from: f */
    public File f26050f;

    public C11701a0(AppCompatActivity appCompatActivity, C13895a aVar, C12703a aVar2) {
        C19383o.m32797g(appCompatActivity, "activity");
        C19383o.m32797g(aVar, "fileSupport");
        C19383o.m32797g(aVar2, "grafana");
        this.f26045a = appCompatActivity;
        this.f26046b = aVar;
        this.f26047c = aVar2;
    }

    /* renamed from: a */
    public final Uri mo37966a() {
        if (C19382n.m32778w0()) {
            try {
                ContentResolver contentResolver = this.f26045a.getContentResolver();
                if (contentResolver != null) {
                    String path = new File(Environment.DIRECTORY_DCIM, "Etsy").getPath();
                    this.f26046b.getClass();
                    String b = C13895a.m21419b("etsy_video_", "");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", b);
                    contentValues.put("mime_type", "video/mp4");
                    contentValues.put("relative_path", path);
                    Uri insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    this.f26048d = insert;
                    return insert;
                }
            } catch (Exception e) {
                e.printStackTrace();
                C12703a aVar = this.f26047c;
                StringBuilder h = C0072d.m201h("video_reviews_file_creation_error.");
                h.append(e.getMessage());
                aVar.mo45474a(h.toString());
            }
        } else {
            try {
                this.f26046b.getClass();
                String b2 = C13895a.m21419b("etsy_video_", ".mp4");
                C13895a aVar2 = this.f26046b;
                AppCompatActivity appCompatActivity = this.f26045a;
                aVar2.getClass();
                File a = C13895a.m21418a(appCompatActivity, b2);
                this.f26049e = a;
                C13895a aVar3 = this.f26046b;
                AppCompatActivity appCompatActivity2 = this.f26045a;
                aVar3.getClass();
                C19383o.m32797g(appCompatActivity2, ResponseConstants.CONTEXT);
                Uri e2 = C8919r.m17360e(appCompatActivity2, a);
                this.f26048d = e2;
                return e2;
            } catch (Exception e3) {
                e3.printStackTrace();
                C12703a aVar4 = this.f26047c;
                StringBuilder h2 = C0072d.m201h("video_reviews_file_creation_error.");
                h2.append(e3.getMessage());
                aVar4.mo45474a(h2.toString());
            }
        }
        return null;
    }

    /* renamed from: b */
    public final File mo37967b(Context context, Uri uri) {
        File file;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
            C13895a aVar = this.f26046b;
            StringBuilder sb = new StringBuilder();
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            if (extensionFromMimeType == null) {
                extensionFromMimeType = "";
            }
            sb.append(extensionFromMimeType);
            String sb2 = sb.toString();
            aVar.getClass();
            String b = C13895a.m21419b("etsy_video_", sb2);
            File file2 = this.f26049e;
            if (file2 != null) {
                boolean z = true;
                if (!file2.exists()) {
                    z = false;
                }
                if (z && (file = this.f26049e) != null) {
                    file.delete();
                }
            }
            C13895a aVar2 = this.f26046b;
            AppCompatActivity appCompatActivity = this.f26045a;
            aVar2.getClass();
            File a = C13895a.m21418a(appCompatActivity, b);
            this.f26049e = a;
            a.createNewFile();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f26049e);
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                this.f26047c.mo45474a("video_reviews_uri_to_file_error." + e.getMessage());
            }
            return this.f26049e;
        } catch (Exception e2) {
            e2.printStackTrace();
            C12703a aVar3 = this.f26047c;
            StringBuilder h = C0072d.m201h("video_reviews_create_file_for_submission_error.");
            h.append(e2.getMessage());
            aVar3.mo45474a(h.toString());
            return null;
        }
    }
}
