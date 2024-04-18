import java.util.concurrent.Semaphore;

public class ParkingLot {
    // Tạo một Semaphore với 5 giấy phép, tương ứng với 5 chỗ đậu xe
    private final Semaphore parkingSlots = new Semaphore(5);


    public void parkCar(int carId) {
        try {
            System.out.println("Car #" + carId + " is trying to enter the parking lot.");
            // Yêu cầu một giấy phép từ Semaphore
            // Nếu không có giấy phép sẵn  thread này sẽ chờ đợi
            parkingSlots.acquire();
            System.out.println("Car #" + carId + " has parked.");
            // Giả sử xe đậu trong một khoảng thời gian ngẫu nhiên
            Thread.sleep((long) (Math.random() * 5000));
            System.out.println("Car #" + carId + " is leaving the parking lot.");
            // Giải phóng một giấy phép, mở chỗ cho xe khác
            parkingSlots.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset the interrupt status
            System.out.println("Car #" + carId + " was interrupted.");
        }
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        // Tạo và khởi động 10 threads, tượng trưng cho 10 chiếc xe muốn đậu
        for (int i = 1; i <= 10; i++) {
            final int carId = i;
            new Thread(() -> parkingLot.parkCar(carId)).start();
        }
    }
}
