package designpatterns.singletonpattern;

public class LoginPage {

    //every thread will get proper copy of loginPage
    private volatile static LoginPage loginPage;

    private LoginPage() {
    }

    public static LoginPage getInstance() {
        if(loginPage==null) {
           synchronized (LoginPage.class) {
               if(loginPage==null) {
                   loginPage=new LoginPage();
               }
           }
        }
        return loginPage;
    }
}
