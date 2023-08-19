package all.structure.SimpleHashMap;

import java.util.HashMap;
import java.util.Objects;

public class SimpleHashMap {
    private class Key {
        private final String login;
        private final String password;

        public Key(String login, String password) {
            this.login = login;
            this.password = password;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(login, key.login) && Objects.equals(password, key.password);
        }

        @Override
        public int hashCode() {
            return Objects.hash(login, password);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
    //HashMap<Integer, String> hashMap = new HashMap<>(4, 0.75f);
    HashMap<Key, String> hashMap = new HashMap<>(4, 0.75f);

    private void addInHashMap(Key key, String value) {
        hashMap.put(key, value);
    }


    private Key key1 = new Key("ajn" , "123");
    private Key key2 = new Key("awn" , "132");
    private Key key3 = new Key("pois" , "3");

    private Key key4 = new Key("pois" , "3");


    private void hashMapCreate(){
        addInHashMap(key1, "key1");
        addInHashMap(key2, "key2");
        addInHashMap(key3, "key3");
    }
    public void start(){
        hashMapCreate();
        System.out.println(hashMap.containsKey(key1));
        System.out.println(hashMap.containsValue("key2"));
        System.out.println(hashMap.get(key4));
    }
}
