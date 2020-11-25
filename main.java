public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tim pengusaha12 = new Tim("pengusaha12");
        
        //deklarasi member 
        member orang_1 = new member("Sugab", 30);
        member orang_2 = new member ("Nova", 10);
        member orang_3 = new member ("Acil" , 20);
        
        //deklarasi trainer
        
        member orang_4 = new Trainer ("Danu",23, 6);
        member orang_5 = new Trainer ("Dani",21, 3);
        member orang_6 = new Trainer ("Rizal",22, 4);
        
        //menambahkan data 
        pengusaha12.addmember(orang_1);
        pengusaha12.addmember(orang_2);
        pengusaha12.addmember(orang_3);
        pengusaha12.addmember(orang_4);
        pengusaha12.addmember(orang_5);
        pengusaha12.addmember(orang_6);
        
        //output
        pengusaha12.displayFullmember();
        pengusaha12.displayTrainer();
    }
    
}
