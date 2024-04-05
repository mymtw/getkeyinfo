package p764pq;

import androidx.compose.p015ui.text.input.C1993m;
import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: pq.a */
public class C20049a implements Iterable<Character>, C19875a {

    /* renamed from: b */
    public final char f44405b;

    /* renamed from: c */
    public final char f44406c;

    /* renamed from: d */
    public final int f44407d = 1;

    public C20049a(char c, char c2) {
        this.f44405b = c;
        this.f44406c = (char) C1993m.m4347H(c, c2, 1);
    }

    public final Iterator iterator() {
        return new C20050b(this.f44405b, this.f44406c, this.f44407d);
    }
}
