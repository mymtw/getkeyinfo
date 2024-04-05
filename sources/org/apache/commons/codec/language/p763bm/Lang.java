package org.apache.commons.codec.language.p763bm;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.codec.language.p763bm.Languages;

/* renamed from: org.apache.commons.codec.language.bm.Lang */
public class Lang {
    private static final String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/lang.txt";
    private static final Map<NameType, Lang> Langs = new EnumMap(NameType.class);
    private final Languages languages;
    private final List<LangRule> rules;

    /* renamed from: org.apache.commons.codec.language.bm.Lang$LangRule */
    public static final class LangRule {
        /* access modifiers changed from: private */
        public final boolean acceptOnMatch;
        /* access modifiers changed from: private */
        public final Set<String> languages;
        private final Pattern pattern;

        public boolean matches(String str) {
            return this.pattern.matcher(str).find();
        }

        private LangRule(Pattern pattern2, Set<String> set, boolean z) {
            this.pattern = pattern2;
            this.languages = set;
            this.acceptOnMatch = z;
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            Langs.put(nameType, loadFromResource(LANGUAGE_RULES_RN, Languages.getInstance(nameType)));
        }
    }

    private Lang(List<LangRule> list, Languages languages2) {
        this.rules = Collections.unmodifiableList(list);
        this.languages = languages2;
    }

    public static Lang instance(NameType nameType) {
        return Langs.get(nameType);
    }

    public static Lang loadFromResource(String str, Languages languages2) {
        ArrayList arrayList = new ArrayList();
        InputStream resourceAsStream = Lang.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream != null) {
            Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
            while (true) {
                boolean z = false;
                while (true) {
                    if (!scanner.hasNextLine()) {
                        return new Lang(arrayList, languages2);
                    }
                    String nextLine = scanner.nextLine();
                    if (z) {
                        if (nextLine.endsWith(ResourceConstants.EXT_CMT_END)) {
                        }
                    } else if (nextLine.startsWith(ResourceConstants.EXT_CMT_START)) {
                        z = true;
                    } else {
                        int indexOf = nextLine.indexOf(ResourceConstants.CMT);
                        String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                        if (trim.length() != 0) {
                            String[] split = trim.split("\\s+");
                            if (split.length != 3) {
                                System.err.println("Warning: malformed line '" + nextLine + "'");
                            } else {
                                arrayList.add(new LangRule(Pattern.compile(split[0]), new HashSet(Arrays.asList(split[1].split("\\+"))), split[2].equals("true")));
                            }
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
        }
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet guessLanguages = guessLanguages(str);
        return guessLanguages.isSingleton() ? guessLanguages.getAny() : Languages.ANY;
    }

    public Languages.LanguageSet guessLanguages(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.languages.getLanguages());
        for (LangRule next : this.rules) {
            if (next.matches(lowerCase)) {
                if (next.acceptOnMatch) {
                    hashSet.retainAll(next.languages);
                } else {
                    hashSet.removeAll(next.languages);
                }
            }
        }
        Languages.LanguageSet from = Languages.LanguageSet.from(hashSet);
        return from.equals(Languages.NO_LANGUAGES) ? Languages.ANY_LANGUAGE : from;
    }
}
