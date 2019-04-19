package home.work10.сomplexNumber;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getRe() {
        return real;
    }

    public double getIm() {
        return imaginary;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = result * prime + (int) (Double.doubleToLongBits(real)
                - (Double.doubleToLongBits(real) >>> 32));
        result = result * prime + (int) (Double.doubleToLongBits(imaginary)
                - (Double.doubleToLongBits(imaginary) >>> 32));

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber compare = (ComplexNumber) obj;
        if (compare.imaginary == this.imaginary && compare.real == this.real) {
            return true;
        } else {
            return false;
        }
    }
}
