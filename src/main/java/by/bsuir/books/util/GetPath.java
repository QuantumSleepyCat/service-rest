package by.bsuir.books.util;

public class GetPath {
    public String getPath(){
        return getClass().getClassLoader().getResource("").getPath().
                split("/WEB-INF/classes/")[0];
    }
}
