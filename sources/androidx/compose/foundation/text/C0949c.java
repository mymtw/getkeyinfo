package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p015ui.input.key.C1611a;
import androidx.compose.p015ui.input.key.C1612b;
import androidx.compose.p015ui.input.key.C1613c;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.text.c */
public final class C0949c implements C0948b {

    /* renamed from: a */
    public final /* synthetic */ C19857l<C1612b, Boolean> f1974a;

    public C0949c(C19857l<? super C1612b, Boolean> lVar) {
        this.f1974a = lVar;
    }

    /* renamed from: a */
    public final KeyCommand mo4495a(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "event");
        if (this.f1974a.invoke(new C1612b(keyEvent)).booleanValue() && keyEvent.isShiftPressed()) {
            long a = C1613c.m3423a(keyEvent);
            int i = C0955i.f2012w;
            if (C1611a.m3422a(a, C0955i.f1995f)) {
                return KeyCommand.REDO;
            }
            return null;
        } else if (this.f1974a.invoke(new C1612b(keyEvent)).booleanValue()) {
            long a2 = C1613c.m3423a(keyEvent);
            int i2 = C0955i.f2012w;
            if (C1611a.m3422a(a2, C0955i.f1991b) ? true : C1611a.m3422a(a2, C0955i.f2005p)) {
                return KeyCommand.COPY;
            }
            if (C1611a.m3422a(a2, C0955i.f1993d)) {
                return KeyCommand.PASTE;
            }
            if (C1611a.m3422a(a2, C0955i.f1994e)) {
                return KeyCommand.CUT;
            }
            if (C1611a.m3422a(a2, C0955i.f1990a)) {
                return KeyCommand.SELECT_ALL;
            }
            if (C1611a.m3422a(a2, C0955i.f1995f)) {
                return KeyCommand.UNDO;
            }
            return null;
        } else if (keyEvent.isCtrlPressed()) {
            return null;
        } else {
            if (keyEvent.isShiftPressed()) {
                long a3 = C1613c.m3423a(keyEvent);
                int i3 = C0955i.f2012w;
                if (C1611a.m3422a(a3, C0955i.f1997h)) {
                    return KeyCommand.SELECT_LEFT_CHAR;
                }
                if (C1611a.m3422a(a3, C0955i.f1998i)) {
                    return KeyCommand.SELECT_RIGHT_CHAR;
                }
                if (C1611a.m3422a(a3, C0955i.f1999j)) {
                    return KeyCommand.SELECT_UP;
                }
                if (C1611a.m3422a(a3, C0955i.f2000k)) {
                    return KeyCommand.SELECT_DOWN;
                }
                if (C1611a.m3422a(a3, C0955i.f2001l)) {
                    return KeyCommand.SELECT_PAGE_UP;
                }
                if (C1611a.m3422a(a3, C0955i.f2002m)) {
                    return KeyCommand.SELECT_PAGE_DOWN;
                }
                if (C1611a.m3422a(a3, C0955i.f2003n)) {
                    return KeyCommand.SELECT_LINE_START;
                }
                if (C1611a.m3422a(a3, C0955i.f2004o)) {
                    return KeyCommand.SELECT_LINE_END;
                }
                if (C1611a.m3422a(a3, C0955i.f2005p)) {
                    return KeyCommand.PASTE;
                }
                return null;
            }
            long a4 = C1613c.m3423a(keyEvent);
            int i4 = C0955i.f2012w;
            if (C1611a.m3422a(a4, C0955i.f1997h)) {
                return KeyCommand.LEFT_CHAR;
            }
            if (C1611a.m3422a(a4, C0955i.f1998i)) {
                return KeyCommand.RIGHT_CHAR;
            }
            if (C1611a.m3422a(a4, C0955i.f1999j)) {
                return KeyCommand.UP;
            }
            if (C1611a.m3422a(a4, C0955i.f2000k)) {
                return KeyCommand.DOWN;
            }
            if (C1611a.m3422a(a4, C0955i.f2001l)) {
                return KeyCommand.PAGE_UP;
            }
            if (C1611a.m3422a(a4, C0955i.f2002m)) {
                return KeyCommand.PAGE_DOWN;
            }
            if (C1611a.m3422a(a4, C0955i.f2003n)) {
                return KeyCommand.LINE_START;
            }
            if (C1611a.m3422a(a4, C0955i.f2004o)) {
                return KeyCommand.LINE_END;
            }
            if (C1611a.m3422a(a4, C0955i.f2006q)) {
                return KeyCommand.NEW_LINE;
            }
            if (C1611a.m3422a(a4, C0955i.f2007r)) {
                return KeyCommand.DELETE_PREV_CHAR;
            }
            if (C1611a.m3422a(a4, C0955i.f2008s)) {
                return KeyCommand.DELETE_NEXT_CHAR;
            }
            if (C1611a.m3422a(a4, C0955i.f2009t)) {
                return KeyCommand.PASTE;
            }
            if (C1611a.m3422a(a4, C0955i.f2010u)) {
                return KeyCommand.CUT;
            }
            if (C1611a.m3422a(a4, C0955i.f2011v)) {
                return KeyCommand.TAB;
            }
            return null;
        }
    }
}
