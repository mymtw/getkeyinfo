package p207p4;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.InputStream;
import kotlin.jvm.internal.C19382n;
import p025b5.C3479d;
import p150j4.C7114e;
import p159k4.C7191a;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7596r;

/* renamed from: p4.c */
public final class C7664c implements C7588n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f16974a;

    /* renamed from: p4.c$a */
    public static class C7665a implements C7590o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f16975a;

        public C7665a(Context context) {
            this.f16975a = context;
        }

        /* renamed from: b */
        public final C7588n<Uri, InputStream> mo20003b(C7596r rVar) {
            return new C7664c(this.f16975a);
        }
    }

    public C7664c(Context context) {
        this.f16974a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri = (Uri) obj;
        boolean z = true;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            Long l = (Long) eVar.mo19443c(VideoDecoder.f13062d);
            if (l == null || l.longValue() != -1) {
                z = false;
            }
            if (z) {
                C3479d dVar = new C3479d(uri);
                Context context = this.f16974a;
                return new C7588n.C7589a(dVar, C7191a.m13853c(context, uri, new C7191a.C7193b(context.getContentResolver())));
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        Uri uri = (Uri) obj;
        return C19382n.m32766q0(uri) && uri.getPathSegments().contains("video");
    }
}
