package belajar.java.backend.belajar_spring_dasar;

public class Database {

    private static Database database;

    public static Database getInstance(){
        if (database == null) {

        }
        return database;
    }

    private Database(){}
}
