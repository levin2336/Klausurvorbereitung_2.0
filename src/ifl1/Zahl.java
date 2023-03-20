package ifl1;

import abiturklassen.ComparableContent;

public class Zahl implements ComparableContent<Zahl> {

    int content;


    public Zahl(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    @Override
    public boolean isGreater(Zahl pContent) {
        return this.content > pContent.getContent();
    }

    @Override
    public boolean isEqual(Zahl pContent) {
        return this.content == pContent.getContent();
    }

    @Override
    public boolean isLess(Zahl pContent) {
        return this.content < pContent.getContent();
    }
}
