package all.structure.SimpleTreeMap;


import java.util.TreeMap;

public class SimpleTreeMap {
    TreeMap<Key, String> treeMap = new TreeMap<>();

    private class Key implements Comparable<Key> {
        private final String login;
        private final String password;

        public Key(String login, String password) {
            this.login = login;
            this.password = password;
        }


        @Override
        public String toString() {
            return "Key{" +
                    "login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Key o) {
            int compareLogin = login.compareTo(o.login);
            if (compareLogin == 0) {
                return password.compareTo(o.password);
            } else {
                return compareLogin;
            }
        }
    }

    private void addInTreeMap(Key key, String value) {
        treeMap.put(key, value);
    }


    private Key key1 = new Key("a" , "123");
    private Key key2 = new Key("a" , "132");
    private Key key3 = new Key("b" , "3");

    private Key key4 = new Key("b" , "3");


    private void treeMapCreate(){
        addInTreeMap(key1, "key1");
        addInTreeMap(key2, "key2");
        addInTreeMap(key3, "key3");
    }
    public void start(){
        treeMapCreate();
        System.out.println(treeMap.containsKey(key1));
        System.out.println(treeMap.containsValue("key2"));
        System.out.println(treeMap.get(key4));
        System.out.println(treeMap.toString());
    }
}
