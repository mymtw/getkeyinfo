package androidx.core.widget;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import java.lang.reflect.Method;
import p001a0.C0005b;

/* renamed from: androidx.core.widget.h */
public final class C2404h {

    /* renamed from: androidx.core.widget.h$a */
    public static class C2405a implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f5683a;

        /* renamed from: b */
        public final TextView f5684b;

        /* renamed from: c */
        public Class<?> f5685c;

        /* renamed from: d */
        public Method f5686d;

        /* renamed from: e */
        public boolean f5687e;

        /* renamed from: f */
        public boolean f5688f = false;

        public C2405a(ActionMode.Callback callback, TextView textView) {
            this.f5683a = callback;
            this.f5684b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f5683a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f5683a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f5683a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                r12 = this;
                android.widget.TextView r0 = r12.f5684b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f5688f
                r3 = 1
                java.lang.String r4 = "removeItemAt"
                r5 = 0
                if (r2 != 0) goto L_0x0032
                r12.f5688f = r3
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f5685c = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r6[r5] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f5686d = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f5687e = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r2 = 0
                r12.f5685c = r2
                r12.f5686d = r2
                r12.f5687e = r5
            L_0x0032:
                boolean r2 = r12.f5687e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.Class<?> r2 = r12.f5685c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r2 = r2.isInstance(r14)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.reflect.Method r2 = r12.f5686d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x004f:
                int r4 = r14.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                int r4 = r4 - r3
            L_0x0054:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r4 < 0) goto L_0x007e
                android.view.MenuItem r7 = r14.getItem(r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                android.content.Intent r8 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r8 == 0) goto L_0x007b
                android.content.Intent r7 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.String r7 = r7.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r6 = r6.equals(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r6 == 0) goto L_0x007b
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r2.invoke(r14, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x007b:
                int r4 = r4 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r4 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r4 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                android.content.Intent r4 = r4.setAction(r6)
                android.content.Intent r4 = r4.setType(r7)
                java.util.List r4 = r1.queryIntentActivities(r4, r5)
                java.util.Iterator r4 = r4.iterator()
            L_0x009f:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x00d5
                java.lang.Object r8 = r4.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto L_0x00ce
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r9 = r5
                goto L_0x00cf
            L_0x00ce:
                r9 = r3
            L_0x00cf:
                if (r9 == 0) goto L_0x009f
                r2.add(r8)
                goto L_0x009f
            L_0x00d5:
                r0 = r5
            L_0x00d6:
                int r4 = r2.size()
                if (r0 >= r4) goto L_0x0129
                java.lang.Object r4 = r2.get(r0)
                android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r4.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r5, r5, r8, r9)
                android.widget.TextView r9 = r12.f5684b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010d
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010d
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x010d
                r9 = r3
                goto L_0x010e
            L_0x010d:
                r9 = r5
            L_0x010e:
                r9 = r9 ^ r3
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r10 = r4.packageName
                java.lang.String r4 = r4.name
                android.content.Intent r4 = r9.setClassName(r10, r4)
                android.view.MenuItem r4 = r8.setIntent(r4)
                r4.setShowAsAction(r3)
                int r0 = r0 + 1
                goto L_0x00d6
            L_0x0129:
                android.view.ActionMode$Callback r0 = r12.f5683a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C2404h.C2405a.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* renamed from: a */
    public static PrecomputedTextCompat.C2270a m5359a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new PrecomputedTextCompat.C2270a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = textView.getBreakStrategy();
        int hyphenationFrequency = textView.getHyphenationFrequency();
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = false;
            if (i < 28 || (textView.getInputType() & 15) != 3) {
                if (textView.getLayoutDirection() == 1) {
                    z = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new PrecomputedTextCompat.C2270a(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* renamed from: b */
    public static void m5360b(TextView textView, int i) {
        C0005b.m22P(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m5361c(TextView textView, int i) {
        C0005b.m22P(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: d */
    public static void m5362d(TextView textView, int i) {
        C0005b.m22P(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: e */
    public static void m5363e(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(precomputedTextCompat.getPrecomputedText());
        } else if (m5359a(textView).mo8799a(precomputedTextCompat.getParams())) {
            textView.setText(precomputedTextCompat);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: f */
    public static ActionMode.Callback m5364f(ActionMode.Callback callback) {
        return callback instanceof C2405a ? ((C2405a) callback).f5683a : callback;
    }

    /* renamed from: g */
    public static ActionMode.Callback m5365g(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof C2405a) || callback == null) ? callback : new C2405a(callback, textView);
    }
}
