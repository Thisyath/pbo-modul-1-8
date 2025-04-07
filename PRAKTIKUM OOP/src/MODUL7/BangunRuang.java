package MODUL7;

abstract class BangunRuang {
    public abstract double hitungVolume();
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Tabung extends BangunRuang {
    private double radius, tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }
}

class Kerucut extends BangunRuang {
    private double radius, tinggi;

    public Kerucut(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * tinggi;
    }
}

class Limas extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Limas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * panjang * lebar * tinggi;
    }
}

class Prisma extends BangunRuang {
    private double alas, tinggiAlas, tinggiPrisma;

    public Prisma(double alas, double tinggiAlas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return (alas * tinggiAlas / 2) * tinggiPrisma;
    }
}

class Bola extends BangunRuang {
    private double radius;

    public Bola(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}