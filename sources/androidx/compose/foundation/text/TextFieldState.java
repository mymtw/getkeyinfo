package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.C1989i;
import androidx.compose.p015ui.text.input.C2004v;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1416u0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import p753kq.C19857l;

public final class TextFieldState {

    /* renamed from: a */
    public C0957k f1944a;

    /* renamed from: b */
    public final C1416u0 f1945b;

    /* renamed from: c */
    public final C1985e f1946c = new C1985e();

    /* renamed from: d */
    public C2004v f1947d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1948e;

    /* renamed from: f */
    public C1689j f1949f;

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f1950g;

    /* renamed from: h */
    public final ParcelableSnapshotMutableState f1951h;

    /* renamed from: i */
    public boolean f1952i;

    /* renamed from: j */
    public final ParcelableSnapshotMutableState f1953j;

    /* renamed from: k */
    public final ParcelableSnapshotMutableState f1954k;

    /* renamed from: l */
    public final ParcelableSnapshotMutableState f1955l;

    /* renamed from: m */
    public final C0951e f1956m;

    /* renamed from: n */
    public C19857l<? super TextFieldValue, C19394m> f1957n;

    /* renamed from: o */
    public final C19857l<TextFieldValue, C19394m> f1958o;

    /* renamed from: p */
    public final C19857l<C1989i, C19394m> f1959p;

    /* renamed from: q */
    public final C1516e f1960q;

    public TextFieldState(C0957k kVar, C1416u0 u0Var) {
        this.f1944a = kVar;
        this.f1945b = u0Var;
        Boolean bool = Boolean.FALSE;
        this.f1948e = C0761x.m1751w0(bool, C1351n1.f2948a);
        this.f1950g = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.f1951h = C0761x.m1751w0(HandleState.None, C1351n1.f2948a);
        this.f1953j = C0761x.m1751w0(bool, C1351n1.f2948a);
        this.f1954k = C0761x.m1751w0(bool, C1351n1.f2948a);
        this.f1955l = C0761x.m1751w0(bool, C1351n1.f2948a);
        this.f1956m = new C0951e();
        this.f1957n = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.f1958o = new TextFieldState$onValueChange$1(this);
        this.f1959p = new TextFieldState$onImeActionPerformed$1(this);
        this.f1960q = new C1516e();
    }

    /* renamed from: a */
    public final HandleState mo4560a() {
        return (HandleState) this.f1951h.getValue();
    }

    /* renamed from: b */
    public final boolean mo4561b() {
        return ((Boolean) this.f1948e.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final C0965r mo4562c() {
        return (C0965r) this.f1950g.getValue();
    }
}
