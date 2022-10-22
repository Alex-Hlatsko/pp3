class Book{
    String title;
    String author;
    Boolean is_started;
    int max_page;
    int page = 1;
    public void nextPage(){
        if (page <= max_page){
            System.out.println("Page " + page++);
        } else {
            System.out.println("It's the last page");
        }
    }
    public void prevPage(){
        if (page == 1){
            System.out.println("It's the first page");
        } else {
            page -=1;
            System.out.println("Page " + page);
        }
    }
}