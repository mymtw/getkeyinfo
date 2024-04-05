package p672sk;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.preference.ListPreferenceDialogFragmentCompat;
import com.etsy.android.p327ui.user.addresses.C11442q;
import com.etsy.android.p327ui.user.review.C11707f;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

/* renamed from: sk.a */
public class C18519a extends AlertDialog.C0133a {

    /* renamed from: c */
    public MaterialShapeDrawable f40779c;

    /* renamed from: d */
    public final Rect f40780d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18519a(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 2130969589(0x7f0403f5, float:1.7547864E38)
            android.util.TypedValue r0 = p507al.C14024b.m21580a(r7, r0)
            if (r0 != 0) goto L_0x000b
            r0 = 0
            goto L_0x000d
        L_0x000b:
            int r0 = r0.data
        L_0x000d:
            r1 = 0
            r2 = 2130968620(0x7f04002c, float:1.7545899E38)
            r3 = 2132017761(0x7f140261, float:1.967381E38)
            android.content.Context r7 = p574gl.C17790a.m29918a(r7, r1, r2, r3)
            if (r0 != 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            r4.<init>((android.content.Context) r7, (int) r0)
            r7 = r4
        L_0x0021:
            r0 = 2132018803(0x7f140673, float:1.9675923E38)
            r6.<init>(r7, r0)
            android.content.Context r7 = r6.getContext()
            android.content.res.Resources$Theme r0 = r7.getTheme()
            android.graphics.Rect r4 = p672sk.C18520b.m31248a(r2, r7, r3)
            r6.f40780d = r4
            r4 = 2130969073(0x7f0401f1, float:1.7546818E38)
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            int r4 = p507al.C14024b.m21581b(r7, r4, r5)
            com.google.android.material.shape.MaterialShapeDrawable r5 = new com.google.android.material.shape.MaterialShapeDrawable
            r5.<init>(r7, r1, r2, r3)
            r5.initializeElevationOverlay(r7)
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r4)
            r5.setFillColor(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r7 < r1) goto L_0x0082
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r2 = 1
            r0.resolveAttribute(r1, r7, r2)
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r7.getDimension(r0)
            int r7 = r7.type
            r1 = 5
            if (r7 != r1) goto L_0x0082
            r7 = 0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0082
            r5.setCornerSize((float) r0)
        L_0x0082:
            r6.f40779c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p672sk.C18519a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final AlertDialog.C0133a mo1228a(BitmapDrawable bitmapDrawable) {
        this.f286a.f261c = bitmapDrawable;
        return this;
    }

    /* renamed from: b */
    public final AlertDialog.C0133a mo1229b(int i) {
        throw null;
    }

    /* renamed from: c */
    public final void mo1230c(CharSequence charSequence) {
        this.f286a.f264f = charSequence;
    }

    public final AlertDialog create() {
        AlertDialog create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        MaterialShapeDrawable materialShapeDrawable = this.f40779c;
        if (materialShapeDrawable instanceof MaterialShapeDrawable) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            materialShapeDrawable.setElevation(C2364y.C2373i.m5262i(decorView));
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.f40779c;
        Rect rect = this.f40780d;
        window.setBackgroundDrawable(new InsetDrawable(materialShapeDrawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.f40780d));
        return create;
    }

    /* renamed from: d */
    public final void mo1232d(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.mo1232d(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    /* renamed from: e */
    public final AlertDialog.C0133a mo1233e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.mo1233e(charSequence, onClickListener);
        return this;
    }

    /* renamed from: f */
    public final AlertDialog.C0133a mo1234f(DialogInterface.OnDismissListener onDismissListener) {
        this.f286a.f273o = onDismissListener;
        return this;
    }

    /* renamed from: g */
    public final AlertDialog.C0133a mo1235g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.mo1235g(charSequence, onClickListener);
        return this;
    }

    /* renamed from: h */
    public final void mo1237h(CharSequence[] charSequenceArr, int i, ListPreferenceDialogFragmentCompat.C3002a aVar) {
        super.mo1237h(charSequenceArr, i, aVar);
    }

    /* renamed from: i */
    public final AlertDialog.C0133a mo1238i(int i) {
        throw null;
    }

    /* renamed from: j */
    public final AlertDialog.C0133a mo1239j() {
        super.mo1239j();
        return this;
    }

    /* renamed from: l */
    public final void mo70023l(int i) {
        super.mo1229b(i);
    }

    /* renamed from: m */
    public final C18519a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C18519a) super.setNegativeButton(i, onClickListener);
    }

    /* renamed from: n */
    public final void mo70025n(String str, C11707f fVar) {
        super.mo1233e(str, fVar);
    }

    /* renamed from: o */
    public final C18519a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C18519a) super.setPositiveButton(i, onClickListener);
    }

    /* renamed from: p */
    public final void mo70027p(String str, C11442q qVar) {
        super.mo1235g(str, qVar);
    }

    /* renamed from: q */
    public final C18519a setTitle(CharSequence charSequence) {
        return (C18519a) super.setTitle(charSequence);
    }

    /* renamed from: r */
    public final void mo70029r(int i) {
        super.mo1238i(i);
    }

    /* renamed from: s */
    public final C18519a setView(View view) {
        return (C18519a) super.setView(view);
    }
}
