public enum AnimClass {
    DOG("пес"), CAT("кіт"), FROG("жаба");
    String translate;
    AnimClass(String translate){
        this.translate = translate;
    }

    public String getTranslate(){
        return translate;
    }
}
