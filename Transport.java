public class Transport {
    int number;
    int oil = 100;
    int speed = 0;

    public void startDriving() {
        boolean status = true;
        System.out.println("운행을 시작합니다");
        System.out.println("현재 주유량 = " + oil);
    }

    public void stopDriving() {
        boolean status = false;
        System.out.println("운행을 종료합니다");
        System.out.println("남은 주유량 = " + oil);
    }

    public void currentSpeed() {
        System.out.println("현재속도 = " + this.speed);
    }

    public void transferSpeed(int speed) {
        System.out.println("현재속도 = " + this.speed);
        this.speed += speed;
        System.out.println("올라간 속도 = " + this.speed);
    }


    public static void main(String[] args) {
        // 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        // 버스 승객 탑승 2명
        bus.inPassenger(2);
        // 버스 주유량 - 50
        bus.setOil(-50);
        // 버스 차고지행
        bus.setCondition("차고지행");
        // 버스 주유량 + 10
        bus.setOil(10);
//        bus.inPassenger(45); 최대 승객 수 초과
        // 버스 승객 탑승 5명
        bus.inPassenger(5);
        // 버스 승객 탑승 5명
        bus.inPassenger(5);
//        bus.setOil(-55); 주유 필요
        // 택시 승객 탑승 2명 서울역 2km
        taxi.inPassenger(2, "서울역", 2);
        // 택시 주유량 - 80
        taxi.setOil(-80);
        // 택시 요금 결제
        taxi.pay();
//        taxi.inPassenger(5, "서울역", 2); 최대 승객 수 초과
        // 택시 승객 탑승 3명 구로디지털단지역 12km
        taxi.inPassenger(3, "구로디지털단지역", 12);
//        taxi.setOil(-20); 주요 필요
    }
}
