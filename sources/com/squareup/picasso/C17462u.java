package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import p756lr.C19888c0;

/* renamed from: com.squareup.picasso.u */
public abstract class C17462u {
    /* renamed from: a */
    public static void m29320a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C17459s sVar) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = sVar.f38156j ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: c */
    public static BitmapFactory.Options m29321c(C17459s sVar) {
        boolean a = sVar.mo68629a();
        boolean z = sVar.f38163q != null;
        BitmapFactory.Options options = null;
        if (a || z || sVar.f38162p) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = a;
            boolean z2 = sVar.f38162p;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = sVar.f38163q;
            }
        }
        return options;
    }

    /* renamed from: b */
    public abstract boolean mo68565b(C17459s sVar);

    /* renamed from: d */
    public int mo68567d() {
        return 0;
    }

    /* renamed from: e */
    public abstract C17463a mo68566e(C17459s sVar, int i) throws IOException;

    /* renamed from: f */
    public boolean mo68568f(NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: com.squareup.picasso.u$a */
    public static final class C17463a {

        /* renamed from: a */
        public final Picasso.LoadedFrom f38177a;

        /* renamed from: b */
        public final Bitmap f38178b;

        /* renamed from: c */
        public final C19888c0 f38179c;

        /* renamed from: d */
        public final int f38180d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C17463a(C19888c0 c0Var, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) null, c0Var, loadedFrom, 0);
            StringBuilder sb = C17427a0.f38069a;
            if (c0Var != null) {
                return;
            }
            throw new NullPointerException("source == null");
        }

        public C17463a(Bitmap bitmap, C19888c0 c0Var, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) != (c0Var == null ? false : true)) {
                this.f38178b = bitmap;
                this.f38179c = c0Var;
                StringBuilder sb = C17427a0.f38069a;
                if (loadedFrom != null) {
                    this.f38177a = loadedFrom;
                    this.f38180d = i;
                    return;
                }
                throw new NullPointerException("loadedFrom == null");
            }
            throw new AssertionError();
        }
    }
}
