package com.google.common.base;

import com.google.common.base.C15775a;
import java.io.Serializable;
import org.apache.commons.cli.HelpFormatter;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p001a0.C0005b;

public enum CaseFormat {
    LOWER_HYPHEN(new C15775a.C15778c('-'), HelpFormatter.DEFAULT_OPT_PREFIX) {
        public String convert(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_UNDERSCORE ? str.replace('-', '_') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? C0005b.m58r0(str.replace('-', '_')) : CaseFormat.super.convert(caseFormat, str);
        }

        public String normalizeWord(String str) {
            return C0005b.m56q0(str);
        }
    },
    LOWER_UNDERSCORE(new C15775a.C15778c('_'), "_") {
        public String convert(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_HYPHEN ? str.replace('_', '-') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? C0005b.m58r0(str) : CaseFormat.super.convert(caseFormat, str);
        }

        public String normalizeWord(String str) {
            return C0005b.m56q0(str);
        }
    },
    LOWER_CAMEL(new C15775a.C15777b(), "") {
        public String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_CAMEL(new C15775a.C15777b(), "") {
        public String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_UNDERSCORE(new C15775a.C15778c('_'), "_") {
        public String convert(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_HYPHEN ? C0005b.m56q0(str.replace('_', '-')) : caseFormat == CaseFormat.LOWER_UNDERSCORE ? C0005b.m56q0(str) : CaseFormat.super.convert(caseFormat, str);
        }

        public String normalizeWord(String str) {
            return C0005b.m58r0(str);
        }
    };
    
    private final C15775a wordBoundary;
    private final String wordSeparator;

    public static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        public StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            caseFormat.getClass();
            this.sourceFormat = caseFormat;
            caseFormat2.getClass();
            this.targetFormat = caseFormat2;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) obj;
            return this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat);
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            return this.sourceFormat + ".converterTo(" + this.targetFormat + ")";
        }

        public String doBackward(String str) {
            return this.targetFormat.mo55661to(this.sourceFormat, str);
        }

        public String doForward(String str) {
            return this.sourceFormat.mo55661to(this.targetFormat, str);
        }
    }

    /* access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            z = true;
        }
        if (z) {
            charAt = (char) (charAt ^ ' ');
        }
        sb.append(charAt);
        sb.append(C0005b.m56q0(str.substring(1)));
        return sb.toString();
    }

    private String normalizeFirstWord(String str) {
        return this == LOWER_CAMEL ? C0005b.m56q0(str) : normalizeWord(str);
    }

    public String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.mo55774b(i2 + 1, str);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder((this.wordSeparator.length() * 4) + str.length());
                sb.append(caseFormat.normalizeFirstWord(str.substring(i, i2)));
            } else {
                sb.append(caseFormat.normalizeWord(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        sb.append(caseFormat.normalizeWord(str.substring(i)));
        return sb.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    public abstract String normalizeWord(String str);

    /* renamed from: to */
    public final String mo55661to(CaseFormat caseFormat, String str) {
        caseFormat.getClass();
        str.getClass();
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    private CaseFormat(C15775a aVar, String str) {
        this.wordBoundary = aVar;
        this.wordSeparator = str;
    }
}
