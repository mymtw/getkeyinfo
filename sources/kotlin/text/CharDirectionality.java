package kotlin.text;

import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;

public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    public static final C19442a Companion = null;
    /* access modifiers changed from: private */
    public static final C19285c<Map<Integer, CharDirectionality>> directionalityMap$delegate = null;
    private final int value;

    /* renamed from: kotlin.text.CharDirectionality$a */
    public static final class C19442a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C19442a();
        directionalityMap$delegate = C19350d.m32677b(CharDirectionality$Companion$directionalityMap$2.INSTANCE);
    }

    private CharDirectionality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
