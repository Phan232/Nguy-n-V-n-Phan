package GaiPT;

public class PTB2 extends PTB1 {
    private double c;
    
    public void updateC(double k) {
        c = k;
    }

    public void updateCAB(double c, double a, double b) {
        updateAB(a, b);
        this.c = c;
    }

    // Phương thức giải phương trình bậc 2 dạng cx^2 + ax + b = 0
    public String solve(boolean displayResult) {
        String result = "Phương trình: " + c + "x^2 " +a + "x " + b + " = 0";
        
        if (c == 0) {
            // Nếu c = 0, thì phương trình trở thành bậc 1
            result += "\nĐây là phương trình bậc 1:";
            result += "\n" + super.sole(false);  // Gọi phương thức giải PT bậc 1 từ PTB1
        } else {
            // Tính delta
            double delta = a * a - 4 * c * b;
            if (delta > 0) {
                double x1 = (-a + Math.sqrt(delta)) / (2 * c);
                double x2 = (-a - Math.sqrt(delta)) / (2 * c);
                result += "\nPhương trình có hai nghiệm phân biệt:";
                result += "\nx1 = " + x1;
                result += "\nx2 = " + x2;
            } else if (delta == 0) {
                double x = -a / (2 * c);
                result += "\nPhương trình có nghiệm kép:";
                result += "\nx = " + x;
            } else {
                result += "\nPhương trình vô nghiệm.";
            }
        }

        if (displayResult) {
            System.out.println(result);
        }
        return result;
    }
}