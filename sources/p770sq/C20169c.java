package p770sq;

import android.content.Context;
import lib.android.paypal.com.magnessdk.Environment;

/* renamed from: sq.c */
public final class C20169c {

    /* renamed from: a */
    public int f44672a = -1;

    /* renamed from: b */
    public Context f44673b;

    /* renamed from: c */
    public Environment f44674c;

    /* renamed from: sq.c$a */
    public static class C20170a {

        /* renamed from: a */
        public int f44675a = -1;

        /* renamed from: b */
        public Context f44676b;

        /* renamed from: c */
        public Environment f44677c = Environment.LIVE;

        public C20170a(Context context) {
            this.f44676b = context;
        }
    }

    public C20169c(C20170a aVar) {
        this.f44672a = aVar.f44675a;
        this.f44673b = aVar.f44676b;
        this.f44674c = aVar.f44677c;
    }
}
