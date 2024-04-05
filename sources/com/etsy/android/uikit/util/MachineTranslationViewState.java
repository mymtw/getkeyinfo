package com.etsy.android.uikit.util;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MachineTranslationViewState implements Serializable {
    public static final int $stable = 8;
    private boolean shouldShowTranslation;
    private State state;

    public enum State {
        UNTRANSLATED,
        TRANSLATING,
        TRANSLATED,
        ERROR
    }

    public MachineTranslationViewState() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public MachineTranslationViewState(String str) {
        this.state = State.UNTRANSLATED;
        if (str != null) {
            setTranslated();
        } else {
            setUntranslated();
        }
    }

    public final MachineTranslationViewState copy(String str) {
        MachineTranslationViewState machineTranslationViewState = new MachineTranslationViewState(str);
        machineTranslationViewState.shouldShowTranslation = this.shouldShowTranslation;
        machineTranslationViewState.state = this.state;
        return machineTranslationViewState;
    }

    public final boolean getShouldShowTranslation() {
        return this.shouldShowTranslation;
    }

    public final boolean isTranslated() {
        return this.state == State.TRANSLATED;
    }

    public final boolean isTranslating() {
        return this.state == State.TRANSLATING;
    }

    public final boolean isTranslationFailed() {
        return this.state == State.ERROR;
    }

    public final boolean isUntranslated() {
        return this.state == State.UNTRANSLATED;
    }

    public final void setShouldShowTranslation(boolean z) {
        this.shouldShowTranslation = z;
    }

    public final void setTranslated() {
        this.state = State.TRANSLATED;
        this.shouldShowTranslation = true;
    }

    public final void setTranslating() {
        this.state = State.TRANSLATING;
    }

    public final void setTranslationFailed() {
        this.state = State.ERROR;
    }

    public final void setUntranslated() {
        this.state = State.UNTRANSLATED;
    }

    public final void toggleShouldShowTranslation() {
        this.shouldShowTranslation = !this.shouldShowTranslation;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MachineTranslationViewState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
