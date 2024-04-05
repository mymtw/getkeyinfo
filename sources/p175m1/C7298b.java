package p175m1;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* renamed from: m1.b */
public final class C7298b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f16182a = new Object();

    /* renamed from: b */
    public static volatile C7298b f16183b;

    /* renamed from: c */
    public static Class<?> f16184c;

    @SuppressLint({"PrivateApi"})
    public C7298b() {
        try {
            f16184c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7298b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f16184c;
        return cls != null ? SpannableBuilder.create(cls, charSequence) : super.newEditable(charSequence);
    }
}
