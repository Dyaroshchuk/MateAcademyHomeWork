package home.work10.hashCodeAndEquals;

public class EqualsAndHashCode {
    private final double re;
    private final double im;

    public EqualsAndHashCode(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = result * prime + (int) (Double.doubleToLongBits(re)
                - (Double.doubleToLongBits(re) >>> 32));
        result = result * prime + (int) (Double.doubleToLongBits(im)
                - (Double.doubleToLongBits(im) >>> 32));

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
        EqualsAndHashCode compare = (EqualsAndHashCode) obj;
        if (compare.im == this.im && compare.re == this.re) {
            return true;
        } else {
            return false;
        }
    }
}
