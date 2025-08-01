package oopInheritance.sec07;

public class PartTime extends Worker {

    private int hours;
    private int unitPrice;

    // 파트타임 직원 한명의 정보을 저장가능 해야함
    public PartTime(String name, String joominNo, int hours, int unitPrice) {
        super(joominNo,name);
        this.hours = hours;
        this.unitPrice = unitPrice;
    }

    public int calculatePay() {
        return hours * unitPrice;
    }

    @Override
    public String toString() {
        return "시급: " + unitPrice + "원" + "\n근무시간: " + hours + "시간" + "\n총 지불액: " + calculatePay()
            +"\n"+ super.toString();
    }

}
