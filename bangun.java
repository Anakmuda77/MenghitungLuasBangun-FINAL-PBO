abstract class bangun{
    public double luas(int x,int y){
        return 0;
    }

    public double keliling(int x,int y){
        return 0;
    }
}

class persegi extends bangun {
    public double luas(int x){
        return x*x;
    }

    public double keliling(int x){
        return x*4;
    }

}


class persegi_panjang extends bangun {
    public double luas(int x,int y){
        return x*y;
    }

    public double keliling(int x,int y){
        return 2*(x+y);
    }

}


class segitiga extends bangun {
    public double luas(int x, int y) {
        return  0.5 * (x * y);
    }

    public double keliling(int x, int y, int z) {
        return x + y + z;
    }
}

    class lingkaran extends bangun {
        final double phi = 3.14;
        public double luas(int x){
            return phi*x*x;
        }

        public double keliling(int x){
            return 2*phi*x;
        }

}
