package activities.activity5;

public class Activity5 {
    public static void main(String[] args){
        String title = "New Novel";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("Book Title= " + newNovel.getTitle());
    }
}
