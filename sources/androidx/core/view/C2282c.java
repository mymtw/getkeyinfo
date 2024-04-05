package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.ContentInfo;
import p001a0.C0005b;
import p003a2.C0023f;

/* renamed from: androidx.core.view.c */
public final class C2282c {

    /* renamed from: a */
    public final C2287e f5538a;

    /* renamed from: androidx.core.view.c$a */
    public static final class C2283a implements C2284b {

        /* renamed from: a */
        public final ContentInfo.Builder f5539a;

        public C2283a(ClipData clipData, int i) {
            this.f5539a = new ContentInfo.Builder(clipData, i);
        }

        /* renamed from: a */
        public final void mo8876a(Uri uri) {
            this.f5539a.setLinkUri(uri);
        }

        public final C2282c build() {
            return new C2282c(new C2286d(this.f5539a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f5539a.setExtras(bundle);
        }

        public final void setFlags(int i) {
            this.f5539a.setFlags(i);
        }
    }

    /* renamed from: androidx.core.view.c$b */
    public interface C2284b {
        /* renamed from: a */
        void mo8876a(Uri uri);

        C2282c build();

        void setExtras(Bundle bundle);

        void setFlags(int i);
    }

    /* renamed from: androidx.core.view.c$c */
    public static final class C2285c implements C2284b {

        /* renamed from: a */
        public ClipData f5540a;

        /* renamed from: b */
        public int f5541b;

        /* renamed from: c */
        public int f5542c;

        /* renamed from: d */
        public Uri f5543d;

        /* renamed from: e */
        public Bundle f5544e;

        public C2285c(ClipData clipData, int i) {
            this.f5540a = clipData;
            this.f5541b = i;
        }

        /* renamed from: a */
        public final void mo8876a(Uri uri) {
            this.f5543d = uri;
        }

        public final C2282c build() {
            return new C2282c(new C2288f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.f5544e = bundle;
        }

        public final void setFlags(int i) {
            this.f5542c = i;
        }
    }

    /* renamed from: androidx.core.view.c$d */
    public static final class C2286d implements C2287e {

        /* renamed from: a */
        public final ContentInfo f5545a;

        public C2286d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f5545a = contentInfo;
        }

        /* renamed from: a */
        public final int mo8880a() {
            return this.f5545a.getSource();
        }

        /* renamed from: b */
        public final ClipData mo8881b() {
            return this.f5545a.getClip();
        }

        /* renamed from: c */
        public final ContentInfo mo8882c() {
            return this.f5545a;
        }

        public final int getFlags() {
            return this.f5545a.getFlags();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ContentInfoCompat{");
            h.append(this.f5545a);
            h.append("}");
            return h.toString();
        }
    }

    /* renamed from: androidx.core.view.c$e */
    public interface C2287e {
        /* renamed from: a */
        int mo8880a();

        /* renamed from: b */
        ClipData mo8881b();

        /* renamed from: c */
        ContentInfo mo8882c();

        int getFlags();
    }

    /* renamed from: androidx.core.view.c$f */
    public static final class C2288f implements C2287e {

        /* renamed from: a */
        public final ClipData f5546a;

        /* renamed from: b */
        public final int f5547b;

        /* renamed from: c */
        public final int f5548c;

        /* renamed from: d */
        public final Uri f5549d;

        /* renamed from: e */
        public final Bundle f5550e;

        public C2288f(C2285c cVar) {
            ClipData clipData = cVar.f5540a;
            clipData.getClass();
            this.f5546a = clipData;
            int i = cVar.f5541b;
            C0005b.m21O(i, 5, "source");
            this.f5547b = i;
            int i2 = cVar.f5542c;
            if ((i2 & 1) == i2) {
                this.f5548c = i2;
                this.f5549d = cVar.f5543d;
                this.f5550e = cVar.f5544e;
                return;
            }
            StringBuilder h = C0072d.m201h("Requested flags 0x");
            h.append(Integer.toHexString(i2));
            h.append(", but only 0x");
            h.append(Integer.toHexString(1));
            h.append(" are allowed");
            throw new IllegalArgumentException(h.toString());
        }

        /* renamed from: a */
        public final int mo8880a() {
            return this.f5547b;
        }

        /* renamed from: b */
        public final ClipData mo8881b() {
            return this.f5546a;
        }

        /* renamed from: c */
        public final ContentInfo mo8882c() {
            return null;
        }

        public final int getFlags() {
            return this.f5548c;
        }

        public final String toString() {
            String str;
            StringBuilder h = C0072d.m201h("ContentInfoCompat{clip=");
            h.append(this.f5546a.getDescription());
            h.append(", source=");
            int i = this.f5547b;
            h.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            h.append(", flags=");
            int i2 = this.f5548c;
            h.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            String str2 = "";
            if (this.f5549d == null) {
                str = str2;
            } else {
                StringBuilder h2 = C0072d.m201h(", hasLinkUri(");
                h2.append(this.f5549d.toString().length());
                h2.append(")");
                str = h2.toString();
            }
            h.append(str);
            if (this.f5550e != null) {
                str2 = ", hasExtras";
            }
            return C0023f.m110k(h, str2, "}");
        }
    }

    public C2282c(C2287e eVar) {
        this.f5538a = eVar;
    }

    public final String toString() {
        return this.f5538a.toString();
    }
}
