public class Friends {
    private String beautiful;
    private String handsome;
    private String funny;
    private String confused;
    
    
    void setBeautiful(String beautiful){
    this.beautiful=beautiful;
    }
    
    String getBeautiful() {
    return this.beautiful;
    }
    
    void setHandsome(String handsome) {
    this.handsome=handsome;
    }
    
    String getHandsome() {
    return this.handsome;
    }
    
    void setFunny(String funny) {
    this.funny=funny;
    }
    
    String getFunny() {
    return this.funny;
    }
    
    void setConfused(String confused) {
    this.confused=confused;
    }
    
    String getConfused() {
    return this.confused;
    }
}

public class Series {

    public static void main(String[] args) {
        Friends friends= new Friends();
        
        friends.setBeautiful("Rachel");
        friends.setHandsome("Joey");
        friends.setFunny("Chandler");
        friends.setConfused("Phebe");
        
        System.out.println("most beautiful" +friends.getBeautiful());
        System.out.println("most handsome" +friends.getHandsome());
        System.out.println("funniest" +friends.getFunny());
        System.out.println("most confused" +friends.getConfused());
        
    }
}
