package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.etsy.android.lib.conversation.MessageDraft;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f5516k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f5517a;

    /* renamed from: b */
    public Object f5518b;

    /* renamed from: c */
    public byte[] f5519c;

    /* renamed from: d */
    public Parcelable f5520d;

    /* renamed from: e */
    public int f5521e;

    /* renamed from: f */
    public int f5522f;

    /* renamed from: g */
    public ColorStateList f5523g;

    /* renamed from: h */
    public PorterDuff.Mode f5524h;

    /* renamed from: i */
    public String f5525i;

    /* renamed from: j */
    public String f5526j;

    public IconCompat() {
        this.f5517a = -1;
        this.f5519c = null;
        this.f5520d = null;
        this.f5521e = 0;
        this.f5522f = 0;
        this.f5523g = null;
        this.f5524h = f5516k;
        this.f5525i = null;
    }

    /* renamed from: b */
    public static IconCompat m4960b(Context context, int i) {
        if (context != null) {
            return m4961c(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: c */
    public static IconCompat m4961c(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f5521e = i;
            if (resources != null) {
                try {
                    iconCompat.f5518b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f5518b = str;
            }
            iconCompat.f5526j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: d */
    public final int mo8747d() {
        int i = this.f5517a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f5518b;
            if (i2 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        } else if (i == 2) {
            return this.f5521e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    /* renamed from: e */
    public final String mo8748e() {
        int i = this.f5517a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f5518b;
            if (i2 >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        } else if (i == 2) {
            return TextUtils.isEmpty(this.f5526j) ? ((String) this.f5518b).split(MessageDraft.IMAGE_DELIMITER, -1)[0] : this.f5526j;
        } else {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
    }

    /* renamed from: f */
    public final Uri mo8749f() {
        int i = this.f5517a;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f5518b;
            if (i2 >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        } else if (i == 4 || i == 6) {
            return Uri.parse((String) this.f5518b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Icon mo8750g(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = r4.f5517a
            switch(r0) {
                case -1: goto L_0x00fa;
                case 0: goto L_0x0005;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b7;
                case 6: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L_0x000d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x001d
            android.net.Uri r5 = r4.mo8749f()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto L_0x00e9
        L_0x001d:
            if (r5 == 0) goto L_0x00a0
            android.net.Uri r0 = r4.mo8749f()
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            java.lang.String r3 = "IconCompat"
            if (r2 != 0) goto L_0x005f
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0049 }
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0049 }
            java.lang.Object r2 = r4.f5518b     // Catch:{ FileNotFoundException -> 0x0049 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ FileNotFoundException -> 0x0049 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0049 }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0049 }
            goto L_0x007e
        L_0x0049:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from path: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r5)
            goto L_0x007d
        L_0x005f:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0068 }
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x007e
        L_0x0068:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load image from URI: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r5)
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r5 == 0) goto L_0x0089
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00e9
        L_0x0089:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot load adaptive icon from uri: "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            android.net.Uri r1 = r4.mo8749f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00a0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            android.net.Uri r1 = r4.mo8749f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00b7:
            java.lang.Object r5 = r4.f5518b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00e9
        L_0x00c0:
            java.lang.Object r5 = r4.f5518b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L_0x00e9
        L_0x00c9:
            java.lang.Object r5 = r4.f5518b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f5521e
            int r1 = r4.f5522f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L_0x00e9
        L_0x00d6:
            java.lang.String r5 = r4.mo8748e()
            int r0 = r4.f5521e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L_0x00e9
        L_0x00e1:
            java.lang.Object r5 = r4.f5518b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L_0x00e9:
            android.content.res.ColorStateList r0 = r4.f5523g
            if (r0 == 0) goto L_0x00f0
            r5.setTintList(r0)
        L_0x00f0:
            android.graphics.PorterDuff$Mode r0 = r4.f5524h
            android.graphics.PorterDuff$Mode r1 = f5516k
            if (r0 == r1) goto L_0x00f9
            r5.setTintMode(r0)
        L_0x00f9:
            return r5
        L_0x00fa:
            java.lang.Object r5 = r4.f5518b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo8750g(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f5517a == -1) {
            return String.valueOf(this.f5518b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5517a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f5517a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5518b).getWidth());
                sb.append(EtsyDialogFragment.OPT_X_BUTTON);
                sb.append(((Bitmap) this.f5518b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f5526j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo8747d())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f5521e);
                if (this.f5522f != 0) {
                    sb.append(" off=");
                    sb.append(this.f5522f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f5518b);
                break;
        }
        if (this.f5523g != null) {
            sb.append(" tint=");
            sb.append(this.f5523g);
        }
        if (this.f5524h != f5516k) {
            sb.append(" mode=");
            sb.append(this.f5524h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f5519c = null;
        this.f5520d = null;
        this.f5521e = 0;
        this.f5522f = 0;
        this.f5523g = null;
        this.f5524h = f5516k;
        this.f5525i = null;
        this.f5517a = i;
    }
}
