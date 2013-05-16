package rita.support;

public interface Constants extends EnglishConstants
{
  // ====== RiText ============= 

  int LEFT = 37, UP = 38, RIGHT = 39, DOWN = 40,  CENTER = 3;

  // ==== RiTaEvent ============ 
  
  // TODO: more granular??: MOVE_TO_STARTED, MOVE_TO_COMPLETE, TIMER_START, TIMER_COMPLETE, TIMER_TICK

  int UNKNOWN = -1;
  int MOVE_TO = 1;
  int COLOR_TO = 2;
  int FADE_IN = 3;
  int FADE_OUT = 4;
  int TEXT_TO = 5; 
  int TIMER = 6;
  int SCALE_TO = 7;
  int ROTATE_TO = 8;
  int TEXT_ENTERED = 9;
  int LERP = 10;
  
  
  // ==== Features ============ 
  
  String SLASH = "/";
  String WORD_BOUNDARY = " ";
  String PHONEME_BOUNDARY = "-";
  String SYLLABLE_BOUNDARY = SLASH;  
  String SENTENCE_BOUNDARY = "|";
  String SYLLABLES = "syllables";
  String PHONEMES = "phonemes";
  String STRESSES = "stresses";
  String POSLIST = "poslist";
  String MUTABLE = "mutable";
  String TOKENS = "tokens";
  String TEXT = "text";
  String POS = "pos";
  String ID = "id";

  // ==== Tokenizer  ============= 
  
  int REGEX_TOKENIZER = 2;
  int FREE_TTS_TOKENIZER = 3;
  int PENN_WORD_TOKENIZER = 4;
  
  // ==== Conjugator  ============ 

  /** Specifies person as one of (first, second or third) */
  int FIRST_PERSON = 1;
  
  /** Specifies person as one of (first, second or third) */
  int SECOND_PERSON = 2;
  
  /** Specifies person as one of (first, second or third) */
  int THIRD_PERSON = 3;
  
  /** Specifies tense as one of (past, present or future) */
  int PAST_TENSE = 4;
  
  /** Specifies tense as one of (past, present or future) */
  int PRESENT_TENSE = 5;
  
  /** Specifies tense as one of (past, present or future) */
  int FUTURE_TENSE = 6;
  
  /** Specifies agreement as one of (singular or plural)  */
  int SINGULAR = 7;  
  
  /** Specifies agreement as one of (singular or plural)  */
  int PLURAL = 8;
  
  /**
   * Typically the declarative sentence, but in the current conjugator implementation,
   * used as the default form to the exclusion of the others.
   */
  int NORMAL=10;

  /** The INFINITIVE, e.g. <i>to eat an apple</i> */
  int INFINITIVE=11;

  /** Gerund form of the VP, e.g. <i>eating an apple</i> */
  int GERUND=12;

  /** The form, e.g. <I>eat an apple!</I> */
  int IMPERATIVE=13;

  /** Bare infinitive VP, e.g. <i>eat an apple</i>. */
  int BARE_INFINITIVE=14;

  /** Subjunctive form, e.g. <i>if I were a rich man</i>. */
  int SUBJUNCTIVE=15;
  
  // ======== STEMMING CONSTANTS ===================
  
  /**  Type constant for Pling stemmer     */
  int PLING_STEMMER = 1;
  
  /**  Type constant for Porter stemmer    */
  int PORTER_STEMMER = 2;
  
  /** Type constant for Lancaster stemmer  */
  int LANCASTER_STEMMER = 3;
  
 // ======== ANIMATION CONSTANTS ===================
  
  /** Specifies 'linear' as the motion type for moveXX() methods (default) */
  int LINEAR = 0;
  
  /** Specifies 'ease-in' as the motion type for moveXX() methods (quadratic)*/ 
  int EASE_IN = 1;
  
  /** Specifies 'ease-out' as the motion type for moveXX() methods (quadratic) */
  int EASE_OUT = 2;
  
  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (quadratic) */
  int EASE_IN_OUT = 3;
  
  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (cubic) */
  int EASE_IN_OUT_CUBIC = 4;
  
  /** Specifies 'ease-in' as the motion type for moveXX() methods (cubic) */
  int EASE_IN_CUBIC = 5;
  
  /** Specifies 'ease-out' as the motion type for moveXX() methods (cubic) */
  int EASE_OUT_CUBIC = 6;
  
  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (quartic) */
  int EASE_IN_OUT_QUARTIC = 7;
  
  /** Specifies 'ease-in' as the motion type for moveXX() methods (quartic) */
  int EASE_IN_QUARTIC = 8;
  
  /** Specifies 'ease-out' as the motion type for moveXX() methods (quartic) */
  int EASE_OUT_QUARTIC = 9; 
  
  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (circular) */
  int EASE_IN_OUT_SINE = 10;

  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (circular) */
  int EASE_IN_SINE = 11;

  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (circular) */
  int EASE_OUT_SINE = 12;
  
  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (circular) */
  int EASE_IN_OUT_EXPO = 13;

  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (circular) */
  int EASE_IN_EXPO = 14;

  /** Specifies 'ease-in/out' as the motion type for moveXX() methods (circular) */
  int EASE_OUT_EXPO = 15;
    
  // ==== RiTa ================  
  
  String DEFAULT_CALLBACK = "onRiTaEvent";
  String ALL_QUOTES = "\"“”’‘`'"; // 7 ?
  String PUNCT_CHARS = ALL_QUOTES+"~\",;:!?)([].#\"\\!@$%&}<>|+=-_\\/*{^"; // add quotes?
  String ALL_PUNCT =  "[\\p{Punct}"+ALL_QUOTES+"]+";
  String PUNCT_PATT = "^(?:[\\p{Punct}"+ALL_QUOTES+"]*)((?:.)|(?:[\\w ].*?[\\w ]))(?:[\\p{Punct}"+ALL_QUOTES+"]*)$";
  String DATA_DELIM = "\\|", DEFAULT_LEXICON = "rita_dict.json";
  String CMUDICT_LTS_TXT = "cmudict04_lts.txt";
  String DEFAULT_USER_ADDENDA_FILE = "rita_addenda.txt";
  String CMUDICT_COMMENT = "#";
  String LEXICON_DELIM = ":";
  String PHONE_DELIM = "[- ]";
  String NON_BREAKING_SPACE = "<sp/>";
  String PARAGRAPH_BREAK = "<p/>";
  String LINE_BREAK = "<br/>";
  String WS = "\\s+";
  String UTF8 = "UTF-8";
  
  char STRESSED   = '1',  UNSTRESSED = '0';
  boolean LOAD_USER_ADDENDA = false;
  int BOUNDING_BOX_ALPHA = 133, TEXT_TO_COPY = 134;

  String[] EMPTY = new String[0];
  String FS = "/", SP = " ", E = "", DQ = "\"", SQ = "'"; 
  String BN = "\n", DASH = "-", AMP = "&", EQ="=";
  String LP = "(", RP = ")", LB = "[", RB = "]", BS = "\\";
  
  String END_STRING = "</?string>";
  String END_KEY = "</?key>";
  String END_DICT = "</dict>";
  String VALUE = "Value";
  String NAME = "Name";
  String KEY = "<key>";
  String DICT = "<dict>";
  String STRING = "<string>";
  String DOMAIN = "Domain";
  
}