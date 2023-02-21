package chap_09.coffee;

import chap_09.user.User;

//User 클래스를 상속하는 타입만 받겠다
public class CoffeeByUser <T extends User>{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
