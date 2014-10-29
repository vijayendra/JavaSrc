class Word{
    public static final int LETTERS = 26;
    public static final int WORDS = LETTERS * LETTERS;
    private String word;

    public int hashCode(){
        return LETTERS * (word.charAt(0) - 'a') + (word.charAt(1) - 'a');
    }
    public Word(String w){
        word = w;
    }
    public String getWord(){
        return word;
    }
}

class Definition{
    private String definition;
    
    public Definition(String d){
        definition = d;
    }
    public String getDefinition(){
        return definition;
    }
}
public class WordDictionary{
    Definition[] ds = new Definition[Word.WORDS];
    
    public void insert(Word w, Definition d){
        ds[w.hashCode()] = d;
    }
    public Definition find(Word w){
        return ds[w.hashCode()];
    }
    public static void main(String[] args){
        WordDictionary wd = new WordDictionary();
        wd.insert(new Word("aa"), new Definition("aaaaaaaaaaa"));
        wd.insert(new Word("bb"), new Definition("bbbbbbbbbbb"));
        wd.insert(new Word("cc"), new Definition("ccccccccccc"));
        Definition d = wd.find(new Word("bb"));
        System.out.println(d.getDefinition());
    }
}
