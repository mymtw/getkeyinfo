package p032c1;

/* renamed from: c1.c */
public final class C4356c {

    /* renamed from: a */
    public static final C4360d f9593a = new C4360d((C4357a) null, false);

    /* renamed from: b */
    public static final C4360d f9594b = new C4360d((C4357a) null, true);

    /* renamed from: c */
    public static final C4360d f9595c;

    /* renamed from: d */
    public static final C4360d f9596d;

    /* renamed from: c1.c$a */
    public static class C4357a implements C4358b {

        /* renamed from: a */
        public static final C4357a f9597a = new C4357a();

        /* renamed from: a */
        public final int mo14299a(int i, CharSequence charSequence) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                C4360d dVar = C4356c.f9593a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                    }
                    i3 = 0;
                }
                i3 = 1;
            }
            return i3;
        }
    }

    /* renamed from: c1.c$b */
    public interface C4358b {
        /* renamed from: a */
        int mo14299a(int i, CharSequence charSequence);
    }

    /* renamed from: c1.c$c */
    public static abstract class C4359c implements C4355b {

        /* renamed from: a */
        public final C4358b f9598a;

        public C4359c(C4357a aVar) {
            this.f9598a = aVar;
        }

        /* renamed from: a */
        public abstract boolean mo14300a();

        /* renamed from: b */
        public final boolean mo14301b(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            C4358b bVar = this.f9598a;
            if (bVar == null) {
                return mo14300a();
            }
            int a = bVar.mo14299a(i, charSequence);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo14300a();
            }
            return false;
        }
    }

    /* renamed from: c1.c$d */
    public static class C4360d extends C4359c {

        /* renamed from: b */
        public final boolean f9599b;

        public C4360d(C4357a aVar, boolean z) {
            super(aVar);
            this.f9599b = z;
        }

        /* renamed from: a */
        public final boolean mo14300a() {
            return this.f9599b;
        }
    }

    static {
        C4357a aVar = C4357a.f9597a;
        f9595c = new C4360d(aVar, false);
        f9596d = new C4360d(aVar, true);
    }
}
