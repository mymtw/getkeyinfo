package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;

public final class MediaStoreRequestHandler extends C17441g {

    /* renamed from: b */
    public static final String[] f38035b = {"orientation"};

    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN, 384),
        FULL(2, -1, -1);
        
        public final int androidKind;
        public final int height;
        public final int width;

        private PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final boolean mo68565b(C17459s sVar) {
        Uri uri = sVar.f38149c;
        return ResponseConstants.CONTENT.equals(uri.getScheme()) && ResponseConstants.MEDIA.equals(uri.getAuthority());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.C17462u.C17463a mo68566e(com.squareup.picasso.C17459s r17, int r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r17
            r7 = r16
            android.content.Context r1 = r7.f38105a
            android.content.ContentResolver r14 = r1.getContentResolver()
            android.net.Uri r9 = r0.f38149c
            r1 = 0
            r15 = 0
            java.lang.String[] r10 = f38035b     // Catch:{ RuntimeException -> 0x0037, all -> 0x0030 }
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r14
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x0037, all -> 0x0030 }
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2.moveToFirst()     // Catch:{ RuntimeException -> 0x0038, all -> 0x002a }
            if (r3 != 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            int r3 = r2.getInt(r1)     // Catch:{ RuntimeException -> 0x0038, all -> 0x002a }
            r2.close()
            r8 = r3
            goto L_0x003e
        L_0x002a:
            r0 = move-exception
            r15 = r2
            goto L_0x0031
        L_0x002d:
            if (r2 == 0) goto L_0x003d
            goto L_0x003a
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r15 == 0) goto L_0x0036
            r15.close()
        L_0x0036:
            throw r0
        L_0x0037:
            r2 = r15
        L_0x0038:
            if (r2 == 0) goto L_0x003d
        L_0x003a:
            r2.close()
        L_0x003d:
            r8 = r1
        L_0x003e:
            android.net.Uri r2 = r0.f38149c
            java.lang.String r2 = r14.getType(r2)
            r9 = 1
            if (r2 == 0) goto L_0x0051
            java.lang.String r3 = "video/"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0051
            r10 = r9
            goto L_0x0052
        L_0x0051:
            r10 = r1
        L_0x0052:
            boolean r1 = r17.mo68629a()
            if (r1 == 0) goto L_0x00c5
            int r1 = r0.f38152f
            int r2 = r0.f38153g
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r3 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MICRO
            int r4 = r3.width
            if (r1 > r4) goto L_0x0067
            int r4 = r3.height
            if (r2 > r4) goto L_0x0067
            goto L_0x0071
        L_0x0067:
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r3 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.MINI
            int r4 = r3.width
            if (r1 > r4) goto L_0x0072
            int r1 = r3.height
            if (r2 > r1) goto L_0x0072
        L_0x0071:
            goto L_0x0074
        L_0x0072:
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r3 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
        L_0x0074:
            r11 = r3
            if (r10 != 0) goto L_0x008b
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            if (r11 != r1) goto L_0x008b
            java.io.InputStream r0 = r16.mo68598g(r17)
            lr.q r0 = p756lr.C19906r.m34002f(r0)
            com.squareup.picasso.u$a r1 = new com.squareup.picasso.u$a
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r1.<init>(r15, r0, r2, r8)
            return r1
        L_0x008b:
            android.net.Uri r1 = r0.f38149c
            long r12 = android.content.ContentUris.parseId(r1)
            android.graphics.BitmapFactory$Options r6 = com.squareup.picasso.C17462u.m29321c(r17)
            r6.inJustDecodeBounds = r9
            int r1 = r0.f38152f
            int r2 = r0.f38153g
            int r3 = r11.width
            int r4 = r11.height
            r5 = r6
            r9 = r6
            r6 = r17
            com.squareup.picasso.C17462u.m29320a(r1, r2, r3, r4, r5, r6)
            if (r10 == 0) goto L_0x00b5
            com.squareup.picasso.MediaStoreRequestHandler$PicassoKind r1 = com.squareup.picasso.MediaStoreRequestHandler.PicassoKind.FULL
            if (r11 != r1) goto L_0x00ae
            r1 = 1
            goto L_0x00b0
        L_0x00ae:
            int r1 = r11.androidKind
        L_0x00b0:
            android.graphics.Bitmap r1 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r14, r12, r1, r9)
            goto L_0x00bb
        L_0x00b5:
            int r1 = r11.androidKind
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r14, r12, r1, r9)
        L_0x00bb:
            if (r1 == 0) goto L_0x00c5
            com.squareup.picasso.u$a r0 = new com.squareup.picasso.u$a
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r0.<init>(r1, r15, r2, r8)
            return r0
        L_0x00c5:
            java.io.InputStream r0 = r16.mo68598g(r17)
            lr.q r0 = p756lr.C19906r.m34002f(r0)
            com.squareup.picasso.u$a r1 = new com.squareup.picasso.u$a
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r1.<init>(r15, r0, r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.mo68566e(com.squareup.picasso.s, int):com.squareup.picasso.u$a");
    }
}
