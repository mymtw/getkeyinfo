package com.etsy.android.p327ui.favorites.editlist;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.p327ui.favorites.C9743a0;
import com.etsy.android.p327ui.favorites.C9852g;
import com.etsy.android.p327ui.favorites.C9901z;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p456ua.C13461f;
import p470w9.C13793a;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel */
public final class EditCollectionViewModel extends C2866i0 {

    /* renamed from: b */
    public final C9852g f21735b;

    /* renamed from: c */
    public final C9901z f21736c;

    /* renamed from: d */
    public final C13461f f21737d;

    /* renamed from: e */
    public final C11786n f21738e;

    /* renamed from: f */
    public final C2895z<C9838a> f21739f = new C2895z<>();

    /* renamed from: g */
    public final C7091a f21740g = new C7091a();

    /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a */
    public static abstract class C9838a {

        /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a$a */
        public static final class C9839a extends C9838a {

            /* renamed from: a */
            public final Throwable f21741a;

            public C9839a(Throwable th) {
                C19383o.m32797g(th, "throwable");
                this.f21741a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9839a) && C19383o.m32792b(this.f21741a, ((C9839a) obj).f21741a);
            }

            public final int hashCode() {
                return this.f21741a.hashCode();
            }

            public final String toString() {
                return C0070b.m185h(C0072d.m201h("DeleteFailure(throwable="), this.f21741a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a$b */
        public static final class C9840b extends C9838a {

            /* renamed from: a */
            public static final C9840b f21742a = new C9840b();
        }

        /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a$c */
        public static final class C9841c extends C9838a {

            /* renamed from: a */
            public static final C9841c f21743a = new C9841c();
        }

        /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a$d */
        public static final class C9842d extends C9838a {

            /* renamed from: a */
            public final String f21744a;

            /* renamed from: b */
            public final Throwable f21745b;

            public C9842d(String str, Throwable th) {
                C19383o.m32797g(th, "throwable");
                this.f21744a = str;
                this.f21745b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9842d)) {
                    return false;
                }
                C9842d dVar = (C9842d) obj;
                return C19383o.m32792b(this.f21744a, dVar.f21744a) && C19383o.m32792b(this.f21745b, dVar.f21745b);
            }

            public final int hashCode() {
                return this.f21745b.hashCode() + (this.f21744a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SaveFailure(errorMessage=");
                h.append(this.f21744a);
                h.append(", throwable=");
                return C0070b.m185h(h, this.f21745b, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a$e */
        public static final class C9843e extends C9838a {

            /* renamed from: a */
            public final Collection f21746a;

            public C9843e(Collection collection) {
                C19383o.m32797g(collection, "result");
                this.f21746a = collection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9843e) && C19383o.m32792b(this.f21746a, ((C9843e) obj).f21746a);
            }

            public final int hashCode() {
                return this.f21746a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SaveSuccess(result=");
                h.append(this.f21746a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.favorites.editlist.EditCollectionViewModel$a$f */
        public static final class C9844f extends C9838a {

            /* renamed from: a */
            public static final C9844f f21747a = new C9844f();
        }
    }

    public EditCollectionViewModel(C13461f fVar, C9852g gVar, C9901z zVar, C11786n nVar) {
        this.f21735b = gVar;
        this.f21736c = zVar;
        this.f21737d = fVar;
        this.f21738e = nVar;
    }

    /* renamed from: b */
    public final void mo32892b(C9743a0 a0Var) {
        C19383o.m32797g(a0Var, "updateCollectionSpec");
        this.f21739f.postValue(C9838a.C9844f.f21747a);
        C9901z zVar = this.f21736c;
        zVar.getClass();
        C8071s<C20145v<C19928a0>> a = zVar.f21839a.mo33001a(a0Var.f21539a, C19294b0.m32562s0(new Pair(ResponseConstants.PRIVACY_LEVEL, a0Var.f21541c), new Pair("name", String.valueOf(a0Var.f21540b))));
        C13793a aVar = new C13793a(3);
        a.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21737d, C0326j.m860e(this.f21737d, new C19208j(a, aVar))), new EditCollectionViewModel$save$1(this), new EditCollectionViewModel$save$2(this));
        C7091a aVar2 = this.f21740g;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(e);
    }

    public final void onCleared() {
        this.f21740g.mo19405d();
        super.onCleared();
    }
}
