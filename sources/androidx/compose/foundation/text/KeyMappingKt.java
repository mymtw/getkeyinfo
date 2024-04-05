package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p015ui.input.key.C1611a;
import androidx.compose.p015ui.input.key.C1613c;
import kotlin.jvm.internal.C19383o;

public final class KeyMappingKt {

    /* renamed from: a */
    public static final C0912a f1921a;

    /* renamed from: androidx.compose.foundation.text.KeyMappingKt$a */
    public static final class C0912a implements C0948b {

        /* renamed from: a */
        public final /* synthetic */ C0948b f1922a;

        public C0912a(C0949c cVar) {
            this.f1922a = cVar;
        }

        /* renamed from: a */
        public final KeyCommand mo4495a(KeyEvent keyEvent) {
            C19383o.m32797g(keyEvent, "event");
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long a = C1613c.m3423a(keyEvent);
                int i = C0955i.f2012w;
                if (C1611a.m3422a(a, C0955i.f1997h)) {
                    keyCommand = KeyCommand.SELECT_LEFT_WORD;
                } else if (C1611a.m3422a(a, C0955i.f1998i)) {
                    keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                } else if (C1611a.m3422a(a, C0955i.f1999j)) {
                    keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (C1611a.m3422a(a, C0955i.f2000k)) {
                    keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long a2 = C1613c.m3423a(keyEvent);
                int i2 = C0955i.f2012w;
                if (C1611a.m3422a(a2, C0955i.f1997h)) {
                    keyCommand = KeyCommand.LEFT_WORD;
                } else if (C1611a.m3422a(a2, C0955i.f1998i)) {
                    keyCommand = KeyCommand.RIGHT_WORD;
                } else if (C1611a.m3422a(a2, C0955i.f1999j)) {
                    keyCommand = KeyCommand.PREV_PARAGRAPH;
                } else if (C1611a.m3422a(a2, C0955i.f2000k)) {
                    keyCommand = KeyCommand.NEXT_PARAGRAPH;
                } else if (C1611a.m3422a(a2, C0955i.f1992c)) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (C1611a.m3422a(a2, C0955i.f2008s)) {
                    keyCommand = KeyCommand.DELETE_NEXT_WORD;
                } else if (C1611a.m3422a(a2, C0955i.f2007r)) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else if (C1611a.m3422a(a2, C0955i.f1996g)) {
                    keyCommand = KeyCommand.DESELECT;
                }
            } else if (keyEvent.isShiftPressed()) {
                long a3 = C1613c.m3423a(keyEvent);
                int i3 = C0955i.f2012w;
                if (C1611a.m3422a(a3, C0955i.f2003n)) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (C1611a.m3422a(a3, C0955i.f2004o)) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            }
            return keyCommand == null ? this.f1922a.mo4495a(keyEvent) : keyCommand;
        }
    }

    static {
        KeyMappingKt$defaultKeyMapping$1 keyMappingKt$defaultKeyMapping$1 = KeyMappingKt$defaultKeyMapping$1.INSTANCE;
        C19383o.m32797g(keyMappingKt$defaultKeyMapping$1, "shortcutModifier");
        f1921a = new C0912a(new C0949c(keyMappingKt$defaultKeyMapping$1));
    }
}
