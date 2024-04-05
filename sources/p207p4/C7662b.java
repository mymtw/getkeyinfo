package p207p4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import kotlin.jvm.internal.C19382n;
import p025b5.C3479d;
import p150j4.C7114e;
import p159k4.C7191a;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7596r;

/* renamed from: p4.b */
public final class C7662b implements C7588n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f16972a;

    /* renamed from: p4.b$a */
    public static class C7663a implements C7590o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f16973a;

        public C7663a(Context context) {
            this.f16973a = context;
        }

        /* renamed from: b */
        public final C7588n<Uri, InputStream> mo20003b(C7596r rVar) {
            return new C7662b(this.f16973a);
        }
    }

    public C7662b(Context context) {
        this.f16972a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        Uri uri = (Uri) obj;
        if (!(i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384)) {
            return null;
        }
        C3479d dVar = new C3479d(uri);
        Context context = this.f16972a;
        return new C7588n.C7589a(dVar, C7191a.m13853c(context, uri, new C7191a.C7192a(context.getContentResolver())));
    }

    /* renamed from: b */
    public final boolean mo20001b(Object obj) {
        Uri uri = (Uri) obj;
        return C19382n.m32766q0(uri) && !uri.getPathSegments().contains("video");
    }
}
