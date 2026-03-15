/*
* Kaisya Azzahra Salsabila 
* 2405436
* PILKOM 4A
* OBJEK DAN KELAS DI JAVA
* pert 6 NO 1
*/

import java.util.Scanner;

public class PersegiPanjang {
    int panjang;
    int lebar;

    int getLuas() {
        return panjang * lebar;
    }

    int getKeliling() {
        return 2 * (panjang + lebar);
    }

    void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
}