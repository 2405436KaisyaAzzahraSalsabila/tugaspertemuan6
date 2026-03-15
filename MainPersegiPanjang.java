public class MainPersegiPanjang {
    public static void main(String[] args) {
        //Persegi panjang 1
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(1);
        persegiPanjang.setLebar(1);
        
        System.out.print("Persegi panjang dengan panjang " + persegiPanjang.panjang + " dan lebar " + persegiPanjang.    lebar);
        System.out.println(" memiliki luas " + persegiPanjang.getLuas() 
                + " dan keliling " + persegiPanjang.getKeliling());
        System.out.println(" ");

        //Persegi panjang 2
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        persegiPanjang2.setPanjang(30);
        persegiPanjang2.setLebar(40);
        
        System.out.print("Persegi panjang dengan panjang " + persegiPanjang2.panjang + " dan lebar " + persegiPanjang2.lebar);
        System.out.println(" memiliki luas " + persegiPanjang2.getLuas() 
                + " dan keliling " + persegiPanjang2.getKeliling());
        System.out.println("");

        //Persegi panjang 3
        PersegiPanjang persegiPanjang3 = new PersegiPanjang();  
        persegiPanjang3.setPanjang(25);
        persegiPanjang3.setLebar(35);

        System.out.print("Persegi panjang dengan panjang " + persegiPanjang3.panjang + " dan lebar " + persegiPanjang3.lebar);
        System.out.println(" memiliki luas " + persegiPanjang3.getLuas()
                + " dan keliling " + persegiPanjang3.getKeliling());
    }
}