package ua.ithillel.lectures.lecture12.chain;

public interface Chain {

    void setNextChain(Chain chain);

    void give(Currency currency);
}
