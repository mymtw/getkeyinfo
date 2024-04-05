package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C1008d;
import androidx.compose.foundation.text.selection.C1009e;
import androidx.compose.foundation.text.selection.C1010f;
import androidx.compose.foundation.text.selection.C1018l;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.runtime.C1426z0;
import androidx.core.internal.view.SupportMenu;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19388s;
import p288y.C8343c;

public final class TextController implements C1426z0 {

    /* renamed from: b */
    public final TextState f1923b;

    /* renamed from: c */
    public C1018l f1924c;

    /* renamed from: d */
    public C0958l f1925d;

    /* renamed from: e */
    public final TextController$measurePolicy$1 f1926e = new TextController$measurePolicy$1(this);

    /* renamed from: f */
    public final C1436d f1927f;

    /* renamed from: g */
    public C1436d f1928g;

    /* renamed from: h */
    public C1436d f1929h;

    /* renamed from: androidx.compose.foundation.text.TextController$a */
    public static final class C0922a implements C0958l {

        /* renamed from: a */
        public long f1930a;

        /* renamed from: b */
        public long f1931b;

        /* renamed from: c */
        public final /* synthetic */ TextController f1932c;

        /* renamed from: d */
        public final /* synthetic */ C1018l f1933d;

        public C0922a(TextController textController, C1018l lVar) {
            this.f1932c = textController;
            this.f1933d = lVar;
            int i = C8343c.f18298e;
            long j = C8343c.f18295b;
            this.f1930a = j;
            this.f1931b = j;
        }

        /* renamed from: a */
        public final void mo4510a() {
        }

        /* renamed from: b */
        public final void mo4511b(long j) {
            TextController textController = this.f1932c;
            C1689j jVar = textController.f1923b.f1965e;
            if (jVar != null) {
                C1018l lVar = this.f1933d;
                if (jVar.mo6685c()) {
                    if (TextController.m1971a(textController, j, j)) {
                        lVar.mo4718g(textController.f1923b.f1962b);
                    } else {
                        lVar.mo4716e(jVar, j);
                    }
                    this.f1930a = j;
                } else {
                    return;
                }
            }
            if (SelectionRegistrarKt.m2033a(this.f1933d, this.f1932c.f1923b.f1962b)) {
                this.f1931b = C8343c.f18295b;
            }
        }

        /* renamed from: c */
        public final void mo4512c() {
        }

        /* renamed from: d */
        public final void mo4513d(long j) {
            TextController textController = this.f1932c;
            C1689j jVar = textController.f1923b.f1965e;
            if (jVar != null) {
                C1018l lVar = this.f1933d;
                if (jVar.mo6685c() && SelectionRegistrarKt.m2033a(lVar, textController.f1923b.f1962b)) {
                    long f = C8343c.m16645f(this.f1931b, j);
                    this.f1931b = f;
                    long f2 = C8343c.m16645f(this.f1930a, f);
                    if (!TextController.m1971a(textController, this.f1930a, f2)) {
                        if (lVar.mo4721j(jVar, f2, this.f1930a)) {
                            this.f1930a = f2;
                            this.f1931b = C8343c.f18295b;
                        }
                    }
                }
            }
        }

        public final void onCancel() {
            if (SelectionRegistrarKt.m2033a(this.f1933d, this.f1932c.f1923b.f1962b)) {
                this.f1933d.mo4719h();
            }
        }

        public final void onStop() {
            if (SelectionRegistrarKt.m2033a(this.f1933d, this.f1932c.f1923b.f1962b)) {
                this.f1933d.mo4719h();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.text.TextController$b */
    public static final class C0923b implements C1008d {
    }

    public TextController(TextState textState) {
        this.f1923b = textState;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        this.f1927f = C15588c1.m25270A0(DrawModifierKt.m3070a(C19388s.m32869k0(aVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (C1530k0) null, false, SupportMenu.USER_MASK), new TextController$drawTextAndSelectionBehind$1(this)), new TextController$coreModifiers$1(this));
        this.f1928g = SemanticsModifierKt.m4174a(aVar, false, new TextController$createSemanticsModifierFor$1(textState.f1961a.f2013a, this));
        this.f1929h = aVar;
    }

    /* renamed from: a */
    public static final boolean m1971a(TextController textController, long j, long j2) {
        C2021q qVar = textController.f1923b.f1966f;
        if (qVar == null) {
            return false;
        }
        int length = qVar.f4589a.f4556a.f4296b.length();
        int l = qVar.mo7751l(j);
        int l2 = qVar.mo7751l(j2);
        int i = length - 1;
        return (l >= i && l2 >= i) || (l < 0 && l2 < 0);
    }

    /* renamed from: b */
    public final void mo4508b(C0957k kVar) {
        TextState textState = this.f1923b;
        if (textState.f1961a != kVar) {
            textState.f1961a = kVar;
            this.f1928g = SemanticsModifierKt.m4174a(C1436d.C1437a.f3125b, false, new TextController$createSemanticsModifierFor$1(kVar.f2013a, this));
        }
    }

    /* renamed from: c */
    public final void mo4509c(C1018l lVar) {
        C1436d dVar;
        this.f1924c = lVar;
        if (lVar != null) {
            C0922a aVar = new C0922a(this, lVar);
            this.f1925d = aVar;
            dVar = SuspendingPointerInputFilterKt.m3484b(C1436d.C1437a.f3125b, aVar, new TextController$update$2(this, (C19340c<? super TextController$update$2>) null));
        } else {
            dVar = C1436d.C1437a.f3125b;
        }
        this.f1929h = dVar;
    }

    public final void onAbandoned() {
        C1018l lVar;
        C1010f fVar = this.f1923b.f1964d;
        if (fVar != null && (lVar = this.f1924c) != null) {
            lVar.mo4715d(fVar);
        }
    }

    public final void onForgotten() {
        C1018l lVar;
        C1010f fVar = this.f1923b.f1964d;
        if (fVar != null && (lVar = this.f1924c) != null) {
            lVar.mo4715d(fVar);
        }
    }

    public final void onRemembered() {
        C1018l lVar = this.f1924c;
        if (lVar != null) {
            TextState textState = this.f1923b;
            textState.f1964d = lVar.mo4720i(new C1009e(textState.f1962b, new TextController$onRemembered$1$1(this), new TextController$onRemembered$1$2(this)));
        }
    }
}
