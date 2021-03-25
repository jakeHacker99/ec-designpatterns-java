package designpatterniterator;

import designpatterniterator.inter.Container;
import designpatterniterator.inter.Iterator;

public class NameRepository implements Container {
    public String names[]={"    Fredrik", "Joakim","Namir","Demir", "Daniel", "Jake", "Yazan", "Caroline","Eyoul","\n", "Agnes", "Christian", "Brindah", "Kristoffer", "Gabirella", "Ermiase", "Tim", "Sejla"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
       int index;


        @Override
        public boolean hasNext() {
            if(index<names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
