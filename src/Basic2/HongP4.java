package Basic2;

public class HongP4 {
    public static void main(String[] args) {
        Lock myP = new Lock("12345");
        myP.setPassword("@12234");
        System.out.println(myP.getPassword());
    }
}

class Lock{
    private String password;

    public Lock(String password) {
        this.password = password;
    }

    public String getPassword() {
        return String.format("잠금 {%s}", password);
    }
    public void setPassword(String password) {
        this.password = password;
    }
}