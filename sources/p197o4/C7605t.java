package p197o4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.t */
public final class C7605t<Data> implements C7588n<String, Data> {

    /* renamed from: a */
    public final C7588n<Uri, Data> f16884a;

    /* renamed from: o4.t$a */
    public static final class C7606a implements C7590o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public final C7588n<String, AssetFileDescriptor> mo20003b(C7596r rVar) {
            return new C7605t(rVar.mo20029b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: o4.t$b */
    public static class C7607b implements C7590o<String, ParcelFileDescriptor> {
        /* renamed from: b */
        public final C7588n<String, ParcelFileDescriptor> mo20003b(C7596r rVar) {
            return new C7605t(rVar.mo20029b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o4.t$c */
    public static class C7608c implements C7590o<String, InputStream> {
        /* renamed from: b */
        public final C7588n<String, InputStream> mo20003b(C7596r rVar) {
            return new C7605t(rVar.mo20029b(Uri.class, InputStream.class));
        }
    }

    public C7605t(C7588n<Uri, Data> nVar) {
        this.f16884a = nVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null || !this.f16884a.mo20001b(uri)) {
            return null;
        }
        return this.f16884a.mo20000a(uri, i, i2, eVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
