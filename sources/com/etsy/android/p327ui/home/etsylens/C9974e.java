package com.etsy.android.p327ui.home.etsylens;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8891f;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.util.C12059p;
import com.etsy.android.util.C12060q;
import java.io.File;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.etsylens.e */
public final class C9974e extends C2866i0 {

    /* renamed from: b */
    public final C11786n f21960b;

    /* renamed from: c */
    public final C9973d f21961c;

    /* renamed from: d */
    public final C2895z<C12059p<C9975a>> f21962d;

    /* renamed from: e */
    public final C2895z f21963e;

    /* renamed from: com.etsy.android.ui.home.etsylens.e$a */
    public interface C9975a {

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$a */
        public static final class C9976a implements C9975a {

            /* renamed from: a */
            public final String f21964a;

            public C9976a(String str) {
                this.f21964a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9976a) && C19383o.m32792b(this.f21964a, ((C9976a) obj).f21964a);
            }

            public final int hashCode() {
                return this.f21964a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("LogAnalyticsEvent(analyticsEventName="), this.f21964a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$b */
        public static final class C9977b implements C9975a {

            /* renamed from: a */
            public final File f21965a;

            public C9977b(File file) {
                this.f21965a = file;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9977b) && C19383o.m32792b(this.f21965a, ((C9977b) obj).f21965a);
            }

            public final int hashCode() {
                return this.f21965a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("NavigateToEtsyLensResults(file=");
                h.append(this.f21965a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$c */
        public static final class C9978c implements C9975a {

            /* renamed from: a */
            public static final C9978c f21966a = new C9978c();
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$d */
        public static final class C9979d implements C9975a {

            /* renamed from: a */
            public static final C9979d f21967a = new C9979d();
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$e */
        public static final class C9980e implements C9975a {

            /* renamed from: a */
            public final File f21968a;

            /* renamed from: b */
            public final int f21969b = 280;

            public C9980e(File file) {
                C19383o.m32797g(file, ResponseConstants.FILE);
                this.f21968a = file;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9980e)) {
                    return false;
                }
                C9980e eVar = (C9980e) obj;
                return C19383o.m32792b(this.f21968a, eVar.f21968a) && this.f21969b == eVar.f21969b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f21969b) + (this.f21968a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ResizeImageFile(file=");
                h.append(this.f21968a);
                h.append(", maxSize=");
                return C0073e.m208h(h, this.f21969b, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$f */
        public static final class C9981f implements C9975a {

            /* renamed from: a */
            public static final C9981f f21970a = new C9981f();
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$g */
        public static final class C9982g implements C9975a {

            /* renamed from: a */
            public static final C9982g f21971a = new C9982g();
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$h */
        public static final class C9983h implements C9975a {

            /* renamed from: a */
            public final String f21972a;

            public C9983h(String str) {
                this.f21972a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9983h) && C19383o.m32792b(this.f21972a, ((C9983h) obj).f21972a);
            }

            public final int hashCode() {
                return this.f21972a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("ShowErrorMessage(message="), this.f21972a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.home.etsylens.e$a$i */
        public static final class C9984i implements C9975a {

            /* renamed from: a */
            public static final C9984i f21973a = new C9984i();
        }
    }

    public C9974e(C11786n nVar, C9973d dVar) {
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(dVar, "etsyLensRepository");
        this.f21960b = nVar;
        this.f21961c = dVar;
        C2895z<C12059p<C9975a>> zVar = new C2895z<>();
        this.f21962d = zVar;
        this.f21963e = zVar;
    }

    /* renamed from: b */
    public final void mo33164b(C8891f fVar) {
        if (fVar instanceof C8891f.C8894c) {
            C12060q.m19871b(this.f21962d, new C9975a.C9983h(this.f21960b.mo38059c(R.string.error_no_image_chooser_app_found, new Object[0])));
        } else if (fVar instanceof C8891f.C8896e) {
        } else {
            if (fVar instanceof C8891f.C8893b) {
                C12060q.m19871b(this.f21962d, new C9975a.C9980e(((C8891f.C8893b) fVar).f19653c));
            } else if (fVar instanceof C8891f.C8892a) {
                File file = ((C8891f.C8892a) fVar).f19650b;
                if (file != null) {
                    file.delete();
                }
                C12060q.m19871b(this.f21962d, new C9975a.C9983h(this.f21960b.mo38059c(R.string.etsy_lens_image_save_error, new Object[0])));
            } else if (!(fVar instanceof C8891f.C8895d)) {
                boolean z = fVar instanceof C8891f.C8897f;
            }
        }
    }

    /* renamed from: c */
    public final void mo33165c(boolean z) {
        if (z) {
            C12060q.m19871b(this.f21962d, C9975a.C9984i.f21973a);
        } else {
            C12060q.m19871b(this.f21962d, new C9975a.C9983h(this.f21960b.mo38059c(R.string.etsy_lens_no_storage_permission_take_picture_error, new Object[0])));
        }
    }

    /* renamed from: d */
    public final void mo33166d(boolean z) {
        if (z) {
            C12060q.m19871b(this.f21962d, C9975a.C9981f.f21970a);
        } else {
            C12060q.m19871b(this.f21962d, new C9975a.C9983h(this.f21960b.mo38059c(R.string.etsy_lens_no_storage_permission_select_file_error, new Object[0])));
        }
    }

    public final void onCleared() {
    }
}
