package MODUL7;


// Kelas abstrak AlatMusik dengan method abstrak play
abstract class AlatMusik {
    public abstract void play();
}

// Kelas turunan Piano
class Piano extends AlatMusik {
    @Override
    public void play() {
        System.out.println("Memainkan piano.");
    }
}

// Kelas turunan Biola
class Biola extends AlatMusik {
    @Override
    public void play() {
        System.out.println("Memainkan biola.");
    }
}

// Kelas turunan Gitar
class Gitar extends AlatMusik {
    @Override
    public void play() {
        System.out.println("Memainkan gitar.");
    }
}

// Kelas turunan Drum
class Drum extends AlatMusik {
    @Override
    public void play() {
        System.out.println("Memainkan drum.");
    }
}

// Kelas turunan Saxophone
class Saxophone extends AlatMusik {
    @Override
    public void play() {
        System.out.println("Memainkan saxophone.");
    }
}

// Kelas turunan Trumpet
class Trumpet extends AlatMusik {
    @Override
    public void play() {
        System.out.println("Memainkan trumpet.");
    }
}

public class JenisAlatMusik {
    public static void main(String[] args) {
        // Membuat array dari objek AlatMusik
        AlatMusik[] alatMusik = {
            new Piano(),
            new Biola(),
            new Gitar(),
            new Drum(),
            new Saxophone(),
            new Trumpet()
        };

        // Menampilkan jenis-jenis alat musik dengan polimorfisme
        for (int i = 0; i < alatMusik.length; i++) {
            System.out.println("Kegiatan[" + i + "] :");
            alatMusik[i].play();
        }
    }
}