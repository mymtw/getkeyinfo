package com.etsy.android.lib.util;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.FragmentActivity;
import androidx.room.C3218a0;
import com.etsy.android.R;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.push.registration.C8834g;
import com.etsy.android.lib.util.C8891f;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.p327ui.user.review.CreateReviewViewModel;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p145io.reactivex.subjects.PublishSubject;
import p250u0.C8077a;
import p409o9.C13130j;
import p455u9.C13451e;
import p456ua.C13461f;
import p487ya.C13895a;

/* renamed from: com.etsy.android.lib.util.e */
public final class C8886e implements C8077a.C8078a {

    /* renamed from: b */
    public int f19636b = LogSeverity.WARNING_VALUE;

    /* renamed from: c */
    public C13895a f19637c;

    /* renamed from: d */
    public Context f19638d;

    /* renamed from: e */
    public final C13461f f19639e = EtsyApplication.get().getRxSchedulers();

    /* renamed from: f */
    public PublishSubject<C8891f> f19640f = new PublishSubject<>();

    /* renamed from: g */
    public C8888b f19641g;

    /* renamed from: h */
    public C8887a f19642h = new C8887a();

    /* renamed from: i */
    public File f19643i;

    /* renamed from: j */
    public Uri f19644j;

    /* renamed from: k */
    public boolean f19645k = false;

    /* renamed from: com.etsy.android.lib.util.e$a */
    public class C8887a implements C8888b {
        public C8887a() {
        }

        public final void onImageSaveFail(Object obj, File file) {
            C8886e.this.f19640f.onNext(new C8891f.C8892a(obj, file));
            C8888b bVar = C8886e.this.f19641g;
            if (bVar != null) {
                bVar.onImageSaveFail(obj, file);
            }
        }

        public final void onImageSaveSuccess(Object obj, Bitmap bitmap, File file) {
            C8886e.this.f19640f.onNext(new C8891f.C8893b(obj, bitmap, file));
            C8888b bVar = C8886e.this.f19641g;
            if (bVar != null) {
                bVar.onImageSaveSuccess(obj, bitmap, file);
            }
        }

        public final void onNoAvailableActivities() {
            C8886e.this.f19640f.onNext(C8891f.C8894c.f19654a);
            C8888b bVar = C8886e.this.f19641g;
            if (bVar != null) {
                bVar.onNoAvailableActivities();
            }
        }

        public final void onPermissionGranted() {
            C8886e.this.f19640f.onNext(C8891f.C8895d.f19655a);
            C8888b bVar = C8886e.this.f19641g;
            if (bVar != null) {
                bVar.onPermissionGranted();
            }
        }

        public final Object onPreImageSave() {
            C8886e.this.f19640f.onNext(C8891f.C8896e.f19656a);
            C8888b bVar = C8886e.this.f19641g;
            if (bVar != null) {
                return bVar.onPreImageSave();
            }
            return null;
        }

        public final void onRequestCrop(Uri uri, Uri uri2) {
            C8886e.this.f19640f.onNext(new C8891f.C8897f(uri, uri2));
            C8888b bVar = C8886e.this.f19641g;
            if (bVar != null) {
                bVar.onRequestCrop(uri, uri2);
            }
        }
    }

    /* renamed from: com.etsy.android.lib.util.e$b */
    public interface C8888b {
        void onImageSaveFail(Object obj, File file);

        void onImageSaveSuccess(Object obj, Bitmap bitmap, File file);

        void onNoAvailableActivities();

        void onPermissionGranted();

        Object onPreImageSave();

        void onRequestCrop(Uri uri, Uri uri2);
    }

    /* renamed from: com.etsy.android.lib.util.e$c */
    public static class C8889c {

        /* renamed from: a */
        public File f19647a;

        /* renamed from: b */
        public Bitmap f19648b;

        public C8889c(Bitmap bitmap, File file) {
            this.f19647a = file;
            this.f19648b = bitmap;
        }
    }

    public C8886e(Context context, Bundle bundle, CreateReviewViewModel createReviewViewModel) {
        this.f19641g = createReviewViewModel;
        this.f19638d = context.getApplicationContext();
        this.f19636b = LogSeverity.WARNING_VALUE;
        if (bundle != null) {
            if (bundle.containsKey("CAMERA_HELPER_CAMERA_IMAGE")) {
                this.f19643i = new File(bundle.getString("CAMERA_HELPER_CAMERA_IMAGE"));
            }
            if (bundle.containsKey("CAMERA_HELPER_REQUEST_CODE")) {
                this.f19636b = bundle.getInt("CAMERA_HELPER_REQUEST_CODE", LogSeverity.WARNING_VALUE);
            }
        }
        this.f19637c = new C13895a();
    }

    /* renamed from: a */
    public final void mo30474a(CreateReviewActivity createReviewActivity) {
        if (mo30480g(createReviewActivity)) {
            Intent e = mo30478e();
            if (e == null) {
                this.f19642h.onNoAvailableActivities();
                return;
            }
            int i = this.f19636b;
            C19383o.m32797g(createReviewActivity, "<this>");
            try {
                createReviewActivity.startActivityForResult(e, i);
            } catch (ActivityNotFoundException unused) {
                C8901g0.m17337c(createReviewActivity, R.string.error_no_image_chooser_app_found);
            }
        }
    }

    /* renamed from: b */
    public final Uri mo30475b() {
        ContentResolver contentResolver = this.f19638d.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        String path = new File(Environment.DIRECTORY_PICTURES, "Etsy").getPath();
        String d = C8919r.m17359d("", "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", d);
        contentValues.put("relative_path", path);
        contentValues.put("mime_type", "image/jpeg");
        return contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    /* renamed from: c */
    public final void mo30476c(Context context, File file, int i) {
        if (i == 401) {
            Uri fromFile = Uri.fromFile(file);
            Random random = C8919r.f19677a;
            File file2 = new File(context.getFilesDir(), C8919r.m17359d("", ".jpg"));
            if (!C8919r.m17356a(file2)) {
                file2 = null;
            }
            this.f19642h.onRequestCrop(fromFile, Uri.fromFile(file2));
            return;
        }
        Object onPreImageSave = this.f19642h.onPreImageSave();
        C0391c.m1056b(this.f19639e, C0326j.m860e(this.f19639e, new C19208j(new SingleCreate(new C3218a0(file, 1)), new C8880b(this, file)))).mo20658g(new C8882c(0, this, onPreImageSave), new C8884d(0));
    }

    /* renamed from: d */
    public final void mo30477d(Context context, Uri uri, int i) {
        if (i == 401) {
            Random random = C8919r.f19677a;
            File file = new File(context.getFilesDir(), C8919r.m17359d("", ".jpg"));
            if (!C8919r.m17356a(file)) {
                file = null;
            }
            this.f19642h.onRequestCrop(uri, Uri.fromFile(file));
            return;
        }
        Object onPreImageSave = this.f19642h.onPreImageSave();
        C0391c.m1056b(this.f19639e, C0326j.m860e(this.f19639e, new C19208j(new SingleCreate(new C13451e(context, uri)), new C8834g(this, 2)))).mo20658g(new C13130j(1, this, onPreImageSave), new C8878a(0));
    }

    /* renamed from: e */
    public final Intent mo30478e() {
        File file;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (Build.VERSION.SDK_INT >= 29) {
            Uri b = mo30475b();
            this.f19644j = b;
            if (b == null) {
                return null;
            }
            intent.putExtra("output", b);
            return intent;
        }
        if (this.f19637c == null) {
            this.f19637c = new C13895a();
        }
        this.f19637c.getClass();
        String d = C8919r.m17359d("", ".jpg");
        C19383o.m32796f(d, "getNewImageFilename()");
        C13895a aVar = this.f19637c;
        Context context = this.f19638d;
        aVar.getClass();
        this.f19643i = C13895a.m21418a(context, d);
        PackageManager packageManager = this.f19638d.getPackageManager();
        if (!(packageManager != null && (packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front"))) || (file = this.f19643i) == null || this.f19637c == null) {
            return null;
        }
        Context context2 = this.f19638d;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        intent.putExtra("output", C8919r.m17360e(context2, file));
        return intent;
    }

    /* renamed from: f */
    public final void mo30479f(int i, int i2, Intent intent) {
        File file;
        ClipData clipData;
        int i3 = this.f19636b;
        if (i == i3 && i2 == -1) {
            if (this.f19641g != null || this.f19640f.mo71386l()) {
                int i4 = 0;
                int i5 = 3;
                if (intent == null || intent.getData() == null) {
                    if (intent == null || !this.f19645k || (clipData = intent.getClipData()) == null) {
                        Uri uri = this.f19644j;
                        File file2 = null;
                        if (uri != null) {
                            mo30477d(this.f19638d, uri, i);
                            this.f19644j = null;
                            return;
                        }
                        File file3 = this.f19643i;
                        if (file3 == null) {
                            File c = C8919r.m17358c(this.f19638d);
                            if (c.exists() || c.mkdirs()) {
                                TextUtils.isEmpty("etsyImage.jpg");
                                file2 = new File(c, "etsyImage.jpg");
                                C8919r.m17356a(file2);
                            } else {
                                C8694h.f19097a.mo21310e("failed to create image directory");
                            }
                            file3 = file2;
                        }
                        mo30476c(this.f19638d, file3, i);
                    } else {
                        int itemCount = clipData.getItemCount();
                        if (itemCount <= 3) {
                            i5 = itemCount;
                        }
                        while (i4 < i5) {
                            mo30477d(this.f19638d, clipData.getItemAt(i4).getUri(), i);
                            i4++;
                        }
                        return;
                    }
                } else if ("android.media.action.IMAGE_CAPTURE".equals(intent.getAction())) {
                    mo30476c(this.f19638d, new File(intent.getStringExtra("output")), i);
                } else if (intent.getData() == null) {
                    C8694h.f19097a.mo21310e(String.format("Error attaching image %s", new Object[]{intent.toUri(0)}));
                    Toast.makeText(this.f19638d, "Could Not Attach Image", 0).show();
                } else if (!this.f19645k || intent.getClipData() == null) {
                    mo30477d(this.f19638d, intent.getData(), i);
                } else {
                    ClipData clipData2 = intent.getClipData();
                    if (clipData2.getItemCount() <= 3) {
                        i5 = clipData2.getItemCount();
                    }
                    while (i4 < i5) {
                        mo30477d(this.f19638d, clipData2.getItemAt(i4).getUri(), i);
                        i4++;
                    }
                }
            } else {
                return;
            }
        } else if (i == i3 && i2 == 0 && (file = this.f19643i) != null) {
            file.delete();
        }
        if (i == 49 && intent != null) {
            Uri parse = Uri.parse(intent.getStringExtra("dest_uri"));
            if (i2 == 50) {
                mo30477d(this.f19638d, parse, i);
            } else {
                new File(parse.getPath()).delete();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo30480g(FragmentActivity fragmentActivity) {
        if (C19382n.m32706E0() || C8924v.m17365a(fragmentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (C8924v.m17365a(fragmentActivity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            C8077a.m16263c(10, fragmentActivity, (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        C8924v.f19686a.put(10, new WeakReference(this));
        return false;
    }

    /* renamed from: h */
    public final void mo30481h(CreateReviewActivity createReviewActivity) {
        if (mo30480g(createReviewActivity)) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            int i = this.f19636b;
            C19383o.m32797g(createReviewActivity, "<this>");
            try {
                createReviewActivity.startActivityForResult(intent, i);
            } catch (ActivityNotFoundException unused) {
                C8901g0.m17337c(createReviewActivity, R.string.error_no_image_chooser_app_found);
            }
        }
    }

    /* renamed from: i */
    public final void mo30482i(Object obj, C8889c cVar) {
        File file;
        if (cVar != null) {
            Bitmap bitmap = cVar.f19648b;
            if (bitmap == null || (file = cVar.f19647a) == null) {
                this.f19642h.onImageSaveFail(obj, cVar.f19647a);
            } else {
                this.f19642h.onImageSaveSuccess(obj, bitmap, file);
            }
        } else {
            this.f19642h.onImageSaveFail(obj, (File) null);
        }
        File file2 = this.f19643i;
        if (file2 != null && file2.length() == 0) {
            this.f19643i.delete();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.content.Intent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30483j(androidx.fragment.app.Fragment r15) {
        /*
            r14 = this;
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            boolean r0 = r14.mo30480g(r0)
            if (r0 == 0) goto L_0x0161
            r0 = 0
            r14.f19645k = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "output"
            java.lang.String r3 = "android.media.action.IMAGE_CAPTURE"
            java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
            java.lang.String r5 = "android.intent.extra.ALLOW_MULTIPLE"
            java.lang.String r6 = "image/*"
            java.lang.String r7 = "android.intent.category.OPENABLE"
            java.lang.String r8 = "android.intent.action.GET_CONTENT"
            r9 = 29
            r10 = 1
            r11 = 0
            r12 = 2131951779(0x7f1300a3, float:1.9539982E38)
            if (r1 < r9) goto L_0x0089
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r8)
            r9.addCategory(r7)
            boolean r7 = r14.f19645k
            if (r7 == 0) goto L_0x003a
            r9.putExtra(r5, r10)
        L_0x003a:
            r9.setType(r6)
            r1.add(r9)
            android.net.Uri r5 = r14.mo30475b()
            r14.f19644j = r5
            if (r5 == 0) goto L_0x0055
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r3)
            android.net.Uri r3 = r14.f19644j
            r5.putExtra(r2, r3)
            r1.add(r5)
        L_0x0055:
            int r2 = r1.size()
            if (r2 != 0) goto L_0x005d
            goto L_0x0147
        L_0x005d:
            int r2 = r1.size()
            if (r2 != r10) goto L_0x006c
            java.lang.Object r0 = r1.get(r0)
            r11 = r0
            android.content.Intent r11 = (android.content.Intent) r11
            goto L_0x0147
        L_0x006c:
            java.lang.Object r2 = r1.remove(r0)
            android.content.Intent r2 = (android.content.Intent) r2
            android.content.Context r3 = r14.f19638d
            java.lang.String r3 = r3.getString(r12)
            android.content.Intent r11 = android.content.Intent.createChooser(r2, r3)
            android.os.Parcelable[] r0 = new android.os.Parcelable[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            r11.putExtra(r4, r0)
            goto L_0x0147
        L_0x0089:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r8)
            r9.addCategory(r7)
            boolean r7 = r14.f19645k
            if (r7 == 0) goto L_0x009d
            r9.putExtra(r5, r10)
        L_0x009d:
            r9.setType(r6)
            android.content.Context r5 = r14.f19638d
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getString(r12)
            android.content.Intent r5 = android.content.Intent.createChooser(r9, r5)
            android.content.Context r6 = r14.f19638d
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            if (r6 == 0) goto L_0x0147
            android.content.Context r7 = r14.f19638d
            java.io.File r7 = com.etsy.android.lib.util.C8919r.m17358c(r7)
            java.lang.String r8 = ""
            java.lang.String r9 = ".jpg"
            java.lang.String r8 = com.etsy.android.lib.util.C8919r.m17359d(r8, r9)
            java.io.File r9 = new java.io.File
            r9.<init>(r7, r8)
            boolean r7 = com.etsy.android.lib.util.C8919r.m17356a(r9)
            if (r7 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r9 = r11
        L_0x00d1:
            r14.f19643i = r9
            android.content.Context r7 = r14.f19638d
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            if (r7 == 0) goto L_0x00ec
            java.lang.String r8 = "android.hardware.camera"
            boolean r8 = r7.hasSystemFeature(r8)
            if (r8 != 0) goto L_0x00ed
            java.lang.String r8 = "android.hardware.camera.front"
            boolean r7 = r7.hasSystemFeature(r8)
            if (r7 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r10 = r0
        L_0x00ed:
            if (r10 == 0) goto L_0x012f
            java.io.File r7 = r14.f19643i
            if (r7 == 0) goto L_0x012f
            android.net.Uri r7 = android.net.Uri.fromFile(r7)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r3)
            java.util.List r3 = r6.queryIntentActivities(r8, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0104:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x012f
            java.lang.Object r9 = r3.next()
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
            android.content.pm.ActivityInfo r10 = r9.activityInfo
            java.lang.String r10 = r10.packageName
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r8)
            android.content.ComponentName r13 = new android.content.ComponentName
            android.content.pm.ActivityInfo r9 = r9.activityInfo
            java.lang.String r9 = r9.name
            r13.<init>(r10, r9)
            r12.setComponent(r13)
            r12.setPackage(r10)
            r12.putExtra(r2, r7)
            r1.add(r12)
            goto L_0x0104
        L_0x012f:
            android.os.Parcelable[] r2 = new android.os.Parcelable[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            r5.putExtra(r4, r1)
            java.util.List r0 = r6.queryIntentActivities(r5, r0)
            if (r0 == 0) goto L_0x0147
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0147
            r11 = r5
        L_0x0147:
            if (r11 != 0) goto L_0x014f
            com.etsy.android.lib.util.e$a r15 = r14.f19642h
            r15.onNoAvailableActivities()
            goto L_0x0161
        L_0x014f:
            int r0 = r14.f19636b
            r15.startActivityForResult(r11, r0)     // Catch:{ ActivityNotFoundException -> 0x0155 }
            goto L_0x0161
        L_0x0155:
            android.content.Context r15 = r15.requireContext()
            if (r15 == 0) goto L_0x0161
            r0 = 2131952143(0x7f13020f, float:1.954072E38)
            com.etsy.android.lib.util.C8901g0.m17337c(r15, r0)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.util.C8886e.mo30483j(androidx.fragment.app.Fragment):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
        /*
            r3 = this;
            r5 = 10
            if (r4 != r5) goto L_0x0032
            int r4 = r6.length
            r5 = 0
            r0 = 1
            if (r4 >= r0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            int r4 = r6.length
            r1 = r5
        L_0x000c:
            if (r1 >= r4) goto L_0x0017
            r2 = r6[r1]
            if (r2 == 0) goto L_0x0014
        L_0x0012:
            r0 = r5
            goto L_0x0017
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            if (r0 == 0) goto L_0x001f
            com.etsy.android.lib.util.e$a r4 = r3.f19642h
            r4.onPermissionGranted()
            goto L_0x0032
        L_0x001f:
            android.content.Context r4 = r3.f19638d
            r6 = 2131953655(0x7f1307f7, float:1.9543787E38)
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r6, r5)
            r4.show()
            com.etsy.android.lib.logger.h r4 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r5 = "Unable to find Grafana reference. Check dagger setup"
            r4.mo21313g(r5)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.util.C8886e.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
