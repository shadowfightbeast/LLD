public class Main {
    public interface CacheStore {
        public void AddKey(String key, String value);

        public void RemoveKey(String key);

        public void EvictKey();
    };

    public class CacheService implements CacheStore {
        @Override
        public void AddKey(String key, String value) {

        }

        @Override
        public void RemoveKey(String key) {
            throw new UnsupportedOperationException("Unimplemented method 'RemoveKey'");
        }

        @Override
        public void EvictKey() {
            throw new UnsupportedOperationException("Unimplemented method 'EvictKey'");
        }

    };

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
