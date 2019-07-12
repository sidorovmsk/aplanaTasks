package Homeworkcollections;

import java.util.Objects;

public class Myclass implements Comparable<Myclass> {
    String word;
    int count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Myclass myclass = (Myclass) o;
        return word.equals(myclass.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, count);
    }

    @Override
    public String toString() {
        return ("{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}');
    }

    Myclass(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public int compareTo(Myclass o) {
        return word.compareTo(o.getWord());
    }

    private String getWord() {
        return word;
    }
}
