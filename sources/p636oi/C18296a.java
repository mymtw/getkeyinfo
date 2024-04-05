package p636oi;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import p513bj.C14075p;

/* renamed from: oi.a */
public final class C18296a {

    /* renamed from: r */
    public static final C18296a f40146r;

    /* renamed from: a */
    public final CharSequence f40147a;

    /* renamed from: b */
    public final Layout.Alignment f40148b;

    /* renamed from: c */
    public final Layout.Alignment f40149c;

    /* renamed from: d */
    public final Bitmap f40150d;

    /* renamed from: e */
    public final float f40151e;

    /* renamed from: f */
    public final int f40152f;

    /* renamed from: g */
    public final int f40153g;

    /* renamed from: h */
    public final float f40154h;

    /* renamed from: i */
    public final int f40155i;

    /* renamed from: j */
    public final float f40156j;

    /* renamed from: k */
    public final float f40157k;

    /* renamed from: l */
    public final boolean f40158l;

    /* renamed from: m */
    public final int f40159m;

    /* renamed from: n */
    public final int f40160n;

    /* renamed from: o */
    public final float f40161o;

    /* renamed from: p */
    public final int f40162p;

    /* renamed from: q */
    public final float f40163q;

    static {
        C18297a aVar = new C18297a();
        aVar.f40164a = "";
        f40146r = aVar.mo69838a();
    }

    public C18296a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            C14075p.m21691c(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f40147a = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.f40147a = charSequence.toString();
        } else {
            this.f40147a = null;
        }
        this.f40148b = alignment;
        this.f40149c = alignment2;
        this.f40150d = bitmap2;
        this.f40151e = f;
        this.f40152f = i;
        this.f40153g = i2;
        this.f40154h = f2;
        this.f40155i = i3;
        this.f40156j = f4;
        this.f40157k = f5;
        this.f40158l = z;
        this.f40159m = i5;
        this.f40160n = i4;
        this.f40161o = f3;
        this.f40162p = i6;
        this.f40163q = f6;
    }

    /* renamed from: oi.a$a */
    public static final class C18297a {

        /* renamed from: a */
        public CharSequence f40164a;

        /* renamed from: b */
        public Bitmap f40165b;

        /* renamed from: c */
        public Layout.Alignment f40166c;

        /* renamed from: d */
        public Layout.Alignment f40167d;

        /* renamed from: e */
        public float f40168e;

        /* renamed from: f */
        public int f40169f;

        /* renamed from: g */
        public int f40170g;

        /* renamed from: h */
        public float f40171h;

        /* renamed from: i */
        public int f40172i;

        /* renamed from: j */
        public int f40173j;

        /* renamed from: k */
        public float f40174k;

        /* renamed from: l */
        public float f40175l;

        /* renamed from: m */
        public float f40176m;

        /* renamed from: n */
        public boolean f40177n;

        /* renamed from: o */
        public int f40178o;

        /* renamed from: p */
        public int f40179p;

        /* renamed from: q */
        public float f40180q;

        public C18297a() {
            this.f40164a = null;
            this.f40165b = null;
            this.f40166c = null;
            this.f40167d = null;
            this.f40168e = -3.4028235E38f;
            this.f40169f = Integer.MIN_VALUE;
            this.f40170g = Integer.MIN_VALUE;
            this.f40171h = -3.4028235E38f;
            this.f40172i = Integer.MIN_VALUE;
            this.f40173j = Integer.MIN_VALUE;
            this.f40174k = -3.4028235E38f;
            this.f40175l = -3.4028235E38f;
            this.f40176m = -3.4028235E38f;
            this.f40177n = false;
            this.f40178o = -16777216;
            this.f40179p = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public final C18296a mo69838a() {
            return new C18296a(this.f40164a, this.f40166c, this.f40167d, this.f40165b, this.f40168e, this.f40169f, this.f40170g, this.f40171h, this.f40172i, this.f40173j, this.f40174k, this.f40175l, this.f40176m, this.f40177n, this.f40178o, this.f40179p, this.f40180q);
        }

        public C18297a(C18296a aVar) {
            this.f40164a = aVar.f40147a;
            this.f40165b = aVar.f40150d;
            this.f40166c = aVar.f40148b;
            this.f40167d = aVar.f40149c;
            this.f40168e = aVar.f40151e;
            this.f40169f = aVar.f40152f;
            this.f40170g = aVar.f40153g;
            this.f40171h = aVar.f40154h;
            this.f40172i = aVar.f40155i;
            this.f40173j = aVar.f40160n;
            this.f40174k = aVar.f40161o;
            this.f40175l = aVar.f40156j;
            this.f40176m = aVar.f40157k;
            this.f40177n = aVar.f40158l;
            this.f40178o = aVar.f40159m;
            this.f40179p = aVar.f40162p;
            this.f40180q = aVar.f40163q;
        }
    }
}
