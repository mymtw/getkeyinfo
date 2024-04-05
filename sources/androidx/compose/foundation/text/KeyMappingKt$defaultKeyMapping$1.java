package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p015ui.input.key.C1612b;
import androidx.compose.p015ui.input.key.C1613c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.PropertyReference1Impl;

public /* synthetic */ class KeyMappingKt$defaultKeyMapping$1 extends PropertyReference1Impl {
    public static final KeyMappingKt$defaultKeyMapping$1 INSTANCE = new KeyMappingKt$defaultKeyMapping$1();

    public KeyMappingKt$defaultKeyMapping$1() {
        super(C1613c.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
    }

    public Object get(Object obj) {
        KeyEvent keyEvent = ((C1612b) obj).f3587a;
        C19383o.m32797g(keyEvent, "$this$isCtrlPressed");
        return Boolean.valueOf(keyEvent.isCtrlPressed());
    }
}
