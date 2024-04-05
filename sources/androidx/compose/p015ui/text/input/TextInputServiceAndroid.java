package androidx.compose.p015ui.text.input;

import android.content.Context;
import android.view.View;
import androidx.compose.p015ui.text.C2022r;
import com.google.android.gms.common.api.Api;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid */
public final class TextInputServiceAndroid implements C1998p {

    /* renamed from: a */
    public final View f4451a;

    /* renamed from: b */
    public final C1992l f4452b;

    /* renamed from: c */
    public boolean f4453c;

    /* renamed from: d */
    public C19857l<? super List<? extends C1984d>, C19394m> f4454d = TextInputServiceAndroid$onEditCommand$1.INSTANCE;

    /* renamed from: e */
    public C19857l<? super C1989i, C19394m> f4455e = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;

    /* renamed from: f */
    public TextFieldValue f4456f = new TextFieldValue("", C2022r.f4595b, 4);

    /* renamed from: g */
    public C1990j f4457g = C1990j.f4480f;

    /* renamed from: h */
    public RecordingInputConnection f4458h;

    /* renamed from: i */
    public final C19285c f4459i = C19350d.m32676a(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));

    /* renamed from: j */
    public final AbstractChannel f4460j = C17782b.m29872l(Api.BaseClientBuilder.API_PRIORITY_OTHER, (BufferOverflow) null, 6);

    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$a */
    public /* synthetic */ class C1980a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4461a;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[TextInputCommand.StartInput.ordinal()] = 1;
            iArr[TextInputCommand.StopInput.ordinal()] = 2;
            iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            f4461a = iArr;
        }
    }

    public TextInputServiceAndroid(View view) {
        C19383o.m32797g(view, "view");
        Context context = view.getContext();
        C19383o.m32796f(context, "view.context");
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(context);
        this.f4451a = view;
        this.f4452b = inputMethodManagerImpl;
    }

    /* renamed from: a */
    public final void mo7637a() {
        this.f4453c = false;
        this.f4454d = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.f4455e = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.f4460j.mo72199l(TextInputCommand.StopInput);
    }

    /* renamed from: b */
    public final void mo7638b(TextFieldValue textFieldValue, C1990j jVar, C19857l<? super List<? extends C1984d>, C19394m> lVar, C19857l<? super C1989i, C19394m> lVar2) {
        this.f4453c = true;
        this.f4456f = textFieldValue;
        this.f4457g = jVar;
        this.f4454d = lVar;
        this.f4455e = lVar2;
        this.f4460j.mo72199l(TextInputCommand.StartInput);
    }

    /* renamed from: c */
    public final void mo7639c() {
        this.f4460j.mo72199l(TextInputCommand.HideKeyboard);
    }

    /* renamed from: d */
    public final void mo7640d(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = true;
        boolean z2 = false;
        boolean z3 = !C2022r.m4462a(this.f4456f.f4449b, textFieldValue2.f4449b) || !C19383o.m32792b(this.f4456f.f4450c, textFieldValue2.f4450c);
        this.f4456f = textFieldValue2;
        RecordingInputConnection recordingInputConnection = this.f4458h;
        if (recordingInputConnection != null) {
            recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
        }
        if (!C19383o.m32792b(textFieldValue, textFieldValue2)) {
            if (textFieldValue != null) {
                if (C19383o.m32792b(textFieldValue.f4448a.f4296b, textFieldValue2.f4448a.f4296b) && (!C2022r.m4462a(textFieldValue.f4449b, textFieldValue2.f4449b) || C19383o.m32792b(textFieldValue.f4450c, textFieldValue2.f4450c))) {
                    z = false;
                }
                z2 = z;
            }
            if (z2) {
                this.f4452b.mo7601e(this.f4451a);
                return;
            }
            RecordingInputConnection recordingInputConnection2 = this.f4458h;
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.f4456f, this.f4452b, this.f4451a);
            }
        } else if (z3) {
            C1992l lVar = this.f4452b;
            View view = this.f4451a;
            int e = C2022r.m4466e(textFieldValue2.f4449b);
            int d = C2022r.m4465d(textFieldValue2.f4449b);
            C2022r rVar = this.f4456f.f4450c;
            int e2 = rVar != null ? C2022r.m4466e(rVar.f4597a) : -1;
            C2022r rVar2 = this.f4456f.f4450c;
            lVar.mo7598b(view, e, d, e2, rVar2 != null ? C2022r.m4465d(rVar2.f4597a) : -1);
        }
    }

    /* renamed from: e */
    public final void mo7641e() {
        this.f4460j.mo72199l(TextInputCommand.ShowKeyboard);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo7642f(kotlin.coroutines.C19340c<? super kotlin.C19394m> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.p015ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = (androidx.compose.p015ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1 r0 = new androidx.compose.ui.text.input.TextInputServiceAndroid$textInputCommandEventLoop$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.f r2 = (kotlinx.coroutines.channels.C19502f) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.ui.text.input.TextInputServiceAndroid r4 = (androidx.compose.p015ui.text.input.TextInputServiceAndroid) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0052
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            kotlinx.coroutines.channels.AbstractChannel r10 = r9.f4460j
            r10.getClass()
            kotlinx.coroutines.channels.AbstractChannel$a r2 = new kotlinx.coroutines.channels.AbstractChannel$a
            r2.<init>(r10)
            r4 = r9
        L_0x0045:
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r10 = r2.mo72148a(r0)
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x0052:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0109
            java.lang.Object r10 = r2.next()
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r10 = (androidx.compose.p015ui.text.input.TextInputServiceAndroid.TextInputCommand) r10
            android.view.View r5 = r4.f4451a
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x0074
        L_0x0068:
            kotlinx.coroutines.channels.AbstractChannel r10 = r4.f4460j
            java.lang.Object r10 = r10.mo72144w()
            boolean r10 = r10 instanceof kotlinx.coroutines.channels.C19503g.C19505b
            r10 = r10 ^ r3
            if (r10 != 0) goto L_0x0068
            goto L_0x0045
        L_0x0074:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
        L_0x007e:
            if (r10 == 0) goto L_0x00c6
            int[] r7 = androidx.compose.p015ui.text.input.TextInputServiceAndroid.C1980a.f4461a
            int r8 = r10.ordinal()
            r7 = r7[r8]
            if (r7 == r3) goto L_0x00b3
            r8 = 2
            if (r7 == r8) goto L_0x00ac
            r8 = 3
            if (r7 == r8) goto L_0x0094
            r8 = 4
            if (r7 == r8) goto L_0x0094
            goto L_0x00b9
        L_0x0094:
            T r7 = r5.element
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            if (r7 != 0) goto L_0x00b9
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r7 = androidx.compose.p015ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard
            if (r10 != r7) goto L_0x00a4
            r10 = r3
            goto L_0x00a5
        L_0x00a4:
            r10 = 0
        L_0x00a5:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.element = r10
            goto L_0x00b9
        L_0x00ac:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r5.element = r10
            r6.element = r10
            goto L_0x00b9
        L_0x00b3:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r5.element = r10
            r6.element = r10
        L_0x00b9:
            kotlinx.coroutines.channels.AbstractChannel r10 = r4.f4460j
            java.lang.Object r10 = r10.mo72144w()
            java.lang.Object r10 = kotlinx.coroutines.channels.C19503g.m33188b(r10)
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r10 = (androidx.compose.p015ui.text.input.TextInputServiceAndroid.TextInputCommand) r10
            goto L_0x007e
        L_0x00c6:
            T r10 = r5.element
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r7)
            if (r10 == 0) goto L_0x00d7
            androidx.compose.ui.text.input.l r10 = r4.f4452b
            android.view.View r7 = r4.f4451a
            r10.mo7601e(r7)
        L_0x00d7:
            T r10 = r6.element
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x00f6
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00eb
            androidx.compose.ui.text.input.l r10 = r4.f4452b
            android.view.View r6 = r4.f4451a
            r10.mo7599c(r6)
            goto L_0x00f6
        L_0x00eb:
            androidx.compose.ui.text.input.l r10 = r4.f4452b
            android.view.View r6 = r4.f4451a
            android.os.IBinder r6 = r6.getWindowToken()
            r10.mo7597a(r6)
        L_0x00f6:
            T r10 = r5.element
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r10, r5)
            if (r10 == 0) goto L_0x0045
            androidx.compose.ui.text.input.l r10 = r4.f4452b
            android.view.View r5 = r4.f4451a
            r10.mo7601e(r5)
            goto L_0x0045
        L_0x0109:
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.input.TextInputServiceAndroid.mo7642f(kotlin.coroutines.c):java.lang.Object");
    }
}
