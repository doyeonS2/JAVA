package 정적멤버와메소드;
public class Bank {
    private static int count = 0; // 클래스 필드
    private int account; // 계좌
    private String bank;

    Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌를" + Util.getCurrentDate("yyyy/MM/dd") + "개설합니다.");
        System.out.println("잔액은 " + account + " 입니다.");
    }

    public static int getCount() {
        return count;
    }

    public void setDeposit(int dep) {
        this.account += dep;
        System.out.println(dep + "을 예금했습니다.");
    }

    public void setWithdraw(int with) {
        if (with > account) {
            System.out.println(bank + "의 잔액이 부족합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println(bank + "의 현재 잔액은 " + account + " 입니다.");
    }
}
