package school.lemon.changerequest.java.io.hw1;

/**
 * Created by Diana on 22.01.2017.
 */
public class App {


        public static void main(String[] args) {
            IFileManagerImpl manager = new IFileManagerImpl("test");
            System.out.println(manager.ls());
            System.out.println();
            System.out.println(manager.ls(Order.BY_LAST_UPDATE_DESCENDING));
            System.out.println();
            System.out.println(manager.ls(Order.BY_LEXICOGRAPHICAL_DESCENDING, false));
        }

    }

