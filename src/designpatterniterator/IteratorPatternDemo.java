package designpatterniterator;

import designpatterniterator.inter.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        StringBuilder sb= new StringBuilder();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            sb.append(name+"\t");

        }
        System.out.println(sb.toString());
    }
}
