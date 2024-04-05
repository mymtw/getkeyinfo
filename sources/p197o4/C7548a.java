package p197o4;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.data.C5976h;
import com.bumptech.glide.load.data.C5983m;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.InputStream;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.a */
public final class C7548a<Data> implements C7588n<Uri, Data> {

    /* renamed from: a */
    public final AssetManager f16812a;

    /* renamed from: b */
    public final C7549a<Data> f16813b;

    /* renamed from: o4.a$a */
    public interface C7549a<Data> {
        /* renamed from: a */
        C5968d<Data> mo20002a(AssetManager assetManager, String str);
    }

    /* renamed from: o4.a$b */
    public static class C7550b implements C7590o<Uri, AssetFileDescriptor>, C7549a<AssetFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f16814a;

        public C7550b(AssetManager assetManager) {
            this.f16814a = assetManager;
        }

        /* renamed from: a */
        public final C5968d<AssetFileDescriptor> mo20002a(AssetManager assetManager, String str) {
            return new C5976h(assetManager, str);
        }

        /* renamed from: b */
        public final C7588n<Uri, AssetFileDescriptor> mo20003b(C7596r rVar) {
            return new C7548a(this.f16814a, this);
        }
    }

    /* renamed from: o4.a$c */
    public static class C7551c implements C7590o<Uri, InputStream>, C7549a<InputStream> {

        /* renamed from: a */
        public final AssetManager f16815a;

        public C7551c(AssetManager assetManager) {
            this.f16815a = assetManager;
        }

        /* renamed from: a */
        public final C5968d<InputStream> mo20002a(AssetManager assetManager, String str) {
            return new C5983m(assetManager, str);
        }

        /* renamed from: b */
        public final C7588n<Uri, InputStream> mo20003b(C7596r rVar) {
            return new C7548a(this.f16815a, this);
        }
    }

    public C7548a(AssetManager assetManager, C7549a<Data> aVar) {
        this.f16812a = assetManager;
        this.f16813b = aVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri = (Uri) obj;
        return new C7588n.C7589a(new C3479d(uri), this.f16813b.mo20002a(this.f16812a, uri.toString().substring(22)));
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        Uri uri = (Uri) obj;
        return ResponseConstants.FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
