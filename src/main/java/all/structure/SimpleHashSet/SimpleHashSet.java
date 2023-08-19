package all.structure.SimpleHashSet;

import java.util.HashSet;

public class SimpleHashSet {
    HashSet<String> hashSetNames = new HashSet<>();
    HashSet<String> hashSetNamesForOperation = new HashSet<>();




    public void start(){
        generateHashSetNames();
        generateHashSetNamesForOperation();

        HashSet<String> hashSetNamesUnion = new HashSet<>(hashSetNames);
        HashSet<String> hashSetNamesIntersect = new HashSet<>(hashSetNames);
        HashSet<String> hashSetNamesSubtract = new HashSet<>(hashSetNames);

        System.out.println(hashSetNamesIntersect);

        hashSetNamesUnion.addAll(hashSetNamesForOperation);
        hashSetNamesIntersect.retainAll(hashSetNamesForOperation);
        hashSetNamesSubtract.removeAll(hashSetNamesForOperation);

        System.out.println(hashSetNamesUnion);
        System.out.println(hashSetNamesIntersect);
        System.out.println(hashSetNamesSubtract);
    }

    private void generateHashSetNamesForOperation() {
        hashSetNamesForOperation.add("serega");
        hashSetNamesForOperation.add("kiril");
        hashSetNamesForOperation.add("gustav");

    }

    private void generateHashSetNames() {
        hashSetNames.add("lev");
        hashSetNames.add("kiril");
        hashSetNames.add("gustav");
        hashSetNames.add("lyoha");
    }
}
