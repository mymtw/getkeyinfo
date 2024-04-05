package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.focus.C1478l;
import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1909p;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1989i;
import androidx.compose.p015ui.text.input.C1990j;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2004v;
import androidx.compose.p015ui.text.input.C2005w;
import androidx.compose.p015ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p001a0.C0005b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1478l $focusRequester;
    public final /* synthetic */ C1990j $imeOptions;
    public final /* synthetic */ boolean $isPassword;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ C2005w $transformedText;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1(C1990j jVar, C2005w wVar, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, TextFieldState textFieldState, C1994n nVar, TextFieldSelectionManager textFieldSelectionManager, C1478l lVar) {
        super(1);
        this.$imeOptions = jVar;
        this.$transformedText = wVar;
        this.$value = textFieldValue;
        this.$enabled = z;
        this.$isPassword = z2;
        this.$readOnly = z3;
        this.$state = textFieldState;
        this.$offsetMapping = nVar;
        this.$manager = textFieldSelectionManager;
        this.$focusRequester = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        int i = this.$imeOptions.f4485e;
        C1909p pVar = C1908o.f4264l;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        pVar.mo7356a(qVar, jVarArr[11], new C1989i(i));
        C1913a aVar = this.$transformedText.f4528a;
        C19383o.m32797g(aVar, "<set-?>");
        C1908o.f4262j.mo7356a(qVar, jVarArr[9], aVar);
        C1908o.f4263k.mo7356a(qVar, jVarArr[10], new C2022r(this.$value.f4449b));
        if (!this.$enabled) {
            C1908o.m4195b(qVar);
        }
        if (this.$isPassword) {
            qVar.mo7342a(SemanticsProperties.f4214y, C19394m.f43287a);
        }
        final TextFieldState textFieldState = this.$state;
        qVar.mo7342a(C1902i.f4230a, new C1894a((String) null, new C19857l<List<C2021q>, Boolean>() {
            public final Boolean invoke(List<C2021q> list) {
                boolean z;
                C19383o.m32797g(list, "it");
                if (textFieldState.mo4562c() != null) {
                    C0965r c = textFieldState.mo4562c();
                    C19383o.m32794d(c);
                    list.add(c.f2042a);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
        final TextFieldState textFieldState2 = this.$state;
        qVar.mo7342a(C1902i.f4237h, new C1894a((String) null, new C19857l<C1913a, Boolean>() {
            public final Boolean invoke(C1913a aVar) {
                C19383o.m32797g(aVar, "it");
                C19857l<TextFieldValue, C19394m> lVar = textFieldState2.f1958o;
                String str = aVar.f4296b;
                int length = str.length();
                lVar.invoke(new TextFieldValue(str, C0005b.m47l(length, length), 4));
                return Boolean.TRUE;
            }
        }));
        final C1994n nVar = this.$offsetMapping;
        final boolean z = this.$enabled;
        final TextFieldValue textFieldValue = this.$value;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        final TextFieldState textFieldState3 = this.$state;
        qVar.mo7342a(C1902i.f4236g, new C1894a((String) null, new C19862q<Integer, Integer, Boolean, Boolean>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i, int i2, boolean z) {
                if (!z) {
                    i = nVar.mo7683a(i);
                }
                if (!z) {
                    i2 = nVar.mo7683a(i2);
                }
                boolean z2 = false;
                if (z) {
                    long j = textFieldValue.f4449b;
                    int i3 = C2022r.f4596c;
                    if (!(i == ((int) (j >> 32)) && i2 == C2022r.m4464c(j))) {
                        if ((i > i2 ? i2 : i) >= 0) {
                            if ((i < i2 ? i2 : i) <= textFieldValue.f4448a.length()) {
                                if (z || i == i2) {
                                    TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                                    TextFieldState textFieldState = textFieldSelectionManager.f2086d;
                                    if (textFieldState != null) {
                                        textFieldState.f1952i = false;
                                    }
                                    textFieldSelectionManager.mo4654m(HandleState.None);
                                } else {
                                    textFieldSelectionManager.mo4649h();
                                }
                                textFieldState3.f1958o.invoke(new TextFieldValue(textFieldValue.f4448a, C0005b.m47l(i, i2), (C2022r) null));
                                z2 = true;
                            }
                        }
                        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                        TextFieldState textFieldState2 = textFieldSelectionManager2.f2086d;
                        if (textFieldState2 != null) {
                            textFieldState2.f1952i = false;
                        }
                        textFieldSelectionManager2.mo4654m(HandleState.None);
                    }
                }
                return Boolean.valueOf(z2);
            }
        }));
        final TextFieldState textFieldState4 = this.$state;
        final C1478l lVar = this.$focusRequester;
        final boolean z2 = this.$readOnly;
        C1908o.m4198e(qVar, (String) null, new C19846a<Boolean>() {
            public final Boolean invoke() {
                C2004v vVar;
                TextFieldState textFieldState = textFieldState4;
                C1478l lVar = lVar;
                boolean z = !z2;
                if (!textFieldState.mo4561b()) {
                    lVar.mo6218a();
                } else if (z && (vVar = textFieldState.f1947d) != null && C19383o.m32792b(vVar.f4526a.f4524b.get(), vVar)) {
                    vVar.f4527b.mo7641e();
                }
                return Boolean.TRUE;
            }
        });
        final TextFieldSelectionManager textFieldSelectionManager2 = this.$manager;
        qVar.mo7342a(C1902i.f4232c, new C1894a((String) null, new C19846a<Boolean>() {
            public final Boolean invoke() {
                textFieldSelectionManager2.mo4649h();
                return Boolean.TRUE;
            }
        }));
        if (!C2022r.m4463b(this.$value.f4449b) && !this.$isPassword) {
            final TextFieldSelectionManager textFieldSelectionManager3 = this.$manager;
            qVar.mo7342a(C1902i.f4238i, new C1894a((String) null, new C19846a<Boolean>() {
                public final Boolean invoke() {
                    textFieldSelectionManager3.mo4646d(true);
                    return Boolean.TRUE;
                }
            }));
            if (this.$enabled && !this.$readOnly) {
                final TextFieldSelectionManager textFieldSelectionManager4 = this.$manager;
                qVar.mo7342a(C1902i.f4239j, new C1894a((String) null, new C19846a<Boolean>() {
                    public final Boolean invoke() {
                        textFieldSelectionManager4.mo4647f();
                        return Boolean.TRUE;
                    }
                }));
            }
        }
        if (this.$enabled && !this.$readOnly) {
            final TextFieldSelectionManager textFieldSelectionManager5 = this.$manager;
            qVar.mo7342a(C1902i.f4240k, new C1894a((String) null, new C19846a<Boolean>() {
                public final Boolean invoke() {
                    textFieldSelectionManager5.mo4653l();
                    return Boolean.TRUE;
                }
            }));
        }
    }
}
