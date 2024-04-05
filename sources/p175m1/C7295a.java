package p175m1;

import android.widget.EditText;

/* renamed from: m1.a */
public final class C7295a {

    /* renamed from: a */
    public final C7296a f16179a;

    /* renamed from: m1.a$a */
    public static class C7296a extends C7297b {

        /* renamed from: a */
        public final EditText f16180a;

        /* renamed from: b */
        public final C7309g f16181b;

        public C7296a(EditText editText) {
            this.f16180a = editText;
            C7309g gVar = new C7309g(editText);
            this.f16181b = gVar;
            editText.addTextChangedListener(gVar);
            if (C7298b.f16183b == null) {
                synchronized (C7298b.f16182a) {
                    if (C7298b.f16183b == null) {
                        C7298b.f16183b = new C7298b();
                    }
                }
            }
            editText.setEditableFactory(C7298b.f16183b);
        }
    }

    /* renamed from: m1.a$b */
    public static class C7297b {
    }

    public C7295a(EditText editText) {
        if (editText != null) {
            this.f16179a = new C7296a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
