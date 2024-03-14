package P1700.P1620.Q1603;

/**
 * LeetCodePractice
 * 设计停车系统
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 * @author PlutoCtx ctx195467@163.com
 * @version 2024/3/14 19:09
 * @since JDK17
 */

class ParkingSystem {
    public int big;
    public int medium;
    public int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1) {
            if(this.big >= 1) {
                this.big --;
                return true;
            } else {
                return false;
            }
        } else if(carType == 2) {
            if(this.medium >= 1) {
                medium --;
                return true;
            } else {
                return false;
            }
        } else if(carType == 3) {
            if(this.small >= 1) {
                small --;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}

